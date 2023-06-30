package ornekler;
import java.io.*;

public class AsalSayi {

	public static void main(String[] args) throws IOException {

		File f=new File("asalsayi.txt");
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("asalsayi.txt"));
		
		if(!f.exists())
			f.createNewFile();
		
		
		 int sayac = 0;
	        for(int sayi=2;sayi<1011;sayi++)
	        {
	            int kontrol = 0;
	            for (int i = 2; i < sayi; i++)
	            {
	               if (sayi % i == 0)
	                {
	                    kontrol = 1;
	                    break;
	                } 
	            }
	                
	            if(kontrol==0)
	            {
	            	bw.write(sayi+"\n");
	            	sayac++; 
	            }
	        }
		bw.close();
	}

}
