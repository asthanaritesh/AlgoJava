package CoreJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) throws IOException {
		String appDConfigFileName = "E:\\Projects\\AlgoJavaWS\\AlgoJava\\src\\CoreJava\\appD.config";
		File appDConfigFile = new File(appDConfigFileName);
		if(appDConfigFile.exists())
		{
			BufferedReader appDConfigReader = new BufferedReader(new FileReader(appDConfigFile));
			String line;
			while((line = appDConfigReader.readLine()) != null){
				if (line.trim().isEmpty())
					continue;
			    //System.out.println(line);
			    String[] columns = line.split("=");
			    if (columns[0].trim().equals("APP_NAME_MAP"))
			    	System.out.println("APP_NAME_MAP is: "+ columns[1].trim());
			    
			    if (columns[0].trim().equals("TIER_NAME_MAP"))
			    	System.out.println("TIER_NAME_MAP is: "+ columns[1].trim());
			    
			    if (columns[0].trim().equals("NODE_NAME_MAP"))
			    	System.out.println("NODE_NAME_MAP is: "+ columns[1].trim());
			    
			    if (columns[0].trim().equals("CONTROLLER_HOST"))
			    	System.out.println("CONTROLLER_HOST is: "+ columns[1].trim());
			    
			    if (columns[0].trim().equals("CONTROLLER_PORT"))
			    	System.out.println("CONTROLLER_PORT is: "+ columns[1].trim());
			    
			    if (columns[0].trim().equals("CONTROLLER_USE_SSL"))
			    	System.out.println("CONTROLLER_USE_SSL is: "+ columns[1].trim());
			    
			    if (columns[0].trim().equals("CONTROLLER_ACCOUNT"))
			    	System.out.println("CONTROLLER_ACCOUNT is: "+ columns[1].trim());
			    
			    if (columns[0].trim().equals("CONTROLLER_ACCESS_KEY"))
			    	System.out.println("CONTROLLER_ACCESS_KEY is: "+ columns[1].trim());
			}
			appDConfigReader.close();
		}
		else System.out.println("File doesnot exists");
	}
}
