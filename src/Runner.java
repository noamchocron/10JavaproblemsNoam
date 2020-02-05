public class Runner {
    //warmup 1 exercise StartHi
    public boolean startHi(String str) {
        if(str.length()<2){
            return false;
        }
        if(str.substring(0,2).equals ("hi")){
            return true;
        }
        return false;
    }
    //warmup 2 exercise has271
    public boolean has271(int[] nums) {
        for(int i=0;i<nums.length-2; i++){
            if(nums[i+1]==nums[i]+5 && (nums[i+2] < nums[i]+2 && (nums[i+2] >= nums[i]-3))){
                return true;
            }
        }
        return false;
    }
    //string-1 exercise helloName
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
    //array-1 exercise has23
    public boolean has23(int[] nums) {
        for(int i=0;i < nums.length; i++){
            if(nums[i] == 2 || nums[i] == 3){
                return true;
            }
        }
        return false;
    }
    //Logic-1 exercise inOrder
    public boolean inOrder(int a, int b, int c, boolean bOk) {

        if(a > b && b > c){
            return false;
        }
        if(b < c && bOk == true){
            return true;
        }
        if(a < b && b < c){
            return true;
        }
        return false;
    }
    //Logic-2 exercise evenlySpaced
    public boolean evenlySpaced(int a, int b, int c) {
        if( a - b == b - c){
            return true;
        }
        if( a - c == b - a){
            return true;
        }
        if( a - c == c - b){
            return true;
        }
        return false;
    }
    //string-2 exercise countHi
    public int countHi(String str) {
        int count = 0;
        for (int i=0; i < str.length()-1; i++) {
            if (str.substring(i,i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }
    //Array-2 exercise no14
    public boolean no14(int[] nums) {
        boolean no1 = true;
        boolean no4 = true;
        for(int i=0;i < nums.length; i++){
            if(nums[i] == 1){
                no1 = false;
            }
            if(nums[i] == 4){
                no4 = false;
            }
        }
        if(no1 || no4){
            return true;
        }
        return false;
    }
    //Array-3 exercise countClumps
    public int countClumps(int[] nums) {
        int count = 0;
        boolean oneLikeNext = false;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1] && !oneLikeNext) {
                count++;
                oneLikeNext = true;
            }else if(nums[i] != nums[i+1]) {
                oneLikeNext = false;
            }
        }
        return count;
    }
}


