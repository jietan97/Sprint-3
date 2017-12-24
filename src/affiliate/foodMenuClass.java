package affiliate;

import java.io.Serializable;

public class foodMenuClass implements Serializable {

    String affID, foodID, foodName, foodDesc;
//    , openDays, openTimeStart, openTimeEnd,
    int foodCode = 0;
    double foodPrice, promotionPrice;
    static String restaufoodID;

    public foodMenuClass() {
    }

    public foodMenuClass(String affID, String foodID, int foodCode, String foodName, String foodDesc, double foodPrice, double promotionPrice) {
        this.affID = affID;
        this.foodID = foodID;
        this.foodCode = foodCode;
        this.foodName = foodName;
        this.foodDesc = foodDesc;
        this.foodPrice = foodPrice;
        this.promotionPrice = promotionPrice;
    }

    public String getAffID() {
        return affID;
    }

    public void setAffID(String affID) {
        this.affID = affID;
    }

//    public static String getOpenDays() {
//        return openDays;
//    }
//
//    public static void setOpenDays(String openDays) {
//        foodMenuClass.openDays = openDays;
//    }
//
//    public static String getOpenTimeStart() {
//        return openTimeStart;
//    }
//
//    public static void setOpenTimeStart(String openTimeStart) {
//        foodMenuClass.openTimeStart = openTimeStart;
//    }
//
//    public static String getOpenTimeEnd() {
//        return openTimeEnd;
//    }
//
//    public static void setOpenTimeEnd(String openTimeEnd) {
//        foodMenuClass.openTimeEnd = openTimeEnd;
//    }
    public String getFoodID() {
        return foodID;
    }

    public void setFoodID(String foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public double getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(double promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public int getFoodCode() {
        return foodCode;
    }

    public void setFoodCode(int foodCode) {
        this.foodCode = foodCode;
    }

}
