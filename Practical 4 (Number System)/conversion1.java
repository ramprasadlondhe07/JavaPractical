import java.util.Scanner;

class Practical4
{
	public static void main(String args[])
	{
		Practical4 obj=new Practical4();
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Select The Option");
		System.out.println("\n 1.Byte");
		System.out.println("\n 2.Short");
		System.out.println("\n 3.Byte or Short");
		System.out.println("\n 4.Decimal To -> ");
		System.out.println("\n 5.Binary To -> ");
		System.out.println("\n 6.Octal To -> ");
		System.out.println("\n 7.Hexadecimal To -> ");
			
		int ch=sc.nextInt();
	//	int result=0;
		
		switch(ch)
		{
			case 1:
			  System.out.println("Enter a Number");
		    int num=sc.nextInt();
				System.out.println("Byte"+obj.getBytes(num));
				break;
				
			case 2:
			  System.out.println("Enter a Number");
	  	  num=sc.nextInt();
			
				System.out.println("Short"+obj.getShort(num));
				break;
				
			case 3:
			
        System.out.println("Enter a Number");
		    num=sc.nextInt();
		
			  System.out.println("Choose Conversion Type : 'Byte' or 'Short'");
        String type=sc.next();  //user input is stord in variable type
        
        if(type.equalsIgnoreCase("byte"))
        {
           System.out.println("Byte : "+obj.getBytes(num));
        }
        else if(type.equalsIgnoreCase("short"))
        {
			    System.out.println("Short : "+obj.getShort(num));
        }
        else
        {
          System.out.println("Invalid Conversion Type");
        }
        break;
        
      case 4:
        
       System.out.println("Choose Conversion Type Decimal To -->>: 'Binary(B)'/ 'Octal(O)' / 'Hexadecimal(H)'");
       String conversionType=sc.next();
  
       System.out.println("Enter a Number");
       String numString = sc.next(); // Read input as a string
        
        if(conversionType.equalsIgnoreCase("B"))
        {
            System.out.println("\"" + obj.decimalToBinary(numString) + "\"");
        }
        else if(conversionType.equalsIgnoreCase("O"))
        {
           System.out.println("\"" + obj.decimalToOctal(numString) + "\"");
        }
        else if(conversionType.equalsIgnoreCase("H"))
        {
          System.out.println("\"" + obj.decimalToHexa(numString) + "\"");
        }
        else
        {
          System.out.println("Invalid Choice.....");
        }
        break;
        
      case 5:
       System.out.println("Choose Conversion Type Binary To -->>: 'Decimal(D)' / 'Octal(O)' / 'Hexadecimal(H)'");
       String binaryconversionType=sc.next();
       
       System.out.println("Enter a Binary Number(starts 0b)");
       String binaryString = sc.next(); // Read input as a string
       
       if(binaryString.startsWith("0b"))
       {
          binaryString=binaryString.substring(2);
       }
       else
       {
         System.out.println("!!!Invalid Input It is not a valid binary number.");
         break;
       }
       
       if(binaryconversionType.equalsIgnoreCase("D"))
       {
         System.out.println("\"" + obj.binaryToDecimal(binaryString) + "\"");
       }
       else if(binaryconversionType.equalsIgnoreCase("O"))
       {
         System.out.println("\"" + obj.binaryToOctal(binaryString) + "\"");
       }
       else if(binaryconversionType.equalsIgnoreCase("H"))
       {
         System.out.println("\"" + obj.binaryToHexa(binaryString) + "\"");
       }
       else
       {
        System.out.println("Invalid Choice.....");
       }
       break;
       
     case 6:
       System.out.println("Choose Conversion Type Octal To -->>: 'Decimal(D)' / 'Binary(B)' / 'Hexadecimal(H)'");
       String octalconversionType=sc.next();
       
       System.out.println("Enter a Octal Number(starts '0')");
       String octalString = sc.next(); // Read input as a string
       if(octalString.startsWith("0"))
       {
          octalString=octalString.substring(1);
       }
       else
       {
         System.out.println("!!!Invalid Input It is not a valid Octal number.");
         break;
       }
       
       if(octalconversionType.equalsIgnoreCase("D"))
       {
         System.out.println("\"" + obj.octalToDecimal(octalString) + "\"");
       }
       else if(octalconversionType.equalsIgnoreCase("B"))
       {
         System.out.println("\"" + obj.octalToBinary(octalString) + "\"");
       }
       else if(octalconversionType.equalsIgnoreCase("H"))
       {
         System.out.println("\"" + obj.octalToHexa(octalString) + "\"");
       }
       else
       {
          System.out.println("Invalid Choice.....");
       }
       break;
       
     case 7:
       System.out.println("Choose Conversion Type Hexadecimal To -->>: 'Decimal(D)' / 'Binary(B)' / 'Octal(O)'");
       String hexaconversionType=sc.next();
       
       System.out.println("Enter a Hexa Number(starts '0x')");
       String hexaString = sc.next(); // Read input as a string
       
       if(hexaString.startsWith("0x"))
       {
          hexaString=hexaString.substring(2);
       }
       else
       {
         System.out.println("!!!Invalid Input It is not a valid Hexadecimal number.");
         break;
       }
      
       if(hexaconversionType.equalsIgnoreCase("D"))
       {
        System.out.println("\"" + obj.hexaToDecimal(hexaString) + "\"");
       }
       else if(hexaconversionType.equalsIgnoreCase("B"))
       {
        System.out.println("\"" + obj.hexaToBinary(hexaString) + "\"");
       }
       else if(hexaconversionType.equalsIgnoreCase("O"))
       {
        System.out.println("\"" + obj.hexaToOctal(hexaString) + "\"");
       }
       else
       {
          System.out.println("Invalid Choice.....");
       }
       break;
      
      default :
        System.out.println("You Entered Wrong Choice...");
		}
	}
			
	
	public int getBytes(int num)
	{
		int res;
		int temp=num/128;
		if(temp%2==0)
		{
			res=num%128;
		}
		
		else if(num>0)
		{
		  res=num % 128 - 128;
		}
		else
		{
		  res=num % 128 + 128;
		}
		return res;
 	}
 	
 	public int getShort(int num)
	{
		int res;
		int temp=num/32768;
		if(temp%2==0)
		{
			res=num%32768;
		}
		else if(num>0)
		{
			res=num % 32768 - 32768;
		}
		else
		{
		  res=num % 32768 + 32768;
		}
		return res;
 	}
 	
 
  public String decimalToBinary(String numString)
  {
  
    int decimal =Integer.parseInt(numString); //Convert String To Integer
    String binary="";
  
    if(decimal==0)
    {
      return "0";
    }
    while(decimal>0)
    {
      binary=(decimal % 2)+binary;
      decimal=decimal/2;
    }
    return binary;
  
  }
  
  public String decimalToOctal(String numString)
  {
    int decimalNum=Integer.parseInt(numString); //Convert String To Integer
    String octal="";
    if(decimalNum==0)
    {
      return "0";
    }
    
    while(decimalNum>0)
    {
      octal=(decimalNum%8)+octal;
      decimalNum=decimalNum/8; //Divide Number to 8 because To calculate the octal number
    }
    return octal;
  }
 
 public String decimalToHexa(String numString)
 {
  int decimalNum=Integer.parseInt(numString);
  String hexaValues="0123456789ABCDEF";
  String hexaResult="";
  if(decimalNum==0)
  {
    return "0";
  }
  
  while(decimalNum>0)
  {
    hexaResult=hexaValues.charAt(decimalNum%16)+hexaResult; //After evaluating right it assigns to left and store it 
    decimalNum=decimalNum/16;
  }
  return hexaResult;
 }
 
 public int binaryToDecimal(String binaryString)
 {
  int decimal=0;
  int length=binaryString.length();
  for (int i=0;i<length;i++)
  {
    decimal+=Character.getNumericValue(binaryString.charAt(i))*Math.pow(2,length-i-1);
  }
  return decimal;
 }
 
 
 public String binaryToOctal(String binaryString)
 {
  int decimal=0;
 String octal="";
 int length=binaryString.length();
  for (int i=0;i<length;i++)
  {
    decimal+=Character.getNumericValue(binaryString.charAt(i))*Math.pow(2,length-i-1);
  }
  while(decimal>0)
  {
      octal=(decimal%8)+octal;//each remainder will be added after resulting each iterate
      decimal=decimal/8; 
      //Divide Number to 8 because To calculate the octal number
  }
    return octal;
 
 }
 
 public String binaryToHexa(String binaryString)
 {
   int decimal=0;
  String hexaValues="0123456789ABCDEF";
  String hexaResult="";
  int length=binaryString.length();
  for (int i=0;i<length;i++)
  {
    decimal+=Character.getNumericValue(binaryString.charAt(i))*Math.pow(2,length-i-1);
   
  } 
  while(decimal>0)
  {
    hexaResult=hexaValues.charAt(decimal%16)+hexaResult;
    decimal=decimal/16;
  }
  return hexaResult;
 }
 
 public int octalToDecimal(String octalString)
 {
  int octal=0;
  int length=octalString.length();
  for (int i=0;i<length;i++)
  {
    octal+=Character.getNumericValue(octalString.charAt(i))*Math.pow(8,length-i-1);
   
  } 
  return octal;
  
 }
 
 public String octalToBinary(String octalString)
 {
  int decimal=0;
  String binary="";
  int length=octalString.length();
  for (int i=0;i<length;i++)
  {
    decimal+=Character.getNumericValue(octalString.charAt(i))*Math.pow(8,length-i-1);
  } 
  while(decimal>0)
    {
      binary=(decimal % 2)+binary;
      decimal=decimal/2;
    }
    return binary;
 }
 public String octalToHexa(String octalString)
 {
  int decimal=0;
  String hexaValues="0123456789ABCDEF";
  String hexaResult="";
  int length=octalString.length();
  for (int i=0;i<length;i++)
  {
    decimal+=Character.getNumericValue(octalString.charAt(i))*Math.pow(8,length-i-1);
  } 
  while(decimal>0)
    {
      hexaResult=hexaValues.charAt(decimal%16)+hexaResult;
      decimal=decimal/16;
    }
    return hexaResult;
 }
 
 public int hexaToDecimal(String hexaString)
 {
 int decimal=0;
 String hexaChars="0123456789ABCDEF";
 hexaString=hexaString.toUpperCase();
  int length=hexaString.length();
  for (int i=0;i<length;i++)
  {
    if(hexaChars.indexOf(hexaString.charAt(i))==-1)
    {
      System.out.println("Invalid Character: ' " +hexaString.charAt(i) + "' in hexadecimal.");
      return -1;
    }
   decimal+=Character.getNumericValue(hexaString.charAt(i))*Math.pow(16,length-i-1);
  } 
  return decimal;
 }
 
 public String hexaToBinary(String hexaString)
 {
 int decimal=0;
 String binary="";
 String hexaChars="0123456789ABCDEF";
 hexaString=hexaString.toUpperCase();
  int length=hexaString.length();
  for (int i=0;i<length;i++)
  {
    if(hexaChars.indexOf(hexaString.charAt(i))==-1)
    {
      System.out.println("Invalid Character: ' " +hexaString.charAt(i) + "' in hexadecimal.");
      return "Invalid Input";
    }
   decimal+=Character.getNumericValue(hexaString.charAt(i))*Math.pow(16,length-i-1);
  } 
  while(decimal>0)
  {
    binary=(decimal%2)+binary;
    decimal=decimal/2;
  }
   return binary;
 }

 public String hexaToOctal(String hexaString)
 {
    int decimal=0;
 String binary="";
 String hexaChars="0123456789ABCDEF";
 hexaString=hexaString.toUpperCase();
  int length=hexaString.length();
  for (int i=0;i<length;i++)
  {
    if(hexaChars.indexOf(hexaString.charAt(i))==-1)
    {
      System.out.println("Invalid Character: ' " +hexaString.charAt(i) + "' in hexadecimal.");
      return "Invalid Input";
    }
   decimal+=Character.getNumericValue(hexaString.charAt(i))*Math.pow(16,length-i-1);
  } 
  while(decimal>0)
  {
    binary=(decimal%8)+binary;
    decimal=decimal/8;
  }
   return binary;
 }
}


