package com.luck.picture.lib.utils;

import android.content.Context;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import androidx.core.graphics.b;
import androidx.core.graphics.o;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class StyleUtils {
    private static final int INVALID = 0;

    public static boolean checkArrayValidity(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    public static boolean checkSizeValidity(int i7) {
        return i7 > 0;
    }

    public static boolean checkStyleValidity(int i7) {
        return i7 != 0;
    }

    public static boolean checkTextValidity(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static ColorFilter getColorFilter(Context context, int i7) {
        return o.e(context.getColor(i7), b.SRC_ATOP);
    }

    public static int getFormatCount(String str) {
        int i7 = 0;
        while (Pattern.compile("%[^%]*\\d").matcher(str).find()) {
            i7++;
        }
        return i7;
    }
}
