public class SpaceShip {

    int Height, Radius;
    Engines engines;
    Payload payload;
    FuelTank fuelTank;
    Crew crew;

    public SpaceShip(Crew crew, FuelTank fuelTank, Payload payload, Engines engines, int Height, int Radius){

        int theWholeWeight=fuelTank.weight+payload.weight+crew.theWholeWeightOfACrew()+ engines.weight;
        if(theWholeWeight/engines.power<10){
            System.out.println("МЫ РАЗОБЬЕМСЯ!!!");
            }else{
            System.out.println("ПОЕХАЛИ!!!");
        }
        }

    }
