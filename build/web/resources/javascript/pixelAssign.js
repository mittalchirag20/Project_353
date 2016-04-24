$(document).ready(function () {
    var canvas = document.getElementById("ex1");
    var ctx = canvas.getContext("2d");
//    var image = new Image();
//    image.src = "sample.jpg";
//    $(image).load(function () {
//        ctx.drawImage(image, 0, 0);
//    });

    $(canvas).hover(function (e) {
        var canvasOffset = $(canvas).offset();
        var canvasX = Math.floor(e.pageX - canvasOffset.left);
        var canvasY = Math.floor(e.pageY - canvasOffset.top);

        var imageData = ctx.getImageData(0, 0, canvas.width, canvas.height);
        var pixels = imageData.data;
        var pixelRedIndex = ((canvasY - 1) * (imageData.width * 4)) + ((canvasX - 1) * 4);
        var pixelcolor = "rgba(" + pixels[pixelRedIndex] + ", " + pixels[pixelRedIndex + 1] + ", " + pixels[pixelRedIndex + 2] + ", " + pixels[pixelRedIndex + 3] + ")";

        $("body").css("backgroundColor", pixelcolor);
    });
});