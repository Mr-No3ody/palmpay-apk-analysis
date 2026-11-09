package com.palmpay.lib.ui.picker.picker.date;

import Bc.l;
import C9.V;
import N6.b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.palmpay.lib.live.BaseViewModel;
import com.palmpay.lib.ui.picker.picker.TimePickerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/palmpay/lib/ui/picker/picker/date/XDatePickerFragment;", "Lcom/palmpay/lib/ui/picker/picker/date/BaseDatePickerFragment;", "Lcom/palmpay/lib/ui/picker/picker/date/BaseDatePickerFragment$DatePickerCallback;", "<init>", "()V", "a", "lib_ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nXDatePickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XDatePickerFragment.kt\ncom/palmpay/lib/ui/picker/picker/date/XDatePickerFragment\n+ 2 ViewExt.kt\ncom/palmpay/lib/ui/picker/extension/ViewExtKt\n*L\n1#1,115:1\n64#2,9:116\n*S KotlinDebug\n*F\n+ 1 XDatePickerFragment.kt\ncom/palmpay/lib/ui/picker/picker/date/XDatePickerFragment\n*L\n50#1:116,9\n*E\n"})
public class XDatePickerFragment extends BaseDatePickerFragment implements BaseDatePickerFragment.DatePickerCallback {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f24540p = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f24541o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ XDatePickerFragment getInstance$default(a aVar, int i7, Long l5, Long l6, Long l8, boolean z3, Function2 function2, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                l8 = null;
            }
            if ((i10 & 16) != 0) {
                z3 = false;
            }
            if ((i10 & 32) != 0) {
                function2 = null;
            }
            return aVar.getInstance(i7, l5, l6, l8, z3, function2);
        }

        @NotNull
        public final XDatePickerFragment getInstance(int i7, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, boolean z3, @Nullable Function2<? super Long, ? super Long, Unit> function2) {
            XDatePickerFragment xDatePickerFragment = new XDatePickerFragment();
            Bundle bundle = new Bundle();
            xDatePickerFragment.f24514c = i7;
            xDatePickerFragment.f24516e = l5;
            xDatePickerFragment.f24515d = l6;
            xDatePickerFragment.f24517f = l8;
            xDatePickerFragment.f24518g = z3;
            xDatePickerFragment.setArguments(bundle);
            return xDatePickerFragment;
        }

        private a() {
        }
    }

    @Override // com.palmpay.lib.ui.picker.picker.date.BaseDatePickerFragment, com.palmpay.lib.live.LiveFragment
    public final Class g() {
        return BaseViewModel.class;
    }

    @Override // com.palmpay.lib.ui.picker.picker.date.BaseDatePickerFragment
    public final void j(b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        l lVarB = l.b(LayoutInflater.from(getContext()));
        this.f24541o = lVarB;
        binding.f6086b.addView((TimePickerView) lVarB.f755c);
        if (this.f24514c == 3) {
            l lVar = this.f24541o;
            if (lVar == null) {
                Intrinsics.n("pickerBinding");
                throw null;
            }
            TimePickerView timePickerView = (TimePickerView) lVar.f755c;
            timePickerView.f24500C = true;
            timePickerView.l(Boolean.FALSE);
        }
        Long l5 = this.f24517f;
        if (l5 != null) {
            long jLongValue = l5.longValue();
            l lVar2 = this.f24541o;
            if (lVar2 == null) {
                Intrinsics.n("pickerBinding");
                throw null;
            }
            long jI = i();
            TimePickerView timePickerView2 = (TimePickerView) lVar2.f755c;
            int i7 = TimePickerView.f24497u0;
            timePickerView2.k(jI, jLongValue, null);
        }
        Long l6 = this.f24515d;
        if (l6 != null) {
            long jLongValue2 = l6.longValue();
            l lVar3 = this.f24541o;
            if (lVar3 == null) {
                Intrinsics.n("pickerBinding");
                throw null;
            }
            ((TimePickerView) lVar3.f755c).j(jLongValue2);
        }
        TextView tvPositive = (TextView) binding.f6087c.f748b;
        Intrinsics.checkNotNullExpressionValue(tvPositive, "tvPositive");
        tvPositive.setOnClickListener(new V(10, tvPositive, this));
        if (this.f24514c == 3) {
            l lVar4 = this.f24541o;
            if (lVar4 == null) {
                Intrinsics.n("pickerBinding");
                throw null;
            }
            TimePickerView timePickerView3 = (TimePickerView) lVar4.f755c;
            timePickerView3.f24500C = true;
            timePickerView3.l(Boolean.FALSE);
        }
        Long l8 = this.f24517f;
        if (l8 != null) {
            long jLongValue3 = l8.longValue();
            l lVar5 = this.f24541o;
            if (lVar5 == null) {
                Intrinsics.n("pickerBinding");
                throw null;
            }
            long jI2 = i();
            TimePickerView timePickerView4 = (TimePickerView) lVar5.f755c;
            int i10 = TimePickerView.f24497u0;
            timePickerView4.k(jI2, jLongValue3, null);
        }
        Long l10 = this.f24515d;
        if (l10 != null) {
            long jLongValue4 = l10.longValue();
            l lVar6 = this.f24541o;
            if (lVar6 != null) {
                ((TimePickerView) lVar6.f755c).j(jLongValue4);
            } else {
                Intrinsics.n("pickerBinding");
                throw null;
            }
        }
    }

    @Override // com.palmpay.lib.ui.picker.picker.date.BaseDatePickerFragment.DatePickerCallback
    public final void positiveAction(long j6, Long l5) {
    }
}
