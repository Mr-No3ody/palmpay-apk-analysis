package I5;

import Ce.ViewOnAttachStateChangeListenerC0160b;
import Eg.g;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.N;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends IconicsDrawable {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final ArrayList f4013J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Resources res, Resources.Theme theme) {
        super(res, theme);
        Intrinsics.checkNotNullParameter(res, "res");
        this.f4013J = new ArrayList();
    }

    @Override // com.mikepenz.iconics.IconicsDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ArrayList arrayList = this.f4013J;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((IconicsAnimationProcessor) it.next()).processPreDraw(canvas, this.f23580c, this.f23583f, this.f23582e, this.f23581d);
        }
        super.draw(canvas);
        Iterator it2 = CollectionsKt.R(arrayList).iterator();
        while (it2.hasNext()) {
            ((IconicsAnimationProcessor) it2.next()).processPostDraw(canvas);
        }
    }

    public final void r(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        g gVar = new g();
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(this, "drawable");
        gVar.f2443d = null;
        WeakReference weakReference = (WeakReference) gVar.f2442c;
        ViewOnAttachStateChangeListenerC0160b viewOnAttachStateChangeListenerC0160b = (ViewOnAttachStateChangeListenerC0160b) gVar.f2444e;
        if (weakReference != null) {
            View view2 = (View) weakReference.get();
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0160b);
            }
            weakReference.clear();
        }
        gVar.f2442c = null;
        gVar.f2441b = false;
        gVar.f2442c = new WeakReference(view);
        gVar.f2443d = this;
        WeakHashMap weakHashMap = N.f16168a;
        if (view.isAttachedToWindow()) {
            viewOnAttachStateChangeListenerC0160b.onViewAttachedToWindow(view);
        }
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0160b);
    }
}
