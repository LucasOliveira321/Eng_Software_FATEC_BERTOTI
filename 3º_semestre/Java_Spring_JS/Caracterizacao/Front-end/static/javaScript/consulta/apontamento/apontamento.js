const urlComponentes = "http://localhost:8080/composicao/por-id";
const urlComposicao = "http://localhost:8080/composicao/todas";

const tbody = document.getElementById("tbody");
const botao = document.getElementById("consulta");
const selectComposicao = document.getElementById("composicao");

const kgTotal = document.getElementById("kgTotal");
const kgComponentes = document.getElementById("kgApontado");
const saldoOrdem = document.getElementById("saldoOrdem");

var dadosComposicao;

async function populaSelect(){
    const response = await fetch(urlComposicao);
    dadosComposicao = await response.json();
   
    dadosComposicao.map(resp => {
        const option = document.createElement("option");
        option.innerText = resp.idComposicao;
        option.value = resp.idComposicao;
        selectComposicao.appendChild(option);
    })
}
populaSelect();

async function pegaComposicao(eventoPopular, idComposicao){
    eventoPopular.preventDefault();

    const response = await fetch(urlComponentes,{
        method: "POST",
        headers: {
            "Content-type": "application/json"
        },
        body: JSON.stringify({idComposicao: idComposicao}) 
    })
    const data = await response.json();

    var kgTt = 0;

    if(response.ok){
        data.map(resp => {
            const tr = document.createElement("tr");
            const dataApontamento = document.createElement("td");
            const codProduto = document.createElement("td");
            const descricao = document.createElement("td");
            const kgApontado = document.createElement("td");
            const percentual = document.createElement("td");

            var dataFormatada = new Date(resp.dataApontamento);
            const dia = String(dataFormatada.getDate()).padStart(2, '0');
            const mes = String(dataFormatada.getMonth() + 1).padStart(2, '0');
            const ano = dataFormatada.getFullYear();
            const horas = String(dataFormatada.getHours()).padStart(2, '0');
            const minutos = String(dataFormatada.getMinutes()).padStart(2, '0');
            dataApontamento.innerText = `${dia}/${mes}/${ano}, ${horas}:${minutos}`;

            codProduto.innerText = resp.codProduto.codProduto;
            descricao.innerText = resp.codProduto.descricao;
            kgApontado.innerText = resp.kgApontado.toFixed(3);
            kgTt += resp.kgApontado;

            percentual.innerText = ((resp.kgApontado/kgTotal.value)*100).toFixed(1) + " %";

            dataApontamento.classList.add("celula");
            codProduto.classList.add("celula");
            descricao.classList.add("celula");
            kgApontado.classList.add("celula");
            percentual.classList.add("celula");

            tr.appendChild(dataApontamento);
            tr.appendChild(codProduto);
            tr.appendChild(descricao);
            tr.appendChild(kgApontado);
            tr.appendChild(percentual);

            tbody.appendChild(tr);
        });
        kgComponentes.value = kgTt;
    }
}
botao.addEventListener("click", eventoPopular => {

    console.log(dadosComposicao);

    if(selectComposicao.value != "null"){
        while(tbody.childElementCount > 0){
            tbody.deleteRow(0);
        }
        
        kgTotal.value = dadosComposicao[(selectComposicao.selectedIndex)-1].pesoTotal.toFixed(3);
        saldoOrdem.value = dadosComposicao[(selectComposicao.selectedIndex)-1].saldoComposicao.toFixed(3);

        pegaComposicao(eventoPopular, selectComposicao.value);
    }else{
        window.alert("Selecionar a composição!");
    }
});