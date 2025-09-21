package pattern;

public class Hollow_Alphabet_Left_Angled_Triangle {
	public static void main(String[] args) {
		hollow(5);
	}
	
	public static void hollow(int n) {
		char ch ='A';
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if (j == 1 || j == i || i == n){
                    System.out.print(ch + " ");
                }
                else {
                    System.out.print("  ");
                }
                ch++;
            }
            System.out.println();
        }
	}
}

//A 
//B C 
//D   F 
//G     J 
//K L M N O 
