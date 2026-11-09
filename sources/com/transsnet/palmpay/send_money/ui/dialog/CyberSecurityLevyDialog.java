package com.transsnet.palmpay.send_money.ui.dialog;

import C0.G;
import Pa.r0;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.send_money.bean.resp.BankAccountMemberInfoResp;
import com.transsnet.palmpay.send_money.ui.dialog.CyberSecurityLevyDialog;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p220oa.h;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001b\u0010\u001f\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010-R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010/R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00100¨\u00062"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/CyberSecurityLevyDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/send_money/ui/dialog/CyberSecurityLevyDialog$OnButtonClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnButtonClickListener", "(Lcom/transsnet/palmpay/send_money/ui/dialog/CyberSecurityLevyDialog$OnButtonClickListener;)Lcom/transsnet/palmpay/send_money/ui/dialog/CyberSecurityLevyDialog;", "Lcom/transsnet/palmpay/send_money/bean/resp/BankAccountMemberInfoResp;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setData", "(Lcom/transsnet/palmpay/send_money/bean/resp/BankAccountMemberInfoResp;)Lcom/transsnet/palmpay/send_money/ui/dialog/CyberSecurityLevyDialog;", "Landroid/widget/TextView;", "tv_cancel$delegate", "Lkotlin/Lazy;", "getTv_cancel", "()Landroid/widget/TextView;", "tv_cancel", "tv_confirm$delegate", "getTv_confirm", "tv_confirm", "tv_phone$delegate", "getTv_phone", "tv_phone", "tv_name$delegate", "getTv_name", "tv_name", "Landroid/widget/ImageView;", "iv_avatar$delegate", "getIv_avatar", "()Landroid/widget/ImageView;", "iv_avatar", "Landroidx/constraintlayout/widget/Group;", "group_info$delegate", "getGroup_info", "()Landroidx/constraintlayout/widget/Group;", "group_info", "Lcom/mikepenz/iconics/view/IconicsImageView;", "iiv_close$delegate", "getIiv_close", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "iiv_close", "Lcom/transsnet/palmpay/send_money/ui/dialog/CyberSecurityLevyDialog$OnButtonClickListener;", "Lcom/transsnet/palmpay/send_money/bean/resp/BankAccountMemberInfoResp;", "OnButtonClickListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CyberSecurityLevyDialog extends b {

    @Nullable
    private BankAccountMemberInfoResp data;

    /* JADX INFO: renamed from: group_info$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy group_info;

    /* JADX INFO: renamed from: iiv_close$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iiv_close;

    /* JADX INFO: renamed from: iv_avatar$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iv_avatar;

    @Nullable
    private OnButtonClickListener listener;

    /* JADX INFO: renamed from: tv_cancel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_cancel;

    /* JADX INFO: renamed from: tv_confirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_confirm;

    /* JADX INFO: renamed from: tv_name$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_name;

    /* JADX INFO: renamed from: tv_phone$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_phone;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/CyberSecurityLevyDialog$OnButtonClickListener;", "", "onConfirm", "", "onCancel", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnButtonClickListener {
        void onCancel();

        void onConfirm();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CyberSecurityLevyDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.tv_cancel = C2131j.b(new Function0(this) { // from class: Ad.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CyberSecurityLevyDialog f264b;

            {
                this.f264b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CyberSecurityLevyDialog.tv_cancel_delegate$lambda$0(this.f264b);
                    case 1:
                        return CyberSecurityLevyDialog.tv_confirm_delegate$lambda$1(this.f264b);
                    case 2:
                        return CyberSecurityLevyDialog.tv_phone_delegate$lambda$2(this.f264b);
                    case 3:
                        return CyberSecurityLevyDialog.tv_name_delegate$lambda$3(this.f264b);
                    case 4:
                        return CyberSecurityLevyDialog.iv_avatar_delegate$lambda$4(this.f264b);
                    case 5:
                        return CyberSecurityLevyDialog.group_info_delegate$lambda$5(this.f264b);
                    default:
                        return CyberSecurityLevyDialog.iiv_close_delegate$lambda$6(this.f264b);
                }
            }
        });
        final int i10 = 1;
        this.tv_confirm = C2131j.b(new Function0(this) { // from class: Ad.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CyberSecurityLevyDialog f264b;

            {
                this.f264b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CyberSecurityLevyDialog.tv_cancel_delegate$lambda$0(this.f264b);
                    case 1:
                        return CyberSecurityLevyDialog.tv_confirm_delegate$lambda$1(this.f264b);
                    case 2:
                        return CyberSecurityLevyDialog.tv_phone_delegate$lambda$2(this.f264b);
                    case 3:
                        return CyberSecurityLevyDialog.tv_name_delegate$lambda$3(this.f264b);
                    case 4:
                        return CyberSecurityLevyDialog.iv_avatar_delegate$lambda$4(this.f264b);
                    case 5:
                        return CyberSecurityLevyDialog.group_info_delegate$lambda$5(this.f264b);
                    default:
                        return CyberSecurityLevyDialog.iiv_close_delegate$lambda$6(this.f264b);
                }
            }
        });
        final int i11 = 2;
        this.tv_phone = C2131j.b(new Function0(this) { // from class: Ad.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CyberSecurityLevyDialog f264b;

            {
                this.f264b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CyberSecurityLevyDialog.tv_cancel_delegate$lambda$0(this.f264b);
                    case 1:
                        return CyberSecurityLevyDialog.tv_confirm_delegate$lambda$1(this.f264b);
                    case 2:
                        return CyberSecurityLevyDialog.tv_phone_delegate$lambda$2(this.f264b);
                    case 3:
                        return CyberSecurityLevyDialog.tv_name_delegate$lambda$3(this.f264b);
                    case 4:
                        return CyberSecurityLevyDialog.iv_avatar_delegate$lambda$4(this.f264b);
                    case 5:
                        return CyberSecurityLevyDialog.group_info_delegate$lambda$5(this.f264b);
                    default:
                        return CyberSecurityLevyDialog.iiv_close_delegate$lambda$6(this.f264b);
                }
            }
        });
        final int i12 = 3;
        this.tv_name = C2131j.b(new Function0(this) { // from class: Ad.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CyberSecurityLevyDialog f264b;

            {
                this.f264b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return CyberSecurityLevyDialog.tv_cancel_delegate$lambda$0(this.f264b);
                    case 1:
                        return CyberSecurityLevyDialog.tv_confirm_delegate$lambda$1(this.f264b);
                    case 2:
                        return CyberSecurityLevyDialog.tv_phone_delegate$lambda$2(this.f264b);
                    case 3:
                        return CyberSecurityLevyDialog.tv_name_delegate$lambda$3(this.f264b);
                    case 4:
                        return CyberSecurityLevyDialog.iv_avatar_delegate$lambda$4(this.f264b);
                    case 5:
                        return CyberSecurityLevyDialog.group_info_delegate$lambda$5(this.f264b);
                    default:
                        return CyberSecurityLevyDialog.iiv_close_delegate$lambda$6(this.f264b);
                }
            }
        });
        final int i13 = 4;
        this.iv_avatar = C2131j.b(new Function0(this) { // from class: Ad.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CyberSecurityLevyDialog f264b;

            {
                this.f264b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return CyberSecurityLevyDialog.tv_cancel_delegate$lambda$0(this.f264b);
                    case 1:
                        return CyberSecurityLevyDialog.tv_confirm_delegate$lambda$1(this.f264b);
                    case 2:
                        return CyberSecurityLevyDialog.tv_phone_delegate$lambda$2(this.f264b);
                    case 3:
                        return CyberSecurityLevyDialog.tv_name_delegate$lambda$3(this.f264b);
                    case 4:
                        return CyberSecurityLevyDialog.iv_avatar_delegate$lambda$4(this.f264b);
                    case 5:
                        return CyberSecurityLevyDialog.group_info_delegate$lambda$5(this.f264b);
                    default:
                        return CyberSecurityLevyDialog.iiv_close_delegate$lambda$6(this.f264b);
                }
            }
        });
        final int i14 = 5;
        this.group_info = C2131j.b(new Function0(this) { // from class: Ad.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CyberSecurityLevyDialog f264b;

            {
                this.f264b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return CyberSecurityLevyDialog.tv_cancel_delegate$lambda$0(this.f264b);
                    case 1:
                        return CyberSecurityLevyDialog.tv_confirm_delegate$lambda$1(this.f264b);
                    case 2:
                        return CyberSecurityLevyDialog.tv_phone_delegate$lambda$2(this.f264b);
                    case 3:
                        return CyberSecurityLevyDialog.tv_name_delegate$lambda$3(this.f264b);
                    case 4:
                        return CyberSecurityLevyDialog.iv_avatar_delegate$lambda$4(this.f264b);
                    case 5:
                        return CyberSecurityLevyDialog.group_info_delegate$lambda$5(this.f264b);
                    default:
                        return CyberSecurityLevyDialog.iiv_close_delegate$lambda$6(this.f264b);
                }
            }
        });
        final int i15 = 6;
        this.iiv_close = C2131j.b(new Function0(this) { // from class: Ad.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CyberSecurityLevyDialog f264b;

            {
                this.f264b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return CyberSecurityLevyDialog.tv_cancel_delegate$lambda$0(this.f264b);
                    case 1:
                        return CyberSecurityLevyDialog.tv_confirm_delegate$lambda$1(this.f264b);
                    case 2:
                        return CyberSecurityLevyDialog.tv_phone_delegate$lambda$2(this.f264b);
                    case 3:
                        return CyberSecurityLevyDialog.tv_name_delegate$lambda$3(this.f264b);
                    case 4:
                        return CyberSecurityLevyDialog.iv_avatar_delegate$lambda$4(this.f264b);
                    case 5:
                        return CyberSecurityLevyDialog.group_info_delegate$lambda$5(this.f264b);
                    default:
                        return CyberSecurityLevyDialog.iiv_close_delegate$lambda$6(this.f264b);
                }
            }
        });
    }

    private final Group getGroup_info() {
        Object value = this.group_info.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Group) value;
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

    private final TextView getTv_cancel() {
        Object value = this.tv_cancel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_confirm() {
        Object value = this.tv_confirm.getValue();
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
    public static final Group group_info_delegate$lambda$5(CyberSecurityLevyDialog cyberSecurityLevyDialog) {
        return (Group) cyberSecurityLevyDialog.findViewById(e.group_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconicsImageView iiv_close_delegate$lambda$6(CyberSecurityLevyDialog cyberSecurityLevyDialog) {
        return (IconicsImageView) cyberSecurityLevyDialog.findViewById(e.iiv_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$8(CyberSecurityLevyDialog cyberSecurityLevyDialog, View view) {
        OnButtonClickListener onButtonClickListener = cyberSecurityLevyDialog.listener;
        if (onButtonClickListener != null) {
            onButtonClickListener.onConfirm();
        }
        cyberSecurityLevyDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$9(CyberSecurityLevyDialog cyberSecurityLevyDialog, View view) {
        OnButtonClickListener onButtonClickListener = cyberSecurityLevyDialog.listener;
        if (onButtonClickListener != null) {
            onButtonClickListener.onCancel();
        }
        cyberSecurityLevyDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView iv_avatar_delegate$lambda$4(CyberSecurityLevyDialog cyberSecurityLevyDialog) {
        return (ImageView) cyberSecurityLevyDialog.findViewById(e.iv_avatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_cancel_delegate$lambda$0(CyberSecurityLevyDialog cyberSecurityLevyDialog) {
        return (TextView) cyberSecurityLevyDialog.findViewById(e.tv_cancel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_confirm_delegate$lambda$1(CyberSecurityLevyDialog cyberSecurityLevyDialog) {
        return (TextView) cyberSecurityLevyDialog.findViewById(e.tv_confirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_name_delegate$lambda$3(CyberSecurityLevyDialog cyberSecurityLevyDialog) {
        return (TextView) cyberSecurityLevyDialog.findViewById(e.tv_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_phone_delegate$lambda$2(CyberSecurityLevyDialog cyberSecurityLevyDialog) {
        return (TextView) cyberSecurityLevyDialog.findViewById(e.tv_phone);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(f.sm_dialog_transfer_to_bank_cybersecurity_vevy);
        IconicsImageView iiv_close = getIiv_close();
        if (iiv_close != null) {
            final int i7 = 0;
            iiv_close.setOnClickListener(new View.OnClickListener(this) { // from class: Ad.A

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CyberSecurityLevyDialog f153b;

                {
                    this.f153b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f153b.dismiss();
                            break;
                        case 1:
                            CyberSecurityLevyDialog.initViews$lambda$8(this.f153b, view);
                            break;
                        default:
                            CyberSecurityLevyDialog.initViews$lambda$9(this.f153b, view);
                            break;
                    }
                }
            });
        }
        final int i10 = 1;
        getTv_confirm().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CyberSecurityLevyDialog f153b;

            {
                this.f153b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f153b.dismiss();
                        break;
                    case 1:
                        CyberSecurityLevyDialog.initViews$lambda$8(this.f153b, view);
                        break;
                    default:
                        CyberSecurityLevyDialog.initViews$lambda$9(this.f153b, view);
                        break;
                }
            }
        });
        final int i11 = 2;
        getTv_cancel().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CyberSecurityLevyDialog f153b;

            {
                this.f153b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f153b.dismiss();
                        break;
                    case 1:
                        CyberSecurityLevyDialog.initViews$lambda$8(this.f153b, view);
                        break;
                    default:
                        CyberSecurityLevyDialog.initViews$lambda$9(this.f153b, view);
                        break;
                }
            }
        });
        BankAccountMemberInfoResp bankAccountMemberInfoResp = this.data;
        if (bankAccountMemberInfoResp == null) {
            h.c(getGroup_info());
            return;
        }
        h.C(getGroup_info());
        r0.l1(bankAccountMemberInfoResp.bankUrl, getIv_avatar());
        getTv_name().setText(bankAccountMemberInfoResp.accountName);
        TextView tv_phone = getTv_phone();
        G.w(getContext(), L6.b.ppColorPrimary, d0.j(" ", bankAccountMemberInfoResp.bankName, new SpanUtils().append(r0.Y(bankAccountMemberInfoResp.phone))), tv_phone);
    }

    @NotNull
    public final CyberSecurityLevyDialog setData(@Nullable BankAccountMemberInfoResp data) {
        this.data = data;
        return this;
    }

    @NotNull
    public final CyberSecurityLevyDialog setOnButtonClickListener(@NotNull OnButtonClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        return this;
    }
}
