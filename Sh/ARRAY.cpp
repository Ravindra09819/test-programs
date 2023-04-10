#include<iostream.io>
using namespace std;
{
class Solution
{
    //public:
    //Function to find a continuous sub-array which adds up to a given number.
    vector<int> subarraySum(int arr[], int n, long long s)
    {
        // Your code here
        vector<int> res;
int sum=0;
int left=0,right=0;
while(right<=n){
if (sum == s) {
res.push_back(left+1);
res.push_back(right);
return res;

}
if( left==right || s>sum ){

sum=sum+arr[right];
right++;

}
else{
sum=sum-arr[left];
left++;

}
}

