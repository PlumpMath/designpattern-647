## 1 设计模式入门

软件开发的真理是，世界在变，不管当初的设计多么好，一段时间过后，总是需要成长和改变，否则软件就会死亡；

凡是OO都会用到，除了**4个OO基本概念**，抽象，封装，继承，多态，

还有**9个OO原则**；OO原则是我们的目标，而设计模式是我们的做法；

**设计原则1**：找出应用中可能需要变化的地方，把他们独立出来，不要和那些不需要变化的代码混在一起；把会变化的部分取出来，封装起来，好让其他部分不会受到影响；代码引起的变化越少，系统变得越有弹性；

**设计原则2**：针对接口编程，而不是针对实现编程；这里的接口是广义的，不是就是java中的interface

**设计原则3**：多用组合，少用继承；使用组合建立系统有很大的弹性，可以将算法封装成族，可以再运行时改变行为等等；

**策略模式**：定义了算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于使用算法的客户；

工程师之间的交流，会有很多共享的语言，就像行话或者黑话，之间沟通的效率会大大提高；

设计模式的思想层次比库和框架要高，库是复用别人的代码，节省开发的时间，方便编码实践，是开发过程的一部分；但是库没有办法帮我们组织程序架构这个开发设计层次的事情需要设计模式来帮助我们，复用之前大神们的经验和良好实践，也就时复用架构，复用思想；

## 2 观察者模式 Observer

观察者模式 = 出版者（Subject） + 订阅者（Observer）；

**观察者模式**：定义了对象之间一对多的依赖，当那一个对象改变状态的时候，他的所有依赖者都会收到通知并自动更新；

**松耦合**；当两个对象之间松耦合，他们之间依然可以交互，但是不清楚彼此的细节；观察者模式让主题和观察者之间松耦合；这样可以为系统带来弹性，更加可以应对变化，因为对象之间的互相依赖降到了最低；

**设计原则4**；为了交互对象之间的松耦合设计而努力；

JavaAPI中内置了一个观察者模式的实现，Observable类和Observer接口；Observable类实现了需要维护观察者列表，增加删除和广播的方法，还有一些其他的功能；在通知观察者之前，需要调用setChanged方法来表示状态已经被更新过了；

## 3 装饰者模式 Decorator


