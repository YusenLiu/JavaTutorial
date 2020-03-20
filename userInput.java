public class MySweetProgram {
    public static void main(String[] args) {
        System.out.println("What is your name:");
        //type identifier = new type();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello "+name);
    }
}
