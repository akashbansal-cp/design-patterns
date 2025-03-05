package DesignPatterns.CreationalPatterns.SingletonPattern;

public class BillPugh {

    private BillPugh(){};

    public BillPugh getInstance(){
        return InnerBillPugh.instance;
    }

    private static class InnerBillPugh {

        private static final BillPugh instance = new BillPugh();

    }
}
