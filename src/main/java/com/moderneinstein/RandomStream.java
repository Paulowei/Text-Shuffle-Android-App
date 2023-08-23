package com.moderneinstein  ;  

import java.util.Random ; 
import java.lang.reflect.Array ; 
import java.lang.Math ;
import java.util.ArrayList ;
import java.util.LinkedList ;
import java.util.Arrays ; 
import java.util.List ; 
import java.util.Vector ; 


public class   RandomStream{
     public static Random spawner ; 
    
     public  RandomStream(){
        long current = System.currentTimeMillis() ; 
        spawner = new Random(current)  ;
     }
     public static List<int[]> generateD(int lower,int upper,int depth){
         List<int[]> listed = new ArrayList<int[]>()  ; 
         int[] temps ; 
         for(int fe=0;fe<depth;fe++){
            int stated =  spawner.nextInt(upper-lower)+lower ; 
            int other =  spawner.nextInt(upper-lower)+ lower ;  
            temps = new int[]{stated,other } ;
            listed.add(temps) ; 
         }
         return  listed ; 
     }
     public static  List<Integer> generate(int lower,int upper,int depth){
      List<Integer> create = new Vector<Integer>() ; 
      Integer temps = 0 ;  
      for(int ds=0;ds<depth;ds++){
         int current = spawner.nextInt(upper-lower) ;
         current+=lower ;  
         temps = Integer.valueOf(current) ; 
        create.add(temps) ; 
      }
      return create ; 
     }
     public static List<int[]> generateN(int lower,int upper,int width,int range){
         List<int[]> buffers = new Vector<int[]>( ) ; 
         int[] temps = new int[width] ; 
         for(int rs=0;rs<range;rs++){
            temps = new int[width] ;
            for(int cs=0;cs<width;cs++){
               int taken = spawner.nextInt() ; 
               temps[cs] = taken ; 
            }
            buffers.add(temps) ; 
          }
          return buffers ; 
     }
}