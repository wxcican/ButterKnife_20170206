package com.fuicuiedu.xc.butterknife_20170206;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    private Unbinder unbinder;

//    @BindView(R.id.main_tv1)
//    TextView tv1;//绑定view
//    @BindView(R.id.main_tv2)
//    TextView tv2;//绑定view
//    @BindView(R.id.main_tv3)
//    TextView tv3;//绑定view

    //butterknife绑定视图列表
//    @BindViews({R.id.main_tv1,R.id.main_tv2,R.id.main_tv3})
//    List<TextView> textViews;

    //资源绑定
    @BindString(R.string.app_name)
    String app_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);//绑定到当前activity身上

        //单行复制，ctrl + d
//        tv1.setText("大家好！");
//        tv2.setText("大家真好！");
//        tv3.setText("大家特别好！");

        //集体操作视图列表
//        ButterKnife.apply(textViews, new ButterKnife.Action<TextView>() {
//            @Override
//            public void apply(@NonNull TextView view, int index) {
//                view.setText("面对疾风吧！");
//            }
//        });
    }

    //单个控件点击监听事件
//    @OnClick(R.id.main_tv1)
//    public void aaa(){
//        Toast.makeText(this, "点击了Tv1", Toast.LENGTH_SHORT).show();
//    }

    //多个控件点击监听
    @OnClick({R.id.main_tv1,R.id.main_tv2,R.id.main_tv3})
    public void bbb(View view){
        switch (view.getId()){
            case R.id.main_tv1:
                Toast.makeText(this, "点击了Tv1111", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_tv2:
                Toast.makeText(this, "点击了Tv2222", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_tv3:
                Toast.makeText(this, "点击了Tv3333", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //butterknife解绑，释放资源
        unbinder.unbind();
    }
}
