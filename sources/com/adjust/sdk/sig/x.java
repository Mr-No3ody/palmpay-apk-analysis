package com.adjust.sdk.sig;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f19522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19523b = true;

    public x(o1 o1Var) {
        this.f19522a = o1Var;
    }

    public void a() {
        this.f19523b = false;
    }

    public void b() {
    }

    public void c() {
    }

    public final void a(char c6) {
        o1 o1Var = this.f19522a;
        o1Var.a(o1Var.f19492b, 1);
        char[] cArr = o1Var.f19491a;
        int i7 = o1Var.f19492b;
        o1Var.f19492b = i7 + 1;
        cArr[i7] = c6;
    }
}
