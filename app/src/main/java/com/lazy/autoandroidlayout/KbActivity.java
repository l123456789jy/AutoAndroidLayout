package com.lazy.autoandroidlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.lazy.autolayoutlibrary.LayoutUtil;


/**
 * 类描述：kb测试界面
 * 创建人：Lazy
 * 修改时间：2017/4/1
 * 修改备注：
 * 联系方式：906514731@qq.com
 */
public class KbActivity extends AppCompatActivity {

  @InjectView(R.id.iv_changer_question)
  ImageView mIvChangerQuestion;//疑问
  @InjectView(R.id.tv_total_change)
  TextView mTvTotalChange;//用户目前的零钱
  @InjectView(R.id.rl_changer)
  RelativeLayout mRlChanger;//零钱的整体
  @InjectView(R.id.rl_earn_change)
  RelativeLayout mRlEarnChange;//零钱赚取的整体
  @InjectView(R.id.rl_earn_change_detail)
  RelativeLayout mRlEarnChangeDetail;
  //零钱赚取的整体
  @InjectView(R.id.tv_change)
  TextView tv_change;//零钱
  //K币
  @InjectView(R.id.tv_kb)
  TextView mTvKb;
  @InjectView(R.id.tv_total_kb)
  TextView mTvTotalKb;
  @InjectView(R.id.rl_kb)
  RelativeLayout mRlKb;
  @InjectView(R.id.rl_earn_kb)
  RelativeLayout mRlEarnKb;
  @InjectView(R.id.rl_earn_kb_jilu)
  RelativeLayout mRlEarnKbDetail;
  //布局lin
  @InjectView(R.id.rl_lin_kb_change)
  LinearLayout mLinKb;
  @InjectView(R.id.rl_lin_earn_change)
  LinearLayout mLinm;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_kb);
    ButterKnife.inject(this);
    initLocation();
  }

  private void initLocation() {
    LayoutUtil mlayoutUtil = LayoutUtil.getInstance();

    mlayoutUtil.drawViewlLayout(mRlChanger, 993f, 284f, 0f, 0f, 60f);

    mlayoutUtil.drawViewlLayout(tv_change, 0f, 0f, 29f, 0f, 29f);

    mlayoutUtil.drawViewRBLayout(mIvChangerQuestion, 59f, 60f, 0f, 20f, 14.9952f, 0f);

    mlayoutUtil.drawViewlLayout(mRlKb, 993f, 284f, 0f, 0f, 44f);

    mlayoutUtil.drawViewlLayout(mLinm, 995f, 153f, 0f, 0f, 0f);

    mlayoutUtil.drawViewlLayout(mLinKb, 995f, 153f, 0f, 0f, 0f);

    mlayoutUtil.drawViewlLayout(mTvKb, 0f, 0f, 29f, 0f, 30f);

  }
}
