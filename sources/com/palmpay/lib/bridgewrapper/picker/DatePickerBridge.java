package com.palmpay.lib.bridgewrapper.picker;

import N8.q0;
import X6.m;
import android.app.Activity;
import androidx.annotation.Keep;
import androidx.appcompat.app.AbstractActivityC0837o;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/picker/date"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\n"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/picker/DatePickerBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/palmpay/lib/bridgewrapper/picker/DatePickerBridge$DatePickerData;", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "DatePickerData", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DatePickerBridge extends SyncBridge<DatePickerData> {

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/picker/DatePickerBridge$DatePickerData;", "", "title", "", "min", "", "max", "defaultValue", "(Ljava/lang/String;JJJ)V", "getDefaultValue", "()J", "getMax", "getMin", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class DatePickerData {
        private final long defaultValue;
        private final long max;
        private final long min;

        @Nullable
        private final String title;

        public DatePickerData(@Nullable String str, long j6, long j10, long j11) {
            this.title = str;
            this.min = j6;
            this.max = j10;
            this.defaultValue = j11;
        }

        public static /* synthetic */ DatePickerData copy$default(DatePickerData datePickerData, String str, long j6, long j10, long j11, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = datePickerData.title;
            }
            if ((i7 & 2) != 0) {
                j6 = datePickerData.min;
            }
            if ((i7 & 4) != 0) {
                j10 = datePickerData.max;
            }
            if ((i7 & 8) != 0) {
                j11 = datePickerData.defaultValue;
            }
            long j12 = j11;
            return datePickerData.copy(str, j6, j10, j12);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getDefaultValue() {
            return this.defaultValue;
        }

        @NotNull
        public final DatePickerData copy(@Nullable String title, long min, long max, long defaultValue) {
            return new DatePickerData(title, min, max, defaultValue);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DatePickerData)) {
                return false;
            }
            DatePickerData datePickerData = (DatePickerData) other;
            return Intrinsics.c(this.title, datePickerData.title) && this.min == datePickerData.min && this.max == datePickerData.max && this.defaultValue == datePickerData.defaultValue;
        }

        public final long getDefaultValue() {
            return this.defaultValue;
        }

        public final long getMax() {
            return this.max;
        }

        public final long getMin() {
            return this.min;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            return Long.hashCode(this.defaultValue) + q0.b(q0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.min), 31, this.max);
        }

        @NotNull
        public String toString() {
            return "DatePickerData(title=" + this.title + ", min=" + this.min + ", max=" + this.max + ", defaultValue=" + this.defaultValue + ')';
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable DatePickerData params, @Nullable IBridgeCallback callback) {
        Unit unit;
        Long lValueOf;
        if (params != null) {
            if (getActivity() instanceof AbstractActivityC0837o) {
                int i7 = m.f11025h;
                Activity activity = getActivity();
                Intrinsics.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                m mVar = new m((AbstractActivityC0837o) activity);
                mVar.f11027b = params.getTitle();
                mVar.f11028c = 1;
                if (params.getMin() != 0) {
                    mVar.f11029d = Long.valueOf(params.getMin());
                }
                if (params.getMax() != 0) {
                    lValueOf = Long.valueOf(params.getMax());
                } else {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(1, calendar.get(1) + 100);
                    lValueOf = Long.valueOf(calendar.getTimeInMillis());
                }
                mVar.f11031f = lValueOf;
                if (params.getDefaultValue() != 0) {
                    mVar.f11030e = Long.valueOf(params.getDefaultValue());
                }
                mVar.f11032g = new DatePickerBridge$onHandle$1$1$2(this);
                mVar.a().show();
            }
            unit = Unit.f38893a;
        } else {
            unit = null;
        }
        if (unit == null) {
            BaseBridge.handleIllegalArgument$default(this, null, 1, null);
        }
    }
}
