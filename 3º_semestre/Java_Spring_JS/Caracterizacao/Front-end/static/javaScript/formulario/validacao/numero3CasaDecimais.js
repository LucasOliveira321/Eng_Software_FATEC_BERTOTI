export default function valorCom3casas(valor){

        var regex = /^(\d{1,}\.\d{3})$/g;

        if(!regex.test(valor)){
            
            valor = valor.replace(',', '.')
            valor = valor.replace(/[^\d.]/g, '');

            var partes = valor.split('.')

            if(partes.length > 1){
                for(let i = partes[1].length; i < 3; i++){
                    partes[1] += '0';
                }
                valor = partes[0] + '.' + partes[1].slice(0,3);
            }
        }
        return valor;
}