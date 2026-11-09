package p232p6;

import D6.f;
import android.content.Intent;
import com.google.gson.Gson;
import com.palmpay.lib.liveness.LiveID$ILiveIDListener;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.palmpay.lib.liveness.model.AuthenticationRequest;
import com.palmpay.lib.liveness.model.CheckResponse;
import com.palmpay.lib.liveness.model.ExtendFeature;
import com.palmpay.lib.liveness.model.LiveIDException;
import com.palmpay.lib.liveness.result.LiveIDResult;
import com.palmpay.lib.liveness.result.LiveSelfieResult;
import com.palmpay.lib.liveness.router.LRouter$ActivityResult;
import com.palmpay.lib.liveness.ui.FaceCaptureActivity;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import p292t6.a;
import p320v6.d;
import p320v6.e;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements LRouter$ActivityResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LiveID$ILiveIDListener f41231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthenticationRequest f41232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41233c;

    public o(LiveID$ILiveIDListener liveID$ILiveIDListener, AuthenticationRequest authenticationRequest, String str) {
        this.f41231a = liveID$ILiveIDListener;
        this.f41232b = authenticationRequest;
        this.f41233c = str;
    }

    @Override // com.palmpay.lib.liveness.router.LRouter$ActivityResult
    public final void onActivityResult(int i7, Intent intent) {
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor2;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor3;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor4;
        ExtendFeature extendFeature;
        int i10 = a.f42345a;
        String msg = "resultCode : " + i7;
        Intrinsics.checkNotNullParameter("Liveness", "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        LiveID$ILiveIDListener liveID$ILiveIDListener = this.f41231a;
        String str = this.f41233c;
        AuthenticationRequest authenticationRequest = this.f41232b;
        if (i7 == -1) {
            LiveIDResult<LiveSelfieResult> liveIDResultResultFromBundle = FaceCaptureActivity.f23821i.resultFromBundle(intent != null ? intent.getExtras() : null);
            if (liveIDResultResultFromBundle instanceof LiveIDResult.Success) {
                CheckResponse checkResponse = ((LiveSelfieResult) ((LiveIDResult.Success) liveIDResultResultFromBundle).f23817a).f23818a;
                liveID$ILiveIDListener.onCompleted(checkResponse, checkResponse.getData().getTransactionId());
                String json = new Gson().toJson(p.f41245l);
                r6.a aVar = p.f41237d;
                if (aVar != null && (liveID$ILiveIDMonitor4 = aVar.f41573e) != null) {
                    d dVar = e.f43079g;
                    String str2 = dVar.f43071a;
                    Pair pair = new Pair("event_desc", dVar.f43072b);
                    Integer scene = authenticationRequest.getScene();
                    Pair pair2 = new Pair("scene", Integer.valueOf(scene != null ? scene.intValue() : -1));
                    Pair pair3 = new Pair("code", "1");
                    Pair pair4 = new Pair("msg", "success");
                    Pair pair5 = new Pair("transactionId", str);
                    String str3 = p.f41242i;
                    Pair pair6 = new Pair("uuid", str3 != null ? str3 : "");
                    r6.a aVar2 = p.f41237d;
                    liveID$ILiveIDMonitor4.report(str2, G.h(pair, pair2, pair3, pair4, pair5, pair6, new Pair("holdOnPath", (aVar2 == null || (extendFeature = aVar2.f41587s) == null) ? null : extendFeature.getHoldOnFacingDetect()), new Pair("reason", json)));
                }
            } else if (liveIDResultResultFromBundle instanceof LiveIDResult.Error) {
                String json2 = new Gson().toJson(p.f41245l);
                LiveIDResult.Error error = (LiveIDResult.Error) liveIDResultResultFromBundle;
                Throwable th = error.f23816a;
                boolean z3 = th instanceof LiveIDException;
                Throwable th2 = error.f23816a;
                if (z3) {
                    liveID$ILiveIDListener.onInterrupted(((LiveIDException) th).getCode(), ((LiveIDException) th2).getMsg(), ((LiveIDException) th2).getAddition());
                    r6.a aVar3 = p.f41237d;
                    if (aVar3 != null && (liveID$ILiveIDMonitor3 = aVar3.f41573e) != null) {
                        d dVar2 = e.f43079g;
                        String str4 = dVar2.f43071a;
                        Pair pair7 = new Pair("event_desc", dVar2.f43072b);
                        Integer scene2 = authenticationRequest.getScene();
                        Pair pair8 = new Pair("scene", Integer.valueOf(scene2 != null ? scene2.intValue() : -1));
                        Pair pair9 = new Pair("code", ((LiveIDException) th2).getCode());
                        String detail = ((LiveIDException) th2).getDetail();
                        if (detail == null) {
                            detail = ((LiveIDException) th2).getMsg();
                        }
                        Pair pair10 = new Pair("msg", detail);
                        String str5 = p.f41242i;
                        liveID$ILiveIDMonitor3.report(str4, G.h(pair7, pair8, pair9, pair10, new Pair("uuid", str5 != null ? str5 : ""), new Pair("transactionId", str), new Pair("reason", json2)));
                    }
                } else {
                    f fVar = f.f1629j;
                    liveID$ILiveIDListener.onInterrupted(fVar.f1633a, fVar.f1634b, null);
                    r6.a aVar4 = p.f41237d;
                    if (aVar4 != null && (liveID$ILiveIDMonitor2 = aVar4.f41573e) != null) {
                        d dVar3 = e.f43079g;
                        String str6 = dVar3.f43071a;
                        Pair pair11 = new Pair("event_desc", dVar3.f43072b);
                        Integer scene3 = authenticationRequest.getScene();
                        Pair pair12 = new Pair("scene", Integer.valueOf(scene3 != null ? scene3.intValue() : -1));
                        Pair pair13 = new Pair("code", "-99");
                        String message = th2.getMessage();
                        if (message == null) {
                            message = "Unknown";
                        }
                        Pair pair14 = new Pair("msg", message);
                        Pair pair15 = new Pair("transactionId", str);
                        String str7 = p.f41242i;
                        liveID$ILiveIDMonitor2.report(str6, G.h(pair11, pair12, pair13, pair14, pair15, new Pair("uuid", str7 != null ? str7 : ""), new Pair("reason", json2)));
                    }
                }
            }
        } else {
            f fVar2 = f.f1628i;
            String str8 = fVar2.f1633a;
            String str9 = fVar2.f1634b;
            liveID$ILiveIDListener.onInterrupted(str8, str9, null);
            String json3 = new Gson().toJson(p.f41245l);
            r6.a aVar5 = p.f41237d;
            if (aVar5 != null && (liveID$ILiveIDMonitor = aVar5.f41573e) != null) {
                d dVar4 = e.f43079g;
                String str10 = dVar4.f43071a;
                Pair pair16 = new Pair("event_desc", dVar4.f43072b);
                Integer scene4 = authenticationRequest.getScene();
                Pair pair17 = new Pair("scene", Integer.valueOf(scene4 != null ? scene4.intValue() : -1));
                Pair pair18 = new Pair("code", fVar2.f1633a);
                Pair pair19 = new Pair("msg", str9);
                Pair pair20 = new Pair("transactionId", str);
                String str11 = p.f41242i;
                if (str11 == null) {
                    str11 = "";
                }
                liveID$ILiveIDMonitor.report(str10, G.h(pair16, pair17, pair18, pair19, pair20, new Pair("uuid", str11), new Pair("reason", json3)));
            }
        }
        p.f41245l.reset();
    }
}
