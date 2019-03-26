package Park;

import Attractions.*;
import ServicesAndInfo.*;

import java.util.ArrayList;

public class IslaNublar implements iTicketed, iSecurity{

    private double defaultPrice;

    public IslaNublar(double defaultPrice){
        this.defaultPrice = defaultPrice;
    }


    public double defaultPrice(){
        return this.defaultPrice;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getAge() < 10){
            return this.defaultPrice/2;
        } else {
            return this.defaultPrice;
        }
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getStatus() && visitor.getMonies() < 10000){
            return false;
//        } else if (visitor.getStatus() && visitor.getMonies() < 10000){
//            return false;
        } else if (visitor.getAge() > 6 && visitor.getMonies() > this.priceFor(visitor)) {
            return true;
        }
        return false;
    }


}
