public class Juicer {

    public void squeeze(){
        System.out.println("Я работаю и выжимаю");
    }
    public AppleJuice squeeze(Apple apple){
        return new AppleJuice(apple);
    }
    public OrangeJuice squeeze(Orange orange){
        return new OrangeJuice(orange);
    }
    public MultiFruit squeeze(Orange orange, Apple apple){
        return new MultiFruit(orange,apple);
    }

}
