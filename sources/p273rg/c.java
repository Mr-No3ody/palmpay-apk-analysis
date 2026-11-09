package p273rg;

import android.webkit.JavascriptInterface;
import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import java.util.List;
import mono.connect.kit.ConnectKitActivity;
import org.json.JSONException;
import org.json.JSONObject;
import p184m8.b;
import p284sb.C2016n;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static c f41984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f41985g = Arrays.asList("mono.connect.widget.closed", "mono.connect.widget.account_linked", "mono.modal.closed", "mono.modal.linked");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2016n f41986a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2016n f41987b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f41988c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f41989d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ConnectKitActivity f41990e;

    public static c a() {
        if (f41984f == null) {
            f41984f = new c();
        }
        return f41984f;
    }

    @JavascriptInterface
    public void postMessage(String str) throws JSONException {
        String str2;
        b bVar;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("type");
        JSONObject jSONObject2 = jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) ? jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) : null;
        JSONObject jSONObject3 = new JSONObject(str);
        String string2 = jSONObject3.getString("type");
        if (string2.equals("mono.connect.widget_opened")) {
            str2 = "OPENED";
        } else if (string2.equals("mono.connect.widget.account_linked")) {
            str2 = "SUCCESS";
        } else if (string2.equals("mono.connect.error_occured")) {
            str2 = "ERROR";
        } else if (string2.equals("mono.connect.institution_selected")) {
            str2 = "INSTITUTION_SELECTED";
        } else if (string2.equals("mono.connect.auth_method_switched")) {
            str2 = "AUTH_METHOD_SWITCHED";
        } else if (string2.equals("mono.connect.on_exit")) {
            str2 = "EXIT";
        } else if (string2.equals("mono.connect.login_attempt")) {
            str2 = "SUBMIT_CREDENTIALS";
        } else if (string2.equals("mono.connect.mfa_submitted")) {
            str2 = "SUBMIT_MFA";
        } else if (string2.equals("mono.connect.account_linked")) {
            str2 = "ACCOUNT_LINKED";
        } else {
            str2 = string2.equals("mono.connect.account_selected") ? "ACCOUNT_SELECTED" : p381za.c.UNKNOWN_PROCESS_NAME;
        }
        a aVar = new a(str2, jSONObject3.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) ? jSONObject3.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) : null);
        if (!f41985g.contains(string) && (bVar = this.f41988c) != null) {
            bVar.run(aVar);
        }
        string.getClass();
        if (!string.equals("mono.connect.widget.account_linked")) {
            if (string.equals("mono.connect.widget.closed")) {
                C2016n c2016n = this.f41987b;
                if (c2016n != null) {
                    c2016n.run();
                }
                this.f41990e.finish();
                return;
            }
            return;
        }
        String string3 = jSONObject2.getString("code");
        b bVar2 = new b();
        bVar2.f41983a = string3;
        C2016n c2016n2 = this.f41986a;
        if (c2016n2 != null) {
            c2016n2.run(bVar2);
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("timestamp", System.currentTimeMillis() / 1000);
                jSONObject4.put("code", string3);
                a aVar2 = new a("SUCCESS", jSONObject4);
                b bVar3 = a().f41988c;
                if (bVar3 != null) {
                    bVar3.run(aVar2);
                }
                this.f41987b.run();
                this.f41990e.finish();
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        this.f41990e.finish();
    }
}
