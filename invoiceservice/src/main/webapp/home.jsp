<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<!--  Date Picker -->
    <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />

<title>Digital Platoon</title>
</head>
<body>
	<br>
	<br>
	<div class="d-flex justify-content-center mt-1">
		<h1>Invoice</h1>
	</div>
	<div class="d-flex justify-content-center">
		<form action="addInvoice">

			<div class="form-group">
				<label for="client">Client</label> <input
					type="text" class="form-control" id="client" name="client"
					placeholder="Client">
			</div>
			<div class="form-group">
				<label for=vatRate>Vat Rate</label> <input
					type="text" class="form-control" id="vatRate" name="vatRate"
					placeholder="Vat Rate">
			</div>
			
			<div class="form-group">
				<label for="invoiceDate">invoice Date</label> <input
					type="date" class="form-control" id="invoiceDate" name="invoiceDate"
					placeholder="Another input placeholder">
			</div>

			<div class="d-flex justify-content-center">
				<input class="btn btn-secondary" type="submit" value="Add Invoice">
			</div>
		</form>

	</div>
	
	




	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
</body>
</html>