/* GPL 1.0
 */

console.log("Generando tabla...");

var lista = new Array();   //creamos array vacío
    lista = [["Vaina: ", "Peine", "15€", "7"]]; //notación de javascript para array multidimensional
    lista [1] = ["Vaina: ", "Quitapelos", "30€", "1"];
    lista [2] = ["Vaina: ", "Coche", "200€", "2"];

var color="color";
document.write(color);
generarTabla();

function pasarParametros() {
    color = document.getElementById("color").value;
    var tipo = document.getElementById("tipo").value.style;
    var nombre = document.getElementById("nombre").value;
    var precio = document.getElementById("precio").value;
    var stock = document.getElementById("stock").value;
    var elementos = lista.length;//document.write (lista[3]);
    document.write(color);
    lista[elementos] = [tipo, nombre, precio, stock]; // = lista.push([tipo, nombre, precio, stock]);
    generarTabla();//document.write (nombre);
}

function generarTabla() {
    table = document.getElementsByTagName("table")[0];
    table.innerHTML = "<caption>Lista de vainas</caption>";
    var nombrePrecio = "Precio";
    table.innerHTML += `
        <thead>
            <tr>
                <th>Tipo</th>
                <th>Nombre</th>
                <th>${nombrePrecio}</th>
                <th>Stock</th>
            </tr>
        </thead>`;

    for (var i = 0; i < lista.length; i++) {
        var nodoTR = document.createElement("tr");
        table.appendChild(nodoTR);
        for (var columna of lista[i]) {
            var nodoCol = document.createElement("td");
            nodoTR.appendChild(nodoCol);
            var textoCol = document.createTextNode(columna);
            nodoCol.appendChild(textoCol);
            //nodoCol.setAttribute("color:red");
        }
    }
}

function borrarFila(){
    lista.splice((lista.length-1), 1);
    generarTabla();
}

function borrarTabla(){
    table.innerHTML = "";
}



