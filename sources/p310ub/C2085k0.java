package p310ub;

import G1.d;
import N8.r;
import Pa.C0525w;
import Pa.F;
import Pa.r0;
import Rd.H;
import U2.B;
import U2.C;
import U2.EnumC0611b;
import U2.EnumC0612c;
import U9.g;
import V0.AbstractC0696o;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.icu.text.Collator;
import android.icu.text.RuleBasedCollator;
import android.icu.util.ULocale;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.j;
import androidx.camera.core.impl.y0;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.ListUpdateCallback;
import com.abedelazizshe.lightcompressorlibrary.CompressionProgressListener;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide$RequestOptionsFactory;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.didi.drouter.service.ICallService;
import com.didi.drouter.store.IRouterProxy;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.hermes.intl.ILocaleObject;
import com.facebook.hermes.intl.IPlatformCollator;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.soloader.C1392b;
import com.facebook.soloader.ElfByteChannel;
import com.facebook.soloader.SoFileLoader;
import com.facebook.soloader.recovery.RecoveryStrategy;
import com.facebook.soloader.w;
import com.facebook.soloader.x;
import com.google.common.util.concurrent.ListenableFuture;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.nimbusds.jose.shaded.gson.p;
import com.palmpay.lib.bridgewrapper.video.VideoUploadBridge;
import com.transsnet.palmpay.airtime.bean.ScheduleTopUpFAQBean;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpTaskListFragment;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeTopupViewModel;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayNewContactsListActivity;
import com.transsnet.palmpay.contacts.ui.adapter.PalmPayNewContactListAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.req.QueryContactReq;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import com.transsnet.palmpay.core.network.api.MemberApiService;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.OcHistoryBillListDetail;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillHistoryActivity;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import com.transsnet.palmpay.custom_view.dialog.ToastDialog;
import com.transsnet.palmpay.custom_view.input.InputMobileImpl;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.custom_view.input.OnNumberInputListener;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import com.transsnet.palmpay.send_money.ui.activity.TransferToCommonAccountActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.observable.C1759k;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C1858h;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import p025ba.k;
import p075f2.b;
import p092g2.c;
import p109h3.e;
import p198n5.h;
import p279s5.a;
import p305u5.f;
import retrofit2.K;

/* JADX INFO: renamed from: ub.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2085k0 implements OnRvItemClickListener, FutureCallback, RecoveryStrategy, ListUpdateCallback, ObservableTransformer, ImageDecoder, IPlatformCollator, PalmPayNewContactListAdapter$ItemViewOnClickListener, AsyncFunction, DifferentialMotionFlingTarget, Glide$RequestOptionsFactory, SoFileLoader, ObjectConstructor, Observer, CompressionProgressListener, OnNumberInputListener, OnItemClickListener, ResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f42878b;

    public /* synthetic */ C2085k0(int i7, boolean z3) {
        this.f42877a = i7;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:46:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static ArrayList b() {
        View[] viewArr;
        Activity activityX;
        View decorView;
        ArrayList arrayList = new ArrayList();
        Activity activityX2 = a.f42018a.x();
        if (activityX2 != null) {
            ArrayList<p305u5.a> arrayList2 = new ArrayList();
            He.a aVar = (He.a) f.f42708a.f42878b;
            boolean z3 = false;
            if (aVar != null) {
                try {
                    boolean z8 = aVar.f3864b;
                    Object obj = aVar.f3865c;
                    Field field = (Field) aVar.f3866d;
                    viewArr = z8 ? (View[]) ((ArrayList) field.get(obj)).toArray(new View[0]) : (View[]) field.get(obj);
                } catch (IllegalAccessException e10) {
                    h.b("WindowHelper", e10);
                    activityX = a.f42018a.x();
                    if (activityX != null) {
                        try {
                            decorView = activityX.getWindow().getDecorView();
                        } catch (Exception e11) {
                            h.b("WindowHelper", e11);
                            decorView = null;
                        }
                    } else {
                        decorView = null;
                    }
                    if (decorView != null) {
                        viewArr = new View[]{decorView};
                    } else {
                        viewArr = new View[0];
                    }
                }
            } else {
                activityX = a.f42018a.x();
                if (activityX != null) {
                    decorView = activityX.getWindow().getDecorView();
                } else {
                    decorView = null;
                }
                if (decorView != null) {
                    viewArr = new View[]{decorView};
                } else {
                    viewArr = new View[0];
                }
            }
            for (View view : viewArr) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                Rect rect = new Rect(i7, i10, view.getWidth() + i7, view.getHeight() + i10);
                if (view.getLayoutParams() instanceof WindowManager.LayoutParams) {
                    arrayList2.add(new p305u5.a(view, rect, (WindowManager.LayoutParams) view.getLayoutParams()));
                }
            }
            for (p305u5.a aVar2 : arrayList2) {
                View view2 = aVar2.f42700a;
                if (view2 == activityX2.getWindow().getDecorView() || view2.getContext() == activityX2) {
                    arrayList.add(aVar2);
                    z3 = true;
                } else if (z3) {
                    arrayList.add(aVar2);
                }
            }
        }
        return arrayList;
    }

    public Object a(Object... objArr) {
        IRouterProxy iRouterProxy;
        p060e2.a aVar = (p060e2.a) this.f42878b;
        Iterator it = aVar.f35996a.iterator();
        while (true) {
            Object objB = null;
            if (!it.hasNext()) {
                Object[] objArr2 = {aVar.f35997b.getSimpleName(), null};
                if (c.c()) {
                    c.a("[Local] Get service \"%s\" fail with default \"%s\"", objArr2);
                }
                return null;
            }
            b bVar = (b) it.next();
            if (aVar.f35998c.equals(bVar.f36371g)) {
                Class cls = bVar.f36366b;
                if (cls != null) {
                    ConcurrentHashMap concurrentHashMap = p060e2.a.f35994d;
                    Object obj = concurrentHashMap.get(cls);
                    if (obj == null) {
                        ConcurrentHashMap concurrentHashMap2 = p060e2.a.f35995e;
                        if (concurrentHashMap2.containsKey(cls)) {
                            obj = ((WeakReference) concurrentHashMap2.get(cls)).get();
                        }
                    }
                    if (obj == null) {
                        synchronized (p060e2.a.class) {
                            try {
                                Object obj2 = concurrentHashMap.get(cls);
                                if (obj2 == null) {
                                    ConcurrentHashMap concurrentHashMap3 = p060e2.a.f35995e;
                                    if (concurrentHashMap3.containsKey(cls)) {
                                        obj2 = ((WeakReference) concurrentHashMap3.get(cls)).get();
                                    }
                                }
                                if (obj2 == null) {
                                    if (objArr.length == 0 && (iRouterProxy = bVar.f36367c) != null) {
                                        objB = iRouterProxy.newInstance(null);
                                    }
                                    if (objB == null) {
                                        objB = c.b(cls, objArr);
                                    }
                                    if (objB != null) {
                                    }
                                } else {
                                    objB = obj2;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        objB = obj;
                    }
                }
                if (objB != null) {
                    Class cls2 = aVar.f35997b;
                    if (cls2 != ICallService.class || (!(objB instanceof ICallService.Type0) && !(objB instanceof ICallService.Type1) && !(objB instanceof ICallService.Type2) && !(objB instanceof ICallService.Type3) && !(objB instanceof ICallService.Type4) && !(objB instanceof ICallService.Type5) && !(objB instanceof ICallService.TypeN))) {
                        Object[] objArr3 = {cls2.getSimpleName(), objB.getClass().getSimpleName()};
                        if (c.c()) {
                            c.a("[Local] Get service \"%s\" with impl \"%s\"", objArr3);
                        }
                        return objB;
                    }
                    Object[] objArr4 = {cls2.getSimpleName(), objB.getClass().getSimpleName()};
                    if (c.c()) {
                        c.a("[Local] Get ICallService \"%s\" with impl \"%s\"", objArr4);
                    }
                    ClassLoader classLoader = p060e2.a.class.getClassLoader();
                    Class[] clsArr = {aVar.f35997b};
                    com.didi.drouter.service.a aVar2 = new com.didi.drouter.service.a();
                    aVar2.f21156a = objB;
                    return Proxy.newProxyInstance(classLoader, clsArr, aVar2);
                }
            }
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        return j.d(((Function) this.f42878b).apply(obj));
    }

    @Override // com.bumptech.glide.Glide$RequestOptionsFactory
    public d build() {
        d dVar = (d) this.f42878b;
        return dVar != null ? dVar : new d();
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public int compare(String str, String str2) {
        return ((RuleBasedCollator) this.f42878b).compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public IPlatformCollator configure(ILocaleObject iLocaleObject) throws B {
        C c6 = (C) iLocaleObject;
        c6.a();
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) Collator.getInstance(c6.f9108a);
        this.f42878b = ruleBasedCollator;
        ruleBasedCollator.setDecomposition(17);
        return this;
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        Type type = (Type) this.f42878b;
        if (!(type instanceof ParameterizedType)) {
            throw new p("Invalid EnumMap type: " + type.toString(), 10, false);
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new p("Invalid EnumMap type: " + type.toString(), 10, false);
    }

    @Override // com.facebook.imagepipeline.decoder.ImageDecoder
    public CloseableImage decode(e eVar, int i7, QualityInfo qualityInfo, com.facebook.imagepipeline.common.c cVar) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.f42878b;
        if (animatedFactoryV2Impl.f21345e == null) {
            animatedFactoryV2Impl.f21345e = new Y2.a(new C0525w(animatedFactoryV2Impl, 8), animatedFactoryV2Impl.f21341a);
        }
        return animatedFactoryV2Impl.f21345e.decodeGif(eVar, cVar, cVar.f21426b);
    }

    public void e(HashMap values) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(values, "values");
        for (Map.Entry entry : values.entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            Intrinsics.checkNotNullParameter(key, "key");
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f42878b;
            if (value == null) {
                value = null;
            } else {
                C1858h c1858hA = G.a(value.getClass());
                if (c1858hA.equals(G.a(Boolean.TYPE)) ? true : c1858hA.equals(G.a(Byte.TYPE)) ? true : c1858hA.equals(G.a(Integer.TYPE)) ? true : c1858hA.equals(G.a(Long.TYPE)) ? true : c1858hA.equals(G.a(Float.TYPE)) ? true : c1858hA.equals(G.a(Double.TYPE)) ? true : c1858hA.equals(G.a(String.class)) ? true : c1858hA.equals(G.a(Boolean[].class)) ? true : c1858hA.equals(G.a(Byte[].class)) ? true : c1858hA.equals(G.a(Integer[].class)) ? true : c1858hA.equals(G.a(Long[].class)) ? true : c1858hA.equals(G.a(Float[].class)) ? true : c1858hA.equals(G.a(Double[].class)) ? true : c1858hA.equals(G.a(String[].class))) {
                    continue;
                } else {
                    int i7 = 0;
                    if (c1858hA.equals(G.a(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        String str = AbstractC0696o.f9959a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i7 < length) {
                            objArr[i7] = Boolean.valueOf(zArr[i7]);
                            i7++;
                        }
                    } else if (c1858hA.equals(G.a(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        String str2 = AbstractC0696o.f9959a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i7 < length2) {
                            objArr[i7] = Byte.valueOf(bArr[i7]);
                            i7++;
                        }
                    } else if (c1858hA.equals(G.a(int[].class))) {
                        int[] iArr = (int[]) value;
                        String str3 = AbstractC0696o.f9959a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i7 < length3) {
                            objArr[i7] = Integer.valueOf(iArr[i7]);
                            i7++;
                        }
                    } else if (c1858hA.equals(G.a(long[].class))) {
                        long[] jArr = (long[]) value;
                        String str4 = AbstractC0696o.f9959a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i7 < length4) {
                            objArr[i7] = Long.valueOf(jArr[i7]);
                            i7++;
                        }
                    } else if (c1858hA.equals(G.a(float[].class))) {
                        float[] fArr = (float[]) value;
                        String str5 = AbstractC0696o.f9959a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i7 < length5) {
                            objArr[i7] = Float.valueOf(fArr[i7]);
                            i7++;
                        }
                    } else {
                        if (!c1858hA.equals(G.a(double[].class))) {
                            throw new IllegalArgumentException("Key " + key + " has invalid type " + c1858hA);
                        }
                        double[] dArr = (double[]) value;
                        String str6 = AbstractC0696o.f9959a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i7 < length6) {
                            objArr[i7] = Double.valueOf(dArr[i7]);
                            i7++;
                        }
                    }
                    value = objArr;
                }
            }
            linkedHashMap.put(key, value);
        }
    }

    public void f(int i7) {
        ((WebSettingsBoundaryInterface) this.f42878b).setForceDark(i7);
    }

    public void g() {
        ((WebSettingsBoundaryInterface) this.f42878b).setForceDarkBehavior(2);
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public String[] getAvailableLocales() {
        ArrayList arrayList = new ArrayList();
        for (ULocale uLocale : ULocale.getAvailableLocales()) {
            arrayList.add(uLocale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // androidx.core.view.DifferentialMotionFlingTarget
    public float getScaledScrollFactor() {
        return -((NestedScrollView) this.f42878b).getVerticalScrollFactorCompat();
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public EnumC0612c getSensitivity() {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) this.f42878b;
        if (ruleBasedCollator == null) {
            return EnumC0612c.f9127e;
        }
        int strength = ruleBasedCollator.getStrength();
        if (strength == 0) {
            return ((RuleBasedCollator) this.f42878b).isCaseLevel() ? EnumC0612c.f9125c : EnumC0612c.f9123a;
        }
        return strength == 1 ? EnumC0612c.f9124b : EnumC0612c.f9126d;
    }

    public void h(boolean z3) {
        ((WebSettingsBoundaryInterface) this.f42878b).setPaymentRequestEnabled(z3);
    }

    @Override // com.facebook.soloader.SoFileLoader
    public void load(String str, int i7) {
        Z4.a aVar = (Z4.a) this.f42878b;
        com.facebook.soloader.observer.Observer[] observerArr = (com.facebook.soloader.observer.Observer[]) E3.a.f2210a.get();
        if (observerArr != null) {
            for (com.facebook.soloader.observer.Observer observer : observerArr) {
                observer.onSoFileLoaderLoadStart(aVar, "load", i7);
            }
        }
        try {
            System.load(str);
            E3.a.a(null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                E3.a.a(th);
                throw th2;
            }
        }
    }

    @Override // com.facebook.soloader.SoFileLoader
    public void loadBytes(String str, ElfByteChannel elfByteChannel, int i7) {
        Z4.a aVar = (Z4.a) this.f42878b;
        com.facebook.soloader.observer.Observer[] observerArr = (com.facebook.soloader.observer.Observer[]) E3.a.f2210a.get();
        if (observerArr != null) {
            for (com.facebook.soloader.observer.Observer observer : observerArr) {
                observer.onSoFileLoaderLoadStart(aVar, "loadBytes", i7);
            }
        }
        try {
            aVar.loadBytes(str, elfByteChannel, i7);
            throw null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                E3.a.a(th);
                throw th2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int i7, int i10, Object obj) {
        M1.j jVar = (M1.j) this.f42878b;
        jVar.notifyItemRangeChanged(jVar.getHeaderLayoutCount() + i7, i10, obj);
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        switch (this.f42877a) {
            case 20:
                break;
            default:
                ((Observer) this.f42878b).onComplete();
                break;
        }
    }

    @Override // com.transsnet.palmpay.contacts.ui.adapter.PalmPayNewContactListAdapter$ItemViewOnClickListener
    public void onDeleteViewOnClick(RequestContact requestContact) {
        PalmPayNewContactsListActivity palmPayNewContactsListActivity = (PalmPayNewContactsListActivity) this.f42878b;
        W9.G g7 = palmPayNewContactsListActivity.f27250c;
        ArrayList arrayList = g7.f10613c;
        int iIndexOf = arrayList.indexOf(requestContact);
        arrayList.remove(iIndexOf);
        g7.notifyItemRemoved(iIndexOf);
        g7.notifyItemRangeChanged(iIndexOf, arrayList.size() - iIndexOf);
        ((g) palmPayNewContactsListActivity.f27350a).deleteContact(requestContact);
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        switch (this.f42877a) {
            case 20:
                return;
            default:
                Observer observer = (Observer) this.f42878b;
                try {
                    if (th == null) {
                        throw new NullPointerException("error == null");
                    }
                    observer.onNext(new retrofit2.adapter.rxjava2.d(0));
                    observer.onComplete();
                    return;
                } catch (Throwable th2) {
                    try {
                        observer.onError(th2);
                        return;
                    } catch (Throwable th3) {
                        D3.a.H(th3);
                        org.chromium.support_lib_boundary.util.b.V(new p118hf.b(th2, th3));
                        return;
                    }
                }
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        ((ImageProxy) this.f42878b).close();
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i7, int i10) {
        M1.j jVar = (M1.j) this.f42878b;
        jVar.notifyItemRangeInserted(jVar.getHeaderLayoutCount() + i7, i10);
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener
    public void onItemClick(View itemView, int i7) {
        int i10 = this.f42877a;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        switch (i10) {
            case 1:
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment = (CLInstallmentBorrowFragment) this.f42878b;
                cLInstallmentBorrowFragment.f30559o1 = i7;
                cLInstallmentBorrowFragment.f30562p1 = (CLRepaymentPlanData) cLInstallmentBorrowFragment.f30566r1.get(i7);
                int i11 = CLInstallmentBorrowFragment.f30584M1;
                cLInstallmentBorrowFragment.q0();
                return;
            default:
                OcBillHistoryActivity ocBillHistoryActivity = (OcBillHistoryActivity) this.f42878b;
                ArrayList arrayList = ocBillHistoryActivity.f29359e;
                if (arrayList == null) {
                    Intrinsics.n("mData");
                    throw null;
                }
                Object obj = arrayList.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                OcHistoryBillListDetail ocHistoryBillListDetail = (OcHistoryBillListDetail) obj;
                Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_bill_detail_activity");
                Long id2 = ocHistoryBillListDetail.getId();
                Postcard postcardWithString = postcardBuild.withLong("oc_bill_id", id2 != null ? id2.longValue() : 0L).withString("oc_card_no", ocHistoryBillListDetail.getCardNo());
                Long repaymentDateStamp = ocHistoryBillListDetail.getRepaymentDateStamp();
                postcardWithString.withLong("oc_future_repayment_date", repaymentDateStamp != null ? repaymentDateStamp.longValue() : 0L).navigation(ocBillHistoryActivity);
                return;
        }
    }

    @Override // com.transsnet.palmpay.contacts.ui.adapter.PalmPayNewContactListAdapter$ItemViewOnClickListener
    public void onItemViewOnClick(RequestContact requestContact) {
        int i7 = PalmPayNewContactsListActivity.f27248d;
        PalmPayNewContactsListActivity palmPayNewContactsListActivity = (PalmPayNewContactsListActivity) this.f42878b;
        palmPayNewContactsListActivity.showLoadingDialog(true);
        QueryContactReq queryContactReq = new QueryContactReq();
        queryContactReq.setContactsMemberId(requestContact.getContactsMemberId());
        ((MemberApiService) p324va.c.f43141a.f14622c).queryMemberContact(queryContactReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new r(palmPayNewContactsListActivity, 6, requestContact, false));
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i7, int i10) {
        M1.j jVar = (M1.j) this.f42878b;
        jVar.notifyItemMoved(jVar.getHeaderLayoutCount() + i7, jVar.getHeaderLayoutCount() + i10);
    }

    @Override // io.reactivex.Observer
    public void onNext(Object obj) {
        switch (this.f42877a) {
            case 20:
                ((ToastDialog) this.f42878b).dismiss();
                return;
            default:
                if (((K) obj) == null) {
                    throw new NullPointerException("response == null");
                }
                ((Observer) this.f42878b).onNext(new retrofit2.adapter.rxjava2.d(0));
                return;
        }
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnNumberInputListener
    public void onNumberEditComplete(String str) {
        String phoneNumber;
        int i7 = TopupAirtimeActivity.f26495x0;
        TopupAirtimeActivity topupAirtimeActivity = (TopupAirtimeActivity) this.f42878b;
        if (topupAirtimeActivity.f26497B.isEmpty()) {
            AirTimeTopupViewModel airTimeTopupViewModel = (AirTimeTopupViewModel) topupAirtimeActivity.l();
            if (airTimeTopupViewModel != null) {
                airTimeTopupViewModel.f();
            }
        } else {
            topupAirtimeActivity.A(str);
        }
        H h7 = (H) topupAirtimeActivity.f27334c;
        if (h7 == null || (phoneNumber = h7.f8066g.getPhoneNumber()) == null) {
            phoneNumber = "";
        }
        if (!r0.b1(phoneNumber)) {
            H h10 = (H) topupAirtimeActivity.f27334c;
            if (h10 != null) {
                h10.f8066g.setError(topupAirtimeActivity.getString(k.core_please_enter_11_digit_phone_number));
            }
        } else if (y.m(phoneNumber, "0234", false) || y.m(phoneNumber, "234", false)) {
            H h11 = (H) topupAirtimeActivity.f27334c;
            if (h11 != null) {
                h11.f8066g.setError(topupAirtimeActivity.getString(k.core_check_number));
            }
        } else {
            H h12 = (H) topupAirtimeActivity.f27334c;
            if (h12 != null) {
                h12.f8066g.setError("");
            }
        }
        H h13 = (H) topupAirtimeActivity.f27334c;
        KeyboardUtils.hideSoftInput(h13 != null ? h13.f8066g.getPhoneNumberEdit() : null);
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnNumberInputListener
    public void onNumberEditing(String str) {
        if (PhoneBaseNumberUtils.INSTANCE.isValidMobileNumber(str, BaseApplication.getCountryLocale(), false)) {
            return;
        }
        int i7 = TopupAirtimeActivity.f26495x0;
    }

    @Override // com.abedelazizshe.lightcompressorlibrary.CompressionProgressListener
    public void onProgressCancelled(int i7) {
        ((VideoUploadBridge.AnonymousClass1.AnonymousClass2) this.f42878b).onCancelled(i7);
    }

    @Override // com.abedelazizshe.lightcompressorlibrary.CompressionProgressListener
    public void onProgressChanged(int i7, float f10) {
        ((VideoUploadBridge.AnonymousClass1.AnonymousClass2) this.f42878b).onProgress(i7, f10);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i7, int i10) {
        M1.j jVar = (M1.j) this.f42878b;
        S1.c mLoadMoreModule$com_github_CymChad_brvah = jVar.getMLoadMoreModule$com_github_CymChad_brvah();
        if (mLoadMoreModule$com_github_CymChad_brvah != null && mLoadMoreModule$com_github_CymChad_brvah.d() && jVar.getItemCount() == 0) {
            jVar.notifyItemRangeRemoved(jVar.getHeaderLayoutCount() + i7, i10 + 1);
        } else {
            jVar.notifyItemRangeRemoved(jVar.getHeaderLayoutCount() + i7, i10);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnNumberInputListener
    public void onSelectNumber(InputMobileImpl item) {
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        Intrinsics.checkNotNullParameter(item, "item");
        int i7 = TopupAirtimeActivity.f26495x0;
        TopupAirtimeActivity topupAirtimeActivity = (TopupAirtimeActivity) this.f42878b;
        H h7 = (H) topupAirtimeActivity.f27334c;
        if (h7 != null && (modelMobileWithIconInputLayout = h7.f8066g) != null) {
            ModelMobileWithIconInputLayout.showContactIv$default(modelMobileWithIconInputLayout, true, false, 2, null);
        }
        if (TextUtils.isEmpty(item.getCustomerName())) {
            return;
        }
        item.getCustomerName();
        topupAirtimeActivity.getClass();
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        switch (this.f42877a) {
            case 20:
                ((ToastDialog) this.f42878b).addSubscription(disposable);
                break;
            default:
                ((Observer) this.f42878b).onSubscribe(disposable);
                break;
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, x[] xVarArr) {
        if (unsatisfiedLinkError instanceof w) {
            Log.e("SoLoader", "Checking /data/app missing libraries.");
            File file = new File(((Context) this.f42878b).getApplicationInfo().nativeLibraryDir);
            if (!file.exists()) {
                Log.e("SoLoader", "Native library directory " + file + " does not exist, exiting /data/app recovery.");
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (x xVar : xVarArr) {
                if (xVar instanceof C1392b) {
                    C1392b c1392b = (C1392b) xVar;
                    try {
                        for (com.facebook.soloader.B b7 : c1392b.g()) {
                            if (!new File(file, b7.f21850a).exists()) {
                                arrayList.add(b7.f21850a);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Log.e("SoLoader", "Missing libraries from " + file + ": " + arrayList.toString() + ", will run prepare on tbe backup so source");
                            c1392b.d(0);
                            break;
                        }
                        Log.e("SoLoader", "No libraries missing from " + file);
                        return false;
                    } catch (Exception e10) {
                        Log.e("SoLoader", "Encountered an exception while recovering from /data/app failure ", e10);
                    }
                }
            }
            for (x xVar2 : xVarArr) {
                if ((xVar2 instanceof com.facebook.soloader.e) && !(xVar2 instanceof C1392b)) {
                    com.facebook.soloader.e eVar = (com.facebook.soloader.e) xVar2;
                    eVar.f21878b = 1 | eVar.f21878b;
                }
            }
            Log.e("SoLoader", "Successfully recovered from /data/app disk failure.");
            return true;
        }
        return false;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public IPlatformCollator setCaseFirstAttribute(EnumC0611b enumC0611b) {
        int iOrdinal = enumC0611b.ordinal();
        if (iOrdinal == 0) {
            ((RuleBasedCollator) this.f42878b).setUpperCaseFirst(true);
            return this;
        }
        if (iOrdinal != 1) {
            ((RuleBasedCollator) this.f42878b).setCaseFirstDefault();
            return this;
        }
        ((RuleBasedCollator) this.f42878b).setLowerCaseFirst(true);
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public IPlatformCollator setIgnorePunctuation(boolean z3) {
        if (z3) {
            ((RuleBasedCollator) this.f42878b).setAlternateHandlingShifted(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public IPlatformCollator setNumericAttribute(boolean z3) {
        if (z3) {
            ((RuleBasedCollator) this.f42878b).setNumericCollation(Boolean.TRUE.booleanValue());
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public IPlatformCollator setSensitivity(EnumC0612c enumC0612c) {
        int iOrdinal = enumC0612c.ordinal();
        if (iOrdinal == 0) {
            ((RuleBasedCollator) this.f42878b).setStrength(0);
            return this;
        }
        if (iOrdinal == 1) {
            ((RuleBasedCollator) this.f42878b).setStrength(1);
            return this;
        }
        if (iOrdinal == 2) {
            ((RuleBasedCollator) this.f42878b).setStrength(0);
            ((RuleBasedCollator) this.f42878b).setCaseLevel(true);
            return this;
        }
        if (iOrdinal != 3) {
            return this;
        }
        ((RuleBasedCollator) this.f42878b).setStrength(2);
        return this;
    }

    @Override // androidx.core.view.DifferentialMotionFlingTarget
    public boolean startDifferentialMotionFling(float f10) {
        if (f10 == 0.0f) {
            return false;
        }
        stopDifferentialMotionFling();
        ((NestedScrollView) this.f42878b).d((int) f10);
        return true;
    }

    @Override // androidx.core.view.DifferentialMotionFlingTarget
    public void stopDifferentialMotionFling() {
        ((NestedScrollView) this.f42878b).f16321d.abortAnimation();
    }

    public /* synthetic */ C2085k0(Object obj, int i7) {
        this.f42877a = i7;
        this.f42878b = obj;
    }

    @Override // io.reactivex.ObservableTransformer
    public ObservableSource apply(df.d dVar) {
        return new C1759k(dVar.k(p298tf.f.f42629b), new p1.c(this, 6), p147jf.a.f38600d, p147jf.a.f38599c);
    }

    @Override // com.transsnet.palmpay.core.callback.ResultCallback
    public void onComplete(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            TransferToCommonAccountActivity.x((TransferToCommonAccountActivity) this.f42878b);
        }
    }

    public C2085k0(M1.j mAdapter) {
        this.f42877a = 5;
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        this.f42878b = mAdapter;
    }

    public C2085k0(Class cls) {
        this.f42877a = 21;
        this.f42878b = new p060e2.a(cls);
    }

    public C2085k0(int i7) {
        He.a aVar;
        this.f42877a = i7;
        switch (i7) {
            case 9:
                this.f42878b = new LinkedHashMap();
                break;
            case 28:
                try {
                    aVar = new He.a(9);
                } catch (Exception e10) {
                    h.b("WindowHelper", e10);
                    aVar = null;
                }
                this.f42878b = aVar;
                break;
            default:
                this.f42878b = new LinkedHashSet();
                break;
        }
    }

    public C2085k0(y0 y0Var) {
        this.f42877a = 12;
        this.f42878b = (CaptureSessionOnClosedNotCalledQuirk) y0Var.b(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        ScheduleTopUpTaskListFragment scheduleTopUpTaskListFragment = (ScheduleTopUpTaskListFragment) this.f42878b;
        ActivityUtils.startActivity(F.a(scheduleTopUpTaskListFragment.requireContext(), ((ScheduleTopUpFAQBean) scheduleTopUpTaskListFragment.u().getItem(i7)).getUrl()));
    }

    public C2085k0(AnimatedDrawableBackend animatedDrawableBackend, Oe.a aVar) {
        this.f42877a = 11;
        this.f42878b = animatedDrawableBackend;
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public C2085k0(TextView textView) {
        this.f42877a = 25;
        this.f42878b = new p228p0.g(textView);
    }

    private final void c() {
    }

    private final void d(Throwable th) {
    }
}
