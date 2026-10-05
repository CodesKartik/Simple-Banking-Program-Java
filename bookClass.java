class book{
    String name;
    String auther;

    book(String name, String auther){
            this.name = name;
            this.auther = auther;
    }
    void displayProperties(){
        System.out.println("Name: " + name);
        System.out.println("Auther: " + auther);
    }

}
public class bookClass {
    public static void main(String[] args) {
        book book1 = new book("Mathematics sem  III ", "N.P BALI");
        book book2 = new book("Python programming", "Sunita arora");
        book1.displayProperties();
        book2.displayProperties();

    }
    
}
