package com.nimbusds.jose;

import P5.k;
import S5.a;
import com.nimbusds.jose.jca.JCAAware;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface JWSProvider extends JOSEProvider, JCAAware<a> {
    Set<k> supportedJWSAlgorithms();
}
