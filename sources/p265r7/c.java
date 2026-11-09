package p265r7;

import android.view.ActionMode;
import android.view.MenuItem;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.Constants;
import com.reactnativecommunity.webview.RNCWebView;
import com.reactnativecommunity.webview.RNCWebViewWrapper;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p281s7.d;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MenuItem f41603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WritableMap f41604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionMode f41605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f41606d;

    public c(d dVar, MenuItem menuItem, WritableMap writableMap, ActionMode actionMode) {
        this.f41606d = dVar;
        this.f41603a = menuItem;
        this.f41604b = writableMap;
        this.f41605c = actionMode;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String string;
        String str = (String) obj;
        RNCWebView rNCWebView = this.f41606d.f41608b;
        Map map = (Map) rNCWebView.f24682w.get(this.f41603a.getItemId());
        String str2 = (String) map.get(Constants.ScionAnalytics.PARAM_LABEL);
        WritableMap writableMap = this.f41604b;
        writableMap.putString(Constants.ScionAnalytics.PARAM_LABEL, str2);
        writableMap.putString("key", (String) map.get("key"));
        try {
            string = new JSONObject(str).getString("selection");
        } catch (JSONException unused) {
            string = "";
        }
        writableMap.putString("selectedText", string);
        rNCWebView.a(rNCWebView, new d(writableMap, RNCWebViewWrapper.f24683b.getReactTagFromWebView(rNCWebView)));
        this.f41605c.finish();
    }
}
