package com.pp.faceguard.traffic;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24658c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f24656a = i7;
        this.f24657b = obj;
        this.f24658c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f24656a) {
            case 0:
                ((BindingCallback) this.f24657b).onSuccess((DeviceTokenBinding) this.f24658c);
                break;
            default:
                ((TrafficUploader) this.f24657b).lambda$accept$0((TrafficEvent) this.f24658c);
                break;
        }
    }
}
