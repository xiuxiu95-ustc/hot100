def find_duplicate(nums):
    # 步骤1：快慢指针找相遇点
    slow = nums[0]
    fast = nums[nums[0]]
    while slow != fast:
        slow = nums[slow]       # 慢指针走1步
        fast = nums[nums[fast]] # 快指针走2步
    
    # 步骤2：找环入口（重复数）
    slow = 0                   # 慢指针重置到起点
    while slow != fast:
        slow = nums[slow]
        fast = nums[fast]      # 快慢指针均走1步
    return slow

if __name__ == "__main__":
    # ACM 标准输入：读取空格分隔的整数
    nums = list(map(int, input("输入：").split()))
    print(find_duplicate(nums))
