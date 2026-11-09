package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class M implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f17031a;

    public M(Z z3) {
        this.f17031a = z3;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        f0 f0VarF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        Z z3 = this.f17031a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, z3);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p260r0.c.Fragment);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(p260r0.c.Fragment_android_name);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(p260r0.c.Fragment_android_id, -1);
            String string = typedArrayObtainStyledAttributes.getString(p260r0.c.Fragment_android_tag);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = Fragment.class.isAssignableFrom(J.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragment = resourceId != -1 ? z3.D(resourceId) : null;
                    if (fragment == null && string != null) {
                        fragment = z3.E(string);
                    }
                    if (fragment == null && id2 != -1) {
                        fragment = z3.D(id2);
                    }
                    if (fragment == null) {
                        fragment = z3.J().a(context.getClassLoader(), attributeValue);
                        fragment.mFromLayout = true;
                        fragment.mFragmentId = resourceId != 0 ? resourceId : id2;
                        fragment.mContainerId = id2;
                        fragment.mTag = string;
                        fragment.mInLayout = true;
                        fragment.mFragmentManager = z3;
                        K k2 = z3.f17087v;
                        fragment.mHost = k2;
                        fragment.onInflate((Context) k2.f17026b, attributeSet, fragment.mSavedFragmentState);
                        f0VarF = z3.a(fragment);
                        if (Z.L(2)) {
                            fragment.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (fragment.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        fragment.mInLayout = true;
                        fragment.mFragmentManager = z3;
                        K k8 = z3.f17087v;
                        fragment.mHost = k8;
                        fragment.onInflate((Context) k8.f17026b, attributeSet, fragment.mSavedFragmentState);
                        f0VarF = z3.f(fragment);
                        if (Z.L(2)) {
                            fragment.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    p275s0.d dVar = p275s0.e.f42006a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    p275s0.e.b(new p275s0.f(fragment, viewGroup, 0));
                    p275s0.e.a(fragment).f42005a.contains(p275s0.b.f41997b);
                    fragment.mContainer = viewGroup;
                    f0VarF.i();
                    f0VarF.h();
                    View view2 = fragment.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(N8.q0.k("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragment.mView.getTag() == null) {
                        fragment.mView.setTag(string);
                    }
                    fragment.mView.addOnAttachStateChangeListener(new L(this, f0VarF));
                    return fragment.mView;
                }
            }
        }
        return null;
    }
}
