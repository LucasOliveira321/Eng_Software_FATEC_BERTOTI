const url = "http://localhost:8080/cliente";

const form = document.getElementById("formCliente");

async function salvar(nomeEmpresa){
    
    const resposta = await fetch(url, {
        method: "POST",
        headers: {
            "Content-type": "application/json"
        },
        body: JSON.stringify({
            nomeEmpresa: nomeEmpresa
        })
    }).then(resp => {
        if(resp.status == 200){
            window.alert("Cliente Salvo com sucesso!");
            form.reset();
            
        }else{
            window.alert(`Erro ao salvar: ${resp.status}`);
        }
    })
}

async function pegarInfo(evento){
    evento.preventDefault();

    const nomeEmpresa = document.getElementById("nomeEmpresa").value;

    salvar(nomeEmpresa);
}


form.addEventListener("submit", evento => pegarInfo(evento));