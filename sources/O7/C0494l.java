package O7;

import android.animation.Animator;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenStackFragment;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: O7.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0494l implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenStackFragment f6669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f6670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC0491i f6671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EnumC0493k f6672d;

    static {
        new C0492j(null);
    }

    public C0494l(ScreenStackFragment wrapper, s sVar, EnumC0491i animationType) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        this.f6669a = wrapper;
        this.f6670b = sVar;
        this.f6671c = animationType;
        this.f6672d = EnumC0493k.f6665a;
    }

    public final void a() {
        EnumC0493k enumC0493k;
        int iOrdinal = this.f6672d.ordinal();
        if (iOrdinal == 0) {
            enumC0493k = EnumC0493k.f6666b;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new p355xf.l();
            }
            enumC0493k = EnumC0493k.f6667c;
        }
        this.f6672d = enumC0493k;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.f6672d == EnumC0493k.f6666b) {
            a();
            animation.removeListener(this);
            EnumC0491i enumC0491i = this.f6671c;
            int iOrdinal = enumC0491i.ordinal();
            s sVar = this.f6670b;
            Screen screen = sVar.f6673a;
            if (iOrdinal == 0) {
                EventDispatcher reactEventDispatcher = screen.getReactEventDispatcher();
                if (reactEventDispatcher != null) {
                    reactEventDispatcher.dispatchEvent(new C0496n(UIManagerHelper.getSurfaceId(screen), screen.getId()));
                    Unit unit = Unit.f38893a;
                }
            } else {
                if (iOrdinal != 1) {
                    throw new p355xf.l();
                }
                EventDispatcher reactEventDispatcher2 = screen.getReactEventDispatcher();
                if (reactEventDispatcher2 != null) {
                    reactEventDispatcher2.dispatchEvent(new p(UIManagerHelper.getSurfaceId(screen), screen.getId()));
                    Unit unit2 = Unit.f38893a;
                }
            }
            boolean z3 = enumC0491i == EnumC0491i.f6663b;
            sVar.a(1.0f, z3, z3);
            Screen screen2 = this.f6669a.getScreen();
            if (screen2.isBeingRemoved) {
                screen2.isBeingRemoved = false;
                Screen.b(screen2);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Screen screen;
        EventDispatcher reactEventDispatcher;
        Screen screen2;
        EventDispatcher reactEventDispatcher2;
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.f6672d == EnumC0493k.f6665a) {
            a();
            EnumC0491i enumC0491i = this.f6671c;
            int iOrdinal = enumC0491i.ordinal();
            s sVar = this.f6670b;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new p355xf.l();
                }
                if (sVar != null && (reactEventDispatcher2 = (screen2 = sVar.f6673a).getReactEventDispatcher()) != null) {
                    reactEventDispatcher2.dispatchEvent(new y(UIManagerHelper.getSurfaceId(screen2), screen2.getId()));
                    Unit unit = Unit.f38893a;
                }
            } else if (sVar != null && (reactEventDispatcher = (screen = sVar.f6673a).getReactEventDispatcher()) != null) {
                reactEventDispatcher.dispatchEvent(new w(UIManagerHelper.getSurfaceId(screen), screen.getId()));
                Unit unit2 = Unit.f38893a;
            }
            boolean z3 = enumC0491i == EnumC0491i.f6663b;
            if (sVar != null) {
                sVar.a(0.0f, z3, z3);
            }
        }
    }
}
