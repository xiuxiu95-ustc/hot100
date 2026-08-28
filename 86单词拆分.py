def wordBreak(s,wordDict):
    n=len(s)
    dp=[False]*(n+1)
    dp[0]=True
    for i in range(1,n+1):
        for word in wordDict:
            len_word=len(word)
            # 核心条件：长度足够 + 前i-len_word个字符可拆分 + 子串匹配当前单词
            if i>= len_word and dp[i-len_word]and word==s[i-len_word:i]:
                dp[i]=True
                break
    return dp[n]

if __name__ == "__main__":
    print("请输入目标字符串s：")
    s = input().strip()
    print("请输入单词字典（空格分隔）：")
    wordDict_line = input().strip()
    wordDict = wordDict_line.split() if wordDict_line else []
    result = wordBreak(s, wordDict)
    print(result)
