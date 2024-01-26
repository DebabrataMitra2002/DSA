#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int partition(int arr[] ,int low ,int high )
{
int pivot =arr[low];
int i=low;
int j= high;
while(i<j)
{	
    while(pivot>=arr[i] && i<= high-1)
	{i++;
	}
	while(arr[j]>pivot && j<=low+1)
	{
	j--;
	}
	if(i<j)
	swap(arr[i],arr[j]);
}
swap(arr[low],arr[j]);
return j;
}
void quickSort(int arr[], int low, int high)
{
    // If low is lesser than high
    if (low < high) {
        // idx is index of pivot element which is at its
        // sorted position
        int idx = partition(arr, low, high);
        // Separately sort elements before
        // partition and after partition
        quickSort(arr, low, idx - 1);
        quickSort(arr, idx + 1, high);
    }
}
/* Function to print an array */
void printArray(int arr[], int size)
{
    int i;
    for (i = 0; i < size; i++)
        {
            cout << arr[i] << " ";
        }
    cout << endl;
}
// Driver Code
int main()
{
    int a[] = { 7, 6, 10, 5, 9, 2, 1, 15, 7 };
    int n = sizeof(a) / sizeof(a[0]);
    quickSort(a, 0, n - 1);
    cout << "Sorted array: \n";
    printArray(a, n);
    return 0;
}
// This Code is contributed by Harsh Raghav

