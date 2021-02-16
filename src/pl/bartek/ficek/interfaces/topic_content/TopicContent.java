package pl.bartek.ficek.interfaces.topic_content;

public class TopicContent {

    public static void main(String[] args) {

        Catty catty = new Catty();

        /**
         * getWeight() - method from interface FatCat
         */
        double weight = catty.getWeight();
        System.out.println(weight);

        /**
         * getLasagnaRecipe() - method from interface LasagnaEater
         */
        String lasagnaRecipe = catty.getLasagnaRecipe();
        System.out.println(lasagnaRecipe);

        /**
         * getName() - method from interface Cat
         */
        String name = catty.getName();
        System.out.println(name);

        /**
         * NUMBER_OF_PAWS - attribute from interface Cat
         */
        int numberOfPaws = Catty.NUMBER_OF_PAWS;
        System.out.println(numberOfPaws);
    }
}
