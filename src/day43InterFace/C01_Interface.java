package day43InterFace;

public interface C01_Interface {
	
	void motor();// normal sartlarda acce smidi yazilmazsa defealt kabul eder
	// interface de acces modi yazilmazsa public yapar
	

	//private int sayi=10; variable accesi private yapamayiz public static final olmali
	// interface de bodysi olan bi method yazmak isterseniz iki alternatif var
	// asagida yazilan default acces modi deil java nin ozel cikardigi ozellik
	public default void kaporta() {
		
	}
	
	public static void sanzuman() {
		System.out.println("static vord ile body olusturabildim");
	}
	
	
}
