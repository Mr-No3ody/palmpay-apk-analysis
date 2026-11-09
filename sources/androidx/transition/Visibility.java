package androidx.transition;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Visibility extends Transition {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({p192n.c.f39802c})
    public @interface Mode {
    }

    public Visibility() {
        this.mMode = 3;
    }

    public static void f(f0 f0Var) {
        int visibility = f0Var.f18046b.getVisibility();
        HashMap map = f0Var.f18045a;
        map.put(PROPNAME_VISIBILITY, Integer.valueOf(visibility));
        map.put(PROPNAME_PARENT, f0Var.f18046b.getParent());
        int[] iArr = new int[2];
        f0Var.f18046b.getLocationOnScreen(iArr);
        map.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static u0 g(f0 f0Var, f0 f0Var2) {
        u0 u0Var = new u0();
        u0Var.f18123a = false;
        u0Var.f18124b = false;
        if (f0Var != null) {
            HashMap map = f0Var.f18045a;
            if (map.containsKey(PROPNAME_VISIBILITY)) {
                u0Var.f18125c = ((Integer) map.get(PROPNAME_VISIBILITY)).intValue();
                u0Var.f18127e = (ViewGroup) map.get(PROPNAME_PARENT);
            } else {
                u0Var.f18125c = -1;
                u0Var.f18127e = null;
            }
        } else {
            u0Var.f18125c = -1;
            u0Var.f18127e = null;
        }
        if (f0Var2 != null) {
            HashMap map2 = f0Var2.f18045a;
            if (map2.containsKey(PROPNAME_VISIBILITY)) {
                u0Var.f18126d = ((Integer) map2.get(PROPNAME_VISIBILITY)).intValue();
                u0Var.f18128f = (ViewGroup) map2.get(PROPNAME_PARENT);
            } else {
                u0Var.f18126d = -1;
                u0Var.f18128f = null;
            }
        } else {
            u0Var.f18126d = -1;
            u0Var.f18128f = null;
        }
        if (f0Var != null && f0Var2 != null) {
            int i7 = u0Var.f18125c;
            int i10 = u0Var.f18126d;
            if (i7 != i10 || u0Var.f18127e != u0Var.f18128f) {
                if (i7 != i10) {
                    if (i7 == 0) {
                        u0Var.f18124b = false;
                        u0Var.f18123a = true;
                        return u0Var;
                    }
                    if (i10 == 0) {
                        u0Var.f18124b = true;
                        u0Var.f18123a = true;
                        return u0Var;
                    }
                } else {
                    if (u0Var.f18128f == null) {
                        u0Var.f18124b = false;
                        u0Var.f18123a = true;
                        return u0Var;
                    }
                    if (u0Var.f18127e == null) {
                        u0Var.f18124b = true;
                        u0Var.f18123a = true;
                        return u0Var;
                    }
                }
            }
        } else {
            if (f0Var == null && u0Var.f18126d == 0) {
                u0Var.f18124b = true;
                u0Var.f18123a = true;
                return u0Var;
            }
            if (f0Var2 == null && u0Var.f18125c == 0) {
                u0Var.f18124b = false;
                u0Var.f18123a = true;
            }
        }
        return u0Var;
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull f0 f0Var) {
        f(f0Var);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull f0 f0Var) {
        f(f0Var);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable f0 f0Var, @Nullable f0 f0Var2) {
        u0 u0VarG = g(f0Var, f0Var2);
        if (!u0VarG.f18123a) {
            return null;
        }
        if (u0VarG.f18127e == null && u0VarG.f18128f == null) {
            return null;
        }
        return u0VarG.f18124b ? onAppear(viewGroup, f0Var, u0VarG.f18125c, f0Var2, u0VarG.f18126d) : onDisappear(viewGroup, f0Var, u0VarG.f18125c, f0Var2, u0VarG.f18126d);
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.Transition
    public boolean isTransitionRequired(@Nullable f0 f0Var, @Nullable f0 f0Var2) {
        if (f0Var == null && f0Var2 == null) {
            return false;
        }
        if (f0Var != null && f0Var2 != null && f0Var2.f18045a.containsKey(PROPNAME_VISIBILITY) != f0Var.f18045a.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        u0 u0VarG = g(f0Var, f0Var2);
        if (u0VarG.f18123a) {
            return u0VarG.f18125c == 0 || u0VarG.f18126d == 0;
        }
        return false;
    }

    public boolean isVisible(@Nullable f0 f0Var) {
        if (f0Var == null) {
            return false;
        }
        HashMap map = f0Var.f18045a;
        return ((Integer) map.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) map.get(PROPNAME_PARENT)) != null;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, f0 f0Var, f0 f0Var2) {
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, f0 f0Var, f0 f0Var2) {
        return null;
    }

    public void setMode(int i7) {
        if ((i7 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i7;
    }

    @Nullable
    public Animator onAppear(@NonNull ViewGroup viewGroup, @Nullable f0 f0Var, int i7, @Nullable f0 f0Var2, int i10) {
        if ((this.mMode & 1) != 1 || f0Var2 == null) {
            return null;
        }
        if (f0Var == null) {
            View view = (View) f0Var2.f18046b.getParent();
            if (g(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f18123a) {
                return null;
            }
        }
        return onAppear(viewGroup, f0Var2.f18046b, f0Var, f0Var2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:57:0x0191  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cf  */
    @Nullable
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @Nullable f0 f0Var, int i7, @Nullable f0 f0Var2, int i10) {
        View view;
        boolean z3;
        char c6;
        Animator animator;
        int i11;
        View view2;
        ViewGroup viewGroup2;
        int i12;
        Bitmap bitmapCreateBitmap;
        if ((this.mMode & 2) != 2 || f0Var == null) {
            return null;
        }
        View view3 = f0Var.f18046b;
        View view4 = f0Var2 != null ? f0Var2.f18046b : null;
        View view5 = (View) view3.getTag(E.save_overlay_view);
        int i13 = 1;
        if (view5 != null) {
            c6 = 1;
            animator = null;
            view2 = null;
            i11 = 0;
        } else {
            if (view4 == null || view4.getParent() == null) {
                if (view4 != null) {
                    view = null;
                    z3 = false;
                } else {
                    z3 = true;
                    view4 = null;
                    view = null;
                }
            } else if (i10 == 4 || view3 == view4) {
                view = view4;
                view4 = null;
                z3 = false;
            } else {
                z3 = true;
                view4 = null;
                view = null;
            }
            if (z3) {
                if (view3.getParent() == null) {
                    view = view;
                    c6 = 1;
                    animator = null;
                    i11 = 0;
                } else {
                    if (view3.getParent() instanceof View) {
                        View view6 = (View) view3.getParent();
                        if (g(getTransitionValues(view6, true), getMatchedTransitionValues(view6, true)).f18123a) {
                            view = view;
                            c6 = 1;
                            animator = null;
                            i11 = 0;
                            int id2 = view6.getId();
                            if (view6.getParent() != null || id2 == -1 || viewGroup.findViewById(id2) == null || !this.mCanRemoveViews) {
                            }
                        } else {
                            boolean z8 = e0.f18037a;
                            Matrix matrix = new Matrix();
                            matrix.setTranslate(-view6.getScrollX(), -view6.getScrollY());
                            q0 q0Var = k0.f18070a;
                            q0Var.k(view3, matrix);
                            q0Var.l(viewGroup, matrix);
                            RectF rectF = new RectF(0.0f, 0.0f, view3.getWidth(), view3.getHeight());
                            matrix.mapRect(rectF);
                            int iRound = Math.round(rectF.left);
                            int iRound2 = Math.round(rectF.top);
                            int iRound3 = Math.round(rectF.right);
                            animator = null;
                            int iRound4 = Math.round(rectF.bottom);
                            c6 = 1;
                            i11 = 0;
                            ImageView imageView = new ImageView(view3.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            boolean zIsAttachedToWindow = view3.isAttachedToWindow();
                            boolean z10 = viewGroup != null && viewGroup.isAttachedToWindow();
                            if (zIsAttachedToWindow) {
                                viewGroup2 = null;
                                i12 = 0;
                            } else {
                                if (z10) {
                                    ViewGroup viewGroup3 = (ViewGroup) view3.getParent();
                                    int iIndexOfChild = viewGroup3.indexOfChild(view3);
                                    viewGroup.getOverlay().add(view3);
                                    i12 = iIndexOfChild;
                                    viewGroup2 = viewGroup3;
                                } else {
                                    bitmapCreateBitmap = null;
                                    view = view;
                                }
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                imageView.layout(iRound, iRound2, iRound3, iRound4);
                                view5 = imageView;
                            }
                            int iRound5 = Math.round(rectF.width());
                            int iRound6 = Math.round(rectF.height());
                            if (iRound5 <= 0 || iRound6 <= 0) {
                                bitmapCreateBitmap = null;
                            } else {
                                float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                int iRound7 = Math.round(iRound5 * fMin);
                                int iRound8 = Math.round(iRound6 * fMin);
                                matrix.postTranslate(-rectF.left, -rectF.top);
                                matrix.postScale(fMin, fMin);
                                if (e0.f18037a) {
                                    Picture picture = new Picture();
                                    Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                    canvasBeginRecording.concat(matrix);
                                    view3.draw(canvasBeginRecording);
                                    picture.endRecording();
                                    bitmapCreateBitmap = c0.a(picture);
                                } else {
                                    bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                                    canvas.concat(matrix);
                                    view3.draw(canvas);
                                }
                            }
                            if (!zIsAttachedToWindow) {
                                viewGroup.getOverlay().remove(view3);
                                viewGroup2.addView(view3, i12);
                            }
                            if (bitmapCreateBitmap != null) {
                                imageView.setImageBitmap(bitmapCreateBitmap);
                            }
                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                            imageView.layout(iRound, iRound2, iRound3, iRound4);
                            view5 = imageView;
                        }
                    } else {
                        view = view;
                        c6 = 1;
                        animator = null;
                        i11 = 0;
                    }
                    view5 = view4;
                }
                view5 = view3;
            } else {
                view = view;
                c6 = 1;
                animator = null;
                i11 = 0;
                view5 = view4;
            }
            i13 = i11;
            view2 = view;
        }
        if (view5 == null) {
            if (view2 == null) {
                return animator;
            }
            int visibility = view2.getVisibility();
            k0.c(view2, i11);
            Animator animatorOnDisappear = onDisappear(viewGroup, view2, f0Var, f0Var2);
            if (animatorOnDisappear == null) {
                k0.c(view2, visibility);
                return animatorOnDisappear;
            }
            s0 s0Var = new s0(view2, i10);
            animatorOnDisappear.addListener(s0Var);
            getRootTransition().addListener(s0Var);
            return animatorOnDisappear;
        }
        if (i13 == 0) {
            int[] iArr = (int[]) f0Var.f18045a.get(PROPNAME_SCREEN_LOCATION);
            int i14 = iArr[i11];
            int i15 = iArr[c6];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view5.offsetLeftAndRight((i14 - iArr2[i11]) - view5.getLeft());
            view5.offsetTopAndBottom((i15 - iArr2[c6]) - view5.getTop());
            viewGroup.getOverlay().add(view5);
        }
        Animator animatorOnDisappear2 = onDisappear(viewGroup, view5, f0Var, f0Var2);
        if (i13 == 0) {
            if (animatorOnDisappear2 == null) {
                viewGroup.getOverlay().remove(view5);
                return animatorOnDisappear2;
            }
            view3.setTag(E.save_overlay_view, view5);
            t0 t0Var = new t0(this, viewGroup, view5, view3);
            animatorOnDisappear2.addListener(t0Var);
            animatorOnDisappear2.addPauseListener(t0Var);
            getRootTransition().addListener(t0Var);
        }
        return animatorOnDisappear2;
    }

    public Visibility(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K.f17950c);
        int iC = Y.a.c(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iC != 0) {
            setMode(iC);
        }
    }
}
