package ru.job4j.condition;

public class Dummybot {

    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот".equals(question)) {

            rsl = "Привет, умник.";
        } else if (question.equals("Пока.")) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = Dummybot.answer("Привет, Бот.");
        System.out.println(rsl);
        rsl = Dummybot.answer("Пока.");
        System.out.println(rsl);
    }
}