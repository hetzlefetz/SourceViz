package language;

import java.util.ArrayList;

public interface IClassable {
	
	public abstract void ParseForClasses();
	public abstract ArrayList<String> GetClassNames();
	public abstract ArrayList<AClass> GetClassesInSourceFile();

}
