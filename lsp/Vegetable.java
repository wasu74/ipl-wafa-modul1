package lsp;

import java.utli.Date;

public class Vegetable extends Product {
    @Override
    String getName(){
        return "Broccoli";
    }
    @Override
    Date getExpiredDate(){
        return new Date();
    }
}
