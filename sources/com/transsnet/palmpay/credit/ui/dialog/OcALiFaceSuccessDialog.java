package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcALiFaceSuccessDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Landroid/widget/TextView;", "countdown_tv$delegate", "Lkotlin/Lazy;", "getCountdown_tv", "()Landroid/widget/TextView;", "countdown_tv", "", "countdown", "I", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "mRunnable$delegate", "getMRunnable", "()Ljava/lang/Runnable;", "mRunnable", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcALiFaceSuccessDialog extends com.transsnet.palmpay.custom_view.dialog.b {
    private int countdown;

    /* JADX INFO: renamed from: countdown_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy countdown_tv;

    @NotNull
    private final Handler handler;

    /* JADX INFO: renamed from: mRunnable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRunnable;

    public OcALiFaceSuccessDialog(@Nullable Context context) {
        super(context, Ya.f.cs_oc_ali_face_success_dialog_layout);
        final int i7 = 0;
        this.countdown_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceSuccessDialog f30194b;

            {
                this.f30194b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OcALiFaceSuccessDialog.countdown_tv_delegate$lambda$0(this.f30194b);
                    default:
                        return OcALiFaceSuccessDialog.mRunnable_delegate$lambda$2(this.f30194b);
                }
            }
        });
        this.countdown = 3;
        this.handler = new Handler(Looper.getMainLooper());
        final int i10 = 1;
        this.mRunnable = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceSuccessDialog f30194b;

            {
                this.f30194b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcALiFaceSuccessDialog.countdown_tv_delegate$lambda$0(this.f30194b);
                    default:
                        return OcALiFaceSuccessDialog.mRunnable_delegate$lambda$2(this.f30194b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView countdown_tv_delegate$lambda$0(OcALiFaceSuccessDialog ocALiFaceSuccessDialog) {
        return (TextView) ocALiFaceSuccessDialog.findViewById(Ya.e.countdown_tv);
    }

    private final TextView getCountdown_tv() {
        return (TextView) this.countdown_tv.getValue();
    }

    private final Runnable getMRunnable() {
        return (Runnable) this.mRunnable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable mRunnable_delegate$lambda$2(OcALiFaceSuccessDialog ocALiFaceSuccessDialog) {
        return new com.transsnet.adsdk.widgets.banner.bannerview.b(ocALiFaceSuccessDialog, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mRunnable_delegate$lambda$2$lambda$1(OcALiFaceSuccessDialog ocALiFaceSuccessDialog) {
        ocALiFaceSuccessDialog.countdown--;
        TextView countdown_tv = ocALiFaceSuccessDialog.getCountdown_tv();
        if (countdown_tv != null) {
            countdown_tv.setText(ocALiFaceSuccessDialog.mContext.getString(Ya.g.cs_continue_to_loan, Integer.valueOf(ocALiFaceSuccessDialog.countdown)));
        }
        if (ocALiFaceSuccessDialog.countdown == 0) {
            ocALiFaceSuccessDialog.dismiss();
        } else {
            ocALiFaceSuccessDialog.handler.postDelayed(ocALiFaceSuccessDialog.getMRunnable(), 1000L);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setCancelable(false);
        TextView countdown_tv = getCountdown_tv();
        if (countdown_tv != null) {
            countdown_tv.setText(this.mContext.getString(Ya.g.cs_continue_to_loan, Integer.valueOf(this.countdown)));
        }
        this.handler.postDelayed(getMRunnable(), 1000L);
    }
}
