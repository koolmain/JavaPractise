@FunctionalInterface
public interface Baz {
    String method();

    default String defaultCommon(){
        return "defaultCommon";
    }
}
