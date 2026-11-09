package com.transsnet.palmpay.credit.ui.dialog;

import Ad.C0058e;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.custom_view.CircleProgressView;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CreditApplicationDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreditApplicationDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f29952L = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public p208nf.d f29953C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Function0 f29954H = new com.transsnet.palmpay.core.ui.activity.T(6);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CreditApplicationDialogFragment newInstance(@Nullable List<OcRouterDetail> list) {
            F6.d.h("CreditApplicationDialogFragment", 3, "newInstance >>>");
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (list != null) {
                arrayList.addAll(list);
            }
            CreditApplicationDialogFragment creditApplicationDialogFragment = new CreditApplicationDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("route_list", arrayList);
            creditApplicationDialogFragment.setArguments(bundle);
            return creditApplicationDialogFragment;
        }

        private a() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        String missingDelimiterValue;
        String string;
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = com.horcrux.svg.d0.f(LayoutInflater.from(getContext()), Ya.f.cs_cl_credit_application_dialog, null, "inflate(...)", baseDialog);
        this.f31244j = false;
        this.f31239d = (int) (((double) ScreenUtils.getScreenWidth()) * 0.9d);
        this.f31245o = false;
        this.f31246p = true;
        this.f31242g = 17;
        ImageView imageView = viewF != null ? (ImageView) viewF.findViewById(Ya.e.ivClose) : null;
        TextView textView = viewF != null ? (TextView) viewF.findViewById(Ya.e.tvTitle) : null;
        RecyclerView recyclerView = viewF != null ? (RecyclerView) viewF.findViewById(Ya.e.rvRouteList) : null;
        TextView textView2 = viewF != null ? (TextView) viewF.findViewById(com.transsnet.palmpay.custom_view.s.tvCountDown) : null;
        CircleProgressView circleProgressView = viewF != null ? (CircleProgressView) viewF.findViewById(com.transsnet.palmpay.custom_view.s.progressBar) : null;
        if (imageView != null) {
            p220oa.h.l(new ViewOnClickListenerC1533v(this, 7), imageView);
        }
        Bundle arguments = getArguments();
        ArrayList parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("route_list") : null;
        int size = parcelableArrayList != null ? CollectionsKt.D(parcelableArrayList).size() : 0;
        int i7 = size >= 1 ? size : 1;
        if (textView != null) {
            SpanUtils spanUtils = new SpanUtils();
            Context context = getContext();
            if (context == null || (missingDelimiterValue = context.getString(Ya.g.cs_cl_only_steps, Integer.valueOf(i7))) == null) {
                missingDelimiterValue = "Only ";
            } else {
                String delimiter = String.valueOf(i7);
                Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
                Intrinsics.checkNotNullParameter(delimiter, "delimiter");
                Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
                int iE = StringsKt.E(missingDelimiterValue, delimiter, 0, false, 6);
                if (iE != -1) {
                    missingDelimiterValue = missingDelimiterValue.substring(0, iE);
                    Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "substring(...)");
                }
                if (missingDelimiterValue == null) {
                    missingDelimiterValue = "Only ";
                }
            }
            SpanUtils foregroundColor = spanUtils.append(missingDelimiterValue).setForegroundColor(requireContext().getColor(L6.b.ppColorTextPrimary));
            Context context2 = getContext();
            if (context2 == null || (string = context2.getString(Ya.g.cs_cl_steps)) == null) {
                string = "steps";
            }
            C0.G.w(requireContext(), L6.b.ppColorFlexiCashPrimary, foregroundColor.append(i7 + " " + string), textView);
        }
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
        int iDp2px = SizeUtils.dp2px(16.0f);
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new C1513k0(iDp2px));
        }
        int[] iArr = {0};
        C1515l0 c1515l0 = new C1515l0(parcelableArrayList != null ? CollectionsKt.Z(parcelableArrayList) : new ArrayList(), iArr, Ya.f.cs_cl_credit_application_route_card_item);
        if (recyclerView != null) {
            recyclerView.setAdapter(c1515l0);
        }
        if (recyclerView != null) {
            recyclerView.post(new androidx.camera.video.internal.encoder.m(c1515l0, recyclerView, iArr, iDp2px, 4));
        }
        if (circleProgressView != null) {
            circleProgressView.setProgressColor(requireContext().getColor(L6.b.ppColorFlexiCashPrimary));
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        io.reactivex.internal.operators.flowable.p pVar = new io.reactivex.internal.operators.flowable.p(new io.reactivex.internal.operators.flowable.z(df.b.a()), new com.transsnet.palmpay.core.ui.activity.Z(new com.facebook.react.packagerconnection.a(13), 6));
        df.i iVar = p298tf.f.f42629b;
        p147jf.a.a(iVar, "scheduler is null");
        io.reactivex.internal.operators.flowable.t tVarB = new io.reactivex.internal.operators.flowable.x(pVar, iVar).b(p071ef.b.a());
        p208nf.d dVar = new p208nf.d(new com.transsnet.palmpay.core.ui.activity.Z(new C0058e(25, textView2, circleProgressView), 7), new com.transsnet.palmpay.core.ui.activity.Z(new com.facebook.react.packagerconnection.a(14), 8), new com.transsnet.palmpay.core.ui.activity.Z(this, 9));
        tVarB.c(dVar);
        this.f29953C = dVar;
        return baseDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        p208nf.d dVar = this.f29953C;
        if (dVar != null) {
            p225of.b.a(dVar);
        }
    }
}
