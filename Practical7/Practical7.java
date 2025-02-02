class Practical7
{

	String displayR(int row,int size)
	{
	      String character,symbol;
	      character="";
		    symbol="";
		      for(int col=1;col<=size;col++)
		      {
		      
		          if (row == 1 || col == 1 || row == size/2 || col ==size && row<=size/2 || (row == col && row>=size/2) ) 
		          {
		              symbol+="* ";
		          }
		          else
		          {
		            symbol+="  ";
		          }
		      }
		     character+=symbol;
	       return character;
	}
	
	
	String displayA(int row,int size)
	{
	      String character,symbol;
	      character="";
		    symbol="";
		      for(int col=1;col<=size;col++)
		      {
		          if (row == 1 || col == 1 || row == size/2 || col ==size ) 
		          {
		              symbol+="* "; 
		          }
		          else
		          {
		            symbol+="  "; 
		          }
		      }
		      character+=symbol;
		      return character;
	}
	
	
	String displayM(int row,int size)
	{
	        String character,symbol;
	        character="";
		      symbol="";
		      for(int col=1;col<=size;col++)
		      {
		          if (col == 1 || col == size ||  row + col == size+1 && row<=size/2+1  || (row == col && row<=size/2)) 
		          {
		              symbol+="* ";
		          }
		          else if(row == size / 2 && col == size / 2)
		          {
		            symbol+="* ";
		          }
		          else
		          {
		              symbol+="  ";
		          }
		      }
		      character+=symbol;
		     return character;
	}
	
	
	String displayP(int row,int size)
	{
	      String character,symbol;
	      character="";
		    symbol="";
		      for(int col=1;col<=size;col++)
		      {
		          if (row == 1 || col == 1 || row == size/2 || col ==size && row<=size/2 ) 
		          {
		              symbol+="* ";
		          }
		          else
		          {
		            symbol+="  ";
		          }
		      }
		     character+=symbol;
		     return character;
	}
	
	String displayS(int row,int size)
	{
	     String character,symbol;
	      character="";
		    symbol="";
	    for(int col=1;col<=size;col++)
	    {
	        if( row == 1 || col == 1 && row<=size/2 || col == size && row>=size/2 || row == size )
	        {
	          symbol+="* ";
	        }
	        else if( row == size/2  )
	        {
	         symbol+="* ";
	        }
	        else
	        {
	          symbol+="  ";
	        }
	    }
	    character+=symbol;
	    return character;
	}
	
	
	String displayD(int row,int size)
	{
	      String character,symbol;
	      character="";
		    symbol="";
		      for(int col=1;col<=size;col++)
		      {
		          if (col == 1 || (row == 1 && col <=size-1) || row == size && col <=size-1 || ((row >1 && row <=size-1) && col == size)) 
		          {
		              symbol+="* ";
		          }
		          else
		          {
		           symbol+="  ";
		          }
		      }
		      character+=symbol;
		      return character;
	}
	
	public static void main(String args[])
	{
		Practical7 obj=new Practical7();
		int size=Integer.parseInt(args[0],10);
		
		for(int row=1;row<=size;row++)
		{
		        System.out.println(obj.displayR(row,size)+"  "+
		        obj.displayA(row,size)+"  "+
		        obj.displayM(row,size)+"  "+
		        obj.displayP(row,size)+"  "+
		        obj.displayR(row,size)+"  "+
		        obj.displayA(row,size)+"  "+
		        obj.displayS(row,size)+"  "+
		        obj.displayA(row,size)+"  "+
		        obj.displayD(row,size));
		}
	}
}




