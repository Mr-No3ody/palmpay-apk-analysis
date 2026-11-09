package com.nimbusds.jose.shaded.gson.internal;

import com.nimbusds.jose.shaded.gson.z;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f23632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.nimbusds.jose.shaded.gson.m f23635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.nimbusds.jose.shaded.gson.reflect.a f23636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f23637f;

    public e(f fVar, boolean z3, boolean z8, com.nimbusds.jose.shaded.gson.m mVar, com.nimbusds.jose.shaded.gson.reflect.a aVar) {
        this.f23637f = fVar;
        this.f23633b = z3;
        this.f23634c = z8;
        this.f23635d = mVar;
        this.f23636e = aVar;
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final Object a(com.nimbusds.jose.shaded.gson.stream.b bVar) throws IOException {
        if (this.f23633b) {
            bVar.C();
            return null;
        }
        z zVarE = this.f23632a;
        if (zVarE == null) {
            zVarE = this.f23635d.e(this.f23637f, this.f23636e);
            this.f23632a = zVarE;
        }
        return zVarE.a(bVar);
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final void b(com.nimbusds.jose.shaded.gson.stream.c cVar, Object obj) throws IOException {
        if (this.f23634c) {
            cVar.i();
            return;
        }
        z zVarE = this.f23632a;
        if (zVarE == null) {
            zVarE = this.f23635d.e(this.f23637f, this.f23636e);
            this.f23632a = zVarE;
        }
        zVarE.b(cVar, obj);
    }
}
