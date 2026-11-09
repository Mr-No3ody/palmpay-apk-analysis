package com.transsnet.palmpay.core.ui.dialog;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.ui.dialog.OcSwitchRouterDialog;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.r;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.d;
import p025ba.e;
import p025ba.g;
import p025ba.k;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 /2\u00020\u0001:\u00010B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R#\u0010\u0018\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u001d\u001a\n \u0013*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR#\u0010\"\u001a\n \u0013*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R#\u0010'\u001a\n \u0013*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010&R#\u0010*\u001a\n \u0013*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b)\u0010&R#\u0010-\u001a\n \u0013*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0015\u001a\u0004\b,\u0010!R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0011¨\u00061"}, d2 = {"Lcom/transsnet/palmpay/core/ui/dialog/OcSwitchRouterDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/app/Activity;", "mActivity", "", "switchType", "businessType", "<init>", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "", "setListener", "()V", "jump2Bvn", "jump2BankCard", "jump2BankAccount", "initViews", "Landroid/app/Activity;", "Ljava/lang/String;", "Landroid/widget/Button;", "kotlin.jvm.PlatformType", "confirm_bt$delegate", "Lkotlin/Lazy;", "getConfirm_bt", "()Landroid/widget/Button;", "confirm_bt", "Landroid/widget/TextView;", "account_tv$delegate", "getAccount_tv", "()Landroid/widget/TextView;", "account_tv", "Landroid/widget/ImageView;", "account_img$delegate", "getAccount_img", "()Landroid/widget/ImageView;", "account_img", "Landroid/widget/LinearLayout;", "bank_account_ll$delegate", "getBank_account_ll", "()Landroid/widget/LinearLayout;", "bank_account_ll", "bvn_ll$delegate", "getBvn_ll", "bvn_ll", "ivClose$delegate", "getIvClose", "ivClose", "mSelectedTarget", "Companion", "a", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcSwitchRouterDialog extends b {

    @NotNull
    public static final String SWITCH_BANK_ACCOUNT = "switch_source_bank_account";

    @NotNull
    public static final String SWITCH_BANK_CARD = "switch_source_bank_card";

    @NotNull
    public static final String SWITCH_BVN = "switch_source_bvn";

    /* JADX INFO: renamed from: account_img$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy account_img;

    /* JADX INFO: renamed from: account_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy account_tv;

    /* JADX INFO: renamed from: bank_account_ll$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bank_account_ll;

    @Nullable
    private final String businessType;

    /* JADX INFO: renamed from: bvn_ll$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bvn_ll;

    /* JADX INFO: renamed from: confirm_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy confirm_bt;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @NotNull
    private final Activity mActivity;

    @NotNull
    private String mSelectedTarget;

    @NotNull
    private final String switchType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcSwitchRouterDialog(@NotNull Activity mActivity, @NotNull String switchType, @Nullable String str) {
        super(mActivity, g.core_oc_switch_arouter_dialog_layout);
        Intrinsics.checkNotNullParameter(mActivity, "mActivity");
        Intrinsics.checkNotNullParameter(switchType, "switchType");
        this.mActivity = mActivity;
        this.switchType = switchType;
        this.businessType = str;
        final int i7 = 0;
        this.confirm_bt = C2131j.b(new Function0(this) { // from class: Ha.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSwitchRouterDialog f3781b;

            {
                this.f3781b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OcSwitchRouterDialog.confirm_bt_delegate$lambda$0(this.f3781b);
                    case 1:
                        return OcSwitchRouterDialog.account_tv_delegate$lambda$1(this.f3781b);
                    case 2:
                        return OcSwitchRouterDialog.account_img_delegate$lambda$2(this.f3781b);
                    case 3:
                        return OcSwitchRouterDialog.bank_account_ll_delegate$lambda$3(this.f3781b);
                    case 4:
                        return OcSwitchRouterDialog.bvn_ll_delegate$lambda$4(this.f3781b);
                    default:
                        return OcSwitchRouterDialog.ivClose_delegate$lambda$5(this.f3781b);
                }
            }
        });
        final int i10 = 1;
        this.account_tv = C2131j.b(new Function0(this) { // from class: Ha.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSwitchRouterDialog f3781b;

            {
                this.f3781b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcSwitchRouterDialog.confirm_bt_delegate$lambda$0(this.f3781b);
                    case 1:
                        return OcSwitchRouterDialog.account_tv_delegate$lambda$1(this.f3781b);
                    case 2:
                        return OcSwitchRouterDialog.account_img_delegate$lambda$2(this.f3781b);
                    case 3:
                        return OcSwitchRouterDialog.bank_account_ll_delegate$lambda$3(this.f3781b);
                    case 4:
                        return OcSwitchRouterDialog.bvn_ll_delegate$lambda$4(this.f3781b);
                    default:
                        return OcSwitchRouterDialog.ivClose_delegate$lambda$5(this.f3781b);
                }
            }
        });
        final int i11 = 2;
        this.account_img = C2131j.b(new Function0(this) { // from class: Ha.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSwitchRouterDialog f3781b;

            {
                this.f3781b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return OcSwitchRouterDialog.confirm_bt_delegate$lambda$0(this.f3781b);
                    case 1:
                        return OcSwitchRouterDialog.account_tv_delegate$lambda$1(this.f3781b);
                    case 2:
                        return OcSwitchRouterDialog.account_img_delegate$lambda$2(this.f3781b);
                    case 3:
                        return OcSwitchRouterDialog.bank_account_ll_delegate$lambda$3(this.f3781b);
                    case 4:
                        return OcSwitchRouterDialog.bvn_ll_delegate$lambda$4(this.f3781b);
                    default:
                        return OcSwitchRouterDialog.ivClose_delegate$lambda$5(this.f3781b);
                }
            }
        });
        final int i12 = 3;
        this.bank_account_ll = C2131j.b(new Function0(this) { // from class: Ha.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSwitchRouterDialog f3781b;

            {
                this.f3781b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return OcSwitchRouterDialog.confirm_bt_delegate$lambda$0(this.f3781b);
                    case 1:
                        return OcSwitchRouterDialog.account_tv_delegate$lambda$1(this.f3781b);
                    case 2:
                        return OcSwitchRouterDialog.account_img_delegate$lambda$2(this.f3781b);
                    case 3:
                        return OcSwitchRouterDialog.bank_account_ll_delegate$lambda$3(this.f3781b);
                    case 4:
                        return OcSwitchRouterDialog.bvn_ll_delegate$lambda$4(this.f3781b);
                    default:
                        return OcSwitchRouterDialog.ivClose_delegate$lambda$5(this.f3781b);
                }
            }
        });
        final int i13 = 4;
        this.bvn_ll = C2131j.b(new Function0(this) { // from class: Ha.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSwitchRouterDialog f3781b;

            {
                this.f3781b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return OcSwitchRouterDialog.confirm_bt_delegate$lambda$0(this.f3781b);
                    case 1:
                        return OcSwitchRouterDialog.account_tv_delegate$lambda$1(this.f3781b);
                    case 2:
                        return OcSwitchRouterDialog.account_img_delegate$lambda$2(this.f3781b);
                    case 3:
                        return OcSwitchRouterDialog.bank_account_ll_delegate$lambda$3(this.f3781b);
                    case 4:
                        return OcSwitchRouterDialog.bvn_ll_delegate$lambda$4(this.f3781b);
                    default:
                        return OcSwitchRouterDialog.ivClose_delegate$lambda$5(this.f3781b);
                }
            }
        });
        final int i14 = 5;
        this.ivClose = C2131j.b(new Function0(this) { // from class: Ha.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSwitchRouterDialog f3781b;

            {
                this.f3781b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return OcSwitchRouterDialog.confirm_bt_delegate$lambda$0(this.f3781b);
                    case 1:
                        return OcSwitchRouterDialog.account_tv_delegate$lambda$1(this.f3781b);
                    case 2:
                        return OcSwitchRouterDialog.account_img_delegate$lambda$2(this.f3781b);
                    case 3:
                        return OcSwitchRouterDialog.bank_account_ll_delegate$lambda$3(this.f3781b);
                    case 4:
                        return OcSwitchRouterDialog.bvn_ll_delegate$lambda$4(this.f3781b);
                    default:
                        return OcSwitchRouterDialog.ivClose_delegate$lambda$5(this.f3781b);
                }
            }
        });
        this.mSelectedTarget = SWITCH_BVN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView account_img_delegate$lambda$2(OcSwitchRouterDialog ocSwitchRouterDialog) {
        return (ImageView) ocSwitchRouterDialog.findViewById(e.account_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView account_tv_delegate$lambda$1(OcSwitchRouterDialog ocSwitchRouterDialog) {
        return (TextView) ocSwitchRouterDialog.findViewById(e.account_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout bank_account_ll_delegate$lambda$3(OcSwitchRouterDialog ocSwitchRouterDialog) {
        return (LinearLayout) ocSwitchRouterDialog.findViewById(e.bank_account_ll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout bvn_ll_delegate$lambda$4(OcSwitchRouterDialog ocSwitchRouterDialog) {
        return (LinearLayout) ocSwitchRouterDialog.findViewById(e.bvn_ll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button confirm_bt_delegate$lambda$0(OcSwitchRouterDialog ocSwitchRouterDialog) {
        return (Button) ocSwitchRouterDialog.findViewById(e.confirm_bt);
    }

    private final ImageView getAccount_img() {
        return (ImageView) this.account_img.getValue();
    }

    private final TextView getAccount_tv() {
        return (TextView) this.account_tv.getValue();
    }

    private final LinearLayout getBank_account_ll() {
        return (LinearLayout) this.bank_account_ll.getValue();
    }

    private final LinearLayout getBvn_ll() {
        return (LinearLayout) this.bvn_ll.getValue();
    }

    private final Button getConfirm_bt() {
        return (Button) this.confirm_bt.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$5(OcSwitchRouterDialog ocSwitchRouterDialog) {
        return (ImageView) ocSwitchRouterDialog.findViewById(e.ivClose);
    }

    private final void jump2BankAccount() {
        ARouter.getInstance().build("/coreImpl/bind_new_bank_account").withString("businessType", this.businessType).navigation();
    }

    private final void jump2BankCard() {
        ARouter.getInstance().build("/coreImpl/use_new_card").withString("businessType", this.businessType).navigation();
    }

    private final void jump2Bvn() {
        ARouter.getInstance().build("/account/upgrade").withString("businessType", this.businessType).navigation();
    }

    private final void setListener() {
        final int i7 = 0;
        getIvClose().setOnClickListener(new View.OnClickListener(this) { // from class: Ha.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSwitchRouterDialog f3779b;

            {
                this.f3779b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f3779b.dismiss();
                        break;
                    case 1:
                        OcSwitchRouterDialog.setListener$lambda$7(this.f3779b, view);
                        break;
                    case 2:
                        OcSwitchRouterDialog.setListener$lambda$8(this.f3779b, view);
                        break;
                    default:
                        OcSwitchRouterDialog.setListener$lambda$9(this.f3779b, view);
                        break;
                }
            }
        });
        final int i10 = 1;
        getBvn_ll().setOnClickListener(new View.OnClickListener(this) { // from class: Ha.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSwitchRouterDialog f3779b;

            {
                this.f3779b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f3779b.dismiss();
                        break;
                    case 1:
                        OcSwitchRouterDialog.setListener$lambda$7(this.f3779b, view);
                        break;
                    case 2:
                        OcSwitchRouterDialog.setListener$lambda$8(this.f3779b, view);
                        break;
                    default:
                        OcSwitchRouterDialog.setListener$lambda$9(this.f3779b, view);
                        break;
                }
            }
        });
        final int i11 = 2;
        getBank_account_ll().setOnClickListener(new View.OnClickListener(this) { // from class: Ha.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSwitchRouterDialog f3779b;

            {
                this.f3779b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f3779b.dismiss();
                        break;
                    case 1:
                        OcSwitchRouterDialog.setListener$lambda$7(this.f3779b, view);
                        break;
                    case 2:
                        OcSwitchRouterDialog.setListener$lambda$8(this.f3779b, view);
                        break;
                    default:
                        OcSwitchRouterDialog.setListener$lambda$9(this.f3779b, view);
                        break;
                }
            }
        });
        final int i12 = 3;
        getConfirm_bt().setOnClickListener(new View.OnClickListener(this) { // from class: Ha.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSwitchRouterDialog f3779b;

            {
                this.f3779b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f3779b.dismiss();
                        break;
                    case 1:
                        OcSwitchRouterDialog.setListener$lambda$7(this.f3779b, view);
                        break;
                    case 2:
                        OcSwitchRouterDialog.setListener$lambda$8(this.f3779b, view);
                        break;
                    default:
                        OcSwitchRouterDialog.setListener$lambda$9(this.f3779b, view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$7(OcSwitchRouterDialog ocSwitchRouterDialog, View view) {
        ocSwitchRouterDialog.mSelectedTarget = SWITCH_BVN;
        ocSwitchRouterDialog.getBvn_ll().setBackgroundResource(d.core_oc_router_switch_selected_bg);
        ocSwitchRouterDialog.getBank_account_ll().setBackgroundResource(r.cv_shape_rect_corner_12_bg_dark);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$8(OcSwitchRouterDialog ocSwitchRouterDialog, View view) {
        String str = ocSwitchRouterDialog.switchType;
        String str2 = SWITCH_BANK_CARD;
        if (!Intrinsics.c(str, SWITCH_BANK_CARD)) {
            str2 = SWITCH_BANK_ACCOUNT;
        }
        ocSwitchRouterDialog.mSelectedTarget = str2;
        ocSwitchRouterDialog.getBvn_ll().setBackgroundResource(r.cv_shape_rect_corner_12_bg_dark);
        ocSwitchRouterDialog.getBank_account_ll().setBackgroundResource(d.core_oc_router_switch_selected_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$9(OcSwitchRouterDialog ocSwitchRouterDialog, View view) {
        String str = ocSwitchRouterDialog.mSelectedTarget;
        if (Intrinsics.c(str, SWITCH_BVN)) {
            ocSwitchRouterDialog.jump2Bvn();
        } else if (Intrinsics.c(str, SWITCH_BANK_CARD)) {
            ocSwitchRouterDialog.jump2BankCard();
        } else {
            ocSwitchRouterDialog.jump2BankAccount();
        }
        ocSwitchRouterDialog.dismiss();
        ocSwitchRouterDialog.mActivity.finish();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        if (Intrinsics.c(this.switchType, SWITCH_BANK_CARD)) {
            getAccount_img().setImageResource(d.core_bank_card_icon);
            getAccount_tv().setText(this.mContext.getString(k.core_switch_bank_card));
            this.mSelectedTarget = SWITCH_BANK_CARD;
        } else {
            getAccount_img().setImageResource(d.core_bank_account_icon);
            getAccount_tv().setText(this.mContext.getString(k.core_switch_bank_account));
            this.mSelectedTarget = SWITCH_BANK_ACCOUNT;
        }
        getBank_account_ll().setBackgroundResource(d.core_oc_router_switch_selected_bg);
        setListener();
    }
}
