package solid.lsp;

public class FactoryOrder{


    // Каждый 3-й заказ - бонусный
    public OrderAbstract create(int price, int qnt, boolean isBonus) {
        if (isBonus){
            return new OrderBonus(price, qnt);
        }
        return new Order(price, qnt);
    }

}
