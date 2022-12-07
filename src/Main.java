public class Main {
    public static void main(String[] args) {
        Person maksim = new Person("Максим", "Минск", 1988, "бренд-менеджер");
        Person anya = new Person("Аня", "Москва", 1993, "методист образовательных программ");
        Person katya = new Person("Катя", "Калининград", 1992, "продакт-менеджер");
        Person artem = new Person("Артем", "Москва", 1995, "директор по развитию бизнеса");

        System.out.println(maksim + "\n" + anya + "\n" + katya + "\n" + artem);



    Car lada = new Car("Lada", "Granta", 2015, "Россия", "жёлтый",
            1.7f, "МКПП", "Седан", "а111АА111", 5, true);
    Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный",
            3.0f,"АКПП", "Хетчбек", "В222ВВ222", 5, true);
    Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный",
            -2,"АКПП", "Купе", "Е333ЕЕ123", 2, true);
    Car kia = new Car("Kia", "Sportage 4 поколения", 2018, "Южная Корея", "красный",
            0,"АКПП", "Кроссовер", "М444ММ147", 7, false);

        System.out.println(lada + "\n" + audi + "\n" + bmw + "\n" + kia);
}}
