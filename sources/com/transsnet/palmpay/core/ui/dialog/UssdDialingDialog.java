package com.transsnet.palmpay.core.ui.dialog;

import Ha.j;
import Ha.k;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.transsnet.palmpay.custom_view.dialog.b;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.e;
import p025ba.g;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/transsnet/palmpay/core/ui/dialog/UssdDialingDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "stopCountDown", "()V", "initViews", "Lkotlinx/coroutines/CoroutineScope;", "scope", "startCountdown", "(Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/transsnet/palmpay/core/ui/dialog/UssdDialingDialog$OnUssdDialingListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnUssdDialingListener", "(Lcom/transsnet/palmpay/core/ui/dialog/UssdDialingDialog$OnUssdDialingListener;)V", "Landroid/widget/TextView;", "tv_second$delegate", "Lkotlin/Lazy;", "getTv_second", "()Landroid/widget/TextView;", "tv_second", "Lcom/google/android/material/progressindicator/CircularProgressIndicator;", "cpi_countdown$delegate", "getCpi_countdown", "()Lcom/google/android/material/progressindicator/CircularProgressIndicator;", "cpi_countdown", "", "initiativeCancel", "Z", "Lkotlinx/coroutines/Job;", "countDownTimeJob", "Lkotlinx/coroutines/Job;", "Lcom/transsnet/palmpay/core/ui/dialog/UssdDialingDialog$OnUssdDialingListener;", "", "countDownDuration", "J", "OnUssdDialingListener", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UssdDialingDialog extends b {
    private final long countDownDuration;

    @Nullable
    private Job countDownTimeJob;

    /* JADX INFO: renamed from: cpi_countdown$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cpi_countdown;
    private boolean initiativeCancel;

    @Nullable
    private OnUssdDialingListener listener;

    /* JADX INFO: renamed from: tv_second$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_second;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/core/ui/dialog/UssdDialingDialog$OnUssdDialingListener;", "", "onCountdownCompleted", "", "onCountdownStart", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnUssdDialingListener {
        void onCountdownCompleted();

        void onCountdownStart();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UssdDialingDialog(@NotNull Context context) {
        super(context, g.core_dialog_ussd_dialing);
        Intrinsics.checkNotNullParameter(context, "context");
        this.tv_second = C2131j.b(new j(this, 1));
        this.cpi_countdown = C2131j.b(new j(this, 2));
        this.countDownDuration = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CircularProgressIndicator cpi_countdown_delegate$lambda$1(UssdDialingDialog ussdDialingDialog) {
        return (CircularProgressIndicator) ussdDialingDialog.findViewById(e.cpi_countdown);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CircularProgressIndicator getCpi_countdown() {
        Object value = this.cpi_countdown.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CircularProgressIndicator) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTv_second() {
        Object value = this.tv_second.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(UssdDialingDialog ussdDialingDialog, DialogInterface dialogInterface) {
        if (ussdDialingDialog.countDownTimeJob != null) {
            ussdDialingDialog.stopCountDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startCountdown$lambda$3(UssdDialingDialog ussdDialingDialog) {
        OnUssdDialingListener onUssdDialingListener = ussdDialingDialog.listener;
        if (onUssdDialingListener != null) {
            onUssdDialingListener.onCountdownStart();
        }
        return Unit.f38893a;
    }

    private final void stopCountDown() {
        this.initiativeCancel = true;
        Job job = this.countDownTimeJob;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.countDownTimeJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_second_delegate$lambda$0(UssdDialingDialog ussdDialingDialog) {
        return (TextView) ussdDialingDialog.findViewById(e.tv_second);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        getCpi_countdown().setMax(10);
        getTv_second().setText("10s");
        setOnDismissListener(new Dd.b(this, 2));
    }

    public final void setOnUssdDialingListener(@NotNull OnUssdDialingListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void startCountdown(@NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.countDownTimeJob = org.chromium.support_lib_boundary.util.b.r(scope, this.countDownDuration, new j(this, 0), new a(this, null), new k(this, null), 6);
    }
}
