import java.sql.SQLOutput;

public abstract class mphone {
    public void call()
    {
        System.out.println("callong");
    }
    public abstract  void move();
    public abstract void dance();

}
class  rphone extends  mphone
{
    public void move();
    {
        System.out.println(" this  is movie ing");
    }

}
class  sphone extends  rphone
{
    public void dance()
    {
        System.out.println(" this  is modnce");
    }
    public void cooking()
    {
        System.out.println("this is the hshsuksuyskdhifhihfoihef78");
    }

}
