package businesslogic;

import motherclass.FlowOpen;
import products.Brand;

public class BusinessLogic extends FlowOpen {

    public BusinessLogic(String name, String description, String[] contact, String address, Brand brand) {
        super(name, description, contact, address, brand);
    }

    public double calculateIva(){
        int iva = 22;
        double price = 0;
        double calcIva = (price*iva)/100;
        return calcIva;
    }
    void calculatePassive(){}
    void calculateActive(){}

}
