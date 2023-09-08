public class SeparateClass {
    public static void main(String[] args){
        String author1;
        Author author = new Author("Гарри", "Гаррисон");
        System.out.println("Имя автора - " + author.getName());
        System.out.println("Фамилия автора - " + author.getSurname());

        String book1;
        Book steelRat  = new Book(" Cтальная крыса", 1961);
        System.out.println("Название книги - " + steelRat.getName());
        System.out.println("Дата издания книги - " + steelRat.getAge());
        steelRat.setAge(1965);
        System.out.println("Дата издания книги - " + steelRat.getAge());

        String author2;
        author = new Author("Андрэ", "Нортон");
        System.out.println("Имя автора - " + author.getName());
        System.out.println("Фамилия автора - " + author.getSurname());

        String book2;
        Book QueenOfTheSun  = new Book(" Королева Солнца ", 1957);
        System.out.println("Название книги - " + QueenOfTheSun.getName());
        System.out.println("Дата издания книги - " + QueenOfTheSun.getAge());
        QueenOfTheSun.setAge(1965);
        System.out.println("Дата издания книги - " + QueenOfTheSun.getAge());

    }
}
