package Uc;

import android.animation.Animator;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Uc.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0652d0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9631c;

    public /* synthetic */ C0652d0(int i7, Object obj, Object obj2) {
        this.f9629a = i7;
        this.f9630b = obj;
        this.f9631c = obj2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f9629a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f9629a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                p220oa.h.d(MapPage.o((MapPage) this.f9630b));
                ((C0654e0) this.f9631c).f9639f = true;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((C0654e0) this.f9631c).f9639f = true;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        switch (this.f9629a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            default:
                androidx.swiperefreshlayout.widget.c cVar = (androidx.swiperefreshlayout.widget.c) this.f9630b;
                androidx.swiperefreshlayout.widget.b bVar = (androidx.swiperefreshlayout.widget.b) this.f9631c;
                cVar.a(1.0f, bVar, true);
                bVar.f17880k = bVar.f17874e;
                bVar.f17881l = bVar.f17875f;
                bVar.f17882m = bVar.f17876g;
                bVar.a((bVar.f17879j + 1) % bVar.f17878i.length);
                if (!cVar.f17898f) {
                    cVar.f17897e += 1.0f;
                } else {
                    cVar.f17898f = false;
                    animation.cancel();
                    animation.setDuration(1332L);
                    animation.start();
                    if (bVar.f17883n) {
                        bVar.f17883n = false;
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        switch (this.f9629a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((C0654e0) this.f9631c).f9639f = false;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                p220oa.h.C(MapPage.o((MapPage) this.f9630b));
                ((C0654e0) this.f9631c).f9639f = false;
                break;
            default:
                ((androidx.swiperefreshlayout.widget.c) this.f9630b).f17897e = 0.0f;
                break;
        }
    }

    public C0652d0(C0654e0 c0654e0, MapPage mapPage) {
        this.f9629a = 0;
        this.f9631c = c0654e0;
        this.f9630b = mapPage;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }
}
