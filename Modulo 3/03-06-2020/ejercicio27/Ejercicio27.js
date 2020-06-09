//var formulario = document.getElementById("formulario");
//window.onload = iniciar;

//function iniciar(){
  //  document.getElementById("procesar").addEventListener('click', validaNombre ,false);
//}
var nombre = "";
var apellido = "";
var fecha;
var anio;
var edad=0;







function validaNombre(){
   
    nombre = document.getElementById("nombre").value;
    if(nombre == ""){
        alert("debe ingresar su nombre");
        return false;
    }
    else if(nombre.length < 5 || nombre.length > 30){
        alert("el nombre debe estar entre 5 y 30 caracteres");
        return false;
    }

    return true;

}
function validaApellido(){
    apellido = document.getElementById("apellido").value;
    if(apellido == ""){
        alert("debe ingresar apellido");
        return false;
    }
    else if(apellido.length > 50){
        alert("el apellido no puede tener mas de 50 caracteres");
        return false;
        }
    return true;
}
function validaFecha(){
  
    fecha = document.getElementById("fecha").value;
    var fechaaux = new Date(fecha);
     anio = fechaaux.getFullYear(); //obteniendo año nacimineto
     var fechaactual = new Date();
     var anioactual = fechaactual.getFullYear(); //obteniendo año actual
     edad= anioactual-anio;
     alert(edad);
   

    if(fecha == ""){
        
        alert("debe ingresar fecha");
        return false;
    }
    return true;
}

function validaTelefono(){
    var elemento = document.getElementById("telefono").value;
    if(elemento == ""){
        alert("debe ingresar telefono");
        return false;
    }
    else if(elemento.length < 7 || elemento.length > 12){
        alert("el telefono debe estar entre 7 y 12 caracteres");
        return false;
        }
    return true;
}

function validaDireccion(){
    var elemento = document.getElementById("direccion").value;
    if(elemento == ""){
        alert("debe ingresar dirección");
        return false;
    }
    else if(elemento.length >100){
        alert("La dirección no puede tener mas de 100 caracteres");
        return false;
        }
    return true;
}
function validaCiudad(){
    var elemento = document.getElementById("ciudad").value;
    if(elemento == ""){
        alert("debe ingresar ciudad");
        return false;
    }
    else if(elemento.length >30){
        alert("La dirección no puede tener mas de 30 caracteres");
        return false;
        }
    return true;
}
// function calculateAge() {
//     var birthday_arr = fecha.split("/");
//     var birthday_date = new Date(birthday_arr[2], birthday_arr[1] - 1, birthday_arr[0]);
//     var ageDifMs = Date.now() - birthday_date.getTime();
//     var ageDate = new Date(ageDifMs);
    
//    // return Math.abs(ageDate.getUTCFullYear() - 1970);
// }
















function validar() {
    if(validaNombre() && validaApellido() && validaFecha() &&validaTelefono() && validaDireccion() && validaCiudad()){
        alert("Nombre : " + nombre + " " +"Apellido : " + apellido  + " " +  "Edad : " + edad);
        return true;

    }

    //else{
       // alert("FALTAN DATOS")
    //}
}