package Z4;

import C0.G;
import U2.B;
import android.content.Context;
import android.util.Log;
import com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy;
import com.didi.drouter.store.IRouterProxy;
import com.facebook.fresco.animation.drawable.AnimationListener;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.facebook.soloader.ElfByteChannel;
import com.facebook.soloader.SoFileLoader;
import com.growingio.android.sdk.Configurable;
import com.palmpay.lib.bridgewrapper.page.RouterBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.CashierBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.SendEventBridge;
import com.transsnet.palmpay.credit.rnbridge.LoanCreditApplyBridge;
import io.reactivex.functions.Function;
import java.util.logging.Level;
import org.greenrobot.eventbus.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Configurable, AnimationListener, Logger, SoFileLoader, IRouterProxy, Function, GlideExecutor$UncaughtThrowableStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11509a;

    public /* synthetic */ a(int i7) {
        this.f11509a = i7;
    }

    public static int a(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue < 800) {
            return iIntValue < 500 ? 2 : 3;
        }
        if (iIntValue < 900) {
            return 4;
        }
        return iIntValue < 1000 ? 5 : 6;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f11509a) {
            case 6:
                throw new B(11);
            case 7:
                throw new B(11);
            case 8:
                throw new B(11);
            default:
                throw new B(11);
        }
    }

    @Override // com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy
    public void handle(Throwable th) {
        if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
            return;
        }
        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
    }

    @Override // com.facebook.soloader.SoFileLoader
    public void load(String str, int i7) {
        System.load(str);
    }

    @Override // com.facebook.soloader.SoFileLoader
    public void loadBytes(String str, ElfByteChannel elfByteChannel, int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // org.greenrobot.eventbus.Logger
    public void log(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(a(level), "EventBus", str);
        }
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f11509a) {
            case 6:
                return new RouterBridge();
            case 7:
                return new CashierBridge();
            case 8:
                return new SendEventBridge();
            default:
                return new LoanCreditApplyBridge();
        }
    }

    public String toString() {
        switch (this.f11509a) {
            case 10:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }

    @Override // org.greenrobot.eventbus.Logger
    public void log(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            int iA = a(level);
            StringBuilder sbT = G.t(str, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            sbT.append(Log.getStackTraceString(th));
            Log.println(iA, "EventBus", sbT.toString());
        }
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        return obj;
    }

    @Override // com.facebook.fresco.animation.drawable.AnimationListener
    public void onAnimationRepeat(P2.a aVar) {
    }

    @Override // com.facebook.fresco.animation.drawable.AnimationListener
    public void onAnimationReset(P2.a aVar) {
    }

    @Override // com.facebook.fresco.animation.drawable.AnimationListener
    public void onAnimationStart(P2.a aVar) {
    }

    @Override // com.facebook.fresco.animation.drawable.AnimationListener
    public void onAnimationStop(P2.a aVar) {
    }

    @Override // com.facebook.fresco.animation.drawable.AnimationListener
    public void onAnimationFrame(P2.a aVar, int i7) {
    }
}
