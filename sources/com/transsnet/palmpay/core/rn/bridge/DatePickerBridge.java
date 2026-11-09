package com.transsnet.palmpay.core.rn.bridge;

import Ba.a;
import F6.d;
import X6.m;
import android.app.Activity;
import androidx.appcompat.app.AbstractActivityC0837o;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.bean.DatePickerInfo;
import com.transsnet.palmpay.core.bean.PickerData;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/datePicker/open"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/rn/bridge/DatePickerBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/core/bean/DatePickerInfo;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDatePickerBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerBridge.kt\ncom/transsnet/palmpay/core/rn/bridge/DatePickerBridge\n+ 2 XDatePickerDialog.kt\ncom/palmpay/lib/ui/picker/picker/XDatePickerDialog$Builder$Companion\n*L\n1#1,66:1\n134#2:67\n*S KotlinDebug\n*F\n+ 1 DatePickerBridge.kt\ncom/transsnet/palmpay/core/rn/bridge/DatePickerBridge\n*L\n28#1:67\n*E\n"})
public final class DatePickerBridge extends SyncBridge<DatePickerInfo> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onHandle$lambda$3$lambda$2$lambda$1(DatePickerBridge datePickerBridge, long j6, Long l5) {
        PickerData pickerData = new PickerData();
        pickerData.startTimestamp = j6;
        BaseBridge.handleSuccess$default(datePickerBridge, pickerData, null, 2, null);
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable DatePickerInfo params, @Nullable IBridgeCallback callback) {
        String str;
        int i7;
        Long lValueOf;
        Long lValueOf2;
        d.h("DatePickerBridge", 3, String.valueOf(params));
        try {
            Activity activity = getActivity();
            Long lValueOf3 = null;
            AbstractActivityC0837o abstractActivityC0837o = activity instanceof AbstractActivityC0837o ? (AbstractActivityC0837o) activity : null;
            if (abstractActivityC0837o != null) {
                m mVar = new m(abstractActivityC0837o);
                if (params == null || (str = params.title) == null) {
                    str = "Select Date";
                }
                mVar.f11027b = str;
                if (!Intrinsics.c(params != null ? params.type : null, "day")) {
                    i7 = Intrinsics.c(params != null ? params.type : null, "year") ? 1 : 3;
                }
                mVar.f11028c = i7;
                if (params == null || params.startTimestamp != 0) {
                    lValueOf = params != null ? Long.valueOf(params.startTimestamp) : null;
                } else {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(1790, 0, 1);
                    lValueOf = Long.valueOf(calendar.getTimeInMillis());
                }
                mVar.f11029d = lValueOf;
                if (params == null || params.endTimestamp != 0) {
                    lValueOf2 = params != null ? Long.valueOf(params.endTimestamp) : null;
                } else {
                    lValueOf2 = Long.valueOf(Calendar.getInstance().getTimeInMillis());
                }
                mVar.f11031f = lValueOf2;
                if (params != null && params.defaultDate == 0) {
                    lValueOf3 = Long.valueOf(Calendar.getInstance().getTimeInMillis());
                } else if (params != null) {
                    lValueOf3 = Long.valueOf(params.defaultDate);
                }
                mVar.f11030e = lValueOf3;
                mVar.f11032g = new a(this, 0);
                mVar.a().show();
            }
        } catch (Exception e10) {
            handleFail(e10);
        }
    }
}
