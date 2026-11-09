package com.transsnet.palmpay.security.utils;

import F6.d;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Keep;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class SecurityUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f33145a;

    static {
        try {
            System.loadLibrary("security");
        } catch (Throwable unused) {
        }
        f33145a = null;
    }

    public static String a(String str) {
        try {
            return nativeEncryptPin(str).toUpperCase();
        } catch (Throwable th) {
            d.c("SecurityUtils", "encryptPin: ", th);
            return "";
        }
    }

    public static String b() {
        try {
            return nativeGetAESKey();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String c() {
        try {
            return nativeGetRsaPublicKeyV2();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static synchronized void d() {
        if (f33145a != null) {
            return;
        }
        if (Process.is64Bit()) {
            try {
                int iNativeInstallRenderProxy = nativeInstallRenderProxy();
                f33145a = Boolean.valueOf(iNativeInstallRenderProxy >= 0);
                if (iNativeInstallRenderProxy == 0) {
                    d.h("RenderHook", 3, "renderProxy hook: success");
                } else if (iNativeInstallRenderProxy > 0) {
                    d.h("RenderHook", 3, "renderProxy hook: core installed, optional skipped mask=" + iNativeInstallRenderProxy);
                } else {
                    d.c("RenderHook", "renderProxy hook: failed, ret=" + iNativeInstallRenderProxy);
                }
            } catch (Throwable th) {
                d.c("RenderHook", "renderProxy hook: install exception", th);
                f33145a = Boolean.FALSE;
            }
        } else {
            f33145a = Boolean.TRUE;
            Log.e("RenderHook", "renderProxy hook: skip, MODEL " + Build.MODEL);
        }
        f33145a.getClass();
    }

    public static String e(byte[] bArr) {
        String strNativeGetPrivateKey;
        try {
            strNativeGetPrivateKey = nativeGetPrivateKey(null);
        } catch (Throwable unused) {
            strNativeGetPrivateKey = "";
        }
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(strNativeGetPrivateKey, 2)));
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initSign(privateKeyGeneratePrivate);
        signature.update(bArr);
        return new String(Base64.encode(signature.sign(), 2));
    }

    public static String f(String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
        }
        return e(sb2.toString().getBytes());
    }

    public static String g(String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("ANDROID");
        sb2.append(str2);
        sb2.append(str3);
        if (!TextUtils.isEmpty(str4)) {
            sb2.append(str4);
        }
        return e(sb2.toString().getBytes());
    }

    @Keep
    private static native String nativeEncryptPin(String str);

    @Keep
    private static native String nativeGetAESKey();

    private static native String nativeGetCA1();

    @Keep
    private static native String nativeGetCA2();

    private static native String nativeGetCA3();

    @Keep
    private static native String nativeGetPrivateKey(Object obj);

    @Keep
    private static native String nativeGetRsaPublicKey();

    @Keep
    private static native String nativeGetRsaPublicKeyV2();

    private static native int nativeInstallRenderProxy();

    @Keep
    private static native String nativeSign(byte[] bArr);

    private static native void nativeUninstallRenderProxy();
}
