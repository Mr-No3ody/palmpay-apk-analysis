package com.appsflyer.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20409b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f20408a = i7;
        this.f20409b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20408a) {
            case 0:
                return ((AFa1uSDK.AFa1zSDK) this.f20409b).AFAdRevenueData();
            default:
                return ((AFc1dSDK) this.f20409b).o_();
        }
    }
}
