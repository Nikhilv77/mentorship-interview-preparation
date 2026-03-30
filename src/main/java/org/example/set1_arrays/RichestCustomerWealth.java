package org.example.set1_arrays;

class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.length; i++){
            int amount = 0;
            for(int j = 0; j < accounts[i].length; j++){
                amount += accounts[i][j];
            }
            max = Math.max(amount, max);
        }
        return max;
    }
}