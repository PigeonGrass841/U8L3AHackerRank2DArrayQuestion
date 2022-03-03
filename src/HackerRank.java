public class HackerRank
{
    public static int hourglassSum(int[][] array)
    {
        int largestSum = 0;
        int sum = 0;
        for (int i = 1; i < array.length - 1; i++)
        {
            sum = 0;
            for (int j = 1; j < array[i].length - 1; j++)
            {
                sum = array[i][j] + array[i+1][j-1] + array[i+1][j] + array[i+1][j+1] + array[i-1][j-1] + array[i-1][j]  + array[i-1][j+1];
                if (sum > largestSum)
                {
                    largestSum = sum;
                }
            }
        }
        System.out.println(largestSum);
        return largestSum;
    }
}
