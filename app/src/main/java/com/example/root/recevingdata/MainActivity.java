package com.example.root.recevingdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView mMsgTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMsgTv=(TextView)findViewById(R.id.msg_tv);

        Intent intent=getIntent();
        String msg=intent.getStringExtra(Intent.EXTRA_TEXT);
        mMsgTv.setText(msg);
    }
}
