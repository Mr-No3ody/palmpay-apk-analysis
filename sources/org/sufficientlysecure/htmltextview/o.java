package org.sufficientlysecure.htmltextview;

import U2.B;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.chad.library.adapter.base.animation.BaseAnimation;
import com.didi.drouter.store.IRouterProxy;
import com.growingio.android.sdk.track.modelloader.ModelLoader;
import com.growingio.android.sdk.track.modelloader.ModelLoaderFactory;
import com.palmpay.lib.bridgewrapper.page.ChatBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.AudioDeviceWatchBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.RNExceptionHandlerBridge;
import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridgeV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements BaseAnimation, ModelLoaderFactory, TransitionFactory, IRouterProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41136a;

    public /* synthetic */ o(int i7) {
        this.f41136a = i7;
    }

    @Override // com.chad.library.adapter.base.animation.BaseAnimation
    public Animator[] animators(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationY", view.getMeasuredHeight(), 0.0f);
        animator.setDuration(400L);
        animator.setInterpolator(new DecelerateInterpolator(1.3f));
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        return new Animator[]{animator};
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition build(com.bumptech.glide.load.a aVar, boolean z3) {
        return com.bumptech.glide.request.transition.b.f21078a;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f41136a) {
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
        switch (this.f41136a) {
            case 5:
                return new ChatBridge();
            case 6:
                return new AudioDeviceWatchBridge();
            case 7:
                return new RNExceptionHandlerBridge();
            default:
                return new CreditHandleRouterBridgeV2();
        }
    }

    @Override // com.growingio.android.sdk.track.modelloader.ModelLoaderFactory
    public ModelLoader build() {
        return new V4.a();
    }
}
