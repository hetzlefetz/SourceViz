package language.csharp.Types;

import language.AType;

public class CSharpBoolean extends AType{

	
	public CSharpBoolean(){
		m_Type = BaseType.Logic;
		m_Name = "Boolean";
		m_Builtin = true;
	}

	@Override
	public String GetDescription() {

		return "Boolean represent a logical value of either true or false, if instanciated nullable it might be null";
	}

}
