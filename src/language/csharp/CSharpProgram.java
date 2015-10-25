package language.csharp;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.*;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import language.AProgram;
import language.ASourceFile;


public class CSharpProgram extends AProgram {

	
	public CSharpProgram(String aName, String aDescription , String aFolderRoot){
		m_Language = new CSharpLanguage();
		m_Name = aName;
		m_Description = aDescription;
		m_SourceFiles = new ArrayList<ASourceFile>();
	}
	
	

	@Override
	protected void ScanFiles(boolean recursive) {
	
		
		
	}



	@Override
	public void ScanFiles(String aPath, boolean recursive) {

		File f = new File(aPath);
		for (String aFile : f.list(m_Language.GetFileFilter())) {
			m_SourceFiles.add(new CSharpSourcefile(Paths.get(aFile), (CSharpLanguage) m_Language));
		}
		if(f.isDirectory()){
			
		}
		

		
		
	}
	

}
