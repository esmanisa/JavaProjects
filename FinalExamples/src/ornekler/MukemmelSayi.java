package ornekler;

import java.io.*;

public class MukemmelSayi {

	public static void main(String[] args) throws IOException {
		
		
		File f=new File("mukemmelsayi.txt");
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("mukemmelsayi.txt"));
		
		if(!f.exists())
			f.createNewFile();
		
		int toplam=0;
        for(int i=1;i<=10000;i++){
            
        	for(int j=1;j<i;j++){
                
                if(i%j==0){
                    
                    toplam=toplam+j;
                }
                
                }
            if(toplam==i){
            	bw.write(i+"\n");
            }
            toplam=0;            
        }

        bw.close();
	}

}
