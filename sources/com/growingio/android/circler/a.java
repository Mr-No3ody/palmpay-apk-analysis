package com.growingio.android.circler;

import U2.B;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Looper;
import android.util.Log;
import com.didi.drouter.store.IRouterProxy;
import com.growingio.android.sdk.track.modelloader.ModelLoader;
import com.growingio.android.sdk.track.modelloader.ModelLoaderFactory;
import com.mikepenz.iconics.utils.IconicsLogger;
import com.palmpay.lib.bridgewrapper.photo.PhotoSaveBridge;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import com.transsnet.palmpay.core.rnbridge.bridge.ContactListUploadBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.ShareCommonBridge;
import com.transsnet.palmpay.credit.rnbridge.LoanCreditBorrowBridge;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.S;
import okhttp3.U;
import org.greenrobot.eventbus.MainThreadSupport;
import org.greenrobot.eventbus.Poster;

/* JADX INFO: loaded from: classes3.dex */
public class a implements ModelLoaderFactory, AdShowCallback, MainThreadSupport, IconicsLogger, IRouterProxy, Consumer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile U f23131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static TypedArray f23132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f23133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f23134e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23135a;

    public /* synthetic */ a(int i7) {
        this.f23135a = i7;
    }

    public boolean a(CharSequence charSequence) {
        return false;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        Throwable nullPointerException = (Throwable) obj;
        String str = "The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + nullPointerException;
        if (nullPointerException == null) {
            nullPointerException = new NullPointerException();
        }
        org.chromium.support_lib_boundary.util.b.V(new p118hf.d(str, nullPointerException));
    }

    @Override // com.growingio.android.sdk.track.modelloader.ModelLoaderFactory
    public ModelLoader build() {
        if (f23131b == null) {
            synchronized (a.class) {
                try {
                    if (f23131b == null) {
                        S s3 = new S();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        s3.b(5L, timeUnit);
                        s3.e(10L, timeUnit);
                        f23131b = new U(s3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new V4.a(f23131b, 2);
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f23135a) {
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

    @Override // org.greenrobot.eventbus.MainThreadSupport
    public Poster createPoster(org.greenrobot.eventbus.c cVar) {
        return new org.greenrobot.eventbus.e(cVar, Looper.getMainLooper());
    }

    @Override // org.greenrobot.eventbus.MainThreadSupport
    public boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    @Override // com.mikepenz.iconics.utils.IconicsLogger
    public void log(int i7, String tag, String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.println(i7, tag, msg);
        if (th != null) {
            Log.println(i7, tag, Log.getStackTraceString(th));
        }
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f23135a) {
            case 6:
                return new PhotoSaveBridge();
            case 7:
                return new ContactListUploadBridge();
            case 8:
                return new ShareCommonBridge();
            default:
                return new LoanCreditBorrowBridge();
        }
    }

    @Override // com.transsnet.adsdk.widgets.interfaces.AdShowCallback
    public void showCallback(Dialog dialog) {
        super.showCallback(dialog);
        dialog.show();
    }
}
