package jo.secondstep;

public class SMSMessage implements FireProtector {
	String phoneNumber;
	
	

	public SMSMessage(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}



	@Override
	public void fireDetection() {
		System.out.println("Send SMS message to :" + phoneNumber);
	}

}
