package language.csharp;

import java.util.ArrayList;

import language.AClass;
import language.AnAccesModifier;
import language.IAccessModifieable;

public class CSharpClass extends AClass implements IAccessModifieable {

	private ArrayList<AnAccesModifier> m_AccessModifiers;
	
	public CSharpClass(String s) {
		super(s);
		m_AccessModifiers = ParseForAccessModifiers();
		
	}

	

	@Override
	public ArrayList<AnAccesModifier> ParseForAccessModifiers() {
		// TODO Auto-generated method stub
		return null;
	}
}
