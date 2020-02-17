package com.epm.CleanCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
class CostDetection{
	public double cost(String materialstandard,double squarefeet) {
		double cost=0.0;
		if(materialstandard.equals("standardmaterial")){
			cost=1200*squarefeet;
		}
		else if(materialstandard.equals("abovestandardmaterial")) {
			cost=1500*squarefeet;
		}
		else if(materialstandard.equals("highstandardmaterial")) {
			cost=1800*squarefeet;
		}
		else if(materialstandard.equals("highstandardmaterialandfullyautomatic")) {
			cost=2500*squarefeet;
		}
		return cost;
		
	}
	
}

public class CostEstimation {

	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		double squarefeet=Double.parseDouble(br.readLine());
		//br.readLine();
		String materialstandard=br.readLine();;
		CostDetection c=new CostDetection();
		bw.write("Total construction cost="+c.cost(materialstandard,squarefeet));
		bw.flush();
	}

}
