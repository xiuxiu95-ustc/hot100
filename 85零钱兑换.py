def coinChange(coins,amount):
    #dp[j]表示凑成金额j所需的最少硬币个数
    dp=[0]*(amount+1)
    for i in range(1,len(dp)):
        dp[i]=amount+1
    for j in range(amount+1):
        for coin in coins:
            if j>=coin:
                dp[j]=min(dp[j],dp[j-coin]+1)
    return dp[amount] if dp[amount]<=amount else -1
if __name__=="__main__":
    coins_line=input("硬币数组（空格分隔）:").strip()
    coins=list(map(int,coins_line.split())) if coins_line else []
    amount=int(input("目标金额:").strip())
    result=coinChange(coins,amount)
    print(result)