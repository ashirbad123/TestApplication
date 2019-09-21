package create_FilesAndFolders;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

public class CreateFolderAndSubFolders {
	
	String fileName="file1.txt";
	String directoryName="D:\\NewDrive1";

	@Test
	public void createFolder() throws IOException {
	
		File file= new File(directoryName);
		if(!file.exists()) {
			if(file.mkdir()) {
				System.out.println("Directory is created "+file.getCanonicalPath());
				File file1= new File(directoryName+File.separator+fileName);
				if(!file1.exists()) {
				boolean status=file1.createNewFile();
				if(status) {
					System.out.println("File created and the name of the file is :"+fileName);
				}
			}
				else {
					System.out.println("File exist and the file name is"+fileName);
				}
		}
		else {
			System.out.println("Directory already exist and the "+directoryName);
			File file1= new File(directoryName+File.separator+fileName);
			 if(!file1.exists()) {
				boolean status=file1.createNewFile();
				if(status) {
					System.out.println("File created and the name of the file is :"+fileName);
				}
			}
		}
		
	}
		else {
			System.out.println("Directory and File exist");
		}
			
	
	/*@Test
	public void createFolderAndSubFolders() {
		
		File file= new File("D:\\Folder1\\SubFolder1\\Sub-subFolder1");
		if(!file.exists()) {
			if(file.mkdirs()) {
				System.out.println("All directories and sub directories are created");
			}
		}
	}*/
  }
}	
	
