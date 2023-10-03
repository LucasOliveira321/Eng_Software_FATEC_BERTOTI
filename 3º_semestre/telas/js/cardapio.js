const url = "http://localhost:8080/cardapio/pizza";

const posts = document.getElementById("card");

async function getAllPost(){
    const response = await fetch(url);
    const data = await response.json();

    console.log(data);

    data.map((post)=>{
        const div = document.createElement("div");
        const img = document.createElement("img");
        const nomePizza = document.createElement("h5");
        const ingredientes = document.createElement("p");
        const preco = document.createElement("h6");
        const link = document.createElement("a");

        img.setAttribute("src",post.imagem);
        nomePizza.innerText = post.nome;
        ingredientes.innerText = post.ingredientes;
        preco.innerText = `R$ ${post.precoInteira},00`;
        link.innerText = "Adicionar ao Carrinho";
        // link.setAttribute("href", `/post.html?id=${post.id}`);

        div.classList.add("card-body");
        img.classList.add("card-img-top");
        nomePizza.classList.add("card-title");
        ingredientes.classList.add("card-text");
        preco.classList.add("card-subtitle");
        preco.classList.add("mb-2");
        preco.classList.add("text-muted");
        link.classList.add("btn");
        link.classList.add("btn-primary");

        div.appendChild(nomePizza);
        div.appendChild(ingredientes);
        div.appendChild(preco);
        div.appendChild(link);

        posts.appendChild(img);
        posts.appendChild(div);
    })
}

getAllPost();