function maakTestVogel() {
    const req = new XMLHttpRequest();
    req.onload = function() {
        document.getElementById("test-vogel").innerHTML = this.responseText;
    }
   req.open("GET", "http://localhost:8082/api/vogel/testvogel");
   req.send();
}

function bouwVogelTabel(data) {
    let tableBody = document.getElementById("table");
    tableBody.innerHTML = "";
    for (let i = 0; i < data.length; i++) {
        let row = `<tr>
                        <td>${data[i].naam}</td>
                        <td>${data[i].soort}</td>
                   </tr>`;
    tableBody.innerHTML += row;
    }
}

async function haalAlleVogels() {
    const res = await fetch("http://localhost:8082/api/vogel/all");
    const data = await res.json();
    bouwVogelTabel(data);
}

async function zoekVogelOpNaam() {
    const naam = document.getElementById("naam").value;
    const res = await fetch(`http://localhost:8082/api/vogel/naam/${naam}`);
    const data = await res.json();
    maakVogelResultaat(data);
}

function maakVogelResultaat(data) {
    let element = document.getElementById("zoekresultaat");

    if (data.length === 0) {
        element.innerHTML = "Geen resultaten";
        return;
    }

    element.innerHTML = "<ul>"
    for (let i = 0; i < data.length; i++) {
        element.innerHTML += `<li>${data[i].naam}</li>`;
    }
    element.innerHTML += '</ul>'
}

