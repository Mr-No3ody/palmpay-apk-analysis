package p145jd;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38590a;

    public a(Context context) {
        String string = context.getSharedPreferences("KeyGenTool", 0).getString("key_alias", null);
        if (TextUtils.isEmpty(string)) {
            f(context);
        } else {
            this.f38590a = string;
        }
    }

    public static void a(Context context) {
        try {
            String string = context.getSharedPreferences("KeyGenTool", 0).getString("key_alias", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            KeyStore.getInstance("AndroidKeyStore").deleteEntry(string);
        } catch (Exception e10) {
            e10.toString();
        }
    }

    public static void b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry(str);
        } catch (Exception e10) {
            e10.toString();
        }
    }

    public static Cipher c(String str, byte[] bArr) throws InvalidKeyException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, e(str, true), new IvParameterSpec(bArr));
            return cipher;
        } catch (Exception e10) {
            if (e10 instanceof InvalidKeyException) {
                throw ((InvalidKeyException) e10);
            }
            return null;
        }
    }

    public static Cipher d(String str, boolean z3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, e(str, z3));
        return cipher;
    }

    public static SecretKey e(String str, boolean z3) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        if (keyStore == null) {
            return null;
        }
        keyStore.load(null);
        if (keyStore.isKeyEntry(str)) {
            return ((KeyStore.SecretKeyEntry) keyStore.getEntry(str, null)).getSecretKey();
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, 3);
        builder.setBlockModes("CBC");
        builder.setEncryptionPaddings("PKCS7Padding");
        builder.setUserAuthenticationRequired(true);
        builder.setInvalidatedByBiometricEnrollment(z3);
        keyGenerator.init(builder.build());
        return keyGenerator.generateKey();
    }

    public final void f(Context context) {
        if (context == null) {
            return;
        }
        String str = context.getPackageName() + "fingerprint" + System.currentTimeMillis();
        context.getSharedPreferences("KeyGenTool", 0).edit().putString("key_alias", str).apply();
        this.f38590a = str;
    }
}
