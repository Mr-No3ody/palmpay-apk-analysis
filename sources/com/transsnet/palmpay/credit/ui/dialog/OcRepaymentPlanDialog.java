package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.credit.bean.resp.SpreadInfoDto;
import com.transsnet.palmpay.credit.bean.resp.SpreadRepaymentPlan;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u001d\u0010$\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010 R\u001d\u0010'\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010 R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcRepaymentPlanDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/credit/bean/resp/SpreadInfoDto;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/credit/bean/resp/SpreadInfoDto;)V", "", "initView", "()V", "setListener", "initViews", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "Lcom/transsnet/palmpay/credit/bean/resp/SpreadInfoDto;", "Landroid/widget/Button;", "confirm_bt$delegate", "Lkotlin/Lazy;", "getConfirm_bt", "()Landroid/widget/Button;", "confirm_bt", "Landroidx/recyclerview/widget/RecyclerView;", "repayment_plan_rv$delegate", "getRepayment_plan_rv", "()Landroidx/recyclerview/widget/RecyclerView;", "repayment_plan_rv", "Landroid/widget/TextView;", "total_interest_tv$delegate", "getTotal_interest_tv", "()Landroid/widget/TextView;", "total_interest_tv", "borrow_amount_tv$delegate", "getBorrow_amount_tv", "borrow_amount_tv", "total_amount_tv$delegate", "getTotal_amount_tv", "total_amount_tv", "Lyb/a0;", "mAdapter", "Lyb/a0;", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRepaymentPlanDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: borrow_amount_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy borrow_amount_tv;

    /* JADX INFO: renamed from: confirm_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy confirm_bt;

    @NotNull
    private final SpreadInfoDto data;

    @Nullable
    private p368yb.a0 mAdapter;

    /* JADX INFO: renamed from: repayment_plan_rv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy repayment_plan_rv;

    /* JADX INFO: renamed from: total_amount_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy total_amount_tv;

    /* JADX INFO: renamed from: total_interest_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy total_interest_tv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcRepaymentPlanDialog(@NotNull Context context, @NotNull SpreadInfoDto data) {
        super(context, Ya.f.cs_oc_repayment_plan_dialog_layout);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        final int i7 = 0;
        this.confirm_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.O0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepaymentPlanDialog f30008b;

            {
                this.f30008b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OcRepaymentPlanDialog.confirm_bt_delegate$lambda$0(this.f30008b);
                    case 1:
                        return OcRepaymentPlanDialog.repayment_plan_rv_delegate$lambda$1(this.f30008b);
                    case 2:
                        return OcRepaymentPlanDialog.total_interest_tv_delegate$lambda$2(this.f30008b);
                    case 3:
                        return OcRepaymentPlanDialog.borrow_amount_tv_delegate$lambda$3(this.f30008b);
                    default:
                        return OcRepaymentPlanDialog.total_amount_tv_delegate$lambda$4(this.f30008b);
                }
            }
        });
        final int i10 = 1;
        this.repayment_plan_rv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.O0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepaymentPlanDialog f30008b;

            {
                this.f30008b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcRepaymentPlanDialog.confirm_bt_delegate$lambda$0(this.f30008b);
                    case 1:
                        return OcRepaymentPlanDialog.repayment_plan_rv_delegate$lambda$1(this.f30008b);
                    case 2:
                        return OcRepaymentPlanDialog.total_interest_tv_delegate$lambda$2(this.f30008b);
                    case 3:
                        return OcRepaymentPlanDialog.borrow_amount_tv_delegate$lambda$3(this.f30008b);
                    default:
                        return OcRepaymentPlanDialog.total_amount_tv_delegate$lambda$4(this.f30008b);
                }
            }
        });
        final int i11 = 2;
        this.total_interest_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.O0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepaymentPlanDialog f30008b;

            {
                this.f30008b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return OcRepaymentPlanDialog.confirm_bt_delegate$lambda$0(this.f30008b);
                    case 1:
                        return OcRepaymentPlanDialog.repayment_plan_rv_delegate$lambda$1(this.f30008b);
                    case 2:
                        return OcRepaymentPlanDialog.total_interest_tv_delegate$lambda$2(this.f30008b);
                    case 3:
                        return OcRepaymentPlanDialog.borrow_amount_tv_delegate$lambda$3(this.f30008b);
                    default:
                        return OcRepaymentPlanDialog.total_amount_tv_delegate$lambda$4(this.f30008b);
                }
            }
        });
        final int i12 = 3;
        this.borrow_amount_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.O0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepaymentPlanDialog f30008b;

            {
                this.f30008b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return OcRepaymentPlanDialog.confirm_bt_delegate$lambda$0(this.f30008b);
                    case 1:
                        return OcRepaymentPlanDialog.repayment_plan_rv_delegate$lambda$1(this.f30008b);
                    case 2:
                        return OcRepaymentPlanDialog.total_interest_tv_delegate$lambda$2(this.f30008b);
                    case 3:
                        return OcRepaymentPlanDialog.borrow_amount_tv_delegate$lambda$3(this.f30008b);
                    default:
                        return OcRepaymentPlanDialog.total_amount_tv_delegate$lambda$4(this.f30008b);
                }
            }
        });
        final int i13 = 4;
        this.total_amount_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.O0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepaymentPlanDialog f30008b;

            {
                this.f30008b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return OcRepaymentPlanDialog.confirm_bt_delegate$lambda$0(this.f30008b);
                    case 1:
                        return OcRepaymentPlanDialog.repayment_plan_rv_delegate$lambda$1(this.f30008b);
                    case 2:
                        return OcRepaymentPlanDialog.total_interest_tv_delegate$lambda$2(this.f30008b);
                    case 3:
                        return OcRepaymentPlanDialog.borrow_amount_tv_delegate$lambda$3(this.f30008b);
                    default:
                        return OcRepaymentPlanDialog.total_amount_tv_delegate$lambda$4(this.f30008b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView borrow_amount_tv_delegate$lambda$3(OcRepaymentPlanDialog ocRepaymentPlanDialog) {
        return (TextView) ocRepaymentPlanDialog.findViewById(Ya.e.borrow_amount_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button confirm_bt_delegate$lambda$0(OcRepaymentPlanDialog ocRepaymentPlanDialog) {
        return (Button) ocRepaymentPlanDialog.findViewById(Ya.e.confirm_bt);
    }

    private final TextView getBorrow_amount_tv() {
        return (TextView) this.borrow_amount_tv.getValue();
    }

    private final Button getConfirm_bt() {
        return (Button) this.confirm_bt.getValue();
    }

    private final RecyclerView getRepayment_plan_rv() {
        return (RecyclerView) this.repayment_plan_rv.getValue();
    }

    private final TextView getTotal_amount_tv() {
        return (TextView) this.total_amount_tv.getValue();
    }

    private final TextView getTotal_interest_tv() {
        return (TextView) this.total_interest_tv.getValue();
    }

    private final void initView() {
        TextView total_amount_tv = getTotal_amount_tv();
        if (total_amount_tv != null) {
            Long spreadPrincipal = this.data.getSpreadPrincipal();
            total_amount_tv.setText(Pa.r0.B(spreadPrincipal != null ? spreadPrincipal.longValue() : 0L, true));
        }
        TextView borrow_amount_tv = getBorrow_amount_tv();
        if (borrow_amount_tv != null) {
            Context context = this.mContext;
            int i7 = Ya.g.cs_oc_pay_in;
            Integer id2 = this.data.getId();
            borrow_amount_tv.setText(context.getString(i7, Integer.valueOf(id2 != null ? id2.intValue() : 0)));
        }
        TextView total_interest_tv = getTotal_interest_tv();
        if (total_interest_tv != null) {
            Long spreadServiceFee = this.data.getSpreadServiceFee();
            total_interest_tv.setText(Pa.r0.B(spreadServiceFee != null ? spreadServiceFee.longValue() : 0L, true));
        }
        List<SpreadRepaymentPlan> spreadRepaymentPlanList = this.data.getSpreadRepaymentPlanList();
        if (spreadRepaymentPlanList == null || spreadRepaymentPlanList.isEmpty()) {
            return;
        }
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        List<SpreadRepaymentPlan> spreadRepaymentPlanList2 = this.data.getSpreadRepaymentPlanList();
        Intrinsics.e(spreadRepaymentPlanList2);
        this.mAdapter = new p368yb.a0(mContext, spreadRepaymentPlanList2);
        RecyclerView repayment_plan_rv = getRepayment_plan_rv();
        if (repayment_plan_rv != null) {
            repayment_plan_rv.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        }
        RecyclerView repayment_plan_rv2 = getRepayment_plan_rv();
        if (repayment_plan_rv2 != null) {
            repayment_plan_rv2.setAdapter(this.mAdapter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView repayment_plan_rv_delegate$lambda$1(OcRepaymentPlanDialog ocRepaymentPlanDialog) {
        return (RecyclerView) ocRepaymentPlanDialog.findViewById(Ya.e.repayment_plan_rv);
    }

    private final void setListener() {
        Button confirm_bt = getConfirm_bt();
        if (confirm_bt != null) {
            p220oa.h.l(new ViewOnClickListenerC1533v(this, 12), confirm_bt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView total_amount_tv_delegate$lambda$4(OcRepaymentPlanDialog ocRepaymentPlanDialog) {
        return (TextView) ocRepaymentPlanDialog.findViewById(Ya.e.total_amount_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView total_interest_tv_delegate$lambda$2(OcRepaymentPlanDialog ocRepaymentPlanDialog) {
        return (TextView) ocRepaymentPlanDialog.findViewById(Ya.e.total_interest_tv);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth();
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        initView();
        setListener();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        View decorView3;
        super.onWindowFocusChanged(hasFocus);
        if (!hasFocus || getWindow() == null) {
            return;
        }
        Window window3 = getWindow();
        if (((window3 == null || (decorView3 = window3.getDecorView()) == null || decorView3.getHeight() != 0) && ((window = getWindow()) == null || (decorView = window.getDecorView()) == null || decorView.getWidth() != 0)) || (window2 = getWindow()) == null || (decorView2 = window2.getDecorView()) == null) {
            return;
        }
        decorView2.requestLayout();
    }
}
