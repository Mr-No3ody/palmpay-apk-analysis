package net.lingala.zip4j.crypto.PBKDF2;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements PRF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mac f39951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteArrayOutputStream f39953c = new ByteArrayOutputStream(4096);

    public a() {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            this.f39951a = mac;
            this.f39952b = mac.getMacLength();
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void a() {
        ByteArrayOutputStream byteArrayOutputStream = this.f39953c;
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int i7 = 0;
        while (i7 < length) {
            int i10 = i7 + 16;
            this.f39951a.update(byteArray, i7, i10 <= length ? 16 : length - i7);
            i7 = i10;
        }
        byteArrayOutputStream.reset();
    }

    @Override // net.lingala.zip4j.crypto.PBKDF2.PRF
    public final byte[] doFinal(byte[] bArr) {
        if (this.f39953c.size() > 0) {
            a();
        }
        return this.f39951a.doFinal(bArr);
    }

    @Override // net.lingala.zip4j.crypto.PBKDF2.PRF
    public final int getHLen() {
        return this.f39952b;
    }

    @Override // net.lingala.zip4j.crypto.PBKDF2.PRF
    public final void init(byte[] bArr) {
        try {
            this.f39951a.init(new SecretKeySpec(bArr, "HmacSHA1"));
        } catch (InvalidKeyException e10) {
            throw new RuntimeException(e10);
        }
    }
}
