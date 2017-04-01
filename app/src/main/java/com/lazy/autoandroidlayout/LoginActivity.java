package com.lazy.autoandroidlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.lazy.autolayoutlibrary.LayoutUtil;

/**
 * 类描述：登陆界面
 * 创建人：Lazy
 * 修改时间：2017/4/1
 * 修改备注：
 * 联系方式：906514731@qq.com
 */
public class LoginActivity extends AppCompatActivity {

  @InjectView(R.id.et_passport)
  EditText etPassport;
  @InjectView(R.id.et_password)
  EditText etPassword;
  @InjectView(R.id.btn_login)
  Button btnLogin;
  @InjectView(R.id.btn_rememberpwd)
  Button btnRememberpwd;
  @InjectView(R.id.ll_longin_bg)
  LinearLayout llLonginBg;
  @InjectView(R.id.ll_account)
  LinearLayout llAccount;
  @InjectView(R.id.ll_pas)
  LinearLayout llPas;
  @InjectView(R.id.ll_wei_bo)
  LinearLayout llWeiBo;
  @InjectView(R.id.btn_qq_login)
  Button btnQqLogin;
  @InjectView(R.id.ll_qq)
  LinearLayout llQq;
  @InjectView(R.id.ll_xin_lang)
  LinearLayout llXinLang;
  @InjectView(R.id.ll_bottom)
  LinearLayout llBottom;
  @InjectView(R.id.btn_web_chat_login)
  Button btnWebChatLogin;
  @InjectView(R.id.btn_wei_bo_login)
  Button btnWeiBoLogin;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_longin);
    ButterKnife.inject(this);
    initLocation();
  }

  private void initLocation() {
    LayoutUtil mlayoutUtil = LayoutUtil.getInstance();
    mlayoutUtil.drawViewLinearLayout(llLonginBg, 1000f, 396f, 0f, 60f);
    mlayoutUtil.drawViewLinearLayout(llAccount, 1000f, 190f, 40f, 0f);
    mlayoutUtil.drawViewLinearLayout(llPas, 1000f, 190f, 40f, 0f);
    mlayoutUtil.drawViewLinearLayout(btnLogin, 849f, 144f, 0f, 40f);

    mlayoutUtil.drawViewLinearLayout(llBottom, 0f, 0f, 0f, 50f);
    mlayoutUtil.drawViewLinearLayout(llWeiBo, 0f, 0f, 210f, 0f);
    mlayoutUtil.drawViewLinearLayout(llQq, 0f, 0f, 100f, 0f);
    mlayoutUtil.drawViewLinearLayout(llXinLang, 0f, 0f, 100f, 0f);


    mlayoutUtil.drawViewLinearLayout(btnQqLogin, 144f, 144f, 0f, 0f);
    mlayoutUtil.drawViewLinearLayout(btnWebChatLogin, 144f, 144f, 0f, 0f);
    mlayoutUtil.drawViewLinearLayout(btnWeiBoLogin, 144f, 144f, 0f, 0f);

  }
}
