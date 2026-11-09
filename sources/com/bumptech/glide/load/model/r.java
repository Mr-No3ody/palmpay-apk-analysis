package com.bumptech.glide.load.model;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayDeque f20862d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20865c;

    static {
        char[] cArr = J1.o.f4478a;
        f20862d = new ArrayDeque(0);
    }

    public static r a(int i7, int i10, Object obj) {
        r rVar;
        ArrayDeque arrayDeque = f20862d;
        synchronized (arrayDeque) {
            rVar = (r) arrayDeque.poll();
        }
        if (rVar == null) {
            rVar = new r();
        }
        rVar.f20865c = obj;
        rVar.f20864b = i7;
        rVar.f20863a = i10;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f20864b == rVar.f20864b && this.f20863a == rVar.f20863a && this.f20865c.equals(rVar.f20865c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20865c.hashCode() + (((this.f20863a * 31) + this.f20864b) * 31);
    }
}
