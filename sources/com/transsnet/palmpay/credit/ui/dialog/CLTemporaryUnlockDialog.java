package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.timepicker.TimeModel;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.bean.resp.TemporaryUnlockResp;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLTemporaryUnlockDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/credit/bean/resp/TemporaryUnlockResp;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/credit/bean/resp/TemporaryUnlockResp;)V", "", "initView", "()V", "setListener", "initViews", "", "remainingTime", "updateCountDown", "(J)V", "Lcom/transsnet/palmpay/credit/bean/resp/TemporaryUnlockResp;", "Landroid/widget/TextView;", "tvExpireIn", "Landroid/widget/TextView;", "tvExpireMinute", "tvExpireSecond", "tvExpireTips", "Lcom/mikepenz/iconics/view/IconicsImageView;", "iivClose", "Lcom/mikepenz/iconics/view/IconicsImageView;", "Lcom/palmpay/lib/ui/button/PpButton;", "btnConfirm", "Lcom/palmpay/lib/ui/button/PpButton;", "tvUnlockTimes", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLTemporaryUnlockDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private PpButton btnConfirm;

    @Nullable
    private final TemporaryUnlockResp data;

    @Nullable
    private IconicsImageView iivClose;

    @Nullable
    private TextView tvExpireIn;

    @Nullable
    private TextView tvExpireMinute;

    @Nullable
    private TextView tvExpireSecond;

    @Nullable
    private TextView tvExpireTips;

    @Nullable
    private TextView tvUnlockTimes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLTemporaryUnlockDialog(@NotNull Context context, @Nullable TemporaryUnlockResp temporaryUnlockResp) {
        super(context, Ya.f.cs_cl_temporary_unlock_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        this.data = temporaryUnlockResp;
    }

    private final void initView() {
        this.tvExpireIn = (TextView) findViewById(Ya.e.tvExpireIn);
        this.tvExpireMinute = (TextView) findViewById(Ya.e.tvExpireMinute);
        this.tvExpireSecond = (TextView) findViewById(Ya.e.tvExpireSecond);
        this.tvExpireTips = (TextView) findViewById(Ya.e.tvExpireTips);
        this.iivClose = (IconicsImageView) findViewById(Ya.e.iivClose);
        this.btnConfirm = (PpButton) findViewById(Ya.e.btnConfirm);
        this.tvUnlockTimes = (TextView) findViewById(Ya.e.tvUnlockTimes);
    }

    private final void setListener() {
        IconicsImageView iconicsImageView = this.iivClose;
        if (iconicsImageView != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.d0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLTemporaryUnlockDialog f30088b;

                {
                    this.f30088b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30088b.dismiss();
                            break;
                        default:
                            this.f30088b.dismiss();
                            break;
                    }
                }
            }, iconicsImageView);
        }
        PpButton ppButton = this.btnConfirm;
        if (ppButton != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.d0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLTemporaryUnlockDialog f30088b;

                {
                    this.f30088b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30088b.dismiss();
                            break;
                        default:
                            this.f30088b.dismiss();
                            break;
                    }
                }
            }, ppButton);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        initView();
        setListener();
        TemporaryUnlockResp temporaryUnlockResp = this.data;
        if (temporaryUnlockResp != null) {
            TextView textView = this.tvExpireTips;
            if (textView != null) {
                textView.setText(temporaryUnlockResp.getUnlockSuccessContent());
            }
            TextView textView2 = this.tvUnlockTimes;
            if (textView2 != null) {
                Context context = getContext();
                int i7 = p116hb.f.cs_today_s_remaining_times;
                Integer remainingTimes = temporaryUnlockResp.getRemainingTimes();
                textView2.setText(context.getString(i7, String.valueOf(remainingTimes != null ? remainingTimes.intValue() : 0)));
            }
            Long expireTime = temporaryUnlockResp.getExpireTime();
            updateCountDown(expireTime != null ? expireTime.longValue() : 0L);
        }
    }

    public final void updateCountDown(long remainingTime) {
        long j6 = 60;
        long j10 = remainingTime / j6;
        long j11 = remainingTime % j6;
        TextView textView = this.tvExpireMinute;
        if (textView != null) {
            String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j10)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
        }
        TextView textView2 = this.tvExpireSecond;
        if (textView2 != null) {
            String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            textView2.setText(str2);
        }
    }
}
