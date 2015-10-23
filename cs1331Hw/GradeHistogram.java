import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GradeHistogram {

    private Scanner sc = new Scanner(System.in);
    private int bucketSize;
    private String fileName;
    private int numBuckets;
    private int[][] gradeDistr;

    public GradeHistogram() {

    }

    public int getBucketSize() {
        return bucketSize;
    }

    public void setBucketSize(int i) {
        bucketSize = i;
        System.out.println("bucketSize set as: " + bucketSize);
    }

    public void setBucketSize() {
        System.out.println("what is the bucket size?");
        bucketSize = sc.nextInt();
        System.out.println("You entered: " + bucketSize);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String name) {
        fileName = name;
        System.out.println("filename set as: " + fileName);
    }

    public void fillArray() throws FileNotFoundException {
        String filePathOne = "/Users/Ashwini/Documents/GTFS1";
        String filePathTwo = "/cs1331/hw-histogram-master/";
        String filePath = filePathOne + filePathTwo;
        Scanner fileReader = new Scanner(new File(filePath + fileName));

        if (101 % bucketSize != 0) {
            numBuckets = (101 / bucketSize) + 1;
        } else {
            numBuckets = (101 / bucketSize);
        }

        gradeDistr = new int[numBuckets][1];

        fileReader.useDelimiter("," + "/n");

        while (fileReader.hasNext()) {
            String phrase = fileReader.nextLine();
            int lastIndex = phrase.length();
            String last = phrase.substring(lastIndex - 1, phrase.length());
            String sLast = phrase.substring(lastIndex - 2, phrase.length() - 1);
            String tLast = phrase.substring(lastIndex - 3, phrase.length() - 2);
            String grade = "";

            if (sLast.equals(" ") || sLast.equals(",")) {
                grade = last;
            } else if (tLast.equals(" ") || tLast.equals(",")) {
                grade = sLast + last;
            } else {
                grade = tLast + sLast + last;
            }

            int gradeNum = Integer.parseInt(grade);

            for (int i = 0; i < (numBuckets); i++) {
                boolean paramOne = (gradeNum) > (bucketSize * i);
                boolean paramThree = (gradeNum) == (bucketSize * i);
                boolean paramTwo = (gradeNum) < (bucketSize * (i + 1));
                if (((paramOne) && (paramTwo)) || paramThree) {
                    gradeDistr[i][0] += 1;
                }
            }
        }

        fileReader.close();
    }

    public void drawHistogram() {

        for (int j = 0; j < numBuckets; j++) {
            int fBound = (100 - (bucketSize * j));
            int secBound = (101 - (bucketSize * (j + 1)));

            if (secBound < 0) {
                secBound = 0;
            }

            String tmp = " ";

            for (int n = 0; n < gradeDistr[j][0]; n++) {
                tmp = tmp + "[]";
            }
            if (fBound > 99 && secBound > 99) {
                System.out.println(fBound + " - " + secBound + " | " + tmp);
            } else if (fBound > 99 && secBound > 9) {
                System.out.println(fBound + " - " + secBound + "  | " + tmp);
            } else if (fBound > 9 && secBound < 10) {
                System.out.println(fBound + " - " + secBound + "    | " + tmp);
            } else if (fBound < 10 && secBound < 10) {
                System.out.println(fBound + " - " + secBound + "     | " + tmp);
            } else {
                System.out.println(fBound + " - " + secBound + "   | " + tmp);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        GradeHistogram h = new GradeHistogram();

        h.setFileName(args[0]);

        if (args.length < 2) {
            h.setBucketSize();
        } else {
            h.setBucketSize(Integer.parseInt(args[1]));
        }

        h.fillArray();
        h.drawHistogram();
    }
}
