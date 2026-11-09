package p262r2;

import U2.B;
import W4.a;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.chad.library.adapter.base.animation.BaseAnimation;
import com.didi.drouter.store.IRouterProxy;
import com.facebook.common.internal.Fn;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.request.d;
import com.growingio.android.sdk.track.modelloader.ModelLoader;
import com.growingio.android.sdk.track.modelloader.ModelLoaderFactory;
import com.palmpay.lib.bridgewrapper.page.PageCloseBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.AuthorizationBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.ScanCodeBridge;
import com.transsnet.palmpay.credit.rnbridge.CreditRouterBridge;
import io.reactivex.functions.Action;
import kotlin.jvm.internal.Intrinsics;
import p191mg.m;

/* JADX INFO: loaded from: classes.dex */
public class c implements MemoryTrimmableRegistry, BaseAnimation, ModelLoaderFactory, Fn, IRouterProxy, Action {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f41551b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41552a;

    public /* synthetic */ c(int i7) {
        this.f41552a = i7;
    }

    public static synchronized c a() {
        try {
            if (f41551b == null) {
                f41551b = new c(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f41551b;
    }

    @Override // com.chad.library.adapter.base.animation.BaseAnimation
    public Animator[] animators(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationX", -view.getRootView().getWidth(), 0.0f);
        animator.setDuration(400L);
        animator.setInterpolator(new DecelerateInterpolator(1.8f));
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        return new Animator[]{animator};
    }

    @Override // com.facebook.common.internal.Fn
    public Object apply(Object obj) {
        d dVar = (d) obj;
        if (dVar != null) {
            return dVar.getSourceUri();
        }
        return null;
    }

    public Signature[] b(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // com.growingio.android.sdk.track.modelloader.ModelLoaderFactory
    public ModelLoader build() {
        return new a(1);
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f41552a) {
            case 5:
                throw new B(11);
            case 6:
                throw new B(11);
            case 7:
                throw new B(11);
            default:
                throw new B(11);
        }
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f41552a) {
            case 5:
                return new PageCloseBridge();
            case 6:
                return new AuthorizationBridge();
            case 7:
                return new ScanCodeBridge();
            default:
                return new CreditRouterBridge();
        }
    }

    public String toString() {
        switch (this.f41552a) {
            case 9:
                return "EmptyAction";
            default:
                return super.toString();
        }
    }

    public c(m block) {
        this.f41552a = 10;
        Intrinsics.checkNotNullParameter(block, "block");
    }

    @Override // io.reactivex.functions.Action
    public void run() {
    }

    @Override // com.facebook.common.memory.MemoryTrimmableRegistry
    public void registerMemoryTrimmable(MemoryTrimmable memoryTrimmable) {
    }

    @Override // com.facebook.common.memory.MemoryTrimmableRegistry
    public void unregisterMemoryTrimmable(MemoryTrimmable memoryTrimmable) {
    }
}
