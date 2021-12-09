public class Produkte {
    private String id;
    private String name;
    private double money;
    private String type;

    public Produkte() {
    }

    public Produkte(String id, String name, double money, String type) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.type = type;
    }

    public Produkte(String id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId(){
        return id;
    }
    public void  setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getMoney(double money) {
        return money;
    }
    public void setMoney(double money){
        this.money = money;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return "Produkte{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", type='" + type + '\'' +
                '}';
    }
}
