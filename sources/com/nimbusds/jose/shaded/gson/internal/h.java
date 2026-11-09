package com.nimbusds.jose.shaded.gson.internal;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23642a;

    public h(String str) {
        this.f23642a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f23642a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        Object obj2 = ((h) obj).f23642a;
        String str = this.f23642a;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f23642a);
    }

    public final int hashCode() {
        return this.f23642a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f23642a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f23642a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f23642a;
    }
}
