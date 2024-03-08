package br.com.senaisp.bauru.sarah.secao03;

public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
    	//eggsPerChicken = 5, chickenCount = 3 - primeiro cenario
    	//eggsPerChicken = 4, checkenCount = 8 - segundo cenario
    	int eggsPerChicken = 4, chickenCount = 8;
    	int totalEggs = 0;
    	//Na segunda, ao meio dia, Mr. Brown recolhe os ovos
    	totalEggs = totalEggs + chickenCount * eggsPerChicken;
    	//Na terça, Mr. Ganha uma galinha e recolhe os ovos
    	totalEggs += ++chickenCount * eggsPerChicken;
    	//Na quarta, ele perde metade das galinhas e depois recolhe os ovos 
    	totalEggs += chickenCount / 2 * eggsPerChicken;
    	
        System.out.println(totalEggs);
    }   
}
