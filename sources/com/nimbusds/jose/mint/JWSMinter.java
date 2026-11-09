package com.nimbusds.jose.mint;

import P5.d;
import P5.l;
import P5.n;
import P5.p;
import com.nimbusds.jose.proc.SecurityContext;

/* JADX INFO: loaded from: classes3.dex */
public interface JWSMinter<C extends SecurityContext> {
    n mint(l lVar, p pVar, C c6) throws d;
}
