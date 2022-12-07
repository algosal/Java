package us.salmansaeed.accessmodifiers;

public class VariableTest {
	private String xPrivate = "Private Var";
	public String yPublic = "Public Var";
	protected String zProtected = "Protected Var";
	String aDefault = "Default Var";
	
	public void callingPrivateAndDefault() {
		System.out.println(xPrivate);
		System.out.println(aDefault);
	}

}
