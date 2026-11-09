package com.luck.picture.lib.utils;

import com.alibaba.android.arouter.utils.Consts;

/* JADX INFO: loaded from: classes3.dex */
public class ValueOf {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T to(Object obj, T t) {
        return obj == 0 ? t : obj;
    }

    public static boolean toBoolean(Object obj) {
        return toBoolean(obj, false);
    }

    public static double toDouble(Object obj) {
        return toDouble(obj, 0);
    }

    public static float toFloat(Object obj, long j6) {
        if (obj == null) {
            return j6;
        }
        try {
            return Float.parseFloat(obj.toString().trim());
        } catch (Exception unused) {
            return j6;
        }
    }

    public static int toInt(Object obj, int i7) {
        if (obj != null) {
            try {
                String strTrim = obj.toString().trim();
                return strTrim.contains(Consts.DOT) ? Integer.parseInt(strTrim.substring(0, strTrim.lastIndexOf(Consts.DOT))) : Integer.parseInt(strTrim);
            } catch (Exception unused) {
            }
        }
        return i7;
    }

    public static long toLong(Object obj, long j6) {
        if (obj != null) {
            try {
                String strTrim = obj.toString().trim();
                return strTrim.contains(Consts.DOT) ? Long.parseLong(strTrim.substring(0, strTrim.lastIndexOf(Consts.DOT))) : Long.parseLong(strTrim);
            } catch (Exception unused) {
            }
        }
        return j6;
    }

    public static String toString(Object obj) {
        try {
            return obj.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean toBoolean(Object obj, boolean z3) {
        if (obj == null) {
            return false;
        }
        try {
            return !"false".equals(obj.toString().trim().trim());
        } catch (Exception unused) {
            return z3;
        }
    }

    public static double toDouble(Object obj, int i7) {
        if (obj == null) {
            return i7;
        }
        try {
            return Double.parseDouble(obj.toString().trim());
        } catch (Exception unused) {
            return i7;
        }
    }

    public static float toFloat(Object obj) {
        return toFloat(obj, 0L);
    }

    public static int toInt(Object obj) {
        return toInt(obj, 0);
    }

    public static long toLong(Object obj) {
        return toLong(obj, 0L);
    }
}
