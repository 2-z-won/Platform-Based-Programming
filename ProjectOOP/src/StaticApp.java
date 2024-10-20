class Foo{
    public static String classVar = "i am class var";
    public String instanceVar = "i am instance var";
    public static void classMethod() {
        System.out.println(classVar);
        //System.out.println(instanceVar);
    }
    public void instanceMethod(){
        System.out.println(classVar);
        System.out.println(instanceVar);
    }
}

public class StaticApp{
    public static void main(String[] args){
        System.out.println(Foo.classVar);
//        System.out.println(Foo.instanceVar);
        Foo.classMethod();
//        Foo.instanceMethod();
        Foo f1 = new Foo();
    }
}
