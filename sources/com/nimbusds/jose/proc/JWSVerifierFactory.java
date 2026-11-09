package com.nimbusds.jose.proc;

import P5.d;
import P5.l;
import com.nimbusds.jose.JWSProvider;
import com.nimbusds.jose.JWSVerifier;
import java.security.Key;

/* JADX INFO: loaded from: classes3.dex */
public interface JWSVerifierFactory extends JWSProvider {
    JWSVerifier createJWSVerifier(l lVar, Key key) throws d;
}
