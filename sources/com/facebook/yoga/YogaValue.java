package com.facebook.yoga;

import H3.o;

/* JADX INFO: loaded from: classes.dex */
public final class YogaValue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final YogaValue f21921c = new YogaValue(Float.NaN, o.UNDEFINED);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final YogaValue f21922d = new YogaValue(Float.NaN, o.AUTO);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f21924b;

    public YogaValue(float f10, o oVar) {
        this.f21923a = f10;
        this.f21924b = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof YogaValue) {
            YogaValue yogaValue = (YogaValue) obj;
            o oVar = yogaValue.f21924b;
            o oVar2 = this.f21924b;
            if (oVar2 == oVar) {
                return oVar2 == o.UNDEFINED || oVar2 == o.AUTO || Float.compare(this.f21923a, yogaValue.f21923a) == 0;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f21923a) + this.f21924b.f3680a;
    }

    public final String toString() {
        int iOrdinal = this.f21924b.ordinal();
        if (iOrdinal == 0) {
            return "undefined";
        }
        float f10 = this.f21923a;
        if (iOrdinal == 1) {
            return Float.toString(f10);
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        return f10 + "%";
    }
}
