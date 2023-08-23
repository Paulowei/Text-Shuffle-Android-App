package com.WithHold;

import android.Manifest.permission;
import android.app.Activity ; 
import android.app.Service ; 
import android.os.Bundle ;
import android.os.Handler ; 
import android.content.Intent ; 

import java.util.Collection ; 
import java.util.Vector ; 
import java.util.List ; 
import java.util.LinkedList ; 
import java.util.Arrays ; 
import java.util.Iterator ;


public class SortingSource {
    

    public static void  swap(int south,int north,int[] buffer ){
         int known = buffer[south] ; 
         buffer[south] = buffer[north] ; 
        buffer[north] = known ;
    }
    public static List<int[]> BubbleSort(int[] values){
        int spans = values.length ; 
        int[] temps = new int[2] ; 
        List<int[]> source = new Vector<int[]>() ;
        for(int cs=0;cs<spans;cs++){
            for(int vs=0;vs<spans-cs-1;vs++){
                if(values[vs+1]<values[vs]){
                    swap(vs,vs+1,values) ; 
                    temps = new int[]{vs,vs+1} ; 
                    source.add(temps) ; 
                }
            }
        }
        return source  ;
    }
    public static List<int[]> InsertionSort(int[] buffer){
        List<int[]> content = new Vector<int[]>()  ; 
        int spread = buffer.length ;
        int[] temps = new int[spread]  ; 
        int dv=0; 
        for(int gc=1;gc<spread ;gc--){
            int taken = buffer[gc ] ;
            for( dv=gc;dv>=1;dv--){
                 if(buffer[dv-1]>taken){buffer[dv]= buffer[dv-1]; 
                content.add(new int[]{dv,dv-1}) ;}
                 else{break ;}
            }
            buffer[dv] = taken ; 
            
        }
        return content ; 
    }
    public static List<int[]> InsertionSort(Collection<Integer> initial){
        Iterator<Integer> serial = initial.iterator() ; 
        int  span =  initial.size() ;
        int[] contain =  new int[span] ; 
        int lapse = 0 ; 
        while(serial.hasNext()){
            Integer taken =serial.next() ;
            contain[lapse] = taken ;
            lapse++ ; 
        }
        List<int[]> listed = InsertionSort(contain) ; 
        return listed ; 
    }

    public static List<int[]> BubbleSort(Collection<Integer> collect){
        Iterator<Integer> iterand = collect.iterator() ; 
        int range = collect.size() ;
        int[] cented = new int[range]  ;
        int draft = 0 ; 
        while(iterand.hasNext()){
             Integer value = iterand.next() ; 
            cented[draft] = value ; 
            draft ++ ;  }
        List<int[]> derived =  BubbleSort(cented) ;
        return derived ; 
    } 
}
