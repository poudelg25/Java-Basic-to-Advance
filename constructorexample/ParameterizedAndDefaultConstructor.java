package constructorexample;

public class ParameterizedAndDefaultConstructor {
        String name;

        public ParameterizedAndDefaultConstructor(String name){
            this.name=name;
        }

        public ParameterizedAndDefaultConstructor(){

        }

        public static void main(String[] args){
            ParameterizedAndDefaultConstructor parameterizedAndDefaultConstructor = new ParameterizedAndDefaultConstructor("Ram");
            System.out.println(parameterizedAndDefaultConstructor.name);

            ParameterizedAndDefaultConstructor parameterizedAndDefaultConstructor1= new ParameterizedAndDefaultConstructor();
            System.out.println(parameterizedAndDefaultConstructor1.name);
        }
}
