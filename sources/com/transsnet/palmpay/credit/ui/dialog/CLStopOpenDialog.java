package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\fR\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u001aR\u001d\u0010#\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%¨\u0006("}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLStopOpenDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "", "title", "setDialogTitle", "(Ljava/lang/String;)V", FirebaseAnalytics.Param.CONTENT, "setContent", "posBtTxt", "setPosBtTxt", "Landroid/widget/Button;", "stop_ok_bt$delegate", "Lkotlin/Lazy;", "getStop_ok_bt", "()Landroid/widget/Button;", "stop_ok_bt", "Landroid/widget/TextView;", "stop_content_tv$delegate", "getStop_content_tv", "()Landroid/widget/TextView;", "stop_content_tv", "stop_title_tv$delegate", "getStop_title_tv", "stop_title_tv", "Landroid/widget/ImageView;", "ivClose$delegate", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "mTitle", "Ljava/lang/String;", "mContent", "mPosBtTxt", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLStopOpenDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Nullable
    private String mContent;

    @Nullable
    private String mPosBtTxt;

    @Nullable
    private String mTitle;

    /* JADX INFO: renamed from: stop_content_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy stop_content_tv;

    /* JADX INFO: renamed from: stop_ok_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy stop_ok_bt;

    /* JADX INFO: renamed from: stop_title_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy stop_title_tv;

    public CLStopOpenDialog(@Nullable Context context) {
        super(context, Ya.f.cs_cl_open_error_dialog_layout);
        final int i7 = 0;
        this.stop_ok_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLStopOpenDialog f30080b;

            {
                this.f30080b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CLStopOpenDialog.stop_ok_bt_delegate$lambda$0(this.f30080b);
                    case 1:
                        return CLStopOpenDialog.stop_content_tv_delegate$lambda$1(this.f30080b);
                    case 2:
                        return CLStopOpenDialog.stop_title_tv_delegate$lambda$2(this.f30080b);
                    default:
                        return CLStopOpenDialog.ivClose_delegate$lambda$3(this.f30080b);
                }
            }
        });
        final int i10 = 1;
        this.stop_content_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLStopOpenDialog f30080b;

            {
                this.f30080b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLStopOpenDialog.stop_ok_bt_delegate$lambda$0(this.f30080b);
                    case 1:
                        return CLStopOpenDialog.stop_content_tv_delegate$lambda$1(this.f30080b);
                    case 2:
                        return CLStopOpenDialog.stop_title_tv_delegate$lambda$2(this.f30080b);
                    default:
                        return CLStopOpenDialog.ivClose_delegate$lambda$3(this.f30080b);
                }
            }
        });
        final int i11 = 2;
        this.stop_title_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLStopOpenDialog f30080b;

            {
                this.f30080b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLStopOpenDialog.stop_ok_bt_delegate$lambda$0(this.f30080b);
                    case 1:
                        return CLStopOpenDialog.stop_content_tv_delegate$lambda$1(this.f30080b);
                    case 2:
                        return CLStopOpenDialog.stop_title_tv_delegate$lambda$2(this.f30080b);
                    default:
                        return CLStopOpenDialog.ivClose_delegate$lambda$3(this.f30080b);
                }
            }
        });
        final int i12 = 3;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLStopOpenDialog f30080b;

            {
                this.f30080b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return CLStopOpenDialog.stop_ok_bt_delegate$lambda$0(this.f30080b);
                    case 1:
                        return CLStopOpenDialog.stop_content_tv_delegate$lambda$1(this.f30080b);
                    case 2:
                        return CLStopOpenDialog.stop_title_tv_delegate$lambda$2(this.f30080b);
                    default:
                        return CLStopOpenDialog.ivClose_delegate$lambda$3(this.f30080b);
                }
            }
        });
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    private final TextView getStop_content_tv() {
        return (TextView) this.stop_content_tv.getValue();
    }

    private final Button getStop_ok_bt() {
        return (Button) this.stop_ok_bt.getValue();
    }

    private final TextView getStop_title_tv() {
        return (TextView) this.stop_title_tv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$3(CLStopOpenDialog cLStopOpenDialog) {
        return (ImageView) cLStopOpenDialog.findViewById(Ya.e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView stop_content_tv_delegate$lambda$1(CLStopOpenDialog cLStopOpenDialog) {
        return (TextView) cLStopOpenDialog.findViewById(Ya.e.stop_content_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button stop_ok_bt_delegate$lambda$0(CLStopOpenDialog cLStopOpenDialog) {
        return (Button) cLStopOpenDialog.findViewById(Ya.e.stop_ok_bt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView stop_title_tv_delegate$lambda$2(CLStopOpenDialog cLStopOpenDialog) {
        return (TextView) cLStopOpenDialog.findViewById(Ya.e.stop_title_tv);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Button stop_ok_bt;
        TextView stop_content_tv;
        TextView stop_title_tv;
        if (!TextUtils.isEmpty(this.mTitle) && (stop_title_tv = getStop_title_tv()) != null) {
            stop_title_tv.setText(this.mTitle);
        }
        if (!TextUtils.isEmpty(this.mContent) && (stop_content_tv = getStop_content_tv()) != null) {
            stop_content_tv.setText(this.mContent);
        }
        if (!TextUtils.isEmpty(this.mPosBtTxt) && (stop_ok_bt = getStop_ok_bt()) != null) {
            stop_ok_bt.setText(this.mPosBtTxt);
        }
        ImageView ivClose = getIvClose();
        if (ivClose != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.a0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLStopOpenDialog f30077b;

                {
                    this.f30077b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30077b.dismiss();
                            break;
                        default:
                            this.f30077b.dismiss();
                            break;
                    }
                }
            }, ivClose);
        }
        Button stop_ok_bt2 = getStop_ok_bt();
        if (stop_ok_bt2 != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.a0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLStopOpenDialog f30077b;

                {
                    this.f30077b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30077b.dismiss();
                            break;
                        default:
                            this.f30077b.dismiss();
                            break;
                    }
                }
            }, stop_ok_bt2);
        }
    }

    public final void setContent(@Nullable String content) {
        this.mContent = content;
    }

    public final void setDialogTitle(@Nullable String title) {
        this.mTitle = title;
    }

    public final void setPosBtTxt(@Nullable String posBtTxt) {
        this.mPosBtTxt = posBtTxt;
    }
}
