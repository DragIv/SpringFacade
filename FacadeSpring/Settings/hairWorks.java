package FacadeSpring.Settings;

import org.springframework.stereotype.Component;

@Component
public class hairWorks {

    public void selectHair(int choose){
        if (choose == 0){
            System.out.println("Hair works off");
        }
        else {
            System.out.println("Hair works on");
        }
    }
}
