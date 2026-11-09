package Na;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import androidx.core.app.WindowOnFrameMetricsAvailableListenerC1041j;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p052da.C1652y;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements InterceptorCallback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HandlerThread f6284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Handler f6285f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6289d;

    public a(com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.a aVar2, com.airbnb.lottie.model.animatable.a aVar3, int i7) {
        this.f6288c = aVar;
        this.f6287b = aVar2;
        this.f6289d = aVar3;
        this.f6286a = i7;
    }

    public C1652y a() {
        C1652y c1652y = (C1652y) this.f6289d;
        if (c1652y != null) {
            return c1652y;
        }
        Intrinsics.n("mChooseItemAdapter");
        throw null;
    }

    public void b(List datas) {
        Intrinsics.checkNotNullParameter(datas, "datas");
        ArrayList arrayList = (ArrayList) this.f6287b;
        arrayList.clear();
        arrayList.addAll(datas);
    }

    @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
    public void onContinue(Postcard postcard) {
        ((p261r1.c) this.f6289d).a(postcard, this.f6286a, (NavigationCallback) this.f6288c);
    }

    @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
    public void onInterrupt(Throwable th) {
        NavigationCallback navigationCallback = (NavigationCallback) this.f6288c;
        if (navigationCallback != null) {
            navigationCallback.onInterrupt((Postcard) this.f6287b);
        }
        p261r1.c.f41538a.info("ARouter::", "Navigation failed, termination by interceptor : " + th.getMessage());
    }

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f6287b = new ArrayList();
        this.f6286a = -1;
    }

    public a() {
        this.f6288c = new SparseIntArray[9];
        this.f6287b = new ArrayList();
        this.f6289d = new WindowOnFrameMetricsAvailableListenerC1041j(this);
        this.f6286a = 1;
    }

    public a(p261r1.c cVar, int i7, NavigationCallback navigationCallback, Postcard postcard) {
        this.f6289d = cVar;
        this.f6286a = i7;
        this.f6288c = navigationCallback;
        this.f6287b = postcard;
    }
}
