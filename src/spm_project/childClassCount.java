package spm_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class childClassCount {

	public void CheckInheritance() {
		String fileLocation;
        String words,words2;
        String line = null;

        String[] cs1keywords = {"extends"};
        String[] cs2keywords = {"implements"};
        String[] cs3keywords = {","};
	
		int complexity = 2;
	
		int totalcomplexity = 0;

        try {
        	
            fileLocation = "C:\\Users\\Geethika\\Desktop\\Code1.txt";
            FileReader filereader = new FileReader(fileLocation);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            line = bufferedreader.readLine();
            while (line != null) {
                StringTokenizer stringToken = new StringTokenizer(line);
                
                
                while (stringToken.hasMoreTokens()) {
                    words = stringToken.nextToken();
                   
                    for (int i = 0; i < cs1keywords.length; i++) {
                        if (cs1keywords[i].equals("//")) {
                            break;
                        } else {
                            if (cs1keywords[i].equals(words)) {
                                complexity=complexity+1;
                            }else if(cs2keywords[i].equals(words)) {
                            	
                            	 String line2=line;
                            	 complexity=complexity+1;
                            	 
//                            	 Pattern p = Pattern.compile("(\\w+)\\W+implements\\W+(\\w+)");
//                            	 Matcher matcher = p.matcher(line2);
//                            	 if (matcher.find())
//                            	 {
//                            	      System.out.println("Whole word is :"+matcher.group(5));
//                            	 }
                            	//System.out.println(line2);
                            	 StringTokenizer stringToken2 = new StringTokenizer(line2); 
                            	 while (stringToken2.hasMoreTokens()) {
		         	                    words2 = stringToken2.nextToken();
		         	                   System.out.println(words2);
		         	                    
		         	                 
		         	                   for (int x = 0; x < cs3keywords.length; x++) {
		         	                	   
		         	                	  
		         	                	   
		         	                	  if (cs3keywords[x].equals("{")) {
		         	                		 
			         	                		break;
			      	                            
		         	                	  } else {
			      	                        	 if (cs3keywords[x].equals(words2)) {
			      	                        		 
			      	                        		
			      	                        			complexity=complexity+1;
			      	                        		 
			      	                                
			      	                              System.out.println(complexity);
			      	                                
			      	                        	 }
			      	                        	
			      	                        }
			         	                	   
			         	                   }
		         	                     	                         
			         	                	   
			         	                   }   
//                            	 String summa="hello manoj i am not working";
//                            	 String array1=line2.substring(0);
//                            	 System.out.println(array1);
//                            	 for(int j=0;j<=array1.length;j++) {
//                            		 	if(array1[j]=="implements") {
//                            		 		for(int k=0;array1[j]=="{";k++) {
//                            		 			complexity++;
//                            		 		}
//                            		 	}
//                            	 }
                            }
                           }
                        }
                    }
                   
                
       
                
                line = bufferedreader.readLine();
            }
            totalcomplexity = totalcomplexity +complexity;
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Total inheritance :(#Child_Classes) :"  + totalcomplexity);
	}
	
	public static void main(String ss[]) {
		childClassCount CS = new childClassCount();
        CS.CheckInheritance();
    }
}
