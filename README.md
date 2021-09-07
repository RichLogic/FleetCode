# FleetCode

LeetCode 刷题实录

### 一、二叉树

### 二、回溯算法

- 模板

```java
List resultList = new ArrayList();
public void backtrack(路径, 选择列表) {
  if (满足结束条件) {
  	resultList.add(路径);
  }
  for (选择 : 选择列表) {
    做选择;
    backtrack(路径, 选择列表);
    撤销选择;
  }
}
```

### 三、BFS 广度优先搜索

- 模板

```java
int bfs(Node start, Node target) {
  Queue<TreeNode> queue = new LinkedList<>();
  Set<TreeNode> visited = new HashSet<>();
  queue.offer(start);
  visited.add(start);
  int step = 0;

  while (!queue.isEmpty()) {
    int len = queue.size();
    for (int i=0; i<len; i++) {
      Node node = queue.poll();
      if (target.equals(node)) {
        return step;
      }
      for (Node n : curr.adj()) {
        if (visited.contains(n)) {
          queue.offer(n);
          visited.add(n);
        }
      }
    }
    step ++;
  }

  return step;
```
