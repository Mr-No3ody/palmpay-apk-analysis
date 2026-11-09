package p350xa;

import F6.d;
import Hg.c;
import N8.q0;
import Pa.C0525w;
import Pa.n0;
import Pg.k;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.alibaba.android.arouter.utils.Consts;
import com.google.maps.android.BuildConfig;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.util.statistic.TrackEvent;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.util.RegexUtils;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Interceptor;
import okhttp3.J;
import okhttp3.L;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.h0;
import org.json.JSONObject;
import p183m6.n;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L f43730a = L.f40589e.parse("application/json; charset=utf-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f43731b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f43732c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f43733d = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile PublicKey f43734e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final OAEPParameterSpec f43735f = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f43736g = new c(11);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f43737i = new c(12);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f43738j = new c(13);

    public static Y a(Y y8, String str) {
        X xB = y8.b();
        xB.e("X-Response-Encryption-Required", "false");
        xB.e("X-Body-Encrypted", "false");
        c0 c0Var = y8.f40688d;
        if (c0Var != null && !TextUtils.isEmpty(str)) {
            L lContentType = c0Var.contentType();
            if (lContentType == null) {
                lContentType = f43730a;
            }
            xB.g(y8.f40686b, c0.create(lContentType, str));
        }
        return xB.b();
    }

    public static String b(String str, byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int iIndexOf = str != null ? str.indexOf(46) : -1;
        if (iIndexOf <= 0 || iIndexOf >= str.length() - 1) {
            throw new IllegalArgumentException("Invalid encrypted data format");
        }
        byte[] bArrDecode = Base64.decode(str.substring(0, iIndexOf), 2);
        byte[] bArrDecode2 = Base64.decode(str.substring(iIndexOf + 1), 2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrDecode);
        Cipher cipher = (Cipher) f43737i.get();
        if (cipher == null) {
            throw new IllegalStateException("AES_GCM_CIPHER is null");
        }
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        return new String(cipher.doFinal(bArrDecode2), StandardCharsets.UTF_8);
    }

    public static String c(String str, byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr2 = new byte[12];
        ((SecureRandom) f43738j.get()).nextBytes(bArr2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr2);
        Cipher cipher = (Cipher) f43737i.get();
        if (cipher == null) {
            throw new IllegalStateException("AES_GCM_CIPHER is null");
        }
        cipher.init(1, secretKeySpec, gCMParameterSpec);
        return q0.y(Base64.encodeToString(bArr2, 2).trim(), Consts.DOT, Base64.encodeToString(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)), 2).trim());
    }

    public static String d(byte[] bArr) {
        PublicKey publicKey;
        if (bArr.length == 0) {
            throw new IllegalArgumentException("AES key is empty");
        }
        try {
            if (f43734e == null) {
                f43734e = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(SecurityUtils.c(), 0)));
            }
            publicKey = f43734e;
        } catch (Exception e10) {
            Log.e("EncryptionInterceptor", "getOrCreateRsaPublicKey: ", e10);
            publicKey = null;
        }
        if (publicKey == null) {
            throw new IllegalStateException("Create Rsp Public Key fail");
        }
        try {
            Cipher cipher = (Cipher) f43736g.get();
            if (cipher == null) {
                throw new IllegalStateException("RSA_OAEP_CIPHER is null");
            }
            cipher.init(1, publicKey, f43735f, (SecureRandom) f43738j.get());
            return Base64.encodeToString(cipher.doFinal(bArr), 2).trim();
        } catch (Exception e11) {
            throw new IllegalArgumentException("Unsupported RSA-OAEP configuration: RSA/ECB/OAEPPadding (OAEP SHA-256, MGF1 SHA-256). Please ensure the device JCA provider supports OAEPParameterSpec.", e11);
        }
    }

    public static String e() {
        String str = f43731b;
        if (str != null) {
            TextUtils.isEmpty(str);
            return f43731b;
        }
        try {
            String strD = n.f39523a.instance().d("E2EE_base_host", "");
            if (!RegexUtils.isURL(strD)) {
                strD = "";
            }
            f43731b = strD;
            TextUtils.isEmpty(strD);
        } catch (Throwable th) {
            Log.e("EncryptionInterceptor", "RemoteConfig not ready, fallback disabled. err=".concat(th.getClass().getSimpleName()));
            f43731b = "";
        }
        return f43731b;
    }

    public static void f(String str) {
        Boolean bool;
        int iIncrementAndGet = f43733d.incrementAndGet();
        d.c("EncryptionInterceptor", com.airbnb.lottie.model.layer.d.j("encrypt error count=", iIncrementAndGet, ", reason=", str));
        n0 n0VarG = n0.g();
        n0VarG.getClass();
        TrackEvent trackEvent = new TrackEvent("E2EE_ERROR");
        HashMap map = new HashMap();
        map.put("msg", str);
        n0VarG.q(trackEvent.putAll(map));
        if (iIncrementAndGet <= 10 || (bool = f43732c) == null || !bool.booleanValue()) {
            return;
        }
        f43732c = Boolean.FALSE;
        d.c("EncryptionInterceptor", "encrypt error count exceeded threshold, force disable encryption");
    }

    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws IOException {
        String strA;
        String str;
        c0 c0Var;
        L lContentType;
        String utf8;
        AtomicInteger atomicInteger;
        int i7;
        Y yRequest = chain.request();
        if (f43732c == null) {
            f43732c = Boolean.valueOf(!TextUtils.isEmpty(e()));
        }
        if (f43732c.booleanValue() && ((strA = yRequest.a("X-Body-Encrypted")) == null || !"false".equalsIgnoreCase(strA.trim()))) {
            String strE = e();
            if (TextUtils.isEmpty(strE)) {
                str = "";
            } else {
                try {
                    J j6 = J.f40577k.parse(strE);
                    if (j6 == null) {
                        str = "";
                    } else {
                        str = j6.f40582d;
                        if (!str.startsWith("ng-")) {
                            str = BaseApplication.getCountryLocale().toLowerCase() + "-" + str;
                        }
                    }
                } catch (Throwable th) {
                    d.c("EncryptionInterceptor", "getEffectiveE2EEHost failed", th);
                }
            }
            if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase(yRequest.f40685a.f40582d) && (c0Var = yRequest.f40688d) != null) {
                try {
                    if (c0Var.contentLength() != 0 && (lContentType = c0Var.contentType()) != null && lContentType.f40594c.contains("json")) {
                        SystemClock.elapsedRealtime();
                        SystemClock.currentThreadTimeMillis();
                        try {
                            k kVar = new k();
                            if (c0Var != null) {
                                c0Var.writeTo(kVar);
                                utf8 = kVar.readUtf8();
                            } else {
                                utf8 = "";
                            }
                        } catch (IOException unused) {
                        }
                        if (TextUtils.isEmpty(utf8) || "{}".equals(utf8)) {
                            d.c("EncryptionInterceptor", "Request body is empty, no need to encrypt");
                            return chain.proceed(a(yRequest, utf8));
                        }
                        byte[] bArr = new byte[32];
                        ((SecureRandom) f43738j.get()).nextBytes(bArr);
                        try {
                            String string = new JSONObject().put("encryptedBody", c(utf8, bArr)).put("encryptedKey", d(bArr)).toString();
                            L l5 = f43730a;
                            c0 c0VarCreate = c0.create(l5, string);
                            X xB = yRequest.b();
                            xB.e("X-Body-Encrypted", "true");
                            xB.e("X-Encryption-Key-Version", "v1");
                            xB.g(yRequest.f40686b, c0VarCreate);
                            xB.e("X-Response-Encryption-Required", "true");
                            e0 e0VarProceed = chain.proceed(xB.b());
                            boolean zIsSuccessful = e0VarProceed.isSuccessful();
                            int i10 = e0VarProceed.f40731d;
                            h0 h0Var = e0VarProceed.f40734g;
                            if (!zIsSuccessful) {
                                if (i10 != 400 || h0Var == null) {
                                    return e0VarProceed;
                                }
                                String strString = h0Var.string();
                                if (TextUtils.isEmpty(strString) || !strString.contains("E2EE")) {
                                    L lContentType2 = h0Var.contentType();
                                    d0 d0VarC = e0VarProceed.c();
                                    d0VarC.f40721g = h0.create(lContentType2, strString);
                                    return d0VarC.a();
                                }
                                d.c("EncryptionInterceptor", "Bad Request: ".concat(strString));
                                f("response 400 contains E2EE");
                                throw new IOException("E2EE:" + C0525w.j(strString, "message"));
                            }
                            if (h0Var == null) {
                                return e0VarProceed;
                            }
                            String strString2 = h0Var.string();
                            if (TextUtils.isEmpty(strString2)) {
                                d.c("EncryptionInterceptor", "decryptResponse: empty response body");
                                L lContentType3 = h0Var.contentType();
                                d0 d0VarC2 = e0VarProceed.c();
                                d0VarC2.f40721g = h0.create(lContentType3, "");
                                return d0VarC2.a();
                            }
                            try {
                                JSONObject jSONObject = new JSONObject(strString2);
                                if (!jSONObject.has("encryptedData")) {
                                    L lContentType4 = h0Var.contentType();
                                    d0 d0VarC3 = e0VarProceed.c();
                                    d0VarC3.f40721g = h0.create(lContentType4, strString2);
                                    return d0VarC3.a();
                                }
                                String strB = b(jSONObject.getString("encryptedData"), bArr);
                                do {
                                    atomicInteger = f43733d;
                                    i7 = atomicInteger.get();
                                    if (i7 <= 0) {
                                        break;
                                    }
                                } while (!atomicInteger.compareAndSet(i7, i7 - 1));
                                d0 d0VarC4 = e0VarProceed.c();
                                d0VarC4.f40721g = h0.create(l5, strB);
                                return d0VarC4.a();
                            } catch (Exception e10) {
                                StringBuilder sb2 = new StringBuilder("decryptResponse failed. path=");
                                Y y8 = e0VarProceed.f40728a;
                                sb2.append(y8 != null ? y8.f40685a.b() : BuildConfig.TRAVIS);
                                sb2.append(", httpCode=");
                                sb2.append(i10);
                                d.c("EncryptionInterceptor", sb2.toString(), e10);
                                f("decrypt response failed");
                                throw new IOException("E2EE_D_1:", e10);
                            }
                        } catch (Exception e11) {
                            d.c("EncryptionInterceptor", "RSA Encryption error", e11);
                            f("encrypt request failed");
                            return chain.proceed(a(yRequest, utf8));
                        }
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return chain.proceed(a(yRequest, null));
    }
}
