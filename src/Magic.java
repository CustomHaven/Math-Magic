public class Magic {
    public static void main(String[] args) {
// https://www.codecademy.com/courses/learn-java/projects/math-magic
        // Q1
        int myNumber = 43535;

        // Q2
        // myNumber is the original number and we document it here as asked in Q2 to make this comment

        // Q3
        int stepOne = myNumber * myNumber;

        // Q4
        int stepTwo = stepOne + myNumber;

        // Q5
        int stepThree = stepTwo / myNumber;

        // Q6
        int stepFour = stepThree + 17;

        // Q7
        int stepFive = stepFour - myNumber;

        // Q8
        int stepSix = stepFive / 6;

        // Q9
        System.out.println(stepSix);

        // Q10
    /*
Now, go back to your code and change myNumber to any other integer. Run your program again.

Is the output the same?

It’s math magic! YES 3 is printed no matter what is the original number MAGICAL MATHS!
*/

        // Q11
  /*
  Recreate this project using only two variables: myNumber and magicNumber.
  Use your understanding of compound assignment operators to recreate the above program by only manipulating magicNumber
  */
        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;
        System.out.println(magicNumber);
    }
}
