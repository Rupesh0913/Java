class bufferMethod
{
 public static void main( String args[] )
 {
  StringBuffer s = new StringBuffer("Coding With Java");
     
  System.out.println("\n String = "+s);
  
  System.out.println("\n Length = "+s.length() );

  s.append(" Change Everything");
  System.out.println("\n Appended String = " +s );
   
  s.insert(11," professional");
  System.out.println("\n Inserted String = "+s );
  
  s.setLength(6);
  System.out.println("\n After setting length String = "+s );
 
 }
}
