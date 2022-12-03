package us.salmansaeed.inheritance;

public class MalePerson extends Person {
	private String gender;
		
	public MalePerson(String gender, int eyes, int ears, int mouth) {
		super(eyes, ears, mouth);
		this.gender = gender;
	}



	/*@Override
	public String toString() {
		return "MalePerson [gender=" + gender + ", getGender()=" + getGender() + "] and Eyes, Ears and mouth are in number " + this.getEyes() + this.getEars() + this.getMouth();
	}*/
	
	



	public String getGender() {
		return gender;
	}



	@Override
	public String toString() {
		return "MalePerson [gender=" + gender + ", toString()=" + super.toString() + "]";
	}
	
}
