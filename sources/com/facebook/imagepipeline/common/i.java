package com.facebook.imagepipeline.common;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f21434c = new h(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f21435d = new i(-1, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f21436e = new i(-2, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f21437f = new i(-1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21439b;

    public i(int i7, boolean z3) {
        this.f21438a = i7;
        this.f21439b = z3;
    }

    public final boolean a() {
        return this.f21438a == -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f21438a == iVar.f21438a && this.f21439b == iVar.f21439b;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f21438a);
        Boolean boolValueOf = Boolean.valueOf(this.f21439b);
        return ((numValueOf.hashCode() + 31) * 31) + boolValueOf.hashCode();
    }

    public final String toString() {
        return com.airbnb.lottie.model.layer.d.o(new Object[]{Integer.valueOf(this.f21438a), Boolean.valueOf(this.f21439b)}, 2, null, "%d defer:%b", "format(...)");
    }
}
