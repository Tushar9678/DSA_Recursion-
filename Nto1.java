// print the numbers from  N to 1

public class Nto1{
    public static void main(String[] args){
       solution(5);

        
    }

    static void solution(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        solution(n-1);
    }
}