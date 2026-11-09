package p158kc;

import F8.d;
import Kb.b;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.palmpay.lib.ui.button.PpButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f38733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f38734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SwitchCompat f38735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PpButton f38736g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f38737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f38738j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f38739o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f38740p;
    public final /* synthetic */ d t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, View view) {
        super(dVar, view);
        this.t = dVar;
        this.f38733d = view != null ? (TextView) view.findViewById(d.textViewLine1) : null;
        this.f38734e = view != null ? (TextView) view.findViewById(d.textViewLine2) : null;
        this.f38735f = view != null ? (SwitchCompat) view.findViewById(d.switchDevice) : null;
        this.f38737i = view != null ? (ImageView) view.findViewById(d.imageViewDelete) : null;
        this.f38738j = view != null ? view.findViewById(d.leftView) : null;
        this.f38739o = view != null ? view.findViewById(d.rightView) : null;
        this.f38736g = view != null ? (PpButton) view.findViewById(d.tv_current_device) : null;
        View viewFindViewById = view != null ? view.findViewById(d.ll_container) : null;
        this.f38740p = viewFindViewById;
        a(viewFindViewById);
    }

    public final void d(View view, float f10, float f11) {
        d dVar = this.t;
        if (dVar.f38745f > 0) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, f10, f11);
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
            objectAnimatorOfFloat.setDuration(400L);
            objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat.addListener(new b(view, f11, dVar));
            objectAnimatorOfFloat.start();
        }
    }
}
