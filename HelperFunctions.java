import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HelperFunctions{
  //colors for text  
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  private static ArrayList<String> courses = new ArrayList<String>(){
    {
      add("intro");
      add("beginner");
      add("intermediate");
      add("advanced");
    }
  };

  private static ArrayList<String> beginnerActivities = new ArrayList<String>(){
    {
      add("beginnerIntro");
      add("learnPrinting");
      add("learnVariables");
      add("learnVariableManipulation");
    }
  };

  private static ArrayList<String> intermediateActivities = new ArrayList<String>(){
    {
      add("intermediateIntro");
      add("learnOperators");
      add("learnConditionals");
    }
  };

  private static ArrayList<String> advancedActivities = new ArrayList<String>(){
    {
      add("advancedIntro");
    }
  };
  
  private static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void printAnimated(String initStr){
    System.out.println("\n");
    for(int i = 0; i < initStr.length(); i++){
      System.out.print(initStr.charAt(i));
      try{
        //change speed of animation 
        TimeUnit.MILLISECONDS.sleep(25);
      }
      catch(InterruptedException e){
        e.printStackTrace();
      }
    }
  }
  
  public static void clearConsole(){
    System.out.print("\033[H\033[2J");  
    System.out.flush();
  }
  
  public static void sleep(int time, String unit){
    try {
      if(unit.equals("sec")){
        TimeUnit.SECONDS.sleep(time);
      }
      else if(unit.equals("msec")){
        TimeUnit.MILLISECONDS.sleep(time);
      }
      else if(unit.equals("nano")){
        TimeUnit.NANOSECONDS.sleep(time);
      }
      else if(unit.equals("micro")){
        TimeUnit.MICROSECONDS.sleep(time);
      }
    } 
    catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  
  public static void waitForCorrectInput(String correctInput){
    
    String userInput = CONSOLE.nextLine();
      while (!userInput.equalsIgnoreCase(correctInput)) {
        HelperFunctions.printAnimated("Not Quite! Try Again:\n");
        userInput = CONSOLE.nextLine();
      }
  }
  
  public static void waitForCorrectInput(String correctInput, String incorrectMsg){
    String userInput = CONSOLE.nextLine();
      while (!userInput.equalsIgnoreCase(correctInput)) {
        HelperFunctions.printAnimated(incorrectMsg + "\n");
        userInput = CONSOLE.nextLine();
      }
  }
  
  public static void waitForCorrectInput(String correctInput, boolean caseSpecific){
    String userInput = CONSOLE.nextLine();
    if(caseSpecific){
      while (!userInput.equals(correctInput)) {
        HelperFunctions.printAnimated("Not Quite! Try Again:\n");
        userInput = CONSOLE.nextLine();
      }
    }
    else{
      while (!userInput.equalsIgnoreCase(correctInput)) {
        HelperFunctions.printAnimated("Not Quite! Try Again:\n");
        userInput = CONSOLE.nextLine();
      }
    }
  }
  
  public static void waitForCorrectInput(String correctInput, String incorrectMsg, boolean caseSpecific){
    String userInput = CONSOLE.nextLine();
    if(caseSpecific){
      while (!userInput.equals(correctInput)) {
        HelperFunctions.printAnimated(incorrectMsg + "\n");
        userInput = CONSOLE.nextLine();
      }
    }
    else{
      while (!userInput.equalsIgnoreCase(correctInput)) {
        HelperFunctions.printAnimated(incorrectMsg + "\n");
        userInput = CONSOLE.nextLine();
      }
    }
  }

  public static double truncateDecimal(double num, int places){
    double multiplier = Math.pow(10, places);
    int tempNum = (int) (num*multiplier);
    return (double) tempNum/multiplier;
  }

  public static String getProgress(String txtFile){
    Scanner progressScanner = null;
    try{
      File progressFile = new File(txtFile);
      progressScanner = new Scanner(progressFile);
    }
    catch(FileNotFoundException e){
      e.printStackTrace();
    }
    String progress = progressScanner.nextLine();
    return progress;
  }
  
  public static void updateProgress(String txtFile, String newProgress){
    int newProgressIndex = -1;
    int currentProgressIndex = -1;
    String newActivityType = "";
    String currentActivityType = "";
    String currentProgress = getProgress(txtFile);
    if(txtFile.equals("courseProgress.txt")){
      for(int i = 0; i < courses.size(); i++){
        if(courses.get(i).equals(newProgress)){
          newProgressIndex = i;
        }
        if(courses.get(i).equals(currentProgress)){
          currentProgressIndex = i;
        }
      }
    }
    else if(txtFile.equals("activityProgress.txt")){
      for(int i = 0; i < beginnerActivities.size(); i++){
        if(beginnerActivities.get(i).equals(newProgress)){
          newProgressIndex = i;
          newActivityType = "beginner";
        }
        if(beginnerActivities.get(i).equals(currentProgress)){
          currentProgressIndex = i;
          currentActivityType = "beginner";
        }
      }
      for(int i = 0; i < intermediateActivities.size(); i++){
        if(intermediateActivities.get(i).equals(newProgress)){
          newProgressIndex = i;
          newActivityType = "intermediate";
        }
        if(intermediateActivities.get(i).equals(currentProgress)){
          currentProgressIndex = i;
          currentActivityType = "intermediate";
        }
      }

      for(int i = 0; i < advancedActivities.size(); i++){
        if(advancedActivities.get(i).equals(newProgress)){
          newProgressIndex = i;
          newActivityType = "advanced";
        }
        if(advancedActivities.get(i).equals(currentProgress)){
          currentProgressIndex = i;
          currentActivityType = "advanced";
        }
      }
    }
    if( (newProgressIndex > currentProgressIndex) && ( (newProgressIndex != -1) && (currentProgressIndex != -1)) && (newActivityType.equals(currentActivityType)) ){
      try{
        FileWriter myWriter = new FileWriter(txtFile);
        myWriter.write(newProgress);
        myWriter.close();
      } 
      catch (IOException e) {
        e.printStackTrace();
        }
    }
  }

  public static void loadProgress(){
    HelperFunctions.clearConsole();
    ArrayList<String> unlockedCourses = new ArrayList<String>();
    ArrayList<String> unlockedActivities = new ArrayList<String>();
    String courseProgress = getProgress("courseProgress.txt");
    String activityProgress = getProgress("activityProgress.txt");
    if(courseProgress.equals("intro")){
      PlacementQuiz.placeUser();
    }
    else{
      HelperFunctions.printAnimated("Welcome back! Please see the unlocked courses below to continue!");
    for(int i = 0; i < courses.size(); i++){
      if(courseProgress.equals(courses.get(i))){
        for(int j = i; j >= 0; j--){
            HelperFunctions.printAnimated(" - " + (String) courses.get(j));
            unlockedCourses.add(((String) courses.get(j)).toLowerCase());
          }
        }
      }
    }

    HelperFunctions.printAnimated("Please type the name of the course you would like to do.\n");
     String userInput = CONSOLE.nextLine();
    if(unlockedCourses.contains(userInput.toLowerCase())){
      if(userInput.equalsIgnoreCase(courses.get(1))){
        HelperFunctions.printAnimated("You are in the beginner course! Please see the unlocked activities below to continue!");
        //Returns activities unlocked in beginner course
        for(int i = 0; i < beginnerActivities.size(); i++){
          if(activityProgress.equals(beginnerActivities.get(i))){
            for(int j = i; j >= 0; j--){
              HelperFunctions.printAnimated(" - " + (String) beginnerActivities.get(j));
              unlockedActivities.add(((String) beginnerActivities.get(j)).toLowerCase());
            }
          }
        }

        //Returns all beginner activities if courseProgress = intermediate or advanced
        if(courseProgress.equals("intermediate") || courseProgress.equals("advanced")){
          for(Object activity: beginnerActivities){
            HelperFunctions.printAnimated(" - " + (String) activity);
            unlockedActivities.add(((String)activity).toLowerCase());
          }
        }
        HelperFunctions.printAnimated("Please type the name of the activity you would like to do.\n");
        userInput = CONSOLE.nextLine();
        if(unlockedActivities.contains(userInput.toLowerCase())){
          if(userInput.equalsIgnoreCase("beginnerintro")){
            HelperFunctions.printAnimated("Launching the beginner course now!");
            sleep(1, "sec");
            BeginnerCourse.launchBeginnerCourse();
          }
          else if(userInput.equalsIgnoreCase("learnprinting")){
            HelperFunctions.printAnimated("Launching the printing activity now!");
            sleep(1, "sec");
            BeginnerCourse.learnPrinting();
          }
          else if(userInput.equalsIgnoreCase("learnvariables")){
            HelperFunctions.printAnimated("Launching the variables activity now!");
            sleep(1, "sec");
            BeginnerCourse.learnVariables();
          }
          else if(userInput.equalsIgnoreCase("learnvariablemanipulation")){
            HelperFunctions.printAnimated("Launching the variable manipulation activity now!");
            sleep(1, "sec");
            BeginnerCourse.learnVariableManipulation();
          }
        }
        else if(beginnerActivities.contains(userInput)){
          HelperFunctions.printAnimated("You have not unlocked the " + userInput + " activity yet! Please select an unlocked activity!\nReloading...");
          sleep(1, "sec");
          loadProgress();
        }
        else{
          HelperFunctions.printAnimated("Invalid Input! Please make sure your input is the name of an activity.\nReloading...");
          sleep(1, "sec");
          loadProgress();
        }
      }

      else if(userInput.equalsIgnoreCase(courses.get(2))){
        HelperFunctions.printAnimated("You are in the intermediate course! Please see the unlocked activities below to continue!");
        //Returns unlocked intermediate activities
        for(int i = 0; i < intermediateActivities.size(); i++){
          if(activityProgress.equals(intermediateActivities.get(i))){
            for(int j = i; j >= 0; j--){
              HelperFunctions.printAnimated(" - " + (String) intermediateActivities.get(j));
              unlockedActivities.add(((String) intermediateActivities.get(j)).toLowerCase());
            }    
          }
        }
        //Returns all intermediate activities if courseProgress = advanced
        if(courseProgress.equals("advanced")){
          for(Object activity: intermediateActivities){
            HelperFunctions.printAnimated(" - " + (String) activity);
            unlockedActivities.add(((String)activity).toLowerCase());
          }
        }
        HelperFunctions.printAnimated("Please type the name of the activity you would like to do.\n");
        userInput = CONSOLE.nextLine();
        if(unlockedActivities.contains(userInput.toLowerCase())){
          if(userInput.equalsIgnoreCase("intermediateintro")){
            HelperFunctions.printAnimated("Launching the intermediate course now!");
            sleep(1, "sec");
            IntermediateCourse.launchIntermediateCourse();
          }
          else if(userInput.equalsIgnoreCase("learnoperators")){
            HelperFunctions.printAnimated("Launching the operators activity now!");
            sleep(1, "sec");
            IntermediateCourse.learnOperators();
          }  
          else if(userInput.equalsIgnoreCase("learnconditionals")){
            HelperFunctions.printAnimated("Launching the conditionals activity now!");
            sleep(1, "sec");
            IntermediateCourse.learnConditionals();
          }
        }
        else if(intermediateActivities.contains(userInput)){
          HelperFunctions.printAnimated("You have not unlocked the " + userInput + " activity yet! Please select an unlocked activity!\nReloading...");
          sleep(1, "sec");
          loadProgress();
        }

        else{
          HelperFunctions.printAnimated("Invalid Input! Please make sure your input is the name of an activity.\nReloading...");
          sleep(1, "sec");
          loadProgress();
        }
      }
    }
      else if(userInput.equalsIgnoreCase(courses.get(3))){
    HelperFunctions.printAnimated("You are in the advanced course! Please see the unlocked activities below to continue!");
      //Returns unlocked advanced activities
      for(int i = 0; i < advancedActivities.size(); i++){
        if(activityProgress.equals(advancedActivities.get(i))){
          for(int j = i; j >= 0; j--){
            HelperFunctions.printAnimated(" - " + (String) advancedActivities.get(j));
            unlockedActivities.add(((String) advancedActivities.get(j)).toLowerCase());
          }    
        }
      }

      HelperFunctions.printAnimated("Please type the name of the activity you would like to do.\n");
      userInput = CONSOLE.nextLine();
      if(unlockedActivities.contains(userInput.toLowerCase())){
        if(userInput.equalsIgnoreCase("advancedintro")){
          HelperFunctions.printAnimated("Launching the advanced course now!");
          sleep(1, "sec");
          IntermediateCourse.launchIntermediateCourse();
        }
      }
      else if(advancedActivities.contains(userInput)){
        HelperFunctions.printAnimated("You have not unlocked the " + userInput + " activity yet! Please select an unlocked activity!\nReloading...");
        sleep(1, "sec");
        loadProgress();
      }

      else{
        HelperFunctions.printAnimated("Invalid Input! Please make sure your input is the name of an activity.\nReloading...");
        sleep(1, "sec");
        loadProgress();
      }
    }
      else{
      HelperFunctions.printAnimated("Invalid Input! Please make sure your input is the name of an activity.\nReloading...");
      sleep(1, "sec");
      loadProgress();
    }
  }

  public static boolean validateUserInput(String userInput, String correctInput, boolean caseSpecific, boolean removeSpaces){
    if(caseSpecific){
      if(removeSpaces){
        String[] userInputSplit= userInput.split("");
        String userInputNoSpaces = "";
        for(String c : userInputSplit){
          if(!c.equals(" ")){
            userInputNoSpaces += c;
          }
        }
        String[] correctInputSplit = correctInput.split(" ");
        String correctInputNoSpaces = "";
        for(String c : correctInputSplit){
          if(!c.equals(" ")){
            correctInputNoSpaces += c;
          }
          
        }
        return userInputNoSpaces.equals(correctInputNoSpaces); 
      }
      else{
        return userInput.equals(correctInput);
      }
    }
    else{
      if(removeSpaces){
        String[] userInputSplit = userInput.split("");
        String userInputNoSpaces = "";
        for(String c : userInputSplit){
          if(!c.equals(" ")){
            userInputNoSpaces += c;
          }
        }
        String[] correctInputSplit = correctInput.split("");
        String correctInputNoSpaces = "";
        for(String c : correctInputSplit){
          if(!c.equals(" ")){
            correctInputNoSpaces += c;
          }
        }
        return userInputNoSpaces.equalsIgnoreCase(correctInputNoSpaces); 
        }
        else{
        return userInput.equalsIgnoreCase(correctInput);
        }
    }
  }
}