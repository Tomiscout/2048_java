import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class FileManager{

	private static String fName="2048.txt";
	private static String workDirectory = System.getenv("APPDATA")+"\\Tomiscout\\";
	int maxScore;
	static Path file;
	
	public FileManager()
	{
		file = Paths.get(workDirectory+fName);
		createFile(workDirectory, fName);
		
	}
	
	public void loadData() throws IOException
	{
		
		byte[] fileArray;
		fileArray = Files.readAllBytes(file);
		
		String decoded = new String(fileArray, "UTF-8");
		
		if(decoded.equals(""))
		{
			writeData(0);
		}
		Gui.setMaxScore(Integer.parseInt(decoded));
	}
	
	public static void writeData(int x) throws IOException
	{
		String h = x+"";
		byte[] buf = h.getBytes();
		Files.write(file, buf);
    }
	
	
	public static void createFile(String dir, String name)
	{	
		//Creates folder
		 File theDir = new File(dir);

		  // if the directory does not exist, create it
		  if (!theDir.exists()) {
		    System.out.println("creating directory: " + dir);
		    boolean result = false;

		    try{
		        theDir.mkdir();
		        result = true;
		     } catch(SecurityException se){
		        se.printStackTrace();
		     }        
		     if(result) {    
		       System.out.println("DIR created");  
		     }
		  }
		
		
		//Creates .txt file
		try {
			 
		      File file = new File(dir+name);
	 
		      if (file.createNewFile()){
		        System.out.println("File is created!");
		        writeData(0);
		      }else{
		        System.out.println("File already exists.");
		      }
	 
	    	} catch (IOException e) {
		      e.printStackTrace();
		}
	
	}
}
//http://www.kosbie.net/cmu/fall-08/15-100/handouts/notes-scanner-methods-and-console-ui.html