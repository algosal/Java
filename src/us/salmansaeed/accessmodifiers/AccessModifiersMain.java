package us.salmansaeed.accessmodifiers;
import java.util.concurrent.ArrayBlockingQueue;

import us.salmansaeed.accessmodifiers.DefaultAndProtected.DefaultAndProtectedVars;

public class AccessModifiersMain 	{

	public static void main(String[] args) {
		new VariableTest().callingPrivateAndDefault();
		new DefaultAndProtectedVars().SysoPublicAndProtected();
		
	}
	
}
