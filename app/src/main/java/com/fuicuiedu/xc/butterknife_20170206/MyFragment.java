package com.fuicuiedu.xc.butterknife_20170206;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/2/6 0006.
 */

public class MyFragment extends Fragment {
    @BindView(R.id.main_tv1)TextView textView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main,container,false);
        //在fragment使用butterknife，需要传布局
        ButterKnife.bind(this,view);
        return view;
    }
}
