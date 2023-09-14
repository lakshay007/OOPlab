import java.util.*;
public class Result {
    private int[][] marks; 
    private int[] totalMarks; 

    
    public Result(int[][] marks) {
        this.marks = marks;
        this.totalMarks = new int[marks.length];
        calculateTotalMarks();
    }

    
    private void calculateTotalMarks() {
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            totalMarks[i] = total;
        }
    }

    
    public void findHighestMarks() {
        int numSubjects = marks[0].length;
        int[] highestMarks = new int[numSubjects];
        int[] rollNumbers = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            int maxMarks = marks[0][i];
            int studentRollNumber = 1;

            for (int j = 1; j < marks.length; j++) {
                if (marks[j][i] > maxMarks) {
                    maxMarks = marks[j][i];
                    studentRollNumber = j + 1;
                }
            }

            highestMarks[i] = maxMarks;
            rollNumbers[i] = studentRollNumber;
        }

        
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Highest marks in Subject " + (i + 1) + ": " + highestMarks[i] + " (Student Roll No: " + rollNumbers[i] + ")");
        }
    }

    
    public void findStudentWithHighestTotalMarks() {
        int maxTotalMarks = totalMarks[0];
        int studentRollNumber = 1;

        for (int i = 1; i < totalMarks.length; i++) {
            if (totalMarks[i] > maxTotalMarks) {
                maxTotalMarks = totalMarks[i];
                studentRollNumber = i + 1;
            }
        }

        System.out.println("Student with the highest total marks: Student Roll No " + studentRollNumber + " (Total Marks: " + maxTotalMarks + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] studentMarks = new int[3][3];
        System.out.println("enter marks of 3 students");
        for(int i = 0;i<3;i++)
        for(int j = 0;j<3;j++)
        studentMarks[i][j] = sc.nextInt();

        Result result = new Result(studentMarks);
        result.findHighestMarks();
        result.findStudentWithHighestTotalMarks();
    }
}