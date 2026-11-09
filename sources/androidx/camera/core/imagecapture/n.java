package androidx.camera.core.imagecapture;

import E.Q;
import E.V;
import E.W;
import E.d0;
import E.j0;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.C1002s;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.O0;
import androidx.camera.core.processing.Node;
import androidx.core.util.Consumer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Node {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f13773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f13774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f13775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f13776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f13777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f13778f;

    public final int a() {
        int maxImages;
        p140j8.f.b();
        p118hf.a.k(this.f13774b != null, "The ImageReader is not initialized.");
        d0 d0Var = this.f13774b;
        synchronized (d0Var.f2006a) {
            maxImages = d0Var.f2009d.getMaxImages() - d0Var.f2007b;
        }
        return maxImages;
    }

    public final void b(ImageProxy imageProxy) {
        p140j8.f.b();
        if (this.f13773a == null) {
            Objects.toString(imageProxy);
            p140j8.f.G("CaptureNode");
            imageProxy.close();
            return;
        }
        O0 tagBundle = imageProxy.getImageInfo().getTagBundle();
        if (((Integer) tagBundle.f13941a.get(this.f13773a.f13804h)) == null) {
            p140j8.f.G("CaptureNode");
            imageProxy.close();
            return;
        }
        p140j8.f.b();
        e eVar = this.f13776d;
        Objects.requireNonNull(eVar);
        eVar.f13749a.accept(new f(this.f13773a, imageProxy));
        t tVar = this.f13773a;
        this.f13773a = null;
        int i7 = tVar.f13807k;
        v vVar = tVar.f13803g;
        if (i7 != -1 && i7 != 100) {
            tVar.f13807k = 100;
            vVar.onCaptureProcessProgressed(100);
        }
        vVar.onImageCaptured();
    }

    public final void c(t tVar) {
        p140j8.f.b();
        p118hf.a.k(tVar.f13805i.size() == 1, "only one capture stage is supported.");
        p118hf.a.k(a() > 0, "Too many acquire images. Close image to be able to process next.");
        this.f13773a = tVar;
        p1.d dVar = new p1.d(this, 22, tVar, false);
        androidx.camera.core.impl.utils.executor.a aVarU = org.chromium.support_lib_boundary.util.b.u();
        androidx.concurrent.futures.m mVar = tVar.f13806j;
        mVar.addListener(new androidx.camera.core.impl.utils.futures.i(0, mVar, dVar), aVarU);
    }

    @Override // androidx.camera.core.processing.Node
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final e transform(b bVar) {
        int i7;
        ImageReaderProxy imageReaderProxyE;
        Consumer consumer;
        ImageReaderProxy imageReaderProxy;
        int i10;
        AbstractC0999q c1002s;
        final int i11 = 2;
        final int i12 = 0;
        final int i13 = 1;
        p118hf.a.k(this.f13777e == null && this.f13774b == null, "CaptureNode does not support recreation yet.");
        this.f13777e = bVar;
        Size size = bVar.f13736d;
        AbstractC0999q v3 = new V(this, i13);
        boolean z3 = bVar.f13739g;
        ImageReaderProxyProvider imageReaderProxyProvider = bVar.f13740h;
        int i14 = bVar.f13737e;
        if (z3 || imageReaderProxyProvider != null) {
            int width = size.getWidth();
            int height = size.getHeight();
            if (imageReaderProxyProvider != null) {
                imageReaderProxyE = imageReaderProxyProvider.newInstance(width, height, i14, 4, 0L);
                i7 = i14;
            } else {
                i7 = i14;
                imageReaderProxyE = io.fastkv.n.e(width, height, i7, 4);
            }
            o oVar = new o(imageReaderProxyE);
            this.f13778f = oVar;
            consumer = new Consumer(this) { // from class: androidx.camera.core.imagecapture.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f13768b;

                {
                    this.f13768b = this;
                }

                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    switch (i13) {
                        case 0:
                            this.f13768b.c((t) obj);
                            break;
                        case 1:
                            t tVar = (t) obj;
                            n nVar = this.f13768b;
                            nVar.c(tVar);
                            o oVar2 = nVar.f13778f;
                            p118hf.a.k(oVar2.f13780b == null, "Pending request should be null");
                            oVar2.f13780b = tVar;
                            break;
                        default:
                            g gVar = (g) obj;
                            n nVar2 = this.f13768b;
                            nVar2.getClass();
                            p140j8.f.b();
                            t tVar2 = nVar2.f13773a;
                            if (tVar2 != null) {
                                if (tVar2.f13797a == gVar.f13755a) {
                                    tVar2.f13803g.onCaptureFailure(gVar.f13756b);
                                }
                            }
                            break;
                    }
                }
            };
            imageReaderProxy = oVar;
        } else {
            W w3 = new W(size.getWidth(), size.getHeight(), i14, 4);
            List listAsList = Arrays.asList(v3, w3.f1959b);
            if (listAsList.isEmpty()) {
                c1002s = new C1002s();
            } else {
                if (listAsList.size() == 1) {
                    c1002s = (AbstractC0999q) listAsList.get(0);
                } else {
                    v3 = new androidx.camera.core.impl.r(listAsList);
                }
                consumer = new Consumer(this) { // from class: androidx.camera.core.imagecapture.k

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n f13768b;

                    {
                        this.f13768b = this;
                    }

                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        switch (i12) {
                            case 0:
                                this.f13768b.c((t) obj);
                                break;
                            case 1:
                                t tVar = (t) obj;
                                n nVar = this.f13768b;
                                nVar.c(tVar);
                                o oVar2 = nVar.f13778f;
                                p118hf.a.k(oVar2.f13780b == null, "Pending request should be null");
                                oVar2.f13780b = tVar;
                                break;
                            default:
                                g gVar = (g) obj;
                                n nVar2 = this.f13768b;
                                nVar2.getClass();
                                p140j8.f.b();
                                t tVar2 = nVar2.f13773a;
                                if (tVar2 != null) {
                                    if (tVar2.f13797a == gVar.f13755a) {
                                        tVar2.f13803g.onCaptureFailure(gVar.f13756b);
                                    }
                                }
                                break;
                        }
                    }
                };
                i7 = i14;
                imageReaderProxy = w3;
            }
            v3 = c1002s;
            consumer = new Consumer(this) { // from class: androidx.camera.core.imagecapture.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f13768b;

                {
                    this.f13768b = this;
                }

                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    switch (i12) {
                        case 0:
                            this.f13768b.c((t) obj);
                            break;
                        case 1:
                            t tVar = (t) obj;
                            n nVar = this.f13768b;
                            nVar.c(tVar);
                            o oVar2 = nVar.f13778f;
                            p118hf.a.k(oVar2.f13780b == null, "Pending request should be null");
                            oVar2.f13780b = tVar;
                            break;
                        default:
                            g gVar = (g) obj;
                            n nVar2 = this.f13768b;
                            nVar2.getClass();
                            p140j8.f.b();
                            t tVar2 = nVar2.f13773a;
                            if (tVar2 != null) {
                                if (tVar2.f13797a == gVar.f13755a) {
                                    tVar2.f13803g.onCaptureFailure(gVar.f13756b);
                                }
                            }
                            break;
                    }
                }
            };
            i7 = i14;
            imageReaderProxy = w3;
        }
        bVar.f13733a = v3;
        Surface surface = imageReaderProxy.getSurface();
        Objects.requireNonNull(surface);
        p118hf.a.k(bVar.f13734b == null, "The surface is already set.");
        bVar.f13734b = new j0(surface, bVar.f13736d, i7);
        this.f13774b = new d0(imageReaderProxy);
        imageReaderProxy.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener(this) { // from class: androidx.camera.core.imagecapture.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f13770b;

            {
                this.f13770b = this;
            }

            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy2) {
                switch (i12) {
                    case 0:
                        n nVar = this.f13770b;
                        nVar.getClass();
                        try {
                            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy2.acquireLatestImage();
                            if (imageProxyAcquireLatestImage != null) {
                                nVar.b(imageProxyAcquireLatestImage);
                            } else {
                                t tVar = nVar.f13773a;
                                if (tVar != null) {
                                    int i15 = tVar.f13797a;
                                    Q q10 = new Q(2, "Failed to acquire latest image", null);
                                    p140j8.f.b();
                                    t tVar2 = nVar.f13773a;
                                    if (tVar2 != null && tVar2.f13797a == i15) {
                                        tVar2.f13803g.onCaptureFailure(q10);
                                    }
                                }
                            }
                        } catch (IllegalStateException e10) {
                            t tVar3 = nVar.f13773a;
                            if (tVar3 != null) {
                                Q q11 = new Q(2, "Failed to acquire latest image", e10);
                                p140j8.f.b();
                                t tVar4 = nVar.f13773a;
                                if (tVar4 == null || tVar4.f13797a != tVar3.f13797a) {
                                    return;
                                }
                                tVar4.f13803g.onCaptureFailure(q11);
                                return;
                            }
                            return;
                        }
                        break;
                    default:
                        n nVar2 = this.f13770b;
                        nVar2.getClass();
                        try {
                            ImageProxy imageProxyAcquireLatestImage2 = imageReaderProxy2.acquireLatestImage();
                            if (imageProxyAcquireLatestImage2 != null) {
                                if (nVar2.f13773a == null) {
                                    p140j8.f.G("CaptureNode");
                                    imageProxyAcquireLatestImage2.close();
                                } else {
                                    e eVar = nVar2.f13776d;
                                    Objects.requireNonNull(eVar);
                                    eVar.f13750b.accept(new f(nVar2.f13773a, imageProxyAcquireLatestImage2));
                                }
                            }
                        } catch (IllegalStateException e11) {
                            p140j8.f.h("CaptureNode", "Failed to acquire latest image of postview", e11);
                            return;
                        }
                        break;
                }
            }
        }, org.chromium.support_lib_boundary.util.b.S());
        Size size2 = bVar.f13741i;
        if (size2 != null) {
            int i15 = i7;
            int width2 = size2.getWidth();
            int height2 = size2.getHeight();
            i10 = i15;
            int i16 = bVar.f13742j;
            ImageReaderProxy imageReaderProxyNewInstance = imageReaderProxyProvider != null ? imageReaderProxyProvider.newInstance(width2, height2, i16, 4, 0L) : io.fastkv.n.e(width2, height2, i16, 4);
            imageReaderProxyNewInstance.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener(this) { // from class: androidx.camera.core.imagecapture.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f13770b;

                {
                    this.f13770b = this;
                }

                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy2) {
                    switch (i13) {
                        case 0:
                            n nVar = this.f13770b;
                            nVar.getClass();
                            try {
                                ImageProxy imageProxyAcquireLatestImage = imageReaderProxy2.acquireLatestImage();
                                if (imageProxyAcquireLatestImage != null) {
                                    nVar.b(imageProxyAcquireLatestImage);
                                } else {
                                    t tVar = nVar.f13773a;
                                    if (tVar != null) {
                                        int i17 = tVar.f13797a;
                                        Q q10 = new Q(2, "Failed to acquire latest image", null);
                                        p140j8.f.b();
                                        t tVar2 = nVar.f13773a;
                                        if (tVar2 != null && tVar2.f13797a == i17) {
                                            tVar2.f13803g.onCaptureFailure(q10);
                                        }
                                    }
                                }
                            } catch (IllegalStateException e10) {
                                t tVar3 = nVar.f13773a;
                                if (tVar3 != null) {
                                    Q q11 = new Q(2, "Failed to acquire latest image", e10);
                                    p140j8.f.b();
                                    t tVar4 = nVar.f13773a;
                                    if (tVar4 == null || tVar4.f13797a != tVar3.f13797a) {
                                        return;
                                    }
                                    tVar4.f13803g.onCaptureFailure(q11);
                                    return;
                                }
                                return;
                            }
                            break;
                        default:
                            n nVar2 = this.f13770b;
                            nVar2.getClass();
                            try {
                                ImageProxy imageProxyAcquireLatestImage2 = imageReaderProxy2.acquireLatestImage();
                                if (imageProxyAcquireLatestImage2 != null) {
                                    if (nVar2.f13773a == null) {
                                        p140j8.f.G("CaptureNode");
                                        imageProxyAcquireLatestImage2.close();
                                    } else {
                                        e eVar = nVar2.f13776d;
                                        Objects.requireNonNull(eVar);
                                        eVar.f13750b.accept(new f(nVar2.f13773a, imageProxyAcquireLatestImage2));
                                    }
                                }
                            } catch (IllegalStateException e11) {
                                p140j8.f.h("CaptureNode", "Failed to acquire latest image of postview", e11);
                                return;
                            }
                            break;
                    }
                }
            }, org.chromium.support_lib_boundary.util.b.S());
            this.f13775c = new d0(imageReaderProxyNewInstance);
            bVar.f13735c = new j0(imageReaderProxyNewInstance.getSurface(), size2, i16);
        } else {
            i10 = i7;
        }
        bVar.f13743k.f14399a = consumer;
        bVar.f13744l.f14399a = new Consumer(this) { // from class: androidx.camera.core.imagecapture.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f13768b;

            {
                this.f13768b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f13768b.c((t) obj);
                        break;
                    case 1:
                        t tVar = (t) obj;
                        n nVar = this.f13768b;
                        nVar.c(tVar);
                        o oVar2 = nVar.f13778f;
                        p118hf.a.k(oVar2.f13780b == null, "Pending request should be null");
                        oVar2.f13780b = tVar;
                        break;
                    default:
                        g gVar = (g) obj;
                        n nVar2 = this.f13768b;
                        nVar2.getClass();
                        p140j8.f.b();
                        t tVar2 = nVar2.f13773a;
                        if (tVar2 != null) {
                            if (tVar2.f13797a == gVar.f13755a) {
                                tVar2.f13803g.onCaptureFailure(gVar.f13756b);
                            }
                        }
                        break;
                }
            }
        };
        e eVar = new e(new androidx.camera.core.processing.g(), new androidx.camera.core.processing.g(), i10, bVar.f13738f);
        this.f13776d = eVar;
        return eVar;
    }

    @Override // androidx.camera.core.processing.Node
    public final void release() {
        p140j8.f.b();
        b bVar = this.f13777e;
        Objects.requireNonNull(bVar);
        final d0 d0Var = this.f13774b;
        Objects.requireNonNull(d0Var);
        final d0 d0Var2 = this.f13775c;
        j0 j0Var = bVar.f13734b;
        Objects.requireNonNull(j0Var);
        j0Var.a();
        j0 j0Var2 = bVar.f13734b;
        Objects.requireNonNull(j0Var2);
        final int i7 = 0;
        androidx.camera.core.impl.utils.futures.j.e(j0Var2.f14025e).addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.m
            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        d0Var.a();
                        break;
                    default:
                        d0 d0Var3 = d0Var;
                        if (d0Var3 != null) {
                            d0Var3.a();
                        }
                        break;
                }
            }
        }, org.chromium.support_lib_boundary.util.b.S());
        j0 j0Var3 = bVar.f13735c;
        if (j0Var3 != null) {
            j0Var3.a();
            final int i10 = 1;
            androidx.camera.core.impl.utils.futures.j.e(bVar.f13735c.f14025e).addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.m
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            d0Var2.a();
                            break;
                        default:
                            d0 d0Var3 = d0Var2;
                            if (d0Var3 != null) {
                                d0Var3.a();
                            }
                            break;
                    }
                }
            }, org.chromium.support_lib_boundary.util.b.S());
        }
    }
}
