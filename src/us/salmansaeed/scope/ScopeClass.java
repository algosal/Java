package us.salmansaeed.scope;

public class ScopeClass {
	
        public static void main(String[] args)
            {
                 int number;
                //Begining of inner block
                {
                    int number2 = 75;
                    number = 56;
                    System.out.println("Number: "+number);
                }
                //End of inner block
         
                //Compile time Error 
                //   number2 = 2;
        }
}
