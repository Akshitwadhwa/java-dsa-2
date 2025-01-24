public class calculater {

    int add(int a , int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        calculater c=new calculater();
        int num1=5 , num2=6;
        int result=c.add(num1 , num2);
        System.out.println(result);

    }   
    }