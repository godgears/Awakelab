function procesarnumero(){
    var texto = document.getElementById('numero').value;

    if (texto ==""){
        alert("Debe ingresar un texto");
    }
    else{
        if(isNaN(texto)){
            alert("el dato ingresado debe ser un numero")
        }
        else{
            var suma = 0;

            for(var i=1; i<=texto; i++){
                suma = suma + i;
            }
        document.getElementById('resultado').innerHTML = "la suma de los primeros numeros" + texto + "numeros es " + suma;
        }
    }
}