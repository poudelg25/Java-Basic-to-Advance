package constructorexample;

public class ParameterizedConstructor {
    String name;

    public ParameterizedConstructor(String name){
        this.name=name;
    }

    public ParameterizedConstructor(){

    }

    public static void main(String[] args){
        ParameterizedConstructor defaultConstructorInvisible = new ParameterizedConstructor("Ram");
        System.out.println(defaultConstructorInvisible.name);

        ParameterizedConstructor defaultConstructorInvisible1= new ParameterizedConstructor();
        System.out.println(defaultConstructorInvisible1.name);
    }
}
