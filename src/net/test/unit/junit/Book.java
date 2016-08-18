package net.test.unit.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;

public class Book {
	   private String id = null;
       private String name = null;
   
       public String getId() {
           return id;
       }
   
       public void setId(String id) {
           this.id = id;
       }
   
       public String getName() {
           return name;
       }
   
       public void setName(String name) {
           this.name = name;
       }
}
