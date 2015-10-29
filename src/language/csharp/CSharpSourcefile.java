package language.csharp;

import java.util.ArrayList;

import language.AClass;
import language.ASourceFile;

public class CSharpSourcefile extends ASourceFile{

	public CSharpSourcefile(String aPath) {
		super(aPath);
	}

	@Override
	public void ParseForClasses() {

		if(this.m_Classes == null){
			this.m_Classes = new ArrayList<AClass>();
		}
		for(String line : m_FileContents){
			if(line.contains("class ")){
				int idxOfClass = line.indexOf("class ");
				int idxOfClassNameStart = line.indexOf(" ",idxOfClass+5);
				int idxOfClassNameEnd = line.indexOf(" ",idxOfClassNameStart+1);
				if(idxOfClassNameEnd == -1){
					idxOfClassNameEnd = line.length();
				}
				CSharpClass tmp = new CSharpClass();
				tmp.SetClassName(line.substring(idxOfClassNameStart+1,idxOfClassNameEnd ));
				tmp.SetSourceFileName(this.getFilename());
				
				this.m_Classes.add(tmp);

			}
		}
	}




}
