package com.transsnet.palmpay.credit.ui.dialog;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/DownloadCashPageDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DownloadCashPageDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f29959L = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public p208nf.d f29960C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextView f29961H;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DownloadCashPageDialogFragment newInstance() {
            return new DownloadCashPageDialogFragment();
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = com.horcrux.svg.d0.f(LayoutInflater.from(getContext()), Ya.f.cs_cl_download_cash_dialog, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31238c = DensityUtil.dp2px(16.0f);
        this.f31242g = 17;
        TextView textView = (TextView) viewF.findViewById(Ya.e.tvSkipDownloadPage);
        this.f29961H = textView;
        if (textView != null) {
            textView.setText(getString(Ya.g.cs_cl_skip_download_page, 3));
        }
        TextView textView2 = this.f29961H;
        if (textView2 != null) {
            p220oa.h.l(new ViewOnClickListenerC1533v(this, 8), textView2);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        io.reactivex.internal.operators.flowable.p pVar = new io.reactivex.internal.operators.flowable.p(new io.reactivex.internal.operators.flowable.z(df.b.a()), new com.transsnet.palmpay.core.ui.activity.Z(new com.facebook.react.packagerconnection.a(15), 10));
        df.i iVar = p298tf.f.f42629b;
        p147jf.a.a(iVar, "scheduler is null");
        io.reactivex.internal.operators.flowable.t tVarB = new io.reactivex.internal.operators.flowable.x(pVar, iVar).b(p071ef.b.a());
        p208nf.d dVar = new p208nf.d(new com.transsnet.palmpay.core.ui.activity.Z(new p010a9.m(this, 13), 11), new com.transsnet.palmpay.core.ui.activity.Z(new com.facebook.react.packagerconnection.a(16), 12), new com.transsnet.palmpay.core.ui.activity.Z(this, 13));
        tVarB.c(dVar);
        this.f29960C = dVar;
        return baseDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        p208nf.d dVar = this.f29960C;
        if (dVar != null) {
            p225of.b.a(dVar);
        }
    }
}
