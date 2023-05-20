
public class U_2SpyPlane extends Vehicle {
String Wingspan = "105ft";

void Fly() {
	System.out.println("Taking Off");
}

@Override
void Stop() {
	System.out.println("System Override");
	super.Stop();
}
}
