import java.util.*;
public class PigLatin
{
public static void main(String args[])
{
    
    
      String another = "y";
     
      while (another.equalsIgnoreCase("y"))
      {
        
       Scanner input=new Scanner(System.in);
  
       //prompt and read a line of txt
       System.out.println("Welcome to the Pig Latin Translator!\n");
       System.out.print("Enter a line to be translated: ");
       String txt=input.nextLine();
       System.out.println();
       //convert the txt to lower case
       txt=txt.toLowerCase();
       //declare a string that holds the converted txt
       String latin="";

       //run a loop until txt is empty
      while(txt!="")
     {
      String wrd;
      //using indxIf(" ") get the indx of first wrd in the txt
      int indx =txt.indexOf(" ");
  
      //get the first wrd by using substring method
     if(indx!=-1)
   {
       wrd=txt.substring(0,indx+1);
       wrd=wrd.trim(); //remove any trailing spaces
       txt=txt.substring(indx+1); //remove the wrd from the txt
   }
   //if the txt contains only one wrd
   else
   {
       //assign the txt to wrd
       wrd=txt;
       txt=""; //set wrd to empty string
   }
   //if the wrd starts with a vowel add "way" at the end of the wrd
   if(wrd.startsWith("a") || wrd.startsWith("e") || wrd.startsWith("i") || wrd.startsWith("o") || wrd.startsWith("u") )
   {
       latin=latin+wrd+"way"+" ";
   }
   //if the wrd starts with consonant
   else
   {
       //declare a new string that hold the consonant cluster
       String w="";
       //loop through the wrd and get the consonant cluster
       for(int i=0;i<wrd.length();i++)
       {
           //if a vowel is encountered exit the loop
           if(wrd.charAt(i)=='a' || wrd.charAt(i)=='e' || wrd.charAt(i)=='i' || wrd.charAt(i)=='o' || wrd.charAt(i)=='u')
           {
               break;
           }
           else
           {
               //add the consonant to w
               w=w+wrd.charAt(i);
               //remove the consonant from the wrd
               wrd=wrd.replaceFirst(wrd.charAt(i)+"", " ");
               wrd=wrd.trim(); //remove trailing spaces
               i--; //deccrement i
              
           }
       }
      
       //add wrd then w and then ay to pig latin txt
       latin=latin+wrd+w+"ay"+" ";
   }
}
  
//print the txt in pig Latin
   System.out.println(latin+"\n");
   System.out.print ("Translate another sentence (y/n)? ");
   another = input.nextLine();
}
      
      
}

}
