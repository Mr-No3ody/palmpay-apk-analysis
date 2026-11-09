package com.transsnet.palmpay.util;

import N8.q0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AppUtils {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static class AppInfo {
        private Drawable icon;
        private boolean isSystem;
        private String name;
        private String packageName;
        private String packagePath;
        private int versionCode;
        private String versionName;

        public AppInfo(String str, String str2, Drawable drawable, String str3, String str4, int i7, boolean z3) {
            setName(str2);
            setIcon(drawable);
            setPackageName(str);
            setPackagePath(str3);
            setVersionName(str4);
            setVersionCode(i7);
            setSystem(z3);
        }

        public Drawable getIcon() {
            return this.icon;
        }

        public String getName() {
            return this.name;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getPackagePath() {
            return this.packagePath;
        }

        public int getVersionCode() {
            return this.versionCode;
        }

        public String getVersionName() {
            return this.versionName;
        }

        public boolean isSystem() {
            return this.isSystem;
        }

        public void setIcon(Drawable drawable) {
            this.icon = drawable;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setPackagePath(String str) {
            this.packagePath = str;
        }

        public void setSystem(boolean z3) {
            this.isSystem = z3;
        }

        public void setVersionCode(int i7) {
            this.versionCode = i7;
        }

        public void setVersionName(String str) {
            this.versionName = str;
        }

        public String toString() {
            return "pkg name: " + getPackageName() + "\napp icon: " + getIcon() + "\napp name: " + getName() + "\napp path: " + getPackagePath() + "\napp v name: " + getVersionName() + "\napp v code: " + getVersionCode() + "\nis system: " + isSystem();
        }
    }

    private AppUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static String byte2Hex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b7 : bArr) {
            String hexString = Integer.toHexString(b7 & UnsignedBytes.MAX_VALUE);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    private static String bytes2HexString(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        char[] cArr = new char[length << 1];
        int i7 = 0;
        for (byte b7 : bArr) {
            int i10 = i7 + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i7] = cArr2[(b7 >>> 4) & 15];
            i7 += 2;
            cArr[i10] = cArr2[b7 & Ascii.SI];
        }
        return new String(cArr);
    }

    private static byte[] encryptSHA1(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    private static String encryptSHA1ToString(byte[] bArr) {
        return bytes2HexString(encryptSHA1(bArr));
    }

    public static void exitApp() {
        LinkedList<Activity> activityList = Utils.getActivityList();
        for (int size = activityList.size() - 1; size >= 0; size--) {
            activityList.get(size).finish();
        }
        System.exit(0);
    }

    public static Drawable getAppIcon() {
        return getAppIcon(Utils.getApp().getPackageName());
    }

    public static AppInfo getAppInfo() {
        return getAppInfo(Utils.getApp().getPackageName());
    }

    public static String getAppMetaData(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageManager packageManager = Utils.getApp().getPackageManager();
            return (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(Utils.getApp().getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null) ? "" : bundle.getString(str);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String getAppName() {
        return getAppName(Utils.getApp().getPackageName());
    }

    public static String getAppPackageName() {
        return Utils.getApp().getPackageName();
    }

    public static String getAppPath() {
        return getAppPath(Utils.getApp().getPackageName());
    }

    public static Signature[] getAppSignature() {
        return getAppSignature(Utils.getApp().getPackageName());
    }

    public static String getAppSignatureSHA1() {
        return getAppSignatureSHA1(Utils.getApp().getPackageName());
    }

    public static int getAppVersionCode() {
        return getAppVersionCode(Utils.getApp().getPackageName());
    }

    public static String getAppVersionName() {
        return getAppVersionName(Utils.getApp().getPackageName());
    }

    public static List<AppInfo> getAppsInfo() {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = Utils.getApp().getPackageManager();
        Iterator<PackageInfo> it = packageManager.getInstalledPackages(0).iterator();
        while (it.hasNext()) {
            AppInfo bean = getBean(packageManager, it.next());
            if (bean != null) {
                arrayList.add(bean);
            }
        }
        return arrayList;
    }

    private static AppInfo getBean(PackageManager packageManager, PackageInfo packageInfo) {
        if (packageManager == null || packageInfo == null) {
            return null;
        }
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        return new AppInfo(packageInfo.packageName, applicationInfo.loadLabel(packageManager).toString(), applicationInfo.loadIcon(packageManager), applicationInfo.sourceDir, packageInfo.versionName, packageInfo.versionCode, (applicationInfo.flags & 1) != 0);
    }

    private static File getFileByPath(String str) {
        if (isSpace(str)) {
            return null;
        }
        return new File(str);
    }

    public static String getSHA256StrJava(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Constants.ENCODING));
            return byte2Hex(messageDigest.digest());
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return "";
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static void gotoNotificationSettingPage(Context context) {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        }
        context.startActivity(intent);
    }

    public static void installApp(String str, String str2) {
        installApp(getFileByPath(str), str2);
    }

    public static boolean installAppSilent(String str) {
        return installAppSilent(getFileByPath(str), (String) null);
    }

    public static boolean isAppDebug() {
        return isAppDebug(Utils.getApp().getPackageName());
    }

    public static boolean isAppForeground() {
        return Utils.isAppForeground();
    }

    public static boolean isAppInstalled(@NonNull String str, @NonNull String str2) {
        Intent intent = new Intent(str);
        intent.addCategory(str2);
        return Utils.getApp().getPackageManager().resolveActivity(intent, 0) != null;
    }

    public static boolean isAppRoot() {
        return ShellUtils.execCmd("echo root", true).result == 0;
    }

    private static boolean isDeviceRooted() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/sbin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/xbin/", "/data/local/bin/", "/data/local/"};
        for (int i7 = 0; i7 < 8; i7++) {
            if (new File(q0.j(strArr[i7], "su")).exists()) {
                return true;
            }
        }
        return false;
    }

    private static boolean isFileExists(File file) {
        return file != null && file.exists();
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!Character.isWhitespace(str.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    public static void launchApp(String str) {
        if (isSpace(str)) {
            return;
        }
        Utils.getApp().startActivity(IntentUtils.getLaunchAppIntent(str, true));
    }

    public static void launchAppDetailsSettings() {
        launchAppDetailsSettings(Utils.getApp().getPackageName());
    }

    public static void uninstallApp(String str) {
        if (isSpace(str)) {
            return;
        }
        Utils.getApp().startActivity(IntentUtils.getUninstallAppIntent(str, true));
    }

    public static boolean uninstallAppSilent(String str) {
        return uninstallAppSilent(str, false);
    }

    public static Drawable getAppIcon(String str) {
        if (isSpace(str)) {
            return null;
        }
        try {
            PackageManager packageManager = Utils.getApp().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.applicationInfo.loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static AppInfo getAppInfo(String str) {
        try {
            PackageManager packageManager = Utils.getApp().getPackageManager();
            return getBean(packageManager, packageManager.getPackageInfo(str, 0));
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String getAppName(String str) {
        if (isSpace(str)) {
            return null;
        }
        try {
            PackageManager packageManager = Utils.getApp().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String getAppPath(String str) {
        if (isSpace(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = Utils.getApp().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Signature[] getAppSignature(String str) {
        if (isSpace(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = Utils.getApp().getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.signatures;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String getAppSignatureSHA1(@NonNull String str) {
        Signature[] appSignature = getAppSignature(str);
        if (appSignature == null || appSignature.length <= 0) {
            return null;
        }
        return encryptSHA1ToString(appSignature[0].toByteArray()).replaceAll("(?<=[0-9A-F]{2})[0-9A-F]{2}", ":$0");
    }

    public static int getAppVersionCode(String str) {
        if (isSpace(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = Utils.getApp().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static String getAppVersionName(String str) {
        if (isSpace(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = Utils.getApp().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void installApp(File file, String str) {
        if (isFileExists(file)) {
            Utils.getApp().startActivity(IntentUtils.getInstallAppIntent(file, str, true));
        }
    }

    public static boolean installAppSilent(File file) {
        return installAppSilent(file, (String) null);
    }

    public static boolean isAppDebug(String str) {
        if (isSpace(str)) {
            return false;
        }
        try {
            ApplicationInfo applicationInfo = Utils.getApp().getPackageManager().getApplicationInfo(str, 0);
            return (applicationInfo == null || (applicationInfo.flags & 2) == 0) ? false : true;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static void launchAppDetailsSettings(String str) {
        if (isSpace(str)) {
            return;
        }
        Utils.getApp().startActivity(IntentUtils.getLaunchAppDetailsSettingsIntent(str, true));
    }

    public static boolean uninstallAppSilent(String str, boolean z3) {
        if (isSpace(str)) {
            return false;
        }
        boolean zIsDeviceRooted = isDeviceRooted();
        StringBuilder sb2 = new StringBuilder("LD_LIBRARY_PATH=/vendor/lib*:/system/lib* pm uninstall ");
        sb2.append(z3 ? "-k " : "");
        sb2.append(str);
        ShellUtils.CommandResult commandResultExecCmd = ShellUtils.execCmd(sb2.toString(), zIsDeviceRooted, true);
        String str2 = commandResultExecCmd.successMsg;
        if (str2 != null && str2.toLowerCase().contains("success")) {
            return true;
        }
        Log.e("AppUtils", "uninstallAppSilent successMsg: " + commandResultExecCmd.successMsg + ", errorMsg: " + commandResultExecCmd.errorMsg);
        return false;
    }

    public static boolean installAppSilent(String str, String str2) {
        return installAppSilent(getFileByPath(str), str2);
    }

    public static void launchApp(Activity activity, String str, int i7) {
        if (isSpace(str)) {
            return;
        }
        activity.startActivityForResult(IntentUtils.getLaunchAppIntent(str), i7);
    }

    public static void uninstallApp(Activity activity, String str, int i7) {
        if (isSpace(str)) {
            return;
        }
        activity.startActivityForResult(IntentUtils.getUninstallAppIntent(str), i7);
    }

    public static void installApp(Activity activity, String str, String str2, int i7) {
        installApp(activity, getFileByPath(str), str2, i7);
    }

    public static boolean installAppSilent(File file, String str) {
        if (!isFileExists(file)) {
            return false;
        }
        boolean zIsDeviceRooted = isDeviceRooted();
        String str2 = "\"" + file.getAbsolutePath() + '\"';
        StringBuilder sb2 = new StringBuilder("LD_LIBRARY_PATH=/vendor/lib*:/system/lib* pm install ");
        sb2.append(str == null ? "" : str.concat(" "));
        sb2.append(str2);
        ShellUtils.CommandResult commandResultExecCmd = ShellUtils.execCmd(sb2.toString(), zIsDeviceRooted);
        String str3 = commandResultExecCmd.successMsg;
        if (str3 != null && str3.toLowerCase().contains("success")) {
            return true;
        }
        Log.e("AppUtils", "installAppSilent successMsg: " + commandResultExecCmd.successMsg + ", errorMsg: " + commandResultExecCmd.errorMsg);
        return false;
    }

    public static void installApp(Activity activity, File file, String str, int i7) {
        if (isFileExists(file)) {
            activity.startActivityForResult(IntentUtils.getInstallAppIntent(file, str), i7);
        }
    }

    public static boolean isAppInstalled(@NonNull String str) {
        return (isSpace(str) || IntentUtils.getLaunchAppIntent(str) == null) ? false : true;
    }
}
