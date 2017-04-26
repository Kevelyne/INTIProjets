<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Connexion</title>
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
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<!-- <a class="navbar-brand" href="#">WebSiteName</a> -->
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav">
						<li><a href="#">Accueil</a></li>
						</ul>
				</div>


			</div>
		</nav>

		<header class="page-header">
			<h1>
				Connexion à votre espace<br /> <small>Page
					d'authentification</small>
			</h1>
		</header>


		<form class="form-horizontal" action="j_spring_security_check"
			method="POST">

			<div class="form-group">
				<label class="control-label col-sm-2" for="name">Identifiant
					: </label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="j_username" />

				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="pwd">Mot de passe
					: </label>
				<div class="col-sm-10">
					<input type="password" class="form-control" name="j_password" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" class="btn btn-info" value="Connexion" />
				</div>
			</div>
		</form>

		<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
			<div class="container alert alert-warning">
				<p>
					<%-- ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message"} --%>
					Mot de passe incorrect !
				</p>
			</div>
		</c:if>

	</div>
	<footer>
		<p>Copyright 2017 - Conception : Maël BERROU, Laëtitia RAOBELINA -
			Réalisation : Laëtitia RAOBELINA</p>
		<a href=#><button id="admin" type="button" class="btn btn-primary">
				Administration<br />du site
			</button></a>
	</footer>
</body>
</html>
