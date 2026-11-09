package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RolloutsStateSubscriber f23072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RolloutsState f23073c;

    public /* synthetic */ a(RolloutsStateSubscriber rolloutsStateSubscriber, RolloutsState rolloutsState, int i7) {
        this.f23071a = i7;
        this.f23072b = rolloutsStateSubscriber;
        this.f23073c = rolloutsState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23071a) {
            case 0:
                this.f23072b.onRolloutsStateChanged(this.f23073c);
                break;
            default:
                this.f23072b.onRolloutsStateChanged(this.f23073c);
                break;
        }
    }
}
