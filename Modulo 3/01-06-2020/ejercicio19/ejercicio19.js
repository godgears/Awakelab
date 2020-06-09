
var operacion = false;

function agregar(valor){
    var texto = document.getElementById('resultado');
    var numero = texto.value;

    if (isNaN(valor)){
		
		if (!operacion && texto.value != 0){
			texto.value = texto.value + valor;
			operacion = true;
		}
		else{
			if (texto.value != 0){
				alert("No puede agregar dos operaciones seguidas");				
			}
		}
    }
    else{
		if (numero == 0){
			texto.value = valor;
		}
		else{
			texto.value = texto.value + valor;
		}
		operacion = false;
    }
}

function calcular(){
    var texto = document.getElementById('resultado');
    var expresion = texto.value;
	
	if (expresion == 0){
		alert("Debe ingresar una operación");
	}
	else{
		var igual = eval(expresion);
		texto.value = igual;
		//alert("El resultado es " + igual);
	}
}