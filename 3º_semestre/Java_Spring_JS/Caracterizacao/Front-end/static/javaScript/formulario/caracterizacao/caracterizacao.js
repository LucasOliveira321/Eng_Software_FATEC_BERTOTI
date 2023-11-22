import valorCom3casas from "../validacao/numero3CasaDecimais.js";
const urlPegaUsuario = "http://localhost:8080/usuario";
const urlPegaProduto = "http://localhost:8080/produto/produto-entrada";
const urlCadastrar = "http://localhost:8080/caracterizacao";

document.addEventListener('DOMContentLoaded', function(){

    const form = document.getElementById("form");
    const fabricante = document.getElementById("fabricante");
    const partNumber = document.getElementById("partNumber");
    const modelo = document.getElementById("modelo");
    const peso = document.getElementById("pesoEquipamento");
    const alturaCm = document.getElementById("alturaCm");
    const larguraCm = document.getElementById("larguraCm");
    const comprimentoCm = document.getElementById("comprimentoCm");
    const executor = document.getElementById("executor");
    const acompanhante = document.getElementById("acompanhante");
    const tempo = document.getElementById("tempoProcessamentoHora");
    const produto = document.getElementById("produto");
    const observacao = document.getElementById("observacao");

    async function pegaUsuario(){
        const response = await fetch(urlPegaUsuario);
        const data = await response.json();
        data.map(resp => {

            const optionAc = document.createElement('option');
            optionAc.innerText = resp.nome;
            optionAc.value = resp.email;
            acompanhante.appendChild(optionAc);

            const optionEx = document.createElement('option');
            optionEx.innerText = resp.nome;
            optionEx.value = resp.email;
            executor.appendChild(optionEx);
        })
    }

    async function pegaProduto(){
        const response = await fetch(urlPegaProduto);
        const data = await response.json();
        data.map((resp) => {
            const option = document.createElement("option");
            option.innerText = resp.descricao;
            option.value = resp.codProduto;
            produto.appendChild(option);
        })
    }

    async function cadastrar(eventCadastrar, fabricante, partNumber, modelo, executor, acompanhante, produto, peso, larguraCm, comprimentoCm, alturaCm, tempo, observacao){
        eventCadastrar.preventDefault();

        const response = await fetch(urlCadastrar,{
            method: "POST",
            headers: {
                "Content-type": "application/json"
            },
            body: JSON.stringify({
                fabricante: fabricante,
                partNumber: partNumber,
                modelo: modelo,
                executor: executor,
                acompanhante: acompanhante,
                produto: produto,
                pesoEquipamento: peso,
                larguraCm: larguraCm,
                comprimentoCm: comprimentoCm,
                alturaCm: alturaCm,
                tempoProcessamentoHora: tempo,
                observacao: observacao
            })
        }).then((resp) => {
            if(resp.status == 200){
                window.alert("Caracterização salva, com sucesso!");
                form.reset();
            }else{
                window.alert(`Erro ao salvar: ${resp.status}`);
            }
        })
    }

    peso.addEventListener('blur', () => { peso.value = valorCom3casas(peso.value); });
    alturaCm.addEventListener('blur', () => { alturaCm.value = valorCom3casas(alturaCm.value); });
    larguraCm.addEventListener('blur', () => { larguraCm.value = valorCom3casas(larguraCm.value); });
    comprimentoCm.addEventListener('blur', () => { comprimentoCm.value = valorCom3casas(comprimentoCm.value); });
    tempo.addEventListener('blur', () => { tempo.value = valorCom3casas(tempo.value); });
    document.addEventListener("DOMContentLoaded", pegaUsuario(), pegaProduto(), {once: true});
    form.addEventListener("submit", eventCadastrar => {
        if(observacao.value == null || observacao.value == ""){
            observacao.value = "-";
        }
        cadastrar(eventCadastrar, fabricante.value, partNumber.value, modelo.value, executor.value, acompanhante.value, produto.value, peso.value, larguraCm.value, comprimentoCm.value, alturaCm.value, tempo.value, observacao.value)
    });
});