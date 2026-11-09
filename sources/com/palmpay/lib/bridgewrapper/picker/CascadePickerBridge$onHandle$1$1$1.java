package com.palmpay.lib.bridgewrapper.picker;

import com.palmpay.lib.bridge.BaseBridge;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "firstIndex", "", "secondIndex", "thirdIndex", "invoke", "(ILjava/lang/Integer;Ljava/lang/Integer;)V"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class CascadePickerBridge$onHandle$1$1$1 extends o implements Function3<Integer, Integer, Integer, Unit> {
    final /* synthetic */ CascadePickerBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CascadePickerBridge$onHandle$1$1$1(CascadePickerBridge cascadePickerBridge) {
        super(3);
        this.this$0 = cascadePickerBridge;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
        invoke(num.intValue(), num2, num3);
        return Unit.f38893a;
    }

    public final void invoke(int i7, @Nullable Integer num, @Nullable Integer num2) {
        BaseBridge.handleSuccess$default(this.this$0, C1850q.h(Integer.valueOf(i7), num, num2), null, 2, null);
    }
}
