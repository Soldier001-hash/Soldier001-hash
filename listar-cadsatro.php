<h1>Listar</h1>
<?php
	$sql = "SELECT * FROM formulario";
	
	$res = $conn->query($sql) or die($conn->error);
	
	$qtd = $res->num_rows;
	
	print "<p>Encontrou <b>".$qtd."</b> resultado(s)</p>";
	
	if($qtd > 0){
		print "<table class='table table-striped table-hover'>";
		print "<tr>";
		print "<th>Usuario</th>";
		print "<th>Telefone</th>";
		print "<th>Sexo</th>";
		print "<th>Idade</th>";
		print "</tr>";
		while($row = $res->fetch_object()){
			print "<tr>";
			print "<td>".$row->Usuario."</td>";
			print "<td>".$row->Telefone."</td>";
			print "<td>".$row->sexo."</td>";
			print "<td>".$row->idade."</td>";
			print "</tr>";
		}
		print "</table>";
	}else{
		print "<div class='alert alert-danger'>Não há nenhum resultado</div>";
	}
?>









