package Music;

public class Musik {

    public static void main(String[] args) {
        // TODO code application logic here
       Pop []popes = new Pop[5]; 
       String sd[] = {"pop","rock"};
       int longCd = 0,typeMusPop = 0, typeMusRock = 0;
       
       
       for (int i=0; i<popes.length; i++){
        int j = new java.util.Random().nextInt(2);
        String s = sd[j];
        int d = new java.util.Random().nextInt(60);
        popes[i] = new Pop(s,d);
             
       }
       System.out.println("Recordable discs");
       for (int i=0; i<popes.length; i++){
        longCd = longCd + popes[i].longs1;
        if (popes[i].name1.equals("pop")){
        	typeMusPop++;	
        } else typeMusRock++;
    
    }
       System.out.println("Total playing time - " + longCd);
       if (typeMusPop>typeMusRock){
    	   System.out.println("Genre Pop total disk");   
       }else System.out.println("Genre Rock total disk");
       
       
       
    } 
}