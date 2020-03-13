package com.capg.demo;

//public class LiftTable {
	public interface Liftable {
		 public void liftLoad();
		 public void setHook();// AA
		}
		public abstract class Vehicle implements Liftable {
		// BB
		 public void liftLoad() {}
		 // XX
		}
		public class Crane extends Vehicle {
		 public void liftLoad() {}
		 // YY

}
