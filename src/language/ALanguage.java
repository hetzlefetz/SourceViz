package language;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public abstract class ALanguage {



	protected String m_Name ;
	protected ArrayList<AType> m_BuiltinTypes;
	protected ArrayList<String> m_DefaultFileEndings;

	
	public ArrayList<String> getDefaultFileEndings() {
		return m_DefaultFileEndings;
	}
}
