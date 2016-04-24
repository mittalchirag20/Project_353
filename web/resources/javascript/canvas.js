$(document).ready(function () {
    var canvas = document.getElementById("ex1");
    var ctx = canvas.getContext("2d");
    var image = new Image();
    image.src = "resources/images/sample.jpg";
    $(image).load(function () {
        ctx.drawImage(image, 0, 0, 1000, 1000);
        ctx.fillStyle = "white";
	ctx.fillRect(0, 0, 1000, 200);
        ctx.fillRect(0, 202, 1000, 400);
        ctx.fillRect(100, 402, 900, 398);
        ctx.fillRect(0, 802, 1000, 400);
    });
    $(canvas).click(function (e) {
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