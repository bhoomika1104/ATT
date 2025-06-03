public class jagged {
    public static void main(String[] args) {
        //2D Array with unequal row length
        //array of 3 arrays 3rows *4 cols
        int [][] jagged = {{1,2,3,4},
                           {4,5,6,7},
                           {7,8,9}};
//        for (int i = 0; i < jagged.length; i++){
//            for (int j = 0; j < jagged[i].length; j++){
//                System.out.print(jagged[i][j] + " ");
//            }
//            System.out.println();
//        }
        //for each loop ->enhanced for loop

        for(int[]arr:jagged){
            for(int x:arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
        char[][] languages={{'j','a','v', 'a'},{'c','+','+'},{'p','y','t','h','o','n'}};
        for(char[]arr:languages){
            for(char x:arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
