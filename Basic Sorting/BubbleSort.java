// Bubble Sort Optimised
        for(int i=0;i<n-1;i++){ // n-1 passes
            int swaps = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }
