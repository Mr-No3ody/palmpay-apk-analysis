package com.nimbusds.jose.proc;

import P5.i;
import P5.o;
import com.nimbusds.jose.proc.SecurityContext;
import java.security.Key;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface JWEKeySelector<C extends SecurityContext> {
    List<? extends Key> selectJWEKeys(i iVar, C c6) throws o;
}
