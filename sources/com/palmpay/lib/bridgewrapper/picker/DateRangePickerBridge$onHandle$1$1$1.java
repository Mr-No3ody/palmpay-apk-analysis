package com.palmpay.lib.bridgewrapper.picker;

import androidx.camera.core.impl.utils.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "startTimestamp", "", "endTimestamp", "limitRangeTime", "", "invoke", "(JLjava/lang/Long;I)V"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class DateRangePickerBridge$onHandle$1$1$1 extends o implements Function3<Long, Long, Integer, Unit> {
    public static final DateRangePickerBridge$onHandle$1$1$1 INSTANCE = new DateRangePickerBridge$onHandle$1$1$1();

    public DateRangePickerBridge$onHandle$1$1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Long l5, Long l6, Integer num) {
        invoke(l5.longValue(), l6, num.intValue());
        return Unit.f38893a;
    }

    public final void invoke(long j6, @Nullable Long l5, int i7) {
        if ((l5 != null ? l5.longValue() - j6 : 0L) > ((long) 86400000) * ((long) i7)) {
            n.u("The time range cannot exceed " + i7 + " days.");
        }
    }
}
