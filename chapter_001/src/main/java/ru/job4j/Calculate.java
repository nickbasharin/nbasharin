package ru.job4j;

/**
*Класс вывода строки в консоль
*/
public class Calculate {
	/**
	* Конструктор вывода строки в консоль
	* @param arg - arg
	*/
	public static void main(String[] arg) {
		System.out.println("Hello world.");
	}
	
	/**
* Method echo.
* @param name Your name.
* @return Echo plus your name.
*/
public String echo(String name) {
    return "Echo, echo, echo : " + name;
}
	
}