@FunctionalInterface
public interface Bar {
    String implement();
    default String defaulBar(){
        return "default Bar";
    }

    default String defaultCommon(){
        return "defaultCommon";
    }
}


