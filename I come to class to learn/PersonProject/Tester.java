public class Tester
{
    public static void main(String[] args)
    {
            TelephoneNumber tel1=new TelephoneNumber(415,3770128);
            Person per1=new Person("Jacob",tel1);
        
            System.out.println(per1.getTelephoneNumber().getAreaCode());
        
            System.out.println(per1.getTelephoneNumber());
        
            Person per2=new Person("Ethan",tel1);
        
            System.out.println(per1.checkAreaCode(per2));
        
            int x = 10;
            System.out.println("Before calling change: " + x + " " + per1.getName() + " " + per2.getName());
            change(x,per1, per2);
            System.out.println("After calling change: " + x + " " + per1.getName() + " " +  per2.getName());

    

    }

    public static void change(int n, Person p, Person q)
    {
      n = 5;
      p.setName("Joe");
      q = new Person("Eve", new TelephoneNumber(415,4444444));

    }
        
}