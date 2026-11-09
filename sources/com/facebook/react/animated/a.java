package com.facebook.react.animated;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements AnimatedNodeValueListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAnimatedModule f21691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21692c;

    public /* synthetic */ a(NativeAnimatedModule nativeAnimatedModule, int i7, int i10) {
        this.f21690a = i10;
        this.f21691b = nativeAnimatedModule;
        this.f21692c = i7;
    }

    @Override // com.facebook.react.animated.AnimatedNodeValueListener
    public final void onValueUpdate(double d2, double d10) {
        switch (this.f21690a) {
            case 0:
                NativeAnimatedModule.startListeningToAnimatedNodeValue$lambda$6(this.f21691b, this.f21692c, d2, d10);
                break;
            default:
                NativeAnimatedModule.C13701.execute$lambda$1(this.f21691b, this.f21692c, d2, d10);
                break;
        }
    }
}
