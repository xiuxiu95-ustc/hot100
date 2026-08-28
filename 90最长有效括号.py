def longestValidParentheses(s):
    n=len(s)
    if n<2:
        return 0
    #dp[i]表示以s[i]结尾的最长有效括号长度
    dp=[0]*n
    max_len=0
    for i in range(1,n):
        if s[i]==')':
            if s[i-1]=='(':
                dp[i]=dp[i-2]+2 if i>=2 else 2
            else:
                match_idx = i - dp[i-1] - 1
                if match_idx >= 0 and s[match_idx] == '(':
                    dp[i] = dp[i-1] + 2 + (dp[match_idx-1] if match_idx >= 1 else 0)
            max_len=max(max_len,dp[i])
    return max_len
if __name__=="__main__":
    input_line=input("请输入仅包含'('和')'的字符串：").strip()
    print(longestValidParentheses(input_line))
'''输入s = ")()())"输出4
解释：最长有效括号子串是 "()()"最长是dp[4]而且dp[6]=0'''