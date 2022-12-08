package us.salmansaeed.enums;

public class MainEnumClass {

	public static void main(String[] args) {

		EnumClass ec = EnumClass.SALMANSGPA;

		switch (ec) {
		case LEARNING:
			System.out.println("He is always learning");
			break;
		case SALMANSGPA:
			System.out.println("Always 4");
			break;
		default:
			break;

		}
	}
}