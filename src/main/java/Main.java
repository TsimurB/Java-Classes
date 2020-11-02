import java.util.Collections;
import java.util.Comparator;

public class Main {

    static Comparator<Customer> familyName = new Comparator<Customer>() {

        public int compare(Customer o1, Customer o2) {
            return o1.familyName.compareTo(o2.familyName);
        }
    };

    public static void main(String[] args) {

        CustomerArray customers;
        customers = new CustomerArray();

        customers.add(new Customer("Борисов","Борис","Борисович","Минск",1111,"987654321"));
        customers.add(new Customer("Васильев","Василий ","Васильевич","Брест",2222,"987654321"));
        customers.add(new Customer("Григорьев","Григорий","Григорьевич","Витебск",3333,"987654321"));
        customers.add(new Customer("Иванов","Иван","Иванович","Гомель",4444,"987654321"));
        customers.add(new Customer("Петров","Петр","Петрович","Гродно",5555,"987654321"));
        customers.add(new Customer("Сергеев","Сергей ","Сергеевич","Могилев",6666,"987654321"));

        CustomerArray costumersSelected = new CustomerArray();

        costumersSelected = customers.selectByName("Григорий");
        costumersSelected.CostumersPrintOut();
        System.out.println();

        Collections.sort(customers,familyName);
        customers.CostumersPrintOut();
        System.out.println();

        int startPos = 1500,finPos = 3500;
        for (int i = 0; i <= customers.size()-1;i++){
            Customer costumer = (Customer) customers.get(i);
            if(costumer.getCard() >= startPos && costumer.getCard() <= finPos) costumer.toString(costumer);
        }
    }}
