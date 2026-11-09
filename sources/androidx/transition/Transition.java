package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<f0> mEndValuesList;
    private O mEpicenterCallback;
    private TransitionListener[] mListenersCache;
    private M.f mNameOverrides;
    Y mPropagation;
    S mSeekController;
    long mSeekOffsetInParent;
    private ArrayList<f0> mStartValuesList;
    long mTotalDuration;
    private static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final PathMotion STRAIGHT_PATH_MOTION = new L();
    private static ThreadLocal<M.f> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private g0 mStartValues = new g0();
    private g0 mEndValues = new g0();
    TransitionSet mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
    int mNumInstances = 0;
    private boolean mPaused = false;
    boolean mEnded = false;
    private Transition mCloneParent = null;
    private ArrayList<TransitionListener> mListeners = null;
    ArrayList<Animator> mAnimators = new ArrayList<>();
    private PathMotion mPathMotion = STRAIGHT_PATH_MOTION;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({p192n.c.f39802c})
    public @interface MatchOrder {
    }

    public interface TransitionListener {
        void onTransitionCancel(@NonNull Transition transition);

        void onTransitionEnd(@NonNull Transition transition);

        default void onTransitionEnd(@NonNull Transition transition, boolean z3) {
            onTransitionEnd(transition);
        }

        void onTransitionPause(@NonNull Transition transition);

        void onTransitionResume(@NonNull Transition transition);

        void onTransitionStart(@NonNull Transition transition);

        default void onTransitionStart(@NonNull Transition transition, boolean z3) {
            onTransitionStart(transition);
        }
    }

    public interface TransitionNotification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final T f17998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final T f17999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final T f18000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final T f18001d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final T f18002e;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.transition.T] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.transition.T] */
        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.transition.T] */
        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.transition.T] */
        /* JADX WARN: Type inference failed for: r0v4, types: [androidx.transition.T] */
        static {
            final int i7 = 0;
            f17998a = new TransitionNotification() { // from class: androidx.transition.T
                @Override // androidx.transition.Transition.TransitionNotification
                public final void notifyListener(Transition.TransitionListener transitionListener, Transition transition, boolean z3) {
                    switch (i7) {
                        case 0:
                            transitionListener.onTransitionStart(transition, z3);
                            break;
                        case 1:
                            transitionListener.onTransitionEnd(transition, z3);
                            break;
                        case 2:
                            transitionListener.onTransitionCancel(transition);
                            break;
                        case 3:
                            transitionListener.onTransitionPause(transition);
                            break;
                        default:
                            transitionListener.onTransitionResume(transition);
                            break;
                    }
                }
            };
            final int i10 = 1;
            f17999b = new TransitionNotification() { // from class: androidx.transition.T
                @Override // androidx.transition.Transition.TransitionNotification
                public final void notifyListener(Transition.TransitionListener transitionListener, Transition transition, boolean z3) {
                    switch (i10) {
                        case 0:
                            transitionListener.onTransitionStart(transition, z3);
                            break;
                        case 1:
                            transitionListener.onTransitionEnd(transition, z3);
                            break;
                        case 2:
                            transitionListener.onTransitionCancel(transition);
                            break;
                        case 3:
                            transitionListener.onTransitionPause(transition);
                            break;
                        default:
                            transitionListener.onTransitionResume(transition);
                            break;
                    }
                }
            };
            final int i11 = 2;
            f18000c = new TransitionNotification() { // from class: androidx.transition.T
                @Override // androidx.transition.Transition.TransitionNotification
                public final void notifyListener(Transition.TransitionListener transitionListener, Transition transition, boolean z3) {
                    switch (i11) {
                        case 0:
                            transitionListener.onTransitionStart(transition, z3);
                            break;
                        case 1:
                            transitionListener.onTransitionEnd(transition, z3);
                            break;
                        case 2:
                            transitionListener.onTransitionCancel(transition);
                            break;
                        case 3:
                            transitionListener.onTransitionPause(transition);
                            break;
                        default:
                            transitionListener.onTransitionResume(transition);
                            break;
                    }
                }
            };
            final int i12 = 3;
            f18001d = new TransitionNotification() { // from class: androidx.transition.T
                @Override // androidx.transition.Transition.TransitionNotification
                public final void notifyListener(Transition.TransitionListener transitionListener, Transition transition, boolean z3) {
                    switch (i12) {
                        case 0:
                            transitionListener.onTransitionStart(transition, z3);
                            break;
                        case 1:
                            transitionListener.onTransitionEnd(transition, z3);
                            break;
                        case 2:
                            transitionListener.onTransitionCancel(transition);
                            break;
                        case 3:
                            transitionListener.onTransitionPause(transition);
                            break;
                        default:
                            transitionListener.onTransitionResume(transition);
                            break;
                    }
                }
            };
            final int i13 = 4;
            f18002e = new TransitionNotification() { // from class: androidx.transition.T
                @Override // androidx.transition.Transition.TransitionNotification
                public final void notifyListener(Transition.TransitionListener transitionListener, Transition transition, boolean z3) {
                    switch (i13) {
                        case 0:
                            transitionListener.onTransitionStart(transition, z3);
                            break;
                        case 1:
                            transitionListener.onTransitionEnd(transition, z3);
                            break;
                        case 2:
                            transitionListener.onTransitionCancel(transition);
                            break;
                        case 3:
                            transitionListener.onTransitionPause(transition);
                            break;
                        default:
                            transitionListener.onTransitionResume(transition);
                            break;
                    }
                }
            };
        }

        void notifyListener(@NonNull TransitionListener transitionListener, @NonNull Transition transition, boolean z3);
    }

    public Transition() {
    }

    public static void a(g0 g0Var, View view, f0 f0Var) {
        g0Var.f18051a.put(view, f0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            SparseArray sparseArray = g0Var.f18052b;
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        String strF = androidx.core.view.E.f(view);
        if (strF != null) {
            M.f fVar = g0Var.f18054d;
            if (fVar.containsKey(strF)) {
                fVar.put(strF, null);
            } else {
                fVar.put(strF, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                M.j jVar = g0Var.f18053c;
                if (jVar.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    jVar.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) jVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    jVar.e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static M.f c() {
        M.f fVar = sRunningAnimators.get();
        if (fVar != null) {
            return fVar;
        }
        M.f fVar2 = new M.f(0);
        sRunningAnimators.set(fVar2);
        return fVar2;
    }

    public static boolean d(f0 f0Var, f0 f0Var2, String str) {
        Object obj = f0Var.f18045a.get(str);
        Object obj2 = f0Var2.f18045a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    @NonNull
    public Transition addListener(@NonNull TransitionListener transitionListener) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(transitionListener);
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull View view) {
        this.mTargets.add(view);
        return this;
    }

    @RestrictTo({p192n.c.f39802c})
    public void animate(@Nullable Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new G7.j(this, 5));
        animator.start();
    }

    public final void b(View view, boolean z3) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (this.mTargetTypeExcludes.get(i7).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    f0 f0Var = new f0(view);
                    if (z3) {
                        captureStartValues(f0Var);
                    } else {
                        captureEndValues(f0Var);
                    }
                    f0Var.f18047c.add(this);
                    capturePropagationValues(f0Var);
                    if (z3) {
                        a(this.mStartValues, view, f0Var);
                    } else {
                        a(this.mEndValues, view, f0Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    if (this.mTargetTypeChildExcludes.get(i10).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                                b(viewGroup.getChildAt(i11), z3);
                            }
                        }
                    }
                }
            }
        }
    }

    @RestrictTo({p192n.c.f39802c})
    public void cancel() {
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i7 = size - 1; i7 >= 0; i7--) {
            Animator animator = animatorArr[i7];
            animatorArr[i7] = null;
            animator.cancel();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(TransitionNotification.f18000c, false);
    }

    public abstract void captureEndValues(f0 f0Var);

    public void capturePropagationValues(f0 f0Var) {
        if (this.mPropagation == null || f0Var.f18045a.isEmpty()) {
            return;
        }
        this.mPropagation.getClass();
        String[] strArr = v0.f18129a;
        for (int i7 = 0; i7 < 2; i7++) {
            HashMap map = f0Var.f18045a;
            if (!map.containsKey(strArr[i7])) {
                ((v0) this.mPropagation).getClass();
                View view = f0Var.f18046b;
                Integer numValueOf = (Integer) map.get("android:visibility:visibility");
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(view.getVisibility());
                }
                map.put("android:visibilityPropagation:visibility", numValueOf);
                int[] iArr = {iRound, 0};
                view.getLocationOnScreen(iArr);
                int iRound = Math.round(view.getTranslationX()) + iArr[0];
                iArr[0] = (view.getWidth() / 2) + iRound;
                int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
                iArr[1] = iRound2;
                iArr[1] = (view.getHeight() / 2) + iRound2;
                map.put("android:visibilityPropagation:center", iArr);
                return;
            }
        }
    }

    public abstract void captureStartValues(f0 f0Var);

    public void captureValues(@NonNull ViewGroup viewGroup, boolean z3) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        M.f fVar;
        clearValues(z3);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i7 = 0; i7 < this.mTargetIds.size(); i7++) {
                View viewFindViewById = viewGroup.findViewById(this.mTargetIds.get(i7).intValue());
                if (viewFindViewById != null) {
                    f0 f0Var = new f0(viewFindViewById);
                    if (z3) {
                        captureStartValues(f0Var);
                    } else {
                        captureEndValues(f0Var);
                    }
                    f0Var.f18047c.add(this);
                    capturePropagationValues(f0Var);
                    if (z3) {
                        a(this.mStartValues, viewFindViewById, f0Var);
                    } else {
                        a(this.mEndValues, viewFindViewById, f0Var);
                    }
                }
            }
            for (int i10 = 0; i10 < this.mTargets.size(); i10++) {
                View view = this.mTargets.get(i10);
                f0 f0Var2 = new f0(view);
                if (z3) {
                    captureStartValues(f0Var2);
                } else {
                    captureEndValues(f0Var2);
                }
                f0Var2.f18047c.add(this);
                capturePropagationValues(f0Var2);
                if (z3) {
                    a(this.mStartValues, view, f0Var2);
                } else {
                    a(this.mEndValues, view, f0Var2);
                }
            }
        } else {
            b(viewGroup, z3);
        }
        if (z3 || (fVar = this.mNameOverrides) == null) {
            return;
        }
        int i11 = fVar.f5695c;
        ArrayList arrayList3 = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList3.add((View) this.mStartValues.f18054d.remove((String) this.mNameOverrides.f(i12)));
        }
        for (int i13 = 0; i13 < i11; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.mStartValues.f18054d.put((String) this.mNameOverrides.j(i13), view2);
            }
        }
    }

    public void clearValues(boolean z3) {
        if (z3) {
            this.mStartValues.f18051a.clear();
            this.mStartValues.f18052b.clear();
            this.mStartValues.f18053c.a();
        } else {
            this.mEndValues.f18051a.clear();
            this.mEndValues.f18052b.clear();
            this.mEndValues.f18053c.a();
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, f0 f0Var, f0 f0Var2) {
        return null;
    }

    public void createAnimators(@NonNull ViewGroup viewGroup, @NonNull g0 g0Var, @NonNull g0 g0Var2, @NonNull ArrayList<f0> arrayList, @NonNull ArrayList<f0> arrayList2) {
        Animator animatorCreateAnimator;
        boolean z3;
        int i7;
        View view;
        f0 f0Var;
        Animator animator;
        Animator animator2;
        f0 f0Var2;
        M.f fVarC = c();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z8 = getRootTransition().mSeekController != null;
        long jMin = Long.MAX_VALUE;
        int i10 = 0;
        while (i10 < size) {
            f0 f0Var3 = arrayList.get(i10);
            f0 f0Var4 = arrayList2.get(i10);
            if (f0Var3 != null && !f0Var3.f18047c.contains(this)) {
                f0Var3 = null;
            }
            if (f0Var4 != null && !f0Var4.f18047c.contains(this)) {
                f0Var4 = null;
            }
            if (!(f0Var3 == null && f0Var4 == null) && ((f0Var3 == null || f0Var4 == null || isTransitionRequired(f0Var3, f0Var4)) && (animatorCreateAnimator = createAnimator(viewGroup, f0Var3, f0Var4)) != null)) {
                if (f0Var4 != null) {
                    view = f0Var4.f18046b;
                    String[] transitionProperties = getTransitionProperties();
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        f0Var2 = new f0(view);
                        z3 = z8;
                        i7 = i10;
                        f0 f0Var5 = (f0) g0Var2.f18051a.get(view);
                        if (f0Var5 != null) {
                            int i11 = 0;
                            while (i11 < transitionProperties.length) {
                                HashMap map = f0Var2.f18045a;
                                int i12 = i11;
                                String str = transitionProperties[i12];
                                map.put(str, f0Var5.f18045a.get(str));
                                i11 = i12 + 1;
                            }
                        }
                        int i13 = fVarC.f5695c;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= i13) {
                                animator2 = animatorCreateAnimator;
                                break;
                            }
                            N n10 = (N) fVarC.get((Animator) fVarC.f(i14));
                            if (n10.f17971c != null && n10.f17969a == view && n10.f17970b.equals(getName()) && n10.f17971c.equals(f0Var2)) {
                                animator2 = null;
                                break;
                            }
                            i14++;
                        }
                    } else {
                        z3 = z8;
                        i7 = i10;
                        animator2 = animatorCreateAnimator;
                        f0Var2 = null;
                    }
                    animator = animator2;
                    f0Var = f0Var2;
                } else {
                    z3 = z8;
                    i7 = i10;
                    view = f0Var3.f18046b;
                    f0Var = null;
                }
                if (animator != null) {
                    animator = animatorCreateAnimator;
                    Y y8 = this.mPropagation;
                    if (y8 != null) {
                        long jA = y8.a(viewGroup, this, f0Var3, f0Var4);
                        sparseIntArray.put(this.mAnimators.size(), (int) jA);
                        jMin = Math.min(jA, jMin);
                    }
                    String name = getName();
                    WindowId windowId = viewGroup.getWindowId();
                    N n11 = new N();
                    n11.f17969a = view;
                    n11.f17970b = name;
                    n11.f17971c = f0Var;
                    n11.f17972d = windowId;
                    n11.f17973e = this;
                    n11.f17974f = animator;
                    Object obj = animator;
                    if (z3) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator);
                        obj = animatorSet;
                    }
                    fVarC.put(obj, n11);
                    this.mAnimators.add((Animator) obj);
                } else {
                    animator = animatorCreateAnimator;
                }
            } else {
                size = size;
                z3 = z8;
                i7 = i10;
            }
            i10 = i7 + 1;
            size = size;
            z8 = z3;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                N n12 = (N) fVarC.get(this.mAnimators.get(sparseIntArray.keyAt(i15)));
                n12.f17974f.setStartDelay(n12.f17974f.getStartDelay() + (((long) sparseIntArray.valueAt(i15)) - jMin));
            }
        }
    }

    @NonNull
    @RequiresApi(34)
    public TransitionSeekController createSeekController() {
        S s3 = new S(this);
        this.mSeekController = s3;
        addListener(s3);
        return this.mSeekController;
    }

    public final void e(Transition transition, TransitionNotification transitionNotification, boolean z3) {
        Transition transition2 = this.mCloneParent;
        if (transition2 != null) {
            transition2.e(transition, transitionNotification, z3);
        }
        ArrayList<TransitionListener> arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        TransitionListener[] transitionListenerArr = this.mListenersCache;
        if (transitionListenerArr == null) {
            transitionListenerArr = new TransitionListener[size];
        }
        this.mListenersCache = null;
        TransitionListener[] transitionListenerArr2 = (TransitionListener[]) this.mListeners.toArray(transitionListenerArr);
        for (int i7 = 0; i7 < size; i7++) {
            transitionNotification.notifyListener(transitionListenerArr2[i7], transition, z3);
            transitionListenerArr2[i7] = null;
        }
        this.mListenersCache = transitionListenerArr2;
    }

    @RestrictTo({p192n.c.f39802c})
    public void end() {
        int i7 = this.mNumInstances - 1;
        this.mNumInstances = i7;
        if (i7 == 0) {
            notifyListeners(TransitionNotification.f17999b, false);
            for (int i10 = 0; i10 < this.mStartValues.f18053c.g(); i10++) {
                View view = (View) this.mStartValues.f18053c.h(i10);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i11 = 0; i11 < this.mEndValues.f18053c.g(); i11++) {
                View view2 = (View) this.mEndValues.f18053c.h(i11);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    @NonNull
    public Transition excludeChildren(@NonNull View view, boolean z3) {
        ArrayList<View> arrayListA = this.mTargetChildExcludes;
        if (view != null) {
            arrayListA = z3 ? K.a(view, arrayListA) : K.e(view, arrayListA);
        }
        this.mTargetChildExcludes = arrayListA;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull View view, boolean z3) {
        ArrayList<View> arrayListA = this.mTargetExcludes;
        if (view != null) {
            arrayListA = z3 ? K.a(view, arrayListA) : K.e(view, arrayListA);
        }
        this.mTargetExcludes = arrayListA;
        return this;
    }

    @RestrictTo({p192n.c.f39802c})
    public void forceToEnd(@Nullable ViewGroup viewGroup) {
        M.f fVarC = c();
        int i7 = fVarC.f5695c;
        if (viewGroup == null || i7 == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        M.f fVar = new M.f(fVarC);
        fVarC.clear();
        for (int i10 = i7 - 1; i10 >= 0; i10--) {
            N n10 = (N) fVar.j(i10);
            if (n10.f17969a != null && windowId.equals(n10.f17972d)) {
                ((Animator) fVar.f(i10)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    @Nullable
    public Rect getEpicenter() {
        O o10 = this.mEpicenterCallback;
        if (o10 == null) {
            return null;
        }
        return o10.a();
    }

    @Nullable
    public O getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public f0 getMatchedTransitionValues(View view, boolean z3) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getMatchedTransitionValues(view, z3);
        }
        ArrayList<f0> arrayList = z3 ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            }
            f0 f0Var = arrayList.get(i7);
            if (f0Var == null) {
                return null;
            }
            if (f0Var.f18046b == view) {
                break;
            }
            i7++;
        }
        if (i7 >= 0) {
            return (z3 ? this.mEndValuesList : this.mStartValuesList).get(i7);
        }
        return null;
    }

    @NonNull
    public String getName() {
        return this.mName;
    }

    @NonNull
    public PathMotion getPathMotion() {
        return this.mPathMotion;
    }

    @Nullable
    public Y getPropagation() {
        return this.mPropagation;
    }

    @NonNull
    public final Transition getRootTransition() {
        TransitionSet transitionSet = this.mParent;
        return transitionSet != null ? transitionSet.getRootTransition() : this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    @NonNull
    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    @Nullable
    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    @Nullable
    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    @NonNull
    public List<View> getTargets() {
        return this.mTargets;
    }

    public final long getTotalDurationMillis() {
        return this.mTotalDuration;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return null;
    }

    @Nullable
    public f0 getTransitionValues(@NonNull View view, boolean z3) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getTransitionValues(view, z3);
        }
        return (f0) (z3 ? this.mStartValues : this.mEndValues).f18051a.get(view);
    }

    public boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public boolean isTransitionRequired(@Nullable f0 f0Var, @Nullable f0 f0Var2) {
        if (f0Var != null && f0Var2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (d(f0Var, f0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = f0Var.f18045a.keySet().iterator();
                while (it.hasNext()) {
                    if (d(f0Var, f0Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (this.mTargetTypeExcludes.get(i7).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null) {
            WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
            if (androidx.core.view.E.f(view) != null && this.mTargetNameExcludes.contains(androidx.core.view.E.f(view))) {
                return false;
            }
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id2)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null) {
            WeakHashMap weakHashMap2 = androidx.core.view.N.f16168a;
            if (arrayList6.contains(androidx.core.view.E.f(view))) {
                return true;
            }
        }
        if (this.mTargetTypes != null) {
            for (int i10 = 0; i10 < this.mTargetTypes.size(); i10++) {
                if (this.mTargetTypes.get(i10).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void notifyListeners(TransitionNotification transitionNotification, boolean z3) {
        e(this, transitionNotification, z3);
    }

    @RestrictTo({p192n.c.f39802c})
    public void pause(@Nullable View view) {
        if (this.mEnded) {
            return;
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i7 = size - 1; i7 >= 0; i7--) {
            Animator animator = animatorArr[i7];
            animatorArr[i7] = null;
            animator.pause();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(TransitionNotification.f18001d, false);
        this.mPaused = true;
    }

    public void playTransition(@NonNull ViewGroup viewGroup) {
        N n10;
        View view;
        f0 f0Var;
        View view2;
        View view3;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        g0 g0Var = this.mStartValues;
        g0 g0Var2 = this.mEndValues;
        M.f fVar = new M.f(g0Var.f18051a);
        M.f fVar2 = new M.f(g0Var2.f18051a);
        int i7 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i7 >= iArr.length) {
                break;
            }
            int i10 = iArr[i7];
            if (i10 == 1) {
                for (int i11 = fVar.f5695c - 1; i11 >= 0; i11--) {
                    View view4 = (View) fVar.f(i11);
                    if (view4 != null && isValidTarget(view4) && (f0Var = (f0) fVar2.remove(view4)) != null && isValidTarget(f0Var.f18046b)) {
                        this.mStartValuesList.add((f0) fVar.h(i11));
                        this.mEndValuesList.add(f0Var);
                    }
                }
            } else if (i10 == 2) {
                M.f fVar3 = g0Var.f18054d;
                M.f fVar4 = g0Var2.f18054d;
                int i12 = fVar3.f5695c;
                for (int i13 = 0; i13 < i12; i13++) {
                    View view5 = (View) fVar3.j(i13);
                    if (view5 != null && isValidTarget(view5) && (view2 = (View) fVar4.get(fVar3.f(i13))) != null && isValidTarget(view2)) {
                        f0 f0Var2 = (f0) fVar.get(view5);
                        f0 f0Var3 = (f0) fVar2.get(view2);
                        if (f0Var2 != null && f0Var3 != null) {
                            this.mStartValuesList.add(f0Var2);
                            this.mEndValuesList.add(f0Var3);
                            fVar.remove(view5);
                            fVar2.remove(view2);
                        }
                    }
                }
            } else if (i10 == 3) {
                SparseArray sparseArray = g0Var.f18052b;
                SparseArray sparseArray2 = g0Var2.f18052b;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    View view6 = (View) sparseArray.valueAt(i14);
                    if (view6 != null && isValidTarget(view6) && (view3 = (View) sparseArray2.get(sparseArray.keyAt(i14))) != null && isValidTarget(view3)) {
                        f0 f0Var4 = (f0) fVar.get(view6);
                        f0 f0Var5 = (f0) fVar2.get(view3);
                        if (f0Var4 != null && f0Var5 != null) {
                            this.mStartValuesList.add(f0Var4);
                            this.mEndValuesList.add(f0Var5);
                            fVar.remove(view6);
                            fVar2.remove(view3);
                        }
                    }
                }
            } else if (i10 == 4) {
                M.j jVar = g0Var.f18053c;
                int iG = jVar.g();
                for (int i15 = 0; i15 < iG; i15++) {
                    View view7 = (View) jVar.h(i15);
                    if (view7 != null && isValidTarget(view7)) {
                        View view8 = (View) g0Var2.f18053c.b(jVar.d(i15));
                        if (view8 != null && isValidTarget(view8)) {
                            f0 f0Var6 = (f0) fVar.get(view7);
                            f0 f0Var7 = (f0) fVar2.get(view8);
                            if (f0Var6 != null && f0Var7 != null) {
                                this.mStartValuesList.add(f0Var6);
                                this.mEndValuesList.add(f0Var7);
                                fVar.remove(view7);
                                fVar2.remove(view8);
                            }
                        }
                    }
                }
            }
            i7++;
        }
        for (int i16 = 0; i16 < fVar.f5695c; i16++) {
            f0 f0Var8 = (f0) fVar.j(i16);
            if (isValidTarget(f0Var8.f18046b)) {
                this.mStartValuesList.add(f0Var8);
                this.mEndValuesList.add(null);
            }
        }
        for (int i17 = 0; i17 < fVar2.f5695c; i17++) {
            f0 f0Var9 = (f0) fVar2.j(i17);
            if (isValidTarget(f0Var9.f18046b)) {
                this.mEndValuesList.add(f0Var9);
                this.mStartValuesList.add(null);
            }
        }
        M.f fVarC = c();
        int i18 = fVarC.f5695c;
        WindowId windowId = viewGroup.getWindowId();
        for (int i19 = i18 - 1; i19 >= 0; i19--) {
            Animator animator = (Animator) fVarC.f(i19);
            if (animator != null && (n10 = (N) fVarC.get(animator)) != null && (view = n10.f17969a) != null && windowId.equals(n10.f17972d)) {
                f0 transitionValues = getTransitionValues(view, true);
                f0 matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = (f0) this.mEndValues.f18051a.get(view);
                }
                if (transitionValues != null || matchedTransitionValues != null) {
                    Transition transition = n10.f17973e;
                    if (transition.isTransitionRequired(n10.f17971c, matchedTransitionValues)) {
                        if (transition.getRootTransition().mSeekController != null) {
                            animator.cancel();
                            transition.mCurrentAnimators.remove(animator);
                            fVarC.remove(animator);
                            if (transition.mCurrentAnimators.size() == 0) {
                                transition.notifyListeners(TransitionNotification.f18000c, false);
                                if (!transition.mEnded) {
                                    transition.mEnded = true;
                                    transition.notifyListeners(TransitionNotification.f17999b, false);
                                }
                            }
                        } else if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            fVarC.remove(animator);
                        }
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        if (this.mSeekController == null) {
            runAnimators();
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            prepareAnimatorsForSeeking();
            S s3 = this.mSeekController;
            Transition transition2 = s3.f17987o;
            long j6 = transition2.getTotalDurationMillis() == 0 ? 1L : 0L;
            transition2.setCurrentPlayTimeMillis(j6, s3.f17978a);
            s3.f17978a = j6;
            S s8 = this.mSeekController;
            s8.f17981d = true;
            ArrayList arrayList = s8.f17979b;
            if (arrayList != null) {
                s8.f17979b = null;
                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                    ((Consumer) arrayList.get(i20)).accept(s8);
                }
            }
            s8.a();
        }
    }

    @RequiresApi(34)
    public void prepareAnimatorsForSeeking() {
        M.f fVarC = c();
        this.mTotalDuration = 0L;
        for (int i7 = 0; i7 < this.mAnimators.size(); i7++) {
            Animator animator = this.mAnimators.get(i7);
            N n10 = (N) fVarC.get(animator);
            if (animator != null && n10 != null) {
                long duration = getDuration();
                Animator animator2 = n10.f17974f;
                if (duration >= 0) {
                    animator2.setDuration(getDuration());
                }
                if (getStartDelay() >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + getStartDelay());
                }
                if (getInterpolator() != null) {
                    animator2.setInterpolator(getInterpolator());
                }
                this.mCurrentAnimators.add(animator);
                this.mTotalDuration = Math.max(this.mTotalDuration, P.a(animator));
            }
        }
        this.mAnimators.clear();
    }

    @NonNull
    public Transition removeListener(@NonNull TransitionListener transitionListener) {
        Transition transition;
        ArrayList<TransitionListener> arrayList = this.mListeners;
        if (arrayList != null) {
            if (!arrayList.remove(transitionListener) && (transition = this.mCloneParent) != null) {
                transition.removeListener(transitionListener);
            }
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull View view) {
        this.mTargets.remove(view);
        return this;
    }

    @RestrictTo({p192n.c.f39802c})
    public void resume(@Nullable View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                int size = this.mCurrentAnimators.size();
                Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
                this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
                for (int i7 = size - 1; i7 >= 0; i7--) {
                    Animator animator = animatorArr[i7];
                    animatorArr[i7] = null;
                    animator.resume();
                }
                this.mAnimatorCache = animatorArr;
                notifyListeners(TransitionNotification.f18002e, false);
            }
            this.mPaused = false;
        }
    }

    @RestrictTo({p192n.c.f39802c})
    public void runAnimators() {
        start();
        M.f fVarC = c();
        for (Animator animator : this.mAnimators) {
            if (fVarC.containsKey(animator)) {
                start();
                if (animator != null) {
                    animator.addListener(new M(this, fVarC));
                    animate(animator);
                }
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void setCanRemoveViews(boolean z3) {
        this.mCanRemoveViews = z3;
    }

    @RequiresApi(34)
    public void setCurrentPlayTimeMillis(long j6, long j10) {
        long totalDurationMillis = getTotalDurationMillis();
        int i7 = 0;
        boolean z3 = j6 < j10;
        if ((j10 < 0 && j6 >= 0) || (j10 > totalDurationMillis && j6 <= totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(TransitionNotification.f17998a, z3);
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        while (i7 < size) {
            Animator animator = animatorArr[i7];
            animatorArr[i7] = null;
            P.b(animator, Math.min(Math.max(0L, j6), P.a(animator)));
            i7++;
            totalDurationMillis = totalDurationMillis;
        }
        long j11 = totalDurationMillis;
        this.mAnimatorCache = animatorArr;
        if ((j6 <= j11 || j10 > j11) && (j6 >= 0 || j10 < 0)) {
            return;
        }
        if (j6 > j11) {
            this.mEnded = true;
        }
        notifyListeners(TransitionNotification.f17999b, z3);
    }

    @NonNull
    public Transition setDuration(long j6) {
        this.mDuration = j6;
        return this;
    }

    public void setEpicenterCallback(@Nullable O o10) {
        this.mEpicenterCallback = o10;
    }

    @NonNull
    public Transition setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(@Nullable int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int i10 = iArr[i7];
            if (i10 < 1 || i10 > 4) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            for (int i11 = 0; i11 < i7; i11++) {
                if (iArr[i11] == i10) {
                    throw new IllegalArgumentException("matches contains a duplicate value");
                }
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(@Nullable PathMotion pathMotion) {
        if (pathMotion == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = pathMotion;
        }
    }

    public void setPropagation(@Nullable Y y8) {
        this.mPropagation = y8;
    }

    @NonNull
    public Transition setStartDelay(long j6) {
        this.mStartDelay = j6;
        return this;
    }

    @RestrictTo({p192n.c.f39802c})
    public void start() {
        if (this.mNumInstances == 0) {
            notifyListeners(TransitionNotification.f17998a, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    @NonNull
    public String toString() {
        return toString("");
    }

    @NonNull
    public Transition addTarget(@IdRes int i7) {
        if (i7 != 0) {
            this.mTargetIds.add(Integer.valueOf(i7));
        }
        return this;
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Transition mo73clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.mAnimators = new ArrayList<>();
            transition.mStartValues = new g0();
            transition.mEndValues = new g0();
            transition.mStartValuesList = null;
            transition.mEndValuesList = null;
            transition.mSeekController = null;
            transition.mCloneParent = this;
            transition.mListeners = null;
            return transition;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    public Transition removeTarget(@IdRes int i7) {
        if (i7 != 0) {
            this.mTargetIds.remove(Integer.valueOf(i7));
        }
        return this;
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.mDuration != -1) {
            sb2.append("dur(");
            sb2.append(this.mDuration);
            sb2.append(") ");
        }
        if (this.mStartDelay != -1) {
            sb2.append("dly(");
            sb2.append(this.mStartDelay);
            sb2.append(") ");
        }
        if (this.mInterpolator != null) {
            sb2.append("interp(");
            sb2.append(this.mInterpolator);
            sb2.append(") ");
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            sb2.append("tgts(");
            if (this.mTargetIds.size() > 0) {
                for (int i7 = 0; i7 < this.mTargetIds.size(); i7++) {
                    if (i7 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.mTargetIds.get(i7));
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i10 = 0; i10 < this.mTargets.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.mTargets.get(i10));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    @NonNull
    public Transition addTarget(@NonNull String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @NonNull
    public Transition excludeChildren(@IdRes int i7, boolean z3) {
        ArrayList<Integer> arrayListE = this.mTargetIdChildExcludes;
        if (i7 > 0) {
            if (z3) {
                arrayListE = K.a(Integer.valueOf(i7), arrayListE);
            } else {
                arrayListE = K.e(Integer.valueOf(i7), arrayListE);
            }
        }
        this.mTargetIdChildExcludes = arrayListE;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@IdRes int i7, boolean z3) {
        ArrayList<Integer> arrayListE = this.mTargetIdExcludes;
        if (i7 > 0) {
            if (z3) {
                arrayListE = K.a(Integer.valueOf(i7), arrayListE);
            } else {
                arrayListE = K.e(Integer.valueOf(i7), arrayListE);
            }
        }
        this.mTargetIdExcludes = arrayListE;
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    @NonNull
    public Transition excludeChildren(@NonNull Class<?> cls, boolean z3) {
        ArrayList<Class<?>> arrayListE = this.mTargetTypeChildExcludes;
        if (cls != null) {
            if (z3) {
                arrayListE = K.a(cls, arrayListE);
            } else {
                arrayListE = K.e(cls, arrayListE);
            }
        }
        this.mTargetTypeChildExcludes = arrayListE;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull String str, boolean z3) {
        ArrayList<String> arrayListE = this.mTargetNameExcludes;
        if (str != null) {
            if (z3) {
                arrayListE = K.a(str, arrayListE);
            } else {
                arrayListE = K.e(str, arrayListE);
            }
        }
        this.mTargetNameExcludes = arrayListE;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull Class<?> cls, boolean z3) {
        ArrayList<Class<?>> arrayListE = this.mTargetTypeExcludes;
        if (cls != null) {
            if (z3) {
                arrayListE = K.a(cls, arrayListE);
            } else {
                arrayListE = K.e(cls, arrayListE);
            }
        }
        this.mTargetTypeExcludes = arrayListE;
        return this;
    }

    public Transition(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K.f17948a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jC = Y.a.c(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jC >= 0) {
            setDuration(jC);
        }
        long j6 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startDelay") != null ? typedArrayObtainStyledAttributes.getInt(2, -1) : -1;
        if (j6 > 0) {
            setStartDelay(j6);
        }
        int resourceId = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String strD = Y.a.d(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strD != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strD, ",");
            int[] iArr = new int[stringTokenizer.countTokens()];
            int i7 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(strTrim)) {
                    iArr[i7] = 3;
                } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(strTrim)) {
                    iArr[i7] = 1;
                } else if ("name".equalsIgnoreCase(strTrim)) {
                    iArr[i7] = 2;
                } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(strTrim)) {
                    iArr[i7] = 4;
                } else if (strTrim.isEmpty()) {
                    int[] iArr2 = new int[iArr.length - 1];
                    System.arraycopy(iArr, 0, iArr2, 0, i7);
                    i7--;
                    iArr = iArr2;
                } else {
                    throw new InflateException(N8.q0.k("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                i7++;
            }
            setMatchOrder(iArr);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
