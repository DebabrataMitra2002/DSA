#include<bits/stdc++.h>
using namespace std;

void FindPair(int a[],int n,int k)
{
int i=0,j=1;
while (i<n && j<n)
{
if(i != j && (a[j] - a[i] == k || a[i] - a[j] == k) )
{
    cout<<"pair are:"<<a[i]<<","<<a[j];


}    
else if(a[j]-a[i] < k)
i++;
else
j++;
}
cout<<"no pair is found:";
}

int main()
{
    int a[]={1, 8, 30, 40, 100};
    int size=sizeof(a)/sizeof(a[0]);
    int n=-60;
    FindPair(a, size, n); 
    return 0; 
}