public class Main {
    public static void main(String[] args) {
        Person maksim = new Person("Максим", "Минск", 1988, "бренд-менеджер");
        Person anya = new Person("Аня", "Москва", 1993, "методист образовательных программ");
        Person katya = new Person("Катя", "Калининград", 1992, "продакт-менеджер");
        Person artem = new Person("Артем", "Москва", 1995, "директор по развитию бизнеса");

        System.out.println(maksim + "\n" + anya + "\n" + katya + "\n" + artem);

    }
}