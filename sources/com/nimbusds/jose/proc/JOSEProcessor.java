package com.nimbusds.jose.proc;

import E.AbstractC0210o;
import P5.d;
import P5.e;
import P5.j;
import P5.n;
import P5.p;
import P5.q;
import com.nimbusds.jose.proc.SecurityContext;
import java.text.ParseException;

/* JADX INFO: loaded from: classes3.dex */
public interface JOSEProcessor<C extends SecurityContext> {
    p process(e eVar, C c6) throws AbstractC0210o, d;

    p process(j jVar, C c6) throws AbstractC0210o, d;

    p process(n nVar, C c6) throws AbstractC0210o, d;

    p process(q qVar, C c6) throws AbstractC0210o, d;

    p process(String str, C c6) throws AbstractC0210o, ParseException, d;
}
