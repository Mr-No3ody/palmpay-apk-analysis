package androidx.camera.core;

import Ad.c0;
import E.AbstractC0198c;
import E.C0214t;
import E.ExecutorC0209n;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C1005t0;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.Q0;
import androidx.camera.core.impl.RetryPolicyInternal;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.futures.l;
import androidx.camera.core.impl.utils.n;
import androidx.camera.core.impl.v0;
import androidx.camera.core.impl.w0;
import androidx.camera.core.impl.x0;
import androidx.camera.lifecycle.g;
import androidx.concurrent.futures.m;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import p140j8.f;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f13714o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final SparseArray f13715p = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N2.a f13716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0214t f13718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f13719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f13720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HandlerThread f13721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CameraFactory f13722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CameraDeviceSurfaceManager f13723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public UseCaseConfigFactory f13724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RetryPolicy f13725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m f13726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ListenableFuture f13728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f13729n;

    public c(Context context, g gVar) {
        ComponentCallbacks2 componentCallbacks2;
        CameraXConfig$Provider cameraXConfig$Provider;
        Object objRetrieveOption;
        Object objRetrieveOption2;
        Object objRetrieveOption3;
        m mVarY;
        N2.a aVar = new N2.a();
        aVar.f6064a = new Object();
        aVar.f6065b = new LinkedHashMap();
        aVar.f6066c = new HashSet();
        this.f13716a = aVar;
        this.f13717b = new Object();
        boolean z3 = true;
        this.f13727l = 1;
        this.f13728m = l.f14212c;
        if (gVar != null) {
            this.f13718c = gVar.f14526a;
        } else {
            Context contextR = com.palmpay.lib.apm.launchcounter.util.d.r(context);
            while (true) {
                if (!(contextR instanceof ContextWrapper)) {
                    componentCallbacks2 = null;
                    break;
                } else {
                    if (contextR instanceof Application) {
                        componentCallbacks2 = (Application) contextR;
                        break;
                    }
                    contextR = ((ContextWrapper) contextR).getBaseContext();
                }
            }
            if (componentCallbacks2 instanceof CameraXConfig$Provider) {
                cameraXConfig$Provider = (CameraXConfig$Provider) componentCallbacks2;
            } else {
                try {
                    Context contextR2 = com.palmpay.lib.apm.launchcounter.util.d.r(context);
                    Bundle bundle = contextR2.getPackageManager().getServiceInfo(new ComponentName(contextR2, (Class<?>) MetadataHolderService.class), 640).metaData;
                    String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
                    if (string == null) {
                        f.g("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                        cameraXConfig$Provider = null;
                    } else {
                        cameraXConfig$Provider = (CameraXConfig$Provider) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    e = e10;
                    f.h("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                } catch (ClassNotFoundException e11) {
                    e = e11;
                    f.h("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                } catch (IllegalAccessException e12) {
                    e = e12;
                    f.h("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                } catch (InstantiationException e13) {
                    e = e13;
                    f.h("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                } catch (NoSuchMethodException e14) {
                    e = e14;
                    f.h("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                } catch (NullPointerException e15) {
                    e = e15;
                    f.h("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                } catch (InvocationTargetException e16) {
                    e = e16;
                    f.h("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                }
            }
            if (cameraXConfig$Provider == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f13718c = cameraXConfig$Provider.getCameraXConfig();
        }
        try {
            objRetrieveOption = this.f13718c.f2119a.retrieveOption(C0214t.f2118p);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        C1005t0 c1005t0A = (C1005t0) objRetrieveOption;
        if (c1005t0A != null) {
            c1005t0A.toString();
            f.G("CameraX");
        } else {
            try {
                Bundle bundle2 = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) w0.class), 640).metaData;
                if (bundle2 == null) {
                    f.G("QuirkSettingsLoader");
                    c1005t0A = null;
                } else {
                    c1005t0A = x0.a(context, bundle2);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                f.G("QuirkSettingsLoader");
            }
            Objects.toString(c1005t0A);
            f.G("CameraX");
        }
        if (c1005t0A == null) {
            c1005t0A = v0.f14271b;
            Objects.toString(c1005t0A);
            f.G("CameraX");
        }
        v0.f14272c.f14273a.b(c1005t0A);
        try {
            objRetrieveOption2 = this.f13718c.f2119a.retrieveOption(C0214t.f2112e);
        } catch (IllegalArgumentException unused3) {
            objRetrieveOption2 = null;
        }
        Executor executor = (Executor) objRetrieveOption2;
        try {
            objRetrieveOption3 = this.f13718c.f2119a.retrieveOption(C0214t.f2113f);
        } catch (IllegalArgumentException unused4) {
            objRetrieveOption3 = null;
        }
        Handler handler = (Handler) objRetrieveOption3;
        this.f13719d = executor == null ? new ExecutorC0209n() : executor;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f13721f = handlerThread;
            handlerThread.start();
            this.f13720e = n.d(handlerThread.getLooper());
        } else {
            this.f13721f = null;
            this.f13720e = handler;
        }
        Integer num = (Integer) this.f13718c.retrieveOption(C0214t.f2114g, null);
        this.f13729n = num;
        synchronized (f13714o) {
            try {
                if (num != null) {
                    p118hf.a.h(num.intValue(), 3, 6, "minLogLevel");
                    SparseArray sparseArray = f13715p;
                    sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? ((Integer) sparseArray.get(num.intValue())).intValue() + 1 : 1));
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0214t c0214t = this.f13718c;
        c0214t.getClass();
        C0971c c0971c = C0214t.f2117o;
        Object objRetrieveOption4 = RetryPolicy.f13709a;
        try {
            objRetrieveOption4 = c0214t.f2119a.retrieveOption(c0971c);
        } catch (IllegalArgumentException unused5) {
        }
        RetryPolicy retryPolicy = (RetryPolicy) objRetrieveOption4;
        Objects.requireNonNull(retryPolicy);
        long timeoutInMillis = retryPolicy.getTimeoutInMillis();
        this.f13725j = retryPolicy instanceof RetryPolicyInternal ? ((RetryPolicyInternal) retryPolicy).copy(timeoutInMillis) : new Q0(timeoutInMillis, retryPolicy);
        synchronized (this.f13717b) {
            if (this.f13727l != 1) {
                z3 = false;
            }
            p118hf.a.k(z3, "CameraX.initInternal() should only be called once per instance");
            this.f13727l = 2;
            mVarY = AbstractC0198c.y(new c0(3, this, context));
        }
        this.f13726k = mVarY;
    }

    public static void a(Integer num) {
        synchronized (f13714o) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = f13715p;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c() {
        SparseArray sparseArray = f13715p;
        if (sparseArray.size() == 0) {
            f.f38343a = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            f.f38343a = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            f.f38343a = 4;
        } else if (sparseArray.get(5) != null) {
            f.f38343a = 5;
        } else if (sparseArray.get(6) != null) {
            f.f38343a = 6;
        }
    }

    public final CameraFactory b() {
        CameraFactory cameraFactory = this.f13722g;
        if (cameraFactory != null) {
            return cameraFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }
}
