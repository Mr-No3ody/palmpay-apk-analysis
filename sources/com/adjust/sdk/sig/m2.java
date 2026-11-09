package com.adjust.sdk.sig;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m2 implements l2, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2 f19483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f19485c;

    public m2(l2 l2Var) {
        Set setC;
        this.f19483a = l2Var;
        this.f19484b = l2Var.b() + '?';
        if (l2Var instanceof h) {
            setC = ((h) l2Var).c();
        } else {
            HashSet hashSet = new HashSet(l2Var.e());
            int iE = l2Var.e();
            for (int i7 = 0; i7 < iE; i7++) {
                hashSet.add(l2Var.a(i7));
            }
            setC = hashSet;
        }
        this.f19485c = setC;
    }

    @Override // com.adjust.sdk.sig.l2
    public final String a(int i7) {
        return this.f19483a.a(i7);
    }

    @Override // com.adjust.sdk.sig.l2
    public final l2 b(int i7) {
        return this.f19483a.b(i7);
    }

    @Override // com.adjust.sdk.sig.h
    public final Set c() {
        return this.f19485c;
    }

    @Override // com.adjust.sdk.sig.l2
    public final p2 d() {
        return this.f19483a.d();
    }

    @Override // com.adjust.sdk.sig.l2
    public final int e() {
        return this.f19483a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2) && g1.a(this.f19483a, ((m2) obj).f19483a);
    }

    @Override // com.adjust.sdk.sig.l2
    public final List getAnnotations() {
        return this.f19483a.getAnnotations();
    }

    public final int hashCode() {
        return this.f19483a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19483a);
        sb2.append('?');
        return sb2.toString();
    }

    @Override // com.adjust.sdk.sig.l2
    public final boolean a() {
        return this.f19483a.a();
    }

    @Override // com.adjust.sdk.sig.l2
    public final String b() {
        return this.f19484b;
    }
}
