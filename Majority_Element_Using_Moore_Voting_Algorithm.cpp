#include<bits/stdc++.h>
using namespace std;
int FindCandidate(int a[],int n)
{
    int maj_element=0,count=1;
    for (int i = 1; i < n; i++)
    {
        if(a[maj_element]==a[i])
        {
            count++;
        }
        else{
            count=count-1;
            
        }
        if(count==0)
        {
            maj_element=i;
            count=1;
        }
    }
    return a[maj_element];

}

bool IsMajority(int a[],int n, int can)
{
    int count=0;
    for (int i = 0; i < n; i++)
    {
    if(a[i]==can)
    count++;
    }
    if(count==(n/2))
    return 1;
    else
    return 0;
    
}

void printMajority(int a[],int n)
{
 int candidate=FindCandidate(a,n);
    if(IsMajority(a,n,candidate))
        cout<<"majority element is:"<<candidate;
    else
      cout<<"there is no majority element:";
    
}

int main()
{
    int a[] = {1,1,2,3,4,3,4,3,1,1,3,2,1,1,1,1};
    int size = (sizeof(a)) / sizeof(a[0]);
 
    // Function calling
    printMajority(a, size);
 
    return 0;
}