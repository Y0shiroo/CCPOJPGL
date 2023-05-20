
public class PlaneTest {
public static void main(String args[]) {
	U_2SpyPlane pln = new U_2SpyPlane();
	
System.out.println(pln.Color);
System.out.println(pln.Price);
System.out.println(pln.Speed);
System.out.println(pln.Wingspan);

pln.Fly();
pln.Stop();
}
}
