function sub(event) {
    let x = document.getElementById("formID:x"), y = document.getElementById("formID:y");
    let rowX = event.offsetX
    let rowY = event.offsetY
    R = getR();
    x.value = (R*(rowX-150)/120).toFixed(2);
    y.value =((150-rowY)*R/120).toFixed(2);
    console.log("was clicked")
    document.getElementById("formID:sumbitter").click();
    // alert("2")
}


function getR() {
    return document.getElementById('formID:r').value;
}
