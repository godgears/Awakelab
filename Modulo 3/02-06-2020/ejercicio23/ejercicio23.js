var items1="";
var items2="";


function agregaritem(){
    var texto = document.getElementById('dato').value;
    var chklista1 =document.getElementById('rbtlista1').checked; //retorna si está cheaqueado o no
    var chklista2 =document.getElementById('rbtlista2').checked; //idem
  

    if(texto != ""){
        if(chklista1==true || chklista2 ==true ){
            
            if(chklista1){
                items1= items1 + '<li>'+texto +'</li>';
                document.getElementById('cont1').innerHTML = '<ul type="square">' + items1 + '</ul>'; //lista desordenada
           }
           else{
            items2= items2 + '<li>'+texto +'</li>';
            document.getElementById('cont2').innerHTML = '<ol type="i">' + items2 + '</ol>';   //lista ordenada
           }
        }

        else{
            alert("debe chequear una de las listas");
        }
    }
    else{
        alert("debe ingresar un texto");
    }
}