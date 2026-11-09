package com.nimbusds.jose.shaded.gson;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            com.nimbusds.jose.shaded.gson.stream.c cVar = new com.nimbusds.jose.shaded.gson.stream.c(stringWriter);
            cVar.f23714e = true;
            V5.u uVar = V5.w.f10063a;
            V5.l.d(cVar, this);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
