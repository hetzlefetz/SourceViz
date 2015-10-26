package language.csharp;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

import language.ALanguage;
import language.AType;
import language.csharp.Types.CSharpBoolean;

public class CSharpLanguage extends ALanguage {

	public CSharpLanguage () {
		m_BuiltinTypes = new ArrayList<AType>();
		m_BuiltinTypes.add(new CSharpBoolean());
		m_DefaultFileEndings = new ArrayList<String>();
		m_DefaultFileEndings.add(".cs");
	}
	
	public void SetCustomFileEndings(ArrayList<String> NewFileEndings){
		this.getDefaultFileEndings().clear();
		this.getDefaultFileEndings().addAll(NewFileEndings);
	}

	
	
}
