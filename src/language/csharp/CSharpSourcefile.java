package language.csharp;

import java.util.ArrayList;

import language.AClass;
import language.ASourceFile;
import language.IClassable;

public class CSharpSourcefile extends ASourceFile implements IClassable{

	public CSharpSourcefile(String aPath) {
		super(aPath);
		ParseForClasses();
	}

	@Override
	public void ParseForClasses() {

		if(this.m_Classes == null){
			this.m_Classes = new ArrayList<AClass>();
		}
		for(String line : m_FileContents){
			if(line.contains("class ")){
				String tmpLine = line .trim();
				int idxOfClass = tmpLine .indexOf("class ");
				int idxOfClassNameStart = tmpLine .indexOf(" ",idxOfClass+5);
				int idxOfClassNameEnd = tmpLine .indexOf(" ",idxOfClassNameStart+1);
				if(idxOfClassNameEnd == -1){
					idxOfClassNameEnd = tmpLine .length();
				}



				CSharpClass tmp = new CSharpClass();
				tmp.SetClassName(tmpLine .substring(idxOfClassNameStart+1,idxOfClassNameEnd ));
				tmp.SetSourceFileName(this.getFilename());
				if(idxOfClass > 0){
					//Class has modifiers ?
				}
				this.m_Classes.add(tmp);

			}
		}
	}

	@Override
	public ArrayList<String> GetClassNames() {
		ArrayList<String> retval = new ArrayList<String>();
		if(m_Classes== null){
			return retval;
		}
		for(AClass a : m_Classes){
			retval.add(a.GetClassName());
		}
		return retval;
	}

	@Override
	public ArrayList<AClass> GetClassesInSourceFile() {
		return m_Classes;
	}




}
