package org.greenrobot.eventbus;

import E.AbstractC0198c;
import Jg.t;
import Pa.n0;
import Pa.r0;
import Rd.c0;
import U2.B;
import V9.A;
import Wf.AbstractC0780y;
import Wf.C0765i;
import Wf.I;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebView;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.R0;
import androidx.camera.core.impl.ReadableConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.video.internal.encoder.InputBuffer;
import androidx.camera.video.internal.encoder.v;
import androidx.lifecycle.V;
import androidx.work.impl.WorkDatabase;
import com.alibaba.android.arouter.utils.Consts;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import com.google.common.net.HttpHeaders;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.maps.android.BuildConfig;
import com.growingio.android.sdk.track.async.Disposable;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.webview.cache.service.impl.net.BaseRequest;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpAddTaskFragment;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeTopupViewModel;
import com.transsnet.palmpay.contacts.ui.activity.LocalPalmPayContactsListActivity;
import com.transsnet.palmpay.contacts.ui.adapter.LocalContactListAdapter$onAddClickListener;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.req.AddContactReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.credit.bean.other.OcContactSocialLabelBean;
import com.transsnet.palmpay.credit.bean.resp.CLHistoryBillDetail;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback;
import com.transsnet.palmpay.credit.businessLoan.rnbridge.LocationServiceBridge;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTakePhotoActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMediaActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLCouponDialog;
import com.transsnet.palmpay.credit.ui.fragment.CLBorrowListFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import com.transsnet.palmpay.custom_view.input.InputMobileImpl;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.custom_view.input.OnNumberInputListener;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import com.transsnet.palmpay.teller.ui.view.BillerCouponClickListener;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.functions.Consumer;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.collections.G;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlin.text.y;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.C1951t;
import okhttp3.CookieJar;
import okhttp3.J;
import okhttp3.internal.concurrent.TaskRunner$Backend;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import p015ag.o;
import p310ub.C2086l;
import p355xf.q;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.K;

/* JADX INFO: loaded from: classes4.dex */
public class f implements OnRvItemClickListener, ReadableConfig, TaskRunner$Backend, ObservableOnSubscribe, LocalContactListAdapter$onAddClickListener, FutureCallback, WebMessageListenerBoundaryInterface, TransitionFactory, LocationServiceManager$LocationServiceCallback, Disposable, BillerCouponClickListener, OnNumberInputListener, CookieJar, Callback, Observer, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f41079b;

    public /* synthetic */ f(int i7) {
        this.f41078a = i7;
    }

    public static Xe.d b(URI uri, int i7, Map map) {
        Xe.d dVar;
        Iterator it;
        AbstractMap abstractMap;
        try {
            AbstractC0198c.b();
            AbstractC0198c.f1997f.f11215h.put(uri, map);
            while (true) {
                boolean zHasNext = it.hasNext();
                abstractMap = (AbstractMap) dVar.f1592b;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (abstractMap.containsKey(str)) {
                    ((List) abstractMap.get(str)).addAll(list);
                } else {
                    abstractMap.put(str, list);
                }
            }
        } catch (IOException e10) {
            G8.a.e("e", "Save cookie filed: " + uri.toString() + Consts.DOT, e10);
        }
        dVar = new Xe.d(0);
        it = map.entrySet().iterator();
        String string = Integer.toString(i7);
        dVar.j("ResponseCode");
        dVar.e(string, "ResponseCode");
        for (String str2 : abstractMap.keySet()) {
            for (String str3 : dVar.i(str2)) {
                StringBuilder sb2 = new StringBuilder();
                if (!TextUtils.isEmpty(str2)) {
                    sb2.append(str2);
                    sb2.append(": ");
                }
                if (!TextUtils.isEmpty(str3)) {
                    sb2.append(str3);
                }
                G8.a.i(sb2.toString(), "i");
            }
        }
        return dVar;
    }

    public Xe.b a(Xe.a aVar, Xe.d dVar) {
        String strConcat = (String) dVar.a(HttpHeaders.LOCATION);
        if (!URLUtil.isNetworkUrl(strConcat)) {
            try {
                URL url = new URL(aVar.e());
                if (!strConcat.startsWith("/")) {
                    strConcat = "/".concat(strConcat);
                }
                strConcat = url.getProtocol() + "://" + url.getHost() + strConcat;
            } catch (MalformedURLException unused) {
            }
        }
        Xe.a aVar2 = new Xe.a(strConcat, aVar.f11191f);
        aVar2.f11192g = aVar.f11192g;
        aVar2.f11193i = aVar.f11193i;
        aVar2.f11196p = aVar.d();
        return e(aVar2);
    }

    @Override // io.reactivex.functions.Consumer
    public /* synthetic */ void accept(Object obj) {
        ((C2086l) this.f41079b).invoke(obj);
    }

    @Override // okhttp3.internal.concurrent.TaskRunner$Backend
    public void beforeTask(Fg.d taskRunner) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition build(com.bumptech.glide.load.a aVar, boolean z3) {
        if (aVar == com.bumptech.glide.load.a.f20512e) {
            return com.bumptech.glide.request.transition.b.f21078a;
        }
        if (((com.bumptech.glide.request.transition.a) this.f41079b) == null) {
            this.f41079b = new com.bumptech.glide.request.transition.a();
        }
        return (com.bumptech.glide.request.transition.a) this.f41079b;
    }

    public Xe.h c(Xe.a aVar) throws Exception {
        boolean z3 = true;
        Exception e10 = null;
        Xe.h hVarD = null;
        for (int i7 = 1; z3 && i7 > 0; i7--) {
            try {
                hVarD = d(aVar);
                z3 = false;
                e10 = null;
            } catch (Exception e11) {
                e10 = e11;
            }
        }
        if (z3) {
            throw e10;
        }
        if (J3.a.a(aVar.f11191f)) {
            OutputStream outputStream = hVarD.f11218a.getOutputStream();
            G8.a.i("-------Send handle data start-------", "i");
            BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream);
            aVar.b(bufferedOutputStream);
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                }
            }
            G8.a.i("-------Send handle data end-------", "i");
        }
        return hVarD;
    }

    @Override // okhttp3.internal.concurrent.TaskRunner$Backend
    public void coordinatorNotify(Fg.d taskRunner) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        taskRunner.notify();
    }

    @Override // okhttp3.internal.concurrent.TaskRunner$Backend
    public void coordinatorWait(Fg.d taskRunner, long j6) throws InterruptedException {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        long j10 = j6 / 1000000;
        long j11 = j6 - (1000000 * j10);
        if (j10 > 0 || j6 > 0) {
            taskRunner.wait(j10, (int) j11);
        }
    }

    public Xe.h d(Xe.a aVar) throws IOException {
        String str;
        String str2;
        StringBuilder sb2;
        String strD;
        String string;
        String strE = aVar.e();
        G8.a.i("Request address: " + strE, "i");
        String str3 = "TRACE";
        String str4 = "PUT";
        int i7 = aVar.f11191f;
        if (i7 == 1) {
            str = "GET";
        } else if (i7 == 2) {
            str = "POST";
        } else if (i7 == 3) {
            str = "PUT";
        } else if (i7 == 4) {
            str = "DELETE";
        } else if (i7 == 5) {
            str = "HEAD";
        } else if (i7 == 6) {
            str = "PATCH";
        } else if (i7 == 7) {
            str = "OPTIONS";
        } else {
            str = i7 == 8 ? "TRACE" : BuildConfig.TRAVIS;
        }
        G8.a.i("Request method: ".concat(str), "i");
        Xe.d dVar = aVar.t;
        String str5 = (String) dVar.a(HttpHeaders.CONTENT_TYPE);
        if (TextUtils.isEmpty(str5)) {
            if (J3.a.a(i7)) {
                Xe.d dVar2 = aVar.f11197v;
                Iterator it = ((AbstractMap) dVar2.f1592b).keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = dVar2.i((String) it.next()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                str2 = str3;
                                Object next = it2.next();
                                Xe.d dVar3 = dVar2;
                                if ((next instanceof p043d.b) || (next instanceof File)) {
                                    sb2 = new StringBuilder("multipart/form-data; boundary=");
                                    strD = aVar.f11186a;
                                } else {
                                    str3 = str2;
                                    dVar2 = dVar3;
                                }
                            }
                        }
                    } else {
                        str2 = str3;
                        sb2 = new StringBuilder("application/x-www-form-urlencoded; charset=");
                        strD = aVar.d();
                    }
                }
            } else {
                str2 = str3;
                sb2 = new StringBuilder("application/x-www-form-urlencoded; charset=");
                strD = aVar.d();
            }
            sb2.append(strD);
            string = sb2.toString();
        } else {
            str2 = "TRACE";
            string = str5;
        }
        dVar.j(HttpHeaders.CONTENT_TYPE);
        dVar.e(string, HttpHeaders.CONTENT_TYPE);
        List listI = dVar.i("Connection");
        if (listI == null || listI.size() == 0) {
            dVar.e(BaseRequest.HEAD_VALUE_CONNECTION_KEEP_ALIVE, "Connection");
        }
        if (J3.a.a(i7)) {
            p226og.a aVar2 = new p226og.a();
            try {
                aVar.b(aVar2);
            } catch (IOException e10) {
                G8.a.c(e10);
            }
            String string2 = Long.toString(aVar2.f40541a.get());
            dVar.j(HttpHeaders.CONTENT_LENGTH);
            dVar.e(string2, HttpHeaders.CONTENT_LENGTH);
        }
        URI uri = new URI(strE);
        AbstractC0198c.b();
        try {
            Iterator<Map.Entry<String, List<String>>> it3 = AbstractC0198c.f1997f.f11215h.get(uri, new HashMap()).entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry<String, List<String>> next2 = it3.next();
                String key = next2.getKey();
                List<String> value = next2.getValue();
                Iterator<Map.Entry<String, List<String>>> it4 = it3;
                if ("Cookie".equalsIgnoreCase(key)) {
                    dVar.e(TextUtils.join("; ", value), key);
                }
                it3 = it4;
            }
        } catch (IOException e11) {
            G8.a.c(e11);
        }
        ((retrofit2.adapter.rxjava2.d) this.f41079b).getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(aVar.e()).openConnection()));
        httpURLConnection.setConnectTimeout(aVar.f11194j);
        httpURLConnection.setReadTimeout(aVar.f11195o);
        httpURLConnection.setInstanceFollowRedirects(false);
        if (httpURLConnection instanceof HttpsURLConnection) {
            SSLSocketFactory sSLSocketFactory = aVar.f11192g;
            if (sSLSocketFactory != null) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            HostnameVerifier hostnameVerifier = aVar.f11193i;
            if (hostnameVerifier != null) {
                ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(hostnameVerifier);
            }
        }
        if (i7 == 1) {
            str4 = "GET";
        } else if (i7 == 2) {
            str4 = "POST";
        } else if (i7 != 3) {
            if (i7 == 4) {
                str4 = "DELETE";
            } else if (i7 == 5) {
                str4 = "HEAD";
            } else if (i7 == 6) {
                str4 = "PATCH";
            } else if (i7 == 7) {
                str4 = "OPTIONS";
            } else {
                if (i7 != 8) {
                    throw null;
                }
                str4 = str2;
            }
        }
        httpURLConnection.setRequestMethod(str4);
        httpURLConnection.setDoInput(true);
        boolean zA = J3.a.a(i7);
        httpURLConnection.setDoOutput(zA);
        List listI2 = dVar.i("Connection");
        if (listI2 == null || listI2.size() == 0) {
            dVar.j("Connection");
            dVar.e(BaseRequest.HEAD_VALUE_CONNECTION_KEEP_ALIVE, "Connection");
        }
        if (zA) {
            p226og.a aVar3 = new p226og.a();
            try {
                aVar.b(aVar3);
            } catch (IOException e12) {
                G8.a.c(e12);
            }
            long j6 = aVar3.f40541a.get();
            if (j6 <= 2147483647L) {
                httpURLConnection.setFixedLengthStreamingMode((int) j6);
            } else {
                httpURLConnection.setFixedLengthStreamingMode(j6);
            }
            String string3 = Long.toString(j6);
            dVar.j(HttpHeaders.CONTENT_LENGTH);
            dVar.e(string3, HttpHeaders.CONTENT_LENGTH);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((AbstractMap) dVar.f1592b).entrySet()) {
            linkedHashMap.put((String) entry.getKey(), TextUtils.join("; ", (List) entry.getValue()));
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str6 = (String) entry2.getKey();
            String str7 = (String) entry2.getValue();
            G8.a.i(str6 + ": " + str7, "i");
            httpURLConnection.setRequestProperty(str6, str7);
        }
        httpURLConnection.connect();
        return new Xe.h(httpURLConnection);
    }

    @Override // com.growingio.android.sdk.track.async.Disposable
    public void dispose() {
        ((AtomicBoolean) this.f41079b).compareAndSet(false, true);
    }

    public Xe.b e(Xe.a aVar) {
        Xe.h hVarC;
        InputStream inputStreamA;
        G8.a.i("--------------Request start--------------", "d");
        Xe.d dVar = new Xe.d(0);
        String strE = aVar.e();
        InputStream inputStream = null;
        exc = null;
        Exception exc = null;
        inputStream = null;
        try {
            try {
                if (!p226og.c.a()) {
                    throw new B("The network is not available, please check the network. ", 5);
                }
                hVarC = c(aVar);
                try {
                    G8.a.i("-------Response start-------", "d");
                    int responseCode = hVarC.f11218a.getResponseCode();
                    dVar = b(new URI(aVar.e()), responseCode, hVarC.f11218a.getHeaderFields());
                    if (responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307) {
                        Xe.b bVarA = a(aVar, dVar);
                        dVar = bVarA.f11200b;
                        InputStream inputStream2 = bVarA.f11201c;
                        try {
                            exc = bVarA.f11202d;
                            inputStreamA = inputStream2;
                        } catch (MalformedURLException unused) {
                            inputStreamA = inputStream2;
                            B b7 = new B("The url is malformed: " + strE + Consts.DOT, 8);
                            G8.a.c(b7);
                            exc = b7;
                            G8.a.i("--------------Request finish--------------", "d");
                            return new Xe.b(hVarC, dVar, inputStreamA, exc);
                        } catch (SocketTimeoutException unused2) {
                            inputStreamA = inputStream2;
                            B b10 = new B("Request time out", 7);
                            G8.a.c(b10);
                            exc = b10;
                            G8.a.i("--------------Request finish--------------", "d");
                            return new Xe.b(hVarC, dVar, inputStreamA, exc);
                        } catch (UnknownHostException unused3) {
                            inputStreamA = inputStream2;
                            B b11 = new B("Hostname can not be resolved: " + strE + Consts.DOT, 9);
                            G8.a.c(b11);
                            exc = b11;
                            G8.a.i("--------------Request finish--------------", "d");
                            return new Xe.b(hVarC, dVar, inputStreamA, exc);
                        } catch (Exception e10) {
                            e = e10;
                            inputStream = inputStream2;
                            InputStream inputStream3 = inputStream;
                            exc = e;
                            inputStreamA = inputStream3;
                            G8.a.c(exc);
                            G8.a.i("--------------Request finish--------------", "d");
                            return new Xe.b(hVarC, dVar, inputStreamA, exc);
                        }
                    } else {
                        inputStreamA = (aVar.f11191f == 5 || (100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 205 || (300 <= responseCode && responseCode < 400)) ? null : hVarC.a(responseCode, dVar);
                    }
                    try {
                        G8.a.i("-------Response end-------", "d");
                        if (exc != null) {
                            G8.a.c(exc);
                        }
                    } catch (MalformedURLException unused4) {
                        B b12 = new B("The url is malformed: " + strE + Consts.DOT, 8);
                        G8.a.c(b12);
                        exc = b12;
                    } catch (SocketTimeoutException unused5) {
                        B b13 = new B("Request time out", 7);
                        G8.a.c(b13);
                        exc = b13;
                    } catch (UnknownHostException unused6) {
                        B b14 = new B("Hostname can not be resolved: " + strE + Consts.DOT, 9);
                        G8.a.c(b14);
                        exc = b14;
                    } catch (Exception e11) {
                        inputStream = inputStreamA;
                        e = e11;
                        InputStream inputStream4 = inputStream;
                        exc = e;
                        inputStreamA = inputStream4;
                    }
                } catch (MalformedURLException unused7) {
                    inputStreamA = null;
                } catch (SocketTimeoutException unused8) {
                    inputStreamA = null;
                } catch (UnknownHostException unused9) {
                    inputStreamA = null;
                } catch (Exception e12) {
                    e = e12;
                }
                G8.a.i("--------------Request finish--------------", "d");
                return new Xe.b(hVarC, dVar, inputStreamA, exc);
            } catch (Throwable th) {
                if (0 != 0) {
                    G8.a.c(null);
                }
                throw th;
            }
        } catch (MalformedURLException unused10) {
            inputStreamA = null;
            hVarC = null;
        } catch (SocketTimeoutException unused11) {
            inputStreamA = null;
            hVarC = null;
        } catch (UnknownHostException unused12) {
            inputStreamA = null;
            hVarC = null;
        } catch (Exception e13) {
            e = e13;
            hVarC = null;
        }
    }

    @Override // okhttp3.internal.concurrent.TaskRunner$Backend
    public void execute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ((ShadowThreadPoolExecutor) this.f41079b).execute(runnable);
    }

    public G0 f() {
        G0 g7 = new G0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f41079b).entrySet()) {
            R0 r3 = (R0) entry.getValue();
            if (r3.f13953e) {
                g7.a(r3.f13949a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        p140j8.f.G("UseCaseAttachState");
        return g7;
    }

    public Collection g() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f41079b).entrySet()) {
            if (((R0) entry.getValue()).f13953e) {
                arrayList.add(((R0) entry.getValue()).f13949a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public Config getConfig() {
        return (Config) this.f41079b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public Collection h() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f41079b).entrySet()) {
            if (((R0) entry.getValue()).f13953e) {
                arrayList.add(((R0) entry.getValue()).f13950b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public boolean i(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f41079b;
        if (linkedHashMap.containsKey(str)) {
            return ((R0) linkedHashMap.get(str)).f13953e;
        }
        return false;
    }

    @Override // com.growingio.android.sdk.track.async.Disposable
    public boolean isDisposed() {
        return ((AtomicBoolean) this.f41079b).get();
    }

    public void j(String str, H0 h7, UseCaseConfig useCaseConfig, C0993n c0993n, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f41079b;
        if (linkedHashMap.containsKey(str)) {
            R0 r3 = new R0(h7, useCaseConfig, c0993n, list);
            R0 r10 = (R0) linkedHashMap.get(str);
            r3.f13953e = r10.f13953e;
            r3.f13954f = r10.f13954f;
            linkedHashMap.put(str, r3);
        }
    }

    @Override // okhttp3.CookieJar
    public List loadForRequest(J url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Map<String, List<String>> cookieHeaders = ((CookieHandler) this.f41079b).get(url.k(), G.c());
            Intrinsics.checkNotNullExpressionValue(cookieHeaders, "cookieHeaders");
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : cookieHeaders.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    if (value.isEmpty()) {
                        continue;
                    } else {
                        for (String header : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            Intrinsics.checkNotNullExpressionValue(header, "header");
                            ArrayList arrayList2 = new ArrayList();
                            int length = header.length();
                            int i7 = 0;
                            while (i7 < length) {
                                int iE = Dg.c.e(i7, header, length, ";,");
                                int iF = Dg.c.f(header, '=', i7, iE);
                                String name = Dg.c.A(i7, iF, header);
                                if (!y.m(name, "$", false)) {
                                    String strA = iF < iE ? Dg.c.A(iF + 1, iE, header) : "";
                                    if (y.m(strA, "\"", false) && y.g(strA, "\"", false)) {
                                        strA = strA.substring(1, strA.length() - 1);
                                        Intrinsics.checkNotNullExpressionValue(strA, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    }
                                    String value2 = strA;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    if (!Intrinsics.c(StringsKt.V(name).toString(), name)) {
                                        throw new IllegalArgumentException("name is not trimmed");
                                    }
                                    Intrinsics.checkNotNullParameter(value2, "value");
                                    if (!Intrinsics.c(StringsKt.V(value2).toString(), value2)) {
                                        throw new IllegalArgumentException("value is not trimmed");
                                    }
                                    String domain = url.f40582d;
                                    Intrinsics.checkNotNullParameter(domain, "domain");
                                    String strB0 = p059e1.a.b0(domain);
                                    if (strB0 == null) {
                                        throw new IllegalArgumentException("unexpected domain: ".concat(domain));
                                    }
                                    arrayList2.add(new C1951t(name, value2, 253402300799999L, strB0, "/", false, false, false, false));
                                }
                                i7 = iE + 1;
                            }
                            arrayList.addAll(arrayList2);
                        }
                    }
                }
            }
            if (arrayList == null) {
                return z.f38935a;
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        } catch (IOException e10) {
            t tVar = t.f4869a.get();
            StringBuilder sb2 = new StringBuilder("Loading cookies failed for ");
            J j6 = url.j("/...");
            Intrinsics.e(j6);
            sb2.append(j6);
            String string = sb2.toString();
            tVar.getClass();
            t.i(5, string, e10);
            return z.f38935a;
        }
    }

    @Override // okhttp3.internal.concurrent.TaskRunner$Backend
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // com.transsnet.palmpay.contacts.ui.adapter.LocalContactListAdapter$onAddClickListener
    public void onAdd(PalmPayContact palmPayContact, int i7) {
        String[] strArr = LocalPalmPayContactsListActivity.f27226i;
        LocalPalmPayContactsListActivity localPalmPayContactsListActivity = (LocalPalmPayContactsListActivity) this.f41079b;
        localPalmPayContactsListActivity.showLoadingDialog(true);
        AddContactReq addContactReq = new AddContactReq();
        addContactReq.setContactsMemberId(palmPayContact.getContactsMemberId());
        addContactReq.setRequestSource("4");
        ((PayApiService) p324va.c.f43141a.f14621b).addContact(addContactReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new A(localPalmPayContactsListActivity, palmPayContact, i7));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0044 A[EDGE_INSN: B:22:0x0044->B:23:0x004e BREAK  A[LOOP:0: B:17:0x002f->B:39:?]] */
    @Override // com.transsnet.palmpay.teller.ui.view.BillerCouponClickListener
    public void onCouponUseClick(List list, long j6) {
        PpAmountEditText ppAmountEditText;
        int i7 = TopupAirtimeActivity.f26495x0;
        TopupAirtimeActivity topupAirtimeActivity = (TopupAirtimeActivity) this.f41079b;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                if (topupAirtimeActivity.f26505Z == null) {
                    topupAirtimeActivity.D((String) list.get(0));
                    break;
                }
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            topupAirtimeActivity.D((String) list.get(0));
                            break;
                        }
                    } while (!TopupAirtimeActivity.x((String) it.next(), topupAirtimeActivity.f26505Z));
                } else {
                    topupAirtimeActivity.D((String) list.get(0));
                    break;
                }
            }
        }
        topupAirtimeActivity.f26502Q = j6;
        if (j6 > 0 && (ppAmountEditText = topupAirtimeActivity.f26507j) != null) {
            ppAmountEditText.setAmount(r0.n0(j6));
        }
        p155k9.f fVar = topupAirtimeActivity.f26500L;
        if (fVar != null) {
            AirTimeTopupViewModel airTimeTopupViewModel = (AirTimeTopupViewModel) topupAirtimeActivity.l();
            CoroutineScope coroutineScopeH = airTimeTopupViewModel != null ? V.h(airTimeTopupViewModel) : null;
            if (coroutineScopeH != null) {
                p042cg.f fVar2 = I.f10809a;
                AbstractC0780y.m(coroutineScopeH, o.f11960a, null, new p155k9.e(fVar, j6, null), 2);
            }
        }
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback
    public void onError(String error, Exception exc) {
        Intrinsics.checkNotNullParameter(error, "error");
        F6.d.c(LocationServiceBridge.TAG, "Error showing GPS dialog: " + error, exc);
        LocationServiceBridge locationServiceBridge = (LocationServiceBridge) this.f41079b;
        locationServiceBridge.handleSuccess(LocationServiceBridge.createFailureResult$default(locationServiceBridge, LocationServiceBridge.ACTION_SHOW_GPS_DIALOG, "Error showing GPS dialog: " + error, error, null, 8, null));
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable t) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t, "t");
        p355xf.o oVar = q.f43977a;
        ((C0765i) this.f41079b).resumeWith(androidx.camera.core.impl.utils.executor.g.f(t));
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback
    public void onGpsDisabled(p039cb.b status) {
        Intrinsics.checkNotNullParameter(status, "status");
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener
    public void onItemClick(View itemView, int i7) {
        int i10 = this.f41078a;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        switch (i10) {
            case 1:
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment = (CLInstallmentBorrowFragment) this.f41079b;
                cLInstallmentBorrowFragment.f30559o1 = i7;
                cLInstallmentBorrowFragment.f30562p1 = (CLRepaymentPlanData) cLInstallmentBorrowFragment.f30566r1.get(i7);
                int i11 = CLInstallmentBorrowFragment.f30584M1;
                cLInstallmentBorrowFragment.o0();
                return;
            case 13:
                ((CLCouponDialog) this.f41079b).selectedIndex = i7;
                return;
            case 23:
                OcMediaActivity ocMediaActivity = (OcMediaActivity) this.f41079b;
                int i12 = OcMediaActivity.f29577y0;
                ocMediaActivity.A();
                n0 n0VarG = n0.g();
                String strConcat = "OcMediaActivity".concat("_element_click");
                ArrayList arrayList = ocMediaActivity.f29588w0;
                if (arrayList != null) {
                    n0VarG.m(strConcat, "social_contact_rv", ((OcContactSocialLabelBean) arrayList.get(i7)).getName());
                    return;
                } else {
                    Intrinsics.n("mSocialLabelData");
                    throw null;
                }
            default:
                ArrayList arrayList2 = ((CLBorrowListFragment) this.f41079b).f30235o;
                if (arrayList2 == null) {
                    Intrinsics.n("mData");
                    throw null;
                }
                Object obj = arrayList2.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                Bundle bundle = new Bundle();
                bundle.putString("loanNo", ((CLHistoryBillDetail) obj).getLoanNo());
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOverview");
                return;
        }
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback
    public void onLocationNotReady(p039cb.b status, String reason) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback
    public void onLocationReady(p039cb.b status) {
        Intrinsics.checkNotNullParameter(status, "status");
    }

    @Override // io.reactivex.Observer
    public void onNext(Object obj) {
        String t = (String) obj;
        Intrinsics.checkNotNullParameter(t, "t");
        CLTakePhotoActivity cLTakePhotoActivity = (CLTakePhotoActivity) this.f41079b;
        cLTakePhotoActivity.showLoadingDialog(false);
        CLTakePhotoActivity.y(cLTakePhotoActivity);
        cLTakePhotoActivity.f29153z0 = false;
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnNumberInputListener
    public void onNumberEditComplete(String str) {
        KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
        ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = (ScheduleTopUpAddTaskFragment) this.f41079b;
        scheduleTopUpAddTaskFragment.C(str);
        scheduleTopUpAddTaskFragment.x();
        c0 c0Var = (c0) scheduleTopUpAddTaskFragment.f27335j;
        KeyboardUtils.hideSoftInput(c0Var != null ? c0Var.f8230e : null);
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnNumberInputListener
    public void onNumberEditing(String str) {
        ((ScheduleTopUpAddTaskFragment) this.f41079b).f26553H = "";
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback
    public void onPermissionDenied(p039cb.b status) {
        Intrinsics.checkNotNullParameter(status, "status");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z3, InvocationHandler invocationHandler2) {
        androidx.webkit.h hVar;
        androidx.webkit.h hVar2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        p1.c[] cVarArr = new p1.c[ports.length];
        for (int i7 = 0; i7 < ports.length; i7++) {
            InvocationHandler invocationHandler3 = ports[i7];
            p1.c cVar = new p1.c(15, false);
            cVar.f41176b = (WebMessagePortBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(WebMessagePortBoundaryInterface.class, invocationHandler3);
            cVarArr[i7] = cVar;
        }
        if (androidx.webkit.internal.o.f18308a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                if (type != 1) {
                    hVar2 = null;
                } else {
                    hVar = new androidx.webkit.h(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
                }
                if (hVar2 != null) {
                    JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                    ((p183m6.j) this.f41079b).onPostMessage(webView, hVar2, uri, z3, (androidx.webkit.internal.f) jsReplyProxyBoundaryInterface.getOrCreatePeer(new androidx.webkit.internal.e(jsReplyProxyBoundaryInterface, 0)));
                }
            }
            hVar = new androidx.webkit.h(webMessagePayloadBoundaryInterface.getAsString());
        } else {
            hVar = new androidx.webkit.h(webMessageBoundaryInterface.getData());
        }
        hVar2 = hVar;
        if (hVar2 != null) {
            JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface2 = (JsReplyProxyBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            ((p183m6.j) this.f41079b).onPostMessage(webView, hVar2, uri, z3, (androidx.webkit.internal.f) jsReplyProxyBoundaryInterface2.getOrCreatePeer(new androidx.webkit.internal.e(jsReplyProxyBoundaryInterface2, 0)));
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, K response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        p355xf.o oVar = q.f43977a;
        ((C0765i) this.f41079b).resumeWith(response);
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnNumberInputListener
    public void onSelectNumber(InputMobileImpl item) {
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        Intrinsics.checkNotNullParameter(item, "item");
        boolean zIsEmpty = TextUtils.isEmpty(item.getCustomerName());
        ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = (ScheduleTopUpAddTaskFragment) this.f41079b;
        if (!zIsEmpty) {
            String phoneName = item.getCustomerName();
            if (phoneName == null) {
                phoneName = "";
            }
            scheduleTopUpAddTaskFragment.f26553H = phoneName;
        }
        KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
        scheduleTopUpAddTaskFragment.x();
        c0 c0Var = (c0) scheduleTopUpAddTaskFragment.f27335j;
        if (c0Var == null || (modelMobileWithIconInputLayout = c0Var.f8230e) == null) {
            return;
        }
        ModelMobileWithIconInputLayout.showContactIv$default(modelMobileWithIconInputLayout, true, false, 2, null);
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        InputBuffer inputBuffer = (InputBuffer) obj;
        v vVar = (v) this.f41079b;
        inputBuffer.setPresentationTimeUs(vVar.f14750q.uptimeUs());
        inputBuffer.setEndOfStream(true);
        inputBuffer.submit();
        ListenableFuture<Void> terminationFuture = inputBuffer.getTerminationFuture();
        terminationFuture.addListener(new androidx.camera.core.impl.utils.futures.i(0, terminationFuture, new p183m6.j(this, 12)), vVar.f14741h);
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback
    public void onUserChooseNotToEnableGps() {
        ((LocationServiceBridge) this.f41079b).handleSuccess(LocationServiceBridge.createFailureResult$default((LocationServiceBridge) this.f41079b, LocationServiceBridge.ACTION_SHOW_GPS_DIALOG, "User chose not to enable GPS", null, com.airbnb.lottie.model.layer.d.q("userChoice", "NOT_ENABLE_GPS"), 4, null));
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback
    public void onUserChooseToEnableGps() {
        Map mapB = F.b(new Pair("userChoice", "ENABLE_GPS"));
        LocationServiceBridge locationServiceBridge = (LocationServiceBridge) this.f41079b;
        locationServiceBridge.handleSuccess(locationServiceBridge.createSuccessResult(LocationServiceBridge.ACTION_SHOW_GPS_DIALOG, "User chose to enable GPS", mapB));
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(J url, List cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        ArrayList arrayList = new ArrayList();
        Iterator it = cookies.iterator();
        while (it.hasNext()) {
            C1951t cookie = (C1951t) it.next();
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            arrayList.add(cookie.a(true));
        }
        try {
            ((CookieHandler) this.f41079b).put(url.k(), F.b(new Pair(HttpHeaders.SET_COOKIE, arrayList)));
        } catch (IOException e10) {
            t tVar = t.f4869a.get();
            StringBuilder sb2 = new StringBuilder("Saving cookies failed for ");
            J j6 = url.j("/...");
            Intrinsics.e(j6);
            sb2.append(j6);
            String string = sb2.toString();
            tVar.getClass();
            t.i(5, string, e10);
        }
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        String strO = J3.a.O((Bitmap) this.f41079b, new File(Environment.getExternalStoragePublicDirectory("PalmPay"), FirebaseAnalytics.Event.SHARE));
        r0.N1(BaseApplication.getContext(), strO);
        observableEmitter.onNext(strO);
        observableEmitter.onComplete();
    }

    public /* synthetic */ f(Object obj, int i7) {
        this.f41078a = i7;
        this.f41079b = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        ((v) this.f41079b).b(0, "Unable to acquire InputBuffer.", th);
    }

    public f(C2086l function) {
        this.f41078a = 22;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f41079b = function;
    }

    public f(androidx.camera.video.internal.c cVar) {
        this.f41078a = 19;
        this.f41079b = (V3.d) cVar.f14622c;
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        CLTakePhotoActivity cLTakePhotoActivity = (CLTakePhotoActivity) this.f41079b;
        cLTakePhotoActivity.showLoadingDialog(false);
        int i7 = CLTakePhotoActivity.f29134F0;
        cLTakePhotoActivity.C();
        cLTakePhotoActivity.f29153z0 = false;
        ToastUtils.showLong(C0.G.o("something error, ", e10.getMessage()), new Object[0]);
        e10.printStackTrace();
    }

    public f() {
        this.f41078a = 15;
        this.f41079b = new AtomicBoolean();
    }

    public f(CookieHandler cookieHandler) {
        this.f41078a = 18;
        Intrinsics.checkNotNullParameter(cookieHandler, "cookieHandler");
        this.f41079b = cookieHandler;
    }

    public f(WorkDatabase workDatabase) {
        this.f41078a = 11;
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.f41079b = workDatabase;
    }

    public f(String str) {
        this.f41078a = 8;
        this.f41079b = new LinkedHashMap();
    }

    public f(Dg.b threadFactory) {
        this.f41078a = 3;
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
        this.f41079b = new ShadowThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new SynchronousQueue(), (ThreadFactory) threadFactory, "\u200bokhttp3.internal.concurrent.TaskRunner$RealBackend", true);
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
    }

    @Override // com.transsnet.palmpay.teller.ui.view.BillerCouponClickListener
    public void onCouponClaimComplete() {
    }
}
