package com.nimbusds.jose.jwk.source;

import P5.o;
import T5.d;
import T5.e;
import com.nimbusds.jose.proc.SecurityContext;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface JWKSource<C extends SecurityContext> {
    List<d> get(e eVar, C c6) throws o;
}
