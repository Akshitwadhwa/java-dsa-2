public class forloop 

{
    // this is an example of nested loop
    public static void main(String[] args) 
    {
        int n = 5;
        for(int e=1;e<=5;e++)
        {
            for(int j=1;j<=e;j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}


