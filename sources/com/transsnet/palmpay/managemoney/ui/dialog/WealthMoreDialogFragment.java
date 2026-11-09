package com.transsnet.palmpay.managemoney.ui.dialog;

import Jc.c;
import Jc.d;
import O6.f;
import Pa.i0;
import Pa.n0;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.managemoney.ui.dialog.WealthMoreDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/wealth_more_dialog")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/WealthMoreDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WealthMoreDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f32328C = 0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WealthMoreDialogFragment newInstance() {
            return new WealthMoreDialogFragment();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_wealth_more_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = false;
        this.f31245o = false;
        this.f31239d = DensityUtil.dp2px(180.0f);
        this.f31246p = true;
        this.f31241f = false;
        this.f31236a = DensityUtil.dp2px(8.0f);
        this.f31237b = DensityUtil.dp2px(36.0f);
        this.f31242g = 8388661;
        this.f31243i = w.Animation_slide_in_right_top;
        ARouter.getInstance().inject(this);
        View viewFindViewById = viewF.findViewById(c.tvReport);
        View viewFindViewById2 = viewF.findViewById(c.tvSetting);
        if (viewFindViewById != null) {
            final int i7 = 0;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.y

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WealthMoreDialogFragment f6801b;

                {
                    this.f6801b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WealthMoreDialogFragment wealthMoreDialogFragment = this.f6801b;
                    switch (i7) {
                        case 0:
                            int i10 = WealthMoreDialogFragment.f32328C;
                            n0.g().l("FinanceTab_EarningsReport_Click");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceReport");
                            wealthMoreDialogFragment.dismissAllowingStateLoss();
                            break;
                        default:
                            int i11 = WealthMoreDialogFragment.f32328C;
                            n0.g().l("FinanceTab_InterestSet_Click");
                            i0.b0("/cashbox/interest-setting");
                            wealthMoreDialogFragment.dismissAllowingStateLoss();
                            break;
                    }
                }
            });
        }
        if (viewFindViewById2 != null) {
            final int i10 = 1;
            viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.y

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WealthMoreDialogFragment f6801b;

                {
                    this.f6801b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WealthMoreDialogFragment wealthMoreDialogFragment = this.f6801b;
                    switch (i10) {
                        case 0:
                            int i11 = WealthMoreDialogFragment.f32328C;
                            n0.g().l("FinanceTab_EarningsReport_Click");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceReport");
                            wealthMoreDialogFragment.dismissAllowingStateLoss();
                            break;
                        default:
                            int i12 = WealthMoreDialogFragment.f32328C;
                            n0.g().l("FinanceTab_InterestSet_Click");
                            i0.b0("/cashbox/interest-setting");
                            wealthMoreDialogFragment.dismissAllowingStateLoss();
                            break;
                    }
                }
            });
        }
        return baseDialog;
    }
}
