package FacadeSpring.Settings;

import org.springframework.stereotype.Component;

@Component
public class screenResolution {

    public void onLow(){
        System.out.println("Set screen resolution: low");
    }

    public void onAverage(){
        System.out.println("Set screen resolution: avarage");
    }

    public void onHigh(){
        System.out.println("Set screen resolution: high");
    }

    public void onResolution(int sR){
        if (sR == 720){
            onLow();
        }
        if (sR == 1080){
            onAverage();
        }
        if (sR == 2160){
            onHigh();
        }
    }

}
