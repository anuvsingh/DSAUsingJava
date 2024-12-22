class X{
    public void methodX(){
        System.out.println("Class X Method.");
    }
}
class Y extends X{
    public void methodY(){
        System.out.println("Class Y Method.");
    }
}
class Z extends Y{
    public void methodZ(){
        System.out.println("Class Z Method.");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Z obj = new Z();
        obj.methodX();
        obj.methodY();
        obj.methodZ();
    }
}