package com.lazy.autoandroidlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.lazy.autolayoutlibrary.LayoutUtil;


/**
 * 类描述：测试界面
 * 创建人：Lazy
 * 修改时间：2017/4/1
 * 修改备注：
 * 联系方式：906514731@qq.com
 */
public class MainActivity extends AppCompatActivity {


  @InjectView(R.id.bt1)
  Button bt1;
  @InjectView(R.id.bt2)
  Button bt2;
  @InjectView(R.id.rl_changer)
  RelativeLayout rlChanger;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.inject(this);
    initLocation();
  }

  private void initLocation() {
    LayoutUtil mlayoutUtil = new LayoutUtil();
    mlayoutUtil.drawViewlLayout(bt1, 331f, 91f, 0f, 0f, 0f);
    mlayoutUtil.drawViewlLayout(bt2, 331f, 91f, 0f, 0f, 50f);
  }

  @OnClick(R.id.bt1)
  public void openKbActivity() {
    startActivity(new Intent(this, KbActivity.class));
  }

  @OnClick(R.id.bt2)
  public void openLonginActivity() {
    startActivity(new Intent(this, LoginActivity.class));
  }
}
