package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;

/* JADX INFO: loaded from: classes4.dex */
@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {
    public abstract long a();

    @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
    public final ComparableTimeMark markNow() {
        a();
        throw null;
    }

    @Override // kotlin.time.TimeSource
    public final TimeMark markNow() {
        a();
        throw null;
    }
}
