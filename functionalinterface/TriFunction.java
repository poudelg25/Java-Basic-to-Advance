package functionalinterface;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);

    default void test(){
        System.out.println("This is a test method of TriFunction Functional Interface!");
    }
}
