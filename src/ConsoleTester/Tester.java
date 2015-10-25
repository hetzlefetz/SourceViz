package ConsoleTester;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

import language.csharp.CSharpProgram;

public class Tester {

	public static void main(String[] args) {

		
		System.out.println("SorceViz - Tester");
		CSharpProgram p = new CSharpProgram("Some Name", "Some Description" , "Test/Sources");
		p.ScanFiles("Tests/Sources", true);

	}

}
