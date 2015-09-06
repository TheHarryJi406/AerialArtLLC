package com.array;



	public class ArrayStructures{
	
					int theArray[] = {20,15,20,40,10,15,16,30,50,5,19,20};
					private int arraySize = 11;
	
					
					
					
			/*This method is for Printing the total array*/
					
					public int printArray(){
		
			System.out.println("----------");
			
					for(int i=0;i<arraySize;i++){
			
			System.out.print("|"  + i +  "|");
			System.out.println(theArray[i]+ "|");
			System.out.println("----------");
			
			}
					return arraySize;

}	
					
/*This method show the value in array of given number*/		
					
	public int getValueIndex(int index){
		if(index<arraySize) return theArray[index];
		return 0;
	}
	
	
	/*This is for searching the given value in Array*/
	public boolean doesArrayContainThisValue(int searchValue){
		
		boolean valueInArray = false;
		for(int i=0;i<arraySize;i++){
			
			if(theArray[i] == searchValue){
				
				 valueInArray = true;
			}
		}
		
		return valueInArray;
	}
	
	
	
	
	
	/*This method is for deleting*/
	
	public int deleteIndex(int value){
		
		if(value<arraySize){
			
			for(int i = value;i<(arraySize-1); i++){
				
				theArray[i] = theArray[i+1];
				
				
			}
			
			arraySize--;
			
		}
		return value;
}
	
	
	
	/*This method is for inserting value*/
	
	public int insertValue(int value){
		
		if(arraySize<50){
			
			theArray[arraySize]= value;
			
			arraySize++;
		}
		return value;
		
	}
	
	
	/*This method is for linear search*/
	public String linearSearchForValue(int value){
		
		boolean valueInArray = false;
		
		String indexsWithValue = "";
		
		System.out.println("The value was found in the Following--->>>");
		
		for (int i = 0;i<arraySize;i++){
			
			if(theArray[i] == value){
				valueInArray = true;
				
				System.out.print(i + " ");
				
				indexsWithValue=i+" ";
				
			}
		}
		
		if(!valueInArray){
			
			indexsWithValue = "None";
			
			System.out.println(indexsWithValue);
		}
		
		System.out.println();
		return indexsWithValue;
	}
	
public static void main(String args[]){
	
	ArrayStructures newArray = new ArrayStructures();
	newArray.printArray();
	System.out.println(newArray.getValueIndex(7));
	System.out.println(newArray.doesArrayContainThisValue(20));
	newArray.deleteIndex(9);
	newArray.printArray();
	newArray.insertValue(555555);
	newArray.printArray();
	newArray.linearSearchForValue(20); 
	
}
		
	}	
	
	


