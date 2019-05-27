var alPulsarModificar = function (){
    antesDeEnviar();
    var nombre = document.getElementById("nombre").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password_encrip").value;
    var edad = document.getElementById("edad").value;
    var activo = document.getElementById("activo").checked;
    activo = activo ? "on" : "off";
    
    var cliente = {
        "nombre":nombre,
        "email":email,
        "edad":edad,
        "activo":activo
    };
    cliente.password=password; // otra manera de poner atributos al objeto en JS
    cliente["activo"]= activo; // otra manera de poner atributos al objeto en JS
    
    var clienteJSON = JSON.stringify(cliente);
    alert("Enviando..." + clienteJSON);
    peticionHTTP.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    
    var peticionHTTP = new XMLHttpRequest();
    peticionHTTP.onreadystatechange=function (){
        alert("Ha cambiado algo, nivel: " + peticionHTTP.readyState);
        if (this.readyState === 4 && this.status === 200){
            alert("Hemos recibido la respuesta" + this.responseText);
        }else {
            alert("Aun NO hemos recibido nada");
        }
    }
    // definimos la peticion
    peticionHTTP.open("PUT", "http://localhost:8084/WebVentas/clientes2.do", true);
    // mandamos la peticion
    var formDATA = formDATA(document.getElementById("form1"));
    var cadenaEnvio = "nombre=" + encodeURIComponent(document.getElementById("nombre").value) 
                        + "email=" + encodeURIComponent(document.getElementById("email").value) 
                        + "password_encrip=" + encodeURIComponent(document.getElementById("password_encrip").value) 
                        + "activo=" + encodeURIComponent(document.getElementById("activo").value) 
                        + "edad=" + encodeURIComponent(document.getElementById("edad").value);
alert(cadenaEnvio);                
};

document.getElementById("btn_modificar").addEventListener("click", alPulsarModificar);