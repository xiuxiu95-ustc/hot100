def minDistance(word1,word2):
    m,n=len(word1),len(word2)
    dp=[[0]*(n+1)for _ in range(m+1)]
    for i in range(1,m+1):
        dp[i][0]=i
    for j in range(1, n + 1):
        dp[0][j]=j
    for i in range(1, m + 1):
            for j in range(1, n + 1):
                # 字符相等时，无需操作，直接继承左上角值
                if word1[i - 1] == word2[j - 1]:
                    dp[i][j] = dp[i - 1][j - 1]
                else:#增删改word1当前字符
                    dp[i][j]=min(dp[i - 1][j],dp[i][j - 1],dp[i-1][j-1])+1   
    return dp[m][n]
if __name__ == "__main__":
    word1 = input("请输入第一个字符串").strip()
    word2 = input("请输入第二个字符串").strip()
    print(minDistance(word1, word2))