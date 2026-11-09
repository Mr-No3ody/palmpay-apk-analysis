package com.nimbusds.jose.jwk.source;

import T5.f;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface JWKSetCache {
    f get();

    void put(f fVar);

    boolean requiresRefresh();
}
