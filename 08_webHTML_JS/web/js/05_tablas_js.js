/* GPL 1.0
 */

console.log("Generando tabla...");
generarTabla();
function generarTabla(){
    var table = document.getElementsByTagName("table")[0];
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
    
    var lista = new Array();   //creamos array vacío
    lista = [["Vaina: ", "Peine", "15€", "7"]]; //notación de javascript para array multidimensional
    lista [1] = ["Vaina: ", "Quitapelos", "30€", "1"];
    lista [2] = ["Vaina: ", "Coche", "200€", "2"];
    
    for (var i = 0; i<lista.length; i++){
        var nodoTR = document.createElement("tr");
        table.appendChild(nodoTR);
        for (var columna of lista[i] ){
            var nodoCol = document.createElement("td");
            nodoTR.appendChild(nodoCol);
            var textoCol = document.createTextNode(columna);
            nodoCol.appendChild(textoCol);
            
        }
    }
}
