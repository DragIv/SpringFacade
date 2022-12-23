package FacadeSpring.Settings;

import org.springframework.stereotype.Component;

@Component
public class reliefQuality {


    public void selectLowRelief(){
        System.out.println("Low relief quality selected");
    }

    public void selectAvarageRelief(){
        System.out.println("Avarage relief quality selected");
    }

    public void selectHighRelief(){
        System.out.println("High relief quality selected");
    }

    public void selectBeyondRelief(){
        System.out.println("Beyond relief quality selected");
    }

    public void selectRelief(String select){
        if (select.equals("low")){
            System.out.println("Low relief quality selected");
        }
        if (select.equals("avarage")){
            System.out.println("Avarage relief quality selected");
        }
        if (select.equals("high")){
            System.out.println("High relief quality selected");
        }
        if (select.equals("beyond")){
            System.out.println("Beyond relief quality selected");
        }
    }


}
