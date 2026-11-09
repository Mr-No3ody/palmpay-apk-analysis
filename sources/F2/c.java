package F2;

import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.facebook.common.internal.Fn;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawable.base.DrawableWithCaches;
import com.facebook.drawee.components.DeferredReleaser$Releasable;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.m;
import com.facebook.drawee.gestures.GestureDetector$ClickListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.interfaces.SettableDraweeHierarchy;
import com.facebook.imagepipeline.image.ImageInfo;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements DraweeController, DeferredReleaser$Releasable, GestureDetector$ClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Map f2532r = p213o2.d.a("component_tag", "drawee");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Map f2533s = p213o2.d.b("origin", "memory_bitmap", "origin_sub", "shortcut");
    public static final Class t = c.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E2.c f2534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E2.a f2535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p180m2.d f2536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ControllerListener f2537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S2.g f2538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SettableDraweeHierarchy f2539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public G2.a f2540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f2542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f2546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public DataSource f2547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f2548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f2550q;

    public c(E2.a aVar, p180m2.d dVar) {
        this.f2534a = E2.c.f2208c ? new E2.c() : E2.c.f2207b;
        this.f2538e = new S2.g();
        this.f2549p = true;
        this.f2535b = aVar;
        this.f2536c = dVar;
        f(null, null);
    }

    public final void a(ControllerListener controllerListener) {
        controllerListener.getClass();
        ControllerListener controllerListener2 = this.f2537d;
        if (controllerListener2 instanceof b) {
            ((b) controllerListener2).a(controllerListener);
            return;
        }
        if (controllerListener2 == null) {
            this.f2537d = controllerListener;
            return;
        }
        p181m3.a.a();
        b bVar = new b();
        bVar.a(controllerListener2);
        bVar.a(controllerListener);
        p181m3.a.a();
        this.f2537d = bVar;
    }

    public abstract Drawable b(Object obj);

    public final ControllerListener c() {
        ControllerListener controllerListener = this.f2537d;
        return controllerListener == null ? g.f2566a : controllerListener;
    }

    public abstract ImageInfo d(Object obj);

    public final SettableDraweeHierarchy e() {
        SettableDraweeHierarchy settableDraweeHierarchy = this.f2539f;
        if (settableDraweeHierarchy != null) {
            return settableDraweeHierarchy;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.f2542i);
    }

    public final synchronized void f(Object obj, String str) {
        E2.a aVar;
        try {
            p181m3.a.a();
            this.f2534a.a(E2.b.f2199f);
            if (!this.f2549p && (aVar = this.f2535b) != null) {
                aVar.a(this);
            }
            this.f2543j = false;
            m();
            ControllerListener controllerListener = this.f2537d;
            if (controllerListener instanceof b) {
                b bVar = (b) controllerListener;
                synchronized (bVar) {
                    bVar.f2567a.clear();
                }
            } else {
                this.f2537d = null;
            }
            SettableDraweeHierarchy settableDraweeHierarchy = this.f2539f;
            if (settableDraweeHierarchy != null) {
                settableDraweeHierarchy.reset();
                this.f2539f.setControllerOverlay(null);
                this.f2539f = null;
            }
            this.f2540g = null;
            if (p229p2.a.f41180a.isLoggable(2)) {
                p229p2.a.q(t, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f2541h, str);
            }
            this.f2541h = str;
            this.f2542i = obj;
            p181m3.a.a();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean g(String str, DataSource dataSource) {
        if (dataSource == null && this.f2547n == null) {
            return true;
        }
        return str.equals(this.f2541h) && dataSource == this.f2547n && this.f2544k;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public final Animatable getAnimatable() {
        Object obj = this.f2550q;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public final String getContentDescription() {
        return this.f2546m;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public final DraweeHierarchy getHierarchy() {
        return this.f2539f;
    }

    public final void h(String str, Throwable th) {
        if (p229p2.a.f41180a.isLoggable(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.f2541h;
            if (p229p2.a.f41180a.isLoggable(2)) {
                p229p2.b.a(2, t.getSimpleName(), String.format(null, "controller %x %s: %s: failure: %s", numValueOf, str2, str, th));
            }
        }
    }

    public final void i(Object obj, String str) {
        if (p229p2.a.f41180a.isLoggable(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.f2541h;
            String simpleName = obj != null ? obj.getClass().getSimpleName() : "<null>";
            CloseableReference closeableReference = (CloseableReference) obj;
            Object[] objArr = {numValueOf, str2, str, simpleName, Integer.valueOf((closeableReference == null || !closeableReference.g()) ? 0 : System.identityHashCode(closeableReference.f21219b.a()))};
            if (p229p2.a.f41180a.isLoggable(2)) {
                p229p2.b.a(2, t.getSimpleName(), String.format(null, "controller %x %s: %s: image: %s %x", objArr));
            }
        }
    }

    public final S2.d j(Map map, Map map2) {
        SettableDraweeHierarchy settableDraweeHierarchy = this.f2539f;
        if (settableDraweeHierarchy instanceof I2.a) {
            I2.a aVar = (I2.a) settableDraweeHierarchy;
            String.valueOf(!(aVar.e(2) instanceof m) ? null : aVar.f(2).f21323a);
            if (aVar.e(2) instanceof m) {
                aVar.f(2).getClass();
            }
        }
        SettableDraweeHierarchy settableDraweeHierarchy2 = this.f2539f;
        Rect bounds = settableDraweeHierarchy2 != null ? settableDraweeHierarchy2.getBounds() : null;
        Object obj = this.f2542i;
        Map componentAttribution = f2532r;
        Intrinsics.checkNotNullParameter(componentAttribution, "componentAttribution");
        Map shortcutAttribution = f2533s;
        Intrinsics.checkNotNullParameter(shortcutAttribution, "shortcutAttribution");
        S2.d dVar = new S2.d();
        if (bounds != null) {
            bounds.width();
            bounds.height();
        }
        dVar.f8655e = obj;
        dVar.f8653c = map;
        dVar.f8654d = map2;
        dVar.f8652b = shortcutAttribution;
        dVar.f8651a = componentAttribution;
        return dVar;
    }

    public final void k(String str, DataSource dataSource, Throwable th, boolean z3) {
        p181m3.a.a();
        if (!g(str, dataSource)) {
            h("ignore_old_datasource @ onFailure", th);
            dataSource.close();
            p181m3.a.a();
            return;
        }
        this.f2534a.a(z3 ? E2.b.f2205v : E2.b.f2206w);
        S2.g gVar = this.f2538e;
        if (z3) {
            h("final_failed @ onFailure", th);
            this.f2547n = null;
            this.f2545l = true;
            SettableDraweeHierarchy settableDraweeHierarchy = this.f2539f;
            if (settableDraweeHierarchy != null) {
                settableDraweeHierarchy.setFailure(th);
            }
            S2.d dVarJ = j(dataSource == null ? null : dataSource.getExtras(), null);
            c().onFailure(this.f2541h, th);
            gVar.onFailure(this.f2541h, th, dVarJ);
        } else {
            h("intermediate_failed @ onFailure", th);
            c().onIntermediateImageFailed(this.f2541h, th);
            gVar.onIntermediateImageFailed(this.f2541h);
        }
        p181m3.a.a();
    }

    public final void l(String str, DataSource dataSource, Object obj, float f10, boolean z3, boolean z8, boolean z10) {
        try {
            p181m3.a.a();
            if (!g(str, dataSource)) {
                i(obj, "ignore_old_datasource @ onNewResult");
                CloseableReference.d((CloseableReference) obj);
                dataSource.close();
                p181m3.a.a();
                return;
            }
            this.f2534a.a(z3 ? E2.b.f2204p : E2.b.t);
            try {
                Drawable drawableB = b(obj);
                Object obj2 = this.f2548o;
                Object obj3 = this.f2550q;
                this.f2548o = obj;
                this.f2550q = drawableB;
                Map<String, Object> extras = null;
                try {
                    if (z3) {
                        i(obj, "set_final_result @ onNewResult");
                        this.f2547n = null;
                        e().setImage(drawableB, 1.0f, z8);
                        ImageInfo imageInfoD = d(obj);
                        c().onFinalImageSet(str, imageInfoD, getAnimatable());
                        ImageInfo imageInfo = imageInfoD;
                        Map<String, Object> extras2 = dataSource == null ? null : dataSource.getExtras();
                        ImageInfo imageInfo2 = imageInfo;
                        if (imageInfo2 != null) {
                            extras = imageInfo2.getExtras();
                        }
                        this.f2538e.onFinalImageSet(str, imageInfoD, j(extras2, extras));
                    } else if (z10) {
                        i(obj, "set_temporary_result @ onNewResult");
                        e().setImage(drawableB, 1.0f, z8);
                        ImageInfo imageInfoD2 = d(obj);
                        c().onFinalImageSet(str, imageInfoD2, getAnimatable());
                        ImageInfo imageInfo3 = imageInfoD2;
                        Map<String, Object> extras3 = dataSource == null ? null : dataSource.getExtras();
                        ImageInfo imageInfo4 = imageInfo3;
                        if (imageInfo4 != null) {
                            extras = imageInfo4.getExtras();
                        }
                        this.f2538e.onFinalImageSet(str, imageInfoD2, j(extras3, extras));
                    } else {
                        i(obj, "set_intermediate_result @ onNewResult");
                        e().setImage(drawableB, f10, z8);
                        ImageInfo imageInfoD3 = d(obj);
                        c().onIntermediateImageSet(str, imageInfoD3);
                        this.f2538e.onIntermediateImageSet(str, imageInfoD3);
                    }
                    if (obj3 != null && obj3 != drawableB && (obj3 instanceof DrawableWithCaches)) {
                        ((DrawableWithCaches) obj3).dropCaches();
                    }
                    if (obj2 != null && obj2 != obj) {
                        i(obj2, "release_previous_result @ onNewResult");
                        CloseableReference.d((CloseableReference) obj2);
                    }
                    p181m3.a.a();
                } catch (Throwable th) {
                    if (obj3 != null && obj3 != drawableB && (obj3 instanceof DrawableWithCaches)) {
                        ((DrawableWithCaches) obj3).dropCaches();
                    }
                    if (obj2 != null && obj2 != obj) {
                        i(obj2, "release_previous_result @ onNewResult");
                        CloseableReference.d((CloseableReference) obj2);
                    }
                    throw th;
                }
            } catch (Exception e10) {
                i(obj, "drawable_failed @ onNewResult");
                CloseableReference.d((CloseableReference) obj);
                k(str, dataSource, e10, z3);
                p181m3.a.a();
            }
        } catch (Throwable th2) {
            p181m3.a.a();
            throw th2;
        }
    }

    public final void m() {
        Map<String, Object> extras;
        boolean z3 = this.f2544k;
        this.f2544k = false;
        this.f2545l = false;
        DataSource dataSource = this.f2547n;
        Map<String, Object> map = null;
        if (dataSource != null) {
            extras = dataSource.getExtras();
            this.f2547n.close();
            this.f2547n = null;
        } else {
            extras = null;
        }
        Object obj = this.f2550q;
        if (obj != null && (obj instanceof DrawableWithCaches)) {
            ((DrawableWithCaches) obj).dropCaches();
        }
        if (this.f2546m != null) {
            this.f2546m = null;
        }
        this.f2550q = null;
        Object obj2 = this.f2548o;
        if (obj2 != null) {
            ImageInfo imageInfoD = d(obj2);
            Map<String, Object> extras2 = imageInfoD == null ? null : imageInfoD.getExtras();
            i(this.f2548o, "release");
            CloseableReference.d((CloseableReference) this.f2548o);
            this.f2548o = null;
            map = extras2;
        }
        if (z3) {
            c().onRelease(this.f2541h);
            this.f2538e.onRelease(this.f2541h, j(extras, map));
        }
    }

    public final void n(DataSource dataSource, ImageInfo imageInfo) {
        c().onSubmit(this.f2541h, this.f2542i);
        String str = this.f2541h;
        Object obj = this.f2542i;
        C2.a aVar = (C2.a) this;
        com.facebook.imagepipeline.request.d dVar = aVar.f1147z;
        com.facebook.imagepipeline.request.d dVar2 = aVar.f1141A;
        Fn<com.facebook.imagepipeline.request.d, Uri> requestToUri = com.facebook.imagepipeline.request.d.REQUEST_TO_URI_FN;
        Intrinsics.checkNotNullParameter(requestToUri, "requestToUri");
        if ((dVar != null ? requestToUri.apply(dVar) : null) == null && dVar2 != null) {
            requestToUri.apply(dVar2);
        }
        ImageInfo imageInfo2 = imageInfo;
        this.f2538e.onSubmit(str, obj, j(dataSource == null ? null : dataSource.getExtras(), imageInfo2 != null ? imageInfo2.getExtras() : null));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00b3 */
    @Override // com.facebook.drawee.interfaces.DraweeController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttach() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.c.onAttach():void");
    }

    @Override // com.facebook.drawee.gestures.GestureDetector$ClickListener
    public final boolean onClick() {
        if (!p229p2.a.f41180a.isLoggable(2)) {
            return false;
        }
        p229p2.a.p(t, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f2541h);
        return false;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public final void onDetach() {
        p181m3.a.a();
        if (p229p2.a.f41180a.isLoggable(2)) {
            p229p2.a.p(t, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f2541h);
        }
        this.f2534a.a(E2.b.f2201i);
        this.f2543j = false;
        E2.a aVar = this.f2535b;
        aVar.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            synchronized (aVar.f2183b) {
                try {
                    if (!((ArrayList) aVar.f2185d).contains(this)) {
                        ((ArrayList) aVar.f2185d).add(this);
                        boolean z3 = ((ArrayList) aVar.f2185d).size() == 1;
                        if (z3) {
                            ((Handler) aVar.f2184c).post((B5.c) aVar.f2187f);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            release();
        }
        p181m3.a.a();
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!p229p2.a.f41180a.isLoggable(2)) {
            return false;
        }
        p229p2.a.q(t, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f2541h, motionEvent);
        return false;
    }

    @Override // com.facebook.drawee.components.DeferredReleaser$Releasable
    public final void release() {
        this.f2534a.a(E2.b.f2202j);
        SettableDraweeHierarchy settableDraweeHierarchy = this.f2539f;
        if (settableDraweeHierarchy != null) {
            settableDraweeHierarchy.reset();
        }
        m();
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public final void setContentDescription(String str) {
        this.f2546m = str;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public void setHierarchy(DraweeHierarchy draweeHierarchy) {
        if (p229p2.a.f41180a.isLoggable(2)) {
            p229p2.a.q(t, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f2541h, draweeHierarchy);
        }
        this.f2534a.a(draweeHierarchy != null ? E2.b.f2194a : E2.b.f2195b);
        if (this.f2544k) {
            this.f2535b.a(this);
            release();
        }
        SettableDraweeHierarchy settableDraweeHierarchy = this.f2539f;
        if (settableDraweeHierarchy != null) {
            settableDraweeHierarchy.setControllerOverlay(null);
            this.f2539f = null;
        }
        if (draweeHierarchy != null) {
            if (!(draweeHierarchy instanceof SettableDraweeHierarchy)) {
                throw new IllegalArgumentException();
            }
            SettableDraweeHierarchy settableDraweeHierarchy2 = (SettableDraweeHierarchy) draweeHierarchy;
            this.f2539f = settableDraweeHierarchy2;
            settableDraweeHierarchy2.setControllerOverlay(this.f2540g);
        }
    }

    public String toString() {
        androidx.camera.video.internal.c cVarM = p213o2.e.m(this);
        cVarM.b("isAttached", this.f2543j);
        cVarM.b("isRequestSubmitted", this.f2544k);
        cVarM.b("hasFetchFailed", this.f2545l);
        CloseableReference closeableReference = (CloseableReference) this.f2548o;
        cVarM.a((closeableReference == null || !closeableReference.g()) ? 0 : System.identityHashCode(closeableReference.f21219b.a()), "fetchedImage");
        cVarM.c(this.f2534a.f2209a.toString(), "events");
        return cVarM.toString();
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public final void onViewportVisibilityHint(boolean z3) {
    }
}
