public class VendingMachineClient {


    public static void main(String[] args){
        VendingMachine vm = new VendingMachineImpl();
        vm.pay(Note.ONE);
    }
}
