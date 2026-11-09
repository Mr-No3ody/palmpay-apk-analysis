package com.horcrux.svg;

import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1407d {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    NORMAL("normal"),
    MULTIPLY("multiply"),
    /* JADX INFO: Fake field, exist only in values array */
    SCREEN("screen"),
    /* JADX INFO: Fake field, exist only in values array */
    DARKEN("darken"),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHTEN("lighten");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f23450c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23452a;

    static {
        for (EnumC1407d enumC1407d : values()) {
            f23450c.put(enumC1407d.f23452a, enumC1407d);
        }
    }

    EnumC1407d(String str) {
        this.f23452a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f23452a;
    }
}
