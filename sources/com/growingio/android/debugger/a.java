package com.growingio.android.debugger;

import U2.B;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import androidx.datastore.core.CorruptionHandler;
import com.didi.drouter.store.IRouterProxy;
import com.growingio.android.sdk.track.modelloader.ModelLoader;
import com.growingio.android.sdk.track.modelloader.ModelLoaderFactory;
import com.hjq.toast.config.IToastInterceptor;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import com.transsnet.palmpay.core.rnbridge.bridge.FaceBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.ShareImageBridge;
import com.transsnet.palmpay.credit.rnbridge.PalmPayCardBridge;
import java.lang.reflect.Modifier;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import okhttp3.S;
import okhttp3.U;
import p135j0.C1767a;
import p377z5.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ModelLoaderFactory, AdShowCallback, ObjectConstructor, IRouterProxy, CorruptionHandler, IToastInterceptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile U f23152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f23153c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23154a;

    public /* synthetic */ a(int i7) {
        this.f23154a = i7;
    }

    @Override // com.growingio.android.sdk.track.modelloader.ModelLoaderFactory
    public ModelLoader build() {
        c cVar = b.f23155a;
        cVar.getClass();
        e5.c.f36164a.w(cVar);
        if (f23152b == null) {
            synchronized (a.class) {
                try {
                    if (f23152b == null) {
                        S s3 = new S();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        s3.b(5L, timeUnit);
                        s3.e(10L, timeUnit);
                        f23152b = new U(s3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new V4.a(f23152b, 3);
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f23154a) {
            case 6:
                throw new B(11);
            case 7:
                throw new B(11);
            case 8:
                throw new B(11);
            default:
                throw new B(11);
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        return new TreeSet();
    }

    @Override // com.hjq.toast.config.IToastInterceptor
    public boolean intercept(p377z5.j jVar) {
        CharSequence charSequence = jVar.f44470a;
        if (l.f44484e == null) {
            Application application = l.f44480a;
            if (application == null) {
                throw new IllegalStateException("Toaster has not been initialized");
            }
            l.f44484e = Boolean.valueOf((application.getApplicationInfo().flags & 2) != 0);
        }
        if (l.f44484e.booleanValue()) {
            for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
                if (stackTraceElement.getLineNumber() > 0) {
                    try {
                        Class<?> cls = Class.forName(stackTraceElement.getClassName());
                        if (!IToastInterceptor.class.isAssignableFrom(cls) && !l.class.equals(cls) && !cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
                            stackTraceElement.getFileName();
                            charSequence.toString();
                            break;
                        }
                    } catch (ClassNotFoundException e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }
        return false;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f23154a) {
            case 6:
                return new PhotoMultipleUploadBridge();
            case 7:
                return new FaceBridge();
            case 8:
                return new ShareImageBridge();
            default:
                return new PalmPayCardBridge();
        }
    }

    @Override // com.transsnet.adsdk.widgets.interfaces.AdShowCallback
    public void showCallback(Dialog dialog) {
        super.showCallback(dialog);
        dialog.show();
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(C1767a c1767a, Continuation continuation) throws C1767a {
        throw c1767a;
    }
}
