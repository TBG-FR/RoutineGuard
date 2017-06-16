/*
 *
 */

package RoutineGuard;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Tom-Brian Garcia <tom-brian.garcia@etu.univ-lyon1.fr>
 * @author Dyvia Fleury <dyvia.fleury@etu.univ-lyon1.fr>
 * @author Enzo Contini <enzo.contini@etu.univ-lyon1.fr>
 * @author Alexandre Vignand <alexandre.vignand@etu.univ-lyon1.fr>
 */

public class RoutineGuard { /* MAIN */
     
    public static void main(String[] args) {
       
            System.out.println("PARTIE DETECTEUR DE MOUVEMENT");
            
            MotionSensor MS1=new MotionSensor(7);
            for(int i=0;i<1000;i++){
                if(MS1.getData()==1){
                    System.out.println("Mouvement detecté");
                }
                else{
                    System.out.println("--------------");
                }
            }
            
            System.out.println("PARTIE APPUI BOUTON");

            ContactSensor CS1=new ContactSensor(3);
            for(int i=0;i<1000;i++){
                if(CS1.getData()==1){
                    System.out.println("Bouton Appuyé");
                }
                else{
                    System.out.println("--------------");
                }
            }
            
            TemperatureSensor T1 = new TemperatureSensor(8);
            HumiditySensor H1=new HumiditySensor(8);
            System.out.println("Température : "+T1.getData()+" °C");
            System.out.println("Humidité : "+H1.getData()+" %");
            
            BrightnessSensor BS=new BrightnessSensor(5);
            System.out.println("Luminosité : "+BS.getData()+" %");
        
        
        ArduinoLink AL1 = new ArduinoLink();
        
//        try {
//            AL1.test();
//        } catch (Exception ex) {
//            Logger.getLogger(ArduinoLink.class.getName()).log(Level.SEVERE, null, ex);
//        }

        try {
            new ArduinoDiscover().go();
        } catch (Exception ex) {
            Logger.getLogger(ArduinoDiscover.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
