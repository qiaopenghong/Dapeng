package com.six.history.baifenbi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
*  功能:限定符以及autoLayout 的两种实现方式 1.继承AutoLayout 2.xml
 LinearLayout -> AutoLinearLayout
 RelativeLayout -> AutoRelativeLayout
 FrameLayout -> AutoFrameLayout
 * autour: 乔鹏宏
 * date: 2016/12/27 19:13
 * update: 2016/12/27
 */

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
