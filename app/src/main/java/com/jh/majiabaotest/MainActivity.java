package com.jh.majiabaotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 参考：
 * Android马甲包
 * https://blog.csdn.net/xiao_nian/article/details/79460952
 *
 * Build Variant在项目中的应用
 * https://blog.csdn.net/cai_iac/article/details/52330535?utm_source=blogxgwz5
 *
 * Android马甲包开发之路
 * https://www.jianshu.com/p/7af5f17de6c1
 *
 * 自己需要深入了解的是如何去改功能点，即同一个项目不同包名的apk拥有各自的功能节点；
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
