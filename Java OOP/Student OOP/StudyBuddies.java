public class StudyBuddies {
    public static Student[] groupFinder() {
        Student[] studentArray = new Student[6];
        for (int i = 0; i < 6; i++) {
            int check = (int) (Math.random() * 6.0) + 1;
            if (check == 1) {
                studentArray[i] = Student.values()[0];
            } else if (check == 2) {
                studentArray[i] = Student.values()[1];
            } else if (check == 3) {
                studentArray[i] = Student.values()[2];
            } else if (check == 4) {
                studentArray[i] = Student.values()[3];
            } else if (check == 5) {
                studentArray[i] = Student.values()[4];
            } else if (check == 6) {
                studentArray[i] = Student.values()[5];
            }
        }
        return studentArray;
    }
    public static void groupAnalyzer(Student[] studentArray) {
        int proct = 0;
        int curve = 0;
        int late = 0;
        int day = 0;
        int trouble = 0;
        int quiet = 0;
        for (Student person : studentArray) {
            if (person == Student.values()[0]) {
                proct++;
            } else if (person == Student.values()[1]) {
                curve++;
            } else if (person == Student.values()[2]) {
                late++;
            } else if (person == Student.values()[3]) {
                day++;
            } else if (person == Student.values()[4]) {
                trouble++;
            } else if (person == Student.values()[5]) {
                quiet++;
            }
        }
        System.out.println("The following types of students are in your study group:");
        System.out.printf("PROCRASTINATOR %d\nCURVE_BREAKER %d\nLATECOMER %d\nDAYDREAMER %d\n", proct, curve, late, day);
        System.out.printf("TROUBLEMAKER %d\nQUIET_ACHIEVER %d\n", trouble, quiet);
    }
    public static void groupScores(Student[] group1, Student[] group2) {
        int groupScore1 = 0;
        int groupScore2 = 0;
        int score = 0;
        for (Student member1 : group1) {
            score = member1.ordinal();
            groupScore1 += score;
        }
        for (Student member2 : group2) {
            score = member2.ordinal();
            groupScore2 += score;
        }
        if (groupScore1 > groupScore2) {
            System.out.println("The former is predicted to perform better than the latter.");
        } else if (groupScore1 < groupScore2) {
            System.out.println("The latter is predicted to perform better than the former.");
        } else if (groupScore1 == groupScore2) {
            System.out.println("The two groups are predicted to perform equally well.");
        }
    }
    public static void main(String[] args) {
        Student[] group1;
        Student[] group2;
        group1 = groupFinder();
        group2 = groupFinder();
        groupAnalyzer(group1);
        groupAnalyzer(group2);
        groupScores(group1, group2);
    }
}