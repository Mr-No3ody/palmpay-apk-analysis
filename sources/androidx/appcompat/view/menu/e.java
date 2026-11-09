package androidx.appcompat.view.menu;

import Pa.C0525w;
import android.animation.ValueAnimator;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.V;
import androidx.core.view.Z;
import androidx.core.view.d0;
import com.adjust.sdk.InstallReferrer;
import com.adjust.sdk.Util;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.firebase.messaging.Constants;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.reactnativecommunity.webview.RNCWebView;
import com.reactnativecommunity.webview.RNCWebViewWrapper;
import dalvik.system.DexFile;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12391e;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f12387a = i7;
        this.f12391e = obj;
        this.f12388b = obj2;
        this.f12389c = obj3;
        this.f12390d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12387a) {
            case 0:
                f fVar = (f) this.f12388b;
                if (fVar != null) {
                    C0525w c0525w = (C0525w) this.f12391e;
                    ((g) c0525w.f7166b).f12417p0 = true;
                    fVar.f12393b.close(false);
                    ((g) c0525w.f7166b).f12417p0 = false;
                }
                MenuItem menuItem = (MenuItem) this.f12389c;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((k) this.f12390d).performItemAction(menuItem, 4);
                    return;
                }
                return;
            case 1:
                Z.h((View) this.f12388b, (d0) this.f12389c, (V) this.f12390d);
                ((ValueAnimator) this.f12391e).start();
                return;
            case 2:
                InstallReferrer installReferrer = (InstallReferrer) this.f12391e;
                try {
                    installReferrer.invokeI(this.f12388b, (Method) this.f12389c, (Object[]) this.f12390d);
                    return;
                } catch (Throwable th) {
                    installReferrer.referrerCallback.onFail(Util.formatString("invoke error (%s) thrown by (%s)", th.getMessage(), th.getClass().getCanonicalName()));
                    return;
                }
            case 3:
                RNCWebView rNCWebView = (RNCWebView) this.f12391e;
                p265r7.f fVar2 = rNCWebView.f24677i;
                if (fVar2 == null) {
                    return;
                }
                RNCWebView rNCWebView2 = (RNCWebView) this.f12388b;
                WritableMap writableMapA = fVar2.a(rNCWebView2, (String) this.f12389c);
                writableMapA.putString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (String) this.f12390d);
                if (rNCWebView.f24676g == null) {
                    rNCWebView.a(rNCWebView2, new p281s7.p(writableMapA, RNCWebViewWrapper.f24683b.getReactTagFromWebView(rNCWebView2)));
                    return;
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putMap("nativeEvent", writableMapA);
                writableNativeMap.putString("messagingModuleName", rNCWebView.f24675f);
                rNCWebView.f24676g.onMessage(writableNativeMap);
                return;
            default:
                CountDownLatch countDownLatch = (CountDownLatch) this.f12391e;
                String str = (String) this.f12388b;
                DexFile dexFileLoadDex = null;
                try {
                    try {
                        dexFileLoadDex = str.endsWith(OfflineConstant.ZIP_SUFFIX) ? DexFile.loadDex(str, str.concat(".tmp"), 0) : new DexFile(str);
                        Enumeration<String> enumerationEntries = dexFileLoadDex.entries();
                        while (enumerationEntries.hasMoreElements()) {
                            String strNextElement = enumerationEntries.nextElement();
                            if (strNextElement.startsWith((String) this.f12389c)) {
                                ((HashSet) this.f12390d).add(strNextElement);
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        try {
                            Log.e(Consts.SDK_NAME, "Scan map file in dex files made error.", th2);
                            return;
                        } finally {
                            if (dexFileLoadDex != null) {
                                try {
                                    dexFileLoadDex.close();
                                    break;
                                } catch (Throwable unused) {
                                }
                            }
                            countDownLatch.countDown();
                        }
                    }
                    break;
                } catch (Throwable unused2) {
                }
                return;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i7, boolean z3) {
        this.f12387a = i7;
        this.f12388b = obj;
        this.f12389c = obj2;
        this.f12390d = obj3;
        this.f12391e = obj4;
    }
}
