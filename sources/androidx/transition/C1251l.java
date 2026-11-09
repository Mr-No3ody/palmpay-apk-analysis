package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.transition.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1251l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f18074b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f18077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1253n f18078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1252m f18079g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Matrix f18080i;

    public C1251l(View view, C1253n c1253n, C1252m c1252m, Matrix matrix, boolean z3, boolean z8) {
        this.f18075c = z3;
        this.f18076d = z8;
        this.f18077e = view;
        this.f18078f = c1253n;
        this.f18079g = c1252m;
        this.f18080i = matrix;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f18073a = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z3 = this.f18073a;
        C1253n c1253n = this.f18078f;
        View view = this.f18077e;
        if (!z3) {
            if (this.f18075c && this.f18076d) {
                Matrix matrix = this.f18074b;
                matrix.set(this.f18080i);
                view.setTag(E.transition_transform, matrix);
                c1253n.getClass();
                String[] strArr = ChangeTransform.f17925d;
                view.setTranslationX(c1253n.f18086a);
                view.setTranslationY(c1253n.f18087b);
                WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                androidx.core.view.E.p(view, c1253n.f18088c);
                view.setScaleX(c1253n.f18089d);
                view.setScaleY(c1253n.f18090e);
                view.setRotationX(c1253n.f18091f);
                view.setRotationY(c1253n.f18092g);
                view.setRotation(c1253n.f18093h);
            } else {
                view.setTag(E.transition_transform, null);
                view.setTag(E.parent_matrix, null);
            }
        }
        k0.f18070a.i(view, null);
        c1253n.getClass();
        String[] strArr2 = ChangeTransform.f17925d;
        view.setTranslationX(c1253n.f18086a);
        view.setTranslationY(c1253n.f18087b);
        WeakHashMap weakHashMap2 = androidx.core.view.N.f16168a;
        androidx.core.view.E.p(view, c1253n.f18088c);
        view.setScaleX(c1253n.f18089d);
        view.setScaleY(c1253n.f18090e);
        view.setRotationX(c1253n.f18091f);
        view.setRotationY(c1253n.f18092g);
        view.setRotation(c1253n.f18093h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = this.f18079g.f18081a;
        Matrix matrix2 = this.f18074b;
        matrix2.set(matrix);
        int i7 = E.transition_transform;
        View view = this.f18077e;
        view.setTag(i7, matrix2);
        C1253n c1253n = this.f18078f;
        c1253n.getClass();
        String[] strArr = ChangeTransform.f17925d;
        view.setTranslationX(c1253n.f18086a);
        view.setTranslationY(c1253n.f18087b);
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        androidx.core.view.E.p(view, c1253n.f18088c);
        view.setScaleX(c1253n.f18089d);
        view.setScaleY(c1253n.f18090e);
        view.setRotationX(c1253n.f18091f);
        view.setRotationY(c1253n.f18092g);
        view.setRotation(c1253n.f18093h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        String[] strArr = ChangeTransform.f17925d;
        View view = this.f18077e;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        androidx.core.view.E.p(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
