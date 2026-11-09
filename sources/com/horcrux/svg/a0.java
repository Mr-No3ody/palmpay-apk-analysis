package com.horcrux.svg;

import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public enum a0 {
    baseline("baseline"),
    /* JADX INFO: Fake field, exist only in values array */
    textBottom("text-bottom"),
    /* JADX INFO: Fake field, exist only in values array */
    alphabetic("alphabetic"),
    /* JADX INFO: Fake field, exist only in values array */
    ideographic("ideographic"),
    /* JADX INFO: Fake field, exist only in values array */
    middle("middle"),
    /* JADX INFO: Fake field, exist only in values array */
    central("central"),
    /* JADX INFO: Fake field, exist only in values array */
    mathematical("mathematical"),
    /* JADX INFO: Fake field, exist only in values array */
    textTop("text-top"),
    /* JADX INFO: Fake field, exist only in values array */
    bottom(ViewProps.BOTTOM),
    /* JADX INFO: Fake field, exist only in values array */
    center("center"),
    /* JADX INFO: Fake field, exist only in values array */
    top(ViewProps.TOP),
    /* JADX INFO: Fake field, exist only in values array */
    textBeforeEdge("text-before-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    textAfterEdge("text-after-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    beforeEdge("before-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    afterEdge("after-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    hanging("hanging");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f23426c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23428a;

    static {
        for (a0 a0Var : values()) {
            f23426c.put(a0Var.f23428a, a0Var);
        }
    }

    a0(String str) {
        this.f23428a = str;
    }

    public static a0 a(String str) {
        HashMap map = f23426c;
        if (map.containsKey(str)) {
            return (a0) map.get(str);
        }
        throw new IllegalArgumentException(C0.G.o("Unknown String Value: ", str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f23428a;
    }
}
