package Tf;

import E.AbstractC0198c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.AbstractDoubleTimeSource;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeMark;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ComparableTimeMark {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f9075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractDoubleTimeSource f9076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9077c;

    public a(double d2, AbstractDoubleTimeSource timeSource, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        this.f9075a = d2;
        this.f9076b = timeSource;
        this.f9077c = j6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(ComparableTimeMark comparableTimeMark) {
        return D3.a.b(this, comparableTimeMark);
    }

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
    public final long mo9elapsedNowUwyO8pc() {
        AbstractDoubleTimeSource abstractDoubleTimeSource = this.f9076b;
        double dA = abstractDoubleTimeSource.a() - this.f9075a;
        abstractDoubleTimeSource.getClass();
        AbstractC0198c.g0(dA, null);
        throw null;
    }

    @Override // kotlin.time.ComparableTimeMark
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Intrinsics.c(this.f9076b, ((a) obj).f9076b) && mo11minusUwyO8pc((ComparableTimeMark) obj) == c.f9078b.m57getZEROUwyO8pc();
        }
        return false;
    }

    @Override // kotlin.time.TimeMark
    public final boolean hasNotPassedNow() {
        mo9elapsedNowUwyO8pc();
        throw null;
    }

    @Override // kotlin.time.TimeMark
    public final boolean hasPassedNow() {
        mo9elapsedNowUwyO8pc();
        throw null;
    }

    @Override // kotlin.time.ComparableTimeMark
    public final int hashCode() {
        this.f9076b.getClass();
        AbstractC0198c.g0(this.f9075a, null);
        throw null;
    }

    @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public final ComparableTimeMark mo10minusLRDsOJo(long j6) {
        return mo12plusLRDsOJo(c.i(j6));
    }

    @Override // kotlin.time.ComparableTimeMark
    /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
    public final long mo11minusUwyO8pc(ComparableTimeMark other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof a) {
            a aVar = (a) other;
            AbstractDoubleTimeSource abstractDoubleTimeSource = aVar.f9076b;
            AbstractDoubleTimeSource abstractDoubleTimeSource2 = this.f9076b;
            if (Intrinsics.c(abstractDoubleTimeSource2, abstractDoubleTimeSource)) {
                b bVar = c.f9078b;
                long j6 = this.f9077c;
                long j10 = aVar.f9077c;
                if (j6 == j10 && c.e(j6)) {
                    return c.f9078b.m57getZEROUwyO8pc();
                }
                c.g(j6, c.i(j10));
                double d2 = this.f9075a - aVar.f9075a;
                abstractDoubleTimeSource2.getClass();
                AbstractC0198c.g0(d2, null);
                throw null;
            }
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
    }

    public final String toString() {
        this.f9076b.getClass();
        Intrinsics.checkNotNullParameter(null, "<this>");
        throw null;
    }

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: minus-LRDsOJo */
    public final TimeMark mo10minusLRDsOJo(long j6) {
        return mo12plusLRDsOJo(c.i(j6));
    }

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public final ComparableTimeMark mo12plusLRDsOJo(long j6) {
        return new a(this.f9075a, this.f9076b, c.g(this.f9077c, j6), null);
    }

    @Override // kotlin.time.ComparableTimeMark
    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final int compareTo2(ComparableTimeMark comparableTimeMark) {
        return D3.a.b(this, comparableTimeMark);
    }
}
