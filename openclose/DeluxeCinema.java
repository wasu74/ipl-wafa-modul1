public class DeluxeCinema extends Cinema{
    public DeluxeCinema(double price){
        this.price = price;
    }
    @Override
    Double calculateAdminfee(){
        return this.price * 20/100;
    }
}
