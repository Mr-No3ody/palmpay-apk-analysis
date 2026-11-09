package androidx.camera.video.internal.encoder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EncoderCallback f14711b;

    public /* synthetic */ s(EncoderCallback encoderCallback, int i7) {
        this.f14710a = i7;
        this.f14711b = encoderCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14710a) {
            case 0:
                this.f14711b.onEncodeStop();
                break;
            case 1:
                this.f14711b.onEncodeStart();
                break;
            default:
                this.f14711b.onEncodePaused();
                break;
        }
    }
}
