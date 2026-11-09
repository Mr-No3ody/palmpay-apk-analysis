package com.transsnet.palmpay.custom_view;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.custom_view.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1550h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f31346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f31347b;

    public C1550h(Integer num, CharSequence charSequence) {
        this.f31346a = num;
        this.f31347b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1550h)) {
            return false;
        }
        C1550h c1550h = (C1550h) obj;
        return Intrinsics.c(this.f31346a, c1550h.f31346a) && Intrinsics.c(this.f31347b, c1550h.f31347b);
    }

    public final int hashCode() {
        Integer num = this.f31346a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        CharSequence charSequence = this.f31347b;
        return iHashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "FaceRecognitionGuideItem(iconRes=" + this.f31346a + ", text=" + ((Object) this.f31347b) + ")";
    }
}
