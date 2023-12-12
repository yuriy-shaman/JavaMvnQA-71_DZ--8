public class Main {

    public static void main(String[] args) {

        Post post = new Post();

        post.birthday = new FormDate();

        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.phone = "+7-903-667-22-50 ";
        post.passport = "1234 № 12345678";

    }
}
