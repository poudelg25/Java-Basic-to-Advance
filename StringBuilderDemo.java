public class StringBuilderDemo {
    public static void main(String[] args){

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.capacity());

        StringBuilder stringBuilder2 = new StringBuilder(45);
        System.out.println(stringBuilder2.capacity());

        StringBuilder stringBuilder3 = new StringBuilder("Hello");
        System.out.println(stringBuilder3);
        System.out.println(stringBuilder3.hashCode());
        System.out.println(stringBuilder3.capacity());

        stringBuilder3.append(" World!");
        System.out.println(stringBuilder3);
        System.out.println(stringBuilder3.hashCode());
        System.out.println(stringBuilder3.capacity());

        stringBuilder3.insert(5, "New8888888");
        System.out.println(stringBuilder3);
        System.out.println(stringBuilder3.hashCode());
        System.out.println(stringBuilder3.capacity());


        stringBuilder3.delete(2, 14);
        System.out.println(stringBuilder3);
        System.out.println(stringBuilder3.hashCode());
        System.out.println(stringBuilder3.capacity());
    }
}
