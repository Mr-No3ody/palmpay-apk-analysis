package com.transsnet.palmpay.send_money.ui.dialog;

import C0.G;
import Pa.r0;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.send_money.bean.resp.BankAccountMemberInfoResp;
import com.transsnet.palmpay.send_money.ui.dialog.FasterSendToPalmPayAccountDialog;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.l;
import p159kd.e;
import p159kd.f;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001bR\u001b\u0010\"\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u001bR\u001b\u0010%\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u001bR\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0014\u001a\u0004\b-\u0010.R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00101¨\u00063"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/FasterSendToPalmPayAccountDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "renderWindow", "()V", "initViews", "Lcom/transsnet/palmpay/send_money/ui/dialog/FasterSendToPalmPayAccountDialog$OnButtonClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnButtonClickListener", "(Lcom/transsnet/palmpay/send_money/ui/dialog/FasterSendToPalmPayAccountDialog$OnButtonClickListener;)Lcom/transsnet/palmpay/send_money/ui/dialog/FasterSendToPalmPayAccountDialog;", "Lcom/transsnet/palmpay/send_money/bean/resp/BankAccountMemberInfoResp;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setData", "(Lcom/transsnet/palmpay/send_money/bean/resp/BankAccountMemberInfoResp;)Lcom/transsnet/palmpay/send_money/ui/dialog/FasterSendToPalmPayAccountDialog;", "Lcom/mikepenz/iconics/view/IconicsCheckBox;", "iicb_not_asking_again$delegate", "Lkotlin/Lazy;", "getIicb_not_asking_again", "()Lcom/mikepenz/iconics/view/IconicsCheckBox;", "iicb_not_asking_again", "Landroid/widget/TextView;", "result_right_btn$delegate", "getResult_right_btn", "()Landroid/widget/TextView;", "result_right_btn", "result_left_btn$delegate", "getResult_left_btn", "result_left_btn", "tv_phone$delegate", "getTv_phone", "tv_phone", "tv_name$delegate", "getTv_name", "tv_name", "Landroid/widget/ImageView;", "iv_avatar$delegate", "getIv_avatar", "()Landroid/widget/ImageView;", "iv_avatar", "Lcom/mikepenz/iconics/view/IconicsImageView;", "iiv_close$delegate", "getIiv_close", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "iiv_close", "Lcom/transsnet/palmpay/send_money/ui/dialog/FasterSendToPalmPayAccountDialog$OnButtonClickListener;", "Lcom/transsnet/palmpay/send_money/bean/resp/BankAccountMemberInfoResp;", "OnButtonClickListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FasterSendToPalmPayAccountDialog extends b {

    @Nullable
    private BankAccountMemberInfoResp data;

    /* JADX INFO: renamed from: iicb_not_asking_again$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iicb_not_asking_again;

    /* JADX INFO: renamed from: iiv_close$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iiv_close;

    /* JADX INFO: renamed from: iv_avatar$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iv_avatar;

    @Nullable
    private OnButtonClickListener listener;

    /* JADX INFO: renamed from: result_left_btn$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy result_left_btn;

    /* JADX INFO: renamed from: result_right_btn$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy result_right_btn;

    /* JADX INFO: renamed from: tv_name$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_name;

    /* JADX INFO: renamed from: tv_phone$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_phone;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/FasterSendToPalmPayAccountDialog$OnButtonClickListener;", "", "onLeftClick", "", "onRightClick", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnButtonClickListener {
        void onLeftClick();

        void onRightClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FasterSendToPalmPayAccountDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.iicb_not_asking_again = C2131j.b(new Function0(this) { // from class: Ad.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FasterSendToPalmPayAccountDialog f159b;

            {
                this.f159b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return FasterSendToPalmPayAccountDialog.iicb_not_asking_again_delegate$lambda$0(this.f159b);
                    case 1:
                        return FasterSendToPalmPayAccountDialog.result_right_btn_delegate$lambda$1(this.f159b);
                    case 2:
                        return FasterSendToPalmPayAccountDialog.result_left_btn_delegate$lambda$2(this.f159b);
                    case 3:
                        return FasterSendToPalmPayAccountDialog.tv_phone_delegate$lambda$3(this.f159b);
                    case 4:
                        return FasterSendToPalmPayAccountDialog.tv_name_delegate$lambda$4(this.f159b);
                    case 5:
                        return FasterSendToPalmPayAccountDialog.iv_avatar_delegate$lambda$5(this.f159b);
                    default:
                        return FasterSendToPalmPayAccountDialog.iiv_close_delegate$lambda$6(this.f159b);
                }
            }
        });
        final int i10 = 1;
        this.result_right_btn = C2131j.b(new Function0(this) { // from class: Ad.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FasterSendToPalmPayAccountDialog f159b;

            {
                this.f159b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return FasterSendToPalmPayAccountDialog.iicb_not_asking_again_delegate$lambda$0(this.f159b);
                    case 1:
                        return FasterSendToPalmPayAccountDialog.result_right_btn_delegate$lambda$1(this.f159b);
                    case 2:
                        return FasterSendToPalmPayAccountDialog.result_left_btn_delegate$lambda$2(this.f159b);
                    case 3:
                        return FasterSendToPalmPayAccountDialog.tv_phone_delegate$lambda$3(this.f159b);
                    case 4:
                        return FasterSendToPalmPayAccountDialog.tv_name_delegate$lambda$4(this.f159b);
                    case 5:
                        return FasterSendToPalmPayAccountDialog.iv_avatar_delegate$lambda$5(this.f159b);
                    default:
                        return FasterSendToPalmPayAccountDialog.iiv_close_delegate$lambda$6(this.f159b);
                }
            }
        });
        final int i11 = 2;
        this.result_left_btn = C2131j.b(new Function0(this) { // from class: Ad.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FasterSendToPalmPayAccountDialog f159b;

            {
                this.f159b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return FasterSendToPalmPayAccountDialog.iicb_not_asking_again_delegate$lambda$0(this.f159b);
                    case 1:
                        return FasterSendToPalmPayAccountDialog.result_right_btn_delegate$lambda$1(this.f159b);
                    case 2:
                        return FasterSendToPalmPayAccountDialog.result_left_btn_delegate$lambda$2(this.f159b);
                    case 3:
                        return FasterSendToPalmPayAccountDialog.tv_phone_delegate$lambda$3(this.f159b);
                    case 4:
                        return FasterSendToPalmPayAccountDialog.tv_name_delegate$lambda$4(this.f159b);
                    case 5:
                        return FasterSendToPalmPayAccountDialog.iv_avatar_delegate$lambda$5(this.f159b);
                    default:
                        return FasterSendToPalmPayAccountDialog.iiv_close_delegate$lambda$6(this.f159b);
                }
            }
        });
        final int i12 = 3;
        this.tv_phone = C2131j.b(new Function0(this) { // from class: Ad.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FasterSendToPalmPayAccountDialog f159b;

            {
                this.f159b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return FasterSendToPalmPayAccountDialog.iicb_not_asking_again_delegate$lambda$0(this.f159b);
                    case 1:
                        return FasterSendToPalmPayAccountDialog.result_right_btn_delegate$lambda$1(this.f159b);
                    case 2:
                        return FasterSendToPalmPayAccountDialog.result_left_btn_delegate$lambda$2(this.f159b);
                    case 3:
                        return FasterSendToPalmPayAccountDialog.tv_phone_delegate$lambda$3(this.f159b);
                    case 4:
                        return FasterSendToPalmPayAccountDialog.tv_name_delegate$lambda$4(this.f159b);
                    case 5:
                        return FasterSendToPalmPayAccountDialog.iv_avatar_delegate$lambda$5(this.f159b);
                    default:
                        return FasterSendToPalmPayAccountDialog.iiv_close_delegate$lambda$6(this.f159b);
                }
            }
        });
        final int i13 = 4;
        this.tv_name = C2131j.b(new Function0(this) { // from class: Ad.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FasterSendToPalmPayAccountDialog f159b;

            {
                this.f159b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return FasterSendToPalmPayAccountDialog.iicb_not_asking_again_delegate$lambda$0(this.f159b);
                    case 1:
                        return FasterSendToPalmPayAccountDialog.result_right_btn_delegate$lambda$1(this.f159b);
                    case 2:
                        return FasterSendToPalmPayAccountDialog.result_left_btn_delegate$lambda$2(this.f159b);
                    case 3:
                        return FasterSendToPalmPayAccountDialog.tv_phone_delegate$lambda$3(this.f159b);
                    case 4:
                        return FasterSendToPalmPayAccountDialog.tv_name_delegate$lambda$4(this.f159b);
                    case 5:
                        return FasterSendToPalmPayAccountDialog.iv_avatar_delegate$lambda$5(this.f159b);
                    default:
                        return FasterSendToPalmPayAccountDialog.iiv_close_delegate$lambda$6(this.f159b);
                }
            }
        });
        final int i14 = 5;
        this.iv_avatar = C2131j.b(new Function0(this) { // from class: Ad.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FasterSendToPalmPayAccountDialog f159b;

            {
                this.f159b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return FasterSendToPalmPayAccountDialog.iicb_not_asking_again_delegate$lambda$0(this.f159b);
                    case 1:
                        return FasterSendToPalmPayAccountDialog.result_right_btn_delegate$lambda$1(this.f159b);
                    case 2:
                        return FasterSendToPalmPayAccountDialog.result_left_btn_delegate$lambda$2(this.f159b);
                    case 3:
                        return FasterSendToPalmPayAccountDialog.tv_phone_delegate$lambda$3(this.f159b);
                    case 4:
                        return FasterSendToPalmPayAccountDialog.tv_name_delegate$lambda$4(this.f159b);
                    case 5:
                        return FasterSendToPalmPayAccountDialog.iv_avatar_delegate$lambda$5(this.f159b);
                    default:
                        return FasterSendToPalmPayAccountDialog.iiv_close_delegate$lambda$6(this.f159b);
                }
            }
        });
        final int i15 = 6;
        this.iiv_close = C2131j.b(new Function0(this) { // from class: Ad.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FasterSendToPalmPayAccountDialog f159b;

            {
                this.f159b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return FasterSendToPalmPayAccountDialog.iicb_not_asking_again_delegate$lambda$0(this.f159b);
                    case 1:
                        return FasterSendToPalmPayAccountDialog.result_right_btn_delegate$lambda$1(this.f159b);
                    case 2:
                        return FasterSendToPalmPayAccountDialog.result_left_btn_delegate$lambda$2(this.f159b);
                    case 3:
                        return FasterSendToPalmPayAccountDialog.tv_phone_delegate$lambda$3(this.f159b);
                    case 4:
                        return FasterSendToPalmPayAccountDialog.tv_name_delegate$lambda$4(this.f159b);
                    case 5:
                        return FasterSendToPalmPayAccountDialog.iv_avatar_delegate$lambda$5(this.f159b);
                    default:
                        return FasterSendToPalmPayAccountDialog.iiv_close_delegate$lambda$6(this.f159b);
                }
            }
        });
    }

    private final IconicsCheckBox getIicb_not_asking_again() {
        Object value = this.iicb_not_asking_again.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsCheckBox) value;
    }

    private final IconicsImageView getIiv_close() {
        Object value = this.iiv_close.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsImageView) value;
    }

    private final ImageView getIv_avatar() {
        Object value = this.iv_avatar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final TextView getResult_left_btn() {
        Object value = this.result_left_btn.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getResult_right_btn() {
        Object value = this.result_right_btn.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_name() {
        Object value = this.tv_name.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_phone() {
        Object value = this.tv_phone.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconicsCheckBox iicb_not_asking_again_delegate$lambda$0(FasterSendToPalmPayAccountDialog fasterSendToPalmPayAccountDialog) {
        return (IconicsCheckBox) fasterSendToPalmPayAccountDialog.findViewById(e.iicb_not_asking_again);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconicsImageView iiv_close_delegate$lambda$6(FasterSendToPalmPayAccountDialog fasterSendToPalmPayAccountDialog) {
        return (IconicsImageView) fasterSendToPalmPayAccountDialog.findViewById(e.iiv_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$8(FasterSendToPalmPayAccountDialog fasterSendToPalmPayAccountDialog, View view) {
        SPUtils.get().put("KEY_SHOW_FASTER_SEND_TO_PALMPAY_DIALOG", !fasterSendToPalmPayAccountDialog.getIicb_not_asking_again().isChecked());
        OnButtonClickListener onButtonClickListener = fasterSendToPalmPayAccountDialog.listener;
        if (onButtonClickListener != null) {
            onButtonClickListener.onLeftClick();
        }
        fasterSendToPalmPayAccountDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$9(FasterSendToPalmPayAccountDialog fasterSendToPalmPayAccountDialog, View view) {
        SPUtils.get().put("KEY_SHOW_FASTER_SEND_TO_PALMPAY_DIALOG", !fasterSendToPalmPayAccountDialog.getIicb_not_asking_again().isChecked());
        OnButtonClickListener onButtonClickListener = fasterSendToPalmPayAccountDialog.listener;
        if (onButtonClickListener != null) {
            onButtonClickListener.onRightClick();
        }
        fasterSendToPalmPayAccountDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView iv_avatar_delegate$lambda$5(FasterSendToPalmPayAccountDialog fasterSendToPalmPayAccountDialog) {
        return (ImageView) fasterSendToPalmPayAccountDialog.findViewById(e.iv_avatar);
    }

    private final void renderWindow() {
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView result_left_btn_delegate$lambda$2(FasterSendToPalmPayAccountDialog fasterSendToPalmPayAccountDialog) {
        return (TextView) fasterSendToPalmPayAccountDialog.findViewById(e.result_left_btn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView result_right_btn_delegate$lambda$1(FasterSendToPalmPayAccountDialog fasterSendToPalmPayAccountDialog) {
        return (TextView) fasterSendToPalmPayAccountDialog.findViewById(e.result_right_btn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_name_delegate$lambda$4(FasterSendToPalmPayAccountDialog fasterSendToPalmPayAccountDialog) {
        return (TextView) fasterSendToPalmPayAccountDialog.findViewById(e.tv_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_phone_delegate$lambda$3(FasterSendToPalmPayAccountDialog fasterSendToPalmPayAccountDialog) {
        return (TextView) fasterSendToPalmPayAccountDialog.findViewById(e.tv_phone);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(f.sm_dialog_faster_send_to_palmpay_account);
        renderWindow();
        IconicsImageView iiv_close = getIiv_close();
        if (iiv_close != null) {
            final int i7 = 0;
            iiv_close.setOnClickListener(new View.OnClickListener(this) { // from class: Ad.E

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FasterSendToPalmPayAccountDialog f161b;

                {
                    this.f161b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f161b.dismiss();
                            break;
                        case 1:
                            FasterSendToPalmPayAccountDialog.initViews$lambda$8(this.f161b, view);
                            break;
                        default:
                            FasterSendToPalmPayAccountDialog.initViews$lambda$9(this.f161b, view);
                            break;
                    }
                }
            });
        }
        final int i10 = 1;
        getResult_left_btn().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FasterSendToPalmPayAccountDialog f161b;

            {
                this.f161b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f161b.dismiss();
                        break;
                    case 1:
                        FasterSendToPalmPayAccountDialog.initViews$lambda$8(this.f161b, view);
                        break;
                    default:
                        FasterSendToPalmPayAccountDialog.initViews$lambda$9(this.f161b, view);
                        break;
                }
            }
        });
        final int i11 = 2;
        getResult_right_btn().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FasterSendToPalmPayAccountDialog f161b;

            {
                this.f161b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f161b.dismiss();
                        break;
                    case 1:
                        FasterSendToPalmPayAccountDialog.initViews$lambda$8(this.f161b, view);
                        break;
                    default:
                        FasterSendToPalmPayAccountDialog.initViews$lambda$9(this.f161b, view);
                        break;
                }
            }
        });
        BankAccountMemberInfoResp bankAccountMemberInfoResp = this.data;
        if (bankAccountMemberInfoResp != null) {
            r0.l1(bankAccountMemberInfoResp.bankUrl, getIv_avatar());
            getTv_name().setText(bankAccountMemberInfoResp.accountName);
            TextView tv_phone = getTv_phone();
            G.w(getContext(), L6.b.ppColorPrimary, d0.j(" ", bankAccountMemberInfoResp.bankName, new SpanUtils().append(r0.Y(bankAccountMemberInfoResp.phone))), tv_phone);
        }
    }

    @NotNull
    public final FasterSendToPalmPayAccountDialog setData(@Nullable BankAccountMemberInfoResp data) {
        this.data = data;
        return this;
    }

    @NotNull
    public final FasterSendToPalmPayAccountDialog setOnButtonClickListener(@NotNull OnButtonClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        return this;
    }
}
