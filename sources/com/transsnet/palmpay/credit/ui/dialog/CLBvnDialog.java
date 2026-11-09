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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLBvnDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Landroid/widget/TextView;", "countdown_tv$delegate", "Lkotlin/Lazy;", "getCountdown_tv", "()Landroid/widget/TextView;", "countdown_tv", "bvn_content_tv$delegate", "getBvn_content_tv", "bvn_content_tv", "", "countdown", "I", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "mRunnable$delegate", "getMRunnable", "()Ljava/lang/Runnable;", "mRunnable", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLBvnDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: bvn_content_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bvn_content_tv;
    private int countdown;

    /* JADX INFO: renamed from: countdown_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy countdown_tv;

    @NotNull
    private final Handler handler;

    /* JADX INFO: renamed from: mRunnable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRunnable;

    public CLBvnDialog(@Nullable Context context) {
        super(context, Ya.f.cs_cl_bvn_dialog_layout);
        final int i7 = 0;
        this.countdown_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBvnDialog f30151b;

            {
                this.f30151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CLBvnDialog.countdown_tv_delegate$lambda$0(this.f30151b);
                    case 1:
                        return CLBvnDialog.bvn_content_tv_delegate$lambda$1(this.f30151b);
                    default:
                        return CLBvnDialog.mRunnable_delegate$lambda$3(this.f30151b);
                }
            }
        });
        final int i10 = 1;
        this.bvn_content_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBvnDialog f30151b;

            {
                this.f30151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLBvnDialog.countdown_tv_delegate$lambda$0(this.f30151b);
                    case 1:
                        return CLBvnDialog.bvn_content_tv_delegate$lambda$1(this.f30151b);
                    default:
                        return CLBvnDialog.mRunnable_delegate$lambda$3(this.f30151b);
                }
            }
        });
        this.countdown = 3;
        this.handler = new Handler(Looper.getMainLooper());
        final int i11 = 2;
        this.mRunnable = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBvnDialog f30151b;

            {
                this.f30151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLBvnDialog.countdown_tv_delegate$lambda$0(this.f30151b);
                    case 1:
                        return CLBvnDialog.bvn_content_tv_delegate$lambda$1(this.f30151b);
                    default:
                        return CLBvnDialog.mRunnable_delegate$lambda$3(this.f30151b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView bvn_content_tv_delegate$lambda$1(CLBvnDialog cLBvnDialog) {
        return (TextView) cLBvnDialog.findViewById(Ya.e.bvn_content_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView countdown_tv_delegate$lambda$0(CLBvnDialog cLBvnDialog) {
        return (TextView) cLBvnDialog.findViewById(Ya.e.countdown_tv);
    }

    private final TextView getBvn_content_tv() {
        return (TextView) this.bvn_content_tv.getValue();
    }

    private final TextView getCountdown_tv() {
        return (TextView) this.countdown_tv.getValue();
    }

    private final Runnable getMRunnable() {
        return (Runnable) this.mRunnable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable mRunnable_delegate$lambda$3(CLBvnDialog cLBvnDialog) {
        return new com.transsnet.adsdk.widgets.banner.bannerview.b(cLBvnDialog, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mRunnable_delegate$lambda$3$lambda$2(CLBvnDialog cLBvnDialog) {
        cLBvnDialog.countdown--;
        TextView countdown_tv = cLBvnDialog.getCountdown_tv();
        if (countdown_tv != null) {
            countdown_tv.setText(cLBvnDialog.mContext.getString(Ya.g.cs_cl_go_to_bvn, Integer.valueOf(cLBvnDialog.countdown)));
        }
        if (cLBvnDialog.countdown == 0) {
            cLBvnDialog.dismiss();
        } else {
            cLBvnDialog.handler.postDelayed(cLBvnDialog.getMRunnable(), 1000L);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setCancelable(false);
        TextView bvn_content_tv = getBvn_content_tv();
        if (bvn_content_tv != null) {
            C0.G.w(this.mContext, Ya.b.cs_cl_main_color, com.horcrux.svg.d0.i(this.mContext, L6.b.ppColorTextNormal, com.horcrux.svg.d0.i(this.mContext, Ya.b.cs_cl_main_color, com.horcrux.svg.d0.i(this.mContext, L6.b.ppColorTextNormal, C0.G.i("To ensure your"), " account‘s security"), " , platform needs to collect your BVN information. After passing the BVN certification your"), " security level will be upgraded"), bvn_content_tv);
        }
        TextView countdown_tv = getCountdown_tv();
        if (countdown_tv != null) {
            countdown_tv.setText(this.mContext.getString(Ya.g.cs_cl_go_to_bvn, Integer.valueOf(this.countdown)));
        }
        this.handler.postDelayed(getMRunnable(), 1000L);
    }
}
