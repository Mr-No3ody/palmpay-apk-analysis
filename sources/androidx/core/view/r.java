package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f16278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f16279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f16280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f16282e;

    public r(ViewGroup viewGroup) {
        this.f16280c = viewGroup;
    }

    public final boolean a(float f10, float f11, boolean z3) {
        ViewParent viewParentE;
        if (this.f16281d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f16280c, f10, f11, z3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e10);
            }
        }
        return false;
    }

    public final boolean b(float f10, float f11) {
        ViewParent viewParentE;
        if (this.f16281d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f16280c, f10, f11);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e10);
            }
        }
        return false;
    }

    public final boolean c(int i7, int i10, int[] iArr, int[] iArr2, int i11) {
        ViewParent viewParentE;
        int i12;
        int i13;
        if (!this.f16281d || (viewParentE = e(i11)) == null) {
            return false;
        }
        if (i7 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f16280c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f16282e == null) {
                this.f16282e = new int[2];
            }
            iArr = this.f16282e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParentE).onNestedPreScroll(viewGroup, i7, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                viewParentE.onNestedPreScroll(viewGroup, i7, i10, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i7, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent viewParentE;
        int i14;
        int i15;
        int[] iArr3;
        if (this.f16281d && (viewParentE = e(i13)) != null) {
            if (i7 != 0 || i10 != 0 || i11 != 0 || i12 != 0) {
                ViewGroup viewGroup = this.f16280c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i14 = iArr[0];
                    i15 = iArr[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr2 == null) {
                    if (this.f16282e == null) {
                        this.f16282e = new int[2];
                    }
                    int[] iArr4 = this.f16282e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof NestedScrollingParent3) {
                    ((NestedScrollingParent3) viewParentE).onNestedScroll(viewGroup, i7, i10, i11, i12, i13, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i11;
                    iArr3[1] = iArr3[1] + i12;
                    if (viewParentE instanceof NestedScrollingParent2) {
                        ((NestedScrollingParent2) viewParentE).onNestedScroll(viewGroup, i7, i10, i11, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            viewParentE.onNestedScroll(viewGroup, i7, i10, i11, i12);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e10);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i14;
                    iArr[1] = iArr[1] - i15;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i7) {
        if (i7 == 0) {
            return this.f16278a;
        }
        if (i7 != 1) {
            return null;
        }
        return this.f16279b;
    }

    public final boolean f(int i7) {
        return e(i7) != null;
    }

    public final void g(boolean z3) {
        if (this.f16281d) {
            WeakHashMap weakHashMap = N.f16168a;
            E.q(this.f16280c);
        }
        this.f16281d = z3;
    }

    public final boolean h(int i7, int i10) {
        boolean zOnStartNestedScroll;
        if (!f(i10)) {
            if (this.f16281d) {
                View view = this.f16280c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z3 = parent instanceof NestedScrollingParent2;
                    if (z3) {
                        zOnStartNestedScroll = ((NestedScrollingParent2) parent).onStartNestedScroll(view2, view, i7, i10);
                    } else if (i10 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i7);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i10 == 0) {
                            this.f16278a = parent;
                        } else if (i10 == 1) {
                            this.f16279b = parent;
                        }
                        if (z3) {
                            ((NestedScrollingParent2) parent).onNestedScrollAccepted(view2, view, i7, i10);
                        } else if (i10 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i7);
                            } catch (AbstractMethodError e11) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void i(int i7) {
        ViewParent viewParentE = e(i7);
        if (viewParentE != null) {
            boolean z3 = viewParentE instanceof NestedScrollingParent2;
            ViewGroup viewGroup = this.f16280c;
            if (z3) {
                ((NestedScrollingParent2) viewParentE).onStopNestedScroll(viewGroup, i7);
            } else if (i7 == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i7 == 0) {
                this.f16278a = null;
            } else {
                if (i7 != 1) {
                    return;
                }
                this.f16279b = null;
            }
        }
    }
}
