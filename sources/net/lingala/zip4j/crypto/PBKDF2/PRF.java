package net.lingala.zip4j.crypto.PBKDF2;

/* JADX INFO: loaded from: classes4.dex */
interface PRF {
    byte[] doFinal(byte[] bArr);

    int getHLen();

    void init(byte[] bArr);
}
