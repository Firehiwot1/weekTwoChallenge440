import java.util.ArrayList;
import java.util.Random;


public class WeekTwoChipotleJr {

        public static void main(String[] args) {

            Random rand = new Random();


            ArrayList<String> rice = new ArrayList<String>();
            ArrayList<String> meat = new ArrayList<String>();
            ArrayList<String> beans = new ArrayList<String>();
            ArrayList<String> salsa = new ArrayList<String>();
            ArrayList<String> veggies = new ArrayList<String>();
            ArrayList<String> cheese = new ArrayList<String>();
            ArrayList<String> guac = new ArrayList<String>();
            ArrayList<String> queso = new ArrayList<String>();
            ArrayList<String> sourcream = new ArrayList<String>();


            rice.add("white rice");
            rice.add("brown rice");
            rice.add("no rice");

            meat.add("chicken meat");
            meat.add("steak meat");
            meat.add("carnidas meat");
            meat.add(" chorizo meat");
            meat.add("sofritas meat");
            meat.add("veggies");


            beans.add("pinto beans");
            beans.add("black beans");
            beans.add("no beans");


            salsa.add("mild salsa");
            salsa.add("midium salsa");
            salsa.add(" hot salsa");
            salsa.add("no salsa");
            salsa.add("all");


            veggies.add("lettuce");
            veggies.add("fajita veggies,");
            veggies.add("no veggies");
            veggies.add("all");

            cheese.add("cheese");
            cheese.add("no cheese");

            guac.add("guac");
            guac.add("no guac");

            queso.add("queso");
            queso.add("no queso");

            sourcream.add("sour cream");
            sourcream.add("no sour cream");




            for(int i=1;i<=25;i++) {
                    int rice_index = rand.nextInt(rice.size());
                    int Meat_index = rand.nextInt(meat.size());
                    int Beans_index = rand.nextInt(beans.size());
                    int Salsa_index = rand.nextInt(salsa.size());
                    int veggies_index = rand.nextInt(veggies.size());
                    int cheese_index=rand.nextInt(cheese.size());
                    int guac_index=rand.nextInt(guac.size());
                    int queso_index=rand.nextInt(queso.size());
                    int sourcream_index=rand.nextInt(sourcream.size());

 double price=3+priceCalculator(cheese_index) + priceCalculator (guac_index) + priceCalculator(queso_index)+ priceCalculator(sourcream_index);
                    System.out.println(" Burrito " + i + ": " + rice.get(rice_index) + "," + meat.get(Meat_index) + "," + beans.get(Beans_index) + "," + salsa.get(Salsa_index) + "," + veggies.get(veggies_index)+
                           " ," +cheese.get(cheese_index)+ ","+ guac.get(guac_index)+ ","+ queso.get(queso_index)+","+sourcream.get(sourcream_index)+ ", Total Price:" + price);

                }

            }
            public static double priceCalculator(int index) {
                if (index == 0) {
                    return 0.50;
                }
                return 0;

            }

}



