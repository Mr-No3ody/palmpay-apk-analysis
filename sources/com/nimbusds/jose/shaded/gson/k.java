package com.nimbusds.jose.shaded.gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f23678b;

    public /* synthetic */ k(z zVar, int i7) {
        this.f23677a = i7;
        this.f23678b = zVar;
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final Object a(com.nimbusds.jose.shaded.gson.stream.b bVar) throws IOException {
        switch (this.f23677a) {
            case 0:
                return new AtomicLong(((Number) this.f23678b.a(bVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                bVar.a();
                while (bVar.j()) {
                    arrayList.add(Long.valueOf(((Number) this.f23678b.a(bVar)).longValue()));
                }
                bVar.e();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i7 = 0; i7 < size; i7++) {
                    atomicLongArray.set(i7, ((Long) arrayList.get(i7)).longValue());
                }
                return atomicLongArray;
            default:
                if (bVar.w() != 9) {
                    return this.f23678b.a(bVar);
                }
                bVar.s();
                return null;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final void b(com.nimbusds.jose.shaded.gson.stream.c cVar, Object obj) throws IOException {
        switch (this.f23677a) {
            case 0:
                this.f23678b.b(cVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.b();
                int length = atomicLongArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    this.f23678b.b(cVar, Long.valueOf(atomicLongArray.get(i7)));
                }
                cVar.e();
                break;
            default:
                if (obj == null) {
                    cVar.i();
                } else {
                    this.f23678b.b(cVar, obj);
                }
                break;
        }
    }
}
