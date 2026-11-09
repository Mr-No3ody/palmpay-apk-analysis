package com.transsnet.palmpay.custom_view.dialog;

import Ad.L;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.ui.activity.Z;
import com.transsnet.palmpay.credit.ui.dialog.ViewOnClickListenerC1533v;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/custom_view/dialog/PickStateDialogFragment;", "T", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "OnAreaSelectedListener", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPickStateDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickStateDialogFragment.kt\ncom/transsnet/palmpay/custom_view/dialog/PickStateDialogFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n360#2,7:122\n*S KotlinDebug\n*F\n+ 1 PickStateDialogFragment.kt\ncom/transsnet/palmpay/custom_view/dialog/PickStateDialogFragment\n*L\n93#1:122,7\n*E\n"})
public final class PickStateDialogFragment<T> extends BaseDialogFragment {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final a f31255Q = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public OnAreaSelectedListener f31256C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public List f31257H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Object f31258L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f31259M;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/custom_view/dialog/PickStateDialogFragment$OnAreaSelectedListener;", "T", "", "onAreaSelected", "", "t", "(Ljava/lang/Object;)V", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnAreaSelectedListener<T> {
        void onAreaSelected(@Nullable T t);
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PickStateDialogFragment newInstance$default(a aVar, OnAreaSelectedListener onAreaSelectedListener, List list, Object obj, String str, int i7, Object obj2) {
            if ((i7 & 4) != 0) {
                obj = null;
            }
            return aVar.newInstance(onAreaSelectedListener, list, obj, str);
        }

        @NotNull
        public final <T> PickStateDialogFragment<T> newInstance(@Nullable OnAreaSelectedListener<T> onAreaSelectedListener, @Nullable List<? extends T> list, @Nullable T t, @Nullable String str) {
            PickStateDialogFragment<T> pickStateDialogFragment = new PickStateDialogFragment<>();
            pickStateDialogFragment.f31256C = onAreaSelectedListener;
            pickStateDialogFragment.f31257H = list;
            pickStateDialogFragment.f31258L = t;
            pickStateDialogFragment.f31259M = str;
            return pickStateDialogFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), com.transsnet.palmpay.custom_view.t.cv_pick_state_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        int i7 = 0;
        this.f31245o = false;
        this.f31246p = true;
        this.f31243i = com.transsnet.palmpay.custom_view.w.dialog_bottom_in_out;
        this.f31242g = 80;
        View viewFindViewById = viewF.findViewById(com.transsnet.palmpay.custom_view.s.tvTitle);
        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(this.f31259M);
        View viewFindViewById2 = viewF.findViewById(com.transsnet.palmpay.custom_view.s.areaWv);
        Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type com.transsnet.palmpay.custom_view.wheelview.widget.WheelView<T of com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment>");
        WheelView wheelView = (WheelView) viewFindViewById2;
        Context contextRequireContext = requireContext();
        L l5 = new L();
        l5.f177g = contextRequireContext;
        wheelView.setWheelAdapter(l5);
        wheelView.setWheelSize(5);
        wheelView.setWheelData(this.f31257H);
        dc.b bVar = new dc.b();
        bVar.f35864a = 0;
        bVar.f35866c = requireContext().getColor(L6.b.ppColorTextDisable);
        bVar.f35867d = requireContext().getColor(L6.b.ppColorTextPrimary);
        bVar.f35868e = 16;
        bVar.f35869f = 22;
        wheelView.setStyle(bVar);
        wheelView.setOnWheelItemClickListener(new Z(this, 15));
        List list = this.f31257H;
        if (list != null && (!list.isEmpty())) {
            List list2 = this.f31257H;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i7 = -1;
                        break;
                    }
                    Object next = it.next();
                    String string = next != null ? next.toString() : null;
                    Object obj = this.f31258L;
                    if (Intrinsics.c(string, obj != null ? obj.toString() : null)) {
                        break;
                    }
                    i7++;
                }
            }
            if (i7 >= 0) {
                wheelView.setSelection(i7);
            }
        }
        viewF.findViewById(com.transsnet.palmpay.custom_view.s.tvCancel).setOnClickListener(new ViewOnClickListenerC1533v(this, 22));
        viewF.findViewById(com.transsnet.palmpay.custom_view.s.tvConfirm).setOnClickListener(new p010a9.b(19, this, wheelView));
        return baseDialog;
    }
}
