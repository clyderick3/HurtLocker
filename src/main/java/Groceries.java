public class Groceries {

    private String name;
    private float price;
    private String type;
    private String expirationDate;

    public Groceries(String name, float price, String type, String expirationDate){
        this.name = name;
        this.price = price;
        this.type = type;
        this.expirationDate = expirationDate;

    }

    public String getName(){
        return name;
    }

    public float getPrice(){
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

    public void setPrice(float price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
