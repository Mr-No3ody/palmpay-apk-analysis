package com.appsflyer.internal;

import android.os.SystemClock;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "Lcom/appsflyer/internal/AFh1qSDK;", "event", "", Constants.MessagePayloadKeys.RAW_DATA, "<init>", "(Lcom/appsflyer/internal/AFh1qSDK;[B)V", "", "afInfoLog", "()V", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFh1qSDK;", "getCurrencyIso4217Code", "getMediationNetwork", "[B"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFb1sSDK {

    @Nullable
    private final byte[] getMediationNetwork;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    private final AFh1qSDK getCurrencyIso4217Code;

    public AFb1sSDK(@NotNull AFh1qSDK aFh1qSDK, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        this.getCurrencyIso4217Code = aFh1qSDK;
        this.getMediationNetwork = bArr;
    }

    public final void afInfoLog() {
        try {
            Map map = AFa1jSDK.unregisterClient;
            Object declaredConstructor = map.get(-825330914);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1jSDK.getMonetizationNetwork(37 - Gravity.getAbsoluteGravity(0, 0), 88 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30602))).getDeclaredConstructor(null);
                map.put(-825330914, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(null);
            Object[] objArr = {this.getCurrencyIso4217Code, this.getMediationNetwork};
            Object method = map.get(489241852);
            if (method == null) {
                method = ((Class) AFa1jSDK.getMonetizationNetwork(38 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 89, (char) (30603 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))).getMethod("AFAdRevenueData", AFh1qSDK.class, byte[].class);
                map.put(489241852, method);
            }
            ((Method) method).invoke(objNewInstance, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
