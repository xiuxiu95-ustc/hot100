class Solution:
    def longestPalindrome(self, s: str) -> str:
        n = len(s)
        if n == 0:
            return ""
        ans_left = ans_right = 0  # 记录最长回文的【左闭右开】索引

        # 遍历所有 2n-1 个可能的中心（n个字符中心 + n-1个间隙中心）
        for i in range(2 * n - 1):
            # 关键：用i计算当前中心对应的左右起始位置
            # - 当i为偶数：i=2k → l=k, r=k（奇数长度回文，中心是s[k]）
            # - 当i为奇数：i=2k+1 → l=k, r=k+1（偶数长度回文，中心在s[k]和s[k+1]之间）
            l, r = i // 2, (i + 1) // 2
            
            # 中心扩展：只要左右字符相等且不越界，就继续向两边扩
            while l >= 0 and r < n and s[l] == s[r]:
                l -= 1
                r += 1
            
            # 循环结束后：有效回文是 [l+1, r-1]，长度 = r-l-1
            # 如果当前回文更长，更新最长回文的索引
            if r - l - 1 > ans_right - ans_left:
                ans_left, ans_right = l + 1, r  # 左闭右开，方便切片

        # 切片返回最长回文子串
        return s[ans_left: ans_right]

# ACM模式输入输出
if __name__ == "__main__":
    input_str = input("请输入字符串：").strip()
    # 创建Solution实例并调用方法
    solution = Solution()
    print("最长回文子串：", solution.longestPalindrome(input_str))
