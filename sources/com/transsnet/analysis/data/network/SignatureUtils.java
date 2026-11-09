package com.transsnet.analysis.data.network;

import android.os.Build;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.transsnet.analysis.utils.StringUtil;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import p307u8.c;
import p307u8.d;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureUtils {
    private static ThreadLocal<Signature> SIGNATURE_CACHE;
    private static Map<String, PrivateKey> cachedPrivateKeys;

    private static synchronized PrivateKey getPrivateKey(String key) {
        PrivateKey privateKeyGeneratePrivate;
        try {
            if (cachedPrivateKeys == null) {
                cachedPrivateKeys = new HashMap();
            }
            privateKeyGeneratePrivate = cachedPrivateKeys.get(key);
            if (privateKeyGeneratePrivate == null) {
                try {
                    privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(key, 2)));
                } catch (Exception e10) {
                    e10.getMessage();
                }
                if (privateKeyGeneratePrivate != null) {
                    cachedPrivateKeys.put(key, privateKeyGeneratePrivate);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return privateKeyGeneratePrivate;
    }

    @RequiresApi(api = 26)
    private static ThreadLocal<Signature> getSignatureCache() {
        if (SIGNATURE_CACHE == null) {
            SIGNATURE_CACHE = new d(new c(0), 0);
        }
        return SIGNATURE_CACHE;
    }

    public static String getSignatureHeader(String originData, String key) {
        return sign(StringUtil.encryptMD5String(originData), key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Signature lambda$getSignatureCache$0() {
        try {
            return Signature.getInstance("SHA1WithRSA");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String sign(String originData, String key) {
        ThreadLocal<Signature> signatureCache;
        try {
            PrivateKey privateKey = getPrivateKey(key);
            if (privateKey == null) {
                return null;
            }
            Signature signature = (Build.VERSION.SDK_INT < 26 || (signatureCache = getSignatureCache()) == null) ? null : signatureCache.get();
            if (signature == null) {
                signature = Signature.getInstance("SHA1WithRSA");
            }
            if (signature == null) {
                return null;
            }
            signature.initSign(privateKey);
            signature.update(originData.getBytes(StandardCharsets.UTF_8));
            return Base64.encodeToString(signature.sign(), 2);
        } catch (Exception unused) {
            return null;
        }
    }
}
