package day33stringbuilder;

public class C07_soru {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("merhaba ");
        String str="merhaba";
        sb1.trimToSize();
        
        
        long time1 =System.nanoTime();
        
        for (int i = 0; i < 1000; i++) {
			sb1.append(" ");
				
        }
        long time2 =System.nanoTime();
        
			long time3 =System.nanoTime();
	        
	        for (int i = 0; i < 1000; i++) {
				str+=(" ");
	        }
				long time4 =System.nanoTime();
			long sb1sure=time2-time1;
		   long strsure= time4-time3;
        
		   if (sb1sure>strsure) {
			System.out.println("string daha hizli");
		} else {
System.out.println("stringbuilder daha hizli");
		}
        System.out.println(sb1sure/strsure);
        System.out.println(time2);
        System.out.println(sb1sure);
        System.out.println(strsure);
	}

}
