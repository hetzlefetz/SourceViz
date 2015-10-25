package language;

import java.util.ArrayList;

public abstract class AProgram {
	
	protected String m_Name;
	protected String m_Description; 
	protected ALanguage m_Language;
	protected ArrayList<ASourceFile> m_SourceFiles;
	
	protected abstract void ScanFiles(boolean recursive);
	protected abstract void ScanFiles(String aPath, boolean recursive);
	
	
}
