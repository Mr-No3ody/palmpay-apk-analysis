package U4;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.growingio.android.sdk.track.modelloader.LoadDataFetcher;
import com.growingio.android.sdk.track.modelloader.ModelLoader;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f9215f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f9216g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f9217h = new AtomicInteger(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9218i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Oe.a f9219j;

    public final void a() {
        Oe.a aVar;
        if (this.f9217h.decrementAndGet() > 0 || (aVar = this.f9219j) == null) {
            return;
        }
        aVar.onSuccess(new c(this));
    }

    public final void b(View view) {
        p021b5.b bVarK = p059e1.a.K(view);
        if (bVarK != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            ArrayList arrayList = this.f9216g;
            d dVar = new d();
            dVar.f9228b = bVarK.f18776e;
            dVar.f9227a = bVarK.a();
            dVar.f9233g = bVarK.f18774c;
            dVar.f9232f = view.getHeight();
            dVar.f9231e = view.getWidth();
            dVar.f9229c = iArr[0];
            dVar.f9230d = iArr[1];
            arrayList.add(new e(dVar));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    b(viewGroup.getChildAt(i7));
                }
            }
        }
    }

    public final j c(p047d5.b bVar) {
        String str;
        j jVar = new j();
        int[] iArr = new int[2];
        bVar.f35531a.getLocationOnScreen(iArr);
        jVar.f9255c = iArr[0];
        jVar.f9256d = iArr[1];
        jVar.f9258f = bVar.f35531a.getHeight();
        jVar.f9257e = bVar.f35531a.getWidth();
        jVar.f9260h = bVar.f35535e;
        View view = bVar.f35531a;
        if (view instanceof EditText) {
            str = "INPUT";
        } else if ((view instanceof TextView) && !(view instanceof Button)) {
            str = "TEXT";
        } else if (p291t5.a.d(view.getParent())) {
            str = "LIST";
        } else {
            View view2 = bVar.f35531a;
            str = ((view2 instanceof WebView) || p291t5.a.c(view2) || p291t5.a.b(view2)) ? "WEB_VIEW" : "BUTTON";
        }
        jVar.f9259g = str;
        WeakHashMap weakHashMap = p021b5.d.f18781a;
        p021b5.d dVar = p021b5.c.f18780a;
        View view3 = bVar.f35531a;
        dVar.getClass();
        jVar.f9261i = p021b5.d.a(view3).a();
        jVar.f9254b = bVar.f35534d;
        jVar.f9253a = bVar.f35532b;
        jVar.f9263k = bVar.f35538h;
        int i7 = this.f9218i;
        this.f9218i = 1 + i7;
        jVar.f9262j = i7;
        return jVar;
    }

    public final void d(p047d5.b bVar) {
        ModelLoader modelLoaderW;
        View view = bVar.f35531a;
        if (view.getVisibility() == 8 || view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        View view2 = bVar.f35531a;
        boolean z3 = p291t5.a.f42330a;
        if (((view2 instanceof WebView) || p291t5.a.c(view2) || p291t5.a.b(view2)) && (modelLoaderW = h.f9245a.w()) != null) {
            this.f9217h.incrementAndGet();
            View view3 = bVar.f35531a;
            p264r5.b bVar2 = new p264r5.b();
            bVar2.f41566a = view3;
            ((LoadDataFetcher) modelLoaderW.buildLoadData(bVar2).f41455a).loadData(new a(this, bVar));
        } else if (p140j8.f.a(bVar.f35531a)) {
            this.f9215f.add(new k(c(bVar)));
        }
        View view4 = bVar.f35531a;
        if (view4 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view4;
            if (viewGroup.getChildCount() > 0) {
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    d(bVar.a(i7, viewGroup.getChildAt(i7)));
                }
            }
        }
    }
}
