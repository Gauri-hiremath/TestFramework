package tests;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class JenkinsTest {

    @Test
    public void processName(){
        Map<String,String > map = new HashMap<>();
        map.put("1","Pune");
        map.put("1","Mumbai");
        map.put("1","Latur");
        map.put("1","Nasik");
        map.put("1","Solapur");
        map.put("1","Thane");

        for(Map.Entry<String,String> entry : map.entrySet() ){
            System.out.println("Sr. No :"+entry.getKey()+" City: "+entry.getValue());
        }
    }
}
