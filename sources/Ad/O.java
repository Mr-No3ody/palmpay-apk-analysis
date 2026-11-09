package Ad;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f183b;

    public O(String str, Integer num) {
        this.f182a = str;
        this.f183b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return Intrinsics.c(this.f182a, o10.f182a) && Intrinsics.c(this.f183b, o10.f183b);
    }

    public final int hashCode() {
        String str = this.f182a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f183b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "MonthDayBean(monthDayStr=" + this.f182a + ", monthDayInt=" + this.f183b + ")";
    }

    public /* synthetic */ O() {
        this("1st", 1);
    }
}
