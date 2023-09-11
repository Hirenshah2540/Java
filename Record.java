
public class Record {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StudentInfo [] si1 ;   // array of object
       
       si1 = new StudentInfo[5];  
       
       
       si1[0] = new StudentInfo(1, "aaa");
       //System.out.println(si1[0].toString());
       si1[1]=  new StudentInfo(2, "bbb");
       //System.out.println(si1[1].toString());
	
          for(int i=0;i<2;i++) {
        	  System.out.println(si1[i].toString()) ;
          }
}
}
