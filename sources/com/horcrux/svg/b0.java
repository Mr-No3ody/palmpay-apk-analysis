package com.horcrux.svg;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public enum b0 {
    Normal("normal"),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    /* JADX INFO: Fake field, exist only in values array */
    w400("400"),
    w500("500"),
    w600("600"),
    /* JADX INFO: Fake field, exist only in values array */
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final HashMap f23439v = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23441a;

    static {
        for (b0 b0Var : values()) {
            f23439v.put(b0Var.f23441a, b0Var);
        }
    }

    b0(String str) {
        this.f23441a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f23441a;
    }
}
