class Bms extends Thread
{
    public void run()
    {
        try
        {
            while (true)
            {
                System.out.println("Bms college of engineering");
                Thread.sleep(10000);
            }
        }
            catch(InterruptedException e)
            {
                System.out.println("thread inturrupted");
            }
        
    }
}

class cseprinter extends Thread
{
    public void run()
    {
        try{
            while (true)
            {
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("thread interrupt");
        }
    }
}

public class Bmsprinter
{
    public static void main(String[]args)
    {
        Bms t1=new Bms();
        cseprinter t2=new cseprinter();
        t1.start();
        t2.start();
    }
}