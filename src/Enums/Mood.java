package Enums;

public enum Mood {
    SAD("Грустное"),
    NORMAL("Нормальное"),
    HAPPY("Счастливое"),
    GOOD("Хорошее");
        private String code;
    Mood(String code) {
        this.code=code;
    }

    @Override
    public String toString() {
        return code;
    }
}
