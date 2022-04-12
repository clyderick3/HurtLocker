public class Groceries {

    private String name;
    private double price;
    private String type;
    private String expirationDate;

    public Groceries(String name, double price, String type, String expirationDate){
        this.name = name;
        this.price = price;
        this.type = type;
        this.expirationDate = expirationDate;

    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getType(){
        return type;
    }

    public String getExpirationDate(){
        return expirationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isNull(){
        if (name.equals("") | type.equals("") | expirationDate.equals("")){
            return true;
        }
        return false;
    }
}
