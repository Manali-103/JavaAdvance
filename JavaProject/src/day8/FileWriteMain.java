package day8;
import java.io.FileOutputStream;
public class FileWriteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String filePath = "ice.txt";
       String ice_data = "\n4.Pista\n5.Vanilla";
       try(FileOutputStream fout = new FileOutputStream(filePath, true)){
    	   byte[] ice_cream_info = ice_data.getBytes();
    	   fout.write(ice_cream_info);
    	   System.out.println("Data has been written to file");
       }
       catch(Exception ex) {
    	   ex.printStackTrace();
       }
     
	}
	
}