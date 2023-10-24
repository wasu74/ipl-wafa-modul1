public class Main {
    public static void main(String[] args){
        StandardCinema standardCinema = new StandarCinema(price:100);
        Double adminFee = standardCinema.calculateAdminFee();
        System.out.println(adminFee);
    }
}
