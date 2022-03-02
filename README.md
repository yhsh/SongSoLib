# SongSoLib

#### 介绍
android studio生成so库的方法
- 再次感谢原博主https://www.cnblogs.com/fengxing999/p/10002299.html

引用次项目生成so库的方法：
- 使用下面的JNI方法注意：
- 先在需要引用so库项目中的main文件夹中新建jinLibs文件夹(此文件夹为so库默认文件夹)
- 将需要的so库的类型整个文件夹复制到jniLibs文件夹中
- 现在需要引用so库的项目新建包名cn.yhsh.songlib，然后将SongUtils类复制进去
- 最后就可以调用SongUtils中的方法了


