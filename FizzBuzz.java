/* 
NOTE: There is a very big conflict in the question. There is a new stage 2 requirement which says,
1. A number is fizz if it is divisible by 3 or if it has a 3 in it
2. A number is buzz if it is divisible by 5 or if it has a 5 in it

But it is very much conflicting in two cases
 1. The 35 and 53 both has 3 and 5 in it but no activity was given for this situation.
 2. The numbers 51 and 57, both are divisible by 3 and also contains 5 in it. It is very much conflicting situation.
*/


import java.util.*;
import org.junit.Test;

public class FizzBuzz
{
    List<String> numbers;
    @Test
    public List<String> list()
    {
        List<String> numbers = new ArrayList<String>();
        for(int i=1;i<=100;i++)
        {
            if(i%3==0)
            {
                if(i%5==0)
                numbers.add("FizzBuzz");
                else numbers.add("Fizz");
            }
            else if(isDigitPresent(i,3))
            numbers.add("Fizz");
            else if(i%5==0 || isDigitPresent(i,5))
            numbers.add("Buzz");
            else if(isDigitPresent(i,3))
            numbers.add("Fizz");
            else
            numbers.add(Integer.toString(i));
        }

        for(int i=0;i<numbers.size();i++)
        {
           System.out.println(numbers.get(i));
        }
        return numbers;
    }

    //fizzbuzzrange() takes a range as input and returns the elememts present between the range in the list
    @Test
    public List<String> fizzbuzzrange(int x, int y)
    {
        FizzBuzz obj=new FizzBuzz();
        numbers=obj.list();
        List<String> sublist = numbers.subList(x,y+1);
        return sublist;
    }

    // fizzbuzzstring() takes a index value of the list and returns the element present in that location
    @Test
    public String fizzbuzzstring(int x)
    {
        FizzBuzz obj=new FizzBuzz();
        numbers=obj.list();
        return numbers.get(x-1);
    }

    // isDigitPresent() determines whether a digit is present in a number or not and returns true or false
    @Test
    static boolean isDigitPresent(int a, int d)
    {
        while (a > 0) 
        { 
            if (a % 10 == d) 
            break; 
            a = a / 10; 
        } 
        return a>0;
    }
}    
