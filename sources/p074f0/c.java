package p074f0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.camera.core.imagecapture.i;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f36343e = new c(1, (String) null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f36344f = new c(2, (String) null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f36345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f36346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f36347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f36348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f36349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f36350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f36351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f36352n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f36353o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f36354p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f36355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f36357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityViewCommand f36358d;

    static {
        new c(4, (String) null);
        new c(8, (String) null);
        f36345g = new c(16, (String) null);
        f36346h = new c(32, (String) null);
        new c(64, (String) null);
        new c(128, (String) null);
        new c(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, i.class);
        new c(512, i.class);
        new c(1024, j.class);
        new c(2048, j.class);
        f36347i = new c(4096, (String) null);
        f36348j = new c(UserMetadata.MAX_INTERNAL_KEY_SIZE, (String) null);
        new c(16384, (String) null);
        new c(32768, (String) null);
        new c(65536, (String) null);
        new c(131072, n.class);
        f36349k = new c(CodePushConstants.DOWNLOAD_BUFFER_SIZE, (String) null);
        f36350l = new c(524288, (String) null);
        f36351m = new c(1048576, (String) null);
        new c(2097152, o.class);
        int i7 = Build.VERSION.SDK_INT;
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, l.class);
        f36352n = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f36353o = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new c(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new c(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new c(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new c(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        f36354p = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, m.class);
        new c(i7 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, k.class);
        new c(i7 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new c(i7 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new c(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new c(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new c(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new c(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new c(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new c(i7 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new c(i7 >= 34 ? i.b() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public c(int i7, String str) {
        this(null, i7, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f36355a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f36355a;
        Object obj3 = this.f36355a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f36355a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String strE = d.e(this.f36356b);
        if (strE.equals("ACTION_UNKNOWN")) {
            Object obj = this.f36355a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strE = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(strE);
        return sb2.toString();
    }

    public c(int i7, Class cls) {
        this(null, i7, null, null, cls);
    }

    public c(Object obj, int i7, String str, AccessibilityViewCommand accessibilityViewCommand, Class cls) {
        this.f36356b = i7;
        this.f36358d = accessibilityViewCommand;
        if (obj == null) {
            this.f36355a = new AccessibilityNodeInfo.AccessibilityAction(i7, str);
        } else {
            this.f36355a = obj;
        }
        this.f36357c = cls;
    }
}
