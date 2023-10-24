package lsp;

import java.utli.Date;

public class Vegetable extends FoodProduct {
    @Override
    String getName(){
        return "Broccoli";
    }
    @Override
    Date getExpiredDate(){
        return new Date();
    }
}
