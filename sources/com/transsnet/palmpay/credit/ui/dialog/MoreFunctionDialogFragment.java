package com.transsnet.palmpay.credit.ui.dialog;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/MoreFunctionDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MoreFunctionDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f30000C = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MoreFunctionDialogFragment newInstance() {
            return new MoreFunctionDialogFragment();
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = com.horcrux.svg.d0.f(LayoutInflater.from(getContext()), p116hb.d.cs_more_function_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = false;
        this.f31245o = false;
        this.f31239d = DensityUtil.dp2px(180.0f);
        this.f31246p = true;
        this.f31241f = false;
        this.f31236a = DensityUtil.dp2px(8.0f);
        this.f31237b = DensityUtil.dp2px(40.0f);
        this.f31242g = 8388661;
        this.f31243i = com.transsnet.palmpay.custom_view.w.Animation_slide_in_right_top;
        View viewFindViewById = viewF.findViewById(p116hb.c.tvRepaymentRecords);
        View viewFindViewById2 = viewF.findViewById(p116hb.c.tvCoupons);
        View viewFindViewById3 = viewF.findViewById(p116hb.c.tvLoanRecords);
        View viewFindViewById4 = viewF.findViewById(p116hb.c.tvLoanAgreement);
        Intrinsics.e(viewFindViewById3);
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreFunctionDialogFragment f30166b;

            {
                this.f30166b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreFunctionDialogFragment moreFunctionDialogFragment = this.f30166b;
                switch (i7) {
                    case 0:
                        MoreFunctionDialogFragment.a aVar = MoreFunctionDialogFragment.f30000C;
                        com.palmpay.lib.apm.launchcounter.util.d.D(0, "/credit_score/cl_record_activity", "tab");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 1:
                        MoreFunctionDialogFragment.a aVar2 = MoreFunctionDialogFragment.f30000C;
                        com.palmpay.lib.apm.launchcounter.util.d.D(1, "/credit_score/cl_record_activity", "tab");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 2:
                        MoreFunctionDialogFragment.a aVar3 = MoreFunctionDialogFragment.f30000C;
                        com.palmpay.lib.apm.launchcounter.util.d.x(null, "Coupon");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    default:
                        MoreFunctionDialogFragment.a aVar4 = MoreFunctionDialogFragment.f30000C;
                        Eb.a.n();
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                }
            }
        }, viewFindViewById3);
        Intrinsics.e(viewFindViewById);
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreFunctionDialogFragment f30166b;

            {
                this.f30166b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreFunctionDialogFragment moreFunctionDialogFragment = this.f30166b;
                switch (i10) {
                    case 0:
                        MoreFunctionDialogFragment.a aVar = MoreFunctionDialogFragment.f30000C;
                        com.palmpay.lib.apm.launchcounter.util.d.D(0, "/credit_score/cl_record_activity", "tab");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 1:
                        MoreFunctionDialogFragment.a aVar2 = MoreFunctionDialogFragment.f30000C;
                        com.palmpay.lib.apm.launchcounter.util.d.D(1, "/credit_score/cl_record_activity", "tab");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 2:
                        MoreFunctionDialogFragment.a aVar3 = MoreFunctionDialogFragment.f30000C;
                        com.palmpay.lib.apm.launchcounter.util.d.x(null, "Coupon");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    default:
                        MoreFunctionDialogFragment.a aVar4 = MoreFunctionDialogFragment.f30000C;
                        Eb.a.n();
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                }
            }
        }, viewFindViewById);
        Intrinsics.e(viewFindViewById2);
        final int i11 = 2;
        p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreFunctionDialogFragment f30166b;

            {
                this.f30166b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreFunctionDialogFragment moreFunctionDialogFragment = this.f30166b;
                switch (i11) {
                    case 0:
                        MoreFunctionDialogFragment.a aVar = MoreFunctionDialogFragment.f30000C;
                        com.palmpay.lib.apm.launchcounter.util.d.D(0, "/credit_score/cl_record_activity", "tab");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 1:
                        MoreFunctionDialogFragment.a aVar2 = MoreFunctionDialogFragment.f30000C;
                        com.palmpay.lib.apm.launchcounter.util.d.D(1, "/credit_score/cl_record_activity", "tab");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 2:
                        MoreFunctionDialogFragment.a aVar3 = MoreFunctionDialogFragment.f30000C;
                        com.palmpay.lib.apm.launchcounter.util.d.x(null, "Coupon");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    default:
                        MoreFunctionDialogFragment.a aVar4 = MoreFunctionDialogFragment.f30000C;
                        Eb.a.n();
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                }
            }
        }, viewFindViewById2);
        Intrinsics.e(viewFindViewById4);
        final int i12 = 3;
        p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreFunctionDialogFragment f30166b;

            {
                this.f30166b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreFunctionDialogFragment moreFunctionDialogFragment = this.f30166b;
                switch (i12) {
                    case 0:
                        MoreFunctionDialogFragment.a aVar = MoreFunctionDialogFragment.f30000C;
                        com.palmpay.lib.apm.launchcounter.util.d.D(0, "/credit_score/cl_record_activity", "tab");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 1:
                        MoreFunctionDialogFragment.a aVar2 = MoreFunctionDialogFragment.f30000C;
                        com.palmpay.lib.apm.launchcounter.util.d.D(1, "/credit_score/cl_record_activity", "tab");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 2:
                        MoreFunctionDialogFragment.a aVar3 = MoreFunctionDialogFragment.f30000C;
                        com.palmpay.lib.apm.launchcounter.util.d.x(null, "Coupon");
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    default:
                        MoreFunctionDialogFragment.a aVar4 = MoreFunctionDialogFragment.f30000C;
                        Eb.a.n();
                        moreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                }
            }
        }, viewFindViewById4);
        return baseDialog;
    }
}
