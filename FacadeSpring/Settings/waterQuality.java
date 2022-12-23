package FacadeSpring.Settings;

import org.springframework.stereotype.Component;

@Component
public class waterQuality {

    public void selectLowWater(){
        System.out.println("Low water quality selected");
    }

    public void selectAvarageWater(){
        System.out.println("Avarage water quality selected");
    }

    public void selectHighWater(){
        System.out.println("High water quality selected");
    }

    public void selectBeyondWater(){
        System.out.println("Beyond water quality selected");
    }

    public void selectWater(String select){
        if (select.equals("low")){
            System.out.println("Low water quality selected");
        }
        if (select.equals("avarage")){
            System.out.println("Avarage water quality selected");
        }
        if (select.equals("high")){
            System.out.println("High water quality selected");
        }
        if (select.equals("beyond")){
            System.out.println("Beyond water quality selected");
        }
    }
}
