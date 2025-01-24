public class IncrementDecrementQuiz
{
    public static void main(String[] args) 
    {
        int i = 11;
        i = (i++) + (++i);
        System.out.println(i);


    }
    // in this code we have first assigned i as 11 then i++ indicates before increment which is 11
    //after this ++i indicates the incrmated value which would be 11 as i++ is incremented which comes out
    // to be 13.. so the answer becomes 11 + 13 which is 24
    

        
    }