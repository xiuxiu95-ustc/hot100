/**
 * 239. 滑动窗口最大值（滑动窗口/单调队列 - 困难）
 * ACM输入格式：
 * 第1行：数组长度n
 * 第2行：n个整数（空格分隔）
 * 第3行：窗口大小k
 * 输出：滑动窗口最大值数组（空格分隔）
 */
/*
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(solve(nums,k));
    }
    private static int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res=new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            // 移除超出窗口的元素索引
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {//de.peekFirst()
                deque.poll();//de.pollFirst();
            }
            // 维护单调队列（从大到小）
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);//de.addLast(i);//要在if(i-k+1>=0)判断之前

            // 记录窗口最大值
            if (i >= k - 1) {
                res.add(nums[de.peekFirst()]);
            }
        }
        return res;
    }
}
*/