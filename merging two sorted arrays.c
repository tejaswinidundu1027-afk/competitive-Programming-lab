#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

void mergeSortedArrays(int arr1[],int n,int arr2[],int m){
    int i = 0,j = 0,k = 0;
    int res[n + m];
    while(i<n && j<m){
        if(arr1[i] < arr2[j]){
        res[k] = arr1[i];
        i++;
        k++;
        }
        else{
            res[k] = arr2[j];
            j++;
            k++;
        }
    }
    while(i<n){
        res[k++] = arr1[i++];
    }
    while(j<m){
        res[k++] = arr2[j++];
    }
    for(i=0;i<n+m;i++){
        printf("%d ", res[i]);
    }
}
int main(){
    int n;
    scanf("%d", &n);
    int a1[n];
    for(int i=0;i<n;i++){
        scanf("%d", &a1[i]);
    }
    int m;
    scanf("%d", &m);
    int a2[m];
    for(int i=0;i<m;i++){
        scanf("%d", &a2[i]);
    }
    mergeSortedArrays(a1, n, a2, m);
    return 0;
    
}
