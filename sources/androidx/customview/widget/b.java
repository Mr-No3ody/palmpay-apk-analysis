package androidx.customview.widget;

import M.k;
import M.o;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C1050b;
import androidx.core.view.N;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.sufficientlysecure.htmltextview.m;
import org.sufficientlysecure.htmltextview.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends C1050b {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final FocusStrategy$BoundsAdapter<p074f0.d> NODE_ADAPTER = new m(3);
    private static final FocusStrategy$CollectionAdapter<o, p074f0.d> SPARSE_VALUES_ADAPTER = new n(3);
    private final View mHost;
    private final AccessibilityManager mManager;
    private a mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    public b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = N.f16168a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public final AccessibilityEvent a(int i7, int i10) {
        if (i7 == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
            this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i10);
        p074f0.d dVarObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i7);
        accessibilityEventObtain2.getText().add(dVarObtainAccessibilityNodeInfo.h());
        AccessibilityNodeInfo accessibilityNodeInfo = dVarObtainAccessibilityNodeInfo.f36360a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        onPopulateEventForVirtualView(i7, accessibilityEventObtain2);
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(this.mHost, i7);
        accessibilityEventObtain2.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final p074f0.d b(int i7) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        p074f0.d dVar = new p074f0.d(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        dVar.k(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        dVar.j(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        accessibilityNodeInfoObtain.setParent(this.mHost);
        onPopulateNodeForVirtualView(i7, dVar);
        if (dVar.h() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        dVar.g(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(this.mHost.getContext().getPackageName());
        View view = this.mHost;
        dVar.f36361b = i7;
        accessibilityNodeInfoObtain.setSource(view, i7);
        if (this.mAccessibilityFocusedVirtualViewId == i7) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            dVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            dVar.a(64);
        }
        boolean z3 = this.mKeyboardFocusedVirtualViewId == i7;
        if (z3) {
            dVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            dVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z3);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        accessibilityNodeInfoObtain.getBoundsInScreen(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            dVar.g(this.mTempScreenRect);
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(this.mTempScreenRect);
                Rect rect2 = this.mTempScreenRect;
                if (rect2 != null && !rect2.isEmpty() && this.mHost.getWindowVisibility() == 0) {
                    Object parent = this.mHost.getParent();
                    while (parent instanceof View) {
                        View view2 = (View) parent;
                        if (view2.getAlpha() > 0.0f && view2.getVisibility() == 0) {
                            parent = view2.getParent();
                        }
                    }
                    if (parent != null) {
                        dVar.f36360a.setVisibleToUser(true);
                    }
                }
            }
        }
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:88:0x018c  */
    public final boolean c(int i7, Rect rect) {
        Object obj;
        p074f0.d dVar;
        int iC;
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        o oVar = new o();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            oVar.d(((Integer) arrayList.get(i10)).intValue(), b(((Integer) arrayList.get(i10)).intValue()));
        }
        int i11 = this.mKeyboardFocusedVirtualViewId;
        p074f0.d dVar2 = i11 == Integer.MIN_VALUE ? null : (p074f0.d) oVar.b(i11);
        int i12 = -1;
        if (i7 == 1 || i7 == 2) {
            View view = this.mHost;
            WeakHashMap weakHashMap = N.f16168a;
            boolean z3 = view.getLayoutDirection() == 1;
            FocusStrategy$CollectionAdapter<o, p074f0.d> focusStrategy$CollectionAdapter = SPARSE_VALUES_ADAPTER;
            FocusStrategy$BoundsAdapter<p074f0.d> focusStrategy$BoundsAdapter = NODE_ADAPTER;
            int size = focusStrategy$CollectionAdapter.size(oVar);
            ArrayList arrayList2 = new ArrayList(size);
            for (int i13 = 0; i13 < size; i13++) {
                arrayList2.add(focusStrategy$CollectionAdapter.get(oVar, i13));
            }
            Collections.sort(arrayList2, new c(z3, focusStrategy$BoundsAdapter));
            if (i7 == 1) {
                int size2 = arrayList2.size();
                if (dVar2 != null) {
                    size2 = arrayList2.indexOf(dVar2);
                }
                int i14 = size2 - 1;
                if (i14 >= 0) {
                    obj = arrayList2.get(i14);
                } else {
                    obj = null;
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size3 = arrayList2.size();
                int iLastIndexOf = (dVar2 == null ? -1 : arrayList2.lastIndexOf(dVar2)) + 1;
                if (iLastIndexOf < size3) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            dVar = (p074f0.d) obj;
        } else {
            if (i7 != 17 && i7 != 33 && i7 != 66 && i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i15 = this.mKeyboardFocusedVirtualViewId;
            if (i15 != Integer.MIN_VALUE) {
                obtainAccessibilityNodeInfo(i15).g(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                View view2 = this.mHost;
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (i7 == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i7 == 33) {
                    rect2.set(0, height, width, height);
                } else if (i7 == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            FocusStrategy$CollectionAdapter<o, p074f0.d> focusStrategy$CollectionAdapter2 = SPARSE_VALUES_ADAPTER;
            FocusStrategy$BoundsAdapter<p074f0.d> focusStrategy$BoundsAdapter2 = NODE_ADAPTER;
            Rect rect3 = new Rect(rect2);
            if (i7 == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i7 == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i7 == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i7 != 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            int size4 = focusStrategy$CollectionAdapter2.size(oVar);
            Rect rect4 = new Rect();
            p074f0.d dVar3 = null;
            for (int i16 = 0; i16 < size4; i16++) {
                p074f0.d dVar4 = focusStrategy$CollectionAdapter2.get(oVar, i16);
                if (dVar4 != dVar2) {
                    focusStrategy$BoundsAdapter2.obtainBounds(dVar4, rect4);
                    if (p118hf.a.z(i7, rect2, rect4)) {
                        if (!p118hf.a.z(i7, rect2, rect3) || p118hf.a.c(i7, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            dVar3 = dVar4;
                        } else if (!p118hf.a.c(i7, rect2, rect3, rect4)) {
                            int iD = p118hf.a.D(i7, rect2, rect4);
                            int iF = p118hf.a.F(i7, rect2, rect4);
                            int i17 = (iF * iF) + (iD * 13 * iD);
                            int iD2 = p118hf.a.D(i7, rect2, rect3);
                            int iF2 = p118hf.a.F(i7, rect2, rect3);
                            if (i17 < (iF2 * iF2) + (iD2 * 13 * iD2)) {
                                rect3.set(rect4);
                                dVar3 = dVar4;
                            }
                        }
                    }
                }
            }
            dVar = dVar3;
        }
        p074f0.d dVar5 = dVar;
        if (dVar5 == null) {
            iC = Integer.MIN_VALUE;
        } else {
            if (oVar.f5696a) {
                k.a(oVar);
            }
            int i18 = oVar.f5699d;
            for (int i19 = 0; i19 < i18; i19++) {
                if (oVar.f5698c[i19] == dVar5) {
                    i12 = i19;
                    break;
                }
            }
            iC = oVar.c(i12);
        }
        return requestKeyboardFocusForVirtualView(iC);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i7) {
        if (this.mKeyboardFocusedVirtualViewId != i7) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i7, false);
        sendEventForVirtualView(i7, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        int i7;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            int i10 = this.mHoveredVirtualViewId;
            if (i10 != virtualViewAt) {
                this.mHoveredVirtualViewId = virtualViewAt;
                sendEventForVirtualView(virtualViewAt, 128);
                sendEventForVirtualView(i10, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            }
            if (virtualViewAt == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i7 = this.mHoveredVirtualViewId) == Integer.MIN_VALUE) {
                return false;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.mHoveredVirtualViewId = Integer.MIN_VALUE;
                sendEventForVirtualView(Integer.MIN_VALUE, 128);
                sendEventForVirtualView(i7, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    public final boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        int i7;
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i11 = 33;
                                } else if (keyCode == 21) {
                                    i11 = 17;
                                } else if (keyCode != 22) {
                                    i11 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z3 = false;
                                while (i10 < repeatCount && c(i11, null)) {
                                    i10++;
                                    z3 = true;
                                }
                                return z3;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i7 = this.mKeyboardFocusedVirtualViewId;
                                if (i7 != Integer.MIN_VALUE) {
                                    onPerformActionForVirtualView(i7, 16, null);
                                }
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i7 = this.mKeyboardFocusedVirtualViewId;
                    if (i7 != Integer.MIN_VALUE) {
                        onPerformActionForVirtualView(i7, 16, null);
                    }
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return c(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return c(1, null);
                }
            }
        }
        return false;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // androidx.core.view.C1050b
    public p074f0.g getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new a(this);
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public abstract int getVirtualViewAt(float f10, float f11);

    public abstract void getVisibleVirtualViews(List list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i7) {
        invalidateVirtualView(i7, 0);
    }

    @NonNull
    public p074f0.d obtainAccessibilityNodeInfo(int i7) {
        if (i7 != -1) {
            return b(i7);
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.mHost);
        p074f0.d dVar = new p074f0.d(accessibilityNodeInfoObtain);
        View view = this.mHost;
        WeakHashMap weakHashMap = N.f16168a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            dVar.f36360a.addChild(this.mHost, ((Integer) arrayList.get(i10)).intValue());
        }
        return dVar;
    }

    public final void onFocusChanged(boolean z3, int i7, @Nullable Rect rect) {
        int i10 = this.mKeyboardFocusedVirtualViewId;
        if (i10 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i10);
        }
        if (z3) {
            c(i7, rect);
        }
    }

    @Override // androidx.core.view.C1050b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.C1050b
    public void onInitializeAccessibilityNodeInfo(View view, p074f0.d dVar) {
        super.onInitializeAccessibilityNodeInfo(view, dVar);
        onPopulateNodeForHost(dVar);
    }

    public abstract boolean onPerformActionForVirtualView(int i7, int i10, Bundle bundle);

    public void onPopulateEventForHost(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i7, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public abstract void onPopulateNodeForVirtualView(int i7, p074f0.d dVar);

    public void onVirtualViewKeyboardFocusChanged(int i7, boolean z3) {
    }

    public boolean performAction(int i7, int i10, Bundle bundle) {
        int i11;
        if (i7 == -1) {
            View view = this.mHost;
            WeakHashMap weakHashMap = N.f16168a;
            return view.performAccessibilityAction(i10, bundle);
        }
        if (i10 == 1) {
            return requestKeyboardFocusForVirtualView(i7);
        }
        if (i10 == 2) {
            return clearKeyboardFocusForVirtualView(i7);
        }
        if (i10 != 64) {
            if (i10 != 128) {
                return onPerformActionForVirtualView(i7, i10, bundle);
            }
            if (this.mAccessibilityFocusedVirtualViewId != i7) {
                return false;
            }
            this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
            this.mHost.invalidate();
            sendEventForVirtualView(i7, 65536);
            return true;
        }
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i11 = this.mAccessibilityFocusedVirtualViewId) == i7) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
            this.mHost.invalidate();
            sendEventForVirtualView(i11, 65536);
        }
        this.mAccessibilityFocusedVirtualViewId = i7;
        this.mHost.invalidate();
        sendEventForVirtualView(i7, 32768);
        return true;
    }

    public final boolean requestKeyboardFocusForVirtualView(int i7) {
        int i10;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i10 = this.mKeyboardFocusedVirtualViewId) == i7) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i10);
        }
        if (i7 == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i7;
        onVirtualViewKeyboardFocusChanged(i7, true);
        sendEventForVirtualView(i7, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i7, int i10) {
        ViewParent parent;
        if (i7 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, a(i7, i10));
    }

    public final void invalidateVirtualView(int i7, int i10) {
        ViewParent parent;
        if (i7 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventA = a(i7, 2048);
        accessibilityEventA.setContentChangeTypes(i10);
        parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventA);
    }

    public void onPopulateNodeForHost(@NonNull p074f0.d dVar) {
    }
}
