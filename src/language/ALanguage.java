package language;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public abstract class ALanguage {



	protected String m_Name ;
	protected ArrayList<AType> m_BuiltinTypes;
	protected ArrayList<String> m_DefaultFileEndings;

	/**
	 * Function that generates a basic file filter, based on the default endings as defined in an implementation of ALanguage 
	 * @return AFilenameFilter 
	 */
	public FilenameFilter GetFileFilter() {
		return new FilenameFilter() {

			@Override
			public boolean accept(File arg0, String arg1) {
				if(m_DefaultFileEndings == null ||  m_DefaultFileEndings.size() == 0){
					return false;
				}

				String fileName = arg0.getName();
				for (String aFileEnding : m_DefaultFileEndings) {
					if(fileName.endsWith(aFileEnding.substring(0, aFileEnding.length()-2))){
						return true;
					}
				}
				return false;
			}
		};
	}

}
