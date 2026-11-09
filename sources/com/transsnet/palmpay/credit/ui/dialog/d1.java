package com.transsnet.palmpay.credit.ui.dialog;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30090b;

    public d1(String lightUrl, String darkUrl) {
        Intrinsics.checkNotNullParameter(lightUrl, "lightUrl");
        Intrinsics.checkNotNullParameter(darkUrl, "darkUrl");
        this.f30089a = lightUrl;
        this.f30090b = darkUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Intrinsics.c(this.f30089a, d1Var.f30089a) && Intrinsics.c(this.f30090b, d1Var.f30090b);
    }

    public final int hashCode() {
        return this.f30090b.hashCode() + (this.f30089a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlideImageUrls(lightUrl=");
        sb2.append(this.f30089a);
        sb2.append(", darkUrl=");
        return C0.G.r(sb2, this.f30090b, ")");
    }
}
