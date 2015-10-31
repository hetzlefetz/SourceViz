package ConsoleTester;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

import language.AClass;
import language.ASourceFile;
import language.csharp.CSharpClass;
import language.csharp.CSharpProgram;
import language.csharp.CSharpSourcefile;

public class Tester {

	public static void main(String[] args) {

		
		System.out.println("SorceViz - Tester");
		CSharpProgram p = new CSharpProgram("Some Name", "Some Description" , "../Test/Sources");
		
	
		p.ScanFiles("Test/Sources", true);
		
		System.out.println(String.format("Counted %d sourcefile(s)",p.getSourceFileCount()));

		for(ASourceFile s : p.getSourceFiles()){
			try {
				
				s.ReadFile();
				System.out.println(String.format("File %s has approx. %d lines of code", s.getFilename(), s.GetLoC()));
				for(AClass c : ((CSharpSourcefile) s).GetClassesInSourceFile()){
					System.out.println( "Class : " + c.GetClassName());
				}
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
