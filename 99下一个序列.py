def next_permutation(nums):
    # 步骤1：从后向前找第一个 nums[i] < nums[i+1]
    i = len(nums) - 2
    while i >= 0 and nums[i] >= nums[i+1]:
        i -= 1
    
    # 步骤2：找到i，找右侧最小的更大值
    if i >= 0:
        j = len(nums) - 1
        while nums[j] <= nums[i]:
            j -= 1
        # 交换i和j
        nums[i], nums[j] = nums[j], nums[i]
    
    # 步骤3：反转i+1到末尾（无论是否找到i都要执行，没找到时i=-1，反转整个数组）
    left, right = i + 1, len(nums) - 1
    while left < right:
        nums[left], nums[right] = nums[right], nums[left]
        left += 1
        right -= 1

if __name__ == "__main__":
    # ACM 标准输入：读取空格分隔的整数
    nums = list(map(int, input("输入：").split()))
    # 原地修改数组
    next_permutation(nums)
    # 按ACM要求输出（空格分隔）
    print(' '.join(map(str, nums)))
