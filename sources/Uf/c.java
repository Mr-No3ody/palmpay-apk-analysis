package Uf;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import p355xf.C;
import p355xf.D;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f9766c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f9767d = new c(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9769b;

    public c(long j6, long j10) {
        this.f9768a = j6;
        this.f9769b = j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c other = (c) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        long j6 = other.f9768a;
        long j10 = this.f9768a;
        if (j10 != j6) {
            C c6 = D.f43948b;
            return Long.compare(j10 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        }
        C c10 = D.f43948b;
        return Long.compare(this.f9769b ^ Long.MIN_VALUE, other.f9769b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9768a == cVar.f9768a && this.f9769b == cVar.f9769b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9768a ^ this.f9769b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        J3.a.j(this.f9768a, bArr, 0, 0, 4);
        bArr[8] = 45;
        J3.a.j(this.f9768a, bArr, 9, 4, 6);
        bArr[13] = 45;
        J3.a.j(this.f9768a, bArr, 14, 6, 8);
        bArr[18] = 45;
        J3.a.j(this.f9769b, bArr, 19, 0, 2);
        bArr[23] = 45;
        J3.a.j(this.f9769b, bArr, 24, 2, 8);
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }
}
