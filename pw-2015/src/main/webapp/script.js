$(document).ready(function(){ 
  $.get("cabecalho.html", function(data) {
    $("#cabecalho").html(data);
  });
});

$(document).ready(function(){ 
	  $.get("rodape.html", function(data) {
	    $("#rodape").html(data);
	  });
	}); 
