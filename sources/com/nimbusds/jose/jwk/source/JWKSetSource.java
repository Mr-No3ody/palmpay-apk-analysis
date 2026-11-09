package com.nimbusds.jose.jwk.source;

import P5.o;
import T5.f;
import U5.a;
import com.nimbusds.jose.proc.SecurityContext;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface JWKSetSource<C extends SecurityContext> extends Closeable {
    f getJWKSet(a aVar, long j6, C c6) throws o;
}
