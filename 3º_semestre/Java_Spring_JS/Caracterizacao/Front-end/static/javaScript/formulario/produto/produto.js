import somenteNumero from "../validacao/somenteNumero.js";

const urlPegarFamilia = "http://localhost:8080/familia_material";
const urlCadastrar = "http://localhost:8080/produto";


const codigo = document.getElementById("codProduto");
const form = document.getElementById("form");
const descricao = document.getElementById("descricao");
const select = document.getElementById("familiaId");


async function getFamilia(){

    const responsePegar = await fetch(urlPegarFamilia);
    const data = await responsePegar.json();
  
    data.map((resp) => {
        const option = document.createElement("option");
        option.innerText = resp.descricao;
        option.value = resp.codigo;
        select.appendChild(option);
    })
}
getFamilia();

async function cadastrar(eventoCadastrar, codigo, descricao, familiaId){
    eventoCadastrar.preventDefault();

    const responseCadastrar = await fetch(urlCadastrar, {
        method: "POST",
        headers: {
            "Content-type": "application/json"
        },
        body: JSON.stringify({
            codProduto: codigo,
            descricao: descricao,
            familiaId: familiaId
        })
    }).then(resp => {
        if(resp.status == 200){
            window.alert("Cadastrado com sucesso!");
            form.reset();
        }else{
            window.alert(`Erro ao salvar: ${resp.status}`);
        }
    })
}

codigo.addEventListener("blur", () => { 
    codigo.value = somenteNumero(codigo.value) 
    if(codigo.value.length < 4){
        codigo.value = codigo.value.padStart(4,"0");
    }
});
//select.addEventListener("click", eventoGet => getFamilia(eventoGet), {once: true});
form.addEventListener("submit", eventoCadastrar => cadastrar(eventoCadastrar, codigo.value, descricao.value, select.value))