package com.adjust.sdk;

import com.adjust.sdk.scheduler.TimerOnce;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.adjust.sdk.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1302s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f19413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19414c;

    public /* synthetic */ RunnableC1302s(int i7, String str, ArrayList arrayList) {
        this.f19412a = i7;
        this.f19413b = arrayList;
        this.f19414c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19412a) {
            case 0:
                ArrayList arrayList = this.f19413b;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    OnAdidReadListener onAdidReadListener = (OnAdidReadListener) obj;
                    if (onAdidReadListener != null) {
                        onAdidReadListener.onAdidRead(this.f19414c);
                    }
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f19413b;
                int size2 = arrayList2.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj2;
                    if (adjustTimeoutCallback != null) {
                        TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                        if (timeoutTimer != null) {
                            timeoutTimer.cancel();
                        }
                        OnAdidReadListener onAdidReadListener2 = adjustTimeoutCallback.getOnAdidReadListener();
                        if (onAdidReadListener2 != null) {
                            onAdidReadListener2.onAdidRead(this.f19414c);
                        }
                        adjustTimeoutCallback.setOnAdidReadListener(null);
                    }
                }
                break;
            case 2:
                ArrayList arrayList3 = this.f19413b;
                int size3 = arrayList3.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj3 = arrayList3.get(i11);
                    i11++;
                    OnAdidReadListener onAdidReadListener3 = (OnAdidReadListener) obj3;
                    if (onAdidReadListener3 != null) {
                        onAdidReadListener3.onAdidRead(this.f19414c);
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f19413b;
                int size4 = arrayList4.size();
                int i12 = 0;
                while (i12 < size4) {
                    Object obj4 = arrayList4.get(i12);
                    i12++;
                    AdjustTimeoutCallback adjustTimeoutCallback2 = (AdjustTimeoutCallback) obj4;
                    if (adjustTimeoutCallback2 != null) {
                        TimerOnce timeoutTimer2 = adjustTimeoutCallback2.getTimeoutTimer();
                        if (timeoutTimer2 != null) {
                            timeoutTimer2.cancel();
                        }
                        OnAdidReadListener onAdidReadListener4 = adjustTimeoutCallback2.getOnAdidReadListener();
                        if (onAdidReadListener4 != null) {
                            onAdidReadListener4.onAdidRead(this.f19414c);
                        }
                        adjustTimeoutCallback2.setOnAdidReadListener(null);
                    }
                }
                break;
        }
    }
}
