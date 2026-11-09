package com.transsnet.palmpay.security.utils;

import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes4.dex */
public interface FingerPrintHelper$AuthenticationCallback {
    void onAuthenticationError();

    void onAuthenticationFailed();

    void onAuthenticationSucceeded(Cipher cipher);
}
