package com.nimbusds.jose.proc;

import P5.d;
import P5.i;
import com.nimbusds.jose.JWEDecrypter;
import com.nimbusds.jose.JWEProvider;
import java.security.Key;

/* JADX INFO: loaded from: classes3.dex */
public interface JWEDecrypterFactory extends JWEProvider {
    JWEDecrypter createJWEDecrypter(i iVar, Key key) throws d;
}
