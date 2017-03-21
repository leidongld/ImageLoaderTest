package com.example.leidong.imageloadertest;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by leidong on 2017/3/14.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        //创建默认的ImageLoader配置参数
        ImageLoaderConfiguration imageLoaderConfiguration = ImageLoaderConfiguration.createDefault(this);
        //使用该配置参数初始化ImageLoader
        ImageLoader.getInstance().init(imageLoaderConfiguration);

    }
}
