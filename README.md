# 介绍

  Kotlin 实现的Lifecycle 生命周期管理，用于其他对象观察当前activity、fragment的生命周期状态变化
  代码借鉴android 官方 Lifecycle 的源码实现
  
## 使用方法
  
  ### 1. 将被观察的activity 继承自 LifecycleAppCompatActivity 类，作为被观察者者
  
   class LifeMainActivity : LifecycleAppCompatActivity() {
  
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_main)
        // 添加观察者
        lifecycleRegistry.addObserver(TestLife())
    }
    
  }
  
  ### 2. 创建观察者类 TestLife 实现 LifecycleObserver 接口 就可以监听 activity的生命周期变化了
  
   class TestLife : LifecycleObserver {
  
       override fun onStateChanged(lifecycleOwner: LifecycleOwner, event: Lifecycle.Event) {
             Log.d("TestLife", event.name)
       }
    
   }
