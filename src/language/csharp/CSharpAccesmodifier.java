package language.csharp;

import language.AnAccesModifier;



public class CSharpAccesmodifier extends AnAccesModifier{

	
	CSharpAccessModifiers m_Value;
	
	public CSharpAccesmodifier (CSharpAccessModifiers aModifier){
		this.m_Value = aModifier;
	}
	
	@Override
	public String toString(){
		// remove the leading underscore because the names public private etc are reserved
		return this.m_Value.toString().substring(1);
	}
	
	
}
