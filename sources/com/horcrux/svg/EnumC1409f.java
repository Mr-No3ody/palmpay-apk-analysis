package com.horcrux.svg;

import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1409f {
    /* JADX INFO: Fake field, exist only in values array */
    OVER("over"),
    /* JADX INFO: Fake field, exist only in values array */
    IN("in"),
    /* JADX INFO: Fake field, exist only in values array */
    OUT("out"),
    /* JADX INFO: Fake field, exist only in values array */
    ATOP("atop"),
    /* JADX INFO: Fake field, exist only in values array */
    XOR("xor"),
    ARITHMETIC("arithmetic");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f23460c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23462a;

    static {
        for (EnumC1409f enumC1409f : values()) {
            f23460c.put(enumC1409f.f23462a, enumC1409f);
        }
    }

    EnumC1409f(String str) {
        this.f23462a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f23462a;
    }
}
