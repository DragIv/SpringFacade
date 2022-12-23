package FacadeSpring.Settings;

import org.springframework.stereotype.Component;

@Component
public class amountOfGrass {

    public void selectLowGrass(){
        System.out.println("Low grass quality selected");
    }

    public void selectAvarageGrass(){
        System.out.println("Avarage grass quality selected");
    }

    public void selectHighGrass(){
        System.out.println("High grass quality selected");
    }

    public void selectBeyondGrass(){
        System.out.println("Beyond grass quality selected");
    }

    public void selectGrass(String select){
        if (select.equals("low")){
            System.out.println("Low grass quality selected");
        }
        if (select.equals("avarage")){
            System.out.println("Avarage grass quality selected");
        }
        if (select.equals("high")){
            System.out.println("High grass quality selected");
        }
        if (select.equals("beyond")){
            System.out.println("Beyond grass quality selected");
        }
    }

}
