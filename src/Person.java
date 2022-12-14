public class Person {

    private static final String INFO_IS_NOT = null;
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public Person(String name, String town, int yearOfBirth, String jobTitle) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }  else {
            this.name = INFO_IS_NOT;
        }
        if (jobTitle != null && !jobTitle.isEmpty() && !jobTitle.isBlank()) {
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = INFO_IS_NOT;
        }
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = INFO_IS_NOT;
        }
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    @Override
    public String toString() {
        return "Привет! " +
                "Меня зовут " + name + ". Я из города " +
                town + ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = INFO_IS_NOT;
        }
    }
}
