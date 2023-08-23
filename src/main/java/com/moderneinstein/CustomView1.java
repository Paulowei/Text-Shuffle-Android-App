package com.moderneinstein;
import android.view.View ; 
import android.view.ViewGroup ; 
import android.content.res.TypedArray ; 
import android.content.Intent  ; 
import android.widget.TextView ; 
import android.widget.RelativeLayout ; 
import android.app.Service ; 
import  android.util.AttributeSet ; 
import android.content.Context  ; 
//import android.widget.Theme ; 
import android.content.res.Resources.Theme ; 
import android.content.res.Resources ; 
import android.util.Xml ; 
import org.xmlpull.v1.XmlPullParser; 

import android.R.layout ; 
import android.graphics.Color ; 
import android.view.ViewGroup.LayoutParams  ; 
import android.view.ViewGroup.MarginLayoutParams  ; 


public class CustomView1  extends TextView{
        public String  content ; 
        public int width ; 
        public int height ; 
        public int viewId ; 
        public static long position =10000 ;
        public static long offset = 0  ;
        public static int resId =   R.layout.view_custom1 ;
        public static int[]  padding = {  } ; 
        public static int[] margin =  {}  ;
        public static int[] specs = new int[]{} ; 
        public static int paints =  Color.rgb(specs[0],specs[1],specs[2]) ; 
        public static int[]  dimens = new int[]{40,40} ;  
        public CustomView1(Context context){
         //  super(context) ; 
            this(context,collect(context)) ; 
        }
        public static AttributeSet collect(Context context){
            Resources restates =  context.getResources() ; 
            XmlPullParser parser = restates.getXml(resId) ;
            AttributeSet  attrs = Xml.asAttributeSet(parser) ;
            return attrs ;
        }
        public static  ViewGroup.LayoutParams createParams(Context context,boolean choice){
             ViewGroup.MarginLayoutParams params 
             = new ViewGroup.MarginLayoutParams(dimens[0],dimens[1]) ; 
             if(choice==true){
                AttributeSet crest = collect(context)  ; 
                params = new ViewGroup.MarginLayoutParams(context,crest)  ;
             }
            params.setMargins(margin[0],margin[1],margin[2],margin[3]) ;
           // params.setPadding(padding[0],padding[1],padding[2],padding[3]) ; 
           // params.setLayoutDirection(View.LAYOUT_DIRECTION_LTR) ; 
           return  params ;
        }
        public static ViewGroup.LayoutParams  configureParams(Context context){
            AttributeSet taken = collect(context) ; 
            ViewGroup.MarginLayoutParams params  = 
            new ViewGroup.MarginLayoutParams(context,taken) ; 
            params.setMargins(margin[0],margin[1], margin[2],margin[3]) ;
             // params.setLayoutDirection(View.LAYOUT_DIRECTION_LTR) ; 
             return params ; 
        }
        public CustomView1(Context context,String allowed)   {
                super(context) ;
                this.setPadding(padding[0],padding[1],padding[3],padding[4]) ;
              //  this.setMargin(margin[0],margin[1],margin[2],margin[3]) ; 
              this.setLayoutParams(createParams(context,false) ) ; 
                this.setVisibility(View.VISIBLE) ; 
                this.setBackgroundColor(paints) ;
                this.alter(allowed) ; 
                this.derive() ;
        }
        public CustomView1(Context context,AttributeSet attrs){
            super(context,attrs) ; 
            Theme  theme = context.getTheme()   ; 
            TypedArray array = theme.obtainStyledAttributes(attrs,new int[]{resId},0,0) ;
            CharSequence sequence =  this.getText() ;
            content = sequence.toString()  ;
            this.gainId() ; 
            array.recycle() ;
        }
        // R.styleable.view_custom1
        public  CustomView1(Context context,String value,boolean noted){
            super(context)  ; 
            this.setVisibility(View.VISIBLE) ; 
            this.alter(value)  ; 
            this.setBackgroundColor(paints)  ;
            this.derive()  ; 
            this.setLayoutParams(createParams(context,noted)) ;
        }
        public void derive(){
            height = this.getHeight() ;
            width = this.getWidth() ;
            this.gainId() ;
        }
        public void alter(String other){
            content = other ; 
            this.setText(other)   ; 
            this.requestLayout( ) ; }
        public String  data(){
            String useful =content ; 
            return useful ;
        }
        public void gainId(){
            int   source  = (int)(position+offset) ; 
            this.setId(source) ; 
            offset = offset+1 ;
        }
}
