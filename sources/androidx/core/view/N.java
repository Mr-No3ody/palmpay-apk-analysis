package androidx.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f16168a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f16169b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f16170c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f16171d = {W.c.accessibility_custom_action_0, W.c.accessibility_custom_action_1, W.c.accessibility_custom_action_2, W.c.accessibility_custom_action_3, W.c.accessibility_custom_action_4, W.c.accessibility_custom_action_5, W.c.accessibility_custom_action_6, W.c.accessibility_custom_action_7, W.c.accessibility_custom_action_8, W.c.accessibility_custom_action_9, W.c.accessibility_custom_action_10, W.c.accessibility_custom_action_11, W.c.accessibility_custom_action_12, W.c.accessibility_custom_action_13, W.c.accessibility_custom_action_14, W.c.accessibility_custom_action_15, W.c.accessibility_custom_action_16, W.c.accessibility_custom_action_17, W.c.accessibility_custom_action_18, W.c.accessibility_custom_action_19, W.c.accessibility_custom_action_20, W.c.accessibility_custom_action_21, W.c.accessibility_custom_action_22, W.c.accessibility_custom_action_23, W.c.accessibility_custom_action_24, W.c.accessibility_custom_action_25, W.c.accessibility_custom_action_26, W.c.accessibility_custom_action_27, W.c.accessibility_custom_action_28, W.c.accessibility_custom_action_29, W.c.accessibility_custom_action_30, W.c.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1073z f16172e = new C1073z();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final B f16173f = new B();

    public static U a(View view) {
        if (f16168a == null) {
            f16168a = new WeakHashMap();
        }
        U u6 = (U) f16168a.get(view);
        if (u6 != null) {
            return u6;
        }
        U u10 = new U(view);
        f16168a.put(view, u10);
        return u10;
    }

    public static q0 b(View view, q0 q0Var) {
        WindowInsets windowInsetsG = q0Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsA = C.a(view, windowInsetsG);
            if (!windowInsetsA.equals(windowInsetsG)) {
                return q0.h(view, windowInsetsA);
            }
        }
        return q0Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = M.f16164d;
        M m7 = (M) view.getTag(W.c.tag_unhandled_key_event_manager);
        if (m7 == null) {
            m7 = new M();
            m7.f16165a = null;
            m7.f16166b = null;
            m7.f16167c = null;
            view.setTag(W.c.tag_unhandled_key_event_manager, m7);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = m7.f16165a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = M.f16164d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (m7.f16165a == null) {
                            m7.f16165a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = M.f16164d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                m7.f16165a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    m7.f16165a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = m7.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (m7.f16166b == null) {
                    m7.f16166b = new SparseArray();
                }
                m7.f16166b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static C1050b d(View view) {
        View.AccessibilityDelegate accessibilityDelegateE = e(view);
        if (accessibilityDelegateE == null) {
            return null;
        }
        return accessibilityDelegateE instanceof C1049a ? ((C1049a) accessibilityDelegateE).f16197a : new C1050b(accessibilityDelegateE);
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return J.a(view);
        }
        if (f16170c) {
            return null;
        }
        if (f16169b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f16169b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f16170c = true;
                return null;
            }
        }
        try {
            Object obj = f16169b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f16170c = true;
            return null;
        }
    }

    public static CharSequence f(View view) {
        Object tag;
        int i7 = W.c.tag_accessibility_pane_title;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = I.a(view);
        } else {
            tag = view.getTag(i7);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(W.c.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(W.c.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] h(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? L.a(appCompatEditText) : (String[]) appCompatEditText.getTag(W.c.tag_on_receive_content_mime_types);
    }

    public static w0 i(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return K.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new w0(view, window);
                }
                return null;
            }
        }
        return null;
    }

    public static boolean j(View view) {
        return e(view) != null;
    }

    public static void k(int i7, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z3 = f(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z3) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z3 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i7);
                if (z3) {
                    accessibilityEventObtain.getText().add(f(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i7 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i7);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i7);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(f(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static q0 l(View view, q0 q0Var) {
        WindowInsets windowInsetsG = q0Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsB = C.b(view, windowInsetsG);
            if (!windowInsetsB.equals(windowInsetsG)) {
                return q0.h(view, windowInsetsB);
            }
        }
        return q0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1054f m(View view, C1054f c1054f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c1054f);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return L.b(view, c1054f);
        }
        OnReceiveContentListener onReceiveContentListener = (OnReceiveContentListener) view.getTag(W.c.tag_on_receive_content_listener);
        OnReceiveContentViewBehavior onReceiveContentViewBehavior = f16172e;
        if (onReceiveContentListener == null) {
            if (view instanceof OnReceiveContentViewBehavior) {
                onReceiveContentViewBehavior = (OnReceiveContentViewBehavior) view;
            }
            return onReceiveContentViewBehavior.onReceiveContent(c1054f);
        }
        C1054f c1054fOnReceiveContent = onReceiveContentListener.onReceiveContent(view, c1054f);
        if (c1054fOnReceiveContent == null) {
            return null;
        }
        if (view instanceof OnReceiveContentViewBehavior) {
            onReceiveContentViewBehavior = (OnReceiveContentViewBehavior) view;
        }
        return onReceiveContentViewBehavior.onReceiveContent(c1054fOnReceiveContent);
    }

    public static void n(int i7, View view) {
        ArrayList arrayListG = g(view);
        for (int i10 = 0; i10 < arrayListG.size(); i10++) {
            if (((p074f0.c) arrayListG.get(i10)).a() == i7) {
                arrayListG.remove(i10);
                return;
            }
        }
    }

    public static void o(View view, p074f0.c cVar, String str, AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && str == null) {
            n(cVar.a(), view);
            k(0, view);
            return;
        }
        p074f0.c cVar2 = new p074f0.c(null, cVar.f36356b, str, accessibilityViewCommand, cVar.f36357c);
        C1050b c1050bD = d(view);
        if (c1050bD == null) {
            c1050bD = new C1050b();
        }
        q(view, c1050bD);
        n(cVar2.a(), view);
        g(view).add(cVar2);
        k(0, view);
    }

    public static void p(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            J.b(view, context, iArr, attributeSet, typedArray, i7, i10);
        }
    }

    public static void q(View view, C1050b c1050b) {
        if (c1050b == null && (e(view) instanceof C1049a)) {
            c1050b = new C1050b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c1050b == null ? null : c1050b.getBridge());
    }

    public static void r(View view, CharSequence charSequence) {
        new A(W.c.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        B b7 = f16173f;
        if (charSequence == null) {
            b7.f16160a.remove(view);
            view.removeOnAttachStateChangeListener(b7);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(b7);
        } else {
            b7.f16160a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(b7);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(b7);
            }
        }
    }

    public static void s(View view, int i7) {
        if (Build.VERSION.SDK_INT >= 26) {
            H.c(view, i7);
        }
    }

    public static void t(View view, W w3) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new a0(w3));
            return;
        }
        PathInterpolator pathInterpolator = Z.f16194e;
        Object tag = view.getTag(W.c.tag_on_apply_window_listener);
        View.OnApplyWindowInsetsListener y8 = new Y(view, w3);
        view.setTag(W.c.tag_window_insets_animation_callback, y8);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(y8);
        }
    }
}
