var intentos = 0;

function validarPuntaje(){
    var puntaje = 0;
    var chk1 = document.getElementsByName("p1");
    var chk2 = document.getElementsByName("p2");
    var chk3 = document.getElementsByName("p3");
    var chk4 = document.getElementsByName("p4");
    var chk5 = document.getElementsByName("p5");

    marcachk1 = false;
    for(var i=0; i<chk1.length; i++) {
        //alert(" Elemento: " + chk1[i].value + "\n Seleccionado: " + chk1[i].checked);
        if (chk1[i].checked == true)
            marcachk1 = true;
    }

    marcachk2 = false;
    for(var i=0; i<chk2.length; i++) {
        if (chk2[i].checked == true)
            marcachk2 = true;
    }

    marcachk3 = false;
    for(var i=0; i<chk3.length; i++) {
        if (chk3[i].checked == true)
            marcachk3 = true;
    }

    marcachk4 = false;
    for(var i=0; i<chk4.length; i++) {
        if (chk4[i].checked == true)
            marcachk4 = true;
    }

    marcachk5 = false;
    for(var i=0; i<chk5.length; i++) {
        if (chk5[i].checked == true)
            marcachk5 = true;
    }

    if (marcachk1 && marcachk2 && marcachk3 && marcachk4 && marcachk5){
        //alert("OK");

        if (chk1[0].checked == true)
            puntaje += 1;

        if (chk2[1].checked == true)
            puntaje += 1;

        if (chk3[3].checked == true)
            puntaje += 1;

        if (chk4[4].checked == true)
            puntaje += 1; 

        if (chk5[4].checked == true)
            puntaje += 1;

        if (puntaje == 5){
            alert("todas las repsuestas correctas");
            document.getElementById('btnprocesar').disabled = true;
        }
        else{
            if (intentos < 2){
                alert("Tiene preguntas equivocadas, intente nuevamente. Van " + (intentos+1) +" intentos");
                intentos++;
            }
            else{
                alert("Tiene preguntas equivocadas, y no tiene más intentos");
                document.getElementById('btnprocesar').disabled = true;
            }
        }
    }
    else{
        alert("Faltan preguntas por contestar");
    }


    return false;
}

