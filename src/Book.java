public class Book {
    private Author author;
   private String name;
    int age;

    public Book (String name, int age, Author author) {
        this.name = name;
        this.age = age;
        this.author = author;}
    // public Author getAuthor() {
    //   return this.author;
   //  }

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
