package com.kinshukPaul.DataStructure.Stack.HackerEarthProblems;
import java.lang.reflect.Array;
import java.util.*;
public class FrustratedCoders {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int numberOfCoders = s.nextInt();
		Integer [] arr = new Integer[numberOfCoders];
		for(int i =0 ; i < numberOfCoders ; i ++)
		{
			arr[i]=s.nextInt();
		}
		
		Arrays.sort(arr);
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = arr.length-1 ; i >= 0 ; i --)
		{
			stack.push(arr[i]);
		}
		FrustratedCoders f = new FrustratedCoders();
		int sum = f.solution(stack);
		System.out.print(sum);
	} 
	private int solution(Stack<Integer> stack) {
		Stack<Integer> tempStack = new Stack<Integer>();
		Stack<Integer> tempStack2 = new Stack<Integer>();
		Integer victim, shooter;
		System.out.println(stack.isEmpty());
		while(!stack.isEmpty()) {
			if(tempStack.isEmpty()) {
				victim = stack.pop();
				shooter = stack.pop();	
				System.out.println(victim+ " "+ shooter);
			}
			else
			{
				victim = tempStack.pop();
				shooter = stack.pop();	
			}
			if(shooter > victim) {
				tempStack.push(shooter);
			}
			else if(shooter == victim) {
				Integer victim1;
				boolean flag = false;
				
				if(tempStack.isEmpty()) {
					tempStack.push(shooter);
					tempStack.push(victim);
				}
				else
				{	
					tempStack2.push(victim);
					while(!tempStack.isEmpty()) {
						victim1 = tempStack.pop();
						if(victim1 < shooter) {
							tempStack.push(shooter);
							flag = true;
							break;
							}
						else
							tempStack2.push(victim1);
							
					}
				while(!tempStack2.isEmpty()) {
					Integer v = tempStack2.pop();	
					tempStack.push(v);
					}
				if(!flag)
					tempStack.push(shooter);
				}
			}
		}
		Integer sum = 0 ;
		while(!tempStack.isEmpty())
			sum += tempStack.pop();
		return sum;
	}
	
}
		/*Stack<Integer> tempStack = new Stack<Integer>();
		Iterator iter = stack.iterator();
		while(iter.hasNext()) {
			int val1 = stack.pop();
			int val2 = stack.pop();
			if(val1>val2)
				stack.push(val1);
			else if(val1 == val2)
				tempStack.push(val1);
			else
				stack.push(val2);	
		}
		int sum = 0;
		while(iter.hasNext())
			sum += (int)iter.next()+solution(tempStack);
		return sum;
		*/
		//Integer[] flag = new Integer[stack.length];
		/*for(int i = 0 ; i < flag.length ; i ++)
			flag[i]=1;
		try {*//*
		for(int i = 0 ; i < stack.length ; i ++)
		{
			if(stack [i] > stack [i+1])
				stack[i+1] = 0;
			else if(stack[i+1] > stack[i])
				stack[i]=0;
			else
				continue;
			
		}*/
/*		for(int i = 0 ; i < stack.length ; i++)
		{
			if(stack[i] > stack [i+1] && flag[i]==1 &&flag[i+1]==1 && stack[i] !=0 && stack[i+1]!= 0)
			{
				stack[i+1]=0;
				flag[i]=0;
			}
			
		}
		
		
		
		}
		catch(ArrayIndexOutOfBoundsException e) {}
		int sum =0;
		for(int i =0 ; i < stack.length ; i++) {
			
		System.out.print(stack[i]+ " " );
			sum += stack[i];
		
		}

		return sum;
	}
	}
		
		*/
		
		
		
		/*		try {
		for(int i = 0 ; i < stack.length ; i++)
		{
			int j = i + 1 ;
			if(!tempStack.isEmpty()) {
				Iterator<Integer> index = tempStack.iterator();
				if(stack[i] > index.next())
				{
					tempStack.pop();
				}
			}
			else if(stack[i] > stack[j])
			{
				stack[j]=0;
			}
			else if(stack[i] == stack[j])
			{
				tempStack.add(stack[i]);
				stack[i]=0;
			}
			else
				stack[i]=0;
		}
	}
		catch(ArrayIndexOutOfBoundsException e) {
			
		}
		int sum=0;
System.out.println();		
		for(int i = 0; i < stack.length ; i++) {
			sum+=stack[i];
			System.out.print(stack[i]+" ");
		}
		System.out.println("\n"+sum);
			
	}
		
*/	
