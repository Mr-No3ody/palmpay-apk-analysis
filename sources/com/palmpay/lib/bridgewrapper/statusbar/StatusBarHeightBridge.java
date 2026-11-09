package com.palmpay.lib.bridgewrapper.statusbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/statusBar/getHeight"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0003J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u001a\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¨\u0006\u000f"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/statusbar/StatusBarHeightBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Ljava/lang/Void;", "()V", "getStatusBarHeight", "", "context", "Landroid/content/Context;", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "px2dp", "pxValue", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StatusBarHeightBridge extends SyncBridge<Void> {
    @SuppressLint({"InternalInsetResource", "DiscouragedApi"})
    private final int getStatusBarHeight(Context context) {
        Context applicationContext;
        Resources resources;
        DisplayMetrics displayMetrics;
        Context applicationContext2;
        Resources resources2;
        try {
            int identifier = Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = (context == null || (applicationContext2 = context.getApplicationContext()) == null || (resources2 = applicationContext2.getResources()) == null) ? 0 : resources2.getDimensionPixelSize(identifier);
                int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
                if (dimensionPixelSize2 >= dimensionPixelSize && Build.VERSION.SDK_INT < 29) {
                    return dimensionPixelSize2;
                }
                float f10 = (dimensionPixelSize * Resources.getSystem().getDisplayMetrics().density) / ((context == null || (applicationContext = context.getApplicationContext()) == null || (resources = applicationContext.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density);
                return (int) (f10 >= 0.0f ? f10 + 0.5f : f10 - 0.5f);
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }

    private final int px2dp(Context context, int pxValue) {
        Resources resources;
        DisplayMetrics displayMetrics;
        if (context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 0;
        }
        return (int) ((pxValue / displayMetrics.density) + 0.5f);
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable Void params, @Nullable IBridgeCallback callback) {
        BaseBridge.handleSuccess$default(this, Integer.valueOf(px2dp(getActivity(), getStatusBarHeight(getActivity()))), null, 2, null);
    }
}
