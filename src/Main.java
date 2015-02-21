import java.util.HashMap;
import java.util.Hashtable;


public class Main {
	public static void main(String [] args){
		
		Hashtable<String,Integer> ht = new Hashtable<String, Integer>();
				
		String stuName1 = "a";
		int grade1 = 100;
		
		String stuName2 = "b";
		int grade2 = 90;
		
		String stuName3 = "c";
		int grade3 = 80;
		
		String stuName4 = "d";
		int grade4 = 70;
		
		ht.put(stuName1, grade1);
		ht.put(stuName2, grade2);
		ht.put(stuName3, grade3);
		ht.put(stuName4, grade4);
		
		for(String str:ht.keySet()){
			System.out.print("name = "+str+" grade = "+ht.get(str));
			System.out.println();
		}
		
		System.out.println(checkFirstNotDuplicate("abcdefgabbcdf"));
		
		
	}
	
	public static char checkFirstNotDuplicate(String str){
		
		char[] charArray = str.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0;i<charArray.length;i++){
			if(hm.containsKey(charArray[i])){
				hm.put(charArray[i], (Integer)( hm.get(charArray[i])+1));
			}
			else{
				hm.put(charArray[i], 1);
			}
		}
		
		char result = ' ';
		
		for(int i=0;i<charArray.length;i++){
			if(hm.get(charArray[i]) == 1){
				result = charArray[i];
				break;
			}
		}
		
		return result;
		
		
		
	}
	
	
}
