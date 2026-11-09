package com.transsnet.mtn.sdk;

import E.AbstractC0198c;
import Xe.d;
import Xe.e;
import Xe.f;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.mtn.sdk.config.Configuration;
import com.transsnet.mtn.sdk.util.Auth;
import com.transsnet.mtn.sdk.util.MTNHandler;
import org.chromium.support_lib_boundary.util.b;
import p073f.c;
import p264r5.a;

/* JADX INFO: loaded from: classes3.dex */
public class MTN {
    public static final int ENV_CI = 4;
    public static final int ENV_DEV = 3;
    public static final int ENV_PREM = 2;
    public static final int ENV_PROD = 1;
    public static final String MTN = "100018";
    public static final String MTN_NG = "100016";
    public static final int RESULT_CANCEL = 886;
    public static final int RESULT_ERROR = 102;
    public static final int RESULT_YES = 101;

    public static String decrypt(String str) {
        if (str == null) {
            return null;
        }
        try {
            return a.a(str);
        } catch (Exception unused) {
            return str;
        }
    }

    public static void init(Context context, String str) {
        init(context, str, 1);
    }

    public static void start(Configuration configuration, MTNHandler mTNHandler) {
        Auth.go(configuration, mTNHandler);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x0095 A[Catch: NameNotFoundException -> 0x00a0, EDGE_INSN: B:26:0x0095->B:32:0x00a9 BREAK  A[LOOP:0: B:20:0x007c->B:31:0x00a6], TRY_LEAVE, TryCatch #1 {NameNotFoundException -> 0x00a0, blocks: (B:23:0x0088, B:26:0x0095), top: B:70:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4 A[EDGE_INSN: B:30:0x00a4->B:32:0x00a9 BREAK  A[LOOP:0: B:20:0x007c->B:31:0x00a6]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6 A[LOOP:0: B:20:0x007c->B:31:0x00a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc A[EDGE_INSN: B:41:0x00dc->B:47:0x00e8 BREAK  A[LOOP:1: B:36:0x00c4->B:46:0x00e5]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd A[Catch: all -> 0x00e0, EDGE_INSN: B:42:0x00dd->B:47:0x00e8 BREAK  A[LOOP:1: B:36:0x00c4->B:46:0x00e5], TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:39:0x00d0, B:42:0x00dd), top: B:68:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5 A[LOOP:1: B:36:0x00c4->B:46:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:56:0x0117 A[EDGE_INSN: B:56:0x0117->B:62:0x0123 BREAK  A[LOOP:2: B:51:0x00ff->B:61:0x0120]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0118 A[Catch: all -> 0x011b, EDGE_INSN: B:57:0x0118->B:62:0x0123 BREAK  A[LOOP:2: B:51:0x00ff->B:61:0x0120], TRY_LEAVE, TryCatch #2 {all -> 0x011b, blocks: (B:54:0x010b, B:57:0x0118), top: B:72:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0120 A[LOOP:2: B:51:0x00ff->B:61:0x0120, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x015a  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00a4 A[SYNTHETIC] */
    public static void init(Context context, String str, int i7) {
        String str2;
        String packageName;
        String str3;
        String string;
        String packageName2;
        String packageName3;
        int i10;
        int length;
        int i11;
        PackageInfo packageInfo;
        int length2;
        int i12;
        PackageInfo packageInfo2;
        int length3;
        int i13;
        PackageManager packageManager;
        PackageInfo packageInfo3;
        D3.a.f1587c = (Application) context.getApplicationContext();
        c.a().f36333a = str;
        if (i7 == 1) {
            str2 = "https://ng-app.oneloop.link";
        } else if (i7 == 2) {
            str2 = "https://ng-preprod-app.oneloop.link";
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    str2 = "https://test-oneloop.transspay.net";
                }
                e eVar = new e(D3.a.f1587c);
                eVar.f11203a = 60000;
                eVar.f11204b = 60000;
                d dVar = (d) eVar.f11206d;
                dVar.e("NG", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
                dVar.e(b.a(), "deviceId");
                dVar.e(Build.MODEL, "deviceModel");
                dVar.e("android", "deviceType");
                dVar.e(Build.BRAND, "brand");
                dVar.e("1.0.21", "version");
                StringBuilder sb2 = new StringBuilder();
                packageName = D3.a.f1587c.getPackageName();
                str3 = null;
                if (packageName == null) {
                    string = null;
                    break;
                }
                length3 = packageName.length();
                i13 = 0;
                while (true) {
                    if (i13 >= length3) {
                        if (Character.isWhitespace(packageName.charAt(i13))) {
                            i13++;
                        } else {
                            try {
                                packageManager = D3.a.f1587c.getPackageManager();
                                packageInfo3 = packageManager.getPackageInfo(packageName, 0);
                                if (packageInfo3 == null) {
                                    string = packageInfo3.applicationInfo.loadLabel(packageManager).toString();
                                    break;
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    string = null;
                    break;
                }
                sb2.append(string);
                sb2.append("/");
                StringBuilder sb3 = new StringBuilder();
                packageName2 = D3.a.f1587c.getPackageName();
                if (packageName2 != null) {
                    length2 = packageName2.length();
                    for (i12 = 0; i12 < length2; i12++) {
                        if (!Character.isWhitespace(packageName2.charAt(i12))) {
                            try {
                                packageInfo2 = D3.a.f1587c.getPackageManager().getPackageInfo(packageName2, 0);
                                if (packageInfo2 != null) {
                                    str3 = packageInfo2.versionName;
                                    break;
                                }
                                break;
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    }
                }
                sb3.append(str3);
                sb3.append("");
                packageName3 = D3.a.f1587c.getPackageName();
                i10 = -1;
                if (packageName3 != null) {
                    length = packageName3.length();
                    for (i11 = 0; i11 < length; i11++) {
                        if (!Character.isWhitespace(packageName3.charAt(i11))) {
                            try {
                                packageInfo = D3.a.f1587c.getPackageManager().getPackageInfo(packageName3, 0);
                                if (packageInfo != null) {
                                    i10 = packageInfo.versionCode;
                                    break;
                                }
                                break;
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                        }
                    }
                }
                sb3.append(i10);
                sb2.append(sb3.toString());
                sb2.append(" (Android ");
                sb2.append(Build.VERSION.RELEASE);
                sb2.append(")");
                dVar.e(sb2.toString(), "User-Agent");
                dVar.e(c.a().f36333a, "secret_key");
                AbstractC0198c.f1997f = new f(eVar);
                G8.a.f3160b = i7 != 1;
            }
            str2 = "https://ng-test-app.oneloop.link";
        }
        p002a.a.f11813b = str2;
        e eVar2 = new e(D3.a.f1587c);
        eVar2.f11203a = 60000;
        eVar2.f11204b = 60000;
        d dVar2 = (d) eVar2.f11206d;
        dVar2.e("NG", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        dVar2.e(b.a(), "deviceId");
        dVar2.e(Build.MODEL, "deviceModel");
        dVar2.e("android", "deviceType");
        dVar2.e(Build.BRAND, "brand");
        dVar2.e("1.0.21", "version");
        StringBuilder sb4 = new StringBuilder();
        packageName = D3.a.f1587c.getPackageName();
        str3 = null;
        if (packageName == null) {
            string = null;
            break;
        }
        length3 = packageName.length();
        i13 = 0;
        while (true) {
            if (i13 >= length3) {
                if (Character.isWhitespace(packageName.charAt(i13))) {
                    packageManager = D3.a.f1587c.getPackageManager();
                    packageInfo3 = packageManager.getPackageInfo(packageName, 0);
                    if (packageInfo3 == null) {
                        string = packageInfo3.applicationInfo.loadLabel(packageManager).toString();
                        break;
                    }
                } else {
                    i13++;
                }
            }
            string = null;
            break;
        }
        sb4.append(string);
        sb4.append("/");
        StringBuilder sb5 = new StringBuilder();
        packageName2 = D3.a.f1587c.getPackageName();
        if (packageName2 != null) {
            length2 = packageName2.length();
            while (i12 < length2) {
                if (!Character.isWhitespace(packageName2.charAt(i12))) {
                    packageInfo2 = D3.a.f1587c.getPackageManager().getPackageInfo(packageName2, 0);
                    if (packageInfo2 != null) {
                        break;
                        break;
                    } else {
                        str3 = packageInfo2.versionName;
                        break;
                    }
                }
            }
        }
        sb5.append(str3);
        sb5.append("");
        packageName3 = D3.a.f1587c.getPackageName();
        i10 = -1;
        if (packageName3 != null) {
            length = packageName3.length();
            while (i11 < length) {
                if (!Character.isWhitespace(packageName3.charAt(i11))) {
                    packageInfo = D3.a.f1587c.getPackageManager().getPackageInfo(packageName3, 0);
                    if (packageInfo != null) {
                        break;
                        break;
                    } else {
                        i10 = packageInfo.versionCode;
                        break;
                    }
                }
            }
        }
        sb5.append(i10);
        sb4.append(sb5.toString());
        sb4.append(" (Android ");
        sb4.append(Build.VERSION.RELEASE);
        sb4.append(")");
        dVar2.e(sb4.toString(), "User-Agent");
        dVar2.e(c.a().f36333a, "secret_key");
        AbstractC0198c.f1997f = new f(eVar2);
        G8.a.f3160b = i7 != 1;
    }
}
