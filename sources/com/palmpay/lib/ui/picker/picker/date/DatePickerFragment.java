package com.palmpay.lib.ui.picker.picker.date;

import Bc.k;
import N6.c;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.live.BaseBindingFragment;
import com.palmpay.lib.live.BaseViewModel;
import com.palmpay.lib.ui.picker.picker.TimePickerView;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/palmpay/lib/ui/picker/picker/date/DatePickerFragment;", "Lcom/palmpay/lib/live/BaseBindingFragment;", "Lcom/palmpay/lib/live/BaseViewModel;", "LN6/c;", "<init>", "()V", "a", "lib_ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDatePickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerFragment.kt\ncom/palmpay/lib/ui/picker/picker/date/DatePickerFragment\n+ 2 ViewExt.kt\ncom/palmpay/lib/ui/picker/extension/ViewExtKt\n*L\n1#1,153:1\n64#2,9:154\n64#2,9:163\n*S KotlinDebug\n*F\n+ 1 DatePickerFragment.kt\ncom/palmpay/lib/ui/picker/picker/date/DatePickerFragment\n*L\n48#1:154,9\n54#1:163,9\n*E\n"})
public class DatePickerFragment extends BaseBindingFragment<BaseViewModel, c> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f24520o = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24521c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f24522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f24523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f24524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24525g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Function2 f24526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function0 f24527j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DatePickerFragment getInstance$default(a aVar, int i7, Long l5, Long l6, Long l8, boolean z3, Function2 function2, Function0 function0, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                l8 = null;
            }
            if ((i10 & 16) != 0) {
                z3 = false;
            }
            if ((i10 & 32) != 0) {
                function2 = null;
            }
            if ((i10 & 64) != 0) {
                function0 = null;
            }
            return aVar.getInstance(i7, l5, l6, l8, z3, function2, function0);
        }

        @NotNull
        public final DatePickerFragment getInstance(int i7, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, boolean z3, @Nullable Function2<? super Long, ? super Long, Unit> function2, @Nullable Function0<Unit> function0) {
            DatePickerFragment datePickerFragment = new DatePickerFragment();
            Bundle bundle = new Bundle();
            datePickerFragment.f24521c = i7;
            datePickerFragment.f24523e = l5;
            datePickerFragment.f24522d = l6;
            datePickerFragment.f24524f = l8;
            datePickerFragment.f24525g = z3;
            datePickerFragment.f24526i = function2;
            datePickerFragment.f24527j = function0;
            datePickerFragment.setArguments(bundle);
            return datePickerFragment;
        }

        private a() {
        }
    }

    @Override // com.palmpay.lib.live.LiveFragment
    public Class g() {
        return BaseViewModel.class;
    }

    @Override // com.palmpay.lib.live.BaseBindingFragment
    public /* bridge */ /* synthetic */ ViewBinding h(ViewGroup viewGroup) {
        return l();
    }

    public long i() {
        Calendar calendar = Calendar.getInstance();
        Long l5 = this.f24523e;
        if (l5 != null) {
            calendar.setTimeInMillis(l5.longValue());
        } else {
            calendar.set(1, 1790);
            calendar.set(2, 0);
            calendar.set(5, 1);
        }
        Intrinsics.e(calendar);
        W6.a.b(calendar);
        return calendar.getTimeInMillis();
    }

    @Override // com.palmpay.lib.live.LiveFragment, com.palmpay.lib.live.IView
    public final void initData(Bundle bundle) {
        k();
    }

    public void j(c binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        if (this.f24521c == 3) {
            TimePickerView timePickerView = binding.f6092d;
            timePickerView.f24500C = true;
            timePickerView.l(Boolean.FALSE);
        }
        Long l5 = this.f24524f;
        if (l5 != null) {
            long jLongValue = l5.longValue();
            TimePickerView timePickerView2 = binding.f6092d;
            long jI = i();
            int i7 = TimePickerView.f24497u0;
            timePickerView2.k(jI, jLongValue, null);
        }
        Long l6 = this.f24522d;
        if (l6 != null) {
            binding.f6092d.j(l6.longValue());
        }
    }

    public void k() {
        ViewBinding viewBinding = this.f23811b;
        Intrinsics.checkNotNullExpressionValue(viewBinding, "getBinding(...)");
        j((c) viewBinding);
        k kVar = ((c) this.f23811b).f6090b;
        TextView tvNegative = (TextView) kVar.f749c;
        tvNegative.setVisibility(this.f24525g ? 0 : 8);
        Intrinsics.checkNotNullExpressionValue(tvNegative, "tvNegative");
        tvNegative.setOnClickListener(new Z6.a(tvNegative, this, 0));
        TextView tvPositive = (TextView) kVar.f748b;
        Intrinsics.checkNotNullExpressionValue(tvPositive, "tvPositive");
        tvPositive.setOnClickListener(new Z6.a(tvPositive, this, 1));
    }

    public c l() {
        c cVarA = c.a(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(cVarA, "inflate(...)");
        return cVarA;
    }
}
