class Hello{
public static void main(String[] args){
String name = System.getenv("USERNAME_VAN");
if(name !=null){
System.out.println("Hello" + " " + name);
} else {
System.out.println("Environment varuiable not set !");
}
}
}