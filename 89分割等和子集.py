def canPsrtition(nums):
    total=sum(nums)
    if total%2!=0:
        return False
    target=total//2
    #dp[j]表示容量为j的背包能装的最大价值（这里价值=重量）
    dp=[0]*(target+1)
    for num in nums:
        for j in range(target,num-1,-1):
            dp[j]=max(dp[j],dp[j-num]+num)
    return dp[target]==target
if __name__=="__main__":
    input_line=input("请输入整数数组:").strip()
    nums=list(map(int,input_line.split())) if input_line else []
    print(canPsrtition(nums))