package pl.bartek.ficek.interfaces.topic_content;

public class Catty implements FatCat {

    @Override
    public String getName() {
        return "Fatty";
    }

    @Override
    public double getWeight() {
        return 30;
    }

    @Override
    public String getLasagnaRecipe() {
        return "Just eat!";
    }
}


