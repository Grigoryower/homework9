public class Author {
    String name ;
    String surname;
   public Author(String name, String surname) {
       this.name = name;
       this.surname = surname;}
    //public  Author(String name, String surname) {
   //     Author author = new Author("Гарри", "Гаррисон");
   //     author.name = name;
    //   author.surname =surname;
   //     return author;

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
}
