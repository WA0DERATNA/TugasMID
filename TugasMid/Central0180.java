/*Nama : Wa Ode Ratna Adiningsih
  NIM	 : 13020210180*/

interface A {
	public void aaa();
}	
interface B extends A {}	

class Central0180 implements B{
	public void aaa(){
	System.out.println("aaa");
	}
	public static void main(String arg[]){
		Central0180 obj = new Central0180();
		System.out.println("main");
		this.aaa();
		obj.aaa();
}
}