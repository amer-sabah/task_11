package jo.secondstep;

public class FireDepartment implements FireProtector {

	@Override
	public void fireDetection() {
		System.out.println("Call 911");
	}

}
