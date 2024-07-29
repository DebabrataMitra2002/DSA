int MaxSumSubArray(int a[],int n)
{
	int csum=a[0];
	int gsum=a[0];
	for(int i=1;i<n;i++)
	{
		if(csum>=0)
		{
			csum+=a[i];
		}
		else{
			csum=a[i];
		}
		if(csum>=gsum)
		{
			gsum=csum;
		}
	}
	return gsum;
}
#include <iostream>
using namespace std;
int main()
{   int n;
	int arr[100];
	cout<<"Enter the number of term:";
	cin>>n;
	cout<<"Enter the array:";
	for(int j=0;j<n;j++)
	{
		cin>>arr[j];
		
	}
	cout<<"Array is:"<<endl;
	for(int j=0;j<n;j++)
	{
		cout<<arr[j]<<endl;
	}
	cout<<"The MaxsumArray="<< MaxSumSubArray(arr,n);
    
	return 0;
}
//-2, -3, 4, -1, -2, 1, 5, -3 
