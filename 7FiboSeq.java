import java.util.*;
public class FiboSeq {

	public static void main(String[] args) {

        int []s= {3,5,7,13,2,3,9};
        display(s);
    }
    static void display(int[]s){
        for(int i=0; i<s.length; i++){
            
            System.out.print("f("+ s[i] + ")"+ "\t");
            System.out.print(fibonacci (s[i]));
            System.out.print("\n");
        }
    }
    static int fibonacci( int position){
        if (position ==0){
            return 0;
    }
    if (position == 1){
        return 1;
}
    else{
        return fibonacci(position-1)+fibonacci(position-2);
        }

	}

}
