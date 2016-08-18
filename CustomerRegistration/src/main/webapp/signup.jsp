<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <link rel="stylesheet" type="text/css" href="signup.css"> -->
<script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
 <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
 <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<script>
$(document).ready(function() {
	
		$.ajax({
			type : "GET",
			url : "servcontrol/services",	//request mapping url
			success : function(msg) {
				var response = jQuery.parseJSON(msg);
			
				$('#service').find('option').remove();	//give drop down id
				$.each(response, function(key, value) {
					$("#service").append(
							"<option value='" + key + "'>"
									+ value + "</option>");
				});
			},
			error : function() {
				alert("Failed to load serviceplans");
			}
	
	});

});
</script>
<style >
.container{
background-color: red;
}
</style>
</head>
<body>

 <div class="container">
        <div class="row centered-form">
            <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Customer Registration</h3>
                    </div>
                    <div class="panel-body">
	<form action="custcontrol" method="post">
		First name: <input type="text" name="firstName"><br> Last
		name: <input type="text" name="lastName"><br> E-mail:<input
			type="text" name="email" value="your email"><br> <select
			id="service" name="servplan.sid">
			<option>Select Service</option>
		</select> <input type="submit" value="Submit">
	</form>
	
		 </div>
                </div>
            </div>
        </div>
    </div>
	
	
</body>
</html>