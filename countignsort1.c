#include<stdio.h>
int main(){
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
        int range = 100;
        int count[range];
        for(i=0;i<range;i++){
            count[i] = 0;
        }
        for(i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(i = 0; i < range; i++) {
           printf("%d ", count[i]);
           
    }
}
    

