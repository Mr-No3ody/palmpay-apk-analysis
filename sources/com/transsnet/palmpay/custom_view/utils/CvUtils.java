package com.transsnet.palmpay.custom_view.utils;

import F6.d;
import N8.q0;
import Nb.a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.view.View;
import androidx.camera.video.u;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.utils.Consts;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class CvUtils {
    private static final String TAG = "CvUtils";

    public static String getAmountStringFromInput(Context context, String str) {
        try {
            BigDecimal bigDecimal = new BigDecimal(str);
            return isGroupSeparatorSupported() ? parseNumber(context, ",###,###", bigDecimal) : parseNumber(context, "0", bigDecimal);
        } catch (NumberFormatException e10) {
            d.c(TAG, "getAmountStringFromInput: ", e10);
            return "";
        }
    }

    public static String getDecimalPoint(Context context) {
        return "pt".equalsIgnoreCase(getLanguage(context)) ? "," : Consts.DOT;
    }

    private static String getDecimalString(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "0";
        }
        String decimalPoint = getDecimalPoint(context);
        if (!str.contains(decimalPoint)) {
            return null;
        }
        String[] strArrSplit = str.split(getDecimalPoint(context));
        if (Consts.DOT.equalsIgnoreCase(decimalPoint)) {
            strArrSplit = str.split("\\.");
        }
        if (strArrSplit.length > 1) {
            return strArrSplit[1];
        }
        return null;
    }

    public static String getFormatAmountString(Context context, String str) {
        String integerString = getIntegerString(context, str);
        String decimalString = getDecimalString(context, str);
        String amountStringFromInput = getAmountStringFromInput(context, integerString);
        String decimalPoint = getDecimalPoint(context);
        if (!TextUtils.isEmpty(decimalString)) {
            if (decimalString.length() > 2) {
                decimalString = decimalString.substring(0, 2);
            }
            return q0.y(amountStringFromInput, decimalPoint, decimalString);
        }
        StringBuilder sbS = u.s(amountStringFromInput);
        if (!str.contains(decimalPoint)) {
            decimalPoint = "";
        }
        sbS.append(decimalPoint);
        return sbS.toString();
    }

    private static String getIntegerString(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "0";
        }
        String decimalPoint = getDecimalPoint(context);
        if (str.contains(decimalPoint)) {
            String[] strArrSplit = str.split(getDecimalPoint(context));
            if (Consts.DOT.equalsIgnoreCase(decimalPoint)) {
                strArrSplit = str.split("\\.");
            }
            if (strArrSplit.length > 0) {
                return strArrSplit[0];
            }
        }
        return str;
    }

    private static String getLanguage(Context context) {
        return getLocale(context).getLanguage();
    }

    private static Locale getLocale(Context context) {
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    public static String getThousandsSeparators(Context context) {
        return "pt".equalsIgnoreCase(getLanguage(context)) ? Consts.DOT : ",";
    }

    public static boolean isChinese(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage().endsWith("ch");
    }

    public static boolean isEnglish(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage().endsWith("en");
    }

    public static boolean isGroupSeparatorSupported() {
        try {
            String str = new DecimalFormat(",###,###").format(BigDecimal.valueOf(5000L));
            return !TextUtils.isEmpty(str) && str.contains(",");
        } catch (Exception unused) {
        }
    }

    public static boolean isInDarkMode(View view) {
        try {
            return (view.getResources().getConfiguration().uiMode & 48) == 32;
        } catch (Exception unused) {
        }
    }

    public static boolean isValidGlideContext(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
        }
        if (context instanceof ContextWrapper) {
            return isValidGlideContext(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    private static String parseNumber(Context context, String str, BigDecimal bigDecimal) {
        return new DecimalFormat(str, DecimalFormatSymbols.getInstance(getLocale(context))).format(bigDecimal);
    }

    public static void setViewPagerScrollSpeed(ViewPager viewPager, int i7) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            a aVar = new a(viewPager.getContext());
            aVar.f6297a = i7;
            declaredField.set(viewPager, aVar);
        } catch (Exception unused) {
        }
    }
}
