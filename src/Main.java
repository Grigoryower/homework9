public class Main {

    public static void main(String[] args) {
        Author author = new Author("Гарри", "Гаррисон");
        System.out.println("Имя автора - " + author.getName());
        System.out.println("Фамилия автора - " + author.getSurname());


        Book deathworld  = new Book(" Неукротимая планета", 1960, author);
        System.out.println("Название книги - " + deathworld.getName());
        System.out.println("Дата издания книги - " + deathworld.getAge());
        deathworld.setAge(1962);
        System.out.println("Дата издания книги - " + deathworld.getAge());
        //
    }
}