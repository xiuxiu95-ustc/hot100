def lengthOfLIS(nums):
    if not nums:
        return 0
    n=len(nums)
    #dp[i]表示以nums[i]结尾的最长递增子序列长度
    dp=[1]*n
    res=1
    for i in range(1,n):
        for j in range(i):
            if nums[j]<nums[i]:
                dp[i]=max(dp[j]+1,dp[i])
        res=max(res,dp[i])
    return res
if __name__ == "__main__":
    input_line=input("请输入整数数组（空格分隔）：").strip()
    nums=list(map(int,input_line.split())) if input_line else []
    print(lengthOfLIS(nums))