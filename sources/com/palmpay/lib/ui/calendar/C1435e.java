package com.palmpay.lib.ui.calendar;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Calendar;

/* JADX INFO: renamed from: com.palmpay.lib.ui.calendar.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1435e implements Serializable, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f24207g;

    public final boolean a() {
        return !TextUtils.isEmpty(this.f24207g);
    }

    public final boolean b() {
        int i7 = this.f24201a;
        boolean z3 = i7 > 0;
        int i10 = this.f24202b;
        boolean z8 = z3 & (i10 > 0);
        int i11 = this.f24203c;
        return z8 & (i11 > 0) & (i11 <= 31) & (i10 <= 12) & (i7 >= 1900) & (i7 <= 2099);
    }

    public final boolean c(C1435e c1435e) {
        return this.f24201a == c1435e.f24201a && this.f24202b == c1435e.f24202b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1435e c1435e = (C1435e) obj;
        if (c1435e == null) {
            return 1;
        }
        return toString().compareTo(c1435e.toString());
    }

    public final Calendar d() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, this.f24201a);
        calendar.set(2, this.f24202b - 1);
        calendar.set(5, this.f24203c);
        return calendar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1435e)) {
            C1435e c1435e = (C1435e) obj;
            if (c1435e.f24201a == this.f24201a && c1435e.f24202b == this.f24202b && c1435e.f24203c == this.f24203c) {
                return true;
            }
        }
        return super.equals(obj);
    }

    public final String toString() {
        Object objValueOf;
        Object objValueOf2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24201a);
        sb2.append("");
        int i7 = this.f24202b;
        if (i7 < 10) {
            objValueOf = "0" + this.f24202b;
        } else {
            objValueOf = Integer.valueOf(i7);
        }
        sb2.append(objValueOf);
        sb2.append("");
        int i10 = this.f24203c;
        if (i10 < 10) {
            objValueOf2 = "0" + this.f24203c;
        } else {
            objValueOf2 = Integer.valueOf(i10);
        }
        sb2.append(objValueOf2);
        return sb2.toString();
    }
}
