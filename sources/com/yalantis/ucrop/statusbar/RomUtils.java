package com.yalantis.ucrop.statusbar;

import android.os.Build;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.utils.Consts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class RomUtils {
    private static final String[] ROM_SAMSUNG = {Constants.REFERRER_API_SAMSUNG};
    private static final String UNKNOWN = "unknown";
    private static Integer romType;

    public static class AvailableRomType {
        public static final int ANDROID_NATIVE = 3;
        public static final int FLYME = 2;
        public static final int MIUI = 1;
        public static final int NA = 4;
    }

    private static String getBrand() {
        try {
            String str = Build.BRAND;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : UNKNOWN;
        } catch (Throwable unused) {
            return UNKNOWN;
        }
    }

    public static int getFlymeVersion() {
        String str = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || !str.contains("Flyme")) {
            return 0;
        }
        return stringToInt(str.replaceAll("Flyme", "").replaceAll("OS", "").replaceAll(" ", "").substring(0, 1));
    }

    public static int getLightStatausBarAvailableRomType() {
        Integer num = romType;
        if (num != null) {
            return num.intValue();
        }
        if (isMIUIV6OrAbove()) {
            Integer num2 = 1;
            romType = num2;
            return num2.intValue();
        }
        if (isFlymeV4OrAbove()) {
            Integer num3 = 2;
            romType = num3;
            return num3.intValue();
        }
        if (isAndroid5OrAbove()) {
            Integer num4 = 3;
            romType = num4;
            return num4.intValue();
        }
        Integer num5 = 4;
        romType = num5;
        return num5.intValue();
    }

    public static int getMIUIVersionCode() throws Throwable {
        String systemProperty = getSystemProperty();
        if (TextUtils.isEmpty(systemProperty)) {
            return 0;
        }
        try {
            return toInt(systemProperty);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private static String getManufacturer() {
        try {
            String str = Build.MANUFACTURER;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : UNKNOWN;
        } catch (Throwable unused) {
            return UNKNOWN;
        }
    }

    private static String getSystemProperty() throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.miui.ui.version.code").getInputStream()), 1024);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                    return line;
                } catch (IOException e10) {
                    e10.printStackTrace();
                    return line;
                }
            } catch (IOException unused) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    private static boolean isAndroid5OrAbove() {
        return true;
    }

    private static boolean isFlymeV4OrAbove() {
        return getFlymeVersion() >= 4;
    }

    private static boolean isMIUIV6OrAbove() throws Throwable {
        String systemProperty = getSystemProperty();
        if (TextUtils.isEmpty(systemProperty)) {
            return false;
        }
        try {
            return toInt(systemProperty) >= 4;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private static boolean isRightRom(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSamsung() {
        return isRightRom(getBrand(), getManufacturer(), ROM_SAMSUNG);
    }

    public static int stringToInt(String str) {
        if (Pattern.compile("^[-\\+]?[\\d]+$").matcher(str).matches()) {
            return toInt(str);
        }
        return 0;
    }

    public static int toInt(Object obj) {
        return toInt(obj, 0);
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
}
