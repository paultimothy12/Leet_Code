import java.util.HashMap;
public class isomorphicstring {
public static boolean isisomorphic(String s, String t) {
	HashMap<Character,Character> h1 =new HashMap<>();
	HashMap<Character,Character> h2 =new HashMap<>();
	for(int i=0;i<s.length();i++) {
		char F=s.charAt(i);//b
		char L=t.charAt(i);//b
		
	if(h1.containsKey(F)/*b*/ && h1.get(F)!=L || h2.containsKey(L) && h2.get(L)!=F) 
		return false;
		h1.put(F,L);
		h2.put(L,F);	
	}
	return true;
	}
	

	public static void main(String args[]) {
		System.out.println(isisomorphic("bell","burr"));
		System.out.println(isisomorphic("zackcz","backcb"));
		}
}
