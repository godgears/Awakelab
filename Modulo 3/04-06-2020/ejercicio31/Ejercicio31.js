$(document).ready(function(){

    function cambiarColor(){
        var crojo = $("#txtrojo").val();
        var cverde = $("#txtverde").val();
        var cazul = $("#txtazul").val();

        var color = "rgb(" + crojo + "," + cverde + "," + cazul + ")";
        $("#contcolores").css("background-color",color);
    }

    $("#sdrojo").change(function(){
        $("#txtrojo").val($("#sdrojo").val());
        cambiarColor(); // se llama la funcion para cambiar el color
    });

    $("#sdverde").change(function(){
        $("#txtverde").val($("#sdverde").val());
        cambiarColor();// se llama la funcion para cambiar el color
    });

    $("#sdazul").change(function(){
        $("#txtazul").val($("#sdazul").val());
        cambiarColor();// se llama la funcion para cambiar el color
    });



});