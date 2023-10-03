// const axios = require('axios');
const url = "http://localhost:8080/pizza/salvar";

async function cadastrarPizza(nome, ingredientes, precoInteira, precoMeia, imagem){
   const response = await fetch(url,{
       method: "POST",
       headers:{
           "Content-type": "application/json"
       },
       body: JSON.stringify({
           nome: nome,
           ingredientes: ingredientes,
           precoInteira: precoInteira,
           precoMeia: precoMeia,
           imagem: imagem
       })
   }).then(resposta => console.log(resposta)).catch(error => console.log(error));
   //const data = await response.json();
   //return data;
}


const formulario = document.getElementById("cadastrarPizza");

async function salvarPizza(evento){
   evento.preventDefault();

   const nome = document.getElementById("nome").value;
   const ingredientes = document.getElementById("ingredientes").value;
   const precoInteira = document.getElementById("precoInteira").value;
   const precoMeia = document.getElementById("precoMeia").value;
   const imagem = document.getElementById("imagem").value;
   console.log(nome, ingredientes, precoInteira, precoMeia, imagem);
   await cadastrarPizza(nome, ingredientes,precoInteira, precoMeia, imagem);
   
   window.alert(nome);
}

formulario.addEventListener("submit", evento => salvarPizza(evento));




// const form = document.getElementById("cadastrarPizza");

// form.addEventListener("submit", evento => {
//     evento.preventDefault();
    
//     const formData = new FormData(form);
//     const data = Object.fromEntries(formData);

//     fetch(url,{
//         method: 'POST',
//         headers: {
//             'Content-Type': 'application/json'
//         },
//         body: JSON.stringify(data)
//     }).then(res => res.json()).then(data => console.log(data))
// });


// const nome = document.getElementById("nome").value;
// const ingredientes = document.getElementById("ingredientes").value;
// const precoInteira = document.getElementById("precoInteira").value;
// const precoMeia = document.getElementById("precoMeia").value;
// const imagem = document.getElementById("imagem").value;

// const data = {
//     nome: nome,
//     ingredientes: ingredientes,
//     precoInteira: precoInteira,
//     precoMeia: precoMeia,
//     imagem: imagem
// }

// axios.post(url, data).then(function (response) {console.log(response)}).catch(function (error) { console.error(error)});

