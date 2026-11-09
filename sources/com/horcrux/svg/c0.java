package com.horcrux.svg;

import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public enum c0 {
    None(ViewProps.NONE),
    /* JADX INFO: Fake field, exist only in values array */
    Underline("underline"),
    /* JADX INFO: Fake field, exist only in values array */
    Overline("overline"),
    /* JADX INFO: Fake field, exist only in values array */
    LineThrough("line-through"),
    /* JADX INFO: Fake field, exist only in values array */
    Blink("blink");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f23446c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23448a;

    static {
        for (c0 c0Var : values()) {
            f23446c.put(c0Var.f23448a, c0Var);
        }
    }

    c0(String str) {
        this.f23448a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f23448a;
    }
}
