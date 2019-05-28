var alPulsarModificar = function () {
    antesDeEnviar();
    var nombre = document.getElementById("nombre").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password_encrip").value;
    var edad = document.getElementById("edad").value;
    var activo = document.getElementById("activo").checked;
    activo = activo ? "on" : "off";
    var cliente = {
        "nombre": nombre,
        email: email,
        'edad': edad
    };
    cliente.password = password;
    cliente["activo"] = activo;
    
    var clienteJSON = JSON.stringify(cliente);// Convertir obj en JSON
    alert("Enviando...\n" + clienteJSON);    
    
    // ActiveX para IE 7. Creamos el objecto XMLHttpRequest para la función Ajax
    var peticionHTTP = new XMLHttpRequest(); // Objeto AJAX
    // Onreadystatechange: por cada cambio de estado que tenga el servidor, hace esta función: if...
    peticionHTTP.onreadystatechange = function () {
        // alert("Ha cambiado de estado" + petipeticionHTTP.readyState);
        if (this.readyState === 4 && this.status === 200) {
            alert("Hemos recibido algo!" + this.responseText);//this.responseText = peticionHTTP.responseText   
            var jsonResp = this.responseText;
            var objRest = JSON.parse(jsonResp);
            console.log(" Id recibido: " + objRest.id + "\n Nombre recibido: " + objRest.nombre + 
                    "\n Email recibido: " + objRest.email  );
            
            var divInfo = document.getElementById("div_info");
            divInfo.style = "disyplay: block";
            document.getElementById("id_cli").innerHTML = objRest.id;
            document.getElementById("nombre_cli").innerHTML = objRest.nombre;
            document.getElementById("email_cli").innerHTML = objRest.email;
            document.getElementById("edad_cli").innerHTML = objRest.edad;
            document.getElementById("password_cli").innerHTML = objRest.password;
            document.getElementById("activo_cli").innerHTML = objRest.activo;
            //Condicional ternario. 1.equals(objRest.activo) ? "on" : "off";
            /*if (objRest.activo == 1){
                objRest.activo = "on";
            }else{
                objRest.activo = "off";
            }
            document.getElementById("activo_cli").innerHTML = objRest.activo;*/
        } /*else {
            alert("Aun NO hemos recibido nada!");
        }*/
    };
    // Definimos la petición
    peticionHTTP.open("POST", "clientes2.do", true);
    
    // le decimos en la cabecera que lo que se pasa es un formulario
    // codifica la url del formulario porque algunos caracteres no pueden ir en la url
    // porque lo estamos pasando con JavaScript. HTML lo codifica automáticamente
    peticionHTTP.setRequestHeader("Content-type" , "application/x-www-form-urlencoded");
    // lanzamos la petición
    var form1 = document.getElementById("form1");
    var formData = new FormData(form1);
    var cadenaEnvio = 
          "nombre=" + encodeURIComponent(document.getElementById("nombre").value)
          + "&email=" + encodeURIComponent(document.getElementById("email").value)
          + "&password_encrip=" + encodeURIComponent(document.getElementById("password_encrip").value)
          + "&activo=" + encodeURIComponent(activo)
          + "&edad=" + encodeURIComponent(document.getElementById("edad").value);
    
    alert(cadenaEnvio);
    // envío la petición con los parámetros de open y la cadena
    peticionHTTP.send(cadenaEnvio);// al enviar la petición cambia varias veces el estado y se va a onreadystatechange
};
// document.getElementById("btn_modificar").addEventListener("click", alPulsarModificar );
// Esta línea es equivalente a la anterior
document.getElementById("btn_modificar").onclick = alPulsarModificar;