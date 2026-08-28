def longestCommonSubsequence(text1,text2):
    m=len(text1)
    n=len(text2)
    # dp[i][j] 表示 
    # text1[0..i-1]（前i个字符）和 
    # text2[0..j-1]（前j个字符）的LCS长度
    dp=[[0]*(n+1) for _ in range(m+1)]
    for i in range(1,m+1):
        for j in range(1,n+1):
            if text1[i-1]==text2[j-1]:
                dp[i][j]=dp[i-1][j-1]+1
            else:
                dp[i][j]=max(dp[i-1][j],dp[i][j-1])
    return dp[m][n]
if __name__ == "__main__":
    text1 = input("请输入第一个字符串：").strip()
    text2 = input("请输入第二个字符串：").strip()
    print(longestCommonSubsequence(text1, text2))