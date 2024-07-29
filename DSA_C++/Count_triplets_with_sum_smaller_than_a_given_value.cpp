#include<bits/stdc++.h>
using namespace std;
int countTriplets(int a[],int size,int sum)
{
   sort(a,a+size);

    int count=0;
   for(int i=0;i<size;i++)
   {
    int j=i+1,k=size-1;
    while (j<k)
    {
     if(a[i]+a[j]+a[k]>=sum)
     k--;
     else
     {count+=(k-j);
    j++;}
}
   }
return count;
}

// Driver program 
int main() 
{ 
    int arr[] = {5, 1, 3, 4, 7}; 
    int n = sizeof arr / sizeof arr[0]; 
    int sum = 12; 
    cout << countTriplets(arr, n, sum) << endl; 
    return 0; 
} 