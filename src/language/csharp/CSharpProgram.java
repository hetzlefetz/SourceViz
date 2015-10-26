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
	public void ScanFiles(String aPath, boolean recursive) {
		
		File root = new File(aPath);
		File[] list = root.listFiles();
		
		if(list == null){
			return ;
		}else{
			for(File f :list){
				if(f.isDirectory() && recursive){
					ScanFiles(f.getAbsolutePath(), recursive);
				}else{
					for(String s : m_Language.getDefaultFileEndings()){
						if(f.getName().endsWith(s)){
							getSourceFiles().add(new CSharpSourcefile(f.getAbsolutePath()));
						}
					}
				}
			}
		}
		
	}
}
