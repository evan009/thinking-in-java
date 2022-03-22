package com.evan.thinking.java.archive.pattern.singletion;

public class Singleton3 {

	private Singleton3() {

	}

	public static Singleton3 getInstance() {
		return Holader.instance;
	}

	private static class Holader {
		private  static Singleton3 instance = new Singleton3();
	}
}
