package us.salmansaeed.collections;

public class Generics<N> {

		private N n;
		
		public String myNFunc(N n) {
			this.n = n; 
			return " THIS " + this.n + " IS COMING FROM A GENERIC CLASS";
		}
	
}
