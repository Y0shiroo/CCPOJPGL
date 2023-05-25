//Used inheritance to use the method STOP() from the Vehicle
public class Fandango_Yacht extends Vehicle{
String MainSailColor = "White";
	
void Float() {
System.out.println("The boat is accelerating");
}
//Used overriding for method STOP()
@Override
void Stop() {
super.Stop();
}
}
