var seleccionadas = [];
var ultimacelda = "";
var celdaganar = "";

function cambiarcolor(celda){

    var encontrado = false;
    for (var i=2;i<seleccionadas.length;i++){
        if (celda.id == seleccionadas[i])
            encontrado = true;
    }

    if (!encontrado){

        var cact = parseInt(celda.id.substring(1,3));

        //alert(cact);

        var cult = parseInt(ultimacelda.substring(1,3));

        //alert(cult);

        if ((cult >= (cact-6) && cult <= (cact-4)) || cult == cact-1 || cult == cact+1 || 
        (cult >= (cact+4) && cult <= (cact+6))){
            celda.style.backgroundColor="#66ff33";
            seleccionadas[seleccionadas.length] = celda.id;
            ultimacelda = celda.id            

            if (celda.id == celdaganar){
                alert("Usted ganó el juego!!!");
            }
        }
        else{
            alert("La celda seleccionada no es adyacente a la última");
        }
    }
    else{
        alert("Esta celda ya fue seleccionada");
    }
}

function buscarniniciofin(){
    var celdaini = ["c1","c6","c11","c16","c21"];
    var celdafin = ["c5","c10","c15","c20","c25"];

    var numAleatorioIni = Math.floor(Math.random() * 5);
    var celdai = document.getElementById(celdaini[numAleatorioIni]);
    celdai.style.backgroundColor="#66ff33";

    seleccionadas[0] = celdaini[numAleatorioIni];

    ultimacelda = celdaini[numAleatorioIni];

    var numAleatorioFin = Math.floor(Math.random() * 5);
    var celdaf = document.getElementById(celdafin[numAleatorioFin]);
    celdaf.style.backgroundColor="#66ff33";

    seleccionadas[1] = celdafin[numAleatorioFin];

    celdaganar = celdafin[numAleatorioFin];
}