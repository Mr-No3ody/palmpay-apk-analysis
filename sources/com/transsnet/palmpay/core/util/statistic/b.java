package com.transsnet.palmpay.core.util.statistic;

import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.util.NetworkUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28193a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f28195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f28196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28197e;

    public /* synthetic */ b(long j6, String str, String str2, String str3) {
        this.f28194b = str;
        this.f28196d = str2;
        this.f28197e = str3;
        this.f28195c = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28193a) {
            case 0:
                AutoTrackHelper.lambda$trackActivityShowTime$2(this.f28194b, (HashMap) this.f28196d, this.f28195c, (JSONObject) this.f28197e);
                break;
            default:
                String str = this.f28194b;
                String str2 = (String) this.f28196d;
                String str3 = (String) this.f28197e;
                long j6 = this.f28195c;
                try {
                    Trace traceNewTrace = FirebasePerformance.getInstance().newTrace("NetworkError");
                    traceNewTrace.start();
                    traceNewTrace.putAttribute("error", str);
                    traceNewTrace.putAttribute("host", str2);
                    traceNewTrace.putAttribute("path", str3);
                    traceNewTrace.putAttribute("hasNetwork", String.valueOf(NetworkUtils.isConnected()));
                    traceNewTrace.putMetric(CodePushConstants.LATEST_ROLLBACK_TIME_KEY, j6);
                    traceNewTrace.stop();
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }

    public /* synthetic */ b(String str, HashMap map, long j6, JSONObject jSONObject) {
        this.f28194b = str;
        this.f28196d = map;
        this.f28195c = j6;
        this.f28197e = jSONObject;
    }
}
