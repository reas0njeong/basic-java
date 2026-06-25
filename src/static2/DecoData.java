package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void StaticCall() {
        staticValue++;
        staticMethod();
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    public void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    public static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
