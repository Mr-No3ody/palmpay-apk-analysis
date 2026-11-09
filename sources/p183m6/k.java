package p183m6;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.tencent.mmkv.MMKV;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static MMKV f39521a;

    public static String a(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuffer stringBuffer = new StringBuffer();
            for (int i7 = 0; i7 < bArrDigest.length; i7++) {
                int i10 = bArrDigest[i7];
                if (i10 < 0) {
                    i10 += IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                }
                if (i10 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i10));
            }
            return stringBuffer.toString().toUpperCase();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo == null) {
                return "";
            }
            return packageInfo.versionName + "&" + packageInfo.versionCode;
        } catch (Throwable unused) {
            return "";
        }
    }
}
