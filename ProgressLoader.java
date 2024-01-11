import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader; 
import java.io.File;
import java.util.Iterator; 
import java.util.Map; 
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 
import java.util.List;

public class ProgressLoader{
  // private static File userProgressTXT = new File("userProgress.txt");
  private static final Scanner CONSOLE = new Scanner(System.in);
  private static String userInput;

  private static void loadBeginnerCourse(){
    
  }
  private static void loadIntermediateCourse(){
    
  }
  private static void loadAdvancedCourse(){
  
  }

  public static void loadProgress() {
    try{
      Object obj = new JSONParser().parse(new FileReader("userProgress.json")); 
    }
    catch(FileNotFoundException e){
      File jsonFile = new File("userProgress.json");
      Object obj = new JSONParser().parse(new FileReader("userProgress.json"));  
    }
    JSONObject userProgressJSON = (JSONObject) obj;
    JSONArray courses = (JSONArray) userProgressJSON.get("courses");
    JSONArray activities = (JSONArray) userProgressJSON.get("activities");
    List<String> unlockedCoursesList = new List<String>();
    List<String> completedCoursesList = new List<String>();
    List<String> unlockedActivitiesList = new List<String>();
    List<String> completedActivitiesList = new List<String>();

    for(String course:courses){
      if(course.get("status").equals("unlocked")){
        unlockedCoursesList.add(course.get("name"));
      }
      else if(course.get("status").equals("completed")){
        completedCoursesList.add(course.get("name"));
      }
    }
    for(String activity:activties){
      if(activity.get("status").equals("unlocked")){
        unlockedActivitiesList.add(activity.get("name"));
      }
      else if(activity.get("status").equals("completed")){
        completedActivitiesList.add(activity.get("name"));
      }
    }
    if(completedCoursesList.length() == courses.length()){
      HelperFunctions.printAnimated("Congratulations! You have completed all courses!");
      HelperFunctions.printAnimated("What course do you want to review?\nBeginner Course (Type 'b')\nIntermediate Course (Type 'i')\n Advanced Course (Type 'a')");
      userInput = CONSOLE.nextLine();
      if(userInput.equalsIgnoreCase("b")){
        loadBeginnerCourse();
      }
      else if(userInput.equalsIgnoreCase("i")){
        loadIntermediateCourse();
      }
      else if(userInput.equalsIgnoreCase("a")){
        loadAdvancedCourse();
      }
      else{
        HelperFunctions.printAnimated("Invalid Input. Please try Again! \n");
      }
    }
  }
}  
