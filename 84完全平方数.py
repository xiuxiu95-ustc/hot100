def numSquars(n):
    #dp[j]表示和为j的完全平方数的最少数量
    dp=[0]*(n+1)
    for i in range(1,len(dp)):
        dp[i]=n
    i=1
    while i*i<=n:
        square=i*i
        for j in range(square,n+1):
            dp[j]=min(dp[j],dp[j-square]+1)
        i+=1
    return dp[n]
if __name__=="__main__":
    n=int(input("请输入整数：").strip())
    result=numSquars(n)
    print(result)

    