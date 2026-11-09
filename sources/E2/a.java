package E2;

import Ae.n;
import E.AbstractC0210o;
import E.C0202g;
import E.m0;
import G.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Size;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.imagecapture.s;
import androidx.camera.core.impl.C0982h0;
import androidx.camera.core.impl.C0991m;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig$OptionUnpacker;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.utils.futures.i;
import androidx.camera.core.impl.utils.futures.j;
import androidx.camera.core.impl.utils.o;
import androidx.camera.core.processing.Node;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.k;
import androidx.camera.core.processing.l;
import androidx.camera.core.processing.m;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p140j8.f;
import p198n5.h;
import p279s5.d;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Node {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static a f2180g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f2181i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f2187f;

    public a(com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, com.airbnb.lottie.model.animatable.b bVar4) {
        this.f2182a = 4;
        this.f2183b = aVar;
        this.f2184c = bVar;
        this.f2185d = bVar2;
        this.f2186e = bVar3;
        this.f2187f = bVar4;
    }

    public void a(F2.c cVar) {
        synchronized (this.f2183b) {
            ((ArrayList) this.f2185d).remove(cVar);
        }
    }

    public void b(CameraInternal cameraInternal, CameraInternal cameraInternal2, m mVar, m mVar2, Map.Entry entry) {
        m mVar3 = (m) entry.getValue();
        C0202g c0202g = new C0202g(mVar.f14432g.f14108a, ((G.a) entry.getKey()).f2855a.f3505d, mVar.f14428c ? cameraInternal : null, ((G.a) entry.getKey()).f2855a.f3507f, ((G.a) entry.getKey()).f2855a.f3508g);
        C0202g c0202g2 = new C0202g(mVar2.f14432g.f14108a, ((G.a) entry.getKey()).f2856b.f3505d, mVar2.f14428c ? cameraInternal2 : null, ((G.a) entry.getKey()).f2856b.f3507f, ((G.a) entry.getKey()).f2856b.f3508g);
        H.c cVar = ((G.a) entry.getKey()).f2855a;
        mVar3.getClass();
        f.b();
        mVar3.b();
        p118hf.a.k(!mVar3.f14435j, "Consumer can only be linked once.");
        mVar3.f14435j = true;
        l lVar = mVar3.f14437l;
        androidx.camera.core.impl.utils.futures.a aVarI = j.i(lVar.c(), new k(mVar3, lVar, cVar.f3504c, c0202g, c0202g2), org.chromium.support_lib_boundary.util.b.S());
        aVarI.addListener(new i(0, aVarI, new d(this, 4, mVar3, false)), org.chromium.support_lib_boundary.util.b.S());
    }

    public String c() {
        if (TextUtils.isEmpty((String) this.f2186e)) {
            Context context = (Context) this.f2183b;
            try {
                this.f2186e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e10) {
                h.b("AppInfoProvider", e10);
            }
        }
        return (String) this.f2186e;
    }

    public String d() {
        if (TextUtils.isEmpty((String) this.f2184c)) {
            this.f2184c = ((Context) this.f2183b).getPackageName();
        }
        return (String) this.f2184c;
    }

    public void e() throws IOException {
        try {
            FileLock fileLock = (FileLock) this.f2187f;
            if (fileLock != null && fileLock.isValid()) {
                ((FileLock) this.f2187f).release();
            }
            try {
                FileChannel fileChannel = (FileChannel) this.f2186e;
                if (fileChannel != null) {
                    fileChannel.close();
                }
            } finally {
                FileOutputStream fileOutputStream = (FileOutputStream) this.f2185d;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }
        } catch (Throwable th) {
            try {
                FileChannel fileChannel2 = (FileChannel) this.f2186e;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
                throw th;
            } finally {
                FileOutputStream fileOutputStream2 = (FileOutputStream) this.f2185d;
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
            }
        }
    }

    @Override // androidx.camera.core.processing.Node
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public G.h transform(G.b bVar) throws AbstractC0210o {
        a aVar = this;
        f.b();
        aVar.f2187f = bVar;
        aVar.f2186e = new G.h();
        G.b bVar2 = (G.b) aVar.f2187f;
        m mVar = bVar2.f2857a;
        for (G.a aVar2 : bVar2.f2859c) {
            G.h hVar = (G.h) aVar.f2186e;
            H.c cVar = aVar2.f2855a;
            Matrix matrix = new Matrix();
            Size sizeE = o.e(cVar.f3505d);
            int i7 = cVar.f3507f;
            Size sizeG = o.g(sizeE, i7);
            Size size = cVar.f3506e;
            p118hf.a.f(o.d(sizeG, false, size));
            Rect rect = new Rect(0, 0, size.getWidth(), size.getHeight());
            C0991m c0991mA = mVar.f14432g.a();
            c0991mA.f14102a = size;
            hVar.put(aVar2, new m(cVar.f3503b, cVar.f3504c, c0991mA.a(), matrix, false, rect, mVar.f14434i - i7, -1, mVar.f14430e != cVar.f3508g));
        }
        m0 m0VarD = mVar.d((CameraInternal) aVar.f2184c, true);
        SurfaceProcessorInternal surfaceProcessorInternal = (SurfaceProcessorInternal) aVar.f2183b;
        surfaceProcessorInternal.onInputSurface(m0VarD);
        m mVar2 = bVar2.f2858b;
        surfaceProcessorInternal.onInputSurface(mVar2.d((CameraInternal) aVar.f2185d, false));
        for (Map.Entry entry : ((G.h) aVar.f2186e).entrySet()) {
            CameraInternal cameraInternal = (CameraInternal) aVar.f2184c;
            CameraInternal cameraInternal2 = (CameraInternal) aVar.f2185d;
            m mVar3 = mVar2;
            aVar.b(cameraInternal, cameraInternal2, mVar, mVar3, entry);
            m mVar4 = mVar;
            aVar = this;
            mVar = mVar4;
            ((m) entry.getValue()).a(new g(this, cameraInternal, cameraInternal2, mVar4, mVar3, entry, 0));
            mVar2 = mVar3;
        }
        return (G.h) aVar.f2186e;
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        switch (this.f2182a) {
            case 1:
                ((SurfaceProcessorInternal) this.f2183b).release();
                f.B(new n(this, 15));
                return;
            default:
                try {
                    e();
                    break;
                } catch (IOException unused) {
                } finally {
                    this.f2185d = null;
                    this.f2186e = null;
                    this.f2187f = null;
                }
                return;
        }
    }

    public a(int i7) {
        this.f2182a = i7;
        switch (i7) {
            case 6:
                this.f2183b = com.growingio.android.sdk.d.a().getApplicationContext();
                break;
            default:
                this.f2183b = new Object();
                this.f2187f = new B5.c(this, 4);
                this.f2185d = new ArrayList();
                this.f2186e = new ArrayList();
                this.f2184c = new Handler(Looper.getMainLooper());
                break;
        }
    }

    public a(Context context, String str) {
        this.f2182a = 5;
        this.f2183b = context;
        this.f2184c = str.concat(".lock");
    }

    public a(MotionLayout motionLayout) {
        this.f2182a = 3;
        this.f2185d = new ArrayList();
        this.f2187f = new ArrayList();
        this.f2183b = motionLayout;
    }

    public a(CameraInternal cameraInternal, CameraInternal cameraInternal2, SurfaceProcessorInternal surfaceProcessorInternal) {
        this.f2182a = 1;
        this.f2184c = cameraInternal;
        this.f2185d = cameraInternal2;
        this.f2183b = surfaceProcessorInternal;
    }

    public a(C0982h0 c0982h0, Size size, boolean z3, Size size2, int i7) {
        int iIntValue;
        int i10;
        this.f2182a = 2;
        f.b();
        this.f2183b = c0982h0;
        CaptureConfig$OptionUnpacker captureOptionUnpacker = c0982h0.getCaptureOptionUnpacker(null);
        if (captureOptionUnpacker != null) {
            S s3 = new S();
            captureOptionUnpacker.unpack(c0982h0, s3);
            this.f2184c = s3.d();
            androidx.camera.core.imagecapture.n nVar = new androidx.camera.core.imagecapture.n();
            nVar.f13773a = null;
            nVar.f13778f = null;
            this.f2185d = nVar;
            Executor ioExecutor = c0982h0.getIoExecutor(org.chromium.support_lib_boundary.util.b.M());
            Objects.requireNonNull(ioExecutor);
            s sVar = new s(ioExecutor);
            this.f2186e = sVar;
            int inputFormat = c0982h0.getInputFormat();
            Integer num = (Integer) c0982h0.retrieveOption(C0982h0.f14072e, null);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                Integer num2 = (Integer) c0982h0.retrieveOption(ImageInputConfig.f13897r, null);
                if (num2 == null || num2.intValue() != 4101) {
                    iIntValue = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                } else {
                    i10 = 4101;
                }
                androidx.camera.core.imagecapture.b bVar = new androidx.camera.core.imagecapture.b(size, inputFormat, i10, z3, (ImageReaderProxyProvider) c0982h0.retrieveOption(C0982h0.f14074g, null), size2, i7, new androidx.camera.core.processing.g(), new androidx.camera.core.processing.g());
                this.f2187f = bVar;
                sVar.c(nVar.transform(bVar));
                return;
            }
            i10 = iIntValue;
            androidx.camera.core.imagecapture.b bVar2 = new androidx.camera.core.imagecapture.b(size, inputFormat, i10, z3, (ImageReaderProxyProvider) c0982h0.retrieveOption(C0982h0.f14074g, null), size2, i7, new androidx.camera.core.processing.g(), new androidx.camera.core.processing.g());
            this.f2187f = bVar2;
            sVar.c(nVar.transform(bVar2));
            return;
        }
        throw new IllegalStateException("Implementation is missing option unpacker for " + c0982h0.getTargetName(c0982h0.toString()));
    }
}
