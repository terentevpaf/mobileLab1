package com.example.paf.lab1;

public class numberClass {

    private String number999(int num, boolean padej)
    {
        StringBuilder bul = new StringBuilder();
        if (num / 100 > 0)
        {
            bul.append(number9(num / 100));
            bul.append(" ");
        }
        num = num % 100;
        if ((10 <= num) && (num <= 19))
        {
            bul.append(number10_19(num));
            return bul.toString();
        }
        if (num / 10 > 0)
        {
            bul.append(number2_9(num / 10));
            bul.append(" ");
        }
        num = num % 10;
        if (num > 0) {
            bul.append(numberDo9(num, padej));
        }
        return bul.toString().trim();
    }

    public String numberPerevod(int num)
    {
        if ((num < 1) || (num > 1000000)) throw new IllegalArgumentException("Ошибка " + num + " здесь\n");
        if (num == 1000000) return "миллион";
        StringBuilder bul = new StringBuilder();
        if (num / 1000 > 0)
        {
            bul.append(number999(num / 1000, true));
            bul.append(" ");
            bul.append(number1000(num / 1000));
            bul.append(" ");
        }
        num = num % 1000;
        if (num > 0) bul.append(number999(num, false));
        return bul.toString().trim();
    }

    private String number1000(int num)
    {
        if ((num < 1) || (num > 999)) throw new IllegalArgumentException("Ошибка " + num + " здесь");
        if ((5 <= num % 100) && (num % 100 <= 20)) return "тысяч";
        if (num % 10 == 1) return "тысяча";
        if ((2 <= num % 10) && (num % 10 <= 4)) return "тысячи";
        return "тысяч";
    }

    private String numberDo9(int num, boolean padej)
    {
        switch(num) {
            case 1: return padej ? "одна" : "один";
            case 2: return padej ? "две" : "два";
            case 3: return "три";
            case 4: return "четыре";
            case 5: return "пять";
            case 6: return "шесть";
            case 7: return "семь";
            case 8: return "восемь";
            case 9: return "девять";
            default: throw new IllegalArgumentException("Ошибка " + num + " здесь");
        }
    }

    private String number10_19(int num)
    {
        switch(num) {
            case 10: return "десять";
            case 11: return "одиннадцать";
            case 12: return "двенадцать";
            case 13: return "тринадцать";
            case 14: return "четырнадцать";
            case 15: return "пятнадцать";
            case 16: return "шестнадцать";
            case 17: return "семнадцать";
            case 18: return "восемнадцать";
            case 19: return "девятнадцать";
            default: throw new IllegalArgumentException("Ошибка " + num + " здесь");
        }
    }
    private String number2_9(int num)
    {
        switch(num) {
            case 2: return "двадцать";
            case 3: return "тридцать";
            case 4: return "сорок";
            case 5: return "пятьдесят";
            case 6: return "шестьдесят";
            case 7: return "семьдесят";
            case 8: return "восемьдесят";
            case 9: return "девяносто";
            default: throw new IllegalArgumentException("Ошибка " + num + " здесь");
        }
    }
    private String number9(int num)
    {
        switch(num) {
            case 1: return "сто";
            case 2: return "двести";
            case 3: return "триста";
            case 4: return "четыреста";
            case 5: return "пятьсот";
            case 6: return "шестьсот";
            case 7: return "семьсот";
            case 8: return "восемьсот";
            case 9: return "девятьсот";
            default: throw new IllegalArgumentException("Ошибка " + num + " здесь");
        }
    }
}