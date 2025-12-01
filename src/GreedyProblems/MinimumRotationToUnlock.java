package GreedyProblems;

public class MinimumRotationToUnlock {

    static int minRotation(int input, int unlock_code) {

        int rotation=0;
        int inputDgt ;
        int codeDgt ;
        while(input>0||unlock_code>0) {
            inputDgt = input % 10;
            codeDgt = unlock_code % 10;
            rotation += Math.min(
                    Math.abs(inputDgt - codeDgt),
                    10 - Math.abs(inputDgt - codeDgt)
            );
            input /= 10;
            unlock_code /= 10;
        }

        return  rotation;
    }

    public static void main(String[] args) {
            int input = 28756;
            int unlock_code = 98234;
            System.out.println("Minimum Rotation = "+
                    minRotation(input, unlock_code));

    }

}
