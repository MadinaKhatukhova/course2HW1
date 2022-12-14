public class Flower {
    private String flower;
    private String flowerColor;
    private String country;
    private float cost;
    private final int lifeSpan;
    private final String DEFAULT_FLOWER = "Ромашка";
    private final String DEFAULT_COLOR = "белый";
    private final String DEFAULT_COUNTRY = "Россия";

    public Flower(String flower, String flowerColor, String country, float cost, int lifeSpan) {
        this.flower = (flower != null && !flower.isEmpty() && !flower.isBlank()) ? flower : DEFAULT_FLOWER;
        this.flowerColor = (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) ? flowerColor : DEFAULT_COLOR;
        this.country = (country != null && !country.isEmpty() && !country.isBlank()) ? country : DEFAULT_COUNTRY;
        this.cost = (cost >= 0) ? cost : 1f;
        this.lifeSpan = (lifeSpan > 0) ? lifeSpan : 3;
}
    @Override
    public String toString() {
        return String.format("%s, цвет: %s, страна: %s, цена: %.2f рублей, срок стояния %d.", flower, flowerColor,
                country, cost, lifeSpan);
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = (flower != null && !flower.isEmpty() && !flower.isBlank()) ? flower : DEFAULT_FLOWER;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) ? flowerColor : DEFAULT_COLOR;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = (country != null && !country.isEmpty() && !country.isBlank()) ? country : DEFAULT_COUNTRY;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = (cost >= 0) ? cost : 1f;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }



}
