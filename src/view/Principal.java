package view;

import java.util.ArrayList;
import java.util.List;

import controller.CriadorConteudo;
import controller.Inscrito;

public class Principal {
	
	public static void main(String[] args) {
		
		Inscrito i1 = new Inscrito();
		Inscrito i2 = new Inscrito();
		Inscrito i3 = new Inscrito();
		List<Inscrito> inscritos = new ArrayList<Inscrito>();
		inscritos.add(i1);
		inscritos.add(i2);
		inscritos.add(i3);
		
		CriadorConteudo criador = new CriadorConteudo(inscritos);
		
		criador.notificaInscrito("videoNovo");
		
	}

}
