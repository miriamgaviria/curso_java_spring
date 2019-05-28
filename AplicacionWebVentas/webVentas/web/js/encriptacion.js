function encriptar (valor){
    var splitString = valor.split("");
    var reverseArray = splitString.reverse();
    var joinArray = reverseArray.join("");
    joinArray = "K7" + joinArray + "Up";
    //Encripto antes la passwor para después darle más encriptación con la función predetirmanada
    md5(joinArray);
    var hash = md5.create();
    hash.update(joinArray);
    return hash.hex();//hex = hexadecimal
}

function antesDeEnviar(){
    var passwd = document.getElementById("password").value;
    document.getElementById("password_encrip").value = encriptar(passwd);
    document.getElementById("password").value="";
}

var form1 = document.getElementById("form1");
// función callback: sin paréntesis porque se pasa referencia a la función; se ejecuta cuando el usuario haga submit
form1.addEventListener("submit", antesDeEnviar); //
