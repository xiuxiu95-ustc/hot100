def minPathSum(grid):
    m,n=len(grid),len(grid[0])
    #dp[i][j] 的值代表直到走到 (i,j) 的最小路径和
    for i in range(m):
        for j in range(n):
            if i==0 and j==0:
                continue
            elif i==0:
                grid[i][j]+=grid[i][j-1]
            elif j==0:
                grid[i][j]+=grid[i-1][j]
            else:
                grid[i][j]+=min(grid[i-1][j],grid[i][j-1])
    return grid[-1][-1]
if __name__=="__main__":
    grid = [
        [1, 3, 1],
        [1, 5, 1],
        [4, 2, 1]
    ]
    print(minPathSum(grid))