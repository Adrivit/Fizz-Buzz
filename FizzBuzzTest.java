import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest
{
    
    @Test
    public void Three_is_fizz()
    {
        FizzBuzz obj=new FizzBuzz();
        String a=obj.fizzbuzzstring(3);
        assertEquals("Fizz",a);
    }

    @Test
    public void thirtynine_is_fizz()
    {
        FizzBuzz obj=new FizzBuzz();
        String a=obj.fizzbuzzstring(39);
        assertEquals("Fizz",a);
    }

    @Test
    public void five_is_buzz()
    {
        FizzBuzz obj=new FizzBuzz();
        String a=obj.fizzbuzzstring(5);
        assertEquals("Buzz",a);
    }

    @Test
    public void fifteen_is_buzz()
    {
        FizzBuzz obj=new FizzBuzz();
        String a=obj.fizzbuzzstring(15);
        assertEquals("FizzBuzz",a);
    }

    @Test
    public void ninety_is_fizzbuzz()
    {
        FizzBuzz obj=new FizzBuzz();
        String a=obj.fizzbuzzstring(90);
        assertEquals("FizzBuzz",a);
    }

    @Test
    public void thirteen_is_fizz()
    {
        FizzBuzz obj=new FizzBuzz();
        String a=obj.fizzbuzzstring(13);
        assertEquals("Fizz",a);
    }

    @Test
    public void fiftyone_is_fizz()
    {
        FizzBuzz obj=new FizzBuzz();
        String a=obj.fizzbuzzstring(51);
        assertEquals("Fizz",a);
    }

    @Test
    public void thirtyfive_is_fizz()
    {
        FizzBuzz obj=new FizzBuzz();
        String a=obj.fizzbuzzstring(35);
        assertEquals("Fizz",a);
    }

    @Test
    public void fiftythree_is_Fizz()
    {
        FizzBuzz obj=new FizzBuzz();
        String a=obj.fizzbuzzstring(35);
        assertEquals("Fizz",a);
    }

    @Test
    public void range_one_to_ten()
    {
        List<String> actual = new ArrayList<String>();
        List<String> caselist = new ArrayList<String>();
        FizzBuzz obj=new FizzBuzz();

        actual = obj.fizzbuzzrange(1,10);
        caselist = obj.list();
        List<String> sublist = caselist.subList(1,11);
        assertEquals(sublist,actual);

    }

    @Test
    public void range_seven_to_twentythree()
    {
        List<String> actual = new ArrayList<String>();
        List<String> caselist = new ArrayList<String>();
        FizzBuzz obj=new FizzBuzz();

        actual = obj.fizzbuzzrange(7,23);
        caselist = obj.list();
        List<String> sublist = caselist.subList(7,24);
        assertEquals(sublist,actual);

    }

    @Test
    public void range_eighty_to_hundred()
    {
        List<String> actual = new ArrayList<String>();
        List<String> caselist = new ArrayList<String>();
        FizzBuzz obj=new FizzBuzz();

        actual = obj.fizzbuzzrange(80,99);
        caselist = obj.list();
        List<String> sublist = caselist.subList(80,100);
        assertEquals(sublist,actual);

    }

    @Test
    public void hundred_is_buzz()
    {
        FizzBuzz obj=new FizzBuzz();
        String a=obj.fizzbuzzstring(100);
        assertEquals("Buzz",a);
    }


    @Test
    public void full_list_check()
    {
        List<String> actual = new ArrayList<String>();
        List<String> caselist = new ArrayList<String>();

        FizzBuzz obj=new FizzBuzz();

        actual=obj.fizzbuzzrange(0,99);
        caselist=obj.list();
        assertEquals(caselist,actual);
    }

}
