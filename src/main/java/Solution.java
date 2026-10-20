public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;

    public Solution(String model, int id) {
        //implement code here
        calcModel = model;
        idNumber = id;
    }

    public Solution(int id) {
        //implement code here
        calcModel = "TI-84";
        idNumber = id;
    }

    public String getCalcModel() {
        //implement code here
        return calcModel;
    }

    public void setCalcModel(String newModel) {
        //implement code here
        calcModel = newModel;
    }

    public int getIdNumber() {
        //implement code here
        return idNumber;
    }

    public void setIdNumber(int newId) {
        //implement code here
        idNumber = newId;
    }

    public void incrementId() {
        //implement code here
        idNumber++;
    }

    public double add(double num1, double num2) {
        //implement code here
        double sum = num1 + num2;
        return sum;
    }

    public double subtract(double num1, double num2) {
        //implement code here
        double difference = num1 - num2;
        return difference;
    }

    public double multiply(double num1, double num2) {
        //implement code here
        double product = num1 * num2;
        return product;
    }

    public int quotient(int num1, int num2) {
        //implement code here
        int quotient = (int ) ((double) num1 / num2);
        return quotient;
    }

    public int remainder(int num1, int num2) {
        //implement code here
        int remainder = num1 % num2;
        return remainder;
    }

    public String divisionResult(int num1, int num2) {
        //implement code here
        int quotient = quotient(num1, num2);
        int remainder = remainder(num1, num2);
        return quotient + " R " + remainder;
    }

    public String coordinatePair(int x, int y) {
        //implement code here
        return "(" + x + ", " + y + ")";
    }

    public int average(int num1, int num2) {
        int sum = num1 + num2;
        double average = (double) sum / 2 + 0.5;
        int roundedAverage = (int) average;
        return roundedAverage;
    }

    public String info() {
        String calcInfo = "This calculator is a model " + calcModel + " with id " + idNumber;
        return calcInfo;
    }

}
