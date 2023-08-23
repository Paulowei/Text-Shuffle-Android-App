package com.moderneinstein ; 

import java.util.Set ; 
import java.util.Arrays ; 
import java.util.Map ; 
import java.util.TreeMap ; 

import android.app.Activity ; 
import android.app.Service ;
import android.widget.TextView ; 
import android.os.Bundle ; 
import android.os.Handler ; 
import android.widget.TextView ; 
import android.widget.Button ;
import android.view.ViewGroup ; 


public class Router{	
	
	public static Map<String,Class<?>> routes ; 
	public static String[] starters  =  new String[]{} ; 
	public static Class<?>[] locations =  new Class<?>[]{}   ;
	public static void configure(){	
		routes = new TreeMap<String,Class<?>>() ; 
		int depth = locations.length  ;
		for(int rs=0; rs<depth;rs++){
			routes.put(starters[rs],locations[rs] ) ; 
		}
		}
	public static void insert(String from,Class<?> dest){	
		routes.put(from,dest) ;
		}
	public static Class<?> derive(String source){
			Class<?> taken =  routes.get(source) ; 
			return taken ; 
		}
		/*
		 * <dependency>
    		<groupId>androidx.cardview</groupId>
    		<artifactId>cardview</artifactId>
    		<version>1.0.0</version>
    		<scope>runtime</scope>
		</dependency>
		 * 
		 */
		/*
		 * 
		 *   <activity android:name=".SpawnActivity">
        <intent-filter>
        </intent-filter>
    </activity>
    <activity android:name=".SettingsActtivity">
        <intent-filter>
        </intent-filter>
    </activity>
		 */
	}