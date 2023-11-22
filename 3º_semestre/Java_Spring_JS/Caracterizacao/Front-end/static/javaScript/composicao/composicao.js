import valorCom3casas from "../formulario/validacao/numero3CasaDecimais.js";

const urlPegarComposicoes = "http://localhost:8080/composicao";
const urlPegarUsuarios = "http://localhost:8080/usuario";
const urlPegaProduto = "http://localhost:8080/produto/produto-composicao";
const urlPegaCaracterizacao = "http://localhost:8080/caracterizacao/consulta-caracterizacao";
const urlSavarComponentes = "http://localhost:8080/componentes";

const selectComposicao = document.getElementById("idComposicao");
const idCaracterizacao = document.getElementById("idCaracterizacao");
const fabricante = document.getElementById("fabricante");
const partnumber = document.getElementById("partnumber");
const modelo = document.getElementById("modelo");
const pesoEquipamento = document.getElementById("pesoEquipamento");
const saldoComposicao = document.getElementById("saldoComposicao");
const selectUsuario = document.getElementById("idUsuario");
const selectProduto = document.getElementById("codProduto");
const peso = document.getElementById("kgComponente");
const formulario = document.getElementById("form");

var dataComposicao;

async function pegarComposicoes(){
    const response = await fetch(urlPegarComposicoes);
    dataComposicao = await response.json();
    dataComposicao.map(resp => {
        const option = document.createElement("option");
        option.innerText = resp.idComposicao;
        option.value = resp.idComposicao;
        selectComposicao.appendChild(option);
    })
}
pegarComposicoes();

async function pegaUsuario(){
    const response = await fetch(urlPegarUsuarios);
    const data = await response.json();
    data.map(resp => {
        const option = document.createElement('option');
        option.innerText = resp.nome;
        option.value = resp.email;
        selectUsuario.appendChild(option);
    })
}
pegaUsuario();

async function pegaProduto(){
    const response = await fetch(urlPegaProduto);
    const data = await response.json();
    data.map(resp => {
        const option = document.createElement("option");
        option.innerText = resp.descricao;
        option.value = resp.codProduto;
        selectProduto.appendChild(option);
    })
}
pegaProduto();

async function pegaCaracterizacao(eventoPegaCaracterizacao, idComposicao){
    eventoPegaCaracterizacao.preventDefault();

    try{
        const responseCaracterizacao = await fetch(urlPegaCaracterizacao, {
            method: "POST",
            headers: {
                "Content-type": "application/json"
            },
            body: idComposicao
        });

        const dataCaracterizacao = await responseCaracterizacao.json();

        if(responseCaracterizacao.ok){
            idCaracterizacao.value = dataCaracterizacao.id;
            fabricante.value = dataCaracterizacao.fabricante;
            partnumber.value = dataCaracterizacao.partNumber;
            modelo.value = dataCaracterizacao.modelo;
            pesoEquipamento.value = dataCaracterizacao.pesoEquipamento;

            var valor = selectComposicao.selectedIndex-1;
            
            saldoComposicao.value = dataComposicao[valor].saldoComposicao;
        }
    }catch(e){
        console.log(e);
    }
}
selectComposicao.addEventListener("change", eventoPegaCaracterizacao => {
    if(selectComposicao.value != "null"){
        pegaCaracterizacao(eventoPegaCaracterizacao, selectComposicao.value);
        console.log(selectComposicao.selectedIndex);
    }else{
        formulario.reset();
    }
});

async function cadastrarComponentes(idComposicao, idUsuario, codProduto, kgComponente){

    const response = await fetch(urlSavarComponentes, {
        method: "POST",
        headers: {
            "Content-type": "application/json"
        },
        body: JSON.stringify({
            idComposicao: idComposicao,
            idUsuario: idUsuario,
            codProduto: codProduto,
            kgComponente: kgComponente
        })
    }).then(resp => window.alert(resp)).catch(e => window.alert(`Peso informado maior do que o Saldo atual: ${e}`));
    
    if(response.ok){
        console.log(response);
        window.alert(`Salvo com sucesso!`);
    }else if(response.status == 500){
        console.log(response);
        window.alert(`Peso excede o saldo da ordem: ${response.status}.`);
    }else{
        console.log(response);
        window.alert(`Erro ao realizar o apontamento!`);
    }
    
}

formulario.addEventListener("submit", () => {
    if(selectComposicao.value != "null" && selectUsuario.value != "null" && selectProduto.value != "null" && peso.value != ""){
        cadastrarComponentes(selectComposicao.value, selectUsuario.value, selectProduto.value, peso.value);   
    }else{
        window.alert(`Preencher todos os valores!`);
    }
});

peso.addEventListener("blur", () => peso.value = valorCom3casas(peso.value));