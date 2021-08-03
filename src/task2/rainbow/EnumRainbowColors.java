/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package task2.rainbow;
enum RainbowColor
{
    VIOLET,INDIGO,BLUE,GREEN,YELLOW,ORANGE,RED;
}
public class EnumRainbowColors {
    public void findColorCode()
    {
        RainbowColor array[]=RainbowColor.values();
        for(RainbowColor color:array)
        {
            System.out.println("Color code of "+color+" is "+(color.ordinal()+1));
        }
    }
}
