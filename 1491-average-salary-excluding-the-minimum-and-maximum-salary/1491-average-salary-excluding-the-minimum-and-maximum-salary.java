class Solution {
    public double average(int[] salary) {
        double avg=0;
        int i;
        Arrays.sort(salary);
        for(i=1; i<=salary.length-2; i++){
            avg += salary[i];
        }
        return avg/(i-1);
    }
}