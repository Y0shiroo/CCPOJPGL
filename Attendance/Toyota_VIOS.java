//Used inheritance to use the method STOP() from the Vehicle
public class Toyota_VIOS extends Vehicle {
String TireType = "Performance Tire";
		
void Drive() {
System.out.println("The Car is moving forward");
}
//Used overriding for method STOP()
@Override
void Stop() {
super.Stop();
}
}
