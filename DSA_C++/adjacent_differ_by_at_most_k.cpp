#include<bits/stdc++.h>
using namespace std;
int Search(int a[],int n,int x,int k)
{int i=0;
    while (i<n)
    {
        if(a[i]==x)
        {
            return i;
        }
        i=i+max(1,abs((a[i]-x)/k));

    }
      cout << "number is not present!";
    return -1;

    
}



// Driver program to test above function
int main()
{
    int arr[] = {2, 4, 5, 7, 7, 6};
    int x = 8;
    int k = 2;
    int n = sizeof(arr)/sizeof(arr[0]);
    cout << "Element " << x  << " is present at index "
         << Search(arr, n, x, k);
    return 0;
}