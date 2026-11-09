package com.nimbusds.jose;

import P5.d;
import Z5.b;
import java.security.Signature;

/* JADX INFO: loaded from: classes3.dex */
public interface CompletableJWSObjectSigning {
    b complete() throws d;

    Signature getInitializedSignature();
}
