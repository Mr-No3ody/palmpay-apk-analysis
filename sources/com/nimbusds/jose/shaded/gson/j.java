package com.nimbusds.jose.shaded.gson;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23676a;

    public /* synthetic */ j(int i7) {
        this.f23676a = i7;
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final Object a(com.nimbusds.jose.shaded.gson.stream.b bVar) throws IOException {
        switch (this.f23676a) {
            case 0:
                if (bVar.w() != 9) {
                    return Double.valueOf(bVar.n());
                }
                bVar.s();
                return null;
            default:
                if (bVar.w() != 9) {
                    return Float.valueOf((float) bVar.n());
                }
                bVar.s();
                return null;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final void b(com.nimbusds.jose.shaded.gson.stream.c cVar, Object obj) throws IOException {
        switch (this.f23676a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    m.a(dDoubleValue);
                    cVar.l(dDoubleValue);
                } else {
                    cVar.i();
                }
                break;
            default:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    m.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    cVar.o(numberValueOf);
                } else {
                    cVar.i();
                }
                break;
        }
    }
}
