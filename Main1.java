package main1;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class User {
    private int userId;
    private String name;
    private int age;
    private List<String> healthConditions;
    private List<String> dietaryPreferences;
    private List<String> fitnessGoals;

    public User(int userId, String name, int age, List<String> healthConditions,
                List<String> dietaryPreferences, List<String> fitnessGoals) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.healthConditions = healthConditions;
        this.dietaryPreferences = dietaryPreferences;
        this.fitnessGoals = fitnessGoals;
    }
    public String getName(){
        return name;
    }
}

class MealPlanGenerator {
    private User user;
    private List<String> dietaryRecommendations;
    private List<String> mealPlan;

    public MealPlanGenerator(User user) {
        this.user = user;
    }

    public void generateMealPlan() {
        System.out.println("Generating meal plan for user: " + user.getName());
        mealPlan = Arrays.asList("Breakfast: Oatmeal", "Lunch: Salad", "Dinner: Grilled Chicken");
        System.out.println("Generated meal plan: " + mealPlan);
    }

    public List<String> getMealPlan() {
        return mealPlan;
    }
}

class RecipeDatabase {
    private List<String> recipes;
    private List<String> nutrientInformation;

    public List<String> searchRecipes(String keyword) {
        System.out.println("Searching recipes for keyword: " + keyword);
        return Arrays.asList("Grilled Chicken", "Salad");
    }

    public List<String> getNutrientInformation(String recipe) {
        System.out.println("Retrieving nutrient information for recipe: " + recipe);
        return Arrays.asList("Calories: 300", "Protein: 20g", "Fat: 10g");
    }
}

class HealthDataAnalyzer {
    private User user;
    private List<String> dietaryAnalysisResults;

    public HealthDataAnalyzer(User user) {
        this.user = user;
    }

    public void analyzeHealthData() {
        System.out.println("Analyzing health data for user: " + user.getName());
        dietaryAnalysisResults = Arrays.asList("Low sodium intake required", "Increase protein consumption");
        System.out.println("Dietary analysis results: " + dietaryAnalysisResults);
    }
}

class NutritionistAssistant {
    private User user;
    private List<String> mealPlan;
    private String feedback;

    public NutritionistAssistant(User user, List<String> mealPlan) {
        this.user = user;
        this.mealPlan = mealPlan;
    }

    public void provideFeedback() {
        System.out.println("Providing feedback for user: " + user.getName());
        feedback = "Great meal plan! Ensure to stay hydrated.";
        System.out.println("Feedback: " + feedback);
    }
}

public class Main1 {
    public static void main(String[] args) {
        User user = new User(1, "Dhanya", 30, Arrays.asList("Hypertension"), Arrays.asList("Vegetarian"), Arrays.asList("Weight Loss"));
        MealPlanGenerator mealPlanGenerator = new MealPlanGenerator(user);
        mealPlanGenerator.generateMealPlan();

        RecipeDatabase recipeDatabase = new RecipeDatabase();
        List<String> recipes = recipeDatabase.searchRecipes("healthy");
        List<String> nutrientInfo = recipeDatabase.getNutrientInformation("Grilled Chicken Salad");

        HealthDataAnalyzer healthDataAnalyzer = new HealthDataAnalyzer(user);
        healthDataAnalyzer.analyzeHealthData();

        NutritionistAssistant nutritionistAssistant = new NutritionistAssistant(user, mealPlanGenerator.getMealPlan());
        nutritionistAssistant.provideFeedback();
    }
}
