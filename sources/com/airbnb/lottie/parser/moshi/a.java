package com.airbnb.lottie.parser.moshi;

import C0.G;
import Kf.d;
import P0.c;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f20163e = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f20165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f20166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f20167d;

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            f20163e[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = f20163e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract double g();

    public final String getPath() {
        int i7 = this.f20164a;
        int[] iArr = this.f20165b;
        String[] strArr = this.f20166c;
        int[] iArr2 = this.f20167d;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = iArr[i10];
            if (i11 == 1 || i11 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i10]);
                sb2.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb2.append('.');
                String str = strArr[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public abstract int h();

    public abstract String i();

    public abstract int j();

    public final void k(int i7) {
        int i10 = this.f20164a;
        int[] iArr = this.f20165b;
        if (i10 == iArr.length) {
            if (i10 == 256) {
                throw new c("Nesting too deep at " + getPath(), 6, false);
            }
            this.f20165b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f20166c;
            this.f20166c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f20167d;
            this.f20167d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f20165b;
        int i11 = this.f20164a;
        this.f20164a = i11 + 1;
        iArr3[i11] = i7;
    }

    public abstract int l(p039cb.c cVar);

    public abstract void m();

    public abstract void n();

    public final void o(String str) throws d {
        StringBuilder sbT = G.t(str, " at path ");
        sbT.append(getPath());
        throw new d(sbT.toString());
    }
}
