var jugador = "X";

var pos = ["","","","","","","","",""];

function jugar(numboton){ //recibe variable del tablero
    
    if (pos[numboton-1] == ""){

        pos[numboton-1] = jugador;

        var mensaje = "";

        if ((pos[0] == "X" && pos[1] == "X" && pos[2] == "X") 
        || (pos[3] == "X" && pos[4] == "X" && pos[5] == "X") 
        || (pos[6] == "X" && pos[7] == "X" && pos[8] == "X") 
        || (pos[0] == "X" && pos[3] == "X" && pos[6] == "X")
        || (pos[1] == "X" && pos[4] == "X" && pos[7] == "X")
        || (pos[2] == "X" && pos[5] == "X" && pos[8] == "X")
        || (pos[0] == "X" && pos[4] == "X" && pos[8] == "X")
        || (pos[2] == "X" && pos[4] == "X" && pos[6] == "X")
        ){
            mensaje = "El jugador X ganó!";
        }

        if ((pos[0] == "O" && pos[1] == "O" && pos[2] == "O") 
        || (pos[3] == "O" && pos[4] == "O" && pos[5] == "O") 
        || (pos[6] == "O" && pos[7] == "O" && pos[8] == "O") 
        || (pos[0] == "O" && pos[3] == "O" && pos[6] == "O")
        || (pos[1] == "O" && pos[4] == "O" && pos[7] == "O")
        || (pos[2] == "O" && pos[5] == "O" && pos[8] == "O")
        || (pos[0] == "O" && pos[4] == "O" && pos[8] == "O")
        || (pos[2] == "O" && pos[4] == "O" && pos[6] == "O")
        ){
            mensaje = "El jugador O ganó!";
        }

    
        mensaje2 = "";
        for (var i=0; i<pos.length;i++)
            mensaje2 = mensaje2 + pos[i] + " - ";
    
        if (mensaje != ""){
            document.getElementById('contenedor').innerHTML = mensaje;
            document.getElementById('jugador').innerHTML = mensaje;  
        }
        else{
            if (jugador == "X")
                jugador = "O";
             else
                 jugador = "X";
    
            document.getElementById('contenedor').innerHTML = mensaje2;
            document.getElementById('jugador').innerHTML = "Le toca al jugador " + jugador;  
        }
    
    }
    else{
        alert("Ya existe un lanzamiento en esta posicion.");
    }

    
}