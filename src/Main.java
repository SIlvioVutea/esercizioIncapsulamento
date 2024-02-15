//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car myCar = new Car(1600, "CV691LM", "Audi", "A3");
        System.out.println(myCar);
        myCar.setEngineSize(1800);
        myCar.setBrand("BMW");
        myCar.setModel("E Class");
        myCar.setPlate("LM666HT");
        System.out.println((myCar.getBrand()));
        System.out.println((myCar.getModel()));
        System.out.println((myCar.getEngineSize()));
        System.out.println((myCar.getPlate()));

    }
}