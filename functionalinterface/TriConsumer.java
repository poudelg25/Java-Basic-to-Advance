package functionalinterface;

@FunctionalInterface
public interface TriConsumer<T, U, V>{
    void accept(T t, U u, V v);

    default void test(){
        System.out.println("This is a test method of TriConsumer functional interface");
    }
}
