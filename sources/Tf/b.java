package Tf;

import E.AbstractC0198c;
import N8.q0;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ExperimentalTime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
    private final long m14getDaysUwyO8pc(int i7) {
        return AbstractC0198c.h0(i7, e.DAYS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m16getDaysUwyO8pc$annotations(double d2) {
    }

    /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
    private final long m20getHoursUwyO8pc(int i7) {
        return AbstractC0198c.h0(i7, e.HOURS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m22getHoursUwyO8pc$annotations(double d2) {
    }

    /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
    private final long m26getMicrosecondsUwyO8pc(int i7) {
        return AbstractC0198c.h0(i7, e.MICROSECONDS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m28getMicrosecondsUwyO8pc$annotations(double d2) {
    }

    /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
    private final long m32getMillisecondsUwyO8pc(int i7) {
        return AbstractC0198c.h0(i7, e.MILLISECONDS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m34getMillisecondsUwyO8pc$annotations(double d2) {
    }

    /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
    private final long m38getMinutesUwyO8pc(int i7) {
        return AbstractC0198c.h0(i7, e.MINUTES);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m40getMinutesUwyO8pc$annotations(double d2) {
    }

    /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
    private final long m44getNanosecondsUwyO8pc(int i7) {
        return AbstractC0198c.h0(i7, e.NANOSECONDS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m46getNanosecondsUwyO8pc$annotations(double d2) {
    }

    /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
    private final long m50getSecondsUwyO8pc(int i7) {
        return AbstractC0198c.h0(i7, e.SECONDS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m52getSecondsUwyO8pc$annotations(double d2) {
    }

    @ExperimentalTime
    public final double convert(double d2, @NotNull e sourceUnit, @NotNull e targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return f.a(d2, sourceUnit, targetUnit);
    }

    /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
    public final long m55getINFINITEUwyO8pc() {
        return c.f9079c;
    }

    /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public final long m56getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
        return c.f9080d;
    }

    /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
    public final long m57getZEROUwyO8pc() {
        b bVar = c.f9078b;
        return 0L;
    }

    /* JADX INFO: renamed from: parse-UwyO8pc, reason: not valid java name */
    public final long m58parseUwyO8pc(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return AbstractC0198c.a(value, false);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(q0.k("Invalid duration string format: '", value, "'."), e10);
        }
    }

    /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
    public final long m59parseIsoStringUwyO8pc(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return AbstractC0198c.a(value, true);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(q0.k("Invalid ISO duration string format: '", value, "'."), e10);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
    public final c m60parseIsoStringOrNullFghU774(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return new c(AbstractC0198c.a(value, true));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: parseOrNull-FghU774, reason: not valid java name */
    public final c m61parseOrNullFghU774(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return new c(AbstractC0198c.a(value, false));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private b() {
    }

    /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
    private final long m15getDaysUwyO8pc(long j6) {
        return AbstractC0198c.i0(j6, e.DAYS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m17getDaysUwyO8pc$annotations(int i7) {
    }

    /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
    private final long m21getHoursUwyO8pc(long j6) {
        return AbstractC0198c.i0(j6, e.HOURS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m23getHoursUwyO8pc$annotations(int i7) {
    }

    /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
    private final long m27getMicrosecondsUwyO8pc(long j6) {
        return AbstractC0198c.i0(j6, e.MICROSECONDS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m29getMicrosecondsUwyO8pc$annotations(int i7) {
    }

    /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
    private final long m33getMillisecondsUwyO8pc(long j6) {
        return AbstractC0198c.i0(j6, e.MILLISECONDS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m35getMillisecondsUwyO8pc$annotations(int i7) {
    }

    /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
    private final long m39getMinutesUwyO8pc(long j6) {
        return AbstractC0198c.i0(j6, e.MINUTES);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m41getMinutesUwyO8pc$annotations(int i7) {
    }

    /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
    private final long m45getNanosecondsUwyO8pc(long j6) {
        return AbstractC0198c.i0(j6, e.NANOSECONDS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m47getNanosecondsUwyO8pc$annotations(int i7) {
    }

    /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
    private final long m51getSecondsUwyO8pc(long j6) {
        return AbstractC0198c.i0(j6, e.SECONDS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m53getSecondsUwyO8pc$annotations(int i7) {
    }

    /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
    private final long m13getDaysUwyO8pc(double d2) {
        return AbstractC0198c.g0(d2, e.DAYS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m18getDaysUwyO8pc$annotations(long j6) {
    }

    /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
    private final long m19getHoursUwyO8pc(double d2) {
        return AbstractC0198c.g0(d2, e.HOURS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m24getHoursUwyO8pc$annotations(long j6) {
    }

    /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
    private final long m25getMicrosecondsUwyO8pc(double d2) {
        return AbstractC0198c.g0(d2, e.MICROSECONDS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m30getMicrosecondsUwyO8pc$annotations(long j6) {
    }

    /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
    private final long m31getMillisecondsUwyO8pc(double d2) {
        return AbstractC0198c.g0(d2, e.MILLISECONDS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m36getMillisecondsUwyO8pc$annotations(long j6) {
    }

    /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
    private final long m37getMinutesUwyO8pc(double d2) {
        return AbstractC0198c.g0(d2, e.MINUTES);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m42getMinutesUwyO8pc$annotations(long j6) {
    }

    /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
    private final long m43getNanosecondsUwyO8pc(double d2) {
        return AbstractC0198c.g0(d2, e.NANOSECONDS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m48getNanosecondsUwyO8pc$annotations(long j6) {
    }

    /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
    private final long m49getSecondsUwyO8pc(double d2) {
        return AbstractC0198c.g0(d2, e.SECONDS);
    }

    @InlineOnly
    /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m54getSecondsUwyO8pc$annotations(long j6) {
    }
}
