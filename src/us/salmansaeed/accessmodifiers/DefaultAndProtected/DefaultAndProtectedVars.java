package us.salmansaeed.accessmodifiers.DefaultAndProtected;

import us.salmansaeed.accessmodifiers.VariableTest;

public class DefaultAndProtectedVars extends VariableTest {
	public void SysoPublicAndProtected() {
		System.out.println(zProtected);
		/**Cannot access the default here
		 * 
		 */
		System.out.println(yPublic);
	}
}
