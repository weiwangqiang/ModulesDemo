package com.example.modulesdemo;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

public class MetaUtils {

    // 获取Androidmanifest中配置的meta数据
    public static Object getMeta(Context context, String name) {
        String packageName = context.getPackageName();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager()
                    .getApplicationInfo(packageName, PackageManager.GET_META_DATA);
            return applicationInfo.metaData.get(name);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
