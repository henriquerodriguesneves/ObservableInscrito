package controller;

import java.util.List;

public class CriadorConteudo implements IObservavel{
	
	private List<Inscrito> inscritos;	

	public CriadorConteudo(List<Inscrito> inscritos) {
		this.inscritos = inscritos;
		
	}


	@Override
	public void notificaInscrito(String acao) {

		
		for (Inscrito inscrito : inscritos) {
			acao = "videoNovo";
			inscrito.update(acao);
			
		}
		
	}

	

}
