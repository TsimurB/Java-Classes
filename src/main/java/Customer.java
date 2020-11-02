public class Customer {

    static private int lastId = 0;

    private int id;
    public String familyName;
    public String name;
    private String secondName;

    private String address;

    private int card;
    private String account;

    public Customer(){
        lastId++;
        this.id = lastId;
    }

    public Customer(String familyName, String name, String secondName, String address){
        this.familyName = familyName;
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        lastId++;
        this.id = lastId;
    }

    public Customer(String familyName, String name, String secondName, String address, int card, String account){
        this.familyName = familyName;
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.card = card;
        this.account = account;
        lastId++;
        this.id = lastId;
    }

    public void setFamilyName(String familyName){
        this.familyName = familyName;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setCard(int card){
        this.card = card;
    }

    public void setAccount(String account){
        this.account = account;
    }

    public String getFamilyName(){
        return this.familyName;
    }
    public String getName(){
        return this.name;
    }
    public String getSecondName(){
        return this.secondName;
    }
    public int getCard(){
        return this.card;
    }
    public String getAccount(){
        return this.account;
    }

    public String getAddress() {
        return this.address;
    }


    public void toString(Customer customer){

        System.out.println(this.id + " " + "Costumer: " + this.familyName + " " + this.name + " " + this.secondName + "; Adress: " + this.address + "; Card:" + this.card + "; Account:" + this.account);

    }

}
