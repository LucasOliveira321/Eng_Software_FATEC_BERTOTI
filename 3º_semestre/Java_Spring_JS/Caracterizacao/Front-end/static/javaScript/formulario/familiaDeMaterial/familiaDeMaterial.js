import somenteNumero from "../validacao/somenteNumero.js";

const numero = document.getElementById("codigo");
numero.addEventListener("blur", () => { numero.value = somenteNumero(numero.value); });

const url = "http://localhost:8080/familia_material";

const form = document.getElementById("form");

async function salvar(codigo, descricao){
    const resposta = await fetch(url, {
        method: "POST",
        headers: {
            "Content-type": "application/json"
        },
        body: JSON.stringify({
            codigo: codigo,
            descricao: descricao
        })
    }).then(resp => {
        if(resp.status == 200){
            window.alert("Familia de Material Cadastrada com Sucesso!");
            form.reset();
        }else{
            window.alert(`Erro ao salvar: ${resp.status}`);
        }
    })
}

async function pegarInfo(evento){
    evento.preventDefault();

    const codigo = document.getElementById("codigo").value;
    const descricao = document.getElementById("descricao").value;

    salvar(codigo, descricao);
}

form.addEventListener("submit", evento => pegarInfo(evento));