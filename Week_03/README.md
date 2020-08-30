学习笔记

递归模板 Java
盗梦空间
```java
public void recur(int level, int param) { 
  // terminator 递归终结条件
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 处理当前层逻辑
  process(level, param); 
  // drill down 下钻到 下一层
  recur( level: level + 1, newParam); 
  // restore current status  清理当前层（非必须）
}
```

递归注意点：

- 不要人肉递归
- 找到最近重复子问题
- 数学归纳法思维

由于要准备面试，这里先放着
