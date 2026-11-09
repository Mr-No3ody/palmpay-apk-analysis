package p265r7;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.google.firebase.messaging.Constants;
import com.reactnativecommunity.webview.RNCWebView;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActionMode.Callback f41607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RNCWebView f41608b;

    public d(RNCWebView rNCWebView, ActionMode.Callback callback) {
        this.f41608b = rNCWebView;
        this.f41607a = callback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.f41608b.evaluateJavascript("(function(){return {selection: window.getSelection().toString()} })()", new c(this, menuItem, Arguments.createMap(), actionMode));
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        int i7 = 0;
        while (true) {
            RNCWebView rNCWebView = this.f41608b;
            if (i7 >= rNCWebView.f24682w.size()) {
                return true;
            }
            menu.add(0, i7, i7, (CharSequence) ((Map) rNCWebView.f24682w.get(i7)).get(Constants.ScionAnalytics.PARAM_LABEL));
            i7++;
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        ActionMode.Callback callback = this.f41607a;
        if (callback instanceof ActionMode.Callback2) {
            ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
        } else {
            super.onGetContentRect(actionMode, view, rect);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
