package cn.yhsh.songlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDuration(View view) {
        Log.e("打印歌曲长度", SongUtils.length() + "==");
        Toast.makeText(getApplicationContext(), "歌曲时长：" + SongUtils.duration(), Toast.LENGTH_LONG).show();
        for (byte b : SongUtils.songIo()) {
            Log.e("打印数组", b + "==");
        }
        byte[] b = new byte[99];
        for (byte i = 0; i < b.length; i++) {
            b[i] = i;
        }
        byte[] bytes = SongUtils.coverSong(b);
        for (byte aByte : bytes) {
            Log.e("打印输出数组", aByte + "==");
        }
    }
}