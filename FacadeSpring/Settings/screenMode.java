package FacadeSpring.Settings;

import org.springframework.stereotype.Component;

@Component
public class screenMode {

    public void onFullScreen(){
        System.out.println("Full screen on");
    }
    public void onWindowScreen(){
        System.out.println("Window Screen on");
    }
}
