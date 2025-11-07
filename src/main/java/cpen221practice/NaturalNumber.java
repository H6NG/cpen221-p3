package cpen221practice;

class NaturalNumber {

    private final int n;

    public NaturalNumber(int n) {

        this.n = n;
        if(n<1){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }

    }
    public Classification getClassification() {
        int sum=0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if(sum == n){
            return Classification.PERFECT;
        }
        else if(sum < n) {
            return Classification.DEFICIENT;
        }
        else{
            return Classification.ABUNDANT;
        }
    }


}
