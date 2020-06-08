var end = new Date('01/01/2021 12: AM');

var _second = 1000;
var _minute = _second * 60;
var _hour = _minute * 60;
var _day = _hour * 24;
var timer;



window.onload = function mostrarFecha() {
  var fecha = new Date(); //Fecha actual
  var mes = fecha.getMonth() + 1; //obteniendo mes
  var dia = fecha.getDate(); //obteniendo dia
  var diasSemana = new Array("Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado");//array de dias 
  var anio = fecha.getFullYear(); //obteniendo año
  //variables hora
  var hora = fecha.getHours();
  var minuto = fecha.getMinutes();
  var segundos = fecha.getSeconds();

  if (dia < 10) {
    dia = '0' + dia; //agrega cero si el menor de 10
  }
  if (mes < 10) {
    mes = '0' + mes //agrega cero si el menor de 10
  }

  alert("“Hoy es " + diasSemana[fecha.getDay()] + " " + dia + " de " + mes + " de " + anio + ", y son las " + hora + " horas, " + minuto + " minutos con " + segundos + " segundos”.");
  // document.getElementById('DIA_SEMANA').value=diasSemana[fecha.getDay()];
  // document.getElementById('DIA').value=dia;
  // document.getElementById('MES').value=mes;
  // document.getElementById('AÑO').value=anio;
  // document.getElementById('HORA').value=hora;
  // document.getElementById('MINUTOS').value=minuto;
  // document.getElementById('SEGUNDOS').value=segundos;
}

function showRemaining() {
  var now = new Date();
  var distance = end - now;
  if (distance < 0) {

      clearInterval(timer);
      document.getElementById('tiemporestante').innerHTML = 'EXPIRED!';

      return;
  }
  
  var days = Math.floor(distance / _day);
  var hours = Math.floor((distance % _day) / _hour);
  var minutes = Math.floor((distance % _hour) / _minute);
  var seconds = Math.floor((distance % _minute) / _second);

 
  document.getElementById('tiemporestante').innerHTML = days + ' dias, ';
  document.getElementById('tiemporestante').innerHTML += hours + ' horas, ';
  document.getElementById('tiemporestante').innerHTML += minutes + ' minutos y ';
  document.getElementById('tiemporestante').innerHTML += seconds + ' segundos';
}

timer = setInterval(showRemaining, 1000);
