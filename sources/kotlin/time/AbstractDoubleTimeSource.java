package kotlin.time;

import Tf.a;
import Tf.c;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.SinceKotlin;

/* JADX INFO: loaded from: classes4.dex */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "Tf/a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@ExperimentalTime
public abstract class AbstractDoubleTimeSource implements TimeSource.WithComparableMarks {
    public abstract double a();

    @Override // kotlin.time.TimeSource
    public final ComparableTimeMark markNow() {
        return new a(a(), this, c.f9078b.m57getZEROUwyO8pc(), null);
    }
}
