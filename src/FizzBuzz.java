public class FizzBuzz 
{
    public static void main(String[] args) throws Exception 
    {
        for(int count = 1; count <= 100; count ++)
        {
            
            if (count % 3 == 0) 
            {
                if (count % 5 == 0) 
                {
                    System.out.println("FizzBuzz");
                    continue;
                }
                System.out.println("Fizz");
            }
            else if(count % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(count);
            }
        }
    }
}
