//package com.kit.ui;
//
//import android.content.Context;
//import android.net.Uri;
//import android.os.Bundle;
//import android.app.FragmentActivity;
//import android.view.Menu;
//import android.view.MenuItem;
//
//public class BaseFragmentActivity extends FragmentActivity implements BaseFragment.OnFragmentInteractionListener,IDoActivityInit {
//
//    public Context mContext;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        this.mContext = this;
//
//        getExtra();
//        initWidget();
//        loadData();
//
//    }
//
//    /**
//     * 获得上一个Activity传过来的值
//     */
//    public boolean getExtra() {
//
//        return true;
//    }
//
//    /**
//     * 初始化界面
//     */
//    public boolean initWidget() {
//        return true;
//    }
//
//    /**
//     * 去网络或者本地加载数据
//     */
//    public boolean loadData() {
//        return true;
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    @Override
//    public void onFragmentInteraction(Uri uri) {
//
//    }
//
//
//}
