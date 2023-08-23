package com.moderneinstein;

import android.graphics.Bitmap ; 
import android.graphics.Color ; 
import android.widget.ImageView ; 
import android.view.ViewGroup  ;


public class BitmapSource {

    public static int ALPHA_DEFAULT = 100  ;
    public static Bitmap.Config[] arrays =  {Bitmap.Config.ARGB_8888 ,Bitmap.Config.ARGB_4444,Bitmap.Config.RGB_565,Bitmap.Config.ALPHA_8} ;

    public static Bitmap create(int length,int width,int[] specify){
        int product = length*width  ; 
        int[] colors = new int[product] ; 
        int stated =  Color.argb(specify[0],specify[1],specify[2],specify[3]) ;
        for(int fd=0;fd<product;fd++){
            colors[fd] = stated ; 
        }
        Bitmap  recent = Bitmap.createBitmap(colors,width,length,arrays[0]) ;
        return recent ;
    }

    //  long color = (A & 0xffff) << 48 | (B & 0xffff) << 32 | (G & 0xffff) << 16 | (R & 0xffff);
 
}
