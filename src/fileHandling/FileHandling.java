package fileHandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
 
public class FileHandling
{
    private static void createFileIn_NIO()  throws IOException
    {
        String data = "New written data \n";
        Files.write(Paths.get("d://temp//testFile3.txt"), data.getBytes());
        List<String> lines = Arrays.asList("1st appended line", "2nd appended line");
        Files.write(Paths.get("d://temp//testFile3.txt"),
                    lines,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
    }
	
	    private static void FReading()  throws IOException {
		
		String str ="";
	        try{
	            File f=new File("d://temp//testFile3.txt");
	            if(! f.exists())
	            f.createNewFile();
	            FileReader fl=new FileReader(f);
	            BufferedReader sc=new BufferedReader(fl);
	            //For reading till end
	            while((str=sc.readLine())!=null){
	                System.out.println(str);
	            }
	            fl.close();
	            }catch(Exception e){
	            System.out.println("Error : " );
	            e.printStackTrace();
	        }
	    }
	
	public static void main(String[] args) throws IOException{
		createFileIn_NIO();
		FReading();
	}
   
}
