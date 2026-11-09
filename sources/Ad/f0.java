package Ad;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f219b;

    public f0(String str, Integer num) {
        this.f218a = str;
        this.f219b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.c(this.f218a, f0Var.f218a) && Intrinsics.c(this.f219b, f0Var.f219b);
    }

    public final int hashCode() {
        String str = this.f218a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f219b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "WeekDayBean(weekDayStr=" + this.f218a + ", weekDayInt=" + this.f219b + ")";
    }

    public /* synthetic */ f0() {
        this("Monday", 2);
    }
}
