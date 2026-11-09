package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatchGroup;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MatchGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntRange f38999b;

    public MatchGroup(String value, IntRange range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f38998a = value;
        this.f38999b = range;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.c(this.f38998a, matchGroup.f38998a) && Intrinsics.c(this.f38999b, matchGroup.f38999b);
    }

    public final int hashCode() {
        return this.f38999b.hashCode() + (this.f38998a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f38998a + ", range=" + this.f38999b + ')';
    }
}
