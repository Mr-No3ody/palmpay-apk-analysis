package com.google.maps.android.clustering.view;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23085b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f23084a = i7;
        this.f23085b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23084a) {
            case 0:
                ((ClusterRendererMultipleItems.AnimationTask) this.f23085b).cancel();
                break;
            case 1:
                ((ClusterRendererMultipleItems.ViewModifier) this.f23085b).lambda$handleMessage$0();
                break;
            case 2:
                ((DefaultAdvancedMarkersClusterRenderer.ViewModifier) this.f23085b).lambda$handleMessage$0();
                break;
            default:
                ((DefaultClusterRenderer.ViewModifier) this.f23085b).lambda$handleMessage$0();
                break;
        }
    }
}
