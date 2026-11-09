package com.flexibank.sdk.customview.wheelview.widget;

import P0.c;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p7.h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlexiBankWheelView f22293a;

    public a(FlexiBankWheelView flexiBankWheelView) {
        this.f22293a = flexiBankWheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what == 256) {
            FlexiBankWheelView flexiBankWheelView = this.f22293a;
            FlexiBankWheelView.OnWheelItemSelectedListener onWheelItemSelectedListener = flexiBankWheelView.f22292w;
            if (onWheelItemSelectedListener != null) {
                onWheelItemSelectedListener.onItemSelected(flexiBankWheelView.getCurrentPosition(), flexiBankWheelView.getSelectionItem());
            }
            if (flexiBankWheelView.f22290p != null) {
                HashMap map = flexiBankWheelView.t;
                Intrinsics.e(map);
                if (map.isEmpty()) {
                    throw new c("JoinList is error.", 19, false);
                }
                FlexiBankWheelView flexiBankWheelView2 = flexiBankWheelView.f22290p;
                Intrinsics.e(flexiBankWheelView2);
                HashMap map2 = flexiBankWheelView.t;
                Intrinsics.e(map2);
                List list = flexiBankWheelView.f22283d;
                Intrinsics.e(list);
                List list2 = (List) map2.get(String.valueOf(list.get(flexiBankWheelView.getCurrentPosition())));
                List list3 = list2;
                if (list3 == null || list3.size() == 0) {
                    throw new c("join map data is error.", 19, false);
                }
                flexiBankWheelView2.postDelayed(new h(flexiBankWheelView2, 16, list2, false), 10L);
            }
        }
    }
}
