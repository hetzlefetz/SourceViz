package language;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public abstract class ASourceFile {

	protected ArrayList<String> m_FileEndings ;
	protected ArrayList<String> m_FileContents;
	protected ArrayList<AClass> m_Classes;
	protected ALanguage m_Language;
	protected Path m_Path;
	protected BufferedReader m_Reader;
	protected int LoC;



	public ASourceFile(Path aPath, ALanguage aLanguage){
		this.m_Path = aPath;
		this.m_Language = aLanguage;
	}
	public ASourceFile(String aPath) {
		this.m_Path = Paths.get(aPath);
	}
	/**
	 * Reads  the content of a File based on the Path of the File, the path of the File object is set in the constructor
	 * @throws FileNotFoundException - The File wasn't found under the Path
	 * @throws NullPointerException - The Path variable wasn't set
	 * @throws IOException - Something happened during file reading
	 */
	public void ReadFile() throws FileNotFoundException, NullPointerException, IOException {
		if(m_Path == null){
			throw new NullPointerException("ASourceFile: m_Path was unexpectedly null");
		}

		if(m_FileContents == null){
			m_FileContents = new ArrayList<String>();
		}
		m_FileContents = (ArrayList<String>) Files.readAllLines(m_Path);	
	}

	/**
	 * Gets a defensive copy of the contents of this File
	 * @return A copy of the file content
	 */
	protected ArrayList<String> GetFileContents() {
		ArrayList<String> defensiveCopy = new ArrayList<String>(m_FileContents.size());
		defensiveCopy.addAll(m_FileContents);
		return defensiveCopy;
	}


	public abstract void ParseForClasses();

	public ArrayList<AClass> GetClasses(){
		return this.m_Classes;
	}
	public String getFilename(){
		return m_Path.getFileName().toString();

	}

	/**
	 * This function is a simple approach to count the  Lines of Code in a given source file, override it to get a more accurate result. 
	 * @return The number of Lines in a File
	 */
	public int GetLoC(){
		if(m_FileContents== null){
			throw new Error("File wasn't loaded yet!");
		}

		return m_FileContents.size();
	}
}
