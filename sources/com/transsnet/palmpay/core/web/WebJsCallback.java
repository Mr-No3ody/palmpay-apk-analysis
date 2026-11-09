package com.transsnet.palmpay.core.web;

import Ab.r;
import B6.RunnableC0085g;
import C0.G;
import Da.h;
import F6.d;
import Pa.C0525w;
import Pa.F;
import Pa.T;
import Pa.i0;
import Pa.r0;
import V9.q;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.core.app.AbstractC1032a;
import androidx.fragment.app.E;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.core.LogisticsCenter;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.callback.ShowDialogCallback;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.network.api.MemberApiService;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.NetworkUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.y;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p025ba.k;
import p038ca.e;
import p071ef.b;
import p298tf.f;
import p324va.c;
import p377z5.l;
import pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\nJ\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/core/web/WebJsCallback;", "Lcom/transsnet/palmpay/core/web/JsInterface$JsCallback;", "Lcom/transsnet/palmpay/core/web/JsInterface$Callback;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "messageEvent", "", "onReceiveEventBusMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebJsCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebJsCallback.kt\ncom/transsnet/palmpay/core/web/WebJsCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,749:1\n1#2:750\n12637#3,2:751\n739#4,9:753\n37#5:762\n36#5,3:763\n*S KotlinDebug\n*F\n+ 1 WebJsCallback.kt\ncom/transsnet/palmpay/core/web/WebJsCallback\n*L\n339#1:751,2\n710#1:753,9\n711#1:762\n711#1:763,3\n*E\n"})
public final class WebJsCallback implements JsInterface.JsCallback, JsInterface.Callback, EasyPermissions$PermissionCallbacks, DefaultLifecycleObserver {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderInfoForCustomerService f28610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f28611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f28612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f28614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r f28616g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String[] f28617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f28618j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f28619o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f28620p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public WebJsCallback() {
        this(null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(E e10, boolean z3) {
        if (e10 != 0) {
            if (e10 instanceof BaseActivity) {
                ((BaseActivity) e10).showLoadingDialog(z3);
            } else if (e10 instanceof ShowDialogCallback) {
                ((ShowDialogCallback) e10).showLoadingDialog(z3);
            }
        }
    }

    public final void a(Map map) {
        String string;
        WebView webView;
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                try {
                    jSONObject.put(str, map.get(str));
                } catch (JSONException e10) {
                    d.c("JsInterface", "convertToJson1: ", e10);
                }
            }
            string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } catch (Exception e11) {
            d.c("JsInterface", "convertToJson2: ", e11);
            string = "{}";
        }
        String str2 = (String) map.get("cbId");
        WeakReference weakReference = this.f28611b;
        if (weakReference == null || (webView = (WebView) weakReference.get()) == null) {
            return;
        }
        webView.post(new h(string, str2, 15, this));
    }

    public final E b() {
        WebView webView;
        E e10;
        WeakReference weakReference = this.f28612c;
        E e11 = weakReference != null ? (E) weakReference.get() : null;
        if (e11 != null && !e11.isFinishing()) {
            return e11;
        }
        WeakReference weakReference2 = this.f28611b;
        if (weakReference2 != null && (webView = (WebView) weakReference2.get()) != null) {
            Context context = webView.getContext();
            if (context instanceof E) {
                e10 = (E) context;
            } else {
                Activity topActivity = ActivityUtils.getTopActivity();
                e10 = topActivity == null ? true : topActivity instanceof E ? (E) topActivity : null;
            }
            if (e10 != null && !e10.isFinishing()) {
                return e10;
            }
        }
        return null;
    }

    public final void c() {
        HashMap map = new HashMap();
        String str = this.f28613d;
        Intrinsics.e(str);
        map.put("cbId", str);
        map.put("fnName", "addCalendar");
        map.put("result", Boolean.FALSE);
        a(map);
    }

    @Override // com.transsnet.palmpay.core.web.JsInterface.JsCallback
    public final void callback(Map map) {
        e eVar;
        Intrinsics.checkNotNullParameter(map, "map");
        String str = (String) map.get("fnName");
        int i7 = 3;
        d.h("WebJsCallback", 3, G.o("functionName >>> ", str));
        this.f28613d = (String) map.get("cbId");
        if (FirebaseAnalytics.Event.SHARE.equals(str)) {
            User user = BaseApplication.getInstance().getUser();
            g(b(), true);
            if (this.f28616g == null) {
                r rVar = new r(24, false);
                rVar.f139b = new p103gf.a();
                this.f28616g = rVar;
            }
            r rVar2 = this.f28616g;
            if (rVar2 != null) {
                p279s5.d dVar = new p279s5.d(16, this, user);
                if (TextUtils.isEmpty(p367ya.a.d().f44149a.getString("key_invitation_code", ""))) {
                    ((MemberApiService) c.f43141a.f14622c).queryInvitationCode().k(f.f42629b).i(b.a()).subscribe(new N8.r(rVar2, 13, dVar, false));
                    return;
                } else {
                    dVar.onSuccess(p367ya.a.d().f44149a.getString("key_invitation_code", ""));
                    return;
                }
            }
            return;
        }
        boolean zEquals = "onBack".equals(str);
        Handler handler = this.f28614e;
        if (zEquals) {
            if (handler != null) {
                handler.post(new Va.h(this, 0));
                return;
            }
            return;
        }
        if ("getPhotoSource".equals(str)) {
            e(488, (String) map.get("type"));
            return;
        }
        if ("getContactInfo".equals(str)) {
            String str2 = (String) map.get("param");
            if (str2 != null) {
                String str3 = TextUtils.isEmpty(str2) ? null : str2;
                if (str3 != null) {
                    Intent intentC = F.c(b(), ARouter.getInstance().build("/contact/all").withString("orderType", C0525w.j(str3, "orderType")));
                    if (intentC == null || (eVar = this.f28620p) == null) {
                        return;
                    }
                    eVar.f(intentC, new q(this, 5));
                    return;
                }
                return;
            }
            return;
        }
        if ("setPendingBackPressed".equals(str)) {
            Object obj = map.get("param");
            this.f28615f = Intrinsics.c(obj instanceof Boolean ? (Boolean) obj : null, Boolean.TRUE);
            return;
        }
        if ("addCalendar".equals(str)) {
            return;
        }
        if ("UpgradeByBVNSuccess".equals(str)) {
            d.h("WebJsCallback", 3, "upgrade by bvn success");
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_KYC_COMPLETED));
            T.b(-4).submit(new Va.h(this, 1));
            return;
        }
        if ("swipeRefreshEnable".equals(str)) {
            boolean zBooleanValue = C0525w.g((String) map.get("param"), "param").booleanValue();
            WeakReference weakReference = this.f28611b;
            WebView webView = weakReference != null ? (WebView) weakReference.get() : null;
            ViewParent parent = webView != null ? webView.getParent() : null;
            if (parent != null ? parent instanceof SwipeRefreshLayout : true) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) (webView != null ? webView.getParent() : null);
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setEnabled(zBooleanValue);
                    return;
                }
                return;
            }
            return;
        }
        if ("showLoadingDialog".equals(str)) {
            Object obj2 = map.get("param");
            if (!(obj2 instanceof Boolean) || handler == null) {
                return;
            }
            handler.post(new RunnableC0085g(22, this, (Boolean) obj2));
            return;
        }
        if ("launchGooglePlay".equals(str)) {
            Object obj3 = map.get("param");
            if (obj3 instanceof String) {
                i0.P(ActivityUtils.getTopActivity(), (String) obj3);
                return;
            }
            return;
        }
        if ("syncContacts".equals(str)) {
            b();
            return;
        }
        if ("getLocation".equals(str)) {
            map.remove("param");
            E eB = b();
            if (eB != null) {
                String[] strArr = this.f28617i;
                if (!l.o(eB, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                    AbstractC1032a.g(eB, strArr, 490);
                }
                f(map);
                return;
            }
            return;
        }
        if ("faceCapture".equals(str)) {
            String str4 = (String) map.get("param");
            String strJ = C0525w.j(str4, "scene");
            if (!TextUtils.isEmpty(strJ)) {
                try {
                    Intrinsics.e(strJ);
                    i7 = Integer.parseInt(strJ);
                } catch (Exception unused) {
                }
            }
            d0.g(i7, "/main/palm_safe_scan_face", "extra_type").withString("extra_flag", C0525w.j(str4, "transparent")).withString("business_data", C0525w.j(str4, "extendInfo")).navigation();
            return;
        }
        if ("getRequestHeader".equals(str)) {
            String str5 = (String) map.get("param");
            String strJ2 = C0525w.j(str5, "devicePrefix");
            String strJ3 = C0525w.j(str5, "body");
            map.remove("param");
            map.put("result", r0.R0(strJ2, strJ3));
            a(map);
            return;
        }
        if ("routerH5Pre".equals(str)) {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_ROUTER_EXIT, "ROUTER_BVN_EXIT"));
        } else if ("routerH5Next".equals(str)) {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_ROUTER_NEXT, "ROUTER_BVN_NEXT"));
        }
    }

    public final boolean d(String str) {
        Collection collectionU;
        WebView webView;
        if (str != null) {
            String strG = com.transsnet.palmpay.core.config.d.g("/h5/flexi/personal-info?applyId=%1$s&loanProduct=%2$s");
            Intrinsics.checkNotNullExpressionValue(strG, "getH5Url(...)");
            List listC = new Regex("\\?").c(strG);
            if (!listC.isEmpty()) {
                ListIterator listIterator = listC.listIterator(listC.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        collectionU = z.f38935a;
                        break;
                    }
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionU = CollectionsKt.U(listC, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                collectionU = z.f38935a;
                break;
            }
            String str2 = ((String[]) collectionU.toArray(new String[0]))[0];
            Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
            if (y.m(str, str2, false)) {
                WeakReference weakReference = this.f28611b;
                if (weakReference != null && (webView = (WebView) weakReference.get()) != null) {
                    webView.post(new h("", "onBackPressed", 15, this));
                }
                return true;
            }
        }
        return this.f28615f;
    }

    public final void e(int i7, String str) {
        E eB = b();
        if (eB != null) {
            if (TransType.TRANS_SCENE_REFUND.equals(str)) {
                ARouter.getInstance().build("/account/setUserPhoto").withBoolean("takePhotoOnly", true).withBoolean("photoBig", true).navigation(eB, i7);
            } else {
                ARouter.getInstance().build("/account/setUserPhoto").withBoolean("crop_photo", false).withBoolean("photoBig", true).navigation(eB, i7);
            }
        }
    }

    public final void f(Map map) {
        d.h("TAG", 3, G.o("postLocation: ", Thread.currentThread().getName()));
        E eB = b();
        if (eB != null) {
            LocationRecord locationRecordF = p367ya.a.d().f();
            String[] strArr = this.f28617i;
            map.put("permission", Boolean.valueOf(l.o(eB, (String[]) Arrays.copyOf(strArr, strArr.length))));
            if (locationRecordF != null) {
                map.put("latitude", String.valueOf(locationRecordF.getLatitude()));
                map.put("longitude", String.valueOf(locationRecordF.getLongitude()));
                map.put("updateTime", String.valueOf(locationRecordF.getUpdateTime()));
            }
            a(map);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        org.greenrobot.eventbus.c.b().j(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        p103gf.a aVar;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        Handler handler = this.f28614e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        r rVar = this.f28616g;
        if (rVar != null && (aVar = (p103gf.a) rVar.f139b) != null) {
            aVar.dispose();
        }
        WeakReference weakReference = this.f28611b;
        if (weakReference != null) {
            weakReference.clear();
        }
        if (org.greenrobot.eventbus.c.b().e(this)) {
            org.greenrobot.eventbus.c.b().l(this);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        Handler handler = this.f28614e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsDenied(int i7, List perms) {
        Intrinsics.checkNotNullParameter(perms, "perms");
        E eB = b();
        if (eB != null) {
            if (i7 == 490) {
                HashMap map = new HashMap();
                map.put("fnName", "getLocation");
                f(map);
            } else if (i7 == 804 && !AbstractC1032a.h(eB, "android.permission.WRITE_CALENDAR")) {
                O6.c cVar = new O6.c(eB);
                cVar.e(k.core_title_attention);
                cVar.b(k.core__msg_grant_calendar_permission);
                cVar.d(k.core_confirm, null);
                cVar.g();
                c();
            }
        }
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsGranted(int i7, List perms) {
        Intrinsics.checkNotNullParameter(perms, "perms");
        E eB = b();
        if (eB != null) {
            if (i7 == 489) {
                g(eB, true);
                Ga.b.upload$default(Ga.c.f3194a, "", "2", null, 4, null);
            } else if (i7 != 490) {
                if (i7 != 804) {
                    return;
                }
                c();
            } else {
                HashMap map = new HashMap();
                map.put("fnName", "getLocation");
                f(map);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceiveEventBusMessage(@Nullable MessageEvent messageEvent) {
        if (messageEvent == null) {
            return;
        }
        int eventType = messageEvent.getEventType();
        if (eventType == 9 || eventType == 275) {
            E eB = b();
            if (eB != null) {
                eB.finish();
                return;
            }
            return;
        }
        if (eventType == 338) {
            if (this.f28618j + 60000 < System.currentTimeMillis()) {
                this.f28618j = System.currentTimeMillis();
                HashMap map = new HashMap();
                map.put("fnName", "getLocation");
                f(map);
                return;
            }
            return;
        }
        if (eventType == 354) {
            HashMap map2 = new HashMap();
            String str = this.f28613d;
            Intrinsics.e(str);
            map2.put("cbId", str);
            map2.put("fnName", "refreshElyRefund");
            a(map2);
            return;
        }
        if (eventType == 517) {
            HashMap map3 = new HashMap();
            map3.put("fnName", "faceCapture");
            String str2 = this.f28613d;
            Intrinsics.e(str2);
            map3.put("cbId", str2);
            map3.put("result", messageEvent.getEventObj());
            if (!TextUtils.isEmpty(messageEvent.getEventContent())) {
                if (Intrinsics.c(messageEvent.getEventObj(), 1)) {
                    map3.put("param", messageEvent.getEventContent());
                } else {
                    map3.put("errorMessage", messageEvent.getEventContent());
                }
            }
            a(map3);
            return;
        }
        if (eventType == 594) {
            messageEvent.getEventContent();
            HashMap map4 = new HashMap();
            map4.put("fnName", "audioDeviceChanged");
            map4.put("param", messageEvent.getEventContent());
            map4.put("cbId", "AudioChangedFinish");
            a(map4);
            return;
        }
        if (eventType == 307 || eventType == 308) {
            WeakReference weakReference = this.f28611b;
            WebView webView = weakReference != null ? (WebView) weakReference.get() : null;
            if (webView != null) {
                webView.reload();
                return;
            }
            return;
        }
        if (eventType != 340) {
            if (eventType != 341) {
                return;
            }
            g(b(), false);
            return;
        }
        g(b(), false);
        HashMap map5 = new HashMap();
        map5.put("fnName", "syncContacts");
        String str3 = this.f28613d;
        Intrinsics.e(str3);
        map5.put("cbId", str3);
        map5.put("result", 1);
        a(map5);
    }

    @Override // androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        E eB = b();
        if (eB != null) {
            eB.onRequestPermissionsResult(i7, permissions, grantResults);
        }
        l.r(i7, permissions, grantResults, this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        if (NetworkUtils.isConnected()) {
            return;
        }
        WeakReference weakReference = this.f28611b;
        WebView webView = weakReference != null ? (WebView) weakReference.get() : null;
        if (webView != null) {
            webView.loadUrl("file:///android_asset/network_error.html");
        }
    }

    @Override // com.transsnet.palmpay.core.web.JsInterface.Callback
    public final void openCustomerService(Bundle bundle) {
        Postcard postcardBuild = ARouter.getInstance().build("/main/echat");
        LogisticsCenter.completion(postcardBuild);
        Intent intent = new Intent(BaseApplication.getContext(), postcardBuild.getDestination());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("extra_data", this.f28610a);
        ActivityUtils.startActivity(intent);
    }

    public WebJsCallback(E e10, WebView webView, OrderInfoForCustomerService orderInfoForCustomerService) {
        this.f28610a = orderInfoForCustomerService;
        this.f28617i = new String[]{"android.permission.ACCESS_COARSE_LOCATION", com.transsnet.palmpay.core.config.d.j()};
        if (webView != null) {
            this.f28611b = new WeakReference(webView);
        }
        if (e10 != null) {
            this.f28612c = new WeakReference(e10);
            e10.getLifecycle().a(this);
        }
        this.f28614e = new Handler(Looper.getMainLooper());
    }
}
