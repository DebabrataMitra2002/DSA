//#include <bits/stdc++.h>
#include<iostream>
using namespace std;
void swap1(int a,int b)
{	int temp;
	temp=a;
	a=b;
	b=temp;
}


int partition(int arr[] ,int low ,int high )
{
int pivot =arr[low];
int i=low;
int j= high;
while(i<j)
{
	while(pivot>=arr[i])
	i++;
	while(pivot<arr[j])
	j++;
	
	if(i<j)
	swap1(arr[i],arr[j]);
}
swap1(arr[j],arr[low]);
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
        cout << arr[i] << " ";
    cout << endl;
}
 
// Driver Code
int main()
{
    int arr[] = { 7, 6, 10, 5, 9, 2, 1, 15, 7 };
    int n = sizeof(arr) / sizeof(arr[0]);
    quickSort(arr, 0, n - 1);
    cout << "Sorted array: \n";
    printArray(arr, n);
    return 0;
}
 
//// Driver Code
//
//int main()
//{
//    int arr[] = { 7, 6, 10, 5, 9, 2, 1, 15, 7 };
//    int n = sizeof(arr) / sizeof(arr[0]);
//	for (int i = 0; i < n; i++)
//        cout << arr[i] << " ";
//    quickSort(arr, 0, n - 1);
//    cout << "Sorted array: \n";
//    for (int i = 0; i < n; i++)
//        cout << arr[i] << " ";
//    return 0;
//}
