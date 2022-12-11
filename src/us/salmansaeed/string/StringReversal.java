package us.salmansaeed.string;

public class StringReversal {

	private String ss = "Empty String";

	
	public StringReversal(String ss) {
		super();
		this.ss = ss;
	}


	
	public StringBuilder getSb() {
		StringBuilder sb=new StringBuilder(ss);     
		sb.reverse();
		return sb;
	}


 

}
