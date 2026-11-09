package com.transsnet.palmpay.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RequiresPermission;
import androidx.core.content.f;
import com.luck.picture.lib.config.SelectMimeType;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class IntentUtils {
    private IntentUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean checkAppInstalled(Context context, String str) {
        PackageInfo packageInfo;
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Exception e10) {
            e10.printStackTrace();
            packageInfo = null;
        }
        return packageInfo != null;
    }

    private static Intent checkOpenUrlIntent(Intent intent) {
        ActivityInfo activityInfo;
        Intent intentFindTrustIntent;
        PackageManager packageManager = Utils.getApp().getPackageManager();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        return (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null || !"team.opay.pay.merchant.service".equals(activityInfo.packageName) || (intentFindTrustIntent = findTrustIntent(packageManager, intent)) == null) ? intent : intentFindTrustIntent;
    }

    private static Intent findTrustIntent(PackageManager packageManager, Intent intent) {
        String[] strArr = {"com.android.chrome", "com.transsion.phoenix", "org.mozilla.firefox", "com.microsoft.emmx", "com.brave.browser"};
        for (int i7 = 0; i7 < 5; i7++) {
            String str = strArr[i7];
            Intent intent2 = new Intent(intent);
            intent2.setPackage(str);
            if (packageManager.resolveActivity(intent, 65536) != null) {
                return intent2;
            }
        }
        return null;
    }

    @RequiresPermission("android.permission.CALL_PHONE")
    public static Intent getCallIntent(String str) {
        return getCallIntent(str, false);
    }

    public static Intent getCaptureIntent(Uri uri) {
        return getCaptureIntent(uri, false);
    }

    public static Intent getComponentIntent(String str, String str2) {
        return getComponentIntent(str, str2, null, false);
    }

    public static Intent getDialIntent(String str) {
        return getDialIntent(str, false);
    }

    public static Intent getInstallAppIntent(String str, String str2) {
        return getInstallAppIntent(FileUtils.getFileByPath(str), str2);
    }

    private static Intent getIntent(Intent intent, boolean z3) {
        return z3 ? intent.addFlags(268435456) : intent;
    }

    public static Intent getLaunchAppDetailsSettingsIntent(String str) {
        return getLaunchAppDetailsSettingsIntent(str, false);
    }

    public static Intent getLaunchAppIntent(String str) {
        return getLaunchAppIntent(str, false);
    }

    public static Intent getLaunchSecuritySettingsIntent(boolean z3) {
        return getIntent(new Intent("android.settings.SECURITY_SETTINGS"), z3);
    }

    public static Intent getLaunchWifiSettingsIntent(boolean z3) {
        return getIntent(new Intent("android.settings.WIFI_SETTINGS"), z3);
    }

    public static Intent getOpenUrlIntent(String str, boolean z3) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        return getIntent(checkOpenUrlIntent(intent), z3);
    }

    public static Intent getSendEmailIntent(String str, boolean z3) {
        return getIntent(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + str)), z3);
    }

    public static Intent getSendSmsIntent(String str, String str2) {
        return getSendSmsIntent(str, str2, false);
    }

    public static Intent getShareImageIntent(String str, String str2) {
        return getShareImageIntent(str, str2, false);
    }

    public static Intent getShareTextIntent(String str) {
        return getShareTextIntent(str, false);
    }

    public static Intent getShutdownIntent() {
        return getShutdownIntent(false);
    }

    public static Intent getUninstallAppIntent(String str) {
        return getUninstallAppIntent(str, false);
    }

    @RequiresPermission("android.permission.CALL_PHONE")
    public static Intent getCallIntent(String str, boolean z3) {
        return getIntent(new Intent("android.intent.action.CALL", Uri.parse("tel:" + str)), z3);
    }

    public static Intent getCaptureIntent(Uri uri, boolean z3) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", uri);
        intent.addFlags(1);
        return getIntent(intent, z3);
    }

    public static Intent getComponentIntent(String str, String str2, boolean z3) {
        return getComponentIntent(str, str2, null, z3);
    }

    public static Intent getDialIntent(String str, boolean z3) {
        return getIntent(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)), z3);
    }

    public static Intent getInstallAppIntent(File file, String str) {
        return getInstallAppIntent(file, str, false);
    }

    public static Intent getLaunchAppDetailsSettingsIntent(String str, boolean z3) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + str));
        return getIntent(intent, z3);
    }

    public static Intent getLaunchAppIntent(String str, boolean z3) {
        Intent launchIntentForPackage = Utils.getApp().getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        return getIntent(launchIntentForPackage, z3);
    }

    public static Intent getSendSmsIntent(String str, String str2, boolean z3) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
        intent.putExtra("sms_body", str2);
        return getIntent(intent, z3);
    }

    public static Intent getShareImageIntent(String str, String str2, boolean z3) {
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        return getShareImageIntent(str, new File(str2), z3);
    }

    public static Intent getShareTextIntent(String str, boolean z3) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        return getIntent(intent, z3);
    }

    public static Intent getShutdownIntent(boolean z3) {
        Intent intent = new Intent("android.intent.action.ACTION_REQUEST_SHUTDOWN");
        intent.putExtra("android.intent.extra.KEY_CONFIRM", false);
        return getIntent(intent, z3);
    }

    public static Intent getUninstallAppIntent(String str, boolean z3) {
        Intent intent = new Intent("android.intent.action.DELETE");
        intent.setData(Uri.parse("package:" + str));
        return getIntent(intent, z3);
    }

    public static Intent getComponentIntent(String str, String str2, Bundle bundle) {
        return getComponentIntent(str, str2, bundle, false);
    }

    public static Intent getInstallAppIntent(File file, String str, boolean z3) {
        if (file == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(1);
        intent.setDataAndType(f.getUriForFile(Utils.getApp(), str, file), "application/vnd.android.package-archive");
        return getIntent(intent, z3);
    }

    public static Intent getComponentIntent(String str, String str2, Bundle bundle, boolean z3) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setComponent(new ComponentName(str, str2));
        return getIntent(intent, z3);
    }

    public static Intent getShareImageIntent(String str, File file) {
        return getShareImageIntent(str, file, false);
    }

    public static Intent getShareImageIntent(String str, File file, boolean z3) {
        if (file == null || !file.isFile()) {
            return getShareImageIntent(str, Uri.fromFile(file), z3);
        }
        return null;
    }

    public static Intent getShareImageIntent(String str, Uri uri) {
        return getShareImageIntent(str, uri, false);
    }

    public static Intent getShareImageIntent(String str, Uri uri, boolean z3) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType(SelectMimeType.SYSTEM_IMAGE);
        return getIntent(intent, z3);
    }
}
