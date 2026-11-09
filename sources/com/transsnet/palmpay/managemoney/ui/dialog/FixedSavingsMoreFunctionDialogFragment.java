package com.transsnet.palmpay.managemoney.ui.dialog;

import Jc.c;
import Jc.d;
import O6.f;
import Pa.i0;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import com.horcrux.svg.d0;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.managemoney.ui.dialog.FixedSavingsMoreFunctionDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/FixedSavingsMoreFunctionDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FixedSavingsMoreFunctionDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f32296C = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FixedSavingsMoreFunctionDialogFragment newInstance() {
            return new FixedSavingsMoreFunctionDialogFragment();
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_fixed_savings_more_function_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = false;
        this.f31245o = false;
        this.f31239d = DensityUtil.dp2px(180.0f);
        this.f31246p = true;
        this.f31241f = false;
        this.f31236a = DensityUtil.dp2px(8.0f);
        this.f31237b = DensityUtil.dp2px(44.0f);
        this.f31242g = 8388661;
        this.f31243i = w.Animation_slide_in_right_top;
        View viewFindViewById = viewF.findViewById(c.tvCustomerService);
        View viewFindViewById2 = viewF.findViewById(c.tvFAQ);
        final int i7 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FixedSavingsMoreFunctionDialogFragment f6785b;

            {
                this.f6785b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FixedSavingsMoreFunctionDialogFragment fixedSavingsMoreFunctionDialogFragment = this.f6785b;
                switch (i7) {
                    case 0:
                        FixedSavingsMoreFunctionDialogFragment.a aVar = FixedSavingsMoreFunctionDialogFragment.f32296C;
                        i0.c0(com.transsnet.palmpay.core.config.d.b(GetCustomerServiceUrlReq.ENTER_TYPE_SAVING_V2));
                        fixedSavingsMoreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    default:
                        FixedSavingsMoreFunctionDialogFragment.a aVar2 = FixedSavingsMoreFunctionDialogFragment.f32296C;
                        i0.b0("/h5/faq/faqList?id=3");
                        fixedSavingsMoreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                }
            }
        });
        final int i10 = 1;
        viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FixedSavingsMoreFunctionDialogFragment f6785b;

            {
                this.f6785b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FixedSavingsMoreFunctionDialogFragment fixedSavingsMoreFunctionDialogFragment = this.f6785b;
                switch (i10) {
                    case 0:
                        FixedSavingsMoreFunctionDialogFragment.a aVar = FixedSavingsMoreFunctionDialogFragment.f32296C;
                        i0.c0(com.transsnet.palmpay.core.config.d.b(GetCustomerServiceUrlReq.ENTER_TYPE_SAVING_V2));
                        fixedSavingsMoreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                    default:
                        FixedSavingsMoreFunctionDialogFragment.a aVar2 = FixedSavingsMoreFunctionDialogFragment.f32296C;
                        i0.b0("/h5/faq/faqList?id=3");
                        fixedSavingsMoreFunctionDialogFragment.dismissAllowingStateLoss();
                        break;
                }
            }
        });
        return baseDialog;
    }
}
