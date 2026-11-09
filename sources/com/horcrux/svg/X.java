package com.horcrux.svg;

/* JADX INFO: loaded from: classes3.dex */
public final class X implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f23412b;

    public /* synthetic */ X(Runnable runnable, int i7) {
        this.f23411a = i7;
        this.f23412b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23411a) {
            case 0:
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(((Y) this.f23412b).f23413a);
                if (svgViewByTag != null) {
                    svgViewByTag.setToDataUrlTask(new X(this, 2));
                    break;
                }
                break;
            case 1:
                Y y8 = (Y) this.f23412b;
                SvgViewModule.toDataURL(y8.f23413a, y8.f23414b, y8.f23415c, y8.f23416d + 1);
                break;
            default:
                Y y10 = (Y) ((X) this.f23412b).f23412b;
                SvgViewModule.toDataURL(y10.f23413a, y10.f23414b, y10.f23415c, y10.f23416d + 1);
                break;
        }
    }
}
