package com.transsnet.palmpay.core.rnbridge.bridge;

import Pa.F;
import android.app.Activity;
import android.content.Intent;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridgewrapper.page.RouterBridge;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/page/open"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J \u0010\u0010\u001a\u00020\u000e2\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH\u0002J \u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\nH\u0002J(\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH\u0002¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/PPRouterBridge;", "Lcom/palmpay/lib/bridgewrapper/page/RouterBridge;", "<init>", "()V", "gotoPage", "", "path", "", "params", "", "", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "isReservedParam", "", "key", "shouldCloseCurrent", "putExtraSafely", "intent", "Landroid/content/Intent;", "value", "applyStartFlags", "Companion", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPPRouterBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PPRouterBridge.kt\ncom/transsnet/palmpay/core/rnbridge/bridge/PPRouterBridge\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,117:1\n216#2,2:118\n*S KotlinDebug\n*F\n+ 1 PPRouterBridge.kt\ncom/transsnet/palmpay/core/rnbridge/bridge/PPRouterBridge\n*L\n28#1:118,2\n*E\n"})
public final class PPRouterBridge extends RouterBridge {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String PARAM_ACTIVITY_START_TYPE = "startType";

    @Deprecated
    @NotNull
    public static final String PARAM_CLOSE_CURRENT = "closeCurrent";

    @Deprecated
    @NotNull
    public static final String START_TYPE_CLEAR_TOP = "clear_top";

    @Deprecated
    @NotNull
    public static final String START_TYPE_NEW_TASK = "new_task";

    @Deprecated
    @NotNull
    public static final String START_TYPE_NEW_TASK_CLEAR_TASK = "new_task_clear_task";

    @Deprecated
    @NotNull
    public static final String START_TYPE_SINGLE_TOP = "single_top";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/PPRouterBridge$Companion;", "", "<init>", "()V", "PARAM_ACTIVITY_START_TYPE", "", "PARAM_CLOSE_CURRENT", "START_TYPE_NEW_TASK", "START_TYPE_CLEAR_TOP", "START_TYPE_SINGLE_TOP", "START_TYPE_NEW_TASK_CLEAR_TASK", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void applyStartFlags(Intent intent, Map<String, ? extends Object> params) {
        String strK;
        String string;
        if (params == null || params.isEmpty()) {
            return;
        }
        Object obj = params.get(PARAM_ACTIVITY_START_TYPE);
        if (obj == null || (string = obj.toString()) == null) {
            strK = null;
        } else {
            String lowerCase = string.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                strK = y.k(lowerCase, "-", "_");
            } else {
                strK = null;
            }
        }
        if (strK != null) {
            switch (strK.hashCode()) {
                case -1270564765:
                    if (strK.equals(START_TYPE_CLEAR_TOP)) {
                        Intrinsics.checkNotNullExpressionValue(intent.addFlags(67108864), "addFlags(...)");
                        return;
                    }
                    break;
                case -560084334:
                    if (strK.equals(START_TYPE_NEW_TASK_CLEAR_TASK)) {
                        intent.addFlags(268435456);
                        Intrinsics.e(intent.addFlags(32768));
                        return;
                    }
                    break;
                case 913969374:
                    if (strK.equals(START_TYPE_SINGLE_TOP)) {
                        Intrinsics.checkNotNullExpressionValue(intent.addFlags(536870912), "addFlags(...)");
                        return;
                    }
                    break;
                case 1377323204:
                    if (strK.equals(START_TYPE_NEW_TASK)) {
                        Intrinsics.checkNotNullExpressionValue(intent.addFlags(268435456), "addFlags(...)");
                        return;
                    }
                    break;
            }
        }
        Unit unit = Unit.f38893a;
    }

    private final boolean isReservedParam(String key) {
        return Intrinsics.c(key, PARAM_ACTIVITY_START_TYPE) || Intrinsics.c(key, PARAM_CLOSE_CURRENT);
    }

    private final void putExtraSafely(Intent intent, String key, Object value) {
        Intent intentPutExtra;
        try {
            if (value instanceof Boolean) {
                intentPutExtra = intent.putExtra(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                intentPutExtra = intent.putExtra(key, ((Number) value).intValue());
            } else if (value instanceof Long) {
                intentPutExtra = intent.putExtra(key, ((Number) value).longValue());
            } else if (value instanceof Float) {
                intentPutExtra = intent.putExtra(key, ((Number) value).floatValue());
            } else if (value instanceof Double) {
                intentPutExtra = intent.putExtra(key, ((Number) value).doubleValue());
            } else {
                intentPutExtra = (!(value instanceof Number) && (value instanceof String)) ? intent.putExtra(key, (String) value) : intent.putExtra(key, value.toString());
            }
            Intrinsics.e(intentPutExtra);
        } catch (Throwable unused) {
        }
    }

    private final boolean shouldCloseCurrent(Map<String, ? extends Object> params) {
        Object obj;
        if (params != null && (obj = params.get(PARAM_CLOSE_CURRENT)) != null) {
            if (obj instanceof Number) {
                return ((Number) obj).intValue() == 1;
            }
            if (obj instanceof String) {
                return obj.equals("1");
            }
        }
        return false;
    }

    @Override // com.palmpay.lib.bridgewrapper.page.RouterBridge
    public void gotoPage(@NotNull String path, @Nullable Map<String, ? extends Object> params, @Nullable IBridgeCallback callback) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intent intentA = F.a(getActivity(), path);
        if (intentA == null) {
            return;
        }
        applyStartFlags(intentA, params);
        if (params != null) {
            for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!isReservedParam(key) && value != null) {
                    putExtraSafely(intentA, key, value);
                }
            }
        }
        ActivityUtils.startActivity(F.l(intentA));
        if (shouldCloseCurrent(params)) {
            try {
                Activity activity = getActivity();
                if (activity != null) {
                    activity.finish();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
