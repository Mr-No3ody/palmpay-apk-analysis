package Pa;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.util.pool.FactoryPools$Factory;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.impl.AnimatedDrawableBackendProvider;
import com.google.api.Service;
import com.google.common.primitives.UnsignedBytes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.growingio.android.debugger.DebuggerEventWrapper$OnDebuggerEventListener;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.palmpay.lib.liveness.cache.ICacheService;
import com.palmpay.lib.scanplus.ScanPlusActivity;
import com.palmpay.lib.scanplus.bean.CodeBean;
import com.palmpay.lib.scanplus.callback.OnScanListener;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.transsnet.analysis.utils.GsonUtil;
import com.transsnet.mtn.sdk.http.resp.CommonResult;
import com.transsnet.mtn.sdk.http.resp.LoginResp;
import com.transsnet.palmpay.common.export.dialog.EnableTouchIdDialog;
import com.transsnet.palmpay.contacts.contract.LocalContactsListContract$IView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.MobileWalletResp;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.rsp.ALiFaceCheckResultData;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack;
import com.transsnet.palmpay.credit.bean.rsp.AllBillDetail;
import com.transsnet.palmpay.credit.ui.activity.AliFaceActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAllBillActivity;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.managemoney.ui.adapter.CashBoxTransactionMonthViewHolder$OnMonthClickListener;
import com.transsnet.palmpay.managemoney.ui.fragment.FundTransactionHistoryFragment;
import com.transsnet.palmpay.teller.ui.view.BillerCouponClickListener;
import com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView;
import com.transsnet.palmpay.util.CloseUtils;
import com.transsnet.palmpay.util.ZipUtils;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import okhttp3.Callback;
import okhttp3.WebSocket;
import org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import p016b.b$a;
import retrofit2.C1987e;
import retrofit2.Call;

/* JADX INFO: renamed from: Pa.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0525w implements DataRewinder, FutureCallback, Consumer, OnScanListener, Callback, AnimatedDrawableBackendProvider, Argument2Callback, MenuItemHoverListener, WebViewStartUpConfigBoundaryInterface, b$a, FactoryPools$Factory, DebuggerEventWrapper$OnDebuggerEventListener, ObjectConstructor, CashBoxTransactionMonthViewHolder$OnMonthClickListener, BillerCouponClickListener, ICacheService, retrofit2.Callback, ScanFaceLogicUtil$IScanFaceResultCallBack, OnRvItemClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0525w f7164c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7166b;

    public C0525w(Context context) {
        this.f7165a = 26;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("liveness_cache", "cacheName");
        SharedPreferences sharedPreferences = context.getSharedPreferences("liveness_cache", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f7166b = sharedPreferences;
    }

    public static String c(HashMap map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                try {
                    jSONObject.put(str, map.get(str));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            F6.d.c("JsonUtil", "convertToJson: ", th);
            return "{}";
        }
    }

    public static Object d(String str, Class cls) {
        return GsonUtil.get().fromJson(str, cls);
    }

    public static C0525w f() {
        if (f7164c == null) {
            synchronized (C0525w.class) {
                try {
                    if (f7164c == null) {
                        f7164c = new C0525w(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7164c;
    }

    public static Boolean g(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return Boolean.FALSE;
        }
        try {
            return Boolean.valueOf(new JSONObject(str).optBoolean(str2, false));
        } catch (JSONException e10) {
            F6.d.c("JsonUtil", "getJsonBoolean: ", e10);
            return Boolean.FALSE;
        }
    }

    public static Integer h(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return Integer.valueOf(new JSONObject(str).optInt(str2));
            } catch (JSONException e10) {
                F6.d.c("JsonUtil", "getJsonInt: ", e10);
            }
        }
        return null;
    }

    public static Long i(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return Long.valueOf(new JSONObject(str).optLong(str2));
            } catch (JSONException e10) {
                F6.d.c("JsonUtil", "getJsonLong: ", e10);
            }
        }
        return null;
    }

    public static String j(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new JSONObject(str).getString(str2);
            } catch (Throwable th) {
                F6.d.c("JsonUtil", "fromJson: ", th);
            }
        }
        return "";
    }

    @Override // p016b.b$a
    public void a(String str) {
        ((ch.d) this.f7166b).f19043i.b();
        vh.b.b(str);
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) throws Exception {
        switch (this.f7165a) {
            case 4:
                Bitmap bitmap = (Bitmap) obj;
                IBaseView iBaseView = ((Fe.f0) this.f7166b).f27351a;
                if (iBaseView != null) {
                    ((ReceiveMoneyContract$IView) iBaseView).showQrcodeImg(bitmap);
                }
                break;
            case 7:
                T.b(-4).execute(new Z(obj, ((Fe.e0) this.f7166b).f2769a, 2));
                break;
            case 9:
                List<PalmPayContact> list = (List) obj;
                IBaseView iBaseView2 = ((U9.a) this.f7166b).f27351a;
                if (iBaseView2 != null) {
                    ((LocalContactsListContract$IView) iBaseView2).showLikeQueryPhoneContactList(list);
                }
                break;
            default:
                ((Action) this.f7166b).run();
                break;
        }
    }

    public void b(J0.a... migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        for (J0.a aVar : migrations) {
            int i7 = aVar.startVersion;
            int i10 = aVar.endVersion;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7166b;
            Integer numValueOf = Integer.valueOf(i7);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i10))) {
                Objects.toString(treeMap2.get(Integer.valueOf(i10)));
                aVar.toString();
            }
            treeMap2.put(Integer.valueOf(i10), aVar);
        }
    }

    @Override // com.palmpay.lib.liveness.cache.ICacheService
    public void clearAll() {
        SharedPreferences.Editor editor = ((SharedPreferences) this.f7166b).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.clear();
        editor.apply();
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        Constructor constructor = (Constructor) this.f7166b;
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            p264r5.a aVar = X5.c.f11002a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + X5.c.b(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + X5.c.b(constructor) + "' with no args", e12.getCause());
        }
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools$Factory
    public Object create() {
        C0505b c0505b = (C0505b) this.f7166b;
        return new com.bumptech.glide.load.engine.i((com.bumptech.glide.load.engine.l) c0505b.f7073c, (top.zibin.luban.io.a) c0505b.f7074d);
    }

    public Object e(String str, Type type) {
        try {
            return ((Gson) this.f7166b).fromJson(str, type);
        } catch (Throwable th) {
            F6.d.c("JsonUtil", "fromJson: ", th);
            return null;
        }
    }

    @Override // com.facebook.imagepipeline.animated.impl.AnimatedDrawableBackendProvider
    public AnimatedDrawableBackend get(X2.b bVar, Rect rect) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.f7166b;
        if (animatedFactoryV2Impl.f21347g == null) {
            animatedFactoryV2Impl.f21347g = new com.growingio.android.debugger.a(3);
        }
        return new Z2.a(animatedFactoryV2Impl.f21347g, bVar, rect, animatedFactoryV2Impl.f21344d);
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public Executor getBackgroundExecutor() {
        return ((androidx.webkit.l) this.f7166b).f18331a;
    }

    @Override // com.palmpay.lib.liveness.cache.ICacheService
    public boolean getDataBoolean(String key, boolean z3) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.f7166b).getBoolean(key, z3);
    }

    @Override // com.palmpay.lib.liveness.cache.ICacheService
    public String getDataString(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.f7166b).getString(key, str);
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public Set getProfileNamesToLoad() {
        ((androidx.webkit.l) this.f7166b).getClass();
        return null;
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        if (((Number) obj).intValue() == -1) {
            try {
                io.fastkv.n.J(intent);
                io.fastkv.n.N(true);
                ((EnableTouchIdDialog) this.f7166b).animateSuccess();
            } catch (Exception unused) {
                Z4.c cVar = n0.f7107i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    public int k(byte[] bArr) {
        int i7;
        byte b7;
        if (((LargeJpegImageQuirk) this.f7166b) == null || !(("Samsung".equalsIgnoreCase(Build.BRAND) && LargeJpegImageQuirk.f14318a.contains(Build.MODEL.toUpperCase(Locale.US))) || LargeJpegImageQuirk.a() || bArr.length > 10000000)) {
            return bArr.length;
        }
        int i10 = 2;
        while (i10 + 4 <= bArr.length && (b7 = bArr[i10]) == -1) {
            int i11 = i10 + 2;
            int i12 = ((bArr[i11] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i10 + 3] & UnsignedBytes.MAX_VALUE);
            if (b7 == -1 && bArr[i10 + 1] == -38) {
                while (true) {
                    i7 = i11 + 2;
                    if (i7 > bArr.length) {
                        break;
                    }
                    if (bArr[i11] != -1 || bArr[i11 + 1] != -39) {
                        i11++;
                    }
                    if (i7 != -1) {
                        return i7;
                    }
                    return bArr.length;
                }
            }
            i10 += i12 + 2;
        }
        i7 = -1;
        if (i7 != -1) {
            return i7;
        }
        return bArr.length;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    @Override // com.transsnet.palmpay.teller.ui.view.BillerCouponClickListener
    public void onCouponUseClick(List list, long j6) {
        KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
        BuyBundleHomePageActivity buyBundleHomePageActivity = (BuyBundleHomePageActivity) this.f7166b;
        buyBundleHomePageActivity.getClass();
        if (list != null) {
            List list2 = list;
            if ((!list2.isEmpty() ? list : null) != null) {
                if (list2.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    if (buyBundleHomePageActivity.r() != null) {
                        List<String> list3 = list;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            buyBundleHomePageActivity.v((String) list.get(0));
                        } else {
                            for (String str : list3) {
                                MobileWalletResp.MobileWallet mobileWalletR = buyBundleHomePageActivity.r();
                                if (!kotlin.text.y.h(str, mobileWalletR != null ? mobileWalletR.operatorCode : null, true)) {
                                    MobileWalletResp.MobileWallet mobileWalletR2 = buyBundleHomePageActivity.r();
                                    if (kotlin.text.y.h(str, mobileWalletR2 != null ? mobileWalletR2.operatorName : null, true)) {
                                    }
                                }
                            }
                            buyBundleHomePageActivity.v((String) list.get(0));
                        }
                    } else {
                        buyBundleHomePageActivity.v((String) list.get(0));
                    }
                }
            }
        }
        buyBundleHomePageActivity.u();
    }

    @Override // com.growingio.android.debugger.DebuggerEventWrapper$OnDebuggerEventListener
    public void onDebuggerMessage(String str) {
        WebSocket webSocket = ((com.growingio.android.debugger.g) this.f7166b).f23175c.f23147b;
        if (webSocket != null) {
            webSocket.send(str);
        }
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public void onFailed(String str, String str2, String str3) {
        AliFaceActivity aliFaceActivity = (AliFaceActivity) this.f7166b;
        aliFaceActivity.showLoadingDialog(false);
        if (!TextUtils.isEmpty(str2)) {
            androidx.camera.core.impl.utils.n.u(str2);
        }
        aliFaceActivity.finish();
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        ((C1987e) this.f7166b).completeExceptionally(th);
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener
    public void onItemClick(View itemView, int i7) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        OcAllBillActivity ocAllBillActivity = (OcAllBillActivity) this.f7166b;
        Object obj = ocAllBillActivity.f29228B.get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        OcAllBillActivity.m(ocAllBillActivity, (AllBillDetail) obj);
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverEnter(androidx.appcompat.view.menu.k kVar, MenuItem menuItem) {
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f7166b;
        gVar.f12410f.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f12412i;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (kVar == ((androidx.appcompat.view.menu.f) arrayList.get(i7)).f12393b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        int i10 = i7 + 1;
        gVar.f12410f.postAtTime(new androidx.appcompat.view.menu.e(this, i10 < arrayList.size() ? (androidx.appcompat.view.menu.f) arrayList.get(i10) : null, menuItem, kVar, 0), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverExit(androidx.appcompat.view.menu.k kVar, MenuItem menuItem) {
        ((androidx.appcompat.view.menu.g) this.f7166b).f12410f.removeCallbacksAndMessages(kVar);
    }

    @Override // com.transsnet.palmpay.managemoney.ui.adapter.CashBoxTransactionMonthViewHolder$OnMonthClickListener
    public void onMonthClick() {
        ((FundTransactionHistoryFragment) this.f7166b).x();
    }

    @Override // com.palmpay.lib.scanplus.callback.OnScanListener
    public void onPointClick(CodeBean codeBean) {
        Intrinsics.checkNotNullParameter(codeBean, "codeBean");
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public void onProcessing() {
        ((AliFaceActivity) this.f7166b).showLoadingDialog(true);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, retrofit2.K k2) {
        ((C1987e) this.f7166b).complete(k2);
    }

    @Override // com.palmpay.lib.scanplus.callback.OnScanListener
    public boolean onResult(List result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.isEmpty()) {
            return true;
        }
        Intent intent = new Intent();
        intent.putExtra("scan_code_key", (Parcelable) result.get(0));
        ScanPlusActivity scanPlusActivity = (ScanPlusActivity) this.f7166b;
        scanPlusActivity.setResult(-1, intent);
        scanPlusActivity.finish();
        return true;
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public void onSuccess(ALiFaceCheckResultData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        AliFaceActivity aliFaceActivity = (AliFaceActivity) this.f7166b;
        aliFaceActivity.showLoadingDialog(false);
        aliFaceActivity.finish();
    }

    @Override // com.palmpay.lib.liveness.cache.ICacheService
    public void remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editor = ((SharedPreferences) this.f7166b).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.remove(key);
        editor.apply();
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public Object rewindAndGet() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f7166b;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.palmpay.lib.liveness.cache.ICacheService
    public void saveDataBoolean(String key, boolean z3) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editor = ((SharedPreferences) this.f7166b).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean(key, z3);
        editor.apply();
    }

    @Override // com.palmpay.lib.liveness.cache.ICacheService
    public void saveDataString(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editor = ((SharedPreferences) this.f7166b).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(key, str);
        editor.apply();
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public boolean shouldRunUiThreadStartUpTasks() {
        return ((androidx.webkit.l) this.f7166b).f18332b;
    }

    @Override // p016b.b$a
    public void a(CommonResult commonResult) {
        LoginResp loginResp = (LoginResp) commonResult;
        ch.d dVar = (ch.d) this.f7166b;
        dVar.f19043i.b();
        if (loginResp.isSuccess()) {
            return;
        }
        dVar.f19043i.a(loginResp.getRespMsg());
    }

    @Override // okhttp3.Callback
    public void onFailure(okhttp3.Call call, IOException e10) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e10, "e");
        F6.d.c("Unzip", "onFailure: download resource zip failed---->");
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01df A[Catch: all -> 0x01ff, TryCatch #10 {all -> 0x01ff, blocks: (B:75:0x01d9, B:77:0x01df, B:80:0x0201), top: B:89:0x01d9 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x023c  */
    /* JADX WARN: Code duplicated, block: B:87:0x026b  */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x01df, please report this as an issue */
    @Override // okhttp3.Callback
    public void onResponse(okhttp3.Call call, okhttp3.e0 response) throws Throwable {
        char c6;
        Closeable closeable;
        int i7;
        char c10 = 0;
        int i10 = 1;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        byte[] bArr = new byte[2048];
        Od.g gVar = Od.h.f6817c;
        Context context = BaseApplication.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        File parentDir = gVar.getParentDir(context);
        if (!parentDir.exists()) {
            parentDir.mkdir();
        } else if (parentDir.isFile()) {
            parentDir.delete();
            parentDir.mkdir();
        }
        String str = (String) this.f7166b;
        File unZipDir = gVar.getUnZipDir(str);
        File file = new File(parentDir, androidx.camera.video.u.i(System.currentTimeMillis(), "folder="));
        File file2 = new File(parentDir, androidx.camera.video.u.i(System.currentTimeMillis(), "file="));
        Closeable closeable2 = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream = null;
        closeable2 = null;
        try {
            okhttp3.h0 h0Var = response.f40734g;
            if (h0Var == null) {
                try {
                    F6.d.c("Unzip", "onResponse: responseBody is null---->");
                    CloseUtils.closeIO(h0Var);
                    CloseUtils.closeIO(null);
                    CloseUtils.closeIO(null);
                    if (file2.exists()) {
                        F6.d.h("Unzip", 3, com.horcrux.svg.d0.q("onResponse: delete zip file result = ", file2.delete()));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    e = e10;
                    c6 = 0;
                    closeable = null;
                    try {
                        if (file.exists()) {
                            F6.d.c("Unzip", "onResponse: delete tempDir" + file.getPath());
                            Od.h.a(file);
                        }
                        F6.d.h("Unzip", 3, "onResponse: error = " + e.getMessage());
                        Closeable[] closeableArr = new Closeable[1];
                        closeableArr[c6] = response.f40734g;
                        CloseUtils.closeIO(closeableArr);
                        Closeable[] closeableArr2 = new Closeable[1];
                        closeableArr2[c6] = closeable2;
                        CloseUtils.closeIO(closeableArr2);
                        Closeable[] closeableArr3 = new Closeable[1];
                        closeableArr3[c6] = closeable;
                        CloseUtils.closeIO(closeableArr3);
                        if (file2.exists()) {
                            F6.d.h("Unzip", 3, com.horcrux.svg.d0.q("onResponse: delete zip file result = ", file2.delete()));
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c6 = 0;
                    closeable = null;
                }
            } else {
                InputStream inputStreamByteStream = h0Var.byteStream();
                try {
                    if (file2.exists()) {
                        try {
                            if (!file2.delete()) {
                                F6.d.h("Unzip", 5, "downloadFile: delete " + file2.getPath() + " fail");
                                CloseUtils.closeIO(h0Var);
                                CloseUtils.closeIO(inputStreamByteStream);
                                CloseUtils.closeIO(null);
                                if (file2.exists()) {
                                    F6.d.h("Unzip", 3, com.horcrux.svg.d0.q("onResponse: delete zip file result = ", file2.delete()));
                                    return;
                                }
                                return;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            c6 = 0;
                            closeable = fileOutputStream;
                            closeable2 = inputStreamByteStream;
                            if (file.exists()) {
                                F6.d.c("Unzip", "onResponse: delete tempDir" + file.getPath());
                                Od.h.a(file);
                            }
                            F6.d.h("Unzip", 3, "onResponse: error = " + e.getMessage());
                            Closeable[] closeableArr4 = new Closeable[1];
                            closeableArr4[c6] = response.f40734g;
                            CloseUtils.closeIO(closeableArr4);
                            Closeable[] closeableArr5 = new Closeable[1];
                            closeableArr5[c6] = closeable2;
                            CloseUtils.closeIO(closeableArr5);
                            Closeable[] closeableArr6 = new Closeable[1];
                            closeableArr6[c6] = closeable;
                            CloseUtils.closeIO(closeableArr6);
                            if (file2.exists()) {
                                F6.d.h("Unzip", 3, com.horcrux.svg.d0.q("onResponse: delete zip file result = ", file2.delete()));
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            c6 = 0;
                            closeable = fileOutputStream;
                            closeable2 = inputStreamByteStream;
                            Closeable[] closeableArr7 = new Closeable[1];
                            closeableArr7[c6] = response.f40734g;
                            CloseUtils.closeIO(closeableArr7);
                            Closeable[] closeableArr8 = new Closeable[1];
                            closeableArr8[c6] = closeable2;
                            CloseUtils.closeIO(closeableArr8);
                            Closeable[] closeableArr9 = new Closeable[1];
                            closeableArr9[c6] = closeable;
                            CloseUtils.closeIO(closeableArr9);
                            if (file2.exists()) {
                                F6.d.h("Unzip", 3, com.horcrux.svg.d0.q("onResponse: delete zip file result = ", file2.delete()));
                            }
                            throw th;
                        }
                    }
                    fileOutputStream = new FileOutputStream(file2);
                    while (true) {
                        int i11 = inputStreamByteStream.read(bArr);
                        i7 = i10;
                        if (i11 == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i11);
                        i10 = i7;
                    }
                    fileOutputStream.flush();
                    List<File> listUnzipFile = ZipUtils.unzipFile(file2, file);
                    int size = listUnzipFile.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            c6 = c10;
                            break;
                        }
                        c6 = c10;
                        try {
                            if (OfflineConstant.CONFIG_FILE_NAME.equals(listUnzipFile.get(i12).getName())) {
                                if (!unZipDir.exists()) {
                                    file.renameTo(unZipDir);
                                } else if (!Od.h.f6817c.isCompleteDownload(str)) {
                                    Od.h.a(unZipDir);
                                    file.renameTo(unZipDir);
                                }
                                Od.h.b(str);
                                F6.d.h("Unzip", 3, "onResponse: unzip success = " + unZipDir.getPath());
                                break;
                            }
                            i12++;
                            c10 = c6;
                        } catch (Exception e12) {
                            e = e12;
                            closeable = fileOutputStream;
                            closeable2 = inputStreamByteStream;
                            if (file.exists()) {
                                F6.d.c("Unzip", "onResponse: delete tempDir" + file.getPath());
                                Od.h.a(file);
                            }
                            F6.d.h("Unzip", 3, "onResponse: error = " + e.getMessage());
                            Closeable[] closeableArr10 = new Closeable[1];
                            closeableArr10[c6] = response.f40734g;
                            CloseUtils.closeIO(closeableArr10);
                            Closeable[] closeableArr11 = new Closeable[1];
                            closeableArr11[c6] = closeable2;
                            CloseUtils.closeIO(closeableArr11);
                            Closeable[] closeableArr12 = new Closeable[1];
                            closeableArr12[c6] = closeable;
                            CloseUtils.closeIO(closeableArr12);
                            if (file2.exists()) {
                                F6.d.h("Unzip", 3, com.horcrux.svg.d0.q("onResponse: delete zip file result = ", file2.delete()));
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            closeable = fileOutputStream;
                            closeable2 = inputStreamByteStream;
                            Closeable[] closeableArr13 = new Closeable[1];
                            closeableArr13[c6] = response.f40734g;
                            CloseUtils.closeIO(closeableArr13);
                            Closeable[] closeableArr14 = new Closeable[1];
                            closeableArr14[c6] = closeable2;
                            CloseUtils.closeIO(closeableArr14);
                            Closeable[] closeableArr15 = new Closeable[1];
                            closeableArr15[c6] = closeable;
                            CloseUtils.closeIO(closeableArr15);
                            if (file2.exists()) {
                                F6.d.h("Unzip", 3, com.horcrux.svg.d0.q("onResponse: delete zip file result = ", file2.delete()));
                            }
                            throw th;
                        }
                    }
                    Closeable[] closeableArr16 = new Closeable[i7];
                    closeableArr16[c6] = h0Var;
                    CloseUtils.closeIO(closeableArr16);
                    Closeable[] closeableArr17 = new Closeable[i7];
                    closeableArr17[c6] = inputStreamByteStream;
                    CloseUtils.closeIO(closeableArr17);
                    Closeable[] closeableArr18 = new Closeable[i7];
                    closeableArr18[c6] = fileOutputStream;
                    CloseUtils.closeIO(closeableArr18);
                    if (file2.exists()) {
                        F6.d.h("Unzip", 3, com.horcrux.svg.d0.q("onResponse: delete zip file result = ", file2.delete()));
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    e = e13;
                    c6 = 0;
                    closeable2 = inputStreamByteStream;
                    closeable = null;
                } catch (Throwable th5) {
                    th = th5;
                    c6 = 0;
                    closeable2 = inputStreamByteStream;
                    closeable = null;
                }
            }
        } catch (Exception e14) {
            e = e14;
            c6 = 0;
            closeable = null;
            closeable2 = null;
        } catch (Throwable th6) {
            th = th6;
            c6 = 0;
            closeable = null;
            closeable2 = null;
        }
        Closeable[] closeableArr19 = new Closeable[1];
        closeableArr19[c6] = response.f40734g;
        CloseUtils.closeIO(closeableArr19);
        Closeable[] closeableArr110 = new Closeable[1];
        closeableArr110[c6] = closeable2;
        CloseUtils.closeIO(closeableArr110);
        Closeable[] closeableArr111 = new Closeable[1];
        closeableArr111[c6] = closeable;
        CloseUtils.closeIO(closeableArr111);
        if (file2.exists()) {
            F6.d.h("Unzip", 3, com.horcrux.svg.d0.q("onResponse: delete zip file result = ", file2.delete()));
        }
        throw th;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        ((androidx.camera.core.processing.i) this.f7166b).run();
    }

    public /* synthetic */ C0525w(Object obj, int i7) {
        this.f7165a = i7;
        this.f7166b = obj;
    }

    public C0525w(int i7) {
        this.f7165a = i7;
        switch (i7) {
            case 13:
                this.f7166b = (ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(ExtraCroppingQuirk.class);
                break;
            case 14:
                this.f7166b = (LargeJpegImageQuirk) androidx.camera.core.internal.compat.quirk.a.f14321a.b(LargeJpegImageQuirk.class);
                break;
            case 15:
                this.f7166b = new LinkedHashMap();
                break;
            case 23:
                this.f7166b = new AtomicInteger(0);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                this.f7166b = new ConcurrentHashMap(16);
                break;
            default:
                this.f7166b = new GsonBuilder().disableHtmlEscaping().create();
                break;
        }
    }

    public C0525w(String str, Od.h hVar) {
        this.f7165a = 6;
        this.f7166b = str;
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
    }

    @Override // com.palmpay.lib.scanplus.callback.OnScanListener
    public void onCancel() {
    }

    @Override // com.transsnet.palmpay.teller.ui.view.BillerCouponClickListener
    public void onCouponClaimComplete() {
    }
}
