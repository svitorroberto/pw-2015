﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	// verificando se tem um atributo login na sessao
	// se tiver vai continuar e mostrar o menu
	if(session.getAttribute("login") != null) {
%>

<html lang="pt-BR">
	<head>
		<title>Unificada - Home</title>
		<meta charset="utf-8">
		<link rel="stylesheet" href="resources/css/reset.css">
		<link rel="stylesheet" href="resources/css/main.css">
		<link href='http://fonts.googleapis.com/css?family=Architects+Daughter|Permanent+Marker|Trade+Winds|Graduate' rel='stylesheet' type='text/css'>
		<link rel="shortcut icon" href="resources/images/Logo.png">
		<script src="js/jquery-ui-1.11.4.custom/external/jquery/jquery.js"></script>
		<script src="../assets/js/jquery-1.9.1.min.js"></script> 
		<script src="resources/js/mainScript.js"></script>
		
		<!-- Só pra home -->
		<script src="js/owl.carousel.js"></script>
		<link href="resources/css/owl.carousel.css" rel="stylesheet">
		<link href="resources/css/owl.theme.css" rel="stylesheet">
		<link href="resources/css/owl.transitions.css" rel="stylesheet">
	
		
	</head>
	<body id="body" >
		
		<header>
			<a href="home.html"><img src="resources/images/Logo.png" alt="logo_unificada" class="circle_logo"></img></a>
			<button id="show_menu" class="button_unificada">Menu</button>
			<ul id="menu">
				<li class="active"><a href="home.html">Home</a></li>
				<li><a href="galeria.html">Galeria</a></li>
				<li><a href="produtos.html">Produtos</a></li>
				<li><a href="esportes_bau.html">Esportes/Bateria</a></li>
				<li><a href="eventos.html">Eventos</a></li>
				<li><a href="historia.html">História</a></li>
				<li><a href="gestao.html">Gestão</a></li>
				<li><a href="usys_login.html">Área Restrita</a></li>
			</ul>
		</header>
		
		<div id="carousel_destaques" class="owl-carousel">
			<div class="item"><img src="resources/images/destaques/destaque01.jpg"></div>
			<div class="item"><img src="resources/images/destaques/destaque02.jpg"></div>
			<div class="item"><img src="resources/images/destaques/destaque03.jpg"></div>
		</div>
		
		
		<div id="top_3_produtos">
			<div class="topproduto"><img src="resources/images/produtos/topproduto01.png"></img></div>
			<div class="topproduto"><img src="resources/images/produtos/topproduto02.png"></img></div>
			<div class="topproduto"><img src="resources/images/produtos/topproduto03.jpg"></img></div>
		</div>
		<div id="ultimas_imagens">
		</div>
		
	</body>
	<footer class="dark">
		<img src="resources/images/gmail-icon.png" alt="gmail-icon" width="25px" height="25px"></img>
		<a>E-mail: aaaucomp@gmail.com.br</a>
		<br>
		<img href="http://www.facebook.com/aaaucomp"src="resources/images/facebook-icon.png" alt="facebook-icon" width="25px" height="25px"></img>
		<a href="http://www.facebook.com/aaaucomp">www.facebook.com/aaaucomp</a>
	</footer>
	
	
</html>

<%
	// se não existir um login na sessao, 
	// vai enviar para a página de login novamente
	} else {
%>
	<jsp:forward page="Entrar.jsp"></jsp:forward>
<%
}
%>