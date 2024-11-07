interface VendingMachine{
    public void insertCoin();
    public void  selectitem();


default void conectToserver(){
    System.out.println("Connected to server");
}
static String getShutdown(){
    return "Shutting down";
}

}
class  VendingMachineImpl implements VendingMachine{
    public void insertCoin(){
        System.out.println("Inserted coin");
    }
    public void selectitem(){
        System.out.println("Selected item");
    }
}




public class Main {
    public static void main(String[] args) {
VendingMachineImpl v = new VendingMachineImpl();
v.insertCoin();
v.selectitem();
v.conectToserver();
VendingMachine.getShutdown();



    }
}