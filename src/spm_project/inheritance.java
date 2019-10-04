package spm_project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class inheritance {

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
        
        System.out.println("Total inheritance :(#Child_Classes) " + totalcomplexity );
	}
	
///////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
			//int Cs = 0;
			// The name of the file to open.

		childClassCount CS = new childClassCount();
	        CS.CheckInheritance();
	    

			String fileName = "C:\\Users\\Geethika\\Desktop\\Code1.txt";	
			String fileName2 = "C:\\Users\\Geethika\\Desktop\\Code1.txt";
			// This will reference one line at a time
			String line = null;
			String lines = null;
			String[] row = new String[] {""};
			int rowSize = row.length;

			String[] ariOperators = new String[] { "try", "else", "{", "}" , ";", "//", "import", "class", "extended"};
			int aoSize = ariOperators.length;

			try {
				// FileReader reads text files in the default encoding.
				FileReader fileReader = new FileReader(fileName);

				// Always wrap FileReader in BufferedReader.
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				BufferedReader bufferedReader2 = new BufferedReader(fileReader);
				int count = 1;
				while ((lines = bufferedReader.readLine()) != null) {
					int Cs = 0;
					line = lines.replace("(", " ");
					line = lines.replace(")", " ");
					line = lines.replace(";", " ");
					//line = line.replace("", " ");
					
					System.out.print("Line : "+lines + "\t\t\t\t     : ");
					
					for (int i = 0; i < rowSize; i++) {
						if (line.contains(row[i])) {
							System.out.print(row[i]);
							Cs++;
						}
					}
					
					for (int i = 0; i < aoSize; i++) {
						if (line.contains(ariOperators[i])) {
							System.out.print(ariOperators[i] );
							Cs = 0;
						}
					}

					System.out.println("Cs value   ==> " +  Cs);
					count++;
				}
					
///////////////////////////////////////////////////////////////////////////////////////////
				while ((lines = bufferedReader.readLine()) != null) {
				    final int d = 256;
			        //String fileName2 = "GEEKS FOR GEEKS"; 
			        String pat = "GEEK";
			        int q = 101;
					// d is the number of characters in the input alphabet 
 
				      
				    /* pat -> pattern 
				        txt -> text 
				        q -> A prime number 
				    */
				        int M = pat.length(); 
				        int N = fileName2.length(); 
				        int i, j; 
				        int p = 0; // hash value for pattern 
				        int t = 0; // hash value for txt 
				        int h = 1; 
				      
				        // The value of h would be "pow(d, M-1)%q" 
				        for (i = 0; i < M-1; i++) 
				            h = (h*d)%q; 
				      
				        // Calculate the hash value of pattern and first 
				        // window of text 
				        for (i = 0; i < M; i++) 
				        { 
				            p = (d*p + pat.charAt(i))%q; 
				            t = (d*t + fileName2.charAt(i))%q; 
				        } 
				      
				        // Slide the pattern over text one by one 
				        for (i = 0; i <= N - M; i++) 
				        { 
				      
				            // Check the hash values of current window of text 
				            // and pattern. If the hash values match then only 
				            // check for characters on by one 
				            if ( p == t ) 
				            { 
				                /* Check for characters one by one */
				                for (j = 0; j < M; j++) 
				                { 
				                    if (fileName2.charAt(i+j) != pat.charAt(j)) 
				                        break; 
				                } 
				      
				                // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1] 
				                if (j == M) 
				                    System.out.println("Pattern found at index " + i); 
				            } 
				      
				            // Calculate hash value for next window of text: Remove 
				            // leading digit, add trailing digit 
				            if ( i < N-M ) 
				            { 
				                t = (d*(t - fileName2.charAt(i)*h) + fileName2.charAt(i+M))%q; 
				      
				                // We might get negative value of t, converting it 
				                // to positive 
				                if (t < 0) 
				                t = (t + q); 
				            } 
				        } 

				}   
///////////////////////////////////////////////////////////////////////////////////////////	
			
				System.out.println("count value   : " + count);	

				// Always close files.
				bufferedReader.close();
			} catch (FileNotFoundException ex) {
				System.out.println("Unable to open file '" + fileName + "'");
			} catch (IOException ex) {
				System.out.println("Error reading file '" + fileName + "'");
				// Or we could just do this:
				// ex.printStackTrace();
			}
	}	

}
