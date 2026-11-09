package com.transsnet.palmpay.core.ui.widget;

import Ab.D;
import android.content.Context;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.req.CntDownSecondsCommonReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CustomFloatingView f28183a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CustomFloatingView customFloatingView, long j6) {
        super(j6, 1000L);
        this.f28183a = customFloatingView;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        CustomFloatingView customFloatingView = this.f28183a;
        CntDownSecondsCommonReq req = new CntDownSecondsCommonReq(customFloatingView.getReqJsonStr());
        Intrinsics.checkNotNullParameter(req, "req");
        ((PayApiService) p324va.c.f43141a.f14621b).countdownSecondsCommon(req).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new D(customFloatingView, 24));
        customFloatingView.getCfv_tv1().setText(customFloatingView.getContext().getString(k.core_return_to_collect));
        customFloatingView.getCallBack().onCountDownFinish();
        customFloatingView.setCountDownFinished(true);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j6) {
        SpannableStringBuilder spannableStringBuilderCreate;
        CustomFloatingView customFloatingView = this.f28183a;
        TextView cfv_tv1 = customFloatingView.getCfv_tv1();
        int i7 = (int) (j6 / ((long) 1000));
        Context context = customFloatingView.f28122L;
        if (context != null) {
            spannableStringBuilderCreate = new SpanUtils().append(context.getString(k.core_collect_badge_after)).append(" " + i7 + " s").setForegroundColor(context.getResources().getColor(L6.b.ppColorPrimary)).create();
        } else {
            spannableStringBuilderCreate = null;
        }
        cfv_tv1.setText(spannableStringBuilderCreate);
    }
}
