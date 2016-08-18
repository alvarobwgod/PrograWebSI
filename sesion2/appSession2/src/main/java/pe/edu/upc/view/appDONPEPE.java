package pe.edu.upc.view;

import pe.edu.upc.entity.Ensalada;
import pe.edu.upc.entity.Mantequilla;

public class appDONPEPE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Ensalada En = new Ensalada("Amarillo","Dulce");
	
	Mantequilla man = new Mantequilla("Rojo","Acido",1,"Vidrio");
	
	System.out.println(En.toString());
	En.SoyunMetodoObjeto();

	
	System.out.println(man.toString());
	man.SoyunMetodoObjeto();
	
	Ensalada.LugarOrigen="Tierra";
	Ensalada.SoyunMetodoGlobal();
	}

}
