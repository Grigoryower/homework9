public class Book {
    String name;
    int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;}
    //public  Book(String name, int age) {
     //  Book book = new Book("Неукротимая планета", 1960);
      //  book.name = name;
      //  book.age = age;
       // return book;}
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //

}
