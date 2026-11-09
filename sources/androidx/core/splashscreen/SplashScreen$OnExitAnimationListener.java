package androidx.core.splashscreen;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p044d0.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"androidx/core/splashscreen/SplashScreen$OnExitAnimationListener", "", "Ld0/a;", "splashScreenViewProvider", "", "onSplashScreenExit", "(Ld0/a;)V", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SplashScreen$OnExitAnimationListener {
    @MainThread
    void onSplashScreenExit(@NotNull a splashScreenViewProvider);
}
