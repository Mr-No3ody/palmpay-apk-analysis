package N6;

import Bc.k;
import L6.f;
import L6.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f6085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f6086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f6087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f6088d;

    public b(ConstraintLayout constraintLayout, FrameLayout frameLayout, k kVar, e eVar) {
        this.f6085a = constraintLayout;
        this.f6086b = frameLayout;
        this.f6087c = kVar;
        this.f6088d = eVar;
    }

    public static b a(LayoutInflater layoutInflater) {
        View viewM;
        View viewInflate = layoutInflater.inflate(g.lib_ui_dialog_picker_container, (ViewGroup) null, false);
        int i7 = f.fl_container;
        FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
        if (frameLayout != null && (viewM = p059e1.a.m((i7 = f.ly_button), viewInflate)) != null) {
            k kVarA = k.a(viewM);
            int i10 = f.ly_title;
            View viewM2 = p059e1.a.m(i10, viewInflate);
            if (viewM2 != null) {
                return new b((ConstraintLayout) viewInflate, frameLayout, kVarA, e.a(viewM2));
            }
            i7 = i10;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f6085a;
    }
}
