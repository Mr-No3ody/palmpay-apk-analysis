package com.nimbusds.jwt.proc;

import E.AbstractC0210o;
import P5.d;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jwt.JWT;
import java.text.ParseException;
import p022b6.a;
import p022b6.b;
import p022b6.c;

/* JADX INFO: loaded from: classes3.dex */
public interface JWTProcessor<C extends SecurityContext> {
    b process(a aVar, C c6) throws AbstractC0210o, d;

    b process(c cVar, C c6) throws AbstractC0210o, d;

    b process(p022b6.d dVar, C c6) throws AbstractC0210o, d;

    b process(JWT jwt, C c6) throws AbstractC0210o, d;

    b process(String str, C c6) throws AbstractC0210o, ParseException, d;
}
