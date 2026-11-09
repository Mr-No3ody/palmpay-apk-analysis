package com.transsnet.palmpay.credit.ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLFillYourInformationDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLFillYourInformationDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final a f29940M = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public p208nf.d f29941C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Function0 f29942H = new com.transsnet.palmpay.core.ui.activity.T(3);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextView f29943L;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CLFillYourInformationDialogFragment newInstance$default(a aVar, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = null;
            }
            return aVar.newInstance(str);
        }

        @NotNull
        public final CLFillYourInformationDialogFragment newInstance(@Nullable String str) {
            CLFillYourInformationDialogFragment cLFillYourInformationDialogFragment = new CLFillYourInformationDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("arg_route_path", str);
            cLFillYourInformationDialogFragment.setArguments(bundle);
            return cLFillYourInformationDialogFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        ImageView imageView;
        final int i7 = 0;
        final int i10 = 1;
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = com.horcrux.svg.d0.f(LayoutInflater.from(getContext()), Ya.f.cs_cl_fill_your_information_dialog, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31246p = true;
        this.f31242g = 17;
        Set set = Eb.b.f2269a;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("arg_route_path") : null;
        ViewEvent viewEvent = new ViewEvent("Info_Supplement_Pop-up");
        if (string != null) {
            if (StringsKt.F(string)) {
                string = null;
            }
            if (string != null) {
                viewEvent.add("routePath", string);
            }
        }
        Pa.n0.g().u(viewEvent);
        TextView textView = viewF != null ? (TextView) viewF.findViewById(Ya.e.tvBorrowNow) : null;
        this.f29943L = textView;
        if (textView != null) {
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.t

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLFillYourInformationDialogFragment f30202b;

                {
                    this.f30202b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLFillYourInformationDialogFragment cLFillYourInformationDialogFragment = this.f30202b;
                    switch (i7) {
                        case 0:
                            CLFillYourInformationDialogFragment.a aVar = CLFillYourInformationDialogFragment.f29940M;
                            cLFillYourInformationDialogFragment.dismiss();
                            cLFillYourInformationDialogFragment.f29942H.invoke();
                            break;
                        default:
                            CLFillYourInformationDialogFragment.a aVar2 = CLFillYourInformationDialogFragment.f29940M;
                            cLFillYourInformationDialogFragment.dismiss();
                            cLFillYourInformationDialogFragment.f29942H.invoke();
                            break;
                    }
                }
            }, textView);
        }
        if (viewF != null && (imageView = (ImageView) viewF.findViewById(Ya.e.ivClose)) != null) {
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.t

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLFillYourInformationDialogFragment f30202b;

                {
                    this.f30202b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLFillYourInformationDialogFragment cLFillYourInformationDialogFragment = this.f30202b;
                    switch (i10) {
                        case 0:
                            CLFillYourInformationDialogFragment.a aVar = CLFillYourInformationDialogFragment.f29940M;
                            cLFillYourInformationDialogFragment.dismiss();
                            cLFillYourInformationDialogFragment.f29942H.invoke();
                            break;
                        default:
                            CLFillYourInformationDialogFragment.a aVar2 = CLFillYourInformationDialogFragment.f29940M;
                            cLFillYourInformationDialogFragment.dismiss();
                            cLFillYourInformationDialogFragment.f29942H.invoke();
                            break;
                    }
                }
            }, imageView);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        io.reactivex.internal.operators.flowable.p pVar = new io.reactivex.internal.operators.flowable.p(new io.reactivex.internal.operators.flowable.z(df.b.a()), new com.transsnet.palmpay.core.ui.activity.Z(new com.facebook.react.packagerconnection.a(11), 2));
        df.i iVar = p298tf.f.f42629b;
        p147jf.a.a(iVar, "scheduler is null");
        io.reactivex.internal.operators.flowable.t tVarB = new io.reactivex.internal.operators.flowable.x(pVar, iVar).b(p071ef.b.a());
        p208nf.d dVar = new p208nf.d(new com.transsnet.palmpay.core.ui.activity.Z(new p010a9.m(this, 12), 3), new com.transsnet.palmpay.core.ui.activity.Z(new com.facebook.react.packagerconnection.a(12), 4), new com.transsnet.palmpay.core.ui.activity.Z(this, 5));
        tVarB.c(dVar);
        this.f29941C = dVar;
        return baseDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        p208nf.d dVar = this.f29941C;
        if (dVar != null) {
            p225of.b.a(dVar);
        }
    }
}
