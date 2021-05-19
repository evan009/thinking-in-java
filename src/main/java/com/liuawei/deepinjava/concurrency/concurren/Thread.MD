## Thread safety

### 实现手段

- Re-entrancy 重进入

    同步锁

- Thread-local storage 线程本地存储

    ThreadLocal

- Immutable objects 不变对象


- Mutual exclusion 互斥

    死锁
    资源饥饿

- Atomic operations 原子操作

加锁+排队


### Happen-Before

### 并发理论基础

#### 同步

##### 同步引入的问题

- 死锁
- 饥饿
- 优先级反转
- 繁忙等待

##### 同步实现

- 信号量
- 互斥
- 条件变量
- 屏障
- 自旋锁
- 读写锁

#### 临界区 Critical Section

#### 锁 LOCK

### Java同步原语

- synchronized

https://wiki.openjdk.java.net/display/HotSpot/Synchronization

方法

代码块

- voliate

可见性

- CAS

原子性

