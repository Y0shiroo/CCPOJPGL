//Used inheritance to use the method STOP() from the Vehicle
public class U_2SpyPlane extends Vehicle {
String Wingspan = "105ft";

void Fly() {
System.out.println("Taking Off");
}
//Used overriding for method STOP()
@Override
void Stop() {
super.Stop();
}
}
