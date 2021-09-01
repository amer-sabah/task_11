package jo.secondstep;

import java.util.ArrayList;
import java.util.List;

public class FireSensor {
   List<FireProtector> fireProtectors =new ArrayList<FireProtector>();
   
   public void addFireProtector(FireProtector fireProtector) {
	   fireProtectors.add(fireProtector);
   }
   
   public void removeFireProtector(FireProtector fireProtector) {
	   fireProtectors.remove(fireProtector);
   }
   
   public void act() {
	   for(FireProtector fireProtector : fireProtectors) {
		   Thread t1=new Thread(new Runnable() {
				@Override
				public void run() {
					fireProtector.fireDetection();
				}
			});
		   t1.start();
	   }
   }
}
