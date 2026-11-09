package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes2.dex */
final class ar extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f22645a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.f22645a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i7, Bundle bundle) {
        if (i7 == 1) {
            this.f22645a.f22646a.trySetResult(3);
        } else if (i7 == 2) {
            this.f22645a.f22646a.trySetResult(2);
        } else {
            if (i7 != 3) {
                return;
            }
            this.f22645a.f22646a.trySetResult(1);
        }
    }
}
