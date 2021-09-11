	<h1>Cadastrar</h1>
		<form action="?page=salvar-cadastro" method="POST">
			<input type="hidden" name="acao" value="cadastrar">
			<div class="form-group">
				<label>Usuario</label>
				<input type="varchar" name="Usuario" class="form-control">
			</div>
			<div class="form-group">
				<label>Telefone</label>
				<input type="int" name="Telefone" class="form-control">
			</div>
			<div class="form-group">
				<label>Sexo</label>
				<input type="varchar" name="sexo" class="form-control">
			</div>
			<div class="form-group">
				<label>Idade</label>
				<input type="int" name="idade" class="form-control">
			</div>
			
			<div class="form-group">
				<button type="submit" class="btn btn-success">Cadastrar</button>
			</div>
		</form>