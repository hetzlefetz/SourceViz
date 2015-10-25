package helpers;

public class NotImplementedException extends Exception {

	private String m_FunctionName;
	
	public NotImplementedException(String aFunctionName) {
	this.m_FunctionName = aFunctionName;
	}
		
	@Override
	public String getMessage() {
		
		return String.format("Sorry, {0} wasnt implemented yet!", m_FunctionName); 
	}
	
}
