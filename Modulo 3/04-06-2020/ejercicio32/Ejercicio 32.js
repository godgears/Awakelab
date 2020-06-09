$(document).ready(function(){

    $("#contenido").click(function () {
        alert("“Reyes Elfos bajo el cielo. Siete para los Señores Enanos en casas de piedra. Nueve para los Hombres Mortales condenados a morir. Uno para el Señor Oscuro, sobre el trono oscuro. Un Anillo para gobernarlos a todos. Un anillo para encontrarlos, un Anillo para atraerlos a todos y atarlos en las tinieblas en la Tierra de Mordor donde se extienden las Sombras”.");
    });

    $("#marcas").click(function () {
        alert("<p>“Reyes Elfos bajo el cielo. Siete para los Señores Enanos en casas de piedra. Nueve para los Hombres Mortales condenados a morir. Uno para el Señor Oscuro, sobre el trono oscuro. Un Anillo para gobernarlos a todos. Un anillo para encontrarlos, un Anillo para atraerlos a todos y atarlos en las tinieblas en la Tierra de Mordor donde se extienden las Sombras”.</p>");
    });

    $("#valor").click(function () {
    
        alert($('.cajatext').val().length);
    });
    $("#enlace").click(function () {
        alert("http://www.thehobbit.com/");
    });

});