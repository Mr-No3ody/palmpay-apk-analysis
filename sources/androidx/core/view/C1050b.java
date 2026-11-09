package androidx.core.view;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1050b {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    public C1050b() {
        this(DEFAULT_DELEGATE);
    }

    public static List<p074f0.c> getActionList(View view) {
        List<p074f0.c> list = (List) view.getTag(W.c.tag_accessibility_actions);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public boolean dispatchPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Nullable
    public p074f0.g getAccessibilityNodeProvider(@NonNull View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new p074f0.g(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull p074f0.d dVar) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, dVar.f36360a);
    }

    public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(@NonNull View view, int i7, @Nullable Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List<p074f0.c> actionList = getActionList(view);
        boolean z3 = false;
        int i10 = 0;
        while (true) {
            if (i10 < actionList.size()) {
                p074f0.c cVar = actionList.get(i10);
                if (cVar.a() == i7) {
                    AccessibilityViewCommand accessibilityViewCommand = cVar.f36358d;
                    if (accessibilityViewCommand != null) {
                        Class cls = cVar.f36357c;
                        if (cls != null) {
                            try {
                                if (cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            } catch (Exception e10) {
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                            }
                        }
                        zPerformAccessibilityAction = accessibilityViewCommand.perform(view, null);
                        break;
                    }
                } else {
                    i10++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.mOriginalDelegate.performAccessibilityAction(view, i7, bundle);
        }
        if (zPerformAccessibilityAction || i7 != W.c.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(W.c.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i12 = 0; clickableSpanArr != null && i12 < clickableSpanArr.length; i12++) {
                if (clickableSpan.equals(clickableSpanArr[i12])) {
                    clickableSpan.onClick(view);
                    z3 = true;
                    break;
                }
            }
        }
        return z3;
    }

    public void sendAccessibilityEvent(@NonNull View view, int i7) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i7);
    }

    public void sendAccessibilityEventUnchecked(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C1050b(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C1049a(this);
    }
}
