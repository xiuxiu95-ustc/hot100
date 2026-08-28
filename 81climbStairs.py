def climbStairs(n: int) ->int:
    if n<=0:
        return 0
    elif n==1:
        return 1
    elif n==2:
        return 2
    prev_prev=1
    prev=2
    for i in range(3,n+1):
        current=prev_prev+prev
        prev_prev=prev
        prev=current
    return prev
if __name__=="__main__":
    n=int(input("输入台阶数："))
    result=climbStairs(n)
    print(f"爬{n}阶楼梯的方法数为：{result}")