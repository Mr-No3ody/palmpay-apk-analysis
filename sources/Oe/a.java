package Oe;

import Ab.r;
import E.K;
import E.P;
import F8.h;
import Fe.b0;
import Pa.n0;
import V5.g;
import V5.i;
import V5.t;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.camera.core.imagecapture.ImageCaptureControl;
import androidx.camera.core.impl.utils.futures.j;
import androidx.camera.core.impl.utils.futures.m;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.k;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.webkit.WebViewCompat$WebViewStartUpCallback;
import androidx.webkit.internal.s;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.impl.AnimatedDrawableBackendProvider;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$Callback;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.Gson;
import com.growingio.android.debugger.DebuggerEventWrapper$OnDebuggerEventListener;
import com.growingio.android.sdk.track.async.Callback;
import com.hjq.toast.config.IToastStyle;
import com.nimbusds.jose.shaded.gson.JsonDeserializationContext;
import com.nimbusds.jose.shaded.gson.JsonSerializationContext;
import com.nimbusds.jose.shaded.gson.o;
import com.nimbusds.jose.shaded.gson.q;
import com.rmondjone.camera.AspectRatio;
import com.transsnet.palmpay.account.bean.rsp.QueryDeviceRsp;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.rsp.AllBillDetail;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListDetail;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAllBillActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcContactActivity;
import com.transsnet.palmpay.credit.ui.fragment.CLRepaymentListFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import com.transsnet.palmpay.custom_view.input.InputMobileImpl;
import com.transsnet.palmpay.custom_view.input.OnNumberInputListener;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.databundle.viewmodel.DataBundleHomeViewModel;
import com.transsnet.palmpay.device.ui.activity.DeviceListActivity;
import com.transsnet.palmpay.device.ui.adapter.DeviceList2Adapter$OnActionListener;
import com.transsnet.palmpay.managemoney.ui.adapter.CashBoxTransactionMonthViewHolder$OnMonthClickListener;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxTransactionHistoryFragment;
import com.transsnet.palmpay.teller.ui.view.BillerCouponClickListener;
import com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon;
import com.transsnet.palmpay.ui.mvp.contract.QrcodeShareContract$IView;
import io.reactivex.functions.Consumer;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import okhttp3.WebSocket;
import org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;
import org.json.JSONObject;
import p054dd.n;
import p310ub.C2085k0;
import retrofit2.C1987e;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements IToastStyle, OnRvItemClickListener, ImageCaptureControl, Consumer, ViewPropertyAnimatorListener, AnimatedImageCompositor$Callback, AnimatedDrawableBackendProvider, Callback, JsonSerializationContext, JsonDeserializationContext, CallbackToFutureAdapter$Resolver, WebViewStartUpCallbackBoundaryInterface, DebuggerEventWrapper$OnDebuggerEventListener, CashBoxTransactionMonthViewHolder$OnMonthClickListener, OnNumberInputListener, DeviceList2Adapter$OnActionListener, CallAdapter, BillerCouponClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f6827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f6828d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6830b;

    public a(int i7) {
        this.f6829a = i7;
        switch (i7) {
            case 23:
                this.f6830b = new ArrayList();
                break;
            case 28:
                this.f6830b = new M.f(0);
                break;
            default:
                this.f6830b = new StringBuilder();
                break;
        }
    }

    public static a d() {
        if (f6827c == null) {
            synchronized (a.class) {
                try {
                    if (f6827c == null) {
                        a aVar = new a(0, false);
                        aVar.f6830b = new Gson();
                        f6827c = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6827c;
    }

    public static String e(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception unused) {
            return "";
        }
    }

    public void a(Object obj, String str) {
        StringBuilder sb2 = (StringBuilder) this.f6830b;
        sb2.append("\"");
        sb2.append((CharSequence) str);
        sb2.append("\" ");
        sb2.append("=");
        sb2.append(' ');
        if (obj != null && ((obj instanceof Character) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Double) || (obj instanceof Float))) {
            sb2.append(obj);
            return;
        }
        sb2.append("'");
        sb2.append(obj);
        sb2.append("'");
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        String str = (String) obj;
        IBaseView iBaseView = ((b0) this.f6830b).f27351a;
        if (iBaseView != null) {
            ((QrcodeShareContract$IView) iBaseView).showSavePath(str);
        }
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(Call call) {
        C1987e c1987e = new C1987e(call);
        call.enqueue(new r(c1987e, 22));
        return c1987e;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(k kVar) {
        m mVar = (m) this.f6830b;
        p118hf.a.k(mVar.f14220f == null, "The result can only set once!");
        mVar.f14220f = kVar;
        return "ListFuture[" + this + "]";
    }

    public void b(p321v7.b bVar) {
        M.f fVar = (M.f) this.f6830b;
        Iterator it = ((M.c) fVar.keySet()).iterator();
        while (true) {
            M.b bVar2 = (M.b) it;
            boolean zHasNext = bVar2.hasNext();
            int i7 = bVar.f43093b;
            int i10 = bVar.f43092a;
            if (!zHasNext) {
                TreeSet treeSet = new TreeSet();
                treeSet.add(bVar);
                fVar.put(AspectRatio.c(i10, i7), treeSet);
                return;
            }
            AspectRatio aspectRatio = (AspectRatio) bVar2.next();
            aspectRatio.getClass();
            int i11 = i7;
            int i12 = i10;
            while (i11 != 0) {
                int i13 = i12 % i11;
                i12 = i11;
                i11 = i13;
            }
            int i14 = i7 / i12;
            if (aspectRatio.f24692a == i10 / i12 && aspectRatio.f24693b == i14) {
                SortedSet sortedSet = (SortedSet) fVar.get(aspectRatio);
                if (sortedSet.contains(bVar)) {
                    return;
                }
                sortedSet.add(bVar);
                return;
            }
        }
    }

    public void c() {
        StringBuilder sb2 = (StringBuilder) this.f6830b;
        if (sb2.length() > 0) {
            sb2.append(" OR ");
        }
    }

    @Override // com.hjq.toast.config.IToastStyle
    public View createView(Context context) {
        return ((IToastStyle) this.f6830b).createView(context);
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonDeserializationContext
    public Object deserialize(o oVar, Type type) {
        com.nimbusds.jose.shaded.gson.m mVar = ((t) this.f6830b).f10052c;
        mVar.getClass();
        com.nimbusds.jose.shaded.gson.reflect.a aVar = new com.nimbusds.jose.shaded.gson.reflect.a(type);
        if (oVar == null) {
            return null;
        }
        g gVar = new g(g.f10007M);
        gVar.f10009B = new Object[32];
        gVar.f10010C = 0;
        gVar.f10011H = new String[32];
        gVar.f10012L = new int[32];
        gVar.K(oVar);
        return mVar.b(gVar, aVar);
    }

    public SortedSet f(AspectRatio aspectRatio) {
        M.f fVar = (M.f) this.f6830b;
        if (fVar.get(aspectRatio) != null) {
            return (SortedSet) fVar.get(aspectRatio);
        }
        Iterator it = ((M.c) fVar.keySet()).iterator();
        float fAbs = 1.0f;
        AspectRatio aspectRatio2 = aspectRatio;
        while (true) {
            M.b bVar = (M.b) it;
            if (!bVar.hasNext()) {
                return (SortedSet) fVar.get(aspectRatio2);
            }
            AspectRatio aspectRatio3 = (AspectRatio) bVar.next();
            if (Math.abs(aspectRatio.d() - aspectRatio3.d()) < fAbs) {
                fAbs = Math.abs(aspectRatio.d() - aspectRatio3.d());
                aspectRatio2 = aspectRatio3;
            }
        }
    }

    @Override // com.facebook.imagepipeline.animated.impl.AnimatedDrawableBackendProvider
    public AnimatedDrawableBackend get(X2.b bVar, Rect rect) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.f6830b;
        if (animatedFactoryV2Impl.f21347g == null) {
            animatedFactoryV2Impl.f21347g = new com.growingio.android.debugger.a(3);
        }
        return new Z2.a(animatedFactoryV2Impl.f21347g, bVar, rect, animatedFactoryV2Impl.f21344d);
    }

    @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$Callback
    public CloseableReference getCachedBitmap(int i7) {
        return ((BitmapFrameCache) ((O2.a) this.f6830b).f6553a).getCachedFrame(i7);
    }

    @Override // com.hjq.toast.config.IToastStyle
    public int getGravity() {
        return 17;
    }

    @Override // com.hjq.toast.config.IToastStyle
    public float getHorizontalMargin() {
        return 0.0f;
    }

    @Override // com.hjq.toast.config.IToastStyle
    public float getVerticalMargin() {
        return 0.0f;
    }

    @Override // com.hjq.toast.config.IToastStyle
    public int getXOffset() {
        return 0;
    }

    @Override // com.hjq.toast.config.IToastStyle
    public int getYOffset() {
        return 0;
    }

    @Override // androidx.camera.core.imagecapture.ImageCaptureControl
    public void lockFlashMode() {
        P p3 = (P) this.f6830b;
        synchronized (p3.f1942p) {
            try {
                if (p3.f1942p.get() != null) {
                    return;
                }
                p3.f1942p.set(Integer.valueOf(p3.F()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.transsnet.palmpay.device.ui.adapter.DeviceList2Adapter$OnActionListener
    public void onActive(Object obj) {
        Intrinsics.f(obj, "null cannot be cast to non-null type com.transsnet.palmpay.account.bean.rsp.QueryDeviceRsp");
        DeviceListActivity.m((DeviceListActivity) this.f6830b, (QueryDeviceRsp) obj, true);
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationCancel(View view) {
        He.a aVar = (He.a) this.f6830b;
        aVar.f3866d = null;
        view.setTranslationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        aVar.f3864b = false;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationEnd(View view) {
        He.a aVar = (He.a) this.f6830b;
        aVar.f3866d = null;
        view.setTranslationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        aVar.f3864b = false;
    }

    @Override // com.transsnet.palmpay.teller.ui.view.BillerCouponClickListener
    public void onCouponClaimComplete() {
        ModelActivityBannerWithCoupon modelActivityBannerWithCoupon = ((BettingHomeActivity) this.f6830b).f26683v;
        if (modelActivityBannerWithCoupon != null) {
            modelActivityBannerWithCoupon.f();
        }
    }

    @Override // com.transsnet.palmpay.teller.ui.view.BillerCouponClickListener
    public void onCouponUseClick(List list, long j6) {
        BettingHomeActivity.p((BettingHomeActivity) this.f6830b, list, j6);
    }

    @Override // com.transsnet.palmpay.device.ui.adapter.DeviceList2Adapter$OnActionListener
    public void onDeActive(Object obj) {
        Intrinsics.f(obj, "null cannot be cast to non-null type com.transsnet.palmpay.account.bean.rsp.QueryDeviceRsp");
        DeviceListActivity.m((DeviceListActivity) this.f6830b, (QueryDeviceRsp) obj, false);
    }

    @Override // com.growingio.android.debugger.DebuggerEventWrapper$OnDebuggerEventListener
    public void onDebuggerMessage(String str) {
        WebSocket webSocket = ((com.growingio.android.debugger.g) this.f6830b).f23175c.f23147b;
        if (webSocket != null) {
            webSocket.send(str);
        }
    }

    @Override // com.transsnet.palmpay.device.ui.adapter.DeviceList2Adapter$OnActionListener
    public void onDelete(Object obj) {
        DeviceListActivity.a aVar = DeviceListActivity.f31817g;
        DeviceListActivity deviceListActivity = (DeviceListActivity) this.f6830b;
        deviceListActivity.o();
        Intrinsics.f(obj, "null cannot be cast to non-null type com.transsnet.palmpay.account.bean.rsp.QueryDeviceRsp");
        O6.c cVar = new O6.c(deviceListActivity);
        cVar.e(p025ba.k.core_title_attention);
        cVar.b(h.ac_msg_delete_device);
        String string = deviceListActivity.getString(h.ac_ok);
        n nVar = new n(13, deviceListActivity, (QueryDeviceRsp) obj);
        cVar.f6600f = string;
        cVar.f6602h = nVar;
        cVar.c(h.ac_cancel, new p144jc.a(deviceListActivity, 0));
        cVar.g();
    }

    @Override // com.growingio.android.sdk.track.async.Callback
    public void onFailed() {
        p198n5.h.c("ScreenshotProvider", "Create circle screenshot failed", new Object[0]);
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener
    public void onItemClick(View itemView, int i7) {
        int i10 = this.f6829a;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        switch (i10) {
            case 2:
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment = (CLInstallmentBorrowFragment) this.f6830b;
                cLInstallmentBorrowFragment.f30559o1 = i7;
                cLInstallmentBorrowFragment.f30562p1 = (CLRepaymentPlanData) cLInstallmentBorrowFragment.f30566r1.get(i7);
                int i11 = CLInstallmentBorrowFragment.f30584M1;
                cLInstallmentBorrowFragment.s0();
                return;
            case 10:
                Wb.d dVar = (Wb.d) this.f6830b;
                Sd.b bVar = dVar.f10669a;
                if (bVar != null) {
                    bVar.onItemClick(itemView, i7);
                }
                dVar.dismiss();
                return;
            case 26:
                OcAllBillActivity ocAllBillActivity = (OcAllBillActivity) this.f6830b;
                Object obj = ocAllBillActivity.f29227A.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                OcAllBillActivity.m(ocAllBillActivity, (AllBillDetail) obj);
                return;
            case 27:
                int i12 = OcContactActivity.f29378l1;
                OcContactActivity ocContactActivity = (OcContactActivity) this.f6830b;
                Object value = ocContactActivity.f29420v0.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setVisibility(8);
                n0 n0VarG = n0.g();
                String strConcat = "OcContactActivity".concat("_element_click");
                ArrayList arrayList = ocContactActivity.f29408e1;
                if (arrayList != null) {
                    n0VarG.m(strConcat, "second_contact_rv", (String) arrayList.get(i7));
                    return;
                } else {
                    Intrinsics.n("mSecondLabelData");
                    throw null;
                }
            default:
                ArrayList arrayList2 = ((CLRepaymentListFragment) this.f6830b).f30328o;
                if (arrayList2 == null) {
                    Intrinsics.n("mData");
                    throw null;
                }
                Object obj2 = arrayList2.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                OcRepaidListDetail ocRepaidListDetail = (OcRepaidListDetail) obj2;
                Bundle bundle = new Bundle();
                bundle.putString("orderType", TransType.TRANS_TYPE_CL_REPAY);
                bundle.putString("orderNo", ocRepaidListDetail.getPayId());
                bundle.putString("cardNo", ocRepaidListDetail.getCardNo());
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "RepaymentDetails");
                return;
        }
    }

    @Override // com.transsnet.palmpay.managemoney.ui.adapter.CashBoxTransactionMonthViewHolder$OnMonthClickListener
    public void onMonthClick() {
        ((CashBoxTransactionHistoryFragment) this.f6830b).w();
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnNumberInputListener
    public void onNumberEditComplete(String str) {
        KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
        BuyBundleHomePageActivity buyBundleHomePageActivity = (BuyBundleHomePageActivity) this.f6830b;
        String strS = buyBundleHomePageActivity.s();
        if (buyBundleHomePageActivity.f31758r0.isEmpty()) {
            ((DataBundleHomeViewModel) buyBundleHomePageActivity.l()).j();
        } else {
            ((DataBundleHomeViewModel) buyBundleHomePageActivity.l()).i(strS);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnNumberInputListener
    public void onSelectNumber(InputMobileImpl item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (TextUtils.isEmpty(item.getCustomerName())) {
            return;
        }
        item.getCustomerName();
        KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
        ((BuyBundleHomePageActivity) this.f6830b).getClass();
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public void onSuccess(InvocationHandler invocationHandler) {
        ArrayList arrayList;
        WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface = (WebViewStartUpResultBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(WebViewStartUpResultBoundaryInterface.class, invocationHandler);
        Objects.requireNonNull(webViewStartUpResultBoundaryInterface);
        List<Throwable> blockingStartUpLocations = webViewStartUpResultBoundaryInterface.getBlockingStartUpLocations();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Throwable> it = blockingStartUpLocations.iterator();
        while (it.hasNext()) {
            arrayList2.add(new s(it.next()));
        }
        if (androidx.webkit.internal.o.f18317j.b()) {
            List<Throwable> asyncStartUpLocations = webViewStartUpResultBoundaryInterface.getAsyncStartUpLocations();
            arrayList = new ArrayList();
            Iterator<Throwable> it2 = asyncStartUpLocations.iterator();
            while (it2.hasNext()) {
                arrayList.add(new s(it2.next()));
            }
        } else {
            arrayList = null;
        }
        ((WebViewCompat$WebViewStartUpCallback) this.f6830b).onSuccess(new androidx.camera.video.internal.c(arrayList2, 7, arrayList, webViewStartUpResultBoundaryInterface));
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return (Type) this.f6830b;
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonSerializationContext
    public o serialize(Object obj) {
        com.nimbusds.jose.shaded.gson.m mVar = ((t) this.f6830b).f10052c;
        mVar.getClass();
        if (obj == null) {
            return q.f23687a;
        }
        Class<?> cls = obj.getClass();
        i iVar = new i();
        mVar.h(obj, cls, iVar);
        return iVar.s();
    }

    @Override // androidx.camera.core.imagecapture.ImageCaptureControl
    public ListenableFuture submitStillCaptureRequests(List list) {
        P p3 = (P) this.f6830b;
        p3.getClass();
        p140j8.f.b();
        ListenableFuture<List<Void>> listenableFutureSubmitStillCaptureRequests = p3.c().submitStillCaptureRequests(list, p3.f1941o, p3.f1943q);
        K k2 = new K(0);
        return j.i(listenableFutureSubmitStillCaptureRequests, new C2085k0(k2, 13), org.chromium.support_lib_boundary.util.b.u());
    }

    public String toString() {
        switch (this.f6829a) {
            case 15:
                return ((StringBuilder) this.f6830b).toString();
            default:
                return super.toString();
        }
    }

    @Override // androidx.camera.core.imagecapture.ImageCaptureControl
    public void unlockFlashMode() {
        P p3 = (P) this.f6830b;
        synchronized (p3.f1942p) {
            try {
                Integer num = (Integer) p3.f1942p.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != p3.F()) {
                    p3.K();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ a(int i7, boolean z3) {
        this.f6829a = i7;
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonSerializationContext
    public o serialize(Object obj, Type type) {
        com.nimbusds.jose.shaded.gson.m mVar = ((t) this.f6830b).f10052c;
        mVar.getClass();
        i iVar = new i();
        mVar.h(obj, type, iVar);
        return iVar.s();
    }

    public /* synthetic */ a(Object obj, int i7) {
        this.f6829a = i7;
        this.f6830b = obj;
    }

    public a(String str, Object obj) {
        this.f6829a = 15;
        this.f6830b = new StringBuilder();
        a(obj, str);
    }

    public a(p319v5.c cVar) {
        this.f6829a = 16;
        this.f6830b = Collections.unmodifiableMap(new HashMap(cVar.f43069b));
    }

    @Override // com.growingio.android.sdk.track.async.Callback
    public void onSuccess(Object obj) {
        U4.c cVar = (U4.c) obj;
        p198n5.h.a("ScreenshotProvider", "Create circle screenshot successfully", new Object[0]);
        U4.i iVar = (U4.i) this.f6830b;
        if (cVar != null) {
            iVar.l(cVar);
        } else {
            iVar.getClass();
        }
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationStart(View view) {
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnNumberInputListener
    public void onNumberEditing(String str) {
    }

    @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$Callback
    public void onIntermediateResult(int i7, Bitmap bitmap) {
    }
}
