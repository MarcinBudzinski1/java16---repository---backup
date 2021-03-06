package pl.mpas.advanced_programing2.generic;

public class GenericSecrets<T, U> {

    private T object1;
    private U object2;

    public GenericSecrets(T object1, U object2) {

        this.object1 = object1;
        this.object2 = object2;
    }

    public T getObject1() {
        return object1;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public U getObject2() {
        return object2;
    }

    public void setObject2(U object2) {
        this.object2 = object2;
    }
}
