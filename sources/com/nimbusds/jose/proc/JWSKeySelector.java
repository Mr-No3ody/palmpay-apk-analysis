package com.nimbusds.jose.proc;

import P5.l;
import P5.o;
import com.nimbusds.jose.proc.SecurityContext;
import java.security.Key;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface JWSKeySelector<C extends SecurityContext> {
    List<? extends Key> selectJWSKeys(l lVar, C c6) throws o;
}
