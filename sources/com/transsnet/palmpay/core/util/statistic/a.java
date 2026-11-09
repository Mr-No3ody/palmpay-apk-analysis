package com.transsnet.palmpay.core.util.statistic;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f28192b;

    public /* synthetic */ a(HashMap map, int i7) {
        this.f28191a = i7;
        this.f28192b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28191a) {
            case 0:
                AutoTrackHelper.lambda$trackDialogOnShow$3(this.f28192b);
                break;
            default:
                AutoTrackHelper.lambda$trackFragmentAppViewScreen$0(this.f28192b);
                break;
        }
    }
}
