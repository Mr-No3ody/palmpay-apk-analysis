package androidx.core.provider;

import Ce.H;
import Gb.HandlerC0283f;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.work.impl.C1271d;
import androidx.work.impl.J;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.alibaba.android.arouter.core.InterceptorServiceImpl;
import com.alibaba.android.arouter.exception.HandlerException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.thread.CancelableCountDownLatch;
import com.dylanvann.fastimage.FastImageSource;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.producers.m0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.api.Service;
import com.growingio.android.sdk.track.events.EventBuildInterceptor;
import com.gyf.immersionbar.NotchCallback;
import com.gyf.immersionbar.NotchUtils;
import com.palmpay.image.webp.XGLTextureView;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpHomeActivity;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxCampaignMainActivity;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.activity.MyAssetsActivity;
import com.transsnet.palmpay.ui.activity.coupon.CouponPackageResultActivity;
import com.transsnet.palmpay.ui.activity.message.NotificationListV2Activity;
import io.reactivex.internal.operators.observable.C1756h;
import io.reactivex.internal.operators.observable.K;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.Poster;
import p102ge.w;
import p141j9.B;
import p190mf.r;
import p190mf.s;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable, Poster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16137c;

    public /* synthetic */ m(int i7, Object obj, Object obj2) {
        this.f16135a = i7;
        this.f16136b = obj;
        this.f16137c = obj2;
    }

    private final void a() {
        if (((p111h5.c) this.f16136b) == null) {
            return;
        }
        ((com.growingio.android.sdk.a) p279s5.d.b().f42025b).getClass();
        String strB = ((p111h5.c) this.f16136b).b();
        ArrayList arrayList = p124i5.a.f37425a;
        int i7 = ((com.growingio.android.sdk.a) p279s5.d.b().f42025b).f23192o;
        if (i7 > 0) {
            ArrayList arrayList2 = p124i5.a.f37425a;
            if (((arrayList2.contains(strB) ? 1 << arrayList2.indexOf(strB) : 0) & i7) > 0) {
                return;
            }
        }
        if (!p152k5.e.f38687a.f38688a.getBoolean("SEND_VISIT_AFTER_REFRESH_SESSION_ID", false)) {
            p279s5.l.f42040a.getClass();
            p279s5.m.a();
        }
        e5.d dVar = (e5.d) this.f16137c;
        p111h5.c cVar = (p111h5.c) this.f16136b;
        dVar.getClass();
        cVar.c();
        synchronized (dVar.f36167e) {
            Iterator it = dVar.f36167e.iterator();
            while (it.hasNext()) {
                EventBuildInterceptor eventBuildInterceptor = (EventBuildInterceptor) it.next();
                if (eventBuildInterceptor == null) {
                    it.remove();
                } else {
                    try {
                        eventBuildInterceptor.eventWillBuild(cVar);
                    } catch (Exception e10) {
                        p198n5.h.b("TrackMainThread", e10);
                    }
                }
            }
        }
        p111h5.d dVarA = cVar.a();
        synchronized (dVar.f36167e) {
            Iterator it2 = dVar.f36167e.iterator();
            while (it2.hasNext()) {
                EventBuildInterceptor eventBuildInterceptor2 = (EventBuildInterceptor) it2.next();
                if (eventBuildInterceptor2 == null) {
                    it2.remove();
                } else {
                    try {
                        eventBuildInterceptor2.eventDidBuild(dVarA);
                    } catch (Exception e11) {
                        p198n5.h.b("TrackMainThread", e11);
                    }
                }
            }
        }
        if (dVarA != null) {
            p198n5.h.e("TrackMainThread", "save: event, type is " + p111h5.d.b(dVarA.f37339g), dVarA.c().toString());
        }
        p216o5.c cVar2 = dVar.f36166d;
        cVar2.getClass();
        if (dVarA.a() == 1 || cVar2.f40047h <= 1) {
            cVar2.b();
            p216o5.a aVar = new p216o5.a();
            aVar.f40028a = 0;
            ArrayList arrayList3 = new ArrayList();
            aVar.f40029b = arrayList3;
            arrayList3.add(dVarA);
            p216o5.c.a(aVar);
        } else {
            synchronized (cVar2.f40050k) {
                try {
                    cVar2.f40050k.add(dVarA);
                    if (cVar2.f40050k.size() >= cVar2.f40047h) {
                        cVar2.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (dVarA.a() == 1) {
            HandlerC0283f handlerC0283f = cVar2.f40043d;
            int i10 = HandlerC0283f.f3272c;
            handlerC0283f.removeMessages(1);
            handlerC0283f.sendEmptyMessage(1);
            return;
        }
        if (cVar2.f40045f <= 0) {
            HandlerC0283f handlerC0283f2 = cVar2.f40043d;
            int i11 = HandlerC0283f.f3272c;
            handlerC0283f2.removeMessages(2);
            handlerC0283f2.sendEmptyMessage(2);
            return;
        }
        int i12 = cVar2.f40049j + 1;
        cVar2.f40049j = i12;
        if (i12 >= cVar2.f40048i) {
            p198n5.h.a("EventSender", "cacheEventNum >= eventUploadBulkSize, toggle one send action", new Object[0]);
            HandlerC0283f handlerC0283f3 = cVar2.f40043d;
            int i13 = HandlerC0283f.f3272c;
            handlerC0283f3.removeMessages(2);
            handlerC0283f3.sendEmptyMessage(2);
            cVar2.f40049j = 0;
        }
    }

    private final void b() {
        p063e6.a aVar = (p063e6.a) this.f16137c;
        com.palmpay.image.webp.a aVar2 = aVar.f36168b.f23730A;
        ImageInfo imageInfo = (ImageInfo) this.f16136b;
        int width = imageInfo.getWidth();
        int height = imageInfo.getHeight();
        aVar2.f23755i = -1;
        Bitmap bitmap = aVar2.f23759m;
        if ((bitmap == null || width != aVar2.f23760n || aVar2.f23761o != height) && width != 0 && height != 0) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            aVar2.f23759m = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            aVar2.f23760n = width;
            aVar2.f23761o = height;
        }
        com.palmpay.image.webp.f fVar = aVar.f36168b.f23734b;
        fVar.getClass();
        V7.g gVar = XGLTextureView.t;
        synchronized (gVar) {
            fVar.t = true;
            gVar.notifyAll();
        }
    }

    private final void c() {
        Runnable runnable;
        ((SingleThreadCachedScheduler) this.f16137c).tryExecuteRunnable((Runnable) this.f16136b);
        while (true) {
            synchronized (((SingleThreadCachedScheduler) this.f16137c).queue) {
                try {
                    SingleThreadCachedScheduler singleThreadCachedScheduler = (SingleThreadCachedScheduler) this.f16137c;
                    if (singleThreadCachedScheduler.isTeardown) {
                        return;
                    }
                    boolean zIsEmpty = singleThreadCachedScheduler.queue.isEmpty();
                    SingleThreadCachedScheduler singleThreadCachedScheduler2 = (SingleThreadCachedScheduler) this.f16137c;
                    if (zIsEmpty) {
                        singleThreadCachedScheduler2.isThreadProcessing = false;
                        return;
                    } else {
                        runnable = (Runnable) singleThreadCachedScheduler2.queue.get(0);
                        ((SingleThreadCachedScheduler) this.f16137c).queue.remove(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((SingleThreadCachedScheduler) this.f16137c).tryExecuteRunnable(runnable);
        }
    }

    @Override // org.greenrobot.eventbus.Poster
    public void enqueue(org.greenrobot.eventbus.l lVar, Object obj) {
        ((p039cb.c) this.f16136b).a(org.greenrobot.eventbus.g.a(lVar, obj));
        ((org.greenrobot.eventbus.c) this.f16137c).f41065j.execute(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.work.impl.model.k kVar;
        switch (this.f16135a) {
            case 0:
                ((g) this.f16136b).accept(this.f16137c);
                return;
            case 1:
                C1271d c1271d = ((androidx.work.impl.foreground.a) this.f16137c).f18553a.f18680g;
                String str = (String) this.f16136b;
                synchronized (c1271d.f18540k) {
                    try {
                        J jC = c1271d.c(str);
                        kVar = jC != null ? jC.f18372a : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (kVar == null || !kVar.c()) {
                    return;
                }
                synchronized (((androidx.work.impl.foreground.a) this.f16137c).f18555c) {
                    ((androidx.work.impl.foreground.a) this.f16137c).f18558f.put(p140j8.f.j(kVar), kVar);
                    androidx.work.impl.foreground.a aVar = (androidx.work.impl.foreground.a) this.f16137c;
                    ((androidx.work.impl.foreground.a) this.f16137c).f18559g.put(p140j8.f.j(kVar), androidx.work.impl.constraints.m.a(aVar.f18560i, kVar, aVar.f18554b.f18728b, aVar));
                    break;
                }
                return;
            case 2:
                try {
                    ((Runnable) this.f16137c).run();
                    synchronized (((androidx.work.impl.utils.k) this.f16136b).f18704d) {
                        ((androidx.work.impl.utils.k) this.f16136b).a();
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (((androidx.work.impl.utils.k) this.f16136b).f18704d) {
                        ((androidx.work.impl.utils.k) this.f16136b).a();
                        throw th2;
                    }
                }
            case 3:
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ch.h hVar = (ch.h) this.f16137c;
                long j6 = hVar.f19056e - jElapsedRealtime;
                if (j6 < 1000) {
                    hVar.e();
                    return;
                }
                int i7 = (int) (j6 / 1000);
                ch.k kVar2 = hVar.f19057f;
                if (!kVar2.isDestroyed()) {
                    hVar.f19055d.setEnabled(false);
                    hVar.f19055d.setText(kVar2.getString(p349x8.d.mtn_str_resend_with_time, Integer.valueOf(i7)));
                    hVar.f19055d.setTextColor(Color.parseColor("#858A8F"));
                }
                ((Handler) this.f16136b).postDelayed(this, 500L);
                return;
            case 4:
                InterceptorCallback interceptorCallback = (InterceptorCallback) this.f16137c;
                Postcard postcard = (Postcard) this.f16136b;
                CancelableCountDownLatch cancelableCountDownLatch = new CancelableCountDownLatch(com.alibaba.android.arouter.core.b.f20356f.size());
                try {
                    InterceptorServiceImpl._execute(0, cancelableCountDownLatch, postcard);
                    cancelableCountDownLatch.await(postcard.getTimeout(), TimeUnit.SECONDS);
                    if (cancelableCountDownLatch.getCount() > 0) {
                        interceptorCallback.onInterrupt(new HandlerException("The interceptor processing timed out."));
                    } else if (postcard.getTag() != null) {
                        interceptorCallback.onInterrupt((Throwable) postcard.getTag());
                    } else {
                        interceptorCallback.onContinue(postcard);
                    }
                    return;
                } catch (Exception e10) {
                    interceptorCallback.onInterrupt(e10);
                    return;
                }
            case 5:
                int i10 = 0;
                while (true) {
                    ReadableArray readableArray = (ReadableArray) this.f16136b;
                    if (i10 >= readableArray.size()) {
                        return;
                    }
                    ReadableMap map = readableArray.getMap(i10);
                    Activity activity = (Activity) this.f16137c;
                    FastImageSource fastImageSourceA = com.dylanvann.fastimage.f.a(activity, map);
                    com.bumptech.glide.m mVarA = com.bumptech.glide.b.e(activity.getApplicationContext()).load(fastImageSourceA.isBase64Resource() ? fastImageSourceA.getSource() : fastImageSourceA.get_isResource() ? fastImageSourceA.getUri() : fastImageSourceA.getGlideUrl()).a(com.dylanvann.fastimage.f.b(activity, fastImageSourceA, map));
                    mVarA.getClass();
                    mVarA.T(new H1.j(mVarA.f21022k0), null, mVarA, J1.g.f4461a);
                    i10++;
                }
                break;
            case 6:
                com.bumptech.glide.b.b(((Activity) this.f16136b).getApplicationContext()).a();
                ((Promise) this.f16137c).resolve(null);
                return;
            case 7:
                n0 n0Var = ((m0) this.f16137c).f21599c;
                Pair pair = (Pair) this.f16136b;
                Consumer consumer = (Consumer) pair.first;
                ProducerContext producerContext = (ProducerContext) pair.second;
                n0Var.getClass();
                producerContext.getProducerListener().onProducerFinishWithSuccess(producerContext, "ThrottlingProducer", null);
                n0Var.f21600a.produceResults(new m0(n0Var, consumer), producerContext);
                return;
            case 8:
                ((com.growingio.android.debugger.g) ((com.growingio.android.circler.g) this.f16137c).f23148c).onMessage((String) this.f16136b);
                return;
            case 9:
                NotchCallback notchCallback = (NotchCallback) this.f16136b;
                if (notchCallback != null) {
                    notchCallback.onNotchHeight(NotchUtils.getNotchHeight((Activity) this.f16137c));
                    return;
                }
                return;
            case 10:
                ((InputMethodManager) this.f16136b).showSoftInput((EditText) this.f16137c, 0);
                return;
            case 11:
                ((Handler) this.f16136b).post(new androidx.customview.widget.e((CoreCashierPreviewActivity) this.f16137c, 21));
                return;
            case 12:
                ((Handler) this.f16136b).post(new androidx.customview.widget.e((CashBoxCampaignMainActivity) this.f16137c, 23));
                return;
            case 13:
                WheelView wheelView = (WheelView) this.f16137c;
                wheelView.setWheelData((List) this.f16136b);
                super/*android.widget.ListView*/.setSelection(wheelView.f31728f);
                WheelView.b(wheelView, true);
                return;
            case 14:
                a();
                return;
            case 15:
                b();
                return;
            case 16:
                ((Handler) this.f16136b).post(new w((HomeActivity) this.f16137c, 0));
                return;
            case 17:
                ((Handler) this.f16136b).post(new androidx.customview.widget.e((MyAssetsActivity) this.f16137c, 25));
                return;
            case 18:
                C1756h c1756h = (C1756h) this.f16137c;
                df.h hVar2 = c1756h.f37822d;
                try {
                    c1756h.f37819a.onError((Throwable) this.f16136b);
                    return;
                } finally {
                    hVar2.dispose();
                }
            case 19:
                ((C1756h) this.f16136b).f37819a.onNext(this.f16137c);
                return;
            case 20:
                ((K) this.f16137c).f37797a.subscribe((io.reactivex.internal.operators.observable.J) this.f16136b);
                return;
            case 21:
                ((Handler) this.f16136b).post(new androidx.customview.widget.e((ScheduleTopUpHomeActivity) this.f16137c, 29));
                return;
            case 22:
                ((Handler) this.f16136b).post(new B((TopupAirtimeActivity) this.f16137c, 0));
                return;
            case 23:
                ((Handler) this.f16136b).post(new B((CouponPackageResultActivity) this.f16137c, 1));
                return;
            case 24:
                Map map2 = (Map) this.f16136b;
                if (map2 != null) {
                    for (Map.Entry entry : map2.entrySet()) {
                        p152k5.d dVar = (p152k5.d) this.f16137c;
                        HashMap map3 = dVar.f38685g;
                        p152k5.g gVar = (p152k5.g) map3.get(entry.getKey());
                        if (gVar == null) {
                            dVar.c();
                            gVar = (p152k5.g) map3.get(entry.getKey());
                            if (gVar == null) {
                                gVar = new p152k5.g(dVar.f38683e, dVar.f38686h, (String) entry.getKey());
                                map3.put((String) entry.getKey(), gVar);
                            }
                        }
                        gVar.c(dVar.f38683e, 5, entry.getValue());
                    }
                    return;
                }
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((AsyncTaskExecutor) ((H) this.f16136b).f1427d).onPostExecute(this.f16137c);
                return;
            case 26:
                c();
                return;
            case 27:
                ((Handler) this.f16136b).post(new B((NotificationListV2Activity) this.f16137c, 6));
                return;
            case 28:
                ((r) this.f16136b).f39713d = true;
                ((s) this.f16137c).f39714a.remove((r) this.f16136b);
                return;
            default:
                org.greenrobot.eventbus.g gVarE = ((p039cb.c) this.f16136b).e();
                if (gVarE == null) {
                    throw new IllegalStateException("No pending post available");
                }
                ((org.greenrobot.eventbus.c) this.f16137c).c(gVarE);
                return;
        }
    }

    public /* synthetic */ m(Object obj, int i7, Object obj2, boolean z3) {
        this.f16135a = i7;
        this.f16137c = obj;
        this.f16136b = obj2;
    }

    public m(org.greenrobot.eventbus.c cVar) {
        this.f16135a = 29;
        this.f16137c = cVar;
        this.f16136b = new p039cb.c(14, false);
    }
}
