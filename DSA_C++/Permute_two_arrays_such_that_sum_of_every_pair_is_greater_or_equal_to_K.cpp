 /*Given two arrays of equal size n and an integer k. The task is to permute both arrays such that sum of their corresponding element is greater than or equal to k i.e a[i] + b[i] >= k. The task is to print “Yes” if any such permutation exists, otherwise print “No”.*/
#include<bits/stdc++.h>
using namespace std;
 bool IsPossible(int a[] , int b[] , int n , int k)
 {
   sort(a,a+n); //Sort the array a in decressing order.
   sort(b,b+n,greater<int>());
   for(int i=0;i>n;i++)
   {
    if(a[i]+b[i] < k)
    {
        return 0;
    }
   } 
 return 1;
 }
 int main()
{
    int a[]={2,1,3};
    int b[]={7,8,9};
    int k=10;
    int n=sizeof(a) / sizeof(a[0]);
    IsPossible(a,b,n,k) ? cout << "Yes" : cout << "No"; 
    return 0; 
}