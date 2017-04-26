<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Index</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/design.css" />

<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/bootstrap/dist/css/bootstrap.min.css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/jquery/dist/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/bootstrap/dist/js/bootstrap.min.js"></script>
</head>
<body>
<body>
<div id=corps> 				

	<nav class="navbar navbar-inverse">

		<div id="navBar" class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
				</button>
				<!-- <a class="navbar-brand" href="#">WebSiteName</a> -->
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li><a href="#">SPANC</a></li>
					<li><a href="#">Usagers</a></li>
					<li><a href="#">Collectivités</a></li>
					<li><a href="#">Contact</a></li>
				</ul>
				      <ul class="nav navbar-nav navbar-right">
        <li><a href="j_spring_security_logout"><span class="glyphicon glyphicon-log-in"></span> Déconnexion</a></li>
      </ul>
			</div>
			

		</div>
	</nav>
	
	<header class="page-header">
		<h1>
			Service Public d'Assainissement Non Collectif (SPANC)<br/><small>Communauté
				de Communes du Grand Senonais</small>
		</h1>
	</header>
	

	<h3>Bienvenue sur l'application du SPANC du Grand Senonais</h3>
	

</div>
	<footer>
		<p>Copyright 2017 - Conception : Maël BERROU, Laëtitia RAOBELINA - Réalisation : Laëtitia RAOBELINA</p>
		<a href=#><button id="admin" type="button" class="btn btn-primary">
					Administration<br/>du site
				</button></a>
	</footer>
</body>
</html>
