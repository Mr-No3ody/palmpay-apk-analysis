package com.transsnet.palmpay.send_money.ui.dialog;

import Ad.S;
import Pa.r0;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.send_money.bean.resp.NotificationEmailResp;
import com.transsnet.palmpay.send_money.ui.dialog.NotificationEmailDialog;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p159kd.h;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00011B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001b\u0010\u0018\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000eR\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/NotificationEmailDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "show", "Landroid/widget/TextView;", "btn_confirm_tv$delegate", "Lkotlin/Lazy;", "getBtn_confirm_tv", "()Landroid/widget/TextView;", "btn_confirm_tv", "btn_cancel_tv$delegate", "getBtn_cancel_tv", "btn_cancel_tv", "tv_email$delegate", "getTv_email", "tv_email", "tv_tip_content$delegate", "getTv_tip_content", "tv_tip_content", "Lcom/mikepenz/iconics/view/IconicsImageView;", "iv_close$delegate", "getIv_close", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "iv_close", "Lcom/transsnet/palmpay/send_money/ui/dialog/NotificationEmailDialog$OnNotificationDialogListner;", "listner", "Lcom/transsnet/palmpay/send_money/ui/dialog/NotificationEmailDialog$OnNotificationDialogListner;", "getListner", "()Lcom/transsnet/palmpay/send_money/ui/dialog/NotificationEmailDialog$OnNotificationDialogListner;", "setListner", "(Lcom/transsnet/palmpay/send_money/ui/dialog/NotificationEmailDialog$OnNotificationDialogListner;)V", "Lcom/transsnet/palmpay/send_money/bean/resp/NotificationEmailResp;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/send_money/bean/resp/NotificationEmailResp;", "getData", "()Lcom/transsnet/palmpay/send_money/bean/resp/NotificationEmailResp;", "setData", "(Lcom/transsnet/palmpay/send_money/bean/resp/NotificationEmailResp;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "getOnClickListener", "()Landroid/view/View$OnClickListener;", "OnNotificationDialogListner", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationEmailDialog extends b {

    /* JADX INFO: renamed from: btn_cancel_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btn_cancel_tv;

    /* JADX INFO: renamed from: btn_confirm_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btn_confirm_tv;

    @Nullable
    private NotificationEmailResp data;

    /* JADX INFO: renamed from: iv_close$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iv_close;

    @Nullable
    private OnNotificationDialogListner listner;

    @NotNull
    private final View.OnClickListener onClickListener;

    /* JADX INFO: renamed from: tv_email$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_email;

    /* JADX INFO: renamed from: tv_tip_content$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_tip_content;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/NotificationEmailDialog$OnNotificationDialogListner;", "", "onNotificate", "", "isNotificate", "", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnNotificationDialogListner {
        void onNotificate(boolean isNotificate);
    }

    public NotificationEmailDialog(@Nullable Context context) {
        super(context, f.sm_dialog_notification_email);
        final int i7 = 0;
        this.btn_confirm_tv = C2131j.b(new Function0(this) { // from class: Ad.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationEmailDialog f188b;

            {
                this.f188b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return NotificationEmailDialog.btn_confirm_tv_delegate$lambda$0(this.f188b);
                    case 1:
                        return NotificationEmailDialog.btn_cancel_tv_delegate$lambda$1(this.f188b);
                    case 2:
                        return NotificationEmailDialog.tv_email_delegate$lambda$2(this.f188b);
                    case 3:
                        return NotificationEmailDialog.tv_tip_content_delegate$lambda$3(this.f188b);
                    default:
                        return NotificationEmailDialog.iv_close_delegate$lambda$4(this.f188b);
                }
            }
        });
        final int i10 = 1;
        this.btn_cancel_tv = C2131j.b(new Function0(this) { // from class: Ad.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationEmailDialog f188b;

            {
                this.f188b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return NotificationEmailDialog.btn_confirm_tv_delegate$lambda$0(this.f188b);
                    case 1:
                        return NotificationEmailDialog.btn_cancel_tv_delegate$lambda$1(this.f188b);
                    case 2:
                        return NotificationEmailDialog.tv_email_delegate$lambda$2(this.f188b);
                    case 3:
                        return NotificationEmailDialog.tv_tip_content_delegate$lambda$3(this.f188b);
                    default:
                        return NotificationEmailDialog.iv_close_delegate$lambda$4(this.f188b);
                }
            }
        });
        final int i11 = 2;
        this.tv_email = C2131j.b(new Function0(this) { // from class: Ad.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationEmailDialog f188b;

            {
                this.f188b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return NotificationEmailDialog.btn_confirm_tv_delegate$lambda$0(this.f188b);
                    case 1:
                        return NotificationEmailDialog.btn_cancel_tv_delegate$lambda$1(this.f188b);
                    case 2:
                        return NotificationEmailDialog.tv_email_delegate$lambda$2(this.f188b);
                    case 3:
                        return NotificationEmailDialog.tv_tip_content_delegate$lambda$3(this.f188b);
                    default:
                        return NotificationEmailDialog.iv_close_delegate$lambda$4(this.f188b);
                }
            }
        });
        final int i12 = 3;
        this.tv_tip_content = C2131j.b(new Function0(this) { // from class: Ad.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationEmailDialog f188b;

            {
                this.f188b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return NotificationEmailDialog.btn_confirm_tv_delegate$lambda$0(this.f188b);
                    case 1:
                        return NotificationEmailDialog.btn_cancel_tv_delegate$lambda$1(this.f188b);
                    case 2:
                        return NotificationEmailDialog.tv_email_delegate$lambda$2(this.f188b);
                    case 3:
                        return NotificationEmailDialog.tv_tip_content_delegate$lambda$3(this.f188b);
                    default:
                        return NotificationEmailDialog.iv_close_delegate$lambda$4(this.f188b);
                }
            }
        });
        final int i13 = 4;
        this.iv_close = C2131j.b(new Function0(this) { // from class: Ad.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationEmailDialog f188b;

            {
                this.f188b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return NotificationEmailDialog.btn_confirm_tv_delegate$lambda$0(this.f188b);
                    case 1:
                        return NotificationEmailDialog.btn_cancel_tv_delegate$lambda$1(this.f188b);
                    case 2:
                        return NotificationEmailDialog.tv_email_delegate$lambda$2(this.f188b);
                    case 3:
                        return NotificationEmailDialog.tv_tip_content_delegate$lambda$3(this.f188b);
                    default:
                        return NotificationEmailDialog.iv_close_delegate$lambda$4(this.f188b);
                }
            }
        });
        this.onClickListener = new S(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView btn_cancel_tv_delegate$lambda$1(NotificationEmailDialog notificationEmailDialog) {
        return (TextView) notificationEmailDialog.findViewById(e.btn_cancel_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView btn_confirm_tv_delegate$lambda$0(NotificationEmailDialog notificationEmailDialog) {
        return (TextView) notificationEmailDialog.findViewById(e.btn_confirm_tv);
    }

    private final TextView getBtn_cancel_tv() {
        Object value = this.btn_cancel_tv.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getBtn_confirm_tv() {
        Object value = this.btn_confirm_tv.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final IconicsImageView getIv_close() {
        Object value = this.iv_close.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsImageView) value;
    }

    private final TextView getTv_email() {
        Object value = this.tv_email.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_tip_content() {
        Object value = this.tv_tip_content.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$5(NotificationEmailDialog notificationEmailDialog, View view) {
        ARouter.getInstance().build("/main/personal_info").navigation();
        notificationEmailDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconicsImageView iv_close_delegate$lambda$4(NotificationEmailDialog notificationEmailDialog) {
        return (IconicsImageView) notificationEmailDialog.findViewById(e.iv_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClickListener$lambda$9(NotificationEmailDialog notificationEmailDialog, View view) {
        OnNotificationDialogListner onNotificationDialogListner;
        int id2 = view.getId();
        if (id2 == e.iv_close) {
            notificationEmailDialog.dismiss();
            return;
        }
        if (id2 == e.btn_cancel_tv) {
            OnNotificationDialogListner onNotificationDialogListner2 = notificationEmailDialog.listner;
            if (onNotificationDialogListner2 != null) {
                notificationEmailDialog.dismiss();
                onNotificationDialogListner2.onNotificate(false);
                return;
            }
            return;
        }
        if (id2 != e.btn_confirm_tv || (onNotificationDialogListner = notificationEmailDialog.listner) == null) {
            return;
        }
        notificationEmailDialog.dismiss();
        onNotificationDialogListner.onNotificate(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_email_delegate$lambda$2(NotificationEmailDialog notificationEmailDialog) {
        return (TextView) notificationEmailDialog.findViewById(e.tv_email);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_tip_content_delegate$lambda$3(NotificationEmailDialog notificationEmailDialog) {
        return (TextView) notificationEmailDialog.findViewById(e.tv_tip_content);
    }

    @Nullable
    public final NotificationEmailResp getData() {
        return this.data;
    }

    @Nullable
    public final OnNotificationDialogListner getListner() {
        return this.listner;
    }

    @NotNull
    public final View.OnClickListener getOnClickListener() {
        return this.onClickListener;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        getIv_close().setOnClickListener(this.onClickListener);
        getBtn_cancel_tv().setOnClickListener(this.onClickListener);
        getBtn_confirm_tv().setOnClickListener(this.onClickListener);
        getTv_email().setOnClickListener(new S(this, 0));
        NotificationEmailResp notificationEmailResp = this.data;
        if (notificationEmailResp != null) {
            getTv_email().setText(notificationEmailResp.getEmail());
            getTv_tip_content().setText(getContext().getString(h.sm_transactions_above, r0.B(notificationEmailResp.getEmailAboveAmount(), false)));
        }
    }

    public final void setData(@Nullable NotificationEmailResp notificationEmailResp) {
        this.data = notificationEmailResp;
    }

    public final void setListner(@Nullable OnNotificationDialogListner onNotificationDialogListner) {
        this.listner = onNotificationDialogListner;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
        showAtBottom(getWindow());
    }
}
