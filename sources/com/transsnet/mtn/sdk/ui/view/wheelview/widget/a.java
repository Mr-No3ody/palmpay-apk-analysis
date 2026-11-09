package com.transsnet.mtn.sdk.ui.view.wheelview.widget;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WheelView f25773a;

    public a(WheelView wheelView) {
        this.f25773a = wheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 256) {
            WheelView wheelView = this.f25773a;
            WheelView.f fVar = wheelView.t;
            if (fVar != null) {
                fVar.a(wheelView.getCurrentPosition(), wheelView.getSelectionItem());
            }
            wheelView.getClass();
        }
    }
}
