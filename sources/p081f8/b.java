package p081f8;

import G8.a;
import N8.q0;
import java.io.Serializable;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Serializable, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f36413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f36419g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f36420i;

    public b(int i7, int i10, int i11) {
        Calendar calendar = Calendar.getInstance();
        this.f36413a = calendar;
        this.f36417e = calendar.get(1);
        this.f36418f = calendar.get(2);
        this.f36419g = calendar.get(5);
        this.f36420i = a.f36411a;
        this.f36414b = i7;
        this.f36415c = i10;
        this.f36416d = i11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b other = (b) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        if (equals(other)) {
            return 0;
        }
        return a.j(this, other) ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            obj = null;
        }
        b bVar = (b) obj;
        return bVar != null && this.f36414b == bVar.f36414b && this.f36415c == bVar.f36415c && this.f36416d == bVar.f36416d && this.f36420i == bVar.f36420i;
    }

    public final int hashCode() {
        return this.f36420i.hashCode() + (((((this.f36414b * 31) + this.f36415c) * 31) + this.f36416d) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarDay{year=");
        sb2.append(this.f36414b);
        sb2.append(", month=");
        sb2.append(this.f36415c);
        sb2.append(", day=");
        return q0.m(sb2, this.f36416d, '}');
    }
}
