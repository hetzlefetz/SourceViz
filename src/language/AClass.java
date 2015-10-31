package language;

import java.util.ArrayList;

public abstract class AClass {
	
	private String m_SourceFileName;
	private String m_ClassDefinition;
	private String m_ClassName;
	private ArrayList<AFunction> m_Fuctions;
	private ArrayList<AVariable> m_MemberVariables;
	private ArrayList<AEnum> m_Enums;
	
	public AClass(String s){
		this.m_ClassDefinition = s;
	}

	public void SetClassName(String s){
		this.m_ClassName = s;
	}

	public String GetClassName(){
		return this.m_ClassName;
	}
	public void SetSourceFileName(String s){
		this.m_SourceFileName= s;
	}
	

}
