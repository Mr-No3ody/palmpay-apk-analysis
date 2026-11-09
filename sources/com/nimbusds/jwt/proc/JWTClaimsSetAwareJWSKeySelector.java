package com.nimbusds.jwt.proc;

import P5.l;
import P5.o;
import com.nimbusds.jose.proc.SecurityContext;
import java.security.Key;
import java.util.List;
import p022b6.b;

/* JADX INFO: loaded from: classes3.dex */
public interface JWTClaimsSetAwareJWSKeySelector<C extends SecurityContext> {
    List<? extends Key> selectKeys(l lVar, b bVar, C c6) throws o;
}
