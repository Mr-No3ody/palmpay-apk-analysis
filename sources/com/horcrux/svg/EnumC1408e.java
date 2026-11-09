package com.horcrux.svg;

import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1408e {
    /* JADX INFO: Fake field, exist only in values array */
    MATRIX("matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    SATURATE("saturate"),
    /* JADX INFO: Fake field, exist only in values array */
    HUE_ROTATE("hueRotate"),
    /* JADX INFO: Fake field, exist only in values array */
    LUMINANCE_TO_ALPHA("luminanceToAlpha");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f23453b = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23455a;

    static {
        for (EnumC1408e enumC1408e : values()) {
            f23453b.put(enumC1408e.f23455a, enumC1408e);
        }
    }

    EnumC1408e(String str) {
        this.f23455a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f23455a;
    }
}
