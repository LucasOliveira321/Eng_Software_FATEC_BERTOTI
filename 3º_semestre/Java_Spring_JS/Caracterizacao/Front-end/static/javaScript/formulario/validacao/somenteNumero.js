export default function somenteNumero(valor){

    var regex = /^[\d]+$/g;

    if(!regex.test(valor)){
        valor = valor.replace(/[^\d.]/g, '');
    }

    return valor;
}