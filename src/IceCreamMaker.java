public class IceCreamMaker {
    public void makeIcecream(){
        System.out.println("Я делаю мороженое");
    }
    public StrawberryIcecream makeIcecream(Strawberry strawberry, Milk milk){
        return new StrawberryIcecream(strawberry, milk);
    }
    public ChocolateIcecream makeIcecream(Chocolate chocolate, Milk milk){
        return new ChocolateIcecream(chocolate, milk);
    }
    public VanilaIcecream makeIcecream(Vanila vanila, Milk milk){
        return new VanilaIcecream(vanila, milk);
    }
}
