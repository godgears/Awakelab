function alerta(){
    var mensaje;
    var opcion = confirm("Esta seguro que desea salir");
    if (opcion == true){
        alert("Cerrando sesión.");
        location.href= "index.html";
    }else{
        location.href= "#";
    }
    document.getElementById("ejemplo").innerHTML = mensaje;
}