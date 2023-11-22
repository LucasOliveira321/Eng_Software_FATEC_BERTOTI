const url = "http://localhost:8080/usuario";

const form = document.getElementById("form");

async function salvar(email, senha, nome, cargo){
    const resposta = await fetch(url, {
        method: "POST",
        headers: {
            "Content-type": "application/json"
        },
        body: JSON.stringify({
            email: email,
            senha: senha,
            nome: nome,
            cargo: cargo
        })
    }).then(resp => {
        
        if(resp.status == 200){
            window.alert("Usuario cadastrado com sucesso!");
            form.reset();
        }else{
            window.alert(`Erro ao cadastrar: ${resp.status}`);
        }
    })
}

async function pegarInfo(evento){
    evento.preventDefault();

    const email = document.getElementById("email").value;
    const senha = document.getElementById("senha").value;
    const nome = document.getElementById("nome").value;
    const cargo = document.getElementById("cargo").value;

    salvar(email, senha, nome, cargo);
    
}

form.addEventListener("submit", evento => pegarInfo(evento));