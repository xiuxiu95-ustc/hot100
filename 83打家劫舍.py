def rob(nums):
    if not nums:
        return 0
    n = len(nums)
    if n == 1:
        return nums[0]
    #dp[i]表示前i+1间房屋（下标0~i）能偷的最大金额
    dp = [0] * n
    dp[0]= nums[0]
    dp[1]=max(nums[0],nums[1])
    for i in range(2,n):
        dp[i]=max(dp[i-1],dp[i-2]+nums[i])
    return dp[-1]
if __name__=="__main__":
    input_line=input("请输入房屋金额：").strip()
    nums=list(map(int,input_line.split()))
    result=rob(nums)
    print(result)
