package pe.edu.upc.entity;

public class Ensalada {
	
	//atributo de instancia
	
	private String color;
	private String sabor;
	
	//atrobitp de clase
	
	
	public static String LugarOrigen="UPC";

	public Ensalada(String color, String sabor) {
		super();//para acceder de un hijo a un padre
		this.color = color;
		this.sabor = sabor;
	}
	
	//static lo hace global 
     public static void  SoyunMetodoGlobal(){
    	 
     }
     
     public void SoyunMetodoObjeto(){
    	 
     }
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"-"+this.getColor();
	}
	
	
	
	

}
