public class Visitor {

    private int age, height;
    private double money;

    public int getAge() {
        return age;
    }

    public Visitor(int age, int height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getMoney() {
        return money;
    }

    public void addFunds(double amount) {
        this.money += amount;
    }

    public void pay(double amount) {
        this.money -= amount;
    }

}
