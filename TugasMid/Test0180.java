/*Nama : Wa Ode Ratna Adiningsih
  NIM	 : 13020210180*/

public class Test0180{
	public static void main (String[] args){
		Balok balok1 = new Balok();
		Balok balok2 = new Balok(20, 35, 15);
		balok1.setterL(5);
		balok1. SetterP(25);
		balok2. setterT(10);
		balok1.Info();
		balok2.Info();

	}
}

//class Balok
class Balok extends PersegiPanjang{
	int t;
	public Balok(){
		superclass();
		this.T(15);
	}
	public Balok(int p, int l, int t) {
		superclass(P, 1);
		this.T = 15;
	}
	public int getterT(){
		return T;
	}
	public void setterT (int T){
		this.T = T;
	}
	public int volume(){
		return getterP() * getterL() * T;
	}
	public void info(){
	System.out.printIn ("Nilai P : " + getterP());
	System.out.printIn ("Nilai Lebar : " + getterL());
	System.out.printIn ("Nilai T : " + T);
	System.out.printIn ("Nilai Luas : " + Luas());
	System.out.printIn ("Nilai V : " + Volume());
	}
}

// class PersegiPanjang
class PersegiPanjang {
    int p, l;
    
    public PersegiPanjang() {
        this.p = 30;
        this.l = 20;
    }
    
    public PersegiPanjang(int p, int l) {
        this.p = p;
        this.l = l;
    }
    
    public int getterP() {
        return p;
    }
    
    public void setterP(int p) {
        this.p = p;
    }
    
    public int getL() {
        return l;
    }
    
    public void setL(int l) {
        this.l = l;
    }
    
    public int luas() {
        return
		p*l;
	}
	public int keliling(){
    return 2 * (p + l);
	}
}

