def sort_colors(nums):
    left=0# 0区右边界的下一个位置（0区：[0, left-1]）
    cur=0
    right=len(nums)-1# 2区左边界的前一个位置（2区：[right+1, len(nums)-1]）
    while cur<=right:
        if nums[cur]==0:
            nums[cur],nums[left]=nums[left],nums[cur]
            left+=1
            cur+=1
        elif nums[cur]==1:
            cur+=1
        else:
            nums[cur],nums[right]=nums[right],nums[cur]
            right-=1
if __name__=="__main__":
    nums=list(map(int,input("请输入颜色数组（空格分隔）: ").strip().split()))
    sort_colors(nums)
    print(' '.join(map(str,nums)))