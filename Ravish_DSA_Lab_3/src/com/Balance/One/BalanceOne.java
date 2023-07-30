package com.Balance.One;
import java.util.Stack;

public class BalanceOne {
	
	public boolean validate(String str)
	{	
		Stack<Character> st=new Stack<Character>();
		
		
		boolean returnValue=false;
		
		
		for(int i=0;i<str.length();i++)
		{	
			char b=str.charAt(i);
			
			if(b=='(' || b=='{' || b=='[')
			{
				st.push(b);
			}
			
			else if(b==']' || b=='}' || b==')')
			{	
				
				if(st.empty())
				{
					returnValue=false;
					break;
				}
				
				char top=st.pop();
				if ( (b==']'&&top=='[') || (b=='}'&&top=='{') || (b==')'&&top=='(' ))
				{	
					
					returnValue=true;
				}
				else
				{
					returnValue=false;
					break;
				}
			}
		}
		
		if(!st.empty())
		{
			returnValue=false;
		}
		
		return returnValue;
}
}
