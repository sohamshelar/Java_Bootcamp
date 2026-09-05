package com.Day6Mon24;

public class Assign1ArrayOpreations {
	public boolean search(int arr[],int num)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == num)
			{
				return true;
			}
		}
		return false;
	}
	
	public void sumOfArray(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of Integer Array is " +sum);
	}
	
	public boolean search(String str[] ,String st)
    {
        for(int i = 0; i < str.length; i++)
        {
            if(str[i].equals(st))
            {
                return true;
            }
        }

        return false;
    }
	
	public void sumOfArray(char ch[])
	{
		String sum="";
		for(int i=0;i<ch.length;i++)
		{
			sum=sum+ch[i];
		}
		System.out.println("Sum of charater array = " + sum);
			
	}
}
