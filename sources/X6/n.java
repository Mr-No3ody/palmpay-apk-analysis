package X6;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f11034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f11035c;

    public /* synthetic */ n(View view, c cVar, int i7) {
        this.f11033a = i7;
        this.f11034b = view;
        this.f11035c = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f11033a) {
            case 0:
                View view2 = this.f11034b;
                view2.setClickable(false);
                this.f11035c.invoke();
                view2.postDelayed(new a(view2, 2), 2000L);
                break;
            default:
                View view3 = this.f11034b;
                view3.setClickable(false);
                this.f11035c.invoke();
                view3.postDelayed(new a(view3, 4), 2000L);
                break;
        }
    }
}
