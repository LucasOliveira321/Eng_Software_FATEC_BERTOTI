export default function somenteNumero(valor){

    var regex = /^\d{1,3}$/g;

    if(!regex.test(valor)){
        valor = valor.replace(/[^\d.]/g, '');
        valor = valor.slice(0,3);
    }

    return valor;
}