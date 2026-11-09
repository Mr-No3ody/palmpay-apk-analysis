package com.transsnet.palmpay.credit.ui.view;

import android.os.CountDownTimer;
import android.widget.TextView;
import androidx.camera.video.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextCountDownView f30662a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TextCountDownView textCountDownView) {
        super(3600000L, 1000L);
        this.f30662a = textCountDownView;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        TextCountDownView textCountDownView = this.f30662a;
        a aVar = textCountDownView.f30661e;
        if (aVar != null) {
            aVar.cancel();
            textCountDownView.f30661e = null;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j6) {
        String hours;
        String minutes;
        String seconds;
        long j10 = j6 / ((long) 1000);
        long j11 = 3600;
        long j12 = j10 - (((j10 / ((long) 86400)) * j11) * ((long) 24));
        long j13 = j12 / j11;
        long j14 = j12 - (j11 * j13);
        long j15 = 60;
        long j16 = j14 / j15;
        long j17 = j14 - (j15 * j16);
        if (j13 < 10) {
            hours = u.i(j13, "0");
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j13);
            hours = sb2.toString();
        }
        if (j16 < 10) {
            minutes = u.i(j16, "0");
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j16);
            minutes = sb3.toString();
        }
        if (j17 < 10) {
            seconds = u.i(j17, "0");
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(j17);
            seconds = sb4.toString();
        }
        TextCountDownView textCountDownView = this.f30662a;
        textCountDownView.getClass();
        Intrinsics.checkNotNullParameter(hours, "hours");
        Intrinsics.checkNotNullParameter(minutes, "minutes");
        Intrinsics.checkNotNullParameter(seconds, "seconds");
        TextView textView = textCountDownView.f30659c;
        if (textView != null) {
            textView.setText(u.n(hours, " : ", minutes, " : ", seconds));
        }
    }
}
