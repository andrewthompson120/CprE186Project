package test;
package testing;
import lejos.nxt.Button;
import lejos.nxt.
public class RotorTesting1 {
		public static void main(String[] args){
			LCD.drawString("Program2",0,0);
			Button.waitForAnyPress();
			Motor.A.setSpeed(720);
			LCD.clear();
			Delay.msDelay(2000);
			LCD.drawInt(Motor.A.getTachoCount(),0,0);
			Motor.A.stop();
			LCD.drawInt(motor.A.getTachoCount);
			Motor.A.backward();
			while(motorA.getTachoCount() > 0);
			LCD.drawInt(motor.A.getTachoCount(),0,2);
			Motor.A.stop();
			LCD.drawInt(Motor.A.getTachoCount(),0,3);
			Button.waitForAnyPress()
		}
	}

}
