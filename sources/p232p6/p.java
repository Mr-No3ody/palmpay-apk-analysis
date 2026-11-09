package p232p6;

import Ab.r;
import D6.f;
import Ff.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Size;
import androidx.activity.AbstractActivityC0822m;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.camera.core.impl.utils.executor.g;
import androidx.fragment.app.E;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.gson.Gson;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.face.FaceDetection;
import com.palmpay.lib.liveness.LiveID$ILiveIDListener;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.palmpay.lib.liveness.model.AuthenticationRequest;
import com.palmpay.lib.liveness.model.AuthenticationResponse;
import com.palmpay.lib.liveness.model.ClientConfig;
import com.palmpay.lib.liveness.model.ExtendFeature;
import com.palmpay.lib.liveness.net.LiveApi;
import com.palmpay.lib.liveness.net.ReasonTrack;
import com.palmpay.lib.liveness.net.UploadApi;
import com.palmpay.lib.liveness.ui.FaceCaptureActivity;
import com.palmpay.lib.liveness.ui.LivenessActivity;
import com.palmpay.lib.liveness.ui.SelfieCaptureActivity;
import com.palmpay.lib.liveness.v2.LivenessActivityV2;
import com.palmpay.lib.liveness.video.VideoActivity;
import com.transsnet.adsdk.b;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.init.LivenessTask$Companion$initLiveness$1$1$1$config$1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.D;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Interceptor;
import okhttp3.S;
import okhttp3.U;
import okhttp3.Y;
import okhttp3.e0;
import p051d9.C1605b;
import p141j9.C1794b;
import p320v6.d;
import p320v6.e;
import p337w8.l;
import r6.a;
import retrofit2.C1993k;
import retrofit2.M;
import retrofit2.N;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static LiveApi f41235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static UploadApi f41236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f41237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static N f41238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f41239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f41240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f41241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f41242i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Context f41244k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile boolean f41246m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f41234a = new p();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Integer f41243j = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ReasonTrack f41245l = new ReasonTrack();

    /* JADX WARN: Code duplicated, block: B:193:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:198:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:201:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:203:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:209:0x0400  */
    /* JADX WARN: Code duplicated, block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [p6.a] */
    public static final Object a(Activity activity, AuthenticationRequest authenticationRequest, LiveID$ILiveIDListener liveID$ILiveIDListener, int i7, c cVar) {
        n nVar;
        AuthenticationRequest authenticationRequest2;
        int i10;
        Context context;
        p pVar;
        LiveID$ILiveIDListener liveID$ILiveIDListener2;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor2;
        String str;
        String str2;
        final String uploadUrl;
        Context context2;
        Intent intent;
        Integer num;
        Intent intent2;
        Integer num2;
        a aVar;
        String timeOutOpt;
        Intent intent3;
        final Context context3;
        ?? r13;
        n nVar2;
        ExtendFeature extendFeature;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor3;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor4;
        String facialRecognitionAccuracy;
        Map<String, String> thresholdMap;
        String str3;
        Map<String, String> thresholdMap2;
        String str4;
        Size size;
        String photoResolution;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor5;
        p pVar2 = f41234a;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i11 = nVar.f41230g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f41230g = i11 - Integer.MIN_VALUE;
            } else {
                nVar = new n(cVar);
            }
        } else {
            nVar = new n(cVar);
        }
        Object objAuthenticate = nVar.f41229f;
        Ef.a aVar2 = Ef.a.f2423a;
        int i12 = nVar.f41230g;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = nVar.f41228e;
                liveID$ILiveIDListener2 = nVar.f41227d;
                AuthenticationRequest authenticationRequest3 = nVar.f41226c;
                context = nVar.f41225b;
                p pVar3 = nVar.f41224a;
                g.M(objAuthenticate);
                authenticationRequest2 = authenticationRequest3;
                pVar = pVar3;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(objAuthenticate);
            }
            return Unit.f38893a;
        }
        g.M(objAuthenticate);
        a aVar3 = f41237d;
        if (aVar3 != null && (liveID$ILiveIDMonitor = aVar3.f41573e) != null) {
            d dVar = e.f43074b;
            String str5 = dVar.f43071a;
            Pair pair = new Pair("event_desc", dVar.f43072b);
            String str6 = f41242i;
            if (str6 == null) {
                str6 = "";
            }
            Pair pair2 = new Pair("uuid", str6);
            Integer scene = authenticationRequest.getScene();
            liveID$ILiveIDMonitor.report(str5, G.h(pair, pair2, new Pair("scene", new Integer(scene != null ? scene.intValue() : -1))));
        }
        LiveApi liveApiE = e();
        nVar.f41224a = pVar2;
        nVar.f41225b = activity;
        nVar.f41226c = authenticationRequest;
        nVar.f41227d = liveID$ILiveIDListener;
        nVar.f41228e = i7;
        nVar.f41230g = 1;
        objAuthenticate = liveApiE.authenticate("/api/validator/liveness/config/initializeV2", authenticationRequest, nVar);
        if (objAuthenticate == aVar2) {
            return aVar2;
        }
        authenticationRequest2 = authenticationRequest;
        i10 = i7;
        context = activity;
        pVar = pVar2;
        liveID$ILiveIDListener2 = liveID$ILiveIDListener;
        final AuthenticationResponse authenticationResponse = (AuthenticationResponse) objAuthenticate;
        if (g.A(authenticationResponse)) {
            a aVar4 = f41237d;
            if (aVar4 == null || (liveID$ILiveIDMonitor5 = aVar4.f41573e) == null) {
                str = "";
            } else {
                d dVar2 = e.f43075c;
                str = "";
                String str7 = dVar2.f43071a;
                Pair pair3 = new Pair("event_desc", dVar2.f43072b);
                Pair pair4 = new Pair("transactionId", authenticationResponse.getData().getTransactionId());
                String str8 = f41242i;
                if (str8 == null) {
                    str8 = str;
                }
                Pair pair5 = new Pair("uuid", str8);
                Integer scene2 = authenticationRequest2.getScene();
                liveID$ILiveIDMonitor5.report(str7, G.h(pair3, pair4, pair5, new Pair("scene", new Integer(scene2 != null ? scene2.intValue() : -1))));
            }
            a aVar5 = f41237d;
            if (aVar5 != null) {
                ClientConfig clientConfig = authenticationResponse.getData().getClientConfig();
                if (clientConfig == null || (photoResolution = clientConfig.getPhotoResolution()) == null) {
                    size = null;
                } else {
                    List listSplit$default = StringsKt__StringsKt.split$default(photoResolution, new String[]{"*"}, false, 0, 6, null);
                    if (listSplit$default.size() == 2) {
                        new Size(Integer.parseInt((String) listSplit$default.get(0)), Integer.parseInt((String) listSplit$default.get(1)));
                    }
                    size = new Size(640, 640);
                }
                aVar5.f41581m = size;
            }
            a aVar6 = f41237d;
            if (aVar6 != null) {
                ClientConfig clientConfig2 = authenticationResponse.getData().getClientConfig();
                aVar6.f41579k = (clientConfig2 == null || (thresholdMap2 = clientConfig2.getThresholdMap()) == null || (str4 = thresholdMap2.get("smile")) == null) ? null : new Float(Float.parseFloat(str4));
            }
            a aVar7 = f41237d;
            if (aVar7 != null) {
                ClientConfig clientConfig3 = authenticationResponse.getData().getClientConfig();
                aVar7.f41580l = (clientConfig3 == null || (thresholdMap = clientConfig3.getThresholdMap()) == null || (str3 = thresholdMap.get("blink")) == null) ? null : new Float(Float.parseFloat(str3));
            }
            a aVar8 = f41237d;
            if (aVar8 != null) {
                ClientConfig clientConfig4 = authenticationResponse.getData().getClientConfig();
                aVar8.f41578j = (clientConfig4 == null || (facialRecognitionAccuracy = clientConfig4.getFacialRecognitionAccuracy()) == null) ? null : new Float(Float.parseFloat(facialRecognitionAccuracy));
            }
            a aVar9 = f41237d;
            if (aVar9 != null) {
                ClientConfig clientConfig5 = authenticationResponse.getData().getClientConfig();
                aVar9.f41582n = clientConfig5 != null ? clientConfig5.getLivenessPhotosNumber() : null;
            }
            a aVar10 = f41237d;
            if (aVar10 != null) {
                ClientConfig clientConfig6 = authenticationResponse.getData().getClientConfig();
                aVar10.f41583o = clientConfig6 != null ? clientConfig6.getLivenessTimeOut() : null;
            }
            a aVar11 = f41237d;
            if (aVar11 != null) {
                ClientConfig clientConfig7 = authenticationResponse.getData().getClientConfig();
                aVar11.f41584p = clientConfig7 != null ? clientConfig7.getServiceLevel() : null;
            }
            a aVar12 = f41237d;
            if (aVar12 != null) {
                ClientConfig clientConfig8 = authenticationResponse.getData().getClientConfig();
                aVar12.f41585q = clientConfig8 != null ? clientConfig8.getVideoFrames() : null;
            }
            a aVar13 = f41237d;
            if (aVar13 != null) {
                ClientConfig clientConfig9 = authenticationResponse.getData().getClientConfig();
                aVar13.f41586r = clientConfig9 != null ? clientConfig9.getActionList() : null;
            }
            a aVar14 = f41237d;
            if (aVar14 != null) {
                ClientConfig clientConfig10 = authenticationResponse.getData().getClientConfig();
                aVar14.f41587s = clientConfig10 != null ? clientConfig10.getExtendFeature() : null;
            }
            final String transactionId = authenticationResponse.getData().getTransactionId();
            if (TextUtils.isEmpty(transactionId)) {
                f fVar = f.f1629j;
                liveID$ILiveIDListener2.onInterrupted(fVar.f1633a, fVar.f1634b, null);
                a aVar15 = f41237d;
                if (aVar15 != null && (liveID$ILiveIDMonitor4 = aVar15.f41573e) != null) {
                    d dVar3 = e.f43079g;
                    String str9 = dVar3.f43071a;
                    Pair pair6 = new Pair("event_desc", dVar3.f43072b);
                    Pair pair7 = new Pair("code", "-99");
                    Pair pair8 = new Pair("msg", "transactionId is empty");
                    String str10 = f41242i;
                    Pair pair9 = new Pair("uuid", str10 == null ? str : str10);
                    Integer scene3 = authenticationRequest2.getScene();
                    liveID$ILiveIDMonitor4.report(str9, G.h(pair6, pair7, pair8, pair9, new Pair("scene", new Integer(scene3 != null ? scene3.intValue() : -1))));
                }
                return Unit.f38893a;
            }
            f41241h = transactionId;
            ClientConfig clientConfig11 = authenticationResponse.getData().getClientConfig();
            if (clientConfig11 != null) {
                String str11 = str;
                uploadUrl = clientConfig11.getUploadUrl();
                str2 = str11;
            } else {
                str2 = str;
                uploadUrl = null;
            }
            if (TextUtils.isEmpty(uploadUrl)) {
                f fVar2 = f.f1629j;
                liveID$ILiveIDListener2.onInterrupted(fVar2.f1633a, fVar2.f1634b, null);
                a aVar16 = f41237d;
                if (aVar16 != null && (liveID$ILiveIDMonitor3 = aVar16.f41573e) != null) {
                    d dVar4 = e.f43079g;
                    String str12 = dVar4.f43071a;
                    Pair pair10 = new Pair("event_desc", dVar4.f43072b);
                    Pair pair11 = new Pair("code", "-99");
                    Pair pair12 = new Pair("msg", "uploadUrl is empty");
                    Pair pair13 = new Pair("transactionId", transactionId);
                    String str13 = f41242i;
                    Pair pair14 = new Pair("uuid", str13 == null ? str2 : str13);
                    Integer scene4 = authenticationRequest2.getScene();
                    liveID$ILiveIDMonitor3.report(str12, G.h(pair10, pair11, pair12, pair13, pair14, new Pair("scene", new Integer(scene4 != null ? scene4.intValue() : -1))));
                }
                return Unit.f38893a;
            }
            if (1 == i10) {
                context2 = context;
                intent = new Intent(context2, (Class<?>) SelfieCaptureActivity.class);
            } else {
                a aVar17 = f41237d;
                if (aVar17 == null || (num2 = aVar17.f41576h) == null || 1 != num2.intValue()) {
                    context2 = context;
                    context2 = context;
                    context2 = context;
                    a aVar18 = f41237d;
                    if (aVar18 == null || (num = aVar18.f41577i) == null || 1 != num.intValue()) {
                        intent = new Intent(context2, (Class<?>) FaceCaptureActivity.class);
                    } else {
                        intent2 = null;
                    }
                    if (intent2 == null) {
                        aVar = f41237d;
                        if (aVar != null || (extendFeature = aVar.f41587s) == null) {
                            timeOutOpt = null;
                        } else {
                            timeOutOpt = extendFeature.getTimeOutOpt();
                        }
                        if (TransType.TRANS_TYPE_SPEND_SAVE_DEPOSIT.equals(timeOutOpt)) {
                            intent3 = new Intent(context2, (Class<?>) LivenessActivityV2.class);
                        } else {
                            intent3 = new Intent(context2, (Class<?>) LivenessActivity.class);
                        }
                        final Intent intent4 = intent3;
                        context3 = context2;
                        final LiveID$ILiveIDListener liveID$ILiveIDListener3 = liveID$ILiveIDListener2;
                        final AuthenticationRequest authenticationRequest4 = authenticationRequest2;
                        final int i13 = i10;
                        r13 = new Function0() { // from class: p6.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                p pVar4 = p.f41234a;
                                String str14 = uploadUrl;
                                Intrinsics.e(str14);
                                p.k(context3, intent4, transactionId, str14, i13, authenticationRequest4, authenticationResponse, liveID$ILiveIDListener3);
                                return Unit.f38893a;
                            }
                        };
                        nVar2 = nVar;
                        nVar2.f41224a = null;
                        nVar2.f41225b = null;
                        nVar2.f41226c = null;
                        nVar2.f41227d = null;
                        nVar2.f41230g = 2;
                        if (pVar.c(context3, r13, nVar2) == aVar2) {
                            return aVar2;
                        }
                        return Unit.f38893a;
                    }
                    String str14 = uploadUrl;
                    Intrinsics.e(str14);
                    pVar.getClass();
                    k(context2, intent2, transactionId, str14, i10, authenticationRequest2, authenticationResponse, liveID$ILiveIDListener2);
                } else {
                    context2 = context;
                    intent = new Intent(context2, (Class<?>) VideoActivity.class);
                }
            }
            intent2 = intent;
            if (intent2 == null) {
                aVar = f41237d;
                if (aVar != null) {
                    timeOutOpt = null;
                } else {
                    timeOutOpt = null;
                }
                if (TransType.TRANS_TYPE_SPEND_SAVE_DEPOSIT.equals(timeOutOpt)) {
                    intent3 = new Intent(context2, (Class<?>) LivenessActivityV2.class);
                } else {
                    intent3 = new Intent(context2, (Class<?>) LivenessActivity.class);
                }
                final Intent intent5 = intent3;
                context3 = context2;
                final LiveID$ILiveIDListener liveID$ILiveIDListener4 = liveID$ILiveIDListener2;
                final AuthenticationRequest authenticationRequest5 = authenticationRequest2;
                final int i14 = i10;
                r13 = new Function0() { // from class: p6.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        p pVar4 = p.f41234a;
                        String str15 = uploadUrl;
                        Intrinsics.e(str15);
                        p.k(context3, intent5, transactionId, str15, i14, authenticationRequest5, authenticationResponse, liveID$ILiveIDListener4);
                        return Unit.f38893a;
                    }
                };
                nVar2 = nVar;
                nVar2.f41224a = null;
                nVar2.f41225b = null;
                nVar2.f41226c = null;
                nVar2.f41227d = null;
                nVar2.f41230g = 2;
                if (pVar.c(context3, r13, nVar2) == aVar2) {
                    return aVar2;
                }
                return Unit.f38893a;
            }
            String str15 = uploadUrl;
            Intrinsics.e(str15);
            pVar.getClass();
            k(context2, intent2, transactionId, str15, i10, authenticationRequest2, authenticationResponse, liveID$ILiveIDListener2);
        } else {
            liveID$ILiveIDListener2.onInterrupted(authenticationResponse.getRespCode(), authenticationResponse.getRespMsg(), null);
            f41245l.reset();
            a aVar19 = f41237d;
            if (aVar19 != null && (liveID$ILiveIDMonitor2 = aVar19.f41573e) != null) {
                d dVar5 = e.f43079g;
                String str16 = dVar5.f43071a;
                Pair pair15 = new Pair("event_desc", dVar5.f43072b);
                Integer scene5 = authenticationRequest2.getScene();
                Pair pair16 = new Pair("scene", new Integer(scene5 != null ? scene5.intValue() : -1));
                String respCode = authenticationResponse.getRespCode();
                Pair pair17 = new Pair("code", respCode != null ? respCode : "-99");
                String respMsg = authenticationResponse.getRespMsg();
                if (respMsg == null) {
                    respMsg = "Unknown";
                }
                Pair pair18 = new Pair("msg", respMsg);
                String str17 = f41242i;
                liveID$ILiveIDMonitor2.report(str16, G.h(pair15, pair16, pair17, pair18, new Pair("uuid", str17 == null ? "" : str17)));
            }
        }
        return Unit.f38893a;
    }

    public static void b(Activity activity, AuthenticationRequest authenticationRequest, LiveID$ILiveIDListener liveID$ILiveIDListener) {
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        f41245l.reset();
        f41242i = UUID.randomUUID().toString();
        f41241h = null;
        a aVar = f41237d;
        if (aVar != null && (liveID$ILiveIDMonitor = aVar.f41573e) != null) {
            d dVar = e.f43073a;
            String str = dVar.f43071a;
            Pair pair = new Pair("event_desc", dVar.f43072b);
            String str2 = f41242i;
            if (str2 == null) {
                str2 = "";
            }
            Pair pair2 = new Pair("uuid", str2);
            Integer scene = authenticationRequest.getScene();
            liveID$ILiveIDMonitor.report(str, G.h(pair, pair2, new Pair("scene", Integer.valueOf(scene != null ? scene.intValue() : -1))));
        }
        D6.a aVar2 = new D6.a(liveID$ILiveIDListener, 5, authenticationRequest, activity);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            ModuleInstallClient client = ModuleInstall.getClient((Context) activity);
            Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
            client.areModulesAvailable(FaceDetection.getClient()).addOnSuccessListener(new C1794b(new C1605b(12, atomicBoolean, aVar2), 18)).addOnFailureListener(new b(11, atomicBoolean, aVar2));
            new Handler(Looper.getMainLooper()).postDelayed(new com.flexibank.sdk.g(26, atomicBoolean, aVar2), 1500L);
        } catch (Exception unused) {
            if (atomicBoolean.compareAndSet(false, true)) {
                aVar2.invoke(Boolean.FALSE);
            }
        }
    }

    public static String d() {
        ExtendFeature extendFeature;
        String deviceFingerprintThreshold;
        String string;
        Integer intOrNull;
        LivenessTask$Companion$initLiveness$1$1$1$config$1 livenessTask$Companion$initLiveness$1$1$1$config$1;
        a aVar = f41237d;
        if (aVar != null && (extendFeature = aVar.f41587s) != null && (deviceFingerprintThreshold = extendFeature.getDeviceFingerprintThreshold()) != null && (string = StringsKt.V(deviceFingerprintThreshold).toString()) != null && (intOrNull = StringsKt.toIntOrNull(string)) != null) {
            int iIntValue = intOrNull.intValue();
            a aVar2 = f41237d;
            String strCollect = (aVar2 == null || (livenessTask$Companion$initLiveness$1$1$1$config$1 = aVar2.f41574f) == null) ? null : livenessTask$Companion$initLiveness$1$1$1$config$1.collect();
            if (strCollect != null && strCollect.length() > 0 && strCollect.length() < iIntValue) {
                return strCollect;
            }
        }
        return null;
    }

    public static final LiveApi e() {
        LiveApi liveApi = f41235b;
        if (liveApi != null) {
            return liveApi;
        }
        Intrinsics.n("api");
        throw null;
    }

    public static Context f() {
        Context context = f41244k;
        if (context != null) {
            return context;
        }
        Intrinsics.n("appContext");
        throw null;
    }

    public static final S g(Context context, boolean z3) {
        Intrinsics.checkNotNullParameter(context, "context");
        S s3 = new S();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        s3.b(60L, timeUnit);
        s3.e(60L, timeUnit);
        s3.f(60L, timeUnit);
        s3.a(new p320v6.a());
        final int i7 = 0;
        s3.a(new Interceptor() { // from class: p6.c
            @Override // okhttp3.Interceptor
            public final e0 intercept(Interceptor.Chain chain) throws IOException {
                switch (i7) {
                    case 0:
                        Intrinsics.checkNotNullParameter(chain, "chain");
                        String str = "";
                        try {
                            Y yRequest = chain.request();
                            str = yRequest.f40685a.f40587i;
                            return chain.proceed(yRequest);
                        } catch (InterruptedIOException e10) {
                            throw new IOException(C0.G.o("Get InterruptedIOException when call ", str), e10);
                        } catch (ConnectException e11) {
                            throw new IOException(C0.G.o("Get ConnectException when call ", str), e11);
                        } catch (SocketException e12) {
                            throw new IOException(C0.G.o("Get SocketException when call ", str), e12);
                        } catch (UnknownHostException e13) {
                            throw new IOException(C0.G.o("Get UnknownHostException when call ", str), e13);
                        } catch (SSLHandshakeException e14) {
                            throw new IOException(C0.G.o("Get SSLHandshakeException when call ", str), e14);
                        } catch (C1993k e15) {
                            throw new IOException(C0.G.o("Get HttpException when call ", str), e15);
                        } catch (Exception e16) {
                            throw new IOException(C0.G.o("Get Exception when call ", str), e16);
                        } catch (Throwable th) {
                            throw new IOException(C0.G.o("Get Exception when call ", str), th);
                        }
                    default:
                        Intrinsics.checkNotNullParameter(chain, "chain");
                        Y yRequest2 = chain.request();
                        for (int i10 = 1; i10 < 4; i10++) {
                            try {
                                int i11 = p292t6.a.f42345a;
                                String msg = "Liveness SDK network attempt #" + i10;
                                Intrinsics.checkNotNullParameter("Liveness", "tag");
                                Intrinsics.checkNotNullParameter(msg, "msg");
                                e0 e0VarProceed = chain.proceed(yRequest2);
                                if (e0VarProceed.f40731d < 500) {
                                    return e0VarProceed;
                                }
                            } catch (Exception unused) {
                                int i12 = p292t6.a.f42345a;
                                String msg2 = "Liveness SDK network attempt #" + i10 + " failed";
                                Intrinsics.checkNotNullParameter("Liveness", "tag");
                                Intrinsics.checkNotNullParameter(msg2, "msg");
                            }
                        }
                        return chain.proceed(yRequest2);
                }
            }
        });
        final int i10 = 1;
        s3.a(new Interceptor() { // from class: p6.c
            @Override // okhttp3.Interceptor
            public final e0 intercept(Interceptor.Chain chain) throws IOException {
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(chain, "chain");
                        String str = "";
                        try {
                            Y yRequest = chain.request();
                            str = yRequest.f40685a.f40587i;
                            return chain.proceed(yRequest);
                        } catch (InterruptedIOException e10) {
                            throw new IOException(C0.G.o("Get InterruptedIOException when call ", str), e10);
                        } catch (ConnectException e11) {
                            throw new IOException(C0.G.o("Get ConnectException when call ", str), e11);
                        } catch (SocketException e12) {
                            throw new IOException(C0.G.o("Get SocketException when call ", str), e12);
                        } catch (UnknownHostException e13) {
                            throw new IOException(C0.G.o("Get UnknownHostException when call ", str), e13);
                        } catch (SSLHandshakeException e14) {
                            throw new IOException(C0.G.o("Get SSLHandshakeException when call ", str), e14);
                        } catch (C1993k e15) {
                            throw new IOException(C0.G.o("Get HttpException when call ", str), e15);
                        } catch (Exception e16) {
                            throw new IOException(C0.G.o("Get Exception when call ", str), e16);
                        } catch (Throwable th) {
                            throw new IOException(C0.G.o("Get Exception when call ", str), th);
                        }
                    default:
                        Intrinsics.checkNotNullParameter(chain, "chain");
                        Y yRequest2 = chain.request();
                        for (int i11 = 1; i11 < 4; i11++) {
                            try {
                                int i12 = p292t6.a.f42345a;
                                String msg = "Liveness SDK network attempt #" + i11;
                                Intrinsics.checkNotNullParameter("Liveness", "tag");
                                Intrinsics.checkNotNullParameter(msg, "msg");
                                e0 e0VarProceed = chain.proceed(yRequest2);
                                if (e0VarProceed.f40731d < 500) {
                                    return e0VarProceed;
                                }
                            } catch (Exception unused) {
                                int i13 = p292t6.a.f42345a;
                                String msg2 = "Liveness SDK network attempt #" + i11 + " failed";
                                Intrinsics.checkNotNullParameter("Liveness", "tag");
                                Intrinsics.checkNotNullParameter(msg2, "msg");
                            }
                        }
                        return chain.proceed(yRequest2);
                }
            }
        });
        if (z3) {
            ArrayList dnsServerList = new ArrayList();
            dnsServerList.add(0);
            dnsServerList.add(1);
            U client = new U(new U().a());
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dnsServerList, "dnsServerList");
            l lVar = new l(context);
            lVar.f43327b = J3.a.K(client, dnsServerList);
            lVar.f43328c = true;
            lVar.f43330e = 300000L;
            lVar.f43331f = 120000L;
            lVar.e();
            s3.c(lVar);
        }
        return s3;
    }

    public static UploadApi h() {
        UploadApi uploadApi = f41236c;
        if (uploadApi != null) {
            return uploadApi;
        }
        Intrinsics.n("uploadApi");
        throw null;
    }

    public static final void i(Context context, a config) {
        int i7 = 0;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(applicationContext, "<set-?>");
        f41244k = applicationContext;
        MlKitContext.zza(context.getApplicationContext());
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor = config.f41573e;
        config.f41573e = liveID$ILiveIDMonitor != null ? new r(liveID$ILiveIDMonitor, 21) : null;
        f41237d = config;
        String absolutePath = context.getDir("Liveness", 0).getAbsolutePath();
        Intrinsics.checkNotNullParameter(absolutePath, "<set-?>");
        f41239f = absolutePath;
        M m7 = new M();
        m7.b(config.f41569a);
        U u6 = config.f41570b;
        if (u6 == null) {
            u6 = new U(g(context, config.f41571c));
        }
        m7.f41879a = u6;
        m7.a(new retrofit2.converter.gson.a(new Gson(), i7));
        f41238e = m7.c();
        M m10 = new M();
        m10.b(config.f41569a);
        m10.f41879a = new U(g(context, config.f41571c));
        m10.a(p320v6.f.f43090a);
        N nC = m10.c();
        N n10 = f41238e;
        if (n10 == null) {
            Intrinsics.n("retrofit");
            throw null;
        }
        LiveApi liveApi = (LiveApi) n10.b(LiveApi.class);
        Intrinsics.checkNotNullParameter(liveApi, "<set-?>");
        f41235b = liveApi;
        UploadApi uploadApi = (UploadApi) nC.b(UploadApi.class);
        Intrinsics.checkNotNullParameter(uploadApi, "<set-?>");
        f41236c = uploadApi;
        try {
            ModuleInstallRequest moduleInstallRequestBuild = ModuleInstallRequest.newBuilder().addApi(FaceDetection.getClient()).setListener(new d()).build();
            Intrinsics.checkNotNullExpressionValue(moduleInstallRequestBuild, "build(...)");
            ModuleInstall.getClient(context).installModules(moduleInstallRequestBuild).addOnSuccessListener(new C1794b(new D(10), 19)).addOnFailureListener(new p184m8.b(3));
        } catch (Exception unused) {
        }
        f41246m = true;
        p280s6.b.a();
        Intrinsics.checkNotNullParameter("en", "newLocale");
        if (StringsKt.F("en")) {
            p292t6.a.c("LazyLoad.setLanguage: Attempted to set a blank locale. Ignoring.");
            return;
        }
        int i10 = p292t6.a.f42345a;
        p292t6.a.a("LazyLoad.setLanguage: Requested to set language to 'en'.");
        AtomicReference atomicReference = p280s6.b.f42051c;
        atomicReference.set("en");
        if (!p280s6.b.f42050b || p280s6.b.f42049a.getCount() != 0) {
            p292t6.a.a("LazyLoad.setLanguage: Manager not fully initialized or init in progress. Locale 'en' stored. Ensuring init() is triggered.");
            p280s6.b.a();
            return;
        }
        Context contextF = f();
        String str = (String) atomicReference.getAndSet(null);
        if (str == null) {
            p292t6.a.a("LazyLoad.setLanguage: Target locale was concurrently processed by init or another setLanguage call. No action needed here.");
            return;
        }
        p292t6.a.a("LazyLoad.setLanguage: Manager initialized. Applying locale '" + str + "' immediately.");
        p280s6.a.f42044a.setLocale$lib_liveness_release(contextF, str);
    }

    public static void j(Activity activityContext, AuthenticationRequest authRequest, LiveID$ILiveIDListener listener) {
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        Intrinsics.checkNotNullParameter(authRequest, "authRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        f41243j = authRequest.getScene();
        if (f41246m) {
            if (androidx.core.content.d.a(activityContext, "android.permission.CAMERA") == 0) {
                b(activityContext, authRequest, listener);
                return;
            } else {
                p140j8.f.n((E) activityContext).e("android.permission.CAMERA").e(new defpackage.a(activityContext, authRequest, listener));
                return;
            }
        }
        f fVar = f.f1627g;
        listener.onInterrupted(fVar.f1633a, fVar.f1634b, null);
        a aVar = f41237d;
        if (aVar == null || (liveID$ILiveIDMonitor = aVar.f41573e) == null) {
            return;
        }
        d dVar = e.f43079g;
        String str = dVar.f43071a;
        Pair pair = new Pair("event_desc", dVar.f43072b);
        Integer scene = authRequest.getScene();
        liveID$ILiveIDMonitor.report(str, G.h(pair, new Pair("scene", Integer.valueOf(scene != null ? scene.intValue() : -1)), new Pair("code", fVar.f1633a), new Pair("msg", fVar.f1634b)));
    }

    public static void k(Context context, Intent intent, String str, String str2, int i7, AuthenticationRequest authenticationRequest, AuthenticationResponse authenticationResponse, LiveID$ILiveIDListener liveID$ILiveIDListener) {
        intent.putExtra("KEY_TRANSACTION_ID", str);
        intent.putExtra("KEY_UPLOAD_URL", str2);
        ClientConfig clientConfig = authenticationResponse.getData().getClientConfig();
        androidx.activity.result.g gVarD = null;
        intent.putExtra("KEY_UPLOAD_VIDEO_URL", clientConfig != null ? clientConfig.getUploadVideoUrl() : null);
        ClientConfig clientConfig2 = authenticationResponse.getData().getClientConfig();
        intent.putExtra("KEY_FILE_TYPE", clientConfig2 != null ? Integer.valueOf(clientConfig2.getFileTypeSwitch()) : null);
        intent.putExtra("KEY_DEAL_TYPE", i7);
        final o activityResult = new o(liveID$ILiveIDListener, authenticationRequest, str);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(activityResult, "activityResult");
        AbstractActivityC0822m abstractActivityC0822m = context instanceof AbstractActivityC0822m ? (AbstractActivityC0822m) context : null;
        final F f10 = new F();
        ActivityResultCallback activityResultCallback = new ActivityResultCallback() { // from class: com.palmpay.lib.liveness.router.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResult activityResult2 = (ActivityResult) obj;
                activityResult.onActivityResult(activityResult2.f12042a, activityResult2.f12043b);
                androidx.activity.result.a aVar = (androidx.activity.result.a) f10.f38951a;
                if (aVar != null) {
                    aVar.b();
                }
            }
        };
        if (abstractActivityC0822m != null) {
            gVarD = abstractActivityC0822m.getActivityResultRegistry().d("router_launcher_" + UUID.randomUUID(), new p177m.l(), activityResultCallback);
            Intrinsics.checkNotNullExpressionValue(gVarD, "register(...)");
        }
        f10.f38951a = gVarD;
        if (gVarD != null) {
            gVarD.a(intent);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e5, code lost:
    
        if (Wf.AbstractC0780y.s(r0, r1, r3) == r5) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r17, p232p6.a r18, Ff.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p232p6.p.c(android.content.Context, p6.a, Ff.c):java.lang.Object");
    }
}
