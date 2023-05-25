
public class VehicleTest {
public static void main(String args[]) {

Toyota_VIOS car = new Toyota_VIOS();
//ToyotaVios
System.out.println("Toyota VIOS: ");
System.out.println(car.CarColor);
System.out.println(car.CarPrice);
System.out.println(car.CarSpeed);
System.out.println(car.TireType);
car.Drive();
car.Stop();	

U_2SpyPlane pln = new U_2SpyPlane();
//U2spyplane
System.out.println("");
System.out.println("U2 Spy Plane: ");
System.out.println(pln.PlaneColor);
System.out.println(pln.PlanePrice);
System.out.println(pln.PlaneSpeed);
System.out.println(pln.Wingspan);
pln.Fly();
pln.Stop();

Fandango_Yacht ych = new Fandango_Yacht();
//FandangoYacht
System.out.println("");
System.out.println("Fandango Yacht: ");
System.out.println(ych.YachtColor);
System.out.println(ych.YachtPrice);
System.out.println(ych.YachtSpeed);
System.out.println(ych.MainSailColor);
ych.Float();
ych.Stop();
}
}
