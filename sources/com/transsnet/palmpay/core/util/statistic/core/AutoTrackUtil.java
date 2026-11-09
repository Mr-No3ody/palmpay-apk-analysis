package com.transsnet.palmpay.core.util.statistic.core;

import F6.d;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.appcompat.app.AbstractC0824b;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p025ba.e;

/* JADX INFO: loaded from: classes3.dex */
public class AutoTrackUtil {
    private static final String TAG = "AutoTrackUtil";
    private static final SimpleDateFormat mDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());

    public static void addViewRemark(View view, String remark) {
        if (view != null) {
            view.setTag(e.core_auto_track_tag_view_remark, remark);
        }
    }

    public static Activity getActivityFromContext(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    public static Activity getActivityFromView(View view) {
        Context context = view.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    public static String getActivityName(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            return getShortClassName(activity.getClass().getCanonicalName());
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String getActivityTitle(Activity activity) {
        AbstractC0824b supportActionBar;
        if (activity != null) {
            try {
                String string = (!(activity instanceof AbstractActivityC0837o) || (supportActionBar = ((AbstractActivityC0837o) activity).getSupportActionBar()) == null || TextUtils.isEmpty(supportActionBar.g())) ? null : supportActionBar.g().toString();
                return TextUtils.isEmpty(string) ? activity.getTitle().toString() : string;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String getAutoTrackExtra(Activity activity) {
        try {
            View decorView = activity.getWindow().getDecorView();
            String str = (String) decorView.getTag(e.core_auto_track_tag_trans_type);
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(str)) {
                sb2.append(LogConstants.Autotrack.ELEMENT_TRANS_TYPE);
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                sb2.append(str);
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
            String str2 = (String) decorView.getTag(e.core_auto_track_tag_trans_result);
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(LogConstants.Autotrack.ELEMENT_TRANS_RESULT);
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                sb2.append(str2);
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
            JSONObject jSONObject = (JSONObject) decorView.getTag(e.core_auto_track_tag_activity_properties);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                sb2.append(next);
                sb2.append(":");
                if (obj instanceof Date) {
                    SimpleDateFormat simpleDateFormat = mDateFormat;
                    synchronized (simpleDateFormat) {
                        sb2.append(simpleDateFormat.format((Date) obj));
                        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    }
                } else {
                    sb2.append(obj);
                }
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
            return sb2.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static int getChildIndex(ViewParent parent, View child) {
        if (parent != null) {
            try {
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    String viewId = getViewId(child);
                    String canonicalName = child.getClass().getCanonicalName();
                    int i7 = 0;
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (hasClassName(childAt, canonicalName)) {
                            String viewId2 = getViewId(childAt);
                            if ((viewId == null || viewId.equals(viewId2)) && childAt == child) {
                                return i7;
                            }
                            i7++;
                        }
                    }
                    return -1;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return -1;
    }

    public static String getFragmentName(View view) {
        ViewParent parent;
        if (view == null) {
            return null;
        }
        try {
            String str = (String) view.getTag(e.core_auto_track_tag_view_fragment_name);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            do {
                parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    view = (ViewGroup) parent;
                    String str2 = (String) view.getTag(e.core_auto_track_tag_view_fragment_name);
                    if (!TextUtils.isEmpty(str2)) {
                        return str2;
                    }
                }
            } while (parent instanceof ViewGroup);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return null;
    }

    public static String getScreenNameFromView(Activity activity, View view) {
        if (view != null) {
            try {
                String str = (String) view.getTag(e.core_auto_track_tag_view_fragment_name);
                String shortClassName = getShortClassName(activity != null ? activity.getClass().getCanonicalName() : null);
                String shortClassName2 = getShortClassName(str);
                if (!TextUtils.isEmpty(shortClassName2) && !TextUtils.isEmpty(shortClassName)) {
                    Locale locale = Locale.CHINA;
                    return shortClassName + "|" + shortClassName2;
                }
                if (!TextUtils.isEmpty(shortClassName2)) {
                    return shortClassName2;
                }
                if (!TextUtils.isEmpty(shortClassName)) {
                    return shortClassName;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static String getShortClassName(String className) {
        return (!TextUtils.isEmpty(className) && className.startsWith("com.transsnet.palmpay.")) ? className.substring(22) : className;
    }

    private static String getTopActivity(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1);
        if (runningTasks != null) {
            return runningTasks.get(0).topActivity.getClassName();
        }
        return null;
    }

    public static String getViewId(View view) {
        try {
            if (view.getId() != -1) {
                return view.getContext().getResources().getResourceEntryName(view.getId());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getViewPath(View view) {
        ViewParent parent;
        if (view == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            do {
                parent = view.getParent();
                arrayList.add(String.valueOf(getChildIndex(parent, view)));
                if (parent instanceof ViewGroup) {
                    view = (ViewGroup) parent;
                }
            } while (parent instanceof ViewGroup);
            Collections.reverse(arrayList);
            StringBuilder sb2 = new StringBuilder();
            for (int i7 = 1; i7 < arrayList.size(); i7++) {
                sb2.append((String) arrayList.get(i7));
                if (i7 != arrayList.size() - 1) {
                    sb2.append("_");
                }
            }
            return sb2.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static boolean hasClassName(Object o10, String className) {
        for (Class<?> superclass = o10.getClass(); superclass.getCanonicalName() != null; superclass = superclass.getSuperclass()) {
            if (superclass.getCanonicalName().equals(className)) {
                return true;
            }
            if (superclass == Object.class) {
                return false;
            }
        }
        return false;
    }

    public static void mergeJSONObject(final JSONObject source, JSONObject dest) throws JSONException {
        try {
            Iterator<String> itKeys = source.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = source.get(next);
                if (obj instanceof Date) {
                    SimpleDateFormat simpleDateFormat = mDateFormat;
                    synchronized (simpleDateFormat) {
                        try {
                            dest.put(next, simpleDateFormat.format((Date) obj));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    dest.put(next, obj);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void trackActivityProperties(Activity activity, Map<String, Object> props) {
        if (activity != null) {
            try {
                View decorView = activity.getWindow().getDecorView();
                Object tag = decorView.getTag(e.core_auto_track_tag_activity_properties);
                JSONObject jSONObject = tag instanceof JSONObject ? (JSONObject) tag : new JSONObject();
                mergeJSONObject(props, jSONObject);
                decorView.setTag(e.core_auto_track_tag_activity_properties, jSONObject);
            } catch (JSONException e10) {
                d.c(TAG, "trackActivityProperties: ", e10);
            }
        }
    }

    public static void trackTransType(Activity activity, String transType) {
        if (activity == null || TextUtils.isEmpty(transType)) {
            return;
        }
        activity.getWindow().getDecorView().setTag(e.core_auto_track_tag_trans_type, transType);
    }

    public static void trackTransactionResult(Activity activity, int result) {
        if (activity != null) {
            activity.getWindow().getDecorView().setTag(e.core_auto_track_tag_trans_result, String.valueOf(result));
        }
    }

    public static void trackViewProperties(View view, String key, String value) {
        HashMap map = new HashMap();
        map.put(key, value);
        trackViewProperties(view, map);
    }

    public static String traverseView(StringBuilder stringBuilder, ViewGroup root) {
        try {
            if (root == null) {
                return stringBuilder.toString();
            }
            int childCount = root.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = root.getChildAt(i7);
                if (childAt.getVisibility() == 0) {
                    if (childAt instanceof ViewGroup) {
                        traverseView(stringBuilder, (ViewGroup) childAt);
                    } else {
                        CharSequence charSequenceTraverseViewOnly = traverseViewOnly(childAt);
                        if (!TextUtils.isEmpty(charSequenceTraverseViewOnly)) {
                            stringBuilder.append(charSequenceTraverseViewOnly.toString());
                            stringBuilder.append("-");
                        }
                    }
                }
            }
            return stringBuilder.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return stringBuilder.toString();
        }
    }

    public static void traverseViewForFragment(String fragmentName, ViewGroup root) {
        try {
            if (!TextUtils.isEmpty(fragmentName) && root != null) {
                int childCount = root.getChildCount();
                if (childCount == 0) {
                    root.setTag(e.core_auto_track_tag_view_fragment_name, fragmentName);
                }
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = root.getChildAt(i7);
                    if ((childAt instanceof ListView) || (childAt instanceof GridView) || (childAt instanceof Spinner) || (childAt instanceof RadioGroup)) {
                        childAt.setTag(e.core_auto_track_tag_view_fragment_name, fragmentName);
                    } else if (childAt instanceof ViewGroup) {
                        traverseViewForFragment(fragmentName, (ViewGroup) childAt);
                    } else {
                        childAt.setTag(e.core_auto_track_tag_view_fragment_name, fragmentName);
                    }
                }
            }
        } catch (Exception e10) {
            try {
                e10.printStackTrace();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    public static CharSequence traverseViewOnly(View child) {
        Class<?> cls;
        CharSequence string;
        try {
            cls = Class.forName("android.support.v7.widget.SwitchCompat");
        } catch (Exception unused) {
            cls = null;
        }
        try {
            if (child instanceof CheckBox) {
                string = ((CheckBox) child).getText();
            } else if (cls != null && cls.isInstance(child)) {
                string = (String) (((CompoundButton) child).isChecked() ? child.getClass().getMethod("getTextOn", new Class[0]) : child.getClass().getMethod("getTextOff", new Class[0])).invoke(child, new Object[0]);
            } else if (child instanceof RadioButton) {
                string = ((RadioButton) child).getText();
            } else if (child instanceof ToggleButton) {
                ToggleButton toggleButton = (ToggleButton) child;
                string = toggleButton.isChecked() ? toggleButton.getTextOn() : toggleButton.getTextOff();
            } else if (child instanceof Button) {
                string = ((Button) child).getText();
            } else if (child instanceof CheckedTextView) {
                string = ((CheckedTextView) child).getText();
            } else if (child instanceof TextView) {
                string = ((TextView) child).getText();
            } else if (child instanceof ImageView) {
                ImageView imageView = (ImageView) child;
                if (TextUtils.isEmpty(imageView.getContentDescription())) {
                    string = null;
                } else {
                    string = imageView.getContentDescription().toString();
                }
            } else {
                string = null;
            }
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return string;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static void trackViewProperties(View view, Map<String, Object> props) {
        JSONObject jSONObject;
        if (view != null) {
            try {
                Object tag = view.getTag(e.core_auto_track_tag_view_properties);
                if (tag instanceof JSONObject) {
                    jSONObject = (JSONObject) tag;
                } else {
                    jSONObject = new JSONObject();
                }
                mergeJSONObject(props, jSONObject);
                view.setTag(e.core_auto_track_tag_view_properties, jSONObject);
            } catch (JSONException e10) {
                d.c(TAG, "trackActivityProperties: ", e10);
            }
        }
    }

    public static void mergeJSONObject(final JSONObject source, Map<String, Object> dest) throws JSONException {
        try {
            Iterator<String> itKeys = source.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = source.get(next);
                if (obj instanceof Date) {
                    SimpleDateFormat simpleDateFormat = mDateFormat;
                    synchronized (simpleDateFormat) {
                        try {
                            dest.put(next, simpleDateFormat.format((Date) obj));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    dest.put(next, obj);
                }
            }
        } catch (Exception e10) {
            d.c(TAG, "mergeJSONObject: ", e10);
        }
    }

    public static void mergeJSONObject(Map<String, Object> source, JSONObject dest) throws JSONException {
        try {
            for (String str : source.keySet()) {
                Object obj = source.get(str);
                if (obj instanceof Date) {
                    SimpleDateFormat simpleDateFormat = mDateFormat;
                    synchronized (simpleDateFormat) {
                        try {
                            dest.put(str, simpleDateFormat.format((Date) obj));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    dest.put(str, obj);
                }
            }
        } catch (Exception e10) {
            d.c(TAG, "mergeJSONObject: ", e10);
        }
    }
}
