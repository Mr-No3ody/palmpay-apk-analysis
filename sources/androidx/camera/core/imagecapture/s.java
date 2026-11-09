package androidx.camera.core.imagecapture;

import E.O;
import E.Q;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.biometric.RunnableC0903g;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.y0;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.processing.Node;
import androidx.core.util.Consumer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Node {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f13786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f13787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f13788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p045d3.k f13789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p121i2.d f13790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p166l2.a f13791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p137j3.u f13792g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public org.sufficientlysecure.htmltextview.g f13793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public org.sufficientlysecure.htmltextview.f f13794j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p121i2.e f13795o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y0 f13796p;
    public final boolean t;

    public s(Executor executor) {
        y0 y0Var = androidx.camera.core.internal.compat.quirk.a.f14321a;
        if (androidx.camera.core.internal.compat.quirk.a.f14321a.b(LowMemoryQuirk.class) != null) {
            this.f13786a = new androidx.camera.core.impl.utils.executor.i(executor);
        } else {
            this.f13786a = executor;
        }
        this.f13796p = y0Var;
        this.t = y0Var.a(IncorrectJpegMetadataQuirk.class);
    }

    public final ImageProxy a(f fVar) {
        t tVar = fVar.f13753a;
        androidx.camera.core.processing.b bVar = (androidx.camera.core.processing.b) this.f13788c.apply(fVar);
        if ((bVar.f14373c == 35 || this.t) && this.f13787b.f13752d == 256) {
            bVar = (androidx.camera.core.processing.b) this.f13794j.apply((androidx.camera.core.processing.b) this.f13789d.apply(new c(bVar, tVar.f13801e)));
        }
        return (ImageProxy) this.f13793i.apply(bVar);
    }

    public final O b(f fVar) {
        int i7 = this.f13787b.f13752d;
        p118hf.a.g(androidx.camera.core.internal.utils.c.c(i7), "On-disk capture only support JPEG and JPEG/R output formats. Output format: " + i7);
        t tVar = fVar.f13753a;
        androidx.camera.core.processing.b bVar = (androidx.camera.core.processing.b) this.f13789d.apply(new c((androidx.camera.core.processing.b) this.f13788c.apply(fVar), tVar.f13801e));
        if (androidx.camera.core.impl.utils.o.b(bVar.f14375e, bVar.f14374d)) {
            int i10 = tVar.f13801e;
            p118hf.a.k(androidx.camera.core.internal.utils.c.c(bVar.f14373c), null);
            androidx.camera.core.processing.b bVar2 = (androidx.camera.core.processing.b) this.f13792g.apply(bVar);
            this.f13790e.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap bitmap = (Bitmap) bVar2.f14371a;
            bitmap.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            androidx.camera.core.impl.utils.e eVar = bVar2.f14372b;
            Objects.requireNonNull(eVar);
            bVar = new androidx.camera.core.processing.b(byteArray, eVar, (Build.VERSION.SDK_INT < 34 || !i.j(bitmap)) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 4101, bVar2.f14374d, bVar2.f14375e, bVar2.f14376f, bVar2.f14377g, bVar2.f14378h);
        }
        p166l2.a aVar = this.f13791f;
        p279s5.d dVar = tVar.f13798b;
        Objects.requireNonNull(dVar);
        return (O) aVar.apply(new d(bVar, dVar));
    }

    public final void c(e eVar) {
        this.f13787b = eVar;
        final int i7 = 0;
        eVar.f13749a.f14399a = new Consumer(this) { // from class: androidx.camera.core.imagecapture.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f13782b;

            {
                this.f13782b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                final f fVar = (f) obj;
                switch (i7) {
                    case 0:
                        final s sVar = this.f13782b;
                        sVar.getClass();
                        if (!fVar.f13753a.f13803g.f13816g) {
                            final int i10 = 1;
                            sVar.f13786a.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.r
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            s sVar2 = sVar;
                                            int i11 = sVar2.f13787b.f13752d;
                                            p118hf.a.g(i11 == 35 || i11 == 256, "Postview only support YUV and JPEG output formats. Output format: " + i11);
                                            f fVar2 = fVar;
                                            try {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(3, fVar2.f13753a, (Bitmap) sVar2.f13795o.apply((androidx.camera.core.processing.b) sVar2.f13788c.apply(fVar2))));
                                            } catch (Exception e10) {
                                                fVar2.f13754b.close();
                                                p140j8.f.h("ProcessingNode", "process postview input packet failed.", e10);
                                                return;
                                            }
                                            break;
                                        default:
                                            s sVar3 = sVar;
                                            sVar3.getClass();
                                            f fVar3 = fVar;
                                            t tVar = fVar3.f13753a;
                                            try {
                                                if (tVar.f13798b == null) {
                                                    org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(1, tVar, sVar3.a(fVar3)));
                                                } else {
                                                    org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(2, tVar, sVar3.b(fVar3)));
                                                }
                                            } catch (Q e11) {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(4, tVar, e11));
                                                return;
                                            } catch (OutOfMemoryError e12) {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(4, tVar, new Q(0, "Processing failed due to low memory.", e12)));
                                                return;
                                            } catch (RuntimeException e13) {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(4, tVar, new Q(0, "Processing failed.", e13)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            fVar.f13754b.close();
                        }
                        break;
                    default:
                        final s sVar2 = this.f13782b;
                        sVar2.getClass();
                        if (!fVar.f13753a.f13803g.f13816g) {
                            final int i11 = 0;
                            sVar2.f13786a.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.r
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            s sVar3 = sVar2;
                                            int i12 = sVar3.f13787b.f13752d;
                                            p118hf.a.g(i12 == 35 || i12 == 256, "Postview only support YUV and JPEG output formats. Output format: " + i12);
                                            f fVar2 = fVar;
                                            try {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(3, fVar2.f13753a, (Bitmap) sVar3.f13795o.apply((androidx.camera.core.processing.b) sVar3.f13788c.apply(fVar2))));
                                            } catch (Exception e10) {
                                                fVar2.f13754b.close();
                                                p140j8.f.h("ProcessingNode", "process postview input packet failed.", e10);
                                                return;
                                            }
                                            break;
                                        default:
                                            s sVar4 = sVar2;
                                            sVar4.getClass();
                                            f fVar3 = fVar;
                                            t tVar = fVar3.f13753a;
                                            try {
                                                if (tVar.f13798b == null) {
                                                    org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(1, tVar, sVar4.a(fVar3)));
                                                } else {
                                                    org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(2, tVar, sVar4.b(fVar3)));
                                                }
                                            } catch (Q e11) {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(4, tVar, e11));
                                                return;
                                            } catch (OutOfMemoryError e12) {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(4, tVar, new Q(0, "Processing failed due to low memory.", e12)));
                                                return;
                                            } catch (RuntimeException e13) {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(4, tVar, new Q(0, "Processing failed.", e13)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            p140j8.f.G("ProcessingNode");
                            fVar.f13754b.close();
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        eVar.f13750b.f14399a = new Consumer(this) { // from class: androidx.camera.core.imagecapture.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f13782b;

            {
                this.f13782b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                final f fVar = (f) obj;
                switch (i10) {
                    case 0:
                        final s sVar = this.f13782b;
                        sVar.getClass();
                        if (!fVar.f13753a.f13803g.f13816g) {
                            final int i11 = 1;
                            sVar.f13786a.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.r
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            s sVar3 = sVar;
                                            int i12 = sVar3.f13787b.f13752d;
                                            p118hf.a.g(i12 == 35 || i12 == 256, "Postview only support YUV and JPEG output formats. Output format: " + i12);
                                            f fVar2 = fVar;
                                            try {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(3, fVar2.f13753a, (Bitmap) sVar3.f13795o.apply((androidx.camera.core.processing.b) sVar3.f13788c.apply(fVar2))));
                                            } catch (Exception e10) {
                                                fVar2.f13754b.close();
                                                p140j8.f.h("ProcessingNode", "process postview input packet failed.", e10);
                                                return;
                                            }
                                            break;
                                        default:
                                            s sVar4 = sVar;
                                            sVar4.getClass();
                                            f fVar3 = fVar;
                                            t tVar = fVar3.f13753a;
                                            try {
                                                if (tVar.f13798b == null) {
                                                    org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(1, tVar, sVar4.a(fVar3)));
                                                } else {
                                                    org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(2, tVar, sVar4.b(fVar3)));
                                                }
                                            } catch (Q e11) {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(4, tVar, e11));
                                                return;
                                            } catch (OutOfMemoryError e12) {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(4, tVar, new Q(0, "Processing failed due to low memory.", e12)));
                                                return;
                                            } catch (RuntimeException e13) {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(4, tVar, new Q(0, "Processing failed.", e13)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            fVar.f13754b.close();
                        }
                        break;
                    default:
                        final s sVar2 = this.f13782b;
                        sVar2.getClass();
                        if (!fVar.f13753a.f13803g.f13816g) {
                            final int i12 = 0;
                            sVar2.f13786a.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.r
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            s sVar3 = sVar2;
                                            int i13 = sVar3.f13787b.f13752d;
                                            p118hf.a.g(i13 == 35 || i13 == 256, "Postview only support YUV and JPEG output formats. Output format: " + i13);
                                            f fVar2 = fVar;
                                            try {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(3, fVar2.f13753a, (Bitmap) sVar3.f13795o.apply((androidx.camera.core.processing.b) sVar3.f13788c.apply(fVar2))));
                                            } catch (Exception e10) {
                                                fVar2.f13754b.close();
                                                p140j8.f.h("ProcessingNode", "process postview input packet failed.", e10);
                                                return;
                                            }
                                            break;
                                        default:
                                            s sVar4 = sVar2;
                                            sVar4.getClass();
                                            f fVar3 = fVar;
                                            t tVar = fVar3.f13753a;
                                            try {
                                                if (tVar.f13798b == null) {
                                                    org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(1, tVar, sVar4.a(fVar3)));
                                                } else {
                                                    org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(2, tVar, sVar4.b(fVar3)));
                                                }
                                            } catch (Q e11) {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(4, tVar, e11));
                                                return;
                                            } catch (OutOfMemoryError e12) {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(4, tVar, new Q(0, "Processing failed due to low memory.", e12)));
                                                return;
                                            } catch (RuntimeException e13) {
                                                org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(4, tVar, new Q(0, "Processing failed.", e13)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            p140j8.f.G("ProcessingNode");
                            fVar.f13754b.close();
                        }
                        break;
                }
            }
        };
        this.f13788c = new p();
        this.f13789d = new p045d3.k(this.f13796p, 13);
        this.f13792g = new p137j3.u(3);
        this.f13790e = new p121i2.d((byte) 0, 3);
        this.f13791f = new p166l2.a(3);
        this.f13793i = new org.sufficientlysecure.htmltextview.g(3);
        this.f13795o = new p121i2.e(3);
        if (eVar.f13751c == 35 || this.t) {
            this.f13794j = new org.sufficientlysecure.htmltextview.f(3);
        }
    }

    @Override // androidx.camera.core.processing.Node
    public final void release() {
    }

    @Override // androidx.camera.core.processing.Node
    public final /* bridge */ /* synthetic */ Object transform(Object obj) {
        c((e) obj);
        return null;
    }
}
