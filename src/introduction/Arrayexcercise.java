package introduction;

public class Arrayexcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int x;
		int y;
		int a;
		int a[x][y]= new int[2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;*/
		//int x;
		//int y;
		/*int a[][]={{2,4,5},{3,4,7}};
		 
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
		
		
		 
		for(int j=0;j<a.length;j++) 
		{
			System.out.println(a[j]);
		}*/
		//to find minimum and maximum no.in the array,we have to assume the first value in array is min/max.
		
		
		int abc[][]= {{2,3,4},{5,1,8},{7,9,10}};
		int max=abc[0][0];
		 
		for(int i=0;i<3;i++)//for row 3*3
		 {
			 
			for(int j=0;j<3;j++)//for coloumn 
			 {
				
				if(abc[i][j]>max) //if(abc[i][j]<min)
				{
				
					max=abc[i][j];	
				}
			 }
		 }
		 System.out.println("Max is : "+max);
		 System.out.println("Max is : "+max);
		 System.out.println("Max is : "+max);
		 System.out.println("Max is : "+max);
		 }
		
}	

    /*  int abc[][]= {{2,3,4},{5,1,8}};
      for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 System.out.println(abc[i][j]);
			 }
			 }
		 }*/
		 
