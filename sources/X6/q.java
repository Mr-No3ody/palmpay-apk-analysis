package X6;

import N8.C0463g;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f11045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f11046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0463g f11047d;

    public /* synthetic */ q(View view, r rVar, C0463g c0463g, int i7) {
        this.f11044a = i7;
        this.f11045b = view;
        this.f11046c = rVar;
        this.f11047d = c0463g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f11044a) {
            case 0:
                View view2 = this.f11045b;
                view2.setClickable(false);
                r rVar = this.f11046c;
                N6.d dVar = rVar.f11049e;
                if (dVar == null) {
                    Intrinsics.n("pickerBinding");
                    throw null;
                }
                this.f11047d.invoke(Integer.valueOf(dVar.f6095c.getOneWheelView().getCurrentItem()));
                rVar.dismiss();
                view2.postDelayed(new a(view2, 5), 2000L);
                return;
            default:
                View view3 = this.f11045b;
                view3.setClickable(false);
                N6.d dVar2 = this.f11046c.f11049e;
                if (dVar2 == null) {
                    Intrinsics.n("pickerBinding");
                    throw null;
                }
                this.f11047d.invoke(Integer.valueOf(dVar2.f6095c.getOneWheelView().getCurrentItem()));
                view3.postDelayed(new a(view3, 6), 2000L);
                return;
        }
    }
}
