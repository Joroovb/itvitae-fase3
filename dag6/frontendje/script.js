async function getContent() {
  const data = await fetch("http://localhost:8080/admin", {
    headers: {
      Authorization: "Basic " + btoa("admin:admin"),
    },
  });
  const text = await data.text();
  document.getElementById("container").innerHTML = text;
}

getContent();
