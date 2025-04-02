package functionalinterface;

public interface TriPredicate <T, U, V>{
    boolean test(T t, U u, V v);

    default void test(){
        System.out.println("This is a test method of TriPredicate Functional Interface!");
    }
}
