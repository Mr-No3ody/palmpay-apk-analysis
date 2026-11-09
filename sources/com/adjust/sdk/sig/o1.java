package com.adjust.sdk.sig;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f19491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19492b;

    public o1() {
        char[] cArr;
        i iVar = i.f19461c;
        synchronized (iVar) {
            e eVar = iVar.f19462a;
            cArr = null;
            char[] cArr2 = (char[]) (eVar.isEmpty() ? null : eVar.removeLast());
            if (cArr2 != null) {
                iVar.f19463b -= cArr2.length;
                cArr = cArr2;
            }
        }
        this.f19491a = cArr == null ? new char[128] : cArr;
    }

    public final void a() {
        i iVar = i.f19461c;
        char[] cArr = this.f19491a;
        synchronized (iVar) {
            int i7 = iVar.f19463b;
            if (cArr.length + i7 < g.f19457a) {
                iVar.f19463b = i7 + cArr.length;
                iVar.f19462a.addLast(cArr);
            }
        }
    }

    public final String toString() {
        return new String(this.f19491a, 0, this.f19492b);
    }

    public final int a(int i7, int i10) {
        int i11 = i10 + i7;
        char[] cArr = this.f19491a;
        if (cArr.length <= i11) {
            int i12 = i7 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            this.f19491a = Arrays.copyOf(cArr, i11);
        }
        return i7;
    }
}
