package FacadeSpring;

import Settings.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        graphicsFacade.LowGraphics();
        System.out.println();

        graphicsFacade.AvaregeGraphics();
        System.out.println();
        
    }
}
