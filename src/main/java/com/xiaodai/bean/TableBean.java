package com.xiaodai.bean;



import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.Iterator;
import java.util.List;  
import java.util.UUID;  
  



import com.xiaodai.bean.*;
  
public class TableBean implements Serializable {  
    
	private final static String[] colors;  
    
    private final static String[] manufacturers;  
    static {  
    	colors = new String[10];  
        colors[0] = "Black";  
        colors[1] = "White";  
        colors[2] = "Green";  
        colors[3] = "Red";  
        colors[4] = "Blue";  
        colors[5] = "Orange";  
        colors[6] = "Silver";  
        colors[7] = "Yellow";  
        colors[8] = "Brown";  
        colors[9] = "Maroon";  
  
        manufacturers = new String[10];  
        manufacturers[0] = "Mercedes";  
        manufacturers[1] = "BMW";  
        manufacturers[2] = "Volvo";  
        manufacturers[3] = "Audi";  
        manufacturers[4] = "Renault";  
        manufacturers[5] = "Opel";  
        manufacturers[6] = "Volkswagen";  
        manufacturers[7] = "Chrysler";  
        manufacturers[8] = "Ferrari";  
        manufacturers[9] = "Ford";  
    }  
  

  
    private List<Car> carsSmall;  
  
    public TableBean() {  
        carsSmall = new ArrayList<Car>();  
//        ((Car) carsSmall).append(new Car("aa","bb","cc","dd"));
        carsSmall.add(new Car("aa","bb","cc","dd"));
        carsSmall.add(new Car("aa","xx","cc","dd"));
       
        populateRandomCars(carsSmall, 100);  
    }  
  
    private void populateRandomCars(List<Car> list, int size) {  
        for(int i = 0 ; i < size ; i++)  
            list.add(new Car(getRandomModel(), getRandomYear(), getRandomManufacturer(), getRandomColor()));  
    }  
  
    public List<Car> getCarsSmall() {  
        return carsSmall;  
    }  
  
    private String getRandomYear() {  
        return (int) (Math.random() * 50 + 1960)+"";  
    }  
  
    private String getRandomColor() {  
        return colors[(int) (Math.random() * 10)];  
    }  
  
    private String getRandomManufacturer() {  
        return manufacturers[(int) (Math.random() * 10)];  
    }  
  
    private String getRandomModel() {  
        return UUID.randomUUID().toString().substring(0, 8);  
    }  
    public static void main(String args[]){
    	TableBean tb = new TableBean();
    	Iterator<Car> it = tb.carsSmall.iterator();
    	while(it.hasNext()){
    		System.out.println(it.next().getModel());
    		System.out.println(it.next().getColor());
    		System.out.println(it.next().getYear());
    	}
    	
    	
    }
} 