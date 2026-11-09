package com.nimbusds.jose.shaded.gson;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends V5.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f23679a;

    @Override // com.nimbusds.jose.shaded.gson.z
    public final Object a(com.nimbusds.jose.shaded.gson.stream.b bVar) {
        z zVar = this.f23679a;
        if (zVar != null) {
            return zVar.a(bVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final void b(com.nimbusds.jose.shaded.gson.stream.c cVar, Object obj) {
        z zVar = this.f23679a;
        if (zVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        zVar.b(cVar, obj);
    }

    @Override // V5.s
    public final z c() {
        z zVar = this.f23679a;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
