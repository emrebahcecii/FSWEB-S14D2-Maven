package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Wall v = new Wall("Fenerbahçe");
        Wall v2 = new Wall("Sigara");
        Wall v3 = new Wall("EĞLENCE");
        Wall v4 = new Wall("KAHVE");
        Ceiling c = new Ceiling(4, PaintColor.WHITE);
        Bed bed = new Bed("Şekil",1,2,3,4);
        Lamp l = new Lamp(LampType.NEON,true,5);
        Wardrobe w = new Wardrobe(12,13,14.14);
        Carpet carpet = new Carpet(24,25, PaintColor.RED);

        Bedroom b = new Bedroom("EMRE",v,v2,v3,v4,c,bed,l,w,carpet);
    }
}