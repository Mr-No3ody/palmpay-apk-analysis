package p335w5;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.growingio.android.sdk.track.log.ILogger;
import com.microsoft.codepush.react.CodePushConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p198n5.g;
import p198n5.h;
import p294tb.RunnableC2060w;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Handler f43268d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile com.google.firebase.crashlytics.internal.concurrency.b f43269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p198n5.b f43270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RunnableC2060w f43271c = new RunnableC2060w(this, 4);

    public b() {
        ILogger iLogger = (ILogger) h.f39849b.get("CacheLogger");
        if (iLogger instanceof p198n5.b) {
            this.f43270b = (p198n5.b) iLogger;
        }
    }

    public final void a() {
        List list;
        String str;
        if (Looper.myLooper() != f43268d.getLooper()) {
            f43268d.post(this.f43271c);
            return;
        }
        p198n5.b bVar = this.f43270b;
        if (bVar != null) {
            synchronized (bVar) {
                if (bVar.f39835a.isEmpty()) {
                    list = Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList = new ArrayList(bVar.f39835a.size());
                    arrayList.addAll(bVar.f39835a);
                    bVar.f39835a.clear();
                    list = arrayList;
                }
            }
            if (list != null && !list.isEmpty() && this.f43269a != null) {
                ArrayList<a> arrayList2 = new ArrayList(list.size());
                for (int i7 = 0; i7 < list.size(); i7++) {
                    g gVar = (g) list.get(i7);
                    switch (gVar.f39845a) {
                        case 2:
                            str = "VERBOSE";
                            break;
                        case 3:
                            str = "DEBUG";
                            break;
                        case 4:
                            str = "INFO";
                            break;
                        case 5:
                            str = "WARN";
                            break;
                        case 6:
                            str = "ERROR";
                            break;
                        case 7:
                            str = "ALARM";
                            break;
                        default:
                            str = "OTHER";
                            break;
                    }
                    arrayList2.add(new a(str, gVar.f39846b, gVar.f39847c));
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("msgType", "logger_data");
                    jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "3.3.6");
                    JSONArray jSONArray = new JSONArray();
                    for (a aVar : arrayList2) {
                        aVar.getClass();
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("type", aVar.f43265a);
                            jSONObject2.put("subType", "subType");
                            jSONObject2.put("message", aVar.f43266b);
                            jSONObject2.put(CodePushConstants.LATEST_ROLLBACK_TIME_KEY, aVar.f43267c);
                        } catch (JSONException unused) {
                        }
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONArray);
                } catch (JSONException unused2) {
                }
                this.f43269a.disposeLog(jSONObject.toString());
            }
        }
        f43268d.removeCallbacks(this.f43271c);
        f43268d.postDelayed(this.f43271c, 500L);
    }
}
