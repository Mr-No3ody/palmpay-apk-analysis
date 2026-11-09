package G7;

import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Balloon f3127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View[] f3129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Balloon f3130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f3131f;

    public /* synthetic */ n(Balloon balloon, View view, View[] viewArr, Balloon balloon2, View view2, int i7) {
        this.f3126a = i7;
        this.f3127b = balloon;
        this.f3128c = view;
        this.f3129d = viewArr;
        this.f3130e = balloon2;
        this.f3131f = view2;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3126a) {
            case 0:
                Balloon balloon = this.f3127b;
                View view = this.f3128c;
                boolean zE = balloon.e(view);
                Boolean boolValueOf = Boolean.valueOf(zE);
                if (!zE) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    g gVar = balloon.f25223b;
                    gVar.getClass();
                    balloon.f25227f = true;
                    long j6 = gVar.f3075N;
                    if (j6 != -1) {
                        ((Handler) balloon.f25229i.getValue()).postDelayed((d) balloon.f25230j.getValue(), j6);
                    }
                    gVar.getClass();
                    boolean z3 = gVar.f3068G != null;
                    Bc.i iVar = balloon.f25224c;
                    if (z3) {
                        RadiusLayout radiusLayout = (RadiusLayout) iVar.f725c;
                        Intrinsics.checkNotNullExpressionValue(radiusLayout, "binding.balloonCard");
                        balloon.m(radiusLayout);
                    } else {
                        VectorTextView vectorTextView = (VectorTextView) iVar.f729g;
                        Intrinsics.checkNotNullExpressionValue(vectorTextView, "binding.balloonText");
                        RadiusLayout radiusLayout2 = (RadiusLayout) iVar.f725c;
                        Intrinsics.checkNotNullExpressionValue(radiusLayout2, "binding.balloonCard");
                        balloon.l(vectorTextView, radiusLayout2);
                    }
                    ((FrameLayout) iVar.f724b).measure(0, 0);
                    gVar.getClass();
                    PopupWindow popupWindow = balloon.f25225d;
                    popupWindow.setWidth(balloon.j());
                    popupWindow.setHeight(balloon.i());
                    ((VectorTextView) iVar.f729g).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    Balloon.c(view, balloon);
                    balloon.k();
                    Balloon.b(balloon);
                    gVar.getClass();
                    gVar.getClass();
                    Balloon.a(balloon);
                    ((FrameLayout) iVar.f726d).post(new e(balloon, 0));
                    Balloon balloon2 = this.f3130e;
                    PopupWindow popupWindow2 = balloon2.f25225d;
                    int i7 = balloon2.f25223b.f3083V;
                    View view2 = this.f3131f;
                    popupWindow2.showAsDropDown(view2, ((view2.getMeasuredWidth() / 2) - (balloon2.j() / 2)) * i7, 0);
                    break;
                }
                break;
            default:
                Balloon balloon3 = this.f3127b;
                View view3 = this.f3128c;
                boolean zE2 = balloon3.e(view3);
                Boolean boolValueOf2 = Boolean.valueOf(zE2);
                if (!zE2) {
                    boolValueOf2 = null;
                }
                if (boolValueOf2 != null) {
                    g gVar2 = balloon3.f25223b;
                    gVar2.getClass();
                    balloon3.f25227f = true;
                    long j10 = gVar2.f3075N;
                    if (j10 != -1) {
                        ((Handler) balloon3.f25229i.getValue()).postDelayed((d) balloon3.f25230j.getValue(), j10);
                    }
                    gVar2.getClass();
                    boolean z8 = gVar2.f3068G != null;
                    Bc.i iVar2 = balloon3.f25224c;
                    if (z8) {
                        RadiusLayout radiusLayout3 = (RadiusLayout) iVar2.f725c;
                        Intrinsics.checkNotNullExpressionValue(radiusLayout3, "binding.balloonCard");
                        balloon3.m(radiusLayout3);
                    } else {
                        VectorTextView vectorTextView2 = (VectorTextView) iVar2.f729g;
                        Intrinsics.checkNotNullExpressionValue(vectorTextView2, "binding.balloonText");
                        RadiusLayout radiusLayout4 = (RadiusLayout) iVar2.f725c;
                        Intrinsics.checkNotNullExpressionValue(radiusLayout4, "binding.balloonCard");
                        balloon3.l(vectorTextView2, radiusLayout4);
                    }
                    ((FrameLayout) iVar2.f724b).measure(0, 0);
                    gVar2.getClass();
                    PopupWindow popupWindow3 = balloon3.f25225d;
                    popupWindow3.setWidth(balloon3.j());
                    popupWindow3.setHeight(balloon3.i());
                    ((VectorTextView) iVar2.f729g).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    Balloon.c(view3, balloon3);
                    balloon3.k();
                    Balloon.b(balloon3);
                    gVar2.getClass();
                    gVar2.getClass();
                    Balloon.a(balloon3);
                    ((FrameLayout) iVar2.f726d).post(new e(balloon3, 0));
                    Balloon balloon4 = this.f3130e;
                    PopupWindow popupWindow4 = balloon4.f25225d;
                    int i10 = balloon4.f25223b.f3083V;
                    View view4 = this.f3131f;
                    popupWindow4.showAsDropDown(view4, ((view4.getMeasuredWidth() / 2) - (balloon4.j() / 2)) * i10, (-balloon4.i()) - view4.getMeasuredHeight());
                    break;
                }
                break;
        }
    }
}
