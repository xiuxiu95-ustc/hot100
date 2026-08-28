def maxProduct(nums:list[int])->int:
    if not nums:
        return 0
    cur_max=cur_min=res=nums[0]
    for num in nums[1:]:
        temp_max=cur_max
        cur_max=max(num,temp_max*num,cur_min*num) 
        cur_min=min(num,temp_max*num,cur_min*num)
        res=max(res,cur_max)
    return res
if __name__=="__main__":
    input_line=input("请输入整数数组（空格分隔）：").strip()
    nums=list(map(int,input_line.split())) if input_line else []
    print(maxProduct(nums))