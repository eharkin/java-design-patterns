package main.patterns.creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
