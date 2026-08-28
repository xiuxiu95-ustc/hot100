def main(nums):
    result = 0
    for num in nums:
        result ^= num  # 依次异或每个元素
    return result
if __name__ == "__main__":
    input_line = input("输入:").split()  # 读取所有输入并分割为列表
    nums = list(map(int, input_line))     # 转换为整数数组
    print(main(nums))      # 输出结果
