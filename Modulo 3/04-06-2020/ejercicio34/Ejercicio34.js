var num=[];

function espar(num){
	//numero par o impar

	var ep=false; 
	if (num % 2 == 0){
		ep=true;
	}
	return ep;
}

function esprimo(num){
	// numero primo

	var prim = 0;

	var esprim = true; 

	for (var i=1; i<num+1; i++){
		if(num % i == 0){
			prim ++;
		}
	}

	if(prim>2){
		esprim = false;
	} 
	
	return esprim;
	
}


$(document).ready(function(){

	$('#buton2').prop('disabled', true);
	$('#buton3').prop('disabled', true);
	$('#buton4').prop('disabled', true);
	$('#buton5').prop('disabled', true);

	$("#buton1").click(function(){
			
		//alert("Hola");
		for(var i=0; i<20; i++){
			num[i] = Math.trunc(Math.random()*100+1);
		}

		var texto = "";
		
		for(var j=0; j<19; j++){
			texto += num[j] + " - ";
		}
		texto += num[19]
		
		$("#cajatext").val(texto);

		$('#buton2').prop('disabled', false);
		$('#buton3').prop('disabled', false);
		$('#buton4').prop('disabled', false);
		$('#buton5').prop('disabled', false);
		
	});

	$("#buton2").click(function(){
		
		var texto = "";
		for(var i=0; i<num.length; i++){
			
			if (espar(num[i]) == false)
				texto += num[i] + " - ";
		}

		$("#cajatext").val(texto);
		
	});

	$("#buton3").click(function(){
		
		var texto = "";
		for(var i=0; i<num.length; i++){
			if (espar(num[i]) == true)
				texto += num[i] + " - ";
		}
		
		$("#cajatext").val(texto);

	});

	$("#buton4").click(function(){
		
		var texto = "";
		for(var i=0; i<num.length; i++){
			if (esprimo(num[i]) == true)
				texto += num[i] + " - ";
		}
		$("#cajatext").val(texto);
		
	});

	$("#buton5").click(function(){
		
		var texto = "";
		for(var i=0; i<num.length; i++){
			if (esprimo(num[i]) == false)
				texto += num[i] + " - ";
		}

		$("#cajatext").val(texto);
		
	});


});