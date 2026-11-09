package com.adjust.sdk;

import com.adjust.sdk.scheduler.TimerOnce;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.adjust.sdk.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1308x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f19543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustAttribution f19544c;

    public /* synthetic */ RunnableC1308x(ArrayList arrayList, AdjustAttribution adjustAttribution, int i7) {
        this.f19542a = i7;
        this.f19543b = arrayList;
        this.f19544c = adjustAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19542a) {
            case 0:
                ArrayList arrayList = this.f19543b;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    OnAttributionReadListener onAttributionReadListener = (OnAttributionReadListener) obj;
                    if (onAttributionReadListener != null) {
                        onAttributionReadListener.onAttributionRead(this.f19544c);
                    }
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f19543b;
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
                        OnAttributionReadListener onAttributionReadListener2 = adjustTimeoutCallback.getOnAttributionReadListener();
                        if (onAttributionReadListener2 != null) {
                            onAttributionReadListener2.onAttributionRead(this.f19544c);
                        }
                        adjustTimeoutCallback.setOnAttributionReadListener(null);
                    }
                }
                break;
            case 2:
                ArrayList arrayList3 = this.f19543b;
                int size3 = arrayList3.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj3 = arrayList3.get(i11);
                    i11++;
                    OnAttributionReadListener onAttributionReadListener3 = (OnAttributionReadListener) obj3;
                    if (onAttributionReadListener3 != null) {
                        onAttributionReadListener3.onAttributionRead(this.f19544c);
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f19543b;
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
                        OnAttributionReadListener onAttributionReadListener4 = adjustTimeoutCallback2.getOnAttributionReadListener();
                        if (onAttributionReadListener4 != null) {
                            onAttributionReadListener4.onAttributionRead(this.f19544c);
                        }
                        adjustTimeoutCallback2.setOnAttributionReadListener(null);
                    }
                }
                break;
        }
    }
}
