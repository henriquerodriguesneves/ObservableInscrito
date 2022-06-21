package controller;

public class Inscrito implements IObservador{
		
	@Override
	public void update(String acao) {
		if (acao.equals("videoNovo"))
			System.out.println("Tem video novo no canal!");
	}

	

}
