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

