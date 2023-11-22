const divPrincipal = document.getElementById("template");

function inserirTemplate(){

    // LOGO
    const divImagem = document.createElement("div");
    const ancorImagem = document.createElement("a");
    const logo = document.createElement("img");

    ancorImagem.href = "/templates/menu/menuPrincipal.html";
    logo.src = "/static/imagem/logo.png";

    ancorImagem.appendChild(logo);

    divImagem.appendChild(ancorImagem);
    divPrincipal.appendChild(divImagem);
}

inserirTemplate();