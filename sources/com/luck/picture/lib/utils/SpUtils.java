package com.luck.picture.lib.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public class SpUtils {
    private static SharedPreferences pictureSpUtils;

    public static boolean contains(Context context, String str) {
        return getSp(context).contains(str);
    }

    public static boolean getBoolean(Context context, String str, boolean z3) {
        return getSp(context).getBoolean(str, z3);
    }

    private static SharedPreferences getSp(Context context) {
        if (pictureSpUtils == null) {
            pictureSpUtils = context.getSharedPreferences("PictureSpUtils", 0);
        }
        return pictureSpUtils;
    }

    public static void putBoolean(Context context, String str, boolean z3) {
        getSp(context).edit().putBoolean(str, z3).apply();
    }

    public static void putString(Context context, String str, String str2) {
        getSp(context).edit().putString(str, str2).apply();
    }
}
