package com.palmpay.lib.bridgewrapper.statusbar;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.annotation.RequiresApi;
import com.didi.drouter.annotation.Service;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/statusBar/setTheme"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0015J\u001a\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/statusbar/StatusBarThemeBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/palmpay/lib/bridgewrapper/statusbar/ThemeParam;", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "setSystemBarTheme", "pActivity", "Landroid/app/Activity;", "pIsDark", "", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StatusBarThemeBridge extends SyncBridge<ThemeParam> {
    @RequiresApi(23)
    public final void setSystemBarTheme(@Nullable Activity pActivity, boolean pIsDark) {
        int iIntValue;
        Window window;
        Window window2;
        View decorView;
        Integer numValueOf = null;
        Integer numValueOf2 = (pActivity == null || (window2 = pActivity.getWindow()) == null || (decorView = window2.getDecorView()) == null) ? null : Integer.valueOf(decorView.getSystemUiVisibility());
        View decorView2 = (pActivity == null || (window = pActivity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView2 == null) {
            return;
        }
        if (pIsDark) {
            if (numValueOf2 != null) {
                iIntValue = numValueOf2.intValue() & (-8193);
                numValueOf = Integer.valueOf(iIntValue);
            }
        } else if (numValueOf2 != null) {
            iIntValue = numValueOf2.intValue() | UserMetadata.MAX_INTERNAL_KEY_SIZE;
            numValueOf = Integer.valueOf(iIntValue);
        }
        Intrinsics.e(numValueOf);
        decorView2.setSystemUiVisibility(numValueOf.intValue());
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    @RequiresApi(23)
    public void onHandle(@Nullable ThemeParam params, @Nullable IBridgeCallback callback) {
        Unit unit;
        if (params != null) {
            try {
                setSystemBarTheme(getActivity(), "white".equals(params.getTheme()));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            unit = Unit.f38893a;
        } else {
            unit = null;
        }
        if (unit == null) {
            BaseBridge.handleIllegalArgument$default(this, null, 1, null);
        }
    }
}
