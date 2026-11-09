package com.palmpay.lib.ui.picker.picker.date;

import Je.k;
import N6.b;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.live.BaseBindingFragment;
import com.palmpay.lib.live.BaseViewModel;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/palmpay/lib/ui/picker/picker/date/BaseDatePickerFragment;", "Lcom/palmpay/lib/live/BaseBindingFragment;", "Lcom/palmpay/lib/live/BaseViewModel;", "LN6/b;", "<init>", "()V", "a", "DatePickerCallback", "lib_ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseDatePickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDatePickerFragment.kt\ncom/palmpay/lib/ui/picker/picker/date/BaseDatePickerFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExt.kt\ncom/palmpay/lib/ui/picker/extension/ViewExtKt\n*L\n1#1,168:1\n1#2:169\n64#3,9:170\n64#3,9:179\n*S KotlinDebug\n*F\n+ 1 BaseDatePickerFragment.kt\ncom/palmpay/lib/ui/picker/picker/date/BaseDatePickerFragment\n*L\n64#1:170,9\n68#1:179,9\n*E\n"})
public class BaseDatePickerFragment extends BaseBindingFragment<BaseViewModel, b> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f24513j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f24515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f24516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f24517f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatePickerCallback f24519i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24514c = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24518g = true;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/palmpay/lib/ui/picker/picker/date/BaseDatePickerFragment$DatePickerCallback;", "", "positiveAction", "", "startTimestamp", "", "endTimestamp", "(JLjava/lang/Long;)V", "lib_ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface DatePickerCallback {
        void positiveAction(long startTimestamp, @Nullable Long endTimestamp);
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BaseDatePickerFragment getInstance$default(a aVar, int i7, Long l5, Long l6, Long l8, boolean z3, Function2 function2, int i10, Object obj) {
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
        public final BaseDatePickerFragment getInstance(int i7, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, boolean z3, @Nullable Function2<? super Long, ? super Long, Unit> function2) {
            BaseDatePickerFragment baseDatePickerFragment = new BaseDatePickerFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("mode", i7);
            if (l5 != null) {
                bundle.putLong("startTimestamp", l5.longValue());
            }
            if (l6 != null) {
                bundle.putLong("selectedTimestamp", l6.longValue());
            }
            if (l8 != null) {
                bundle.putLong("endTimestamp", l8.longValue());
            }
            bundle.putBoolean("showNegativeAction", z3);
            baseDatePickerFragment.setArguments(bundle);
            return baseDatePickerFragment;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.palmpay.lib.live.LiveFragment
    public Class g() {
        return BaseViewModel.class;
    }

    @Override // com.palmpay.lib.live.BaseBindingFragment
    public final ViewBinding h(ViewGroup viewGroup) {
        b bVarA = b.a(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(bVarA, "inflate(...)");
        return bVarA;
    }

    public final long i() {
        Calendar calendar = Calendar.getInstance();
        Long l5 = this.f24516e;
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
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f24514c = arguments.getInt("mode");
            long j6 = arguments.getLong("startTimestamp", -1L);
            Long lValueOf = Long.valueOf(j6);
            if (!(j6 != -1)) {
                lValueOf = null;
            }
            this.f24516e = lValueOf;
            long j10 = arguments.getLong("selectedTimestamp", -1L);
            Long lValueOf2 = Long.valueOf(j10);
            if (j10 == -1) {
                lValueOf2 = null;
            }
            this.f24515d = lValueOf2;
            long j11 = arguments.getLong("endTimestamp", -1L);
            this.f24517f = j11 != -1 ? Long.valueOf(j11) : null;
            this.f24518g = arguments.getBoolean("showNegativeAction");
        }
        ViewBinding viewBinding = this.f23811b;
        Intrinsics.checkNotNullExpressionValue(viewBinding, "getBinding(...)");
        j((b) viewBinding);
        TextView tvNegative = (TextView) ((b) this.f23811b).f6087c.f749c;
        Intrinsics.checkNotNullExpressionValue(tvNegative, "tvNegative");
        tvNegative.setOnClickListener(new k(tvNegative));
        ((TextView) ((b) this.f23811b).f6087c.f749c).setVisibility(this.f24518g ? 0 : 8);
        TextView tvNegative2 = (TextView) ((b) this.f23811b).f6087c.f749c;
        Intrinsics.checkNotNullExpressionValue(tvNegative2, "tvNegative");
        tvNegative2.setOnClickListener(new k(tvNegative2, this));
    }

    public void j(b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (context instanceof DatePickerCallback) {
            this.f24519i = (DatePickerCallback) context;
            return;
        }
        throw new RuntimeException(context + " must implement DatePickerCallback");
    }
}
