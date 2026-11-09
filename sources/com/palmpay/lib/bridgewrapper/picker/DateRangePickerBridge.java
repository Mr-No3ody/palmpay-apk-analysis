package com.palmpay.lib.bridgewrapper.picker;

import N8.q0;
import Z6.g;
import android.app.Activity;
import androidx.annotation.Keep;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.camera.video.u;
import com.didi.drouter.annotation.Service;
import com.facebook.react.uimanager.ViewProps;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/picker/dateRange"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\u000b"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/picker/DateRangePickerBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/palmpay/lib/bridgewrapper/picker/DateRangePickerBridge$DateRangePickerData;", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "DateRangeBean", "DateRangePickerData", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DateRangePickerBridge extends SyncBridge<DateRangePickerData> {

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/picker/DateRangePickerBridge$DateRangeBean;", "", ViewProps.START, "", ViewProps.END, "(Ljava/lang/String;Ljava/lang/String;)V", "getEnd", "()Ljava/lang/String;", "getStart", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class DateRangeBean {

        @NotNull
        private final String end;

        @NotNull
        private final String start;

        public DateRangeBean(@NotNull String start, @NotNull String end) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(end, "end");
            this.start = start;
            this.end = end;
        }

        public static /* synthetic */ DateRangeBean copy$default(DateRangeBean dateRangeBean, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = dateRangeBean.start;
            }
            if ((i7 & 2) != 0) {
                str2 = dateRangeBean.end;
            }
            return dateRangeBean.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStart() {
            return this.start;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getEnd() {
            return this.end;
        }

        @NotNull
        public final DateRangeBean copy(@NotNull String start, @NotNull String end) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(end, "end");
            return new DateRangeBean(start, end);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateRangeBean)) {
                return false;
            }
            DateRangeBean dateRangeBean = (DateRangeBean) other;
            return Intrinsics.c(this.start, dateRangeBean.start) && Intrinsics.c(this.end, dateRangeBean.end);
        }

        @NotNull
        public final String getEnd() {
            return this.end;
        }

        @NotNull
        public final String getStart() {
            return this.start;
        }

        public int hashCode() {
            return this.end.hashCode() + (this.start.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DateRangeBean(start=");
            sb2.append(this.start);
            sb2.append(", end=");
            return u.p(sb2, this.end, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/picker/DateRangePickerBridge$DateRangePickerData;", "", "title", "", ViewProps.START, "", ViewProps.END, "limitRange", "", "monthDayExchange", "", "(Ljava/lang/String;JJIZ)V", "getEnd", "()J", "getLimitRange", "()I", "getMonthDayExchange", "()Z", "getStart", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class DateRangePickerData {
        private final long end;
        private final int limitRange;
        private final boolean monthDayExchange;
        private final long start;

        @NotNull
        private final String title;

        public DateRangePickerData(@NotNull String title, long j6, long j10, int i7, boolean z3) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.start = j6;
            this.end = j10;
            this.limitRange = i7;
            this.monthDayExchange = z3;
        }

        public static /* synthetic */ DateRangePickerData copy$default(DateRangePickerData dateRangePickerData, String str, long j6, long j10, int i7, boolean z3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dateRangePickerData.title;
            }
            if ((i10 & 2) != 0) {
                j6 = dateRangePickerData.start;
            }
            if ((i10 & 4) != 0) {
                j10 = dateRangePickerData.end;
            }
            if ((i10 & 8) != 0) {
                i7 = dateRangePickerData.limitRange;
            }
            if ((i10 & 16) != 0) {
                z3 = dateRangePickerData.monthDayExchange;
            }
            long j11 = j10;
            return dateRangePickerData.copy(str, j6, j11, i7, z3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getLimitRange() {
            return this.limitRange;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getMonthDayExchange() {
            return this.monthDayExchange;
        }

        @NotNull
        public final DateRangePickerData copy(@NotNull String title, long start, long end, int limitRange, boolean monthDayExchange) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new DateRangePickerData(title, start, end, limitRange, monthDayExchange);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateRangePickerData)) {
                return false;
            }
            DateRangePickerData dateRangePickerData = (DateRangePickerData) other;
            return Intrinsics.c(this.title, dateRangePickerData.title) && this.start == dateRangePickerData.start && this.end == dateRangePickerData.end && this.limitRange == dateRangePickerData.limitRange && this.monthDayExchange == dateRangePickerData.monthDayExchange;
        }

        public final long getEnd() {
            return this.end;
        }

        public final int getLimitRange() {
            return this.limitRange;
        }

        public final boolean getMonthDayExchange() {
            return this.monthDayExchange;
        }

        public final long getStart() {
            return this.start;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public int hashCode() {
            int iB = u.b(this.limitRange, q0.b(q0.b(this.title.hashCode() * 31, 31, this.start), 31, this.end), 31);
            boolean z3 = this.monthDayExchange;
            ?? r3 = z3;
            if (z3) {
                r3 = 1;
            }
            return iB + r3;
        }

        @NotNull
        public String toString() {
            return "DateRangePickerData(title=" + this.title + ", start=" + this.start + ", end=" + this.end + ", limitRange=" + this.limitRange + ", monthDayExchange=" + this.monthDayExchange + ')';
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable DateRangePickerData params, @Nullable IBridgeCallback callback) {
        Unit unit;
        if (params != null) {
            if (getActivity() instanceof AbstractActivityC0837o) {
                int i7 = g.f11538m;
                Activity activity = getActivity();
                Intrinsics.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                AbstractActivityC0837o abstractActivityC0837o = (AbstractActivityC0837o) activity;
                g gVar = new g(abstractActivityC0837o, abstractActivityC0837o);
                gVar.f11541c = 2;
                gVar.f11542d = params.getTitle();
                gVar.f11547i = true;
                gVar.f11543e = Long.valueOf(params.getStart());
                gVar.f11544f = Long.valueOf(params.getEnd());
                gVar.f11545g = params.getLimitRange();
                gVar.f11549k = DateRangePickerBridge$onHandle$1$1$1.INSTANCE;
                gVar.f11548j = new DateRangePickerBridge$onHandle$1$1$2(this);
                gVar.f11546h = Boolean.valueOf(params.getMonthDayExchange());
                gVar.a().show();
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
