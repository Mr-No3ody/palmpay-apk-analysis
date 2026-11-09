package com.adjust.sdk.network;

import com.adjust.sdk.ActivityPackage;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IActivityPackageSender.ResponseDataCallbackSubscriber f19393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityPackage f19394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f19395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ActivityPackageSender f19396d;

    public a(ActivityPackageSender activityPackageSender, IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber, ActivityPackage activityPackage, Map map) {
        this.f19396d = activityPackageSender;
        this.f19393a = responseDataCallbackSubscriber;
        this.f19394b = activityPackage;
        this.f19395c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19393a.onResponseDataCallback(this.f19396d.sendActivityPackageSync(this.f19394b, this.f19395c));
    }
}
