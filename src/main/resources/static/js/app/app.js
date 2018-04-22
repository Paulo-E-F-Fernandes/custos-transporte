function adicionar() {
	console.log("TESTE ADICIONAR");
	console.log($('.form-quilometragem').find( "input[name=quilometragemTipo]:radio:checked" ).val());
	console.log($('.form-quilometragem').find("input[name=quilometragem]").val());
}