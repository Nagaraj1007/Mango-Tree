public class mangoTreeOrNot {
    public boolean mangoOrNot(int row , int col , int number){
        if(number >= 1 && number <= row){
            return true;
        }
        if (number > (row * col) - col && number <= row * col ) {
            return true;
        }
        int firstColumnNumber = 1;
        for(int iterator = 1 ; iterator < row ;iterator++){
            firstColumnNumber += col;
            if (firstColumnNumber == number){
                return true;
            }
        }
        return false;
    }
}
