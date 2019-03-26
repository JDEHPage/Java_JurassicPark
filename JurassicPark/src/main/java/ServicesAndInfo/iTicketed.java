package ServicesAndInfo;

import Park.Visitor;

public interface iTicketed {

   public double defaultPrice();
   public double priceFor(Visitor visitor);
}
