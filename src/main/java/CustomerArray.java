import java.util.ArrayList;

public class CustomerArray extends ArrayList {
    public CustomerArray selectByName(String name){

        CustomerArray result = new CustomerArray();

        for(int i=0;i <= this.size()-1;i++){

            Customer customer = (Customer) this.get(i);
            if (customer.getName() == name){
                result.add(customer);
            }
        }
        return result;
    }

    public void CostumersPrintOut(){
        for(int i=0;i <= this.size()-1;i++){
            Customer customer = (Customer) this.get(i);
            customer.toString(customer);
        }

    }

}
