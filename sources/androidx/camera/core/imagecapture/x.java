package androidx.camera.core.imagecapture;

import E.C0215u;
import E.Q;
import E.j0;
import androidx.biometric.RunnableC0903g;
import androidx.camera.core.ForwardingImageProxy$OnImageCloseListener;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0982h0;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureStage;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.U;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x implements ForwardingImageProxy$OnImageCloseListener, TakePictureRequest$RetryControl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Oe.a f13822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E2.a f13823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f13824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f13825e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f13821a = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13826f = false;

    public x(Oe.a aVar) {
        p140j8.f.b();
        this.f13822b = aVar;
        this.f13825e = new ArrayList();
    }

    public final void a() {
        p140j8.f.b();
        Q q10 = new Q(3, "Camera is closed.", null);
        ArrayDeque<y> arrayDeque = this.f13821a;
        for (y yVar : arrayDeque) {
            yVar.getClass();
            ((h) yVar).f13757b.execute(new RunnableC0903g(9, yVar, q10));
        }
        arrayDeque.clear();
        for (v vVar : new ArrayList(this.f13825e)) {
            vVar.getClass();
            p140j8.f.b();
            if (!vVar.f13813d.f15066b.isDone()) {
                p140j8.f.b();
                vVar.f13816g = true;
                ListenableFuture listenableFuture = vVar.f13818i;
                Objects.requireNonNull(listenableFuture);
                listenableFuture.cancel(true);
                vVar.f13814e.d(q10);
                vVar.f13815f.b(null);
                p140j8.f.b();
                y yVar2 = vVar.f13810a;
                ((h) yVar2).f13757b.execute(new RunnableC0903g(9, yVar2, q10));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        y yVar;
        int i7 = 0;
        p140j8.f.b();
        if (this.f13824d == null && !this.f13826f) {
            E2.a aVar = this.f13823c;
            aVar.getClass();
            p140j8.f.b();
            if (((n) aVar.f2185d).a() == 0 || (yVar = (y) this.f13821a.poll()) == null) {
                return;
            }
            v vVar = new v(yVar, this);
            p118hf.a.k(!(this.f13824d != null), null);
            this.f13824d = vVar;
            p140j8.f.b();
            vVar.f13812c.addListener(new w(this, i7), org.chromium.support_lib_boundary.util.b.u());
            this.f13825e.add(vVar);
            p140j8.f.b();
            vVar.f13813d.addListener(new RunnableC0903g(5, this, vVar), org.chromium.support_lib_boundary.util.b.u());
            E2.a aVar2 = this.f13823c;
            p140j8.f.b();
            androidx.concurrent.futures.m mVar = vVar.f13812c;
            aVar2.getClass();
            p140j8.f.b();
            CaptureBundle captureBundle = (CaptureBundle) ((C0982h0) aVar2.f2183b).retrieveOption(C0982h0.f14071d, new C0215u(Arrays.asList(new U())));
            Objects.requireNonNull(captureBundle);
            int i10 = E2.a.f2181i;
            E2.a.f2181i = i10 + 1;
            ArrayList arrayList = new ArrayList();
            String strValueOf = String.valueOf(captureBundle.hashCode());
            List<CaptureStage> captureStages = captureBundle.getCaptureStages();
            Objects.requireNonNull(captureStages);
            for (CaptureStage captureStage : captureStages) {
                S s3 = new S();
                T t = (T) aVar2.f2184c;
                s3.f13957c = t.f13968c;
                s3.c(t.f13967b);
                h hVar = (h) yVar;
                s3.a(hVar.f13766k);
                b bVar = (b) aVar2.f2187f;
                j0 j0Var = bVar.f13734b;
                Objects.requireNonNull(j0Var);
                s3.f13955a.add(j0Var);
                s3.f13958d = bVar.f13735c != null;
                if (androidx.camera.core.internal.utils.c.c(bVar.f13737e)) {
                    if (((ImageCaptureRotationOptionQuirk) androidx.camera.core.internal.compat.quirk.a.f14321a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
                        C0971c c0971c = T.f13963i;
                    } else {
                        s3.f13956b.insertOption(T.f13963i, Integer.valueOf(hVar.f13763h));
                    }
                    s3.f13956b.insertOption(T.f13964j, Integer.valueOf(((hVar.f13759d != null) && androidx.camera.core.impl.utils.o.b(hVar.f13761f, bVar.f13736d)) ? hVar.f13765j == 0 ? 100 : 95 : hVar.f13764i));
                } else {
                    yVar = yVar;
                }
                s3.c(captureStage.getCaptureConfig().f13967b);
                s3.f13961g.f13941a.put(strValueOf, Integer.valueOf(captureStage.getId()));
                s3.f13961g.f13941a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i10));
                s3.b(bVar.f13733a);
                arrayList.add(s3.d());
                yVar = yVar;
            }
            p279s5.d dVar = new p279s5.d(20, arrayList, vVar);
            h hVar2 = (h) yVar;
            t tVar = new t(captureBundle, hVar2.f13760e, hVar2.f13761f, hVar2.f13763h, hVar2.f13764i, hVar2.f13762g, vVar, mVar, i10);
            E2.a aVar3 = this.f13823c;
            aVar3.getClass();
            p140j8.f.b();
            ((b) aVar3.f2187f).f13743k.accept(tVar);
            p140j8.f.b();
            Oe.a aVar4 = this.f13822b;
            aVar4.lockFlashMode();
            ListenableFuture listenableFutureSubmitStillCaptureRequests = aVar4.submitStillCaptureRequests(arrayList);
            ((androidx.camera.core.impl.utils.futures.b) listenableFutureSubmitStillCaptureRequests).addListener(new androidx.camera.core.impl.utils.futures.i(0 == true ? 1 : 0, listenableFutureSubmitStillCaptureRequests, new p279s5.d(this, 21, dVar, false)), org.chromium.support_lib_boundary.util.b.S());
            p140j8.f.b();
            p118hf.a.k(vVar.f13818i == null, "CaptureRequestFuture can only be set once.");
            vVar.f13818i = listenableFutureSubmitStillCaptureRequests;
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy$OnImageCloseListener
    public final void onImageClose(ImageProxy imageProxy) {
        org.chromium.support_lib_boundary.util.b.S().execute(new w(this, 1));
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest$RetryControl
    public final void retryRequest(y yVar) {
        p140j8.f.b();
        p140j8.f.G("TakePictureManager");
        this.f13821a.addFirst(yVar);
        b();
    }
}
