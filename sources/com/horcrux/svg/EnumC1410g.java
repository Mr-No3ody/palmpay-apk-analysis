package com.horcrux.svg;

import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1410g {
    OBJECT_BOUNDING_BOX("objectBoundingBox"),
    USER_SPACE_ON_USE("userSpaceOnUse");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f23466d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23468a;

    static {
        for (EnumC1410g enumC1410g : values()) {
            f23466d.put(enumC1410g.f23468a, enumC1410g);
        }
    }

    EnumC1410g(String str) {
        this.f23468a = str;
    }

    public static EnumC1410g a(String str) {
        HashMap map = f23466d;
        if (map.containsKey(str)) {
            return (EnumC1410g) map.get(str);
        }
        throw new IllegalArgumentException(C0.G.o("Unknown 'Unit' Value: ", str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f23468a;
    }
}
