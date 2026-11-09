package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0018R\u001d\u0010!\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcFeedbackSubmitResultDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "status", "", "msg", "<init>", "(Landroid/content/Context;ILjava/lang/String;)V", "", "initViews", "()V", "I", "Ljava/lang/String;", "Landroid/widget/Button;", "got_it_bt$delegate", "Lkotlin/Lazy;", "getGot_it_bt", "()Landroid/widget/Button;", "got_it_bt", "Landroid/widget/TextView;", "submit_msg_txt$delegate", "getSubmit_msg_txt", "()Landroid/widget/TextView;", "submit_msg_txt", "status_tv$delegate", "getStatus_tv", "status_tv", "Landroid/widget/ImageView;", "status_img$delegate", "getStatus_img", "()Landroid/widget/ImageView;", "status_img", "Companion", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcFeedbackSubmitResultDialog extends com.transsnet.palmpay.custom_view.dialog.b {
    public static final int FEEDBACK_SUBMIT_FAILED = 1;
    public static final int FEEDBACK_SUBMIT_SUCCESS = 0;

    /* JADX INFO: renamed from: got_it_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy got_it_bt;

    @NotNull
    private final String msg;
    private final int status;

    /* JADX INFO: renamed from: status_img$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy status_img;

    /* JADX INFO: renamed from: status_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy status_tv;

    /* JADX INFO: renamed from: submit_msg_txt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy submit_msg_txt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcFeedbackSubmitResultDialog(@NotNull Context context, int i7, @NotNull String msg) {
        super(context, Ya.f.cs_oc_feedback_submit_result_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.status = i7;
        this.msg = msg;
        final int i10 = 0;
        this.got_it_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackSubmitResultDialog f30216b;

            {
                this.f30216b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcFeedbackSubmitResultDialog.got_it_bt_delegate$lambda$0(this.f30216b);
                    case 1:
                        return OcFeedbackSubmitResultDialog.submit_msg_txt_delegate$lambda$1(this.f30216b);
                    case 2:
                        return OcFeedbackSubmitResultDialog.status_tv_delegate$lambda$2(this.f30216b);
                    default:
                        return OcFeedbackSubmitResultDialog.status_img_delegate$lambda$3(this.f30216b);
                }
            }
        });
        final int i11 = 1;
        this.submit_msg_txt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackSubmitResultDialog f30216b;

            {
                this.f30216b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return OcFeedbackSubmitResultDialog.got_it_bt_delegate$lambda$0(this.f30216b);
                    case 1:
                        return OcFeedbackSubmitResultDialog.submit_msg_txt_delegate$lambda$1(this.f30216b);
                    case 2:
                        return OcFeedbackSubmitResultDialog.status_tv_delegate$lambda$2(this.f30216b);
                    default:
                        return OcFeedbackSubmitResultDialog.status_img_delegate$lambda$3(this.f30216b);
                }
            }
        });
        final int i12 = 2;
        this.status_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackSubmitResultDialog f30216b;

            {
                this.f30216b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return OcFeedbackSubmitResultDialog.got_it_bt_delegate$lambda$0(this.f30216b);
                    case 1:
                        return OcFeedbackSubmitResultDialog.submit_msg_txt_delegate$lambda$1(this.f30216b);
                    case 2:
                        return OcFeedbackSubmitResultDialog.status_tv_delegate$lambda$2(this.f30216b);
                    default:
                        return OcFeedbackSubmitResultDialog.status_img_delegate$lambda$3(this.f30216b);
                }
            }
        });
        final int i13 = 3;
        this.status_img = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackSubmitResultDialog f30216b;

            {
                this.f30216b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return OcFeedbackSubmitResultDialog.got_it_bt_delegate$lambda$0(this.f30216b);
                    case 1:
                        return OcFeedbackSubmitResultDialog.submit_msg_txt_delegate$lambda$1(this.f30216b);
                    case 2:
                        return OcFeedbackSubmitResultDialog.status_tv_delegate$lambda$2(this.f30216b);
                    default:
                        return OcFeedbackSubmitResultDialog.status_img_delegate$lambda$3(this.f30216b);
                }
            }
        });
    }

    private final Button getGot_it_bt() {
        return (Button) this.got_it_bt.getValue();
    }

    private final ImageView getStatus_img() {
        return (ImageView) this.status_img.getValue();
    }

    private final TextView getStatus_tv() {
        return (TextView) this.status_tv.getValue();
    }

    private final TextView getSubmit_msg_txt() {
        return (TextView) this.submit_msg_txt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button got_it_bt_delegate$lambda$0(OcFeedbackSubmitResultDialog ocFeedbackSubmitResultDialog) {
        return (Button) ocFeedbackSubmitResultDialog.findViewById(Ya.e.got_it_bt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView status_img_delegate$lambda$3(OcFeedbackSubmitResultDialog ocFeedbackSubmitResultDialog) {
        return (ImageView) ocFeedbackSubmitResultDialog.findViewById(Ya.e.status_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView status_tv_delegate$lambda$2(OcFeedbackSubmitResultDialog ocFeedbackSubmitResultDialog) {
        return (TextView) ocFeedbackSubmitResultDialog.findViewById(Ya.e.status_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView submit_msg_txt_delegate$lambda$1(OcFeedbackSubmitResultDialog ocFeedbackSubmitResultDialog) {
        return (TextView) ocFeedbackSubmitResultDialog.findViewById(Ya.e.submit_msg_txt);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        if (this.status == 0) {
            ImageView status_img = getStatus_img();
            if (status_img != null) {
                status_img.setImageResource(Ya.d.cs_cl_borrow_success_icon);
            }
            TextView status_tv = getStatus_tv();
            if (status_tv != null) {
                status_tv.setText(this.mContext.getString(Ya.g.cs_oc_feedback_success));
            }
            TextView submit_msg_txt = getSubmit_msg_txt();
            if (submit_msg_txt != null) {
                submit_msg_txt.setText(getContext().getString(Ya.g.cs_oc_feedback_success_msg));
            }
        } else {
            ImageView status_img2 = getStatus_img();
            if (status_img2 != null) {
                status_img2.setImageResource(Ya.d.cs_operation_fail_icon);
            }
            TextView status_tv2 = getStatus_tv();
            if (status_tv2 != null) {
                status_tv2.setText(this.mContext.getString(Ya.g.cs_oc_oops));
            }
            TextView submit_msg_txt2 = getSubmit_msg_txt();
            if (submit_msg_txt2 != null) {
                submit_msg_txt2.setText(this.msg);
            }
        }
        Button got_it_bt = getGot_it_bt();
        if (got_it_bt != null) {
            p220oa.h.l(new ViewOnClickListenerC1533v(this, 9), got_it_bt);
        }
    }
}
