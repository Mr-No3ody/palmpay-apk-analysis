package com.transsnet.palmpay.custom_view.wheelview.widget;

import P0.c;
import android.os.Handler;
import android.os.Message;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WheelView f31736a;

    public a(WheelView wheelView) {
        this.f31736a = wheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 256) {
            WheelView wheelView = this.f31736a;
            WheelView.OnWheelItemSelectedListener onWheelItemSelectedListener = wheelView.f31735w;
            if (onWheelItemSelectedListener != null) {
                onWheelItemSelectedListener.onItemSelected(wheelView.getCurrentPosition(), wheelView.getSelectionItem());
            }
            if (wheelView.f31733p != null) {
                if (wheelView.t.isEmpty()) {
                    throw new c("JoinList is error.", 2, false);
                }
                wheelView.f31733p.h((List) wheelView.t.get(wheelView.f31726d.get(wheelView.getCurrentPosition())));
            }
        }
    }
}
