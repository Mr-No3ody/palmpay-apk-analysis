package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.core.view.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1049a extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1050b f16197a;

    public C1049a(C1050b c1050b) {
        this.f16197a = c1050b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f16197a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        p074f0.g accessibilityNodeProvider = this.f16197a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return accessibilityNodeProvider.f36363a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f16197a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object tag2;
        Object tag3;
        int iKeyAt;
        int i7 = 1;
        p074f0.d dVar = new p074f0.d(accessibilityNodeInfo);
        WeakHashMap weakHashMap = N.f16168a;
        int i10 = W.c.tag_screen_reader_focusable;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(I.c(view));
        } else {
            tag = view.getTag(i10);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i11 = 0;
        boolean z3 = bool != null && bool.booleanValue();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z3);
        } else {
            dVar.i(1, z3);
        }
        int i13 = W.c.tag_accessibility_heading;
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(I.b(view));
        } else {
            tag2 = view.getTag(i13);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        dVar.p(bool2 != null && bool2.booleanValue());
        CharSequence charSequenceF = N.f(view);
        if (i12 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequenceF);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceF);
        }
        int i14 = W.c.tag_state_description;
        if (i12 >= 30) {
            tag3 = K.a(view);
        } else {
            tag3 = view.getTag(i14);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag3;
        if (i12 >= 30) {
            Z.b.g(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f16197a.onInitializeAccessibilityNodeInfo(view, dVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i12 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(W.c.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                    if (((WeakReference) sparseArray.valueAt(i15)).get() == null) {
                        arrayList.add(Integer.valueOf(i15));
                    }
                }
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    sparseArray.remove(((Integer) arrayList.get(i16)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", W.c.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(W.c.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(W.c.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i17 = 0;
                while (i17 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i17];
                    int i18 = i11;
                    while (true) {
                        if (i18 >= sparseArray2.size()) {
                            iKeyAt = p074f0.d.f36359c;
                            p074f0.d.f36359c = iKeyAt + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i18)).get())) {
                                iKeyAt = sparseArray2.keyAt(i18);
                                break;
                            }
                            i18 += i7;
                        }
                    }
                    sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i17]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i17];
                    Spanned spanned = (Spanned) text;
                    dVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    dVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    dVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    dVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                    i17++;
                    i7 = i7;
                    i11 = 0;
                }
            }
        }
        List<p074f0.c> actionList = C1050b.getActionList(view);
        for (int i19 = 0; i19 < actionList.size(); i19++) {
            dVar.b(actionList.get(i19));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f16197a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f16197a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
        return this.f16197a.performAccessibilityAction(view, i7, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i7) {
        this.f16197a.sendAccessibilityEvent(view, i7);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f16197a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
