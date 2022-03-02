package cn.yhsh.songlib;

/**
 * @author xiayiye5
 * @date 2022/3/2 11:12
 * 下面的代码不要添加注释，否则可能编译class文件失败
 * 使用下面的JNI方法注意：
 * 直接将这个类复制过去，并且路径不能变，现在需要引用so库的项目新建包名cn.yhsh.songlib，然后将SongUtils类复制进去
 */
public class SongUtils {
    static {
        System.loadLibrary("songLib");
    }

    public static native String duration();

    public static native int length();

    public static native byte[] songIo();

    public static native byte[] coverSong(byte[] data);
}
