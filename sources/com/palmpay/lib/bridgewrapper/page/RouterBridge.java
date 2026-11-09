package com.palmpay.lib.bridgewrapper.page;

import android.os.Bundle;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.RouterSyncBridge;
import com.palmpay.lib.bridge.param.PathParam;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import io.fastkv.n;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/page/open"}, function = {IBridge.class})
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J \u0010\r\u001a\u00020\u000e2\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH\u0002J\u001c\u0010\u000f\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014¨\u0006\u0010"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/page/RouterBridge;", "Lcom/palmpay/lib/bridge/RouterSyncBridge;", "Lcom/palmpay/lib/bridge/param/PathParam;", "()V", "gotoPage", "", "path", "", "params", "", "", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "mapToBundle", "Landroid/os/Bundle;", "onHandle", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class RouterBridge extends RouterSyncBridge<PathParam> {
    private final Bundle mapToBundle(Map<String, ? extends Object> params) {
        Bundle bundle = new Bundle();
        if (params != null) {
            for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    bundle.putString(key, (String) value);
                } else if (value instanceof Integer) {
                    bundle.putInt(key, ((Number) value).intValue());
                } else if (value instanceof Boolean) {
                    bundle.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Float) {
                    bundle.putFloat(key, ((Number) value).floatValue());
                } else if (value instanceof Double) {
                    bundle.putDouble(key, ((Number) value).doubleValue());
                } else if (value instanceof Long) {
                    bundle.putLong(key, ((Number) value).longValue());
                } else if (value instanceof Bundle) {
                    bundle.putBundle(key, (Bundle) value);
                } else if (value instanceof Serializable) {
                    bundle.putSerializable(key, (Serializable) value);
                }
            }
        }
        return bundle;
    }

    public void gotoPage(@NotNull String path, @Nullable Map<String, ? extends Object> params, @Nullable IBridgeCallback callback) {
        Intrinsics.checkNotNullParameter(path, "path");
        n.P(getActivity(), path, mapToBundle(params), KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP);
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable PathParam params, @Nullable IBridgeCallback callback) {
        Unit unit;
        Unit unit2;
        if (params != null) {
            String path = params.getPath();
            if (path != null) {
                gotoPage(path, params.getParams(), callback);
                unit2 = Unit.f38893a;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                BaseBridge.handleIllegalArgument$default(this, null, 1, null);
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
