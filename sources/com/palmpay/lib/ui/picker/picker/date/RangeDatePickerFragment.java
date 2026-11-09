package com.palmpay.lib.ui.picker.picker.date;

import Bc.C0105b;
import Bc.k;
import L6.b;
import L6.h;
import N6.c;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.palmpay.lib.live.BaseViewModel;
import com.palmpay.lib.ui.picker.picker.TimePickerView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/palmpay/lib/ui/picker/picker/date/RangeDatePickerFragment;", "Lcom/palmpay/lib/ui/picker/picker/date/DatePickerFragment;", "<init>", "()V", "a", "lib_ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRangeDatePickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RangeDatePickerFragment.kt\ncom/palmpay/lib/ui/picker/picker/date/RangeDatePickerFragment\n+ 2 ViewExt.kt\ncom/palmpay/lib/ui/picker/extension/ViewExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n64#2,9:283\n64#2,9:292\n64#2,9:301\n64#2,9:310\n1#3:319\n*S KotlinDebug\n*F\n+ 1 RangeDatePickerFragment.kt\ncom/palmpay/lib/ui/picker/picker/date/RangeDatePickerFragment\n*L\n58#1:283,9\n59#1:292,9\n144#1:301,9\n145#1:310,9\n*E\n"})
public final class RangeDatePickerFragment extends DatePickerFragment {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f24528C = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Function3 f24529A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f24531p;
    public long t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f24532v = Boolean.FALSE;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f24533w = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f24530B = 86400000;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RangeDatePickerFragment getInstance$default(a aVar, int i7, Long l5, Long l6, Long l8, Long l10, Long l11, int i10, boolean z3, Function2 function2, Function0 function0, Function3 function3, Boolean bool, int i11, Object obj) {
            if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                function2 = null;
            }
            if ((i11 & 512) != 0) {
                function0 = null;
            }
            if ((i11 & 1024) != 0) {
                function3 = null;
            }
            if ((i11 & 2048) != 0) {
                bool = Boolean.FALSE;
            }
            return aVar.getInstance(i7, l5, l6, l8, l10, l11, i10, z3, function2, function0, function3, bool);
        }

        @NotNull
        public final RangeDatePickerFragment getInstance(int i7, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11, int i10, boolean z3, @Nullable Function2<? super Long, ? super Long, Unit> function2, @Nullable Function0<Unit> function0, @Nullable Function3<? super Long, ? super Long, ? super Integer, Unit> function3, @Nullable Boolean bool) {
            RangeDatePickerFragment rangeDatePickerFragment = new RangeDatePickerFragment();
            rangeDatePickerFragment.f24521c = i7;
            rangeDatePickerFragment.f24522d = l5;
            rangeDatePickerFragment.f24523e = l8;
            rangeDatePickerFragment.f24524f = l11;
            rangeDatePickerFragment.f24533w = i10;
            rangeDatePickerFragment.f24525g = z3;
            rangeDatePickerFragment.f24532v = bool;
            rangeDatePickerFragment.f24526i = function2;
            rangeDatePickerFragment.f24527j = function0;
            rangeDatePickerFragment.f24529A = function3;
            return rangeDatePickerFragment;
        }

        private a() {
        }
    }

    public static final void m(RangeDatePickerFragment rangeDatePickerFragment) {
        TextView textView = (TextView) ((c) rangeDatePickerFragment.f23811b).f6091c.f664d;
        textView.setSelected(!textView.isSelected());
        TextView textView2 = (TextView) ((c) rangeDatePickerFragment.f23811b).f6091c.f663c;
        textView2.setSelected(!textView2.isSelected());
        rangeDatePickerFragment.n();
        TextView tvStart = (TextView) ((c) rangeDatePickerFragment.f23811b).f6091c.f664d;
        Intrinsics.checkNotNullExpressionValue(tvStart, "tvStart");
        View vDividerStart = ((c) rangeDatePickerFragment.f23811b).f6091c.f667g;
        Intrinsics.checkNotNullExpressionValue(vDividerStart, "vDividerStart");
        if (tvStart.isSelected()) {
            Context context = rangeDatePickerFragment.getContext();
            if (context != null) {
                vDividerStart.setBackgroundColor(context.getColor(b.ppColorPrimary));
            }
        } else {
            vDividerStart.setBackgroundColor(Color.parseColor("#f2f2f2"));
        }
        TextView tvEnd = (TextView) ((c) rangeDatePickerFragment.f23811b).f6091c.f663c;
        Intrinsics.checkNotNullExpressionValue(tvEnd, "tvEnd");
        View vDividerEnd = ((c) rangeDatePickerFragment.f23811b).f6091c.f666f;
        Intrinsics.checkNotNullExpressionValue(vDividerEnd, "vDividerEnd");
        if (tvEnd.isSelected()) {
            Context context2 = rangeDatePickerFragment.getContext();
            if (context2 != null) {
                vDividerEnd.setBackgroundColor(context2.getColor(b.ppColorPrimary));
            }
        } else {
            vDividerEnd.setBackgroundColor(Color.parseColor("#f2f2f2"));
        }
        if (((TextView) ((c) rangeDatePickerFragment.f23811b).f6091c.f664d).isSelected()) {
            ((c) rangeDatePickerFragment.f23811b).f6092d.k(rangeDatePickerFragment.i(), rangeDatePickerFragment.t, Long.valueOf(rangeDatePickerFragment.f24531p));
            return;
        }
        if (((TextView) ((c) rangeDatePickerFragment.f23811b).f6091c.f663c).isSelected()) {
            TimePickerView timePickerView = ((c) rangeDatePickerFragment.f23811b).f6092d;
            long j6 = rangeDatePickerFragment.f24531p;
            Calendar calendar = Calendar.getInstance();
            Intrinsics.e(calendar);
            W6.a.a(calendar);
            timePickerView.k(j6, calendar.getTimeInMillis(), Long.valueOf(rangeDatePickerFragment.t));
        }
    }

    public static void p(TextView textView) {
        textView.setTypeface(textView.isSelected() ? Typeface.create("sans-serif-medium", 0) : Typeface.create("sans-serif", 0));
    }

    @Override // com.palmpay.lib.ui.picker.picker.date.DatePickerFragment, com.palmpay.lib.live.LiveFragment
    public final Class g() {
        return BaseViewModel.class;
    }

    @Override // com.palmpay.lib.ui.picker.picker.date.DatePickerFragment, com.palmpay.lib.live.BaseBindingFragment
    public final /* bridge */ /* synthetic */ ViewBinding h(ViewGroup viewGroup) {
        return l();
    }

    @Override // com.palmpay.lib.ui.picker.picker.date.DatePickerFragment
    public final long i() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, 1790);
        calendar.set(2, 0);
        calendar.set(5, 1);
        W6.a.b(calendar);
        return calendar.getTimeInMillis();
    }

    @Override // com.palmpay.lib.ui.picker.picker.date.DatePickerFragment
    public final void j(c binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        if (this.f24521c == 3) {
            TimePickerView timePickerView = binding.f6092d;
            timePickerView.f24500C = true;
            timePickerView.l(Boolean.FALSE);
        }
        Long l5 = this.f24524f;
        if (l5 != null) {
            binding.f6092d.k(i(), l5.longValue(), Long.valueOf(this.f24531p));
        }
        binding.f6092d.setOnItemSelectedListener(new Z6.b(0, binding, this));
        long j6 = this.f24531p;
        TimePickerView timePickerView2 = binding.f6092d;
        timePickerView2.j(j6);
        Boolean bool = this.f24532v;
        timePickerView2.setMonthDayExchange(bool != null ? bool.booleanValue() : false);
    }

    @Override // com.palmpay.lib.ui.picker.picker.date.DatePickerFragment
    public final void k() {
        long timeInMillis;
        long timeInMillis2;
        super.k();
        boolean z3 = this.f24521c == 2;
        ((ConstraintLayout) ((c) this.f23811b).f6091c.f662b).setVisibility(z3 ? 0 : 8);
        if (z3) {
            ViewBinding viewBinding = this.f23811b;
            Intrinsics.checkNotNullExpressionValue(viewBinding, "getBinding(...)");
            c cVar = (c) viewBinding;
            C0105b c0105b = cVar.f6091c;
            TextView tvStart = (TextView) c0105b.f664d;
            tvStart.setSelected(true);
            TextView tvEnd = (TextView) c0105b.f663c;
            tvEnd.setSelected(false);
            Intrinsics.checkNotNullExpressionValue(tvStart, "tvStart");
            tvStart.setOnClickListener(new Z6.c(tvStart, this, 0));
            Intrinsics.checkNotNullExpressionValue(tvEnd, "tvEnd");
            tvEnd.setOnClickListener(new Z6.c(tvEnd, this, 1));
            n();
            Long l5 = this.f24523e;
            Long l6 = this.f24524f;
            if (l5 != null) {
                timeInMillis = l5.longValue();
            } else {
                Calendar calendar = Calendar.getInstance();
                calendar.add(2, 0);
                calendar.set(5, 1);
                W6.a.b(calendar);
                timeInMillis = calendar.getTimeInMillis();
            }
            this.f24531p = timeInMillis;
            if (l6 != null) {
                timeInMillis2 = l6.longValue();
            } else {
                Calendar calendar2 = Calendar.getInstance();
                Intrinsics.e(calendar2);
                W6.a.a(calendar2);
                timeInMillis2 = calendar2.getTimeInMillis();
            }
            this.t = timeInMillis2;
            q(this.f24531p);
            o(this.t);
            k kVar = cVar.f6090b;
            TextView textView = (TextView) kVar.f749c;
            Context context = getContext();
            textView.setText(context != null ? context.getString(h.lib_ui_picker_range_negative_btn_text) : null);
            Context context2 = getContext();
            ((TextView) kVar.f748b).setText(context2 != null ? context2.getString(h.lib_ui_picker_range_positive_btn_text) : null);
        }
        ViewBinding viewBinding2 = this.f23811b;
        Intrinsics.checkNotNullExpressionValue(viewBinding2, "getBinding(...)");
        j((c) viewBinding2);
        k kVar2 = ((c) this.f23811b).f6090b;
        TextView tvNegative = (TextView) kVar2.f749c;
        Intrinsics.checkNotNullExpressionValue(tvNegative, "tvNegative");
        tvNegative.setOnClickListener(new Z6.c(tvNegative, this, 2));
        TextView tvPositive = (TextView) kVar2.f748b;
        Intrinsics.checkNotNullExpressionValue(tvPositive, "tvPositive");
        tvPositive.setOnClickListener(new Z6.c(tvPositive, this, 3));
    }

    @Override // com.palmpay.lib.ui.picker.picker.date.DatePickerFragment
    public final c l() {
        c cVarA = c.a(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(cVarA, "inflate(...)");
        return cVarA;
    }

    public final void n() {
        TextView tvStart = (TextView) ((c) this.f23811b).f6091c.f664d;
        Intrinsics.checkNotNullExpressionValue(tvStart, "tvStart");
        p(tvStart);
        TextView tvEnd = (TextView) ((c) this.f23811b).f6091c.f663c;
        Intrinsics.checkNotNullExpressionValue(tvEnd, "tvEnd");
        p(tvEnd);
    }

    public final void o(long j6) {
        this.t = j6;
        TextView textView = (TextView) ((c) this.f23811b).f6091c.f663c;
        SimpleDateFormat format = Boolean.TRUE.equals(this.f24532v) ? W6.a.f10563b : W6.a.f10562a;
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(format, "format");
        SimpleDateFormat simpleDateFormat = p008a7.a.f11828a;
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.format(new Date(j6));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
        p(textView);
    }

    public final void q(long j6) {
        this.f24531p = j6;
        TextView textView = (TextView) ((c) this.f23811b).f6091c.f664d;
        SimpleDateFormat format = Boolean.TRUE.equals(this.f24532v) ? W6.a.f10563b : W6.a.f10562a;
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(format, "format");
        SimpleDateFormat simpleDateFormat = p008a7.a.f11828a;
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.format(new Date(j6));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
        p(textView);
    }
}
