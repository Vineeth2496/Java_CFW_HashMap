package com.MAPHashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
import java.util.concurrent.*;

public class Hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  public V put(K, V);
		//	to take requirements key and values
		HashMap H=new HashMap();
		System.out.println("Before Hashmap:");
		H.put("Bawarchi", "Chicken haleem, Mutton haleem, Tandoori chicken, Prawn Fry");
		H.put("Mifil", "Chicken Biryani, Mutton Biryani, Tandoori chicken, Prawn Fry");
		H.put("Kritunga", "Shawarma, Chicken Mandi, Tandoori chicken, Prawns Biryani");
		H.put("Paradise", "Chicken haleem, Mutton haleem, Tandoori chicken, Prawn Fry");
		
		//	H.put("Taj", H.get("Chicke"));
		System.out.println("After Resturants");
		System.out.println(H);
		
		//  public int size();
		//	to check Size of of HashMap Object
		System.out.println("Resturents Map size "+H.size());
		//  public boolean isEmpty();
		//	to check weather HashMap is Empty or not returns ture or false
		System.out.println("Resturents Map is Empty "+H.isEmpty());
		//  public V get(java.lang.Object);
		//	Get Value of HashMap using Key.
		System.out.println("Get Items of Paradise: "+H.get("Paradise"));
		//  final java.util.HashMap$Node<K, V> getNode(java.lang.Object);

		//  public boolean containsKey(java.lang.Object);
		//	To check the values using containsKey
		HashMap	crop=new HashMap();
		crop.put("Rabi", "Wheat, barley, peas, gram, mustard");
		crop.put("Kharif", "Rice, maize, jowar, bajra, tur, moong, urad, cotton, jute, groundnut, soybean");
		crop.put("Zadi", "Seasonal fruits, vegetables, fodder crops");
		System.out.println("Season wise crops in India: "+crop);
		String key;
		System.out.println("Enter Season of crops");
		Scanner sc=new Scanner(System.in);
		key=sc.next();
		if(crop.containsKey(key))
		{
			System.out.println("crops in season "+key+" are: "+crop.get(key));
		}
		else
		{
			System.out.println("crops in season "+key+"are: "+"No crops");
		}
		//	final V putVal(int, K, V, boolean, boolean);
		//  final java.util.HashMap$Node<K, V>[] resize();
		//  final void treeifyBin(java.util.HashMap$Node<K, V>[], int);
		
		//  public void putAll(java.util.Map<? extends K, ? extends V>);
		//	copy one HashMap of content in another HashMap through putALL
		HashMap crop1=new HashMap<>();
		crop1.putAll(crop);
		System.out.println("PutAll crops in next season: "+crop1);
		//  public V remove(java.lang.Object);
		// 	To remove the content through remove and key
		crop1.remove("Zadi");
		System.out.println("After crops of Zadi removed due to heavy floods: "+crop1);
		
		//  final java.util.HashMap$Node<K, V> removeNode(int, java.lang.Object, java.lang.Object, boolean, boolean);
		
		//  public void clear();
		// To clear the content from HashMap.
		crop1.clear();
		System.out.println("Cleared all crops: "+crop1);
		//  public boolean containsValue(java.lang.Object);
		//	To find weather the content of value is there in HashMap or not return true or false
		HashMap alc=new HashMap();
		alc.put("Beer", "Kingfisher Premium");
		alc.put("Wine", "Red Wine");
		alc.put("Gin", "Tanqueray");
		alc.put("Vodka", "Grey Goose");
		alc.put("Whiskey", "Johnnie Walker");
		alc.put("Brandy", "Mansion House");
		alc.put("Rum", "Ron Zacapa, Clement");
		System.out.println("Alchol Types: "+alc);
		System.out.println("Whiskey conatains Johnnie Walker: "+alc.containsValue("Johnnie Walker"));
		
		//  public java.util.Set<K> keySet();
		//	To Get Keyset of content using Set and keySet();
		Set keyset=alc.keySet();
		System.out.println("Alchol Type Available are: "+keyset);
		
		//  final <T> T[] prepareArray(T[]);
		//  <T> T[] keysToArray(T[]);
		//  <T> T[] valuesToArray(T[]);
		
		//  public java.util.Collection<V> values();
		//	To get the Values of Content from HashMap through values();
		System.out.println("Alchol's of Each type: "+alc.values());
		//  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
		//	To Set the data in single pair then will use Set and entrySet() 
		//	It is used for doing fetching operations
		Set s=alc.entrySet();
		System.out.println("Set value of Alchol: "+s);
		// Fetching
		Iterator i=s.iterator();
		for(;i.hasNext();)
		{
			System.out.println(i.next());
		}
		//  public V getOrDefault(java.lang.Object, V);
		//	Once Allocated Key and Value then it will default remains same 
		//	when we change with getOrDefault values also it will original value only  
		HashMap st=new HashMap();
		st.put("Telangana", "Hyderabad");
		st.put("Andhra Pradesh", "Amaravathi");
		st.put("TamilNadu", "Chennia");
		st.put("Karnataka", "Banglore");
		st.put("Karala", "Trivanthapuram");
		st.put("Punjab", "Haryana");
		System.out.println("States and Capitals: "+st.toString());
		System.out.println("Defalut Telanaga State and capital: "+st.getOrDefault("Telangana", "New Delhi"));;
		System.out.println("Defalut Andhra Pradesh State and capital: "+st.getOrDefault("Andhra Pradesh", "New Delhi"));
		System.out.println("Defalut Delhi Union Teritory and capital: "+st.getOrDefault("Delhi", "New Delhi"));
		System.out.println(st);
		//  public V putIfAbsent(K, V);
		//	Method is used to Insert if need to add missing object using putIfAbsent
		st.putIfAbsent("Delhi", "New Delhi");
		System.out.println("After Delhi State: "+st);
		st.putIfAbsent("Delhi", "Delhi city");
		System.out.println("Unchanged Delhi After new city: "+st);
		//  public boolean remove(java.lang.Object, java.lang.Object);
		//	To Remove content of data from HashMap
		
		System.out.println("Removing Delhi from HashMap: "+st.remove("Delhi"));
		System.out.println("After removing Delhi: "+st);
		
		//  public boolean replace(K, V, V);
		//	Replace value from old value to new value using replace(K, V, V);
		st.replace("Punjab", "Haryana", "Chandighar");
		System.out.println("After Replacew of Haryana capital:"+st.toString());
		//  public V replace(K, V);
		st.replace("Andhra Pradesh", "Karnool");
		System.out.println("After Replace of Karnool capital: "+st.toString());
		//	public V computeIfAbsent(K, java.util.function.Function<? super K, ? extends V>);
		//	To Add and compute Arithmetic values or String values if Absent.
		st.computeIfAbsent("West Bengal",k -> "Kolkata");
		st.computeIfAbsent("Haryana", K-> "Chandighar");
		System.out.println("After Computing "+st.toString());
		//  public V computeIfPresent(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
		//	compute values if present in HashMap.
		HashMap gr=new HashMap();
		gr.put("Oil-kg", 200);
		gr.put("BasmathiRice-1kg", 120);
		gr.put("MoongDal-1kg", 110);
		gr.put("Groundnuts", 79);
		System.out.println("Groceries: "+gr.toString());
		gr.computeIfPresent("Oil-kg", (Key, Val) -> 200 + 25);
		System.out.println("Groceries after rate changes: "+gr);
		//  public V compute(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
		//	Compute values and replace the value.
		st.compute("Haryana", (Key, val)->  ("Union Teritory"));
		System.out.println("After Haryana Union Teritory: "+st);
		//  public V merge(K, V, java.util.function.BiFunction<? super V, ? super V, ? extends V>);
		//  public void forEach(java.util.function.BiConsumer<? super K, ? super V>);
		//  public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
		//  public java.lang.Object clone();
		//  final float loadFactor();
		//  final int capacity();
	   		
	
	}

}
/*
Microsoft Windows [Version 10.0.19044.1766]
(c) Microsoft Corporation. All rights reserved.

C:\Users\vinee>javap java.util.HashMap
Compiled from "HashMap.java"
public class java.util.HashMap<K, V> extends java.util.AbstractMap<K, V> implements java.util.Map<K, V>, java.lang.Cloneable, java.io.Serializable {
  static final int DEFAULT_INITIAL_CAPACITY;
  static final int MAXIMUM_CAPACITY;
  static final float DEFAULT_LOAD_FACTOR;
  static final int TREEIFY_THRESHOLD;
  static final int UNTREEIFY_THRESHOLD;
  static final int MIN_TREEIFY_CAPACITY;
  transient java.util.HashMap$Node<K, V>[] table;
  transient java.util.Set<java.util.Map$Entry<K, V>> entrySet;
  transient int size;
  transient int modCount;
  int threshold;
  final float loadFactor;
  static final int hash(java.lang.Object);
  static java.lang.Class<?> comparableClassFor(java.lang.Object);
  static int compareComparables(java.lang.Class<?>, java.lang.Object, java.lang.Object);
  static final int tableSizeFor(int);
  public java.util.HashMap(int, float);
  public java.util.HashMap(int);
  public java.util.HashMap();
  public java.util.HashMap(java.util.Map<? extends K, ? extends V>);
  final void putMapEntries(java.util.Map<? extends K, ? extends V>, boolean);
  public int size();
  public boolean isEmpty();
  public V get(java.lang.Object);
  final java.util.HashMap$Node<K, V> getNode(java.lang.Object);
  public boolean containsKey(java.lang.Object);
  public V put(K, V);
  final V putVal(int, K, V, boolean, boolean);
  final java.util.HashMap$Node<K, V>[] resize();
  final void treeifyBin(java.util.HashMap$Node<K, V>[], int);
  public void putAll(java.util.Map<? extends K, ? extends V>);
  public V remove(java.lang.Object);
  final java.util.HashMap$Node<K, V> removeNode(int, java.lang.Object, java.lang.Object, boolean, boolean);
  public void clear();
  public boolean containsValue(java.lang.Object);
  public java.util.Set<K> keySet();
  final <T> T[] prepareArray(T[]);
  <T> T[] keysToArray(T[]);
  <T> T[] valuesToArray(T[]);
  public java.util.Collection<V> values();
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  public V getOrDefault(java.lang.Object, V);
  public V putIfAbsent(K, V);
  public boolean remove(java.lang.Object, java.lang.Object);
  public boolean replace(K, V, V);
  public V replace(K, V);
  public V computeIfAbsent(K, java.util.function.Function<? super K, ? extends V>);
  public V computeIfPresent(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public V compute(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public V merge(K, V, java.util.function.BiFunction<? super V, ? super V, ? extends V>);
  public void forEach(java.util.function.BiConsumer<? super K, ? super V>);
  public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public java.lang.Object clone();
  final float loadFactor();
  final int capacity();
  java.util.HashMap$Node<K, V> newNode(int, K, V, java.util.HashMap$Node<K, V>);
  java.util.HashMap$Node<K, V> replacementNode(java.util.HashMap$Node<K, V>, java.util.HashMap$Node<K, V>);
  java.util.HashMap$TreeNode<K, V> newTreeNode(int, K, V, java.util.HashMap$Node<K, V>);
  java.util.HashMap$TreeNode<K, V> replacementTreeNode(java.util.HashMap$Node<K, V>, java.util.HashMap$Node<K, V>);
  void reinitialize();
  void afterNodeAccess(java.util.HashMap$Node<K, V>);
  void afterNodeInsertion(boolean);
  void afterNodeRemoval(java.util.HashMap$Node<K, V>);
  void internalWriteEntries(java.io.ObjectOutputStream) throws java.io.IOException;
}

C:\Users\vinee>
*/