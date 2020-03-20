public class MySweetProgram {
    public static void main(String[] args) {
        System.out.println("Hello" + args[0]);//needs to pass an argument to a program
        MySweetProgram x = new MySweetProgram(); // creating an object
        x.tacos();
    }
    
    public void tacos(){
        System.out.println("Tacos");
    }
}



String test = "asdf";
boolean result;
result = test instanceof String;
System.out.println(result);


String str1 = new String("One way of initializing a string");
String str2 = "Another way of initializing a string";
int x = 5; //primitive type
Integer y = 5; //class type - object (5 is autoboxed)

to be continued
