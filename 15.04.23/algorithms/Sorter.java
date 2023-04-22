package algorithms;

public class Sorter
{
    Strategy strategy;
    
   	void setStrategy(Strategy i)
    {
    	this.strategy=i;
    }
    
    void display(double array[], Strategy setStrategy) 
    {
		setStrategy.sort(array);
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);
	}
	
	public void print(double array[])
	{
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);
	}

    public static void main(double[] arr)
    {
        //double arr[]={10,14,12,1,2,-85,45,-25,3,4};
		Sorter ob = new Sorter();
		
		ob.display(arr,new Bubble());
		System.out.println("\n");
		ob.display(arr,new Insertion());
		System.out.println("\n");
		ob.display(arr,new Merge());
		System.out.println("\n");
    }
}
