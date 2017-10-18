package com.vk.lambda;

public class LambdaTest {

	public static void main(String[] args) {
		Runnable noArgs=()->System.out.println("-------无参Lambda表达式------");
		new Thread(noArgs).start();
		System.out.print("liyuejin");
		//简洁方式一行代码搞定
		new Thread(()->System.out.println("-------无参Lambda兰姆达表达式------")).start();
	}

}