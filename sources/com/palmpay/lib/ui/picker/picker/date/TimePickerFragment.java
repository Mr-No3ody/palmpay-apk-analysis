package com.palmpay.lib.ui.picker.picker.date;

import Bc.l;
import L6.g;
import N6.b;
import Z6.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.live.BaseBindingFragment;
import com.palmpay.lib.live.BaseViewModel;
import com.palmpay.lib.ui.picker.picker.HoursMinutesPickerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/palmpay/lib/ui/picker/picker/date/TimePickerFragment;", "Lcom/palmpay/lib/live/BaseBindingFragment;", "Lcom/palmpay/lib/live/BaseViewModel;", "LN6/b;", "<init>", "()V", "a", "lib_ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimePickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePickerFragment.kt\ncom/palmpay/lib/ui/picker/picker/date/TimePickerFragment\n+ 2 ViewExt.kt\ncom/palmpay/lib/ui/picker/extension/ViewExtKt\n*L\n1#1,138:1\n64#2,9:139\n64#2,9:148\n*S KotlinDebug\n*F\n+ 1 TimePickerFragment.kt\ncom/palmpay/lib/ui/picker/picker/date/TimePickerFragment\n*L\n48#1:139,9\n53#1:148,9\n*E\n"})
public class TimePickerFragment extends BaseBindingFragment<BaseViewModel, b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f24534i = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f24535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f24537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function2 f24538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f24539g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TimePickerFragment getInstance$default(a aVar, int i7, Long l5, Long l6, Long l8, Long l10, boolean z3, Function2 function2, int i10, Object obj) {
            if ((i10 & 32) != 0) {
                z3 = false;
            }
            return aVar.getInstance(i7, l5, l6, l8, l10, z3, (i10 & 64) != 0 ? null : function2);
        }

        @NotNull
        public final TimePickerFragment getInstance(int i7, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, boolean z3, @Nullable Function2<? super Long, ? super Long, Unit> function2) {
            TimePickerFragment timePickerFragment = new TimePickerFragment();
            Bundle bundle = new Bundle();
            timePickerFragment.f24535c = l8;
            timePickerFragment.f24537e = l6;
            timePickerFragment.f24536d = z3;
            timePickerFragment.f24538f = function2;
            timePickerFragment.setArguments(bundle);
            return timePickerFragment;
        }

        private a() {
        }
    }

    @Override // com.palmpay.lib.live.LiveFragment
    public final Class g() {
        return BaseViewModel.class;
    }

    @Override // com.palmpay.lib.live.BaseBindingFragment
    public final ViewBinding h(ViewGroup viewGroup) {
        b bVarA = b.a(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(bVarA, "inflate(...)");
        return bVarA;
    }

    @Override // com.palmpay.lib.live.LiveFragment, com.palmpay.lib.live.IView
    public final void initData(Bundle bundle) {
        ViewBinding viewBinding = this.f23811b;
        Intrinsics.checkNotNullExpressionValue(viewBinding, "getBinding(...)");
        b bVar = (b) viewBinding;
        View viewInflate = LayoutInflater.from(getContext()).inflate(g.lib_ui_layout_picker_time, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        HoursMinutesPickerView hoursMinutesPickerView = (HoursMinutesPickerView) viewInflate;
        this.f24539g = new l(hoursMinutesPickerView, hoursMinutesPickerView, 3);
        bVar.f6086b.addView(hoursMinutesPickerView);
        Long l5 = this.f24535c;
        if (l5 != null) {
            long jLongValue = l5.longValue();
            l lVar = this.f24539g;
            if (lVar == null) {
                Intrinsics.n("pickerBinding");
                throw null;
            }
            HoursMinutesPickerView hoursMinutesPickerView2 = (HoursMinutesPickerView) lVar.f755c;
            hoursMinutesPickerView2.t.setTimeInMillis(jLongValue);
            hoursMinutesPickerView2.g();
        }
        ((TextView) ((b) this.f23811b).f6087c.f749c).setVisibility(this.f24536d ? 0 : 8);
        TextView tvNegative = (TextView) ((b) this.f23811b).f6087c.f749c;
        Intrinsics.checkNotNullExpressionValue(tvNegative, "tvNegative");
        tvNegative.setOnClickListener(new d(tvNegative, this, 0));
        TextView tvPositive = (TextView) ((b) this.f23811b).f6087c.f748b;
        Intrinsics.checkNotNullExpressionValue(tvPositive, "tvPositive");
        tvPositive.setOnClickListener(new d(tvPositive, this, 1));
    }
}
