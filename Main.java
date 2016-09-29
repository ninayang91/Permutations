import java.util.ArrayList;
import java.util.Hashtable;

public class Main {
	
	public static void main(String[] args){
		String s="abc";
		System.out.println(s.substring(0,1));
		System.out.println(permutation("abc"));
	}
	
	public static ArrayList<String> permutation(String s){
		ArrayList<String> al=new ArrayList<String>();
		if(s==null) return null;
		if(s.length()==0){
			al.add("");
			return al;
		}
		
		char first=s.charAt(0);
		String remainder=s.substring(1);
		ArrayList<String> words=permutation(remainder);
		for(String word:words){
			for(int j=0;j<=word.length();j++){
				String temp=word.substring(0, j)+first+word.substring(j);
				al.add(temp);
			}
		}

		return al;
		
	}

}
