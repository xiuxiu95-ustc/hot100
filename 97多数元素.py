def majority_element(nums):
    #多数元素的 “票数” 永远无法被完全抵消
    candidate = None
    count = 0
    for num in nums:
        if count == 0:
            candidate = num  
        count += 1 if num == candidate else -1
    return candidate  

if __name__ == "__main__":
    nums = list(map(int, input("输入：").split()))
    print(majority_element(nums))