package FacadeSpring;

import Settings.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GraphicsFacade {
    @Autowired
    amountOfGrass grass;
    @Autowired
    hairWorks hair;
    @Autowired
    hardwareCursor cursor;
    @Autowired
    reliefQuality reilef;
    @Autowired
    screenMode screenmode;
    @Autowired
    screenResolution screenresolution;
    @Autowired
    shadowQuality shadow;
    @Autowired
    waterQuality water;

    @Autowired
    public GraphicsFacade(amountOfGrass grass, hairWorks hair, hardwareCursor cursor, reliefQuality reilef, screenMode screenmode, screenResolution screenresolution, shadowQuality shadow, waterQuality water) {
        this.grass = grass;
        this.hair = hair;
        this.cursor = cursor;
        this.reilef = reilef;
        this.screenmode = screenmode;
        this.screenresolution = screenresolution;
        this.shadow = shadow;
        this.water = water;
    }

    public void LowGraphics(){
        System.out.println("low graphics:");
        grass.selectLowGrass();
        hair.selectHair(0);
        cursor.onoff("on");
        reilef.selectLowRelief();
        screenmode.onFullScreen();
        screenresolution.onResolution(720);
        shadow.selectShadowQuality(10);
        water.selectWater("low");
    }

    public void AvaregeGraphics(){
        System.out.println("avarege graphics:");
        grass.selectAvarageGrass();
        hair.selectHair(0);
        cursor.onoff("on");
        reilef.selectAvarageRelief();
        screenmode.onFullScreen();
        screenresolution.onResolution(1080);
        shadow.selectShadowQuality(50);
        water.selectAvarageWater();
    }

    public void HightGraphics(){
        System.out.println("hight graphics:");
        grass.selectHighGrass();
        hair.selectHair(1);
        cursor.onoff("on");
        reilef.selectHighRelief();
        screenmode.onFullScreen();
        screenresolution.onResolution(1080);
        shadow.selectShadowQuality(70);
        water.selectHighWater();
    }

    public void BeyondGraphics(){
        System.out.println("beyond graphics:");
        grass.selectBeyondGrass();
        hair.selectHair(1);
        cursor.onoff("on");
        reilef.selectBeyondRelief();
        screenmode.onFullScreen();
        screenresolution.onResolution(2160);
        shadow.selectShadowQuality(100);
        water.selectBeyondWater();
    }

    public void CustomGraphics(){
        System.out.println("custom graphics:");
        grass.selectGrass("low");
        hair.selectHair(1);
        cursor.onoff("off");
        reilef.selectRelief("avarage");
        screenmode.onFullScreen();
        screenresolution.onResolution(720);
        shadow.selectShadowQuality(74);
        water.selectWater("high");
    }
}
