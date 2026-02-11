 let dom_visor = document.getElementById("visor");
 let dom_foto1 = document.getElementById("foto1");
 let dom_foto2 = document.getElementById("foto2");
 
 function f_cambiarFoto(p_nombreFoto)
 {
	 dom_visor.style.backgroundImage = "url('" + p_nombreFoto + "')";
 }
 