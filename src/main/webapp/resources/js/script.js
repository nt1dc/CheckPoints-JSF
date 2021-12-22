function sub(event) {
    let x = document.getElementById("formID:x"), y = document.getElementById("formID:y");
    let rowX = event.offsetX
    let rowY = event.offsetY
    R = getR();
    x.value = (((300 / 2 - rowX) * -R) / 120 - 0.7).toFixed(2);
    y.value =(((R / 60) * (300 / 2 - rowY)) / 2 + 0.7).toFixed(2);
    console.log("was clicked")
    document.getElementById("formID:sumbitter").click();
    // alert("2")
}


function getR() {
    return document.getElementById('formID:r').value;
}
