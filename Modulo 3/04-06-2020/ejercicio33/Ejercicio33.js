var elemento = document.getElementById('cuadrado');
var posicion = elemento.getBoundingClientRect();
 
console.log(posicion.top, posicion.right, posicion.bottom, posicion.left);