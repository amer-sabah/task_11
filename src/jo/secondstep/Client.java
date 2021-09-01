package jo.secondstep;

public class Client {
	public static void main(String[] args) {
		SMSMessage smsMessage=new SMSMessage("123456789");
		FireDepartment fireDepartment=new FireDepartment();
		WaterSplasher waterSplasher=new WaterSplasher();
		
		FireSensor sensor = new FireSensor();
		sensor.addFireProtector(smsMessage);
		sensor.addFireProtector(fireDepartment);
		sensor.addFireProtector(waterSplasher);
		
		sensor.act();
	}
}
