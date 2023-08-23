package com.moderneinstein   ;
import android.view.ViewGroup ; 
import android.view.View  ; 
import android.widget.Button ; 
import android.widget.TextView ; 
import android.app.Activity ; 


import java.util.LinkedList ; 
import java.util.Vector ;  
import java.util.ArrayList ; 
import java.util.Queue ; 
import java.util.Stack ; 
import java.util.Collection ; 
import java.util.List ;

import java.util.Objects ; 
    class Pair<C,R> extends Object{
         public C first ; 
         public R second ; 
         public Pair(C upper,R lower){
            this.second= lower ; 
            this.first  = upper ; 
         }
         public R second(){
            return this.second ;
         }
         public C first(){
            return this.first ; 
         }
    }
public class Utility{
    
    public static Class<?> standard =  ViewGroup.class ; 
    // Retrieve all child Elements within the hierarchy of this parent root ; 
    // May  or may not be  ViewGroup elements ;
    public static <F> void retrieveElements(ViewGroup group,Collection<F> holder){
        Queue<View> queue = new LinkedList<View>() ; 
        queue.offer((View)group) ; 
        //holder.clear() ; 
        while(queue.size()>0 ){
            View current =  queue.element() ; 
            queue.poll() ; 
            holder.add((F)current) ; 
            if(!current.getClass().equals(ViewGroup.class) ){
                continue ;  }
                ViewGroup  viewed = (ViewGroup)(current) ; 
            int width =  viewed.getChildCount( ) ; 
            for(int delta = 1;delta<=width;delta++){
                View lower =  viewed.getChildAt(delta-1) ; 
                queue.offer(lower) ; 
            }
        }
    }
    //Retreive all the Child elements which are views, but not view groups ; 

    public static <R> void retrieveViews(ViewGroup starter,Collection<R> holder,boolean collect){
        Queue<View>  carrier = new LinkedList<View>() ; 
        carrier.offer(starter) ; 
       // holder.clear() ; 
        while(carrier.size( )>0){
            View current = carrier.peek() ; 
            carrier.poll() ; 
            if(current.getClass().equals(standard)==collect){
                holder.add((R)current) ; 
                continue ; 
            }
            ViewGroup parent = (ViewGroup)(current) ; 
             int length = parent.getChildCount() ; 
             for(int sigma=1;sigma<=length;sigma++){
                View stated = parent.getChildAt( sigma-1) ; 
                carrier.add(stated) ; 
             }
        }
    }
     public static <R> void  retrieveHeight(ViewGroup parent,int required,Collection<R> elements) throws ClassCastException{
        Objects.requireNonNull(parent ); 
        Pair<Integer,View> joint = new Pair<Integer,View>(0,parent) ;
        Queue<Pair<Integer,View>>  streams = new LinkedList<Pair<Integer,View>>() ; 
        streams.offer(joint) ; 
        while(streams.size()>0){
            joint = streams.element() ; 
            streams.remove() ;
             if(joint.first.intValue()==required){
                elements.add((R)joint.second) ; 
                continue ; 
             }  
             if(joint.second.getClass().equals(standard)==false){continue ; }
             ViewGroup assist =  (ViewGroup)joint.second ; 
             int breadth = assist.getChildCount( ) ;
             for(int rs=0;rs<breadth;rs++){
                 View  taken = assist.getChildAt(rs) ; 
                streams.offer(new Pair<Integer,View>(joint.first+1,taken)) ;
             }
        }
     }
     /*
     public void test(List<? extends List<Integer>> trial){
        List<LinkedList<Integer>> listed = new Vector<LinkedList<Integer>>( ) ; 
         test(listed) ; 
         List<Integer>  ensure = new Vector<Integer>( ) ;
   //     trial.add(ensure) ;
    }
    */
    }
