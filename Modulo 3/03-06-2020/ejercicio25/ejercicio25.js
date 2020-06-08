function calcularmonto(){

    var montoclp = document.getElementById('clp').value;
    var mensaje = "";
    var tipomensaje = "";

    var chk1 = document.getElementById('dolar').checked;
    var chk2 = document.getElementById('euro').checked;
    var chk3 = document.getElementById('yen').checked;
    var chk4 = document.getElementById('libra').checked;
    var chk5 = document.getElementById('real').checked;

    var montootro = 0;

    if (montoclp != ""){

        if (!isNaN(montoclp)){


            if (chk1 == true || chk2 == true || chk3 == true || chk4 == true || chk5 == true){

                //alert("1");

                if (chk1 == true){
                    montootro = montoclp * 0.5;
                }
                else if (chk2 == true){
                    montootro = montoclp * 1.5;
                }
                else if (chk3 == true){
                    montootro = montoclp * 2.5;
                }
                else if (chk4 == true){
                    montootro = montoclp * 3.5;
                }
                else if (chk5 == true){
                    montootro = montoclp * 4.5;
                }

                mensaje = "Se hizo la transformacion de moneda";
                tipomensaje = "ok";

                document.getElementById('otram').value = montootro;
            }
            else{
                mensaje = "Debe seleccionar una divisa.";
                tipomensaje = "error";
            }
        }
        else{
            mensaje = "El monto ingresado no es un número";
            tipomensaje = "error";
        }

    }
    else{
        mensaje = "Debe ingresar un monto";
        tipomensaje = "error";
    }


    if (mensaje != ""){
        var estilo = "";

        if (tipomensaje == "ok"){
            estilo = "background-color: green; color: white;";
        }
        else{
            estilo = "background-color: red; color: white;";
        }

        document.getElementById('contenedor').innerHTML = '<div style="' + estilo + '">' + mensaje + '</div>';
    }


}