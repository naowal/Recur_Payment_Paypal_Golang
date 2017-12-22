<!DOCTYPE html>
<html lang="en">
<head>
  <title>Follow Monthly Subscriptions</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Monthly Subscriptions</h2>
  <!-- Trigger the modal with a button -->
  <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">follow</button> <br/><br/>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">1 MONTH FREE</h4>
        </div>
        <div class="modal-body">
          <p>
          <center>Would you like to become a monthly subscriber of<br/>
          (user name)? / 100yen per month</center></p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">No</button>
		  <form action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post" target="_top">
			<input type="hidden" name="cmd" value="_s-xclick">
			<input type="hidden" name="rm" value="2">
			<input type="hidden" name="hosted_button_id" value="R8NP968R5KGQY">
			<input type="submit" name="submit" alt="1 MONTH FREE subscriber!" value="Yes">
</form>
        </div>        
      </div>
      
    </div>
  </div>
  
</div>

</body>
</html>
