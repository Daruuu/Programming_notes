package srcs;

public class main {

    public static void main(String[] av)
    {
        System.out.println("Main works");
        User user01 = new User();
        user01.setName("name01");
        user01.setAge(20);
        user01.printInfo();
    }
}
