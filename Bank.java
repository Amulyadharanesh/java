public class Bank {
    public static void main(String[] args) {
        String str = "StateBankOfIndia";

        if (str != null) {
            char[] charArray = str.toCharArray();
            System.out.println(charArray);

            for (int i = charArray.length - 1; i >= 0; i--) {//reverse printing of str
                System.out.println(charArray[i]);
            }
			
			Bank bank = new Bank();
            int occurrenceCount = bank.countOccurrence(charArray, 'i');
            System.out.println("Occurrences of 'i': " + occurrenceCount);
        }
	}
	

    public int countOccurrence(char[] charArray, char ch){ 
        int count = 0;
		if(charArray != null){
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ch) {//checking the occurence,if its true, it increment to 1 nd gobacks to count=1
                count++;
            }
        }
		}
		
        return count;
		}
    }



		
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		