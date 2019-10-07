
public class Marathon {

	public static void main(String[] args) {
		
	String[] names= {"Elena","Thomas","Hamilton","suzie","phil","Matt",
   		 "Alex","Emma","John","James","Jane","Emily","Daniel"
   		 ,"Neda","Aaron","Kate"};
    int [] time= {341,273,278,329,445,402,388,275,243,334,412,393,299,343,317,265};
    
    int i=fastestRunner(time);
   
    System.out.println("Fastest Runner Name :" +names[i]+"    Time Taken    "+time[i]  +  " minutes");
    
    int j= secondBestRunner(time);
    System.out.println("Second best Runner Name :" +names[j]+"    Time Taken    "+time[j]  +  " minutes");
	}

	
    
    public static int fastestRunner(int[] tTimes) {
     int  intArrayLength=tTimes.length;
     int min=tTimes[0];
     int index=0;
     for(int i=0;i<intArrayLength;i++) {
    	 
   	  if(min>tTimes[i]) {
   		  min=tTimes[i];
   		  
   		  index=i;
   	  }
     }
     
    return index;
}

	

 public static int secondBestRunner(int[] ttimes) {
	 int i=fastestRunner(ttimes);
	 int len=ttimes.length;
	 int firstMin=ttimes[i];
	 
	 int secondMin=ttimes[0];
	 int index=0;
	 for(int j=0;j<len;j++) {
		
		 if((ttimes[j]<secondMin)&&(ttimes[j]!=firstMin)) {
			 secondMin=ttimes[j];
			 index=j;
			 
		 }
	 }
	
	 return index;
	 }
 }
