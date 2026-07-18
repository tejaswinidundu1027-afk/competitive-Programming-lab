#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n,i,j;
    scanf("%d", &n);
    int arr[n];
    for(i=0;i<n;i++){
        scanf("%d", &arr[i]);
    }
    int min = arr[0],max = arr[0];
    for(i=1;i<n;i++){
        if(min > arr[i]){
            min = arr[i];
        }
        if(max < arr[i]){
            max = arr[i];
        }
    }
        int res[n];
        int range = max-min+1;
        int count[range];
        for(i=0;i<range;i++){
            count[i] = 0;
        }
        for(i=0;i<n;i++){
            count[arr[i]-min]++;
        }
        for(i=1;i<range;i++){
            count[i]+=count[i-1];
        }
        for(i=n-1;i>=0;i--){
            count[arr[i]-min]--;
            res[count[arr[i]-min]] = arr[i];
       }
        for(i=0;i<n;i++){
            printf("%d ", res[i]);
        }
}
    
