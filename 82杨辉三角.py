def generate(numRows: int) -> list[list[int]]:
    if numRows ==0:
        return []
    res = [[1]]
    for i in range(1,numRows):
        prev_row = res[i-1]
        curr_row = [1]
        for j in range(1,i):
            curr_row.append(prev_row[j-1] + prev_row[j])
        curr_row.append(1)
        res.append(curr_row)
    return res
if __name__=="__main__":
    num_rows=int(input("请输入非负整数：").strip())
    result=generate(num_rows)
    for row in result:
        print(' '.join(map(str,row)))
