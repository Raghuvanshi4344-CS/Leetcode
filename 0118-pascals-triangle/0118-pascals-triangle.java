// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> arr = new ArrayList<>();

//         for (int i = 0; i < numRows; i++) {
//             List<Integer> temp = new ArrayList<>();
//             for (int j = 0; j <= i; j++) {
//                 if (j == 0 || j == i) {
//                     temp.add(1);
//                 } else {
//                     int val = arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j);
//                     temp.add(val);
//                 }
//             }
//             arr.add(temp);
//         }

//         return arr;
//     }
// }


class Solution {
    public List<List<Integer>> generate(int numRows) {
        // List<List<Integer>> re = new ArrayList<>();
        // for (int i = 0; i < numRows; i++) {
        //     List<Integer> row = new ArrayList<>();
        //     int value = 1;
        //     for (int j = 0; j <= i; j++) {
        //         if (j == 0) {
        //             value = 1; 
        //         } else {
        //             value = value * (i - j + 1) / j;
        //         }
        //         row.add(value);
        //     }
        //     re.add(row);
        // }
        // return re;
        List<List<Integer>> re=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            int val=1;
            for(int j=0;j<=i;j++){
                if(j==0) val=1;
                else{
                    val=val*(i-j+1)/j;
                }
                row.add(val);
            }
            re.add(row);
        }
        return re;
    }
}
