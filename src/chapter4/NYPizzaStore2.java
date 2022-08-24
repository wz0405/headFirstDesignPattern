//package chapter4;
//
//public class NYPizzaStore2 extends PizzaStore{
//    public Pizza orderPizza(String type){
//        Pizza pizza;
//        pizza = createPizza(type);
//
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
//
//        return pizza;
//    }
//    @Override
//    protected Pizza createPizza(String item) {
//        Pizza pizza = null;
//        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
//        if(item.equals("cheese")){
//            pizza = new CheesePizza(ingredientFactory);
//            pizza.setName("뉴욕 스타일 치즈 피자");
//
//        }else if(item.equals("clam")){
//            pizza = new ClamPizza(ingredientFactory);
//            pizza.setName("뉴욕 스타일 조개 피자");
//        }
//        return pizza;
//    }
//}
