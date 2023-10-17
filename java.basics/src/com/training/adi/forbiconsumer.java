package com.training.adi;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
public class forbiconsumer {
public static void main(String[] args) {
	BiConsumer<String,String>obj =(s1,s2)-> System.out.println(s1+":"+s2);
	obj.accept("india", "pakistan");
	
}

}
