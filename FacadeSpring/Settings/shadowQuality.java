package FacadeSpring.Settings;

import org.springframework.stereotype.Component;

@Component
public class shadowQuality {
    public void selectShadowQuality(int interest){
        if (interest < 20){
            System.out.println("Low shadow setting selected");
        }
        else if (interest < 60){
            System.out.println("Avarage shadow setting selected");
        }
        else if (interest<80){
            System.out.println("High shadow setting selected");
        }
        else {
            System.out.println("Transcendental shadow setting selected");
        }
    }
}
