package U4;

import N8.C0457a;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import com.didiglobal.booster.instrument.ShadowHandlerThread;
import com.didiglobal.booster.instrument.ShadowThread;
import com.growingio.android.circler.screenshot.ScreenshotProvider$OnScreenshotRefreshedListener;
import com.growingio.android.sdk.track.modelloader.ModelLoader;
import com.growingio.android.sdk.track.view.OnViewStateChangedListener;
import com.growingio.android.sdk.track.webservices.widget.TipView;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends D4.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f9249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9250g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f9251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f9252j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i7) {
        super(7);
        this.f9246c = i7;
        switch (i7) {
            case 1:
                super(7);
                this.f9247d = 0L;
                this.f9251i = new p024b9.g(this, 23);
                this.f9250g = 0L;
                DisplayMetrics displayMetricsB = p291t5.b.b(com.growingio.android.sdk.d.a().getApplicationContext());
                this.f9248e = 720.0f / Math.min(displayMetricsB.widthPixels, displayMetricsB.heightPixels);
                ShadowHandlerThread shadowHandlerThread = new ShadowHandlerThread("ScreenshotProvider", "\u200bcom.growingio.android.debugger.ScreenshotProvider");
                ShadowThread.setThreadName(shadowHandlerThread, "\u200bcom.growingio.android.debugger.ScreenshotProvider").start();
                this.f9249f = new Handler(shadowHandlerThread.getLooper());
                final int i10 = 1;
                p305u5.c.f42706a.r(new OnViewStateChangedListener() { // from class: U4.g
                    @Override // com.growingio.android.sdk.track.view.OnViewStateChangedListener
                    public final void onViewStateChanged(p305u5.b bVar) {
                        switch (i10) {
                            case 0:
                                i iVar = (i) this;
                                iVar.getClass();
                                if (System.currentTimeMillis() - iVar.f9247d < 1000) {
                                    iVar.x();
                                } else {
                                    iVar.f9247d = System.currentTimeMillis();
                                    iVar.f9249f.post(new f(iVar, 0));
                                }
                                break;
                            default:
                                i iVar2 = (i) this;
                                iVar2.getClass();
                                if (System.currentTimeMillis() - iVar2.f9247d < 600) {
                                    iVar2.x();
                                } else {
                                    iVar2.f9247d = System.currentTimeMillis();
                                    iVar2.f9249f.post(new p024b9.g(iVar2, 23));
                                }
                                break;
                        }
                    }
                });
                ModelLoader modelLoaderA = com.growingio.android.sdk.d.a().f23197a.a(p264r5.b.class);
                if (modelLoaderA != null) {
                    modelLoaderA.buildLoadData(new p264r5.b(new com.google.firebase.crashlytics.internal.concurrency.b(this, 5))).f41455a.executeData();
                }
                break;
            default:
                this.f9247d = System.currentTimeMillis();
                this.f9251i = new f(this, 0);
                this.f9250g = 0L;
                DisplayMetrics displayMetricsB2 = p291t5.b.b(com.growingio.android.sdk.d.a().getApplicationContext());
                this.f9248e = 720.0f / Math.min(displayMetricsB2.widthPixels, displayMetricsB2.heightPixels);
                ShadowHandlerThread shadowHandlerThread2 = new ShadowHandlerThread("ScreenshotProvider", "\u200bcom.growingio.android.circler.screenshot.ScreenshotProvider");
                ShadowThread.setThreadName(shadowHandlerThread2, "\u200bcom.growingio.android.circler.screenshot.ScreenshotProvider").start();
                this.f9249f = new Handler(shadowHandlerThread2.getLooper());
                final int i11 = 0;
                p305u5.c.f42706a.r(new OnViewStateChangedListener() { // from class: U4.g
                    @Override // com.growingio.android.sdk.track.view.OnViewStateChangedListener
                    public final void onViewStateChanged(p305u5.b bVar) {
                        switch (i11) {
                            case 0:
                                i iVar = (i) this;
                                iVar.getClass();
                                if (System.currentTimeMillis() - iVar.f9247d < 1000) {
                                    iVar.x();
                                } else {
                                    iVar.f9247d = System.currentTimeMillis();
                                    iVar.f9249f.post(new f(iVar, 0));
                                }
                                break;
                            default:
                                i iVar2 = (i) this;
                                iVar2.getClass();
                                if (System.currentTimeMillis() - iVar2.f9247d < 600) {
                                    iVar2.x();
                                } else {
                                    iVar2.f9247d = System.currentTimeMillis();
                                    iVar2.f9249f.post(new p024b9.g(iVar2, 23));
                                }
                                break;
                        }
                    }
                });
                w();
                break;
        }
    }

    @Override // D4.f
    public final void u(Object obj, Object obj2) {
        switch (this.f9246c) {
            case 0:
                ((ScreenshotProvider$OnScreenshotRefreshedListener) obj).onScreenshotRefreshed((c) obj2);
                break;
            default:
                ((com.growingio.android.debugger.ScreenshotProvider$OnScreenshotRefreshedListener) obj).onScreenshotRefreshed((com.growingio.android.debugger.e) obj2);
                break;
        }
    }

    public ModelLoader w() {
        if (((ModelLoader) this.f9252j) == null) {
            ModelLoader modelLoaderA = com.growingio.android.sdk.d.a().f23197a.a(p264r5.b.class);
            this.f9252j = modelLoaderA;
            if (modelLoaderA != null) {
                modelLoaderA.buildLoadData(new p264r5.b(new C0457a(this, 24))).f41455a.executeData();
            }
        }
        return (ModelLoader) this.f9252j;
    }

    public final void x() {
        switch (this.f9246c) {
            case 0:
                Handler handler = this.f9249f;
                f fVar = (f) this.f9251i;
                handler.removeCallbacks(fVar);
                handler.postDelayed(fVar, 500L);
                break;
            default:
                Handler handler2 = this.f9249f;
                p024b9.g gVar = (p024b9.g) this.f9251i;
                handler2.removeCallbacks(gVar);
                handler2.postDelayed(gVar, 300L);
                break;
        }
    }

    public final void y(String str, float f10) {
        switch (this.f9246c) {
            case 0:
                this.f9247d = System.currentTimeMillis();
                b bVar = new b();
                bVar.f9212c = f10;
                bVar.f9213d = str;
                long j6 = this.f9250g;
                this.f9250g = 1 + j6;
                bVar.f9214e = j6;
                Oe.a aVar = new Oe.a(this, 8);
                p305u5.f.f42708a.getClass();
                ArrayList<p305u5.a> arrayListB = C2085k0.b();
                if (arrayListB.isEmpty()) {
                    Oe.a aVar2 = bVar.f9219j;
                    if (aVar2 != null) {
                        aVar2.onFailed();
                    }
                } else {
                    bVar.f9219j = aVar;
                    DisplayMetrics displayMetricsB = p291t5.b.b(com.growingio.android.sdk.d.a().getApplicationContext());
                    bVar.f9210a = displayMetricsB.widthPixels;
                    bVar.f9211b = displayMetricsB.heightPixels;
                    bVar.f9217h.incrementAndGet();
                    for (p305u5.a aVar3 : arrayListB) {
                        View view = aVar3.f42700a;
                        if (!(view instanceof TipView) && view.getVisibility() != 8 && view.getWidth() > 0 && view.getHeight() > 0) {
                            View view2 = aVar3.f42700a;
                            bVar.b(view2);
                            bVar.d(n.n(view2, null));
                        }
                    }
                    bVar.a();
                }
                break;
            default:
                org.greenrobot.eventbus.f fVar = (org.greenrobot.eventbus.f) this.f9252j;
                if (fVar != null) {
                    fVar.dispose();
                }
                this.f9247d = System.currentTimeMillis();
                com.growingio.android.debugger.d dVar = new com.growingio.android.debugger.d();
                dVar.f23162c = f10;
                dVar.f23163d = str;
                long j10 = this.f9250g;
                this.f9250g = 1 + j10;
                dVar.f23164e = j10;
                Sd.b bVar2 = new Sd.b(this, 17);
                dVar.f23166g = new org.greenrobot.eventbus.f();
                dVar.f23165f = bVar2;
                DisplayMetrics displayMetricsB2 = p291t5.b.b(com.growingio.android.sdk.d.a().getApplicationContext());
                dVar.f23160a = displayMetricsB2.widthPixels;
                dVar.f23161b = displayMetricsB2.heightPixels;
                if (!((AtomicBoolean) dVar.f23166g.f41079b).get()) {
                    dVar.f23166g.dispose();
                    Sd.b bVar3 = dVar.f23165f;
                    if (bVar3 != null) {
                        bVar3.onSuccess(new com.growingio.android.debugger.e(dVar));
                    }
                }
                this.f9252j = dVar.f23166g;
                break;
        }
    }
}
