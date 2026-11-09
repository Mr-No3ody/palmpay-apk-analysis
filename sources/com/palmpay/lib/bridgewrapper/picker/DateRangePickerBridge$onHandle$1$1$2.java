package com.palmpay.lib.bridgewrapper.picker;

import com.palmpay.lib.bridge.BaseBridge;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "startTimestamp", "", "endTimestamp", "invoke", "(JLjava/lang/Long;)V"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class DateRangePickerBridge$onHandle$1$1$2 extends o implements Function2<Long, Long, Unit> {
    final /* synthetic */ DateRangePickerBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerBridge$onHandle$1$1$2(DateRangePickerBridge dateRangePickerBridge) {
        super(2);
        this.this$0 = dateRangePickerBridge;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Long l5, Long l6) {
        invoke(l5.longValue(), l6);
        return Unit.f38893a;
    }

    public final void invoke(long j6, @Nullable Long l5) {
        BaseBridge.handleSuccess$default(this.this$0, new DateRangePickerBridge.DateRangeBean(String.valueOf(j6), String.valueOf(l5)), null, 2, null);
    }
}
