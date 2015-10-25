package language;

public abstract class AType {

	/**
	 * Base type of a Variable, 
	 * Possible Values are:
	 * - Numeric : for values representing countable types
	 * - String : for values representing types consisting of one ore more character like type
	 * - Logic : for values representing a logical value
	 * - UserDefined : for values representing a value not native to the language 
	 * @author knechtrootrecht
	 */
	public enum BaseType
	{
		Numeric,
		String,
		Logic,
		UserDefined,
	}
	
	protected boolean m_Builtin;
	protected String m_Name;
	protected BaseType m_Type;
	
	public abstract String GetDescription();
	
	
	
	public String GetName(){
		return m_Name;
	}
	public void SetName(String aName){
		this.m_Name = aName;
	}
}
