
public class SamplePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1.  PRogramm for dec to binary conv
		decToBinary(8);
	}
	
	
	/*
	 * Java Doc
	 * Convert DEC to binary
	 */
	static void decToBinary(int n) 
    { 
        // array to store binary number 
        int[] binaryNum = new int[1000]; 
   
        // counter for binary array 
        int i = 0; 
        while (n > 0)  
        { 
            // storing remainder in binary array 
            binaryNum[i] = n % 2; // Module by 2 is either 0 or 1 - Starts from least index (1,2,4,8) 
            n = n / 2; 
            i++; 
        } 
   
        // printing binary array in reverse order 
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]); //Printing should be displayed index position : (8,4,2,1)
             } 
            //i.e : for 8 - 1000
}
