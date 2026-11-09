package p381za;

import android.content.res.Configuration;
import androidx.multidex.b;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends b {

    @NotNull
    public static final b Companion = new b(null);

    @NotNull
    public static final String UNKNOWN_PROCESS_NAME = "UNKNOWN";

    @NotNull
    private final Lazy isPrimaryProcessCached$delegate;

    @NotNull
    private final Lazy shortProcessName$delegate;

    public c() {
        final int i7 = 0;
        this.shortProcessName$delegate = C2131j.b(new Function0(this) { // from class: za.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f44515b;

            {
                this.f44515b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        String strO = p264r5.a.o();
                        if (strO != null) {
                            String strSubstring = strO.substring(this.f44515b.getPackageName().length());
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            if (strSubstring != null) {
                                return strSubstring;
                            }
                        }
                        return c.UNKNOWN_PROCESS_NAME;
                    default:
                        return Boolean.valueOf(Intrinsics.c(p264r5.a.o(), this.f44515b.getPackageName()));
                }
            }
        });
        final int i10 = 1;
        this.isPrimaryProcessCached$delegate = C2131j.b(new Function0(this) { // from class: za.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f44515b;

            {
                this.f44515b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        String strO = p264r5.a.o();
                        if (strO != null) {
                            String strSubstring = strO.substring(this.f44515b.getPackageName().length());
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            if (strSubstring != null) {
                                return strSubstring;
                            }
                        }
                        return c.UNKNOWN_PROCESS_NAME;
                    default:
                        return Boolean.valueOf(Intrinsics.c(p264r5.a.o(), this.f44515b.getPackageName()));
                }
            }
        });
    }

    public abstract boolean canDispatchSystemMemoryCallbacks();

    public final boolean isPrimaryProcessCached() {
        return ((Boolean) this.isPrimaryProcessCached$delegate.getValue()).booleanValue();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (isPrimaryProcessCached()) {
            onPrimaryConfigurationChanged(newConfig);
        } else {
            onSecondaryConfigurationChanged((String) this.shortProcessName$delegate.getValue(), newConfig);
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        if (isPrimaryProcessCached()) {
            onPrimaryCreate();
        } else {
            onSecondaryCreate((String) this.shortProcessName$delegate.getValue());
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        if (canDispatchSystemMemoryCallbacks()) {
            super.onLowMemory();
            if (isPrimaryProcessCached()) {
                onPrimaryLowMemory();
            } else {
                onSecondaryLowMemory((String) this.shortProcessName$delegate.getValue());
            }
        }
    }

    public abstract void onPrimaryConfigurationChanged(Configuration configuration);

    public abstract void onPrimaryCreate();

    public void onSecondaryConfigurationChanged(@NotNull String name, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
    }

    public abstract void onSecondaryCreate(String str);

    public void onSecondaryLowMemory(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public void onSecondaryTrimMemory(@NotNull String name, int i7) {
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (canDispatchSystemMemoryCallbacks()) {
            super.onTrimMemory(i7);
            if (isPrimaryProcessCached()) {
                onPrimaryTrimMemory(i7);
            } else {
                onSecondaryTrimMemory((String) this.shortProcessName$delegate.getValue(), i7);
            }
        }
    }

    public void onPrimaryLowMemory() {
    }

    public void onPrimaryTrimMemory(int i7) {
    }
}
