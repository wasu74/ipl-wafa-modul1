public class CinemaCalculations {
    public Double calculateAdminFee(Cinema cinema){
        if(cinema instanceof StandarCinema) {
            return ((StandarCinema) Cinema).price * 10/100;
        }
        else if(cinema instanceof DeluxeCinema) {
            return ((StandarCinema) Cinema).price * 12/100;
        }
        else if(cinema instanceof PremiumCinema) {
            return ((StandarCinema) Cinema).price * 20/100;
        } else { 
            return 0.0;    
        }
    }
}
