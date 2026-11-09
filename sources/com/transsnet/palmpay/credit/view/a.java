package com.transsnet.palmpay.credit.view;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountdownTextView f30889a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CountdownTextView countdownTextView, long j6) {
        super(j6, 1000L);
        this.f30889a = countdownTextView;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        int i7 = CountdownTextView.f30725f;
        CountdownTextView countdownTextView = this.f30889a;
        countdownTextView.b(0L);
        countdownTextView.f30728c = false;
        CountdownTextView.CountdownListener countdownListener = countdownTextView.f30729d;
        if (countdownListener != null) {
            countdownListener.onCountdownFinished();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j6) {
        int i7 = CountdownTextView.f30725f;
        this.f30889a.b(j6);
    }
}
