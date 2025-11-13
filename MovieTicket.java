public class MovieTicket {
    static String theaterName="Laxmi";
    final double GST=0.18;
    String movieName;
    double price;

    MovieTicket(String movieName,double price){
        this.movieName=movieName;
        this.price=price;
    }

    double totalPrice(){
        return price+(price*GST);
    }
    
    void displayTicket(){
        System.out.println("Movie Ticket:");
        System.out.println("Theater Name:"+theaterName);
        System.out.println("Movie Name:"+movieName);
        System.out.println("price:"+price);
        System.out.println("Total price:"+totalPrice());
    }
    public static void main(String[] args){
        MovieTicket ticket1=new MovieTicket("kranti",250);
        MovieTicket ticket2=new MovieTicket("ranna",300);

        ticket1.displayTicket();
        ticket2.displayTicket();

        MovieTicket.theaterName="Galaxy";

        ticket1.displayTicket();
        ticket2.displayTicket();
    } 
}
