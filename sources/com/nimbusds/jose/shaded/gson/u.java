package com.nimbusds.jose.shaded.gson;

/* JADX INFO: loaded from: classes3.dex */
public final enum u extends y {
    public u() {
        super("DOUBLE", 0);
    }

    @Override // com.nimbusds.jose.shaded.gson.ToNumberStrategy
    public final Number readNumber(com.nimbusds.jose.shaded.gson.stream.b bVar) {
        return Double.valueOf(bVar.n());
    }
}
