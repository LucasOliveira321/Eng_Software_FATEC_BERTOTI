const url = "http://localhost:8080/cliente/consulta";

const conteudo = document.getElementById("tbody");

async function pegaInfo(){
    const resposta = await fetch(url);
    const dados = await resposta.json();

    dados.map((resp) => {
        const tr = document.createElement("tr");
        const id = document.createElement("td");
        const nome = document.createElement("td");
        const status = document.createElement("td");

        id.innerText = resp.id;
        id.className = "td";
        nome.innerText = resp.nomeEmpresa;
        nome.className = "td";
        status.innerText = resp.status;
        status.className = "td";

        tr.appendChild(id);
        tr.appendChild(nome);
        tr.appendChild(status);

        conteudo.appendChild(tr);
    })
}

pegaInfo();