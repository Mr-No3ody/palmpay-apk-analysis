package com.facebook.imagepipeline.common;

import kotlin.jvm.internal.Intrinsics;
import p041ce.o;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21420c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f21421d = C2131j.b(new o(2));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21423b;

    public b(int i7, int i10) {
        this.f21422a = i7;
        this.f21423b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        b bVar = (b) obj;
        return this.f21422a == bVar.f21422a && this.f21423b == bVar.f21423b;
    }

    public final int hashCode() {
        return (this.f21422a * 31) + this.f21423b;
    }

    public final String toString() {
        int i7 = this.f21422a;
        a aVar = f21420c;
        return com.airbnb.lottie.model.layer.d.o(new Object[]{aVar.valueOrEmpty(i7), aVar.valueOrEmpty(this.f21423b)}, 2, null, "%s-%s", "format(...)");
    }
}
