abstract class Matrix implements Cell
{    
    matrix(int i,int j)
    {
        //new worksheet
    }

    //for adding new rows
   	double[][] add_new_rows(double[][] worksheet,int i,int j)
   	{
    	return worksheet;
   	}

    //for adding new columns
   	double[][] add_new_column(double[][] worksheet,int i,int j)
   	{
    	return worksheet;
   	}

	//for deleting rows
    double[][] delete_a_row(double[][] worksheet,int i,int j)
    {   
    	return worksheet;    
    }
    
    //for deleting columns
   	double[][] delete_a_column(double[][] worksheet,int i,int j)
   	{
    	return worksheet;
   	}
   	
    public double calculator(String exp)
    {
        //to do required calculations 
        return result;
    }
}
