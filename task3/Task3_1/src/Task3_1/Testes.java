package Task3_1;

public class Testes {
    
    String arrayTest[] = {"test","test","test","test","test","test","test","test","test"};
    
    public void arrayon(){
    StringBuilder builder = new StringBuilder();
    StringBuilder builderWord = new StringBuilder();
    
    for (int i=0; i<arrayTest.length; i++){
        builderWord.append(arrayTest[i].substring(0, 1).toUpperCase());
        builderWord.append(arrayTest[i].substring(1));
        builder.append(builderWord);
       // System.out.println(builder);
        builderWord.delete(0, builderWord.length()+1);
       
    }
    System.out.println(builder);
  }
    
}