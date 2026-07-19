#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

void mergeSortedArrays(int arr1[], int n, int arr2[], int m, int res[]) {
    int i = 0, j = 0, k = 0;
    while (i < n && j < m) {
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
    while (i < n) {
        res[k++] = arr1[i++];
    }
    while (j < m) {
        res[k++] = arr2[j++];
    }
}

int main(){
    int n, m;
    scanf("%d %d", &n, &m);

    int a1[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &a1[i]);
    }

    int a2[m];
    for (int i = 0; i < m; i++) {
        scanf("%d", &a2[i]);
    }

    int total = n + m;
    int res[total > 0 ? total : 1];

    mergeSortedArrays(a1, n, a2, m, res);

   if (total % 2 != 0) {
    printf("%.1f\n", (double)res[total / 2]);
  } 
  else{
    printf("%.1f\n", (res[(total / 2) - 1] + res[total / 2]) / 2.0);
  }
    return 0;
}
