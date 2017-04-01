package com.lazy.autoandroidlayout;

import android.app.Application;
import android.content.Context;
import android.view.WindowManager;
import com.lazy.autolayoutlibrary.LayoutUtil;


/**
 * 项目名称：AndroidAutoLayout
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2017/3/31 19:02
 * 修改人：Administrator
 * 修改时间：2017/3/31 19:02
 * 修改备注：
 * 联系方式：906514731@qq.com
 */
public class myApplication extends Application {

  /**
   * 屏幕的宽
   */
  public static int screenWidth;
  /**
   * 屏幕的高
   */
  public static int screenHeight;

  @Override
  public void onCreate() {
    super.onCreate();
    // 获取屏幕尺寸大小，使程序能在不同大小的手机上有更好的兼容性
    WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
    screenWidth = wm.getDefaultDisplay().getWidth();
    screenHeight = wm.getDefaultDisplay().getHeight();
    LayoutUtil.initConfig(screenWidth, screenHeight, 1080f, 1920f);
  }
}
