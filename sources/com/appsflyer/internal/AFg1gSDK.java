package com.appsflyer.internal;

import C0.G;
import com.google.maps.android.BuildConfig;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\b'\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\fJ)\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0017\u0010\fJ)\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001a\u001a\u00020\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\b8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFg1gSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFg1cSDK;", "tag", "", "msg", "", "shouldRemoteDebug", "", "d", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", "", "throwable", "printMsg", "printThrowable", "shouldReportToExManager", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", "i", "v", "w", "p0", "getMonetizationNetwork", "(Ljava/lang/String;Lcom/appsflyer/internal/AFg1cSDK;)Ljava/lang/String;", "withTag$SDK_prodRelease", "shouldExtendMsg", "Z", "getShouldExtendMsg", "()Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAFLoggerBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFLoggerBase.kt\ncom/appsflyer/internal/logger/AFLoggerBase\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n*L\n1#1,69:1\n36#2:70\n*S KotlinDebug\n*F\n+ 1 AFLoggerBase.kt\ncom/appsflyer/internal/logger/AFLoggerBase\n*L\n61#1:70\n*E\n"})
public abstract class AFg1gSDK {
    public static long getCurrencyIso4217Code = System.currentTimeMillis();
    private final boolean shouldExtendMsg;

    public static /* synthetic */ void d$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z3, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i7 & 4) != 0) {
            z3 = true;
        }
        aFg1gSDK.d(aFg1cSDK, str, z3);
    }

    public static /* synthetic */ void e$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z3, boolean z8, boolean z10, boolean z11, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i7 & 8) != 0) {
            z3 = true;
        }
        if ((i7 & 16) != 0) {
            z8 = true;
        }
        if ((i7 & 32) != 0) {
            z10 = true;
        }
        if ((i7 & 64) != 0) {
            z11 = true;
        }
        aFg1gSDK.e(aFg1cSDK, str, th, z3, z8, z10, z11);
    }

    public static /* synthetic */ void i$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z3, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i7 & 4) != 0) {
            z3 = true;
        }
        aFg1gSDK.i(aFg1cSDK, str, z3);
    }

    public static /* synthetic */ void v$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z3, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i7 & 4) != 0) {
            z3 = true;
        }
        aFg1gSDK.v(aFg1cSDK, str, z3);
    }

    public static /* synthetic */ void w$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z3, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i7 & 4) != 0) {
            z3 = true;
        }
        aFg1gSDK.w(aFg1cSDK, str, z3);
    }

    @JvmOverloads
    public void d(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    @JvmOverloads
    public void e(@NotNull AFg1cSDK tag, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
    }

    public void force(@NotNull AFg1cSDK tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    @NotNull
    public final String getMonetizationNetwork(@Nullable String str, @NotNull AFg1cSDK aFg1cSDK) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        if (str == null || StringsKt.F(str)) {
            str = BuildConfig.TRAVIS;
        }
        String strWithTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1cSDK);
        if (!getShouldExtendMsg()) {
            return strWithTag$SDK_prodRelease;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - getCurrencyIso4217Code;
        String name = Thread.currentThread().getName();
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(jCurrentTimeMillis);
        sb2.append(") [");
        sb2.append(name);
        return G.r(sb2, "] ", strWithTag$SDK_prodRelease);
    }

    @JvmName(name = "getShouldExtendMsg")
    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    @JvmOverloads
    public void i(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    @JvmOverloads
    public void v(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    @JvmOverloads
    public void w(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    @NotNull
    public final String withTag$SDK_prodRelease(@NotNull String str, @NotNull AFg1cSDK aFg1cSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        return G.p("[", aFg1cSDK.getRevenue, "] ", str);
    }

    @JvmOverloads
    public final void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFg1cSDK, str, false, 4, null);
    }

    @JvmOverloads
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
    }

    @JvmOverloads
    public final void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFg1cSDK, str, false, 4, null);
    }

    @JvmOverloads
    public final void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFg1cSDK, str, false, 4, null);
    }

    @JvmOverloads
    public final void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFg1cSDK, str, false, 4, null);
    }

    @JvmOverloads
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z3) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, z3, false, false, false, HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR, null);
    }

    @JvmOverloads
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z3, boolean z8) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, z3, z8, false, false, 96, null);
    }

    @JvmOverloads
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z3, boolean z8, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, z3, z8, z10, false, 64, null);
    }
}
