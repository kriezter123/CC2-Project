import java.util.Scanner;
public class College {

	public static void main(String[] args) {
		 Scanner input = new Scanner (System.in);
         String college , acadProg , major;
         
          System.out.println("What is your course? ( CAS, CBA, CEA, CITCS ,CTE, COA)");
         college = input.nextLine();
         
        
         if( college.equals("CAS")){
             System.out.println("What is your Academic Program? ( English, Political Science ,Communication,Psychology) ");
              acadProg = input.nextLine();
         
             if ( acadProg.equals("English")){
              System.out.println("college:" + college);
              System.out.println("Academic Program:" + college);
          }
             else if  (acadProg.equals(" Political Science ")){
              System.out.println("college:" + college);
              System.out.println("Academic Program:" + college);
          }
             else if  (acadProg.equals(" Communication ")){
              System.out.println("college:" + college);
              System.out.println("Academic Program:" + college);
          }
             else if (acadProg.equals("Psychology ")){
              System.out.println("college:" + college);
              System.out.println("Academic Program:" + college);
          }
              else 
              System.out.println("invalid");
             
         } else if( college.equals("CBA")){
             System.out.println("What is your Academic Program? ( Business Administration, Entrepreneurship , Office Administration ) ");
             acadProg = input.nextLine();
          
          if ( acadProg.equals("Business Administration")){
              System.out.println("college:" + college);
              System.out.println("Bachelor of Science in:" + college);
          }
          else if ( acadProg.equals("Entrepreneurship")){
              System.out.println("college:" + college);
              System.out.println("Bachelor of Science in:" + college);
          }
          else if ( acadProg.equals("Office Administration")){
              System.out.println("college:" + college);
              System.out.println("Bachelor of Science in:" + college);
          }
          else 
          System.out.println("Invalid");
          
         } if( college.equals("CEA")){
             System.out.println("What is your Academic Program? ( Architecture , Civil Engineering,"
                     + "  Computer Engineering ,Electronics Engineering, Environmental & Sanitary  Engineering  ) ");
             acadProg = input.nextLine();
          
          if ( acadProg.equals("Architecture")){
              System.out.println("college:" + college);
              System.out.println("Bachelor of Science in:" + college);
          }
          else if ( acadProg.equals("Civil Engineering")){
              System.out.println("college:" + college);
              System.out.println("Bachelor of Science in:" + college);
          }
          else if ( acadProg.equals("Computer Engineering")){
              System.out.println("college:" + college);
              System.out.println("Bachelor of Science in:" + college);
          }
           else if ( acadProg.equals("Electronics Engineering")){
              System.out.println("college:" + college);
              System.out.println("Bachelor of Science in:" + college);
          }
           else if ( acadProg.equals("Environmental & Sanitary  Engineering")){
              System.out.println("college:" + college);
              System.out.println("Bachelor of Science in:" + college);
          }
           else 
             System.out.println("invalid");
          
         } if( college.equals("CITCS")){
             System.out.println("What is your Academic Program? ( Computer Science, Information Techonology, Information System, "
                     + "Information System, Computer Technology)");
             acadProg = input.nextLine();
             
           if ( acadProg.equals("Computer Science")){
            System.out.println("What is your Academic Program in:(Mobile Technology, Digital Arts , Animation )");
             major = input.nextLine();
            System.out.println("Bachelor of Science in:" + acadProg);
            System.out.println( major + "track");
          
           }else if ( acadProg.equals("Information Technology")){
          System.out.println("What is your Academic Program in:(Enterprise Resource Planning ,Network and Security ,"
                    + "Web Technology ");
            major = input.nextLine();
            
            System.out.println("college:" + college);
            System.out.println("Bachelor of Science in:" + acadProg);
            System.out.println(major + "track");
          }
           else if ( acadProg.equals("Information System")){
            System.out.println("What is your Academic Program in:(e-Learning Technology ,"
                    + "Business Process Management ");
            major = input.nextLine();
            
            System.out.println("college:" + college);
            System.out.println("Bachelor of Science in:" + acadProg);
            System.out.println(major + "track");
          }
           else if ( acadProg.equals("Computer Technology")){
            System.out.println("What is your Academic Program in:(Emphasis in Call Center Services , "
                    + "Network Management ,Emphasis in Computer Maintenance");
            major = input.nextLine();
            
            System.out.println("college:" + college);
            System.out.println("Bachelor of Science in:" + acadProg);
            System.out.println(major + "track");
          }
           else 
           System.out.println("Invalid");
           
         } if( college.equals("CTE")){
             System.out.println("What is your Academic Program? ( Elementary Education - General , Elementary Education,"
                     + "  Secondary Education) ");
             acadProg = input.nextLine();
          
          if ( acadProg.equals(" Elementary Education - General")){
              System.out.println("college:" + college);
              System.out.println("Bachelor of Science in:" + college);
          }
          else if ( acadProg.equals(" Elementary Education")){
              System.out.println("college:" + college);
              System.out.println("Bachelor of Science in:" + college);
          }
          else if ( acadProg.equals("Secondary Education")){
              System.out.println("college:" + college);
              System.out.println("Bachelor of Science in:" + college);
          }
           else 
             System.out.println("invalid");
          
         } if( college.equals("COA")){
             System.out.println("What is your Academic Program? ( Accountancy , Accounting Technology,"
                     + "  Management Accounting,Forensic Accounting,  ) ");
             acadProg = input.nextLine();
          
          if ( acadProg.equals(" Accountancy")){
              System.out.println("college:" + college);
              System.out.println("Bachelor of Science in:" + college);
          }
          else if ( acadProg.equals("Accounting Technology")){
              System.out.println("college:" + college);
              System.out.println("Bachelor of Science in:" + college);
          }
          else if ( acadProg.equals("Management Accounting")){
              System.out.println("college:" + college);
              System.out.println("Bachelor of Science in:" + college);
          }
           else if ( acadProg.equals("Forensic Accounting")){
              System.out.println("college:" + college);
              System.out.println("Bachelor of Science in:" + college);
          }
          else 
             System.out.println("invalid");
          
          }
        if ((college != "COA") && (college != "CBA") && (college != "CEA") &&(college != "CITCS") && (college != "CAS")  && (college != "CTE"));
            System.out.println("invalid");

	}

}
