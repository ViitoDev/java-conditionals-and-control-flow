package exercises.exercise02;

public class Main {
    public static void main(String[] args) {
        double note1 = 2;
        double note2 = 2;
        double mediaNotes = (note1 + note2) / 2;

        if (mediaNotes >= 7) {
            System.out.println("The student have 7+ media. \nApproved!");
        } else if (mediaNotes >= 5) {
            System.out.println("The student have 5+ media. \nIs taking remedial classes!");
        } else {
            System.out.println("The student have 5- media. \nRepproved!");
        }
    }
}
