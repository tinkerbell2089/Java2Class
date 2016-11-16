import java.util.Random;
import java.util.Stack;

public class Pancakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Character> contestant1 = new Stack<Character>();
		Stack<Character> contestant2 = new Stack<Character>();
		
		contestant1.push('1');
		contestant1.push('2');
		contestant1.push('3');
		contestant2.push('P');
		contestant2.push('P');
		contestant2.push('P');
		
		Random prob = new Random();
		int value = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		
		System.out.println(value);
		
		for(int i=0; i<6;i++){
			value = prob.nextInt(10);
			System.out.println(value);
			
		
		
		if (value < 3){	
				if(contestant1.isEmpty() == false){
					contestant1.pop();
				cnt1++;
			}
		}
		
		if(value < 4){											
			if(contestant2.isEmpty() == false){
				contestant2.pop();
				cnt2++;
			}	
			
			System.out.println(cnt1 + " " + cnt2);
		}
		
	}
			if(contestant1.size() <contestant2.size()) {
				contestant1.push('P');
			}
		
		
		
		//char peeked = contestant1.peek();
		//System.out.println(peeked);
		//char popped = contestant1.pop();
		//System.out.println(popped);
		print(contestant1);
	
	}

	public static void print(Stack<Character> a){
		
		for(int i = 0; i<a.size();i++){
			System.out.print(a.get(i));
		}
	}
}


 