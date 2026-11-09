package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00028\u0000\"\n\b\u0000\u0010\u0019*\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/animation/LayoutTransition;", "transition", "", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFragmentContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,353:1\n55#2,6:354\n55#2,6:360\n1855#3,2:366\n*S KotlinDebug\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n*L\n113#1:354,6\n135#1:360,6\n226#1:366,2\n*E\n"})
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f16985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16986d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16983a = new ArrayList();
        this.f16984b = new ArrayList();
        this.f16986d = true;
    }

    public final void a(View view) {
        if (this.f16984b.contains(view)) {
            this.f16983a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i7, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(child, "child");
        Object tag = child.getTag(p260r0.b.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(child, i7, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        androidx.core.view.q0 q0VarL;
        Intrinsics.checkNotNullParameter(insets, "insets");
        androidx.core.view.q0 q0VarH = androidx.core.view.q0.h(null, insets);
        Intrinsics.checkNotNullExpressionValue(q0VarH, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f16985c;
        if (onApplyWindowInsetsListener != null) {
            Intrinsics.e(onApplyWindowInsetsListener);
            Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            Intrinsics.checkNotNullParameter(this, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            q0VarL = androidx.core.view.q0.h(null, windowInsetsOnApplyWindowInsets);
        } else {
            q0VarL = androidx.core.view.N.l(this, q0VarH);
        }
        Intrinsics.checkNotNullExpressionValue(q0VarL, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!q0VarL.f16277a.n()) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                androidx.core.view.N.b(getChildAt(i7), q0VarL);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f16986d) {
            Iterator it = this.f16983a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j6) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.f16986d) {
            ArrayList arrayList = this.f16983a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j6);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f16984b.remove(view);
        if (this.f16983a.remove(view)) {
            this.f16986d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        E e10;
        Z supportFragmentManager;
        Fragment fragmentF = Z.F(this);
        if (fragmentF == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    e10 = null;
                    break;
                }
                if (context instanceof E) {
                    e10 = (E) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (e10 == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = e10.getSupportFragmentManager();
        } else {
            if (!fragmentF.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragmentF + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = fragmentF.getChildFragmentManager();
        }
        return (F) supportFragmentManager.D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                Intrinsics.checkNotNullExpressionValue(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i7) {
        View view = getChildAt(i7);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        a(view);
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i7, int i10) {
        int i11 = i7 + i10;
        for (int i12 = i7; i12 < i11; i12++) {
            View view = getChildAt(i12);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViews(i7, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i7, int i10) {
        int i11 = i7 + i10;
        for (int i12 = i7; i12 < i11; i12++) {
            View view = getChildAt(i12);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i7, i10);
    }

    @JvmName(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f16986d = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@Nullable LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@NotNull View.OnApplyWindowInsetsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f16985c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == this) {
            this.f16984b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        String str;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16983a = new ArrayList();
        this.f16984b = new ArrayList();
        this.f16986d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = p260r0.c.FragmentContainerView;
            Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(p260r0.c.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, Z fm) {
        View view;
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(fm, "fm");
        this.f16983a = new ArrayList();
        this.f16984b = new ArrayList();
        this.f16986d = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = p260r0.c.FragmentContainerView;
        Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(p260r0.c.FragmentContainerView_android_name) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(p260r0.c.FragmentContainerView_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment fragmentD = fm.D(id2);
        if (classAttribute != null && fragmentD == null) {
            if (id2 == -1) {
                throw new IllegalStateException(N8.q0.k("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            Fragment fragmentA = fm.J().a(context.getClassLoader(), classAttribute);
            Intrinsics.checkNotNullExpressionValue(fragmentA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentA.mFragmentId = id2;
            fragmentA.mContainerId = id2;
            fragmentA.mTag = string;
            fragmentA.mFragmentManager = fm;
            fragmentA.mHost = fm.f17087v;
            fragmentA.onInflate(context, attrs, (Bundle) null);
            C1161a c1161a = new C1161a(fm);
            c1161a.f17176p = true;
            fragmentA.mContainer = this;
            c1161a.d(getId(), fragmentA, string, 1);
            c1161a.j();
        }
        for (f0 f0Var : fm.f17069c.d()) {
            Fragment fragment = f0Var.f17125c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                f0Var.a();
            }
        }
    }
}
