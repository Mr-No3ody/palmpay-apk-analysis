package com.nimbusds.jose.shaded.gson;

import N8.q0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final enum w extends y {
    public w() {
        super("LONG_OR_DOUBLE", 2);
    }

    @Override // com.nimbusds.jose.shaded.gson.ToNumberStrategy
    public final Number readNumber(com.nimbusds.jose.shaded.gson.stream.b bVar) throws IOException {
        String strU = bVar.u();
        try {
            try {
                return Long.valueOf(Long.parseLong(strU));
            } catch (NumberFormatException unused) {
                Double dValueOf = Double.valueOf(strU);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!bVar.f23696b) {
                        throw new com.nimbusds.jose.shaded.gson.stream.d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + bVar.i());
                    }
                }
                return dValueOf;
            }
        } catch (NumberFormatException e10) {
            StringBuilder sbQ = q0.q("Cannot parse ", strU, "; at path ");
            sbQ.append(bVar.i());
            throw new P0.c(10, sbQ.toString(), e10);
        }
    }
}
