package com.transsnet.palmpay.credit.ui.dialog;

import E.AbstractC0198c;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.credit.bean.resp.OcGoldCardLevelData;
import com.transsnet.palmpay.credit.bean.resp.OcRepaymentDate;
import com.transsnet.palmpay.util.ScreenUtils;
import com.wang.avi.AVLoadingIndicatorView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001d\u0010(\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u001d\u0010-\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010,R\u001d\u00100\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010,R\u001d\u00103\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u001b\u001a\u0004\b2\u0010,R\u001d\u00108\u001a\u0004\u0018\u0001048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u001b\u001a\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcGoldCardUpgradeConfirmDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/credit/bean/resp/OcRepaymentDate;", "selectedDate", "Lcom/transsnet/palmpay/credit/bean/resp/OcGoldCardLevelData;", "goldData", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/credit/bean/resp/OcRepaymentDate;Lcom/transsnet/palmpay/credit/bean/resp/OcGoldCardLevelData;)V", "", "setListener", "()V", "initViews", "Landroid/view/View$OnClickListener;", "agreeListener", "setAgreeBtListener", "(Landroid/view/View$OnClickListener;)V", "showConfirmStatus", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "Lcom/transsnet/palmpay/credit/bean/resp/OcRepaymentDate;", "Lcom/transsnet/palmpay/credit/bean/resp/OcGoldCardLevelData;", "Landroid/widget/Button;", "confirm_upgrade_bt$delegate", "Lkotlin/Lazy;", "getConfirm_upgrade_bt", "()Landroid/widget/Button;", "confirm_upgrade_bt", "Lcom/wang/avi/AVLoadingIndicatorView;", "confirm_loading_alv$delegate", "getConfirm_loading_alv", "()Lcom/wang/avi/AVLoadingIndicatorView;", "confirm_loading_alv", "Landroid/widget/LinearLayout;", "confirm_upgrade_ll$delegate", "getConfirm_upgrade_ll", "()Landroid/widget/LinearLayout;", "confirm_upgrade_ll", "Landroid/widget/TextView;", "next_change_date_tv$delegate", "getNext_change_date_tv", "()Landroid/widget/TextView;", "next_change_date_tv", "next_repayment_date_tv$delegate", "getNext_repayment_date_tv", "next_repayment_date_tv", "select_repayment_date_tv$delegate", "getSelect_repayment_date_tv", "select_repayment_date_tv", "Landroid/widget/ImageView;", "close_dialog_img$delegate", "getClose_dialog_img", "()Landroid/widget/ImageView;", "close_dialog_img", "mAgreeListener", "Landroid/view/View$OnClickListener;", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcGoldCardUpgradeConfirmDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: close_dialog_img$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy close_dialog_img;

    /* JADX INFO: renamed from: confirm_loading_alv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy confirm_loading_alv;

    /* JADX INFO: renamed from: confirm_upgrade_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy confirm_upgrade_bt;

    /* JADX INFO: renamed from: confirm_upgrade_ll$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy confirm_upgrade_ll;

    @Nullable
    private final OcGoldCardLevelData goldData;

    @Nullable
    private View.OnClickListener mAgreeListener;

    /* JADX INFO: renamed from: next_change_date_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy next_change_date_tv;

    /* JADX INFO: renamed from: next_repayment_date_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy next_repayment_date_tv;

    /* JADX INFO: renamed from: select_repayment_date_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy select_repayment_date_tv;

    @Nullable
    private final OcRepaymentDate selectedDate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcGoldCardUpgradeConfirmDialog(@NotNull Context context, @Nullable OcRepaymentDate ocRepaymentDate, @Nullable OcGoldCardLevelData ocGoldCardLevelData) {
        super(context, Ya.f.cs_oc_gold_card_upgrade_confirm_dialog_layout);
        Intrinsics.checkNotNullParameter(context, "context");
        this.selectedDate = ocRepaymentDate;
        this.goldData = ocGoldCardLevelData;
        final int i7 = 0;
        this.confirm_upgrade_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeConfirmDialog f30224b;

            {
                this.f30224b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OcGoldCardUpgradeConfirmDialog.confirm_upgrade_bt_delegate$lambda$0(this.f30224b);
                    case 1:
                        return OcGoldCardUpgradeConfirmDialog.confirm_loading_alv_delegate$lambda$1(this.f30224b);
                    case 2:
                        return OcGoldCardUpgradeConfirmDialog.confirm_upgrade_ll_delegate$lambda$2(this.f30224b);
                    case 3:
                        return OcGoldCardUpgradeConfirmDialog.next_change_date_tv_delegate$lambda$3(this.f30224b);
                    case 4:
                        return OcGoldCardUpgradeConfirmDialog.next_repayment_date_tv_delegate$lambda$4(this.f30224b);
                    case 5:
                        return OcGoldCardUpgradeConfirmDialog.select_repayment_date_tv_delegate$lambda$5(this.f30224b);
                    default:
                        return OcGoldCardUpgradeConfirmDialog.close_dialog_img_delegate$lambda$6(this.f30224b);
                }
            }
        });
        final int i10 = 1;
        this.confirm_loading_alv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeConfirmDialog f30224b;

            {
                this.f30224b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcGoldCardUpgradeConfirmDialog.confirm_upgrade_bt_delegate$lambda$0(this.f30224b);
                    case 1:
                        return OcGoldCardUpgradeConfirmDialog.confirm_loading_alv_delegate$lambda$1(this.f30224b);
                    case 2:
                        return OcGoldCardUpgradeConfirmDialog.confirm_upgrade_ll_delegate$lambda$2(this.f30224b);
                    case 3:
                        return OcGoldCardUpgradeConfirmDialog.next_change_date_tv_delegate$lambda$3(this.f30224b);
                    case 4:
                        return OcGoldCardUpgradeConfirmDialog.next_repayment_date_tv_delegate$lambda$4(this.f30224b);
                    case 5:
                        return OcGoldCardUpgradeConfirmDialog.select_repayment_date_tv_delegate$lambda$5(this.f30224b);
                    default:
                        return OcGoldCardUpgradeConfirmDialog.close_dialog_img_delegate$lambda$6(this.f30224b);
                }
            }
        });
        final int i11 = 2;
        this.confirm_upgrade_ll = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeConfirmDialog f30224b;

            {
                this.f30224b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return OcGoldCardUpgradeConfirmDialog.confirm_upgrade_bt_delegate$lambda$0(this.f30224b);
                    case 1:
                        return OcGoldCardUpgradeConfirmDialog.confirm_loading_alv_delegate$lambda$1(this.f30224b);
                    case 2:
                        return OcGoldCardUpgradeConfirmDialog.confirm_upgrade_ll_delegate$lambda$2(this.f30224b);
                    case 3:
                        return OcGoldCardUpgradeConfirmDialog.next_change_date_tv_delegate$lambda$3(this.f30224b);
                    case 4:
                        return OcGoldCardUpgradeConfirmDialog.next_repayment_date_tv_delegate$lambda$4(this.f30224b);
                    case 5:
                        return OcGoldCardUpgradeConfirmDialog.select_repayment_date_tv_delegate$lambda$5(this.f30224b);
                    default:
                        return OcGoldCardUpgradeConfirmDialog.close_dialog_img_delegate$lambda$6(this.f30224b);
                }
            }
        });
        final int i12 = 3;
        this.next_change_date_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeConfirmDialog f30224b;

            {
                this.f30224b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return OcGoldCardUpgradeConfirmDialog.confirm_upgrade_bt_delegate$lambda$0(this.f30224b);
                    case 1:
                        return OcGoldCardUpgradeConfirmDialog.confirm_loading_alv_delegate$lambda$1(this.f30224b);
                    case 2:
                        return OcGoldCardUpgradeConfirmDialog.confirm_upgrade_ll_delegate$lambda$2(this.f30224b);
                    case 3:
                        return OcGoldCardUpgradeConfirmDialog.next_change_date_tv_delegate$lambda$3(this.f30224b);
                    case 4:
                        return OcGoldCardUpgradeConfirmDialog.next_repayment_date_tv_delegate$lambda$4(this.f30224b);
                    case 5:
                        return OcGoldCardUpgradeConfirmDialog.select_repayment_date_tv_delegate$lambda$5(this.f30224b);
                    default:
                        return OcGoldCardUpgradeConfirmDialog.close_dialog_img_delegate$lambda$6(this.f30224b);
                }
            }
        });
        final int i13 = 4;
        this.next_repayment_date_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeConfirmDialog f30224b;

            {
                this.f30224b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return OcGoldCardUpgradeConfirmDialog.confirm_upgrade_bt_delegate$lambda$0(this.f30224b);
                    case 1:
                        return OcGoldCardUpgradeConfirmDialog.confirm_loading_alv_delegate$lambda$1(this.f30224b);
                    case 2:
                        return OcGoldCardUpgradeConfirmDialog.confirm_upgrade_ll_delegate$lambda$2(this.f30224b);
                    case 3:
                        return OcGoldCardUpgradeConfirmDialog.next_change_date_tv_delegate$lambda$3(this.f30224b);
                    case 4:
                        return OcGoldCardUpgradeConfirmDialog.next_repayment_date_tv_delegate$lambda$4(this.f30224b);
                    case 5:
                        return OcGoldCardUpgradeConfirmDialog.select_repayment_date_tv_delegate$lambda$5(this.f30224b);
                    default:
                        return OcGoldCardUpgradeConfirmDialog.close_dialog_img_delegate$lambda$6(this.f30224b);
                }
            }
        });
        final int i14 = 5;
        this.select_repayment_date_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeConfirmDialog f30224b;

            {
                this.f30224b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return OcGoldCardUpgradeConfirmDialog.confirm_upgrade_bt_delegate$lambda$0(this.f30224b);
                    case 1:
                        return OcGoldCardUpgradeConfirmDialog.confirm_loading_alv_delegate$lambda$1(this.f30224b);
                    case 2:
                        return OcGoldCardUpgradeConfirmDialog.confirm_upgrade_ll_delegate$lambda$2(this.f30224b);
                    case 3:
                        return OcGoldCardUpgradeConfirmDialog.next_change_date_tv_delegate$lambda$3(this.f30224b);
                    case 4:
                        return OcGoldCardUpgradeConfirmDialog.next_repayment_date_tv_delegate$lambda$4(this.f30224b);
                    case 5:
                        return OcGoldCardUpgradeConfirmDialog.select_repayment_date_tv_delegate$lambda$5(this.f30224b);
                    default:
                        return OcGoldCardUpgradeConfirmDialog.close_dialog_img_delegate$lambda$6(this.f30224b);
                }
            }
        });
        final int i15 = 6;
        this.close_dialog_img = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeConfirmDialog f30224b;

            {
                this.f30224b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return OcGoldCardUpgradeConfirmDialog.confirm_upgrade_bt_delegate$lambda$0(this.f30224b);
                    case 1:
                        return OcGoldCardUpgradeConfirmDialog.confirm_loading_alv_delegate$lambda$1(this.f30224b);
                    case 2:
                        return OcGoldCardUpgradeConfirmDialog.confirm_upgrade_ll_delegate$lambda$2(this.f30224b);
                    case 3:
                        return OcGoldCardUpgradeConfirmDialog.next_change_date_tv_delegate$lambda$3(this.f30224b);
                    case 4:
                        return OcGoldCardUpgradeConfirmDialog.next_repayment_date_tv_delegate$lambda$4(this.f30224b);
                    case 5:
                        return OcGoldCardUpgradeConfirmDialog.select_repayment_date_tv_delegate$lambda$5(this.f30224b);
                    default:
                        return OcGoldCardUpgradeConfirmDialog.close_dialog_img_delegate$lambda$6(this.f30224b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView close_dialog_img_delegate$lambda$6(OcGoldCardUpgradeConfirmDialog ocGoldCardUpgradeConfirmDialog) {
        return (ImageView) ocGoldCardUpgradeConfirmDialog.findViewById(Ya.e.close_dialog_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AVLoadingIndicatorView confirm_loading_alv_delegate$lambda$1(OcGoldCardUpgradeConfirmDialog ocGoldCardUpgradeConfirmDialog) {
        return (AVLoadingIndicatorView) ocGoldCardUpgradeConfirmDialog.findViewById(Ya.e.confirm_loading_alv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button confirm_upgrade_bt_delegate$lambda$0(OcGoldCardUpgradeConfirmDialog ocGoldCardUpgradeConfirmDialog) {
        return (Button) ocGoldCardUpgradeConfirmDialog.findViewById(Ya.e.confirm_upgrade_bt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout confirm_upgrade_ll_delegate$lambda$2(OcGoldCardUpgradeConfirmDialog ocGoldCardUpgradeConfirmDialog) {
        return (LinearLayout) ocGoldCardUpgradeConfirmDialog.findViewById(Ya.e.confirm_upgrade_ll);
    }

    private final ImageView getClose_dialog_img() {
        return (ImageView) this.close_dialog_img.getValue();
    }

    private final AVLoadingIndicatorView getConfirm_loading_alv() {
        return (AVLoadingIndicatorView) this.confirm_loading_alv.getValue();
    }

    private final Button getConfirm_upgrade_bt() {
        return (Button) this.confirm_upgrade_bt.getValue();
    }

    private final LinearLayout getConfirm_upgrade_ll() {
        return (LinearLayout) this.confirm_upgrade_ll.getValue();
    }

    private final TextView getNext_change_date_tv() {
        return (TextView) this.next_change_date_tv.getValue();
    }

    private final TextView getNext_repayment_date_tv() {
        return (TextView) this.next_repayment_date_tv.getValue();
    }

    private final TextView getSelect_repayment_date_tv() {
        return (TextView) this.select_repayment_date_tv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView next_change_date_tv_delegate$lambda$3(OcGoldCardUpgradeConfirmDialog ocGoldCardUpgradeConfirmDialog) {
        return (TextView) ocGoldCardUpgradeConfirmDialog.findViewById(Ya.e.next_change_date_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView next_repayment_date_tv_delegate$lambda$4(OcGoldCardUpgradeConfirmDialog ocGoldCardUpgradeConfirmDialog) {
        return (TextView) ocGoldCardUpgradeConfirmDialog.findViewById(Ya.e.next_repayment_date_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView select_repayment_date_tv_delegate$lambda$5(OcGoldCardUpgradeConfirmDialog ocGoldCardUpgradeConfirmDialog) {
        return (TextView) ocGoldCardUpgradeConfirmDialog.findViewById(Ya.e.select_repayment_date_tv);
    }

    private final void setListener() {
        ImageView close_dialog_img = getClose_dialog_img();
        if (close_dialog_img != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.x0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcGoldCardUpgradeConfirmDialog f30220b;

                {
                    this.f30220b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30220b.dismiss();
                            break;
                        default:
                            OcGoldCardUpgradeConfirmDialog.setListener$lambda$9(this.f30220b, view);
                            break;
                    }
                }
            }, close_dialog_img);
        }
        LinearLayout confirm_upgrade_ll = getConfirm_upgrade_ll();
        if (confirm_upgrade_ll != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.x0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcGoldCardUpgradeConfirmDialog f30220b;

                {
                    this.f30220b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30220b.dismiss();
                            break;
                        default:
                            OcGoldCardUpgradeConfirmDialog.setListener$lambda$9(this.f30220b, view);
                            break;
                    }
                }
            }, confirm_upgrade_ll);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$9(OcGoldCardUpgradeConfirmDialog ocGoldCardUpgradeConfirmDialog, View view) {
        View.OnClickListener onClickListener = ocGoldCardUpgradeConfirmDialog.mAgreeListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        AVLoadingIndicatorView confirm_loading_alv = ocGoldCardUpgradeConfirmDialog.getConfirm_loading_alv();
        if (confirm_loading_alv != null) {
            confirm_loading_alv.setVisibility(0);
        }
        Button confirm_upgrade_bt = ocGoldCardUpgradeConfirmDialog.getConfirm_upgrade_bt();
        if (confirm_upgrade_bt != null) {
            confirm_upgrade_bt.setText(ocGoldCardUpgradeConfirmDialog.getContext().getString(Ya.g.cs_oc_upgrading));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Long nextBillDateStamp;
        Long currentBillDateStamp;
        Integer day;
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth();
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        setCancelable(false);
        TextView select_repayment_date_tv = getSelect_repayment_date_tv();
        if (select_repayment_date_tv != null) {
            OcRepaymentDate ocRepaymentDate = this.selectedDate;
            select_repayment_date_tv.setText(AbstractC0198c.C((ocRepaymentDate == null || (day = ocRepaymentDate.getDay()) == null) ? 1 : day.intValue()));
        }
        TextView next_repayment_date_tv = getNext_repayment_date_tv();
        long jLongValue = 0;
        if (next_repayment_date_tv != null) {
            Context context = this.mContext;
            int i7 = Ya.g.cs_oc_recent_repayment_date;
            OcGoldCardLevelData ocGoldCardLevelData = this.goldData;
            next_repayment_date_tv.setText(context.getString(i7, Pa.r0.X1(Long.valueOf((ocGoldCardLevelData == null || (currentBillDateStamp = ocGoldCardLevelData.getCurrentBillDateStamp()) == null) ? 0L : currentBillDateStamp.longValue()), "MMM dd")));
        }
        TextView next_change_date_tv = getNext_change_date_tv();
        if (next_change_date_tv != null) {
            Context context2 = this.mContext;
            int i10 = Ya.g.cs_oc_next_repayment_date;
            OcRepaymentDate ocRepaymentDate2 = this.selectedDate;
            if (ocRepaymentDate2 != null && (nextBillDateStamp = ocRepaymentDate2.getNextBillDateStamp()) != null) {
                jLongValue = nextBillDateStamp.longValue();
            }
            next_change_date_tv.setText(context2.getString(i10, Pa.r0.X1(Long.valueOf(jLongValue), "MMM dd, yyyy")));
        }
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

    public final void setAgreeBtListener(@Nullable View.OnClickListener agreeListener) {
        this.mAgreeListener = agreeListener;
    }

    public final void showConfirmStatus() {
        AVLoadingIndicatorView confirm_loading_alv = getConfirm_loading_alv();
        if (confirm_loading_alv != null) {
            confirm_loading_alv.setVisibility(8);
        }
        Button confirm_upgrade_bt = getConfirm_upgrade_bt();
        if (confirm_upgrade_bt != null) {
            confirm_upgrade_bt.setText(getContext().getString(p025ba.k.core_confirm));
        }
    }
}
