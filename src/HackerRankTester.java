public class HackerRankTester {
    public static void main(String[] args)
    {
        int[][] twoDimensionalArray = {{1, 1, 1, 0, 0, 0},
                                       {0, 1, 0, 0, 0, 0},
                                       {1, 1, 1, 0, 0, 0},
                                       {0, 0, 2, 4, 4, 0},
                                       {0, 0, 0, 2, 0, 0},
                                       {0, 0, 1, 2, 4, 0}};
        System.out.print("Actual Solution: ");
        HackerRank.hourglassSum(twoDimensionalArray);
        System.out.println("Expected Solution: 19");
    }

}
