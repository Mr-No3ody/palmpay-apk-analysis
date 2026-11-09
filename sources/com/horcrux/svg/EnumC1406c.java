package com.horcrux.svg;

import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1406c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    DUPLICATE("duplicate"),
    /* JADX INFO: Fake field, exist only in values array */
    WRAP("wrap"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(ViewProps.NONE);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f23442b = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23444a;

    static {
        for (EnumC1406c enumC1406c : values()) {
            f23442b.put(enumC1406c.f23444a, enumC1406c);
        }
    }

    EnumC1406c(String str) {
        this.f23444a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f23444a;
    }
}
