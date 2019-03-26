package Park;

public class SouvenirShop {

    private int actionFiguresStock;
    private double actionFigureCost;

    public SouvenirShop(int actionFiguresStock, double actionFigureCost){
        this.actionFiguresStock = actionFiguresStock;
        this.actionFigureCost = actionFigureCost;
    }

    public int getActionFiguresStock() {
        return actionFiguresStock;
    }

    public void setActionFiguresStock(int actionFiguresStock) {
        this.actionFiguresStock = actionFiguresStock;
    }

    public void makesSale(int sale, Visitor visitor){
        if (visitor.getMonies() >= (sale * this.actionFigureCost)){
            visitor.setMonies((visitor.getMonies())-(sale * this.actionFigureCost));
            this.actionFiguresStock -= sale;
        }
    }
}
