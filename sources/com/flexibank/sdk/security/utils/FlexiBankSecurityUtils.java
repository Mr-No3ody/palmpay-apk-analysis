package com.flexibank.sdk.security.utils;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Keep;
import com.transsnet.palmpay.util.EncryptUtils;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0083 ¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0083 ¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/flexibank/sdk/security/utils/FlexiBankSecurityUtils;", "", "", "input", "nativeEncryptPin", "(Ljava/lang/String;)Ljava/lang/String;", "object", "nativeGetPrivateKey", "(Ljava/lang/Object;)Ljava/lang/String;", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankSecurityUtils {
    static {
        try {
            System.loadLibrary("flexi_sec");
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        try {
            String strNativeEncryptPin = nativeEncryptPin(str);
            if (strNativeEncryptPin == null) {
                return "";
            }
            String strEncryptMD5ToString = EncryptUtils.encryptMD5ToString(strNativeEncryptPin);
            Intrinsics.checkNotNullExpressionValue(strEncryptMD5ToString, "encryptMD5ToString(...)");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = strEncryptMD5ToString.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        } catch (Throwable th) {
            Log.e("FlexiBankSecurityUtils", "encryptPin: ", th);
            return "";
        }
    }

    public static String b(String... data) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        String strNativeGetPrivateKey;
        Intrinsics.checkNotNullParameter(data, "data");
        StringBuilder sb2 = new StringBuilder();
        for (String str : data) {
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            strNativeGetPrivateKey = nativeGetPrivateKey(null);
        } catch (Throwable unused) {
            strNativeGetPrivateKey = "";
        }
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(strNativeGetPrivateKey, 2)));
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initSign(privateKeyGeneratePrivate);
        signature.update(bytes);
        byte[] bArrEncode = Base64.encode(signature.sign(), 2);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(...)");
        return new String(bArrEncode, charset);
    }

    @JvmStatic
    @Keep
    private static final native String nativeEncryptPin(String input);

    @JvmStatic
    @Keep
    private static final native String nativeGetPrivateKey(Object object);
}
