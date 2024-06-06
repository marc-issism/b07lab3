public class Lab3Exception extends Exception {
    String message;

    // Empty constructor
    public Lab3Exception() {
        message = "Lab 3 Exception!";
    }   

    // Constructor that takes in 1 string
    public Lab3Exception(String message) {
        this.message = message;
    }

}