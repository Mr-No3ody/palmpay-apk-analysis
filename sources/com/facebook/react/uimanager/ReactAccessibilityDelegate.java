package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.N;
import com.facebook.react.R;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.api.Service;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.core.config.BillBusinessType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import p074f0.g;
import p183m6.j;

/* JADX INFO: loaded from: classes.dex */
public class ReactAccessibilityDelegate extends androidx.customview.widget.b {
    private static final int SEND_EVENT = 1;
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_DISABLED = "disabled";
    private static final String STATE_SELECTED = "selected";
    private static final String TAG = "ReactAccessibilityDelegate";
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    public static final String TOP_ACCESSIBILITY_ACTION_EVENT = "topAccessibilityAction";
    private static final String delimiter = ", ";
    private static final int delimiterLength;
    public static final HashMap<String, Integer> sActionIdMap;
    private static int sCounter;
    private final HashMap<Integer, String> mAccessibilityActionsMap;

    @Nullable
    View mAccessibilityLabelledBy;
    private Handler mHandler;
    private final View mView;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.ReactAccessibilityDelegate$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole;
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role;

        static {
            int[] iArr = new int[Role.values().length];
            $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role = iArr;
            try {
                iArr[Role.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.CHECKBOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.COMBOBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.GRID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.HEADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.IMG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.LINK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.MENU.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.MENUBAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.MENUITEM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.NONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.PROGRESSBAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.RADIO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.RADIOGROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.SCROLLBAR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.SEARCHBOX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.SLIDER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.SPINBUTTON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.SUMMARY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.SWITCH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.TAB.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.TABLIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.TIMER.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.TOOLBAR.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr2 = new int[AccessibilityRole.values().length];
            $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole = iArr2;
            try {
                iArr2[AccessibilityRole.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.DROPDOWNLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.TOGGLEBUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.IMAGEBUTTON.ordinal()] = 6;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.KEYBOARDKEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.TEXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.ADJUSTABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.CHECKBOX.ordinal()] = 10;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.RADIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.SPINBUTTON.ordinal()] = 12;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.SWITCH.ordinal()] = 13;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.GRID.ordinal()] = 15;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.SCROLLVIEW.ordinal()] = 16;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.HORIZONTALSCROLLVIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.PAGER.ordinal()] = 18;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.DRAWERLAYOUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.SLIDINGDRAWER.ordinal()] = 20;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.ICONMENU.ordinal()] = 21;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.VIEWGROUP.ordinal()] = 22;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.WEBVIEW.ordinal()] = 23;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.NONE.ordinal()] = 24;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.LINK.ordinal()] = 25;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.SUMMARY.ordinal()] = 26;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.HEADER.ordinal()] = 27;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.ALERT.ordinal()] = 28;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.COMBOBOX.ordinal()] = 29;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.MENU.ordinal()] = 30;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.MENUBAR.ordinal()] = 31;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.MENUITEM.ordinal()] = 32;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.PROGRESSBAR.ordinal()] = 33;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.RADIOGROUP.ordinal()] = 34;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.SCROLLBAR.ordinal()] = 35;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.TAB.ordinal()] = 36;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.TABLIST.ordinal()] = 37;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.TIMER.ordinal()] = 38;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.TOOLBAR.ordinal()] = 39;
            } catch (NoSuchFieldError unused65) {
            }
        }
    }

    public enum AccessibilityRole {
        NONE,
        BUTTON,
        DROPDOWNLIST,
        TOGGLEBUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        LIST,
        GRID,
        PAGER,
        SCROLLVIEW,
        HORIZONTALSCROLLVIEW,
        VIEWGROUP,
        WEBVIEW,
        DRAWERLAYOUT,
        SLIDINGDRAWER,
        ICONMENU,
        TOOLBAR;

        @Nullable
        public static AccessibilityRole fromRole(Role role) {
            switch (AnonymousClass3.$SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[role.ordinal()]) {
                case 1:
                    return ALERT;
                case 2:
                    return BUTTON;
                case 3:
                    return CHECKBOX;
                case 4:
                    return COMBOBOX;
                case 5:
                    return GRID;
                case 6:
                    return HEADER;
                case 7:
                    return IMAGE;
                case 8:
                    return LINK;
                case 9:
                    return LIST;
                case 10:
                    return MENU;
                case 11:
                    return MENUBAR;
                case 12:
                    return MENUITEM;
                case 13:
                    return NONE;
                case 14:
                    return PROGRESSBAR;
                case 15:
                    return RADIO;
                case 16:
                    return RADIOGROUP;
                case 17:
                    return SCROLLBAR;
                case 18:
                    return SEARCH;
                case 19:
                    return ADJUSTABLE;
                case 20:
                    return SPINBUTTON;
                case 21:
                    return SUMMARY;
                case 22:
                    return SWITCH;
                case 23:
                    return TAB;
                case 24:
                    return TABLIST;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    return TIMER;
                case 26:
                    return TOOLBAR;
                default:
                    return null;
            }
        }

        public static AccessibilityRole fromValue(@Nullable String str) {
            if (str == null) {
                return NONE;
            }
            for (AccessibilityRole accessibilityRole : values()) {
                if (accessibilityRole.name().equalsIgnoreCase(str)) {
                    return accessibilityRole;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: ".concat(str));
        }

        @Nullable
        public static AccessibilityRole fromViewTag(View view) {
            Role role = (Role) view.getTag(R.id.role);
            return role != null ? fromRole(role) : (AccessibilityRole) view.getTag(R.id.accessibility_role);
        }

        public static String getValue(AccessibilityRole accessibilityRole) {
            switch (AnonymousClass3.$SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[accessibilityRole.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.Spinner";
                case 3:
                    return "android.widget.ToggleButton";
                case 4:
                    return "android.widget.EditText";
                case 5:
                    return "android.widget.ImageView";
                case 6:
                    return "android.widget.ImageButton";
                case 7:
                    return "android.inputmethodservice.Keyboard$Key";
                case 8:
                    return "android.widget.TextView";
                case 9:
                    return "android.widget.SeekBar";
                case 10:
                    return "android.widget.CheckBox";
                case 11:
                    return "android.widget.RadioButton";
                case 12:
                    return "android.widget.SpinButton";
                case 13:
                    return "android.widget.Switch";
                case 14:
                    return "android.widget.AbsListView";
                case 15:
                    return "android.widget.GridView";
                case 16:
                    return "android.widget.ScrollView";
                case 17:
                    return "android.widget.HorizontalScrollView";
                case 18:
                    return "androidx.viewpager.widget.ViewPager";
                case 19:
                    return "androidx.drawerlayout.widget.DrawerLayout";
                case 20:
                    return "android.widget.SlidingDrawer";
                case 21:
                    return "com.android.internal.view.menu.IconMenuView";
                case 22:
                    return "android.view.ViewGroup";
                case 23:
                    return "android.webkit.WebView";
                case 24:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                case 39:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + accessibilityRole);
            }
        }
    }

    public enum Role {
        ALERT,
        ALERTDIALOG,
        APPLICATION,
        ARTICLE,
        BANNER,
        BUTTON,
        CELL,
        CHECKBOX,
        COLUMNHEADER,
        COMBOBOX,
        COMPLEMENTARY,
        CONTENTINFO,
        DEFINITION,
        DIALOG,
        DIRECTORY,
        DOCUMENT,
        FEED,
        FIGURE,
        FORM,
        GRID,
        GROUP,
        HEADING,
        IMG,
        LINK,
        LIST,
        LISTITEM,
        LOG,
        MAIN,
        MARQUEE,
        MATH,
        MENU,
        MENUBAR,
        MENUITEM,
        METER,
        NAVIGATION,
        NONE,
        NOTE,
        OPTION,
        PRESENTATION,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        REGION,
        ROW,
        ROWGROUP,
        ROWHEADER,
        SCROLLBAR,
        SEARCHBOX,
        SEPARATOR,
        SLIDER,
        SPINBUTTON,
        STATUS,
        SUMMARY,
        SWITCH,
        TAB,
        TABLE,
        TABLIST,
        TABPANEL,
        TERM,
        TIMER,
        TOOLBAR,
        TOOLTIP,
        TREE,
        TREEGRID,
        TREEITEM;

        @Nullable
        public static Role fromValue(@Nullable String str) {
            for (Role role : values()) {
                if (role.name().equalsIgnoreCase(str)) {
                    return role;
                }
            }
            return null;
        }
    }

    static {
        HashMap<String, Integer> map = new HashMap<>();
        sActionIdMap = map;
        sCounter = 1056964608;
        delimiterLength = 2;
        map.put(RemoteConfigComponent.ACTIVATE_FILE_NAME, Integer.valueOf(p074f0.c.f36345g.a()));
        map.put("longpress", Integer.valueOf(p074f0.c.f36346h.a()));
        map.put("increment", Integer.valueOf(p074f0.c.f36347i.a()));
        map.put("decrement", Integer.valueOf(p074f0.c.f36348j.a()));
        map.put("expand", Integer.valueOf(p074f0.c.f36349k.a()));
        map.put(StackTraceHelper.COLLAPSE_KEY, Integer.valueOf(p074f0.c.f36350l.a()));
    }

    public ReactAccessibilityDelegate(View view, boolean z3, int i7) {
        super(view);
        this.mView = view;
        this.mAccessibilityActionsMap = new HashMap<>();
        this.mHandler = new Handler() { // from class: com.facebook.react.uimanager.ReactAccessibilityDelegate.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                ((View) message.obj).sendAccessibilityEvent(4);
            }
        };
        view.setFocusable(z3);
        WeakHashMap weakHashMap = N.f16168a;
        view.setImportantForAccessibility(i7);
    }

    @Nullable
    public static p074f0.d createNodeInfoFromView(View view) {
        if (view == null) {
            return null;
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        p074f0.d dVar = new p074f0.d(accessibilityNodeInfoObtain);
        try {
            WeakHashMap weakHashMap = N.f16168a;
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            return dVar;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Nullable
    public static CharSequence getTalkbackDescription(View view, @Nullable p074f0.d dVar) {
        p074f0.d dVarCreateNodeInfoFromView = dVar == null ? createNodeInfoFromView(view) : new p074f0.d(AccessibilityNodeInfo.obtain(dVar.f36360a));
        if (dVarCreateNodeInfoFromView != null) {
            CharSequence contentDescription = dVarCreateNodeInfoFromView.f36360a.getContentDescription();
            CharSequence charSequenceH = dVarCreateNodeInfoFromView.h();
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceH);
            boolean z3 = view instanceof EditText;
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(contentDescription) && (!z3 || zIsEmpty)) {
                sb2.append(contentDescription);
                return sb2;
            }
            if (!zIsEmpty) {
                sb2.append(charSequenceH);
                return sb2;
            }
            if (view instanceof ViewGroup) {
                StringBuilder sb3 = new StringBuilder();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    p074f0.d dVar2 = new p074f0.d(accessibilityNodeInfoObtain);
                    WeakHashMap weakHashMap = N.f16168a;
                    childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
                    if (isSpeakingNode(dVar2, childAt) && !isAccessibilityFocusable(dVar2, childAt)) {
                        CharSequence talkbackDescription = getTalkbackDescription(childAt, null);
                        if (!TextUtils.isEmpty(talkbackDescription)) {
                            sb3.append(((Object) talkbackDescription) + delimiter);
                        }
                    }
                }
                return removeFinalDelimiter(sb3);
            }
        }
        return null;
    }

    public static boolean hasNonActionableSpeakingDescendants(@Nullable p074f0.d dVar, @Nullable View view) {
        if (dVar != null && view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt != null) {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    p074f0.d dVar2 = new p074f0.d(accessibilityNodeInfoObtain);
                    WeakHashMap weakHashMap = N.f16168a;
                    childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
                    if (accessibilityNodeInfoObtain.isVisibleToUser() && !isAccessibilityFocusable(dVar2, childAt) && isSpeakingNode(dVar2, childAt)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean hasStateDescription(@Nullable p074f0.d dVar) {
        if (dVar == null) {
            return false;
        }
        int i7 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f36360a;
        return !TextUtils.isEmpty(i7 >= 30 ? Z.b.d(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY")) || accessibilityNodeInfo.isCheckable() || hasValidRangeInfo(dVar);
    }

    public static boolean hasText(@Nullable p074f0.d dVar) {
        if (dVar == null) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f36360a;
        AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
        if ((collectionInfo != null ? new Sd.b(collectionInfo, 20) : null) != null) {
            return false;
        }
        if (TextUtils.isEmpty(dVar.h()) && TextUtils.isEmpty(accessibilityNodeInfo.getContentDescription())) {
            return !TextUtils.isEmpty(Build.VERSION.SDK_INT >= 26 ? accessibilityNodeInfo.getHintText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY"));
        }
        return true;
    }

    public static boolean hasValidRangeInfo(@Nullable p074f0.d dVar) {
        if (dVar == null) {
            return false;
        }
        AccessibilityNodeInfo.RangeInfo rangeInfo = dVar.f36360a.getRangeInfo();
        j jVar = rangeInfo != null ? new j(rangeInfo, 18) : null;
        if (jVar == null) {
            return false;
        }
        AccessibilityNodeInfo.RangeInfo rangeInfo2 = (AccessibilityNodeInfo.RangeInfo) jVar.f39520b;
        float max = rangeInfo2.getMax();
        float min = rangeInfo2.getMin();
        float current = rangeInfo2.getCurrent();
        return max - min > 0.0f && current >= min && current <= max;
    }

    public static boolean isAccessibilityFocusable(@Nullable p074f0.d dVar, @Nullable View view) {
        if (dVar == null || view == null) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f36360a;
        if (accessibilityNodeInfo.isVisibleToUser()) {
            return (Build.VERSION.SDK_INT >= 28 ? accessibilityNodeInfo.isScreenReaderFocusable() : dVar.f(1)) || isActionableForAccessibility(dVar);
        }
        return false;
    }

    public static boolean isActionableForAccessibility(@Nullable p074f0.d dVar) {
        if (dVar == null) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f36360a;
        if (!accessibilityNodeInfo.isClickable() && !accessibilityNodeInfo.isLongClickable() && !accessibilityNodeInfo.isFocusable()) {
            ArrayList arrayListD = dVar.d();
            if (!arrayListD.contains(16) && !arrayListD.contains(32) && !arrayListD.contains(1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpeakingNode(@Nullable p074f0.d dVar, @Nullable View view) {
        if (dVar != null && view != null) {
            WeakHashMap weakHashMap = N.f16168a;
            int importantForAccessibility = view.getImportantForAccessibility();
            if (importantForAccessibility != 4) {
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f36360a;
                if (importantForAccessibility != 2 || accessibilityNodeInfo.getChildCount() > 0) {
                    return hasText(dVar) || hasStateDescription(dVar) || accessibilityNodeInfo.isCheckable() || hasNonActionableSpeakingDescendants(dVar, view);
                }
            }
        }
        return false;
    }

    private static String removeFinalDelimiter(StringBuilder sb2) {
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - delimiterLength, length);
        }
        return sb2.toString();
    }

    public static void resetDelegate(View view, boolean z3, int i7) {
        N.q(view, new ReactAccessibilityDelegate(view, z3, i7));
    }

    private void scheduleAccessibilityEventSender(View view) {
        if (this.mHandler.hasMessages(1, view)) {
            this.mHandler.removeMessages(1, view);
        }
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1, view), 200L);
    }

    public static void setDelegate(View view, boolean z3, int i7) {
        if (N.j(view)) {
            return;
        }
        if (view.getTag(R.id.accessibility_role) == null && view.getTag(R.id.accessibility_state) == null && view.getTag(R.id.accessibility_actions) == null && view.getTag(R.id.react_test_id) == null && view.getTag(R.id.accessibility_collection_item) == null && view.getTag(R.id.accessibility_links) == null && view.getTag(R.id.role) == null) {
            return;
        }
        N.q(view, new ReactAccessibilityDelegate(view, z3, i7));
    }

    public static void setRole(p074f0.d dVar, AccessibilityRole accessibilityRole, Context context) {
        if (accessibilityRole == null) {
            accessibilityRole = AccessibilityRole.NONE;
        }
        dVar.k(AccessibilityRole.getValue(accessibilityRole));
        if (accessibilityRole.equals(AccessibilityRole.LINK)) {
            dVar.q(context.getString(R.string.link_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.IMAGE)) {
            dVar.q(context.getString(R.string.image_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.IMAGEBUTTON)) {
            dVar.q(context.getString(R.string.imagebutton_description));
            dVar.l(true);
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.BUTTON)) {
            dVar.l(true);
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.TOGGLEBUTTON)) {
            dVar.l(true);
            dVar.f36360a.setCheckable(true);
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.SUMMARY)) {
            dVar.q(context.getString(R.string.summary_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.HEADER)) {
            dVar.p(true);
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.ALERT)) {
            dVar.q(context.getString(R.string.alert_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.COMBOBOX)) {
            dVar.q(context.getString(R.string.combobox_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.MENU)) {
            dVar.q(context.getString(R.string.menu_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.MENUBAR)) {
            dVar.q(context.getString(R.string.menubar_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.MENUITEM)) {
            dVar.q(context.getString(R.string.menuitem_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.PROGRESSBAR)) {
            dVar.q(context.getString(R.string.progressbar_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.RADIOGROUP)) {
            dVar.q(context.getString(R.string.radiogroup_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.SCROLLBAR)) {
            dVar.q(context.getString(R.string.scrollbar_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.SPINBUTTON)) {
            dVar.q(context.getString(R.string.spinbutton_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.TAB)) {
            dVar.q(context.getString(R.string.rn_tab_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.TABLIST)) {
            dVar.q(context.getString(R.string.tablist_description));
        } else if (accessibilityRole.equals(AccessibilityRole.TIMER)) {
            dVar.q(context.getString(R.string.timer_description));
        } else if (accessibilityRole.equals(AccessibilityRole.TOOLBAR)) {
            dVar.q(context.getString(R.string.toolbar_description));
        }
    }

    private static void setState(p074f0.d dVar, ReadableMap readableMap, Context context) {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(strNextKey);
            if (strNextKey.equals(STATE_SELECTED) && dynamic.getType() == ReadableType.Boolean) {
                dVar.f36360a.setSelected(dynamic.asBoolean());
            } else if (strNextKey.equals(STATE_DISABLED) && dynamic.getType() == ReadableType.Boolean) {
                dVar.f36360a.setEnabled(!dynamic.asBoolean());
            } else if (strNextKey.equals(STATE_CHECKED) && dynamic.getType() == ReadableType.Boolean) {
                boolean zAsBoolean = dynamic.asBoolean();
                dVar.f36360a.setCheckable(true);
                dVar.f36360a.setChecked(zAsBoolean);
            }
        }
    }

    @Override // androidx.customview.widget.b, androidx.core.view.C1050b
    @Nullable
    public g getAccessibilityNodeProvider(View view) {
        return null;
    }

    public View getHostView() {
        return this.mView;
    }

    @Override // androidx.customview.widget.b
    public int getVirtualViewAt(float f10, float f11) {
        return Integer.MIN_VALUE;
    }

    @Override // androidx.customview.widget.b
    public void getVisibleVirtualViews(List<Integer> list) {
    }

    @Override // androidx.customview.widget.b, androidx.core.view.C1050b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int iAsInt = dynamic.asInt();
                    int iAsInt2 = dynamic2.asInt();
                    int iAsInt3 = dynamic3.asInt();
                    if (iAsInt3 <= iAsInt || iAsInt2 < iAsInt || iAsInt3 < iAsInt2) {
                        return;
                    }
                    accessibilityEvent.setItemCount(iAsInt3 - iAsInt);
                    accessibilityEvent.setCurrentItemIndex(iAsInt2);
                }
            }
        }
    }

    @Override // androidx.customview.widget.b, androidx.core.view.C1050b
    public void onInitializeAccessibilityNodeInfo(View view, p074f0.d dVar) {
        super.onInitializeAccessibilityNodeInfo(view, dVar);
        if (view.getTag(R.id.accessibility_state_expanded) != null) {
            dVar.a(((Boolean) view.getTag(R.id.accessibility_state_expanded)).booleanValue() ? 524288 : CodePushConstants.DOWNLOAD_BUFFER_SIZE);
        }
        AccessibilityRole accessibilityRoleFromViewTag = AccessibilityRole.fromViewTag(view);
        String str = (String) view.getTag(R.id.accessibility_hint);
        if (accessibilityRoleFromViewTag != null) {
            setRole(dVar, accessibilityRoleFromViewTag, view.getContext());
        }
        if (str != null) {
            int i7 = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo accessibilityNodeInfo = dVar.f36360a;
            if (i7 >= 28) {
                accessibilityNodeInfo.setTooltipText(str);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", str);
            }
        }
        Object tag = view.getTag(R.id.labelled_by);
        if (tag != null) {
            View viewFindView = ReactFindViewUtil.findView(view.getRootView(), (String) tag);
            this.mAccessibilityLabelledBy = viewFindView;
            if (viewFindView != null) {
                dVar.f36360a.setLabeledBy(viewFindView);
            }
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_state);
        if (readableMap != null) {
            setState(dVar, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(R.id.accessibility_actions);
        ReadableMap readableMap2 = (ReadableMap) view.getTag(R.id.accessibility_collection_item);
        if (readableMap2 != null) {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfoObtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(readableMap2.getInt("rowIndex"), readableMap2.getInt("rowSpan"), readableMap2.getInt("columnIndex"), readableMap2.getInt("columnSpan"), readableMap2.getBoolean("heading"));
            dVar.getClass();
            dVar.f36360a.setCollectionItemInfo(collectionItemInfoObtain);
        }
        boolean z3 = true;
        if (readableArray != null) {
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                ReadableMap map = readableArray.getMap(i10);
                if (!map.hasKey("name")) {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
                int iIntValue = sCounter;
                String string = map.hasKey(Constants.ScionAnalytics.PARAM_LABEL) ? map.getString(Constants.ScionAnalytics.PARAM_LABEL) : null;
                HashMap<String, Integer> map2 = sActionIdMap;
                if (map2.containsKey(map.getString("name"))) {
                    iIntValue = map2.get(map.getString("name")).intValue();
                } else {
                    sCounter++;
                }
                this.mAccessibilityActionsMap.put(Integer.valueOf(iIntValue), map.getString("name"));
                dVar.b(new p074f0.c(iIntValue, string));
            }
        }
        ReadableMap readableMap3 = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (readableMap3 != null && readableMap3.hasKey("min") && readableMap3.hasKey("now") && readableMap3.hasKey("max")) {
            Dynamic dynamic = readableMap3.getDynamic("min");
            Dynamic dynamic2 = readableMap3.getDynamic("now");
            Dynamic dynamic3 = readableMap3.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int iAsInt = dynamic.asInt();
                    int iAsInt2 = dynamic2.asInt();
                    int iAsInt3 = dynamic3.asInt();
                    if (iAsInt3 > iAsInt && iAsInt2 >= iAsInt && iAsInt3 >= iAsInt2) {
                        AccessibilityNodeInfo.RangeInfo rangeInfoObtain = AccessibilityNodeInfo.RangeInfo.obtain(0, iAsInt, iAsInt3, iAsInt2);
                        dVar.getClass();
                        dVar.f36360a.setRangeInfo(rangeInfoObtain);
                    }
                }
            }
        }
        String str2 = (String) view.getTag(R.id.react_test_id);
        if (str2 != null) {
            dVar.f36360a.setViewIdResourceName(str2);
        }
        boolean z8 = TextUtils.isEmpty(dVar.f36360a.getContentDescription()) && TextUtils.isEmpty(dVar.h());
        if (readableArray == null && readableMap == null && tag == null && accessibilityRoleFromViewTag == null) {
            z3 = false;
        }
        if (z8 && z3) {
            dVar.o(getTalkbackDescription(view, dVar));
        }
    }

    @Override // androidx.customview.widget.b
    public boolean onPerformActionForVirtualView(int i7, int i10, @Nullable Bundle bundle) {
        return false;
    }

    @Override // androidx.customview.widget.b
    public void onPopulateNodeForVirtualView(int i7, @NonNull p074f0.d dVar) {
        dVar.o("");
        dVar.j(new Rect(0, 0, 1, 1));
    }

    @Override // androidx.core.view.C1050b
    public boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
        if (i7 == 524288) {
            view.setTag(R.id.accessibility_state_expanded, Boolean.FALSE);
        }
        if (i7 == 262144) {
            view.setTag(R.id.accessibility_state_expanded, Boolean.TRUE);
        }
        if (!this.mAccessibilityActionsMap.containsKey(Integer.valueOf(i7))) {
            return super.performAccessibilityAction(view, i7, bundle);
        }
        final WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("actionName", this.mAccessibilityActionsMap.get(Integer.valueOf(i7)));
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext.hasActiveReactInstance()) {
            int id2 = view.getId();
            int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
            UIManager uIManager = UIManagerHelper.getUIManager(reactContext, ViewUtil.getUIManagerType(id2));
            if (uIManager != null) {
                uIManager.getEventDispatcher().dispatchEvent(new Event(surfaceId, id2) { // from class: com.facebook.react.uimanager.ReactAccessibilityDelegate.2
                    @Override // com.facebook.react.uimanager.events.Event
                    public WritableMap getEventData() {
                        return writableMapCreateMap;
                    }

                    @Override // com.facebook.react.uimanager.events.Event
                    public String getEventName() {
                        return ReactAccessibilityDelegate.TOP_ACCESSIBILITY_ACTION_EVENT;
                    }
                });
            }
        } else {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        AccessibilityRole accessibilityRole = (AccessibilityRole) view.getTag(R.id.accessibility_role);
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (accessibilityRole != AccessibilityRole.ADJUSTABLE) {
            return true;
        }
        if (i7 != p074f0.c.f36347i.a() && i7 != p074f0.c.f36348j.a()) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey(ReactTextInputShadowNode.PROP_TEXT)) {
            scheduleAccessibilityEventSender(view);
        }
        return super.performAccessibilityAction(view, i7, bundle);
    }

    @Nullable
    public g superGetAccessibilityNodeProvider(View view) {
        return super.getAccessibilityNodeProvider(view);
    }
}
