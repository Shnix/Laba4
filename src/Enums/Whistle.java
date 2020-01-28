package Enums;

public enum Whistle {
    SECRETLY("Секретно"),
    SUPERSECRETLY("Суперсекретно"),
    ORDINARY("Обычно");

    private String code;

    Whistle(String code) {
        this.code=code;
    }

    @Override
    public String toString() {
        return code;
    }
}
