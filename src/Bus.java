

    public class Bus extends Transport {

        public Bus(String brand, String model, int prodYear, String prodCountry, String color, int maxSpeed) {
            super(brand, model, prodYear, prodCountry, color, maxSpeed);
        }

        @Override
        public String toString() {
            return String.format("%s %s, %d года выпуска, страна сборки: %s, цвет кузова: %s, максимальная скорость передвижения: %d км/ч,",
                    brand, model, prodYear, prodCountry, color, maxSpeed);
        }
    }
