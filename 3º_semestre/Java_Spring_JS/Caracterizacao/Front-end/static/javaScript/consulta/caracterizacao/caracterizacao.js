const urlCaracterizacao = "http://localhost:8080/caracterizacao";
const urlComposicao = "http://localhost:8080/composicao";
const urlPegaUsuario = "http://localhost:8080/usuario";


const tabela = document.getElementById("tabela");
const botao = document.getElementById("abrirComposicao");
const selectUsuario = document.getElementById("idUsuario");
const inputIdCaracterizacao = document.getElementById("idCaracterizacao");
const form = document.getElementById("form");

async function pegaUsuario(){
    const resposta = await fetch(urlPegaUsuario);
    const data = await resposta.json();
    data.map(resp => {
        const option = document.createElement("option");
        option.innerText = resp.nome;
        option.value = resp.email;
        selectUsuario.appendChild(option);
    })
}

async function pegaCaracterizacao(){
    const response = await fetch(urlCaracterizacao);
    const data = await response.json();

    data.map((resp) => {
        const tr = document.createElement("tr");
        tr.id = resp.id;
        
        const editar = document.createElement("td");
        const button = document.createElement("button");
        if(resp.status == "PENDENTE_MONTAR_COMPOSICAO"){
            button.textContent = "Editar";
            button.onclick = function edicao(){
            form.reset();
    
            const id = document.getElementById("id");
        
            id.textContent = "ID Caracterização:";
        
            inputIdCaracterizacao.value = resp.id;
        
            pegaUsuario();
            $('#modal').modal('show');
            }
        }if(resp.status == "COMPOSICAO_ABERTA"){
            button.textContent = "Montar";
            button.onclick = function (){
                window.location.href = "../../../../templates/composicao/apontarComponentes.html";
            }
        }
        
        editar.appendChild(button);
        
        const status = document.createElement("td");
        const dataCriacao = document.createElement("td");
        const fabricante = document.createElement("td");
        const partNumber = document.createElement("td");
        const modelo = document.createElement("td");
        const executor = document.createElement("td");
        const acompanhante = document.createElement("td");
        const produto = document.createElement("td");
        const pesoEquipamento = document.createElement("td");
        const larguraCm = document.createElement("td");
        const alturaCm = document.createElement("td");
        const comprimentoCm = document.createElement("td");
        const tempoProcessamentoHora = document.createElement("td");
        const observacao = document.createElement("td");
        
        editar.classList.add("celula");
        status.classList.add("celula");
        dataCriacao.classList.add("celula");
        fabricante.classList.add("celula");
        partNumber.classList.add("celula");
        modelo.classList.add("celula");
        executor.classList.add("celula");
        acompanhante.classList.add("celula");
        produto.classList.add("celula");
        pesoEquipamento.classList.add("celula");
        larguraCm.classList.add("celula");
        alturaCm.classList.add("celula");
        comprimentoCm.classList.add("celula");
        tempoProcessamentoHora.classList.add("celula");
        observacao.classList.add("celula");
        
        status.innerText = resp.status;

        var dataFormat = new Date(resp.dataCriacao);
        var formatacao = {day: "numeric", month: "numeric", year: "numeric"};
        dataCriacao.innerText = dataFormat.toLocaleDateString('pt-BR', formatacao);

        fabricante.innerText = resp.fabricante;
        partNumber.innerText = resp.partNumber;
        modelo.innerText = resp.modelo;
        executor.innerText = resp.executor.nome;
        acompanhante.innerText = resp.acompanhante.nome;
        produto.innerText = resp.produto.descricao;
        pesoEquipamento.innerText = resp.pesoEquipamento;
        larguraCm.innerText = resp.larguraCm;
        alturaCm.innerText = resp.alturaCm;
        comprimentoCm.innerText = resp.comprimentoCm;
        tempoProcessamentoHora.innerText = resp.tempoProcessamentoHora;
        observacao.innerText = resp.observacao;

        tr.appendChild(editar);
        tr.appendChild(status);
        tr.appendChild(dataCriacao);
        tr.appendChild(fabricante);
        tr.appendChild(partNumber);
        tr.appendChild(modelo);
        tr.appendChild(executor);
        tr.appendChild(acompanhante);
        tr.appendChild(produto);
        tr.appendChild(pesoEquipamento);
        tr.appendChild(larguraCm);
        tr.appendChild(alturaCm);
        tr.appendChild(comprimentoCm);
        tr.appendChild(tempoProcessamentoHora);
        tr.appendChild(observacao);

        tabela.append(tr);
    })
}
pegaCaracterizacao();

async function abrirComposicao(eventoAbrirComposicao, idUsuario, idCaracterizacao){
    eventoAbrirComposicao.preventDefault();
   
    const abrir = await fetch(urlComposicao, {
        method: "POST",
        headers: {
            "Content-type": "application/json"
        },
        body: JSON.stringify({
            idCaracterizacao: idCaracterizacao,
            idUsuario: idUsuario
        })
    }).then(resp => {
        console.log(resp)
        if(resp.status == 200){
            window.alert("Composição aberta com sucesso!");
            window.location.href = "../../../../templates/consulta/consultaCaracterizacao.html";
        }else{
            window.alert(`Erro ao abrir a composição: ${resp.status}`);
        }
    })
}
botao.addEventListener("click", eventoAbrirComposicao => {
    console.log("botao");
    abrirComposicao(eventoAbrirComposicao, selectUsuario.value, inputIdCaracterizacao.value)
});
