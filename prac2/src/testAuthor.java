public class testAuthor {
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        Author TestAuthor = new Author("Test", "Test@test.ru", 'h');
        System.out.println(TestAuthor.toString());
        TestAuthor.setEmail("anotherTest@test.ru");
        TestAuthor.setGender('p');
        System.out.println(TestAuthor.getEmail());
        System.out.println(TestAuthor.getName());
        System.out.println(TestAuthor.toString());

    }

}