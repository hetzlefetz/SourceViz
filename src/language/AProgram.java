package language;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;

import language.csharp.CSharpLanguage;
import language.csharp.CSharpSourcefile;

public abstract class AProgram {
	
	protected String m_Name;
	protected String m_Description; 
	protected ALanguage m_Language;
	protected String m_Path;
	protected ArrayList<ASourceFile> m_SourceFiles;
	
	protected abstract void ScanFiles(String aPath,  boolean recursive);
	public int getSourceFileCount(){
		if(getSourceFiles() == null){
			return 0;
		}
		else{
			return getSourceFiles().size();
		}
	}
	public ArrayList<ASourceFile> getSourceFiles() {
		return m_SourceFiles;
	}
		
		


	}	

