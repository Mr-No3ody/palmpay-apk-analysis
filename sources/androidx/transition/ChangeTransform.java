package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class ChangeTransform extends Transition {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f17925d = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1241b f17926e = new C1241b("nonTranslations", 6, float[].class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1241b f17927f = new C1241b("translations", 7, PointF.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f17928g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f17931c;

    public ChangeTransform(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17929a = true;
        this.f17930b = true;
        this.f17931c = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K.f17952e);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f17929a = !Y.a.e(xmlPullParser, "reparentWithOverlay") ? true : typedArrayObtainStyledAttributes.getBoolean(1, true);
        this.f17930b = Y.a.e(xmlPullParser, "reparent") ? typedArrayObtainStyledAttributes.getBoolean(0, true) : true;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(f0 f0Var) {
        f(f0Var);
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(f0 f0Var) {
        f(f0Var);
        if (f17928g) {
            return;
        }
        ((ViewGroup) f0Var.f18046b.getParent()).startViewTransition(f0Var.f18046b);
    }

    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, f0 f0Var, f0 f0Var2) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder;
        Object obj;
        ObjectAnimator objectAnimator;
        int i7;
        GhostViewPort ghostViewPort;
        boolean z3;
        GhostViewPort ghostViewPort2;
        GhostViewHolder ghostViewHolder;
        ArrayList arrayList;
        ObjectAnimator objectAnimator2;
        ArrayList arrayList2;
        int i10;
        boolean z8;
        boolean z10;
        int i11;
        int iIntValue;
        GhostViewHolder ghostViewHolder2;
        GhostView ghostView;
        C1262x c1262x;
        f0 matchedTransitionValues;
        if (f0Var == null || f0Var2 == null) {
            return null;
        }
        HashMap map = f0Var.f18045a;
        if (!map.containsKey("android:changeTransform:parent")) {
            return null;
        }
        HashMap map2 = f0Var2.f18045a;
        if (!map2.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeTransform:parent");
        View view = (ViewGroup) map2.get("android:changeTransform:parent");
        boolean z11 = this.f17930b && (!(isValidTarget(viewGroup2) && isValidTarget(view)) ? viewGroup2 == view : !((matchedTransitionValues = getMatchedTransitionValues(viewGroup2, true)) == null || view != matchedTransitionValues.f18046b));
        Matrix matrix = (Matrix) map.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            map.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) map.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            map.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z11) {
            Matrix matrix3 = (Matrix) map2.get("android:changeTransform:parentMatrix");
            f0Var2.f18046b.setTag(E.parent_matrix, matrix3);
            Matrix matrix4 = this.f17931c;
            matrix4.reset();
            matrix3.invert(matrix4);
            Matrix matrix5 = (Matrix) map.get("android:changeTransform:matrix");
            if (matrix5 == null) {
                matrix5 = new Matrix();
                map.put("android:changeTransform:matrix", matrix5);
            }
            matrix5.postConcat((Matrix) map.get("android:changeTransform:parentMatrix"));
            matrix5.postConcat(matrix4);
        }
        Matrix matrix6 = (Matrix) map.get("android:changeTransform:matrix");
        Matrix matrix7 = (Matrix) map2.get("android:changeTransform:matrix");
        if (matrix6 == null) {
            matrix6 = B.f17910a;
        }
        if (matrix7 == null) {
            matrix7 = B.f17910a;
        }
        if (matrix6.equals(matrix7)) {
            obj = "android:changeTransform:parentMatrix";
            objectAnimatorOfPropertyValuesHolder = null;
        } else {
            C1253n c1253n = (C1253n) map2.get("android:changeTransform:transforms");
            View view2 = f0Var2.f18046b;
            view2.setTranslationX(0.0f);
            view2.setTranslationY(0.0f);
            WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
            androidx.core.view.E.p(view2, 0.0f);
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            view2.setRotationX(0.0f);
            view2.setRotationY(0.0f);
            view2.setRotation(0.0f);
            float[] fArr = new float[9];
            matrix6.getValues(fArr);
            float[] fArr2 = new float[9];
            matrix7.getValues(fArr2);
            C1252m c1252m = new C1252m(view2, fArr);
            C1256q c1256q = new C1256q(0);
            c1256q.f18097b = new float[9];
            objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c1252m, PropertyValuesHolder.ofObject(f17926e, c1256q, fArr, fArr2), D.a(f17927f, getPathMotion().getPath(fArr[2], fArr[5], fArr2[2], fArr2[5])));
            obj = "android:changeTransform:parentMatrix";
            C1251l c1251l = new C1251l(view2, c1253n, c1252m, matrix7, z11, this.f17929a);
            objectAnimatorOfPropertyValuesHolder.addListener(c1251l);
            objectAnimatorOfPropertyValuesHolder.addPauseListener(c1251l);
        }
        boolean z12 = f17928g;
        if (z11 && objectAnimatorOfPropertyValuesHolder != null && this.f17929a) {
            View view3 = f0Var2.f18046b;
            Matrix matrix8 = new Matrix((Matrix) map2.get(obj));
            k0.f18070a.l(viewGroup, matrix8);
            if (Build.VERSION.SDK_INT == 28) {
                if (!C1262x.f18133e) {
                    try {
                        if (!C1262x.f18131c) {
                            try {
                                C1262x.f18130b = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException unused) {
                            }
                            C1262x.f18131c = r5;
                        }
                        Method declaredMethod = C1262x.f18130b.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                        C1262x.f18132d = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused2) {
                    }
                    C1262x.f18133e = true;
                }
                Method method = C1262x.f18132d;
                if (method != null) {
                    try {
                        c1262x = new C1262x((View) method.invoke(null, view3, viewGroup, matrix8));
                    } catch (IllegalAccessException unused3) {
                        c1262x = null;
                    } catch (InvocationTargetException e10) {
                        throw new RuntimeException(e10.getCause());
                    }
                } else {
                    c1262x = null;
                }
                objectAnimator = objectAnimatorOfPropertyValuesHolder;
                z3 = z12;
                ghostView = c1262x;
            } else {
                int i12 = GhostViewPort.f17940g;
                if (!(view3.getParent() instanceof ViewGroup)) {
                    throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
                }
                int i13 = GhostViewHolder.f17937c;
                GhostViewHolder ghostViewHolder3 = (GhostViewHolder) viewGroup.getTag(E.ghost_view_holder);
                GhostViewPort ghostViewPort3 = (GhostViewPort) view3.getTag(E.ghost_view);
                if (ghostViewPort3 == null || (ghostViewHolder2 = (GhostViewHolder) ghostViewPort3.getParent()) == ghostViewHolder3) {
                    i7 = 0;
                    ghostViewPort = ghostViewPort3;
                } else {
                    i7 = ghostViewPort3.f17944d;
                    ghostViewHolder2.removeView(ghostViewPort3);
                    ghostViewPort = null;
                }
                if (ghostViewPort == null) {
                    GhostViewPort ghostViewPort4 = new GhostViewPort(view3);
                    ghostViewPort4.f17945e = matrix8;
                    if (ghostViewHolder3 == null) {
                        GhostViewHolder ghostViewHolder4 = new GhostViewHolder(viewGroup.getContext());
                        ghostViewHolder4.setClipChildren(false);
                        ghostViewHolder4.f17938a = viewGroup;
                        viewGroup.setTag(E.ghost_view_holder, ghostViewHolder4);
                        viewGroup.getOverlay().add(ghostViewHolder4);
                        ghostViewHolder4.f17939b = true;
                        ghostViewHolder = ghostViewHolder4;
                    } else {
                        if (!ghostViewHolder3.f17939b) {
                            throw new IllegalStateException("This GhostViewHolder is detached!");
                        }
                        ViewGroup viewGroup3 = ghostViewHolder3.f17938a;
                        viewGroup3.getOverlay().remove(ghostViewHolder3);
                        viewGroup3.getOverlay().add(ghostViewHolder3);
                        ghostViewHolder = ghostViewHolder3;
                    }
                    k0.a(ghostViewHolder, ghostViewHolder.getLeft(), ghostViewHolder.getTop(), viewGroup.getWidth() + ghostViewHolder.getLeft(), viewGroup.getHeight() + ghostViewHolder.getTop());
                    k0.a(ghostViewPort4, ghostViewPort4.getLeft(), ghostViewPort4.getTop(), viewGroup.getWidth() + ghostViewPort4.getLeft(), viewGroup.getHeight() + ghostViewPort4.getTop());
                    ArrayList arrayList3 = new ArrayList();
                    GhostViewHolder.a(ghostViewPort4.f17943c, arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    int childCount = ghostViewHolder.getChildCount() - 1;
                    int i14 = 0;
                    while (i14 <= childCount) {
                        int i15 = (i14 + childCount) / 2;
                        GhostViewHolder.a(((GhostViewPort) ghostViewHolder.getChildAt(i15)).f17943c, arrayList4);
                        if (arrayList3.isEmpty() || arrayList4.isEmpty()) {
                            arrayList = arrayList3;
                            objectAnimator2 = objectAnimatorOfPropertyValuesHolder;
                            arrayList2 = arrayList4;
                            i10 = childCount;
                        } else {
                            objectAnimator2 = objectAnimatorOfPropertyValuesHolder;
                            i10 = childCount;
                            if (arrayList3.get(0) != arrayList4.get(0)) {
                                arrayList = arrayList3;
                            } else {
                                int iMin = Math.min(arrayList3.size(), arrayList4.size());
                                int i16 = 1;
                                while (true) {
                                    if (i16 < iMin) {
                                        View view4 = (View) arrayList3.get(i16);
                                        arrayList = arrayList3;
                                        View view5 = (View) arrayList4.get(i16);
                                        if (view4 != view5) {
                                            ViewGroup viewGroup4 = (ViewGroup) view4.getParent();
                                            int childCount2 = viewGroup4.getChildCount();
                                            if (AbstractC1261w.a(view4) == AbstractC1261w.a(view5)) {
                                                arrayList2 = arrayList4;
                                                int i17 = 0;
                                                while (true) {
                                                    if (i17 < childCount2) {
                                                        int i18 = childCount2;
                                                        z8 = z12;
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            iIntValue = j0.a(viewGroup4, i17);
                                                            i11 = i17;
                                                        } else {
                                                            if (!K.f17963p) {
                                                                try {
                                                                    Class cls = Integer.TYPE;
                                                                    Method declaredMethod2 = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                                                                    K.f17962o = declaredMethod2;
                                                                    z10 = true;
                                                                    try {
                                                                        declaredMethod2.setAccessible(true);
                                                                    } catch (NoSuchMethodException unused4) {
                                                                    }
                                                                } catch (NoSuchMethodException unused5) {
                                                                    z10 = true;
                                                                }
                                                                K.f17963p = z10;
                                                            }
                                                            Method method2 = K.f17962o;
                                                            if (method2 != null) {
                                                                try {
                                                                    i11 = i17;
                                                                    try {
                                                                        iIntValue = ((Integer) method2.invoke(viewGroup4, Integer.valueOf(viewGroup4.getChildCount()), Integer.valueOf(i11))).intValue();
                                                                    } catch (IllegalAccessException | InvocationTargetException unused6) {
                                                                        iIntValue = i11;
                                                                    }
                                                                } catch (IllegalAccessException | InvocationTargetException unused7) {
                                                                    i11 = i17;
                                                                }
                                                            } else {
                                                                i11 = i17;
                                                                iIntValue = i11;
                                                            }
                                                        }
                                                        View childAt = viewGroup4.getChildAt(iIntValue);
                                                        if (childAt != view4) {
                                                            if (childAt != view5) {
                                                                i17 = i11 + 1;
                                                                childCount2 = i18;
                                                                z12 = z8;
                                                            }
                                                        }
                                                    }
                                                    i14 = i15 + 1;
                                                    childCount = i10;
                                                    arrayList2.clear();
                                                    objectAnimatorOfPropertyValuesHolder = objectAnimator2;
                                                    arrayList4 = arrayList2;
                                                    arrayList3 = arrayList;
                                                    z12 = z8;
                                                }
                                            } else if (AbstractC1261w.a(view4) <= AbstractC1261w.a(view5)) {
                                                arrayList2 = arrayList4;
                                                z8 = z12;
                                            }
                                        } else {
                                            i16++;
                                            arrayList3 = arrayList;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        arrayList2 = arrayList4;
                                        z8 = z12;
                                        if (arrayList2.size() == iMin) {
                                            i14 = i15 + 1;
                                            childCount = i10;
                                        }
                                        arrayList2.clear();
                                        objectAnimatorOfPropertyValuesHolder = objectAnimator2;
                                        arrayList4 = arrayList2;
                                        arrayList3 = arrayList;
                                        z12 = z8;
                                    }
                                    childCount = i15 - 1;
                                    arrayList2.clear();
                                    objectAnimatorOfPropertyValuesHolder = objectAnimator2;
                                    arrayList4 = arrayList2;
                                    arrayList3 = arrayList;
                                    z12 = z8;
                                }
                            }
                            arrayList2 = arrayList4;
                        }
                        z8 = z12;
                        i14 = i15 + 1;
                        childCount = i10;
                        arrayList2.clear();
                        objectAnimatorOfPropertyValuesHolder = objectAnimator2;
                        arrayList4 = arrayList2;
                        arrayList3 = arrayList;
                        z12 = z8;
                    }
                    objectAnimator = objectAnimatorOfPropertyValuesHolder;
                    z3 = z12;
                    if (i14 < 0 || i14 >= ghostViewHolder.getChildCount()) {
                        ghostViewHolder.addView(ghostViewPort4);
                    } else {
                        ghostViewHolder.addView(ghostViewPort4, i14);
                    }
                    ghostViewPort4.f17944d = i7;
                    ghostViewPort2 = ghostViewPort4;
                } else {
                    objectAnimator = objectAnimatorOfPropertyValuesHolder;
                    z3 = z12;
                    ghostViewPort.f17945e = matrix8;
                    ghostViewPort2 = ghostViewPort;
                }
                ghostViewPort2.f17944d++;
                ghostView = ghostViewPort2;
            }
            if (ghostView != null) {
                ghostView.reserveEndViewTransition((ViewGroup) map.get("android:changeTransform:parent"), f0Var.f18046b);
                Transition transition = this;
                while (true) {
                    Transition transition2 = transition.mParent;
                    if (transition2 == null) {
                        break;
                    }
                    transition = transition2;
                }
                C1250k c1250k = new C1250k();
                c1250k.f18068a = view3;
                c1250k.f18069b = ghostView;
                transition.addListener(c1250k);
                if (z3) {
                    View view6 = f0Var.f18046b;
                    if (view6 != f0Var2.f18046b) {
                        k0.b(view6, 0.0f);
                    }
                    k0.b(view3, 1.0f);
                }
            }
        } else {
            objectAnimator = objectAnimatorOfPropertyValuesHolder;
            if (!z12) {
                viewGroup2.endViewTransition(f0Var.f18046b);
            }
        }
        return objectAnimator;
    }

    public final void f(f0 f0Var) {
        View view = f0Var.f18046b;
        if (view.getVisibility() == 8) {
            return;
        }
        HashMap map = f0Var.f18045a;
        map.put("android:changeTransform:parent", view.getParent());
        map.put("android:changeTransform:transforms", new C1253n(view));
        Matrix matrix = view.getMatrix();
        map.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f17930b) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            k0.f18070a.k(viewGroup, matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            map.put("android:changeTransform:parentMatrix", matrix2);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(E.transition_transform));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(E.parent_matrix));
        }
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return f17925d;
    }
}
