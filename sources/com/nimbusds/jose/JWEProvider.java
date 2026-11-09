package com.nimbusds.jose;

import P5.g;
import com.nimbusds.jose.jca.JCAAware;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface JWEProvider extends JOSEProvider, JCAAware<Object> {
    Set<Object> supportedEncryptionMethods();

    Set<g> supportedJWEAlgorithms();
}
