package com.transsnet.palmpay.core.util.statistic;

import C0.G;
import F6.d;
import Pa.T;
import Pa.n0;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.app.C0832j;
import androidx.appcompat.app.DialogInterfaceC0834l;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.timepicker.TimeModel;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.core.util.statistic.util.ReflectUtil;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p025ba.e;

/* JADX INFO: loaded from: classes3.dex */
public class AutoTrackHelper {
    private static final String TAG = "AutoTrackHelper";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28190a = 0;
    private static SparseArray<Long> eventTimestamp = new SparseArray<>();

    private static Activity getActivityFromContext(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return getActivityFromContext(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static boolean isDeBounceTrack(Object object) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l5 = eventTimestamp.get(object.hashCode());
        boolean z3 = l5 != null && jCurrentTimeMillis - l5.longValue() < 500;
        eventTimestamp.put(object.hashCode(), Long.valueOf(jCurrentTimeMillis));
        return z3;
    }

    private static boolean isDeBounceTrackForView(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = (String) view.getTag(e.core_auto_track_tag_view_onclick_timestamp);
        boolean z3 = false;
        if (!TextUtils.isEmpty(str)) {
            try {
                if (jCurrentTimeMillis - Long.parseLong(str) < 500) {
                    z3 = true;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        view.setTag(e.core_auto_track_tag_view_onclick_timestamp, String.valueOf(jCurrentTimeMillis));
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$trackActivityShowTime$2(String str, HashMap map, long j6, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            map.put(LogConstants.Autotrack.ELEMENT_TRANS_TYPE, str);
        }
        map.put(LogConstants.Autotrack.ELEMENT_TOTAL_TIME, Long.valueOf(j6));
        if (jSONObject != null) {
            try {
                AutoTrackUtil.mergeJSONObject(jSONObject, map);
            } catch (Exception unused) {
            }
        }
        n0 n0VarG = n0.g();
        n0VarG.getClass();
        TrackEvent trackEventGioEvt = n0.z("event_track_activity_screen_time").fbEvt(false).gioEvt(false);
        trackEventGioEvt.add("event_type", "Statistic_Event");
        trackEventGioEvt.putAll(map);
        n0VarG.q(trackEventGioEvt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$trackDialogOnShow$3(HashMap map) {
        n0 n0VarG = n0.g();
        n0VarG.getClass();
        TrackEvent trackEventFbEvt = n0.z("event_track_dialog_screen").fbEvt(false);
        trackEventFbEvt.add("event_type", "View_Event");
        if (map != null) {
            trackEventFbEvt.putAll(map);
        }
        n0VarG.q(trackEventFbEvt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$trackFragmentAppViewScreen$0(HashMap map) {
        n0 n0VarG = n0.g();
        n0VarG.getClass();
        TrackEvent trackEventZ = n0.z("event_track_fragment_screen");
        trackEventZ.add("event_type", "View_Event");
        if (map != null) {
            trackEventZ.putAll(map);
        }
        n0VarG.q(trackEventZ);
        String str = map != null ? (String) map.get(LogConstants.Autotrack.PAGE_NAME) : null;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TrackEvent trackEventAfEvt = new TrackEvent(str).afEvt(false);
        trackEventAfEvt.add("event_type", "View_Event");
        if (map != null) {
            trackEventAfEvt.putAll(map);
        }
        n0VarG.q(trackEventAfEvt);
    }

    private static void lambda$trackViewOnClick$1(HashMap map) {
        n0 n0VarG = n0.g();
        n0VarG.getClass();
        TrackEvent trackEventFbEvt = n0.z("event_track_click").fbEvt(false);
        trackEventFbEvt.add("event_type", "Click_Event");
        if (map != null) {
            trackEventFbEvt.putAll(map);
        }
        n0VarG.q(trackEventFbEvt);
    }

    public static void onFragmentViewCreated(Object object, View rootView, Bundle bundle) {
        try {
            d.h(TAG, 3, "onFragmentViewCreated: ");
            if (object instanceof Fragment) {
                String name = ((Fragment) object).getClass().getName();
                if (rootView instanceof ViewGroup) {
                    AutoTrackUtil.traverseViewForFragment(name, (ViewGroup) rootView);
                } else {
                    rootView.setTag(e.core_auto_track_tag_view_fragment_name, name);
                }
            }
        } catch (Exception e10) {
            d.c(TAG, "onFragmentViewCreated: ", e10);
        }
    }

    public static void trackActivityOnCreate(Activity activity, Activity parent) {
        trackActivityOnCreate(activity, parent, true);
    }

    public static void trackActivityOnStart(Activity activity, Activity parent) {
        trackActivityOnCreate(activity, parent, false);
    }

    public static void trackActivityShowTime(Activity activity, long time) {
        if (activity == null) {
            return;
        }
        d.h(TAG, 3, "trackActivityShowTime: ");
        try {
            HashMap map = new HashMap();
            map.put("screen_name", AutoTrackUtil.getShortClassName(activity.getClass().getCanonicalName()));
            View decorView = activity.getWindow().getDecorView();
            T.b(-4).execute(new b((String) decorView.getTag(e.core_auto_track_tag_trans_type), map, time, (JSONObject) decorView.getTag(e.core_auto_track_tag_activity_properties)));
        } catch (Exception e10) {
            d.c(TAG, "trackActivityShowTime: ", e10);
        }
    }

    public static void trackDialog(DialogInterface dialogInterface, int whichButton) {
        Object item;
        Object item2;
        try {
            Button button = null;
            Dialog dialog = dialogInterface instanceof Dialog ? (Dialog) dialogInterface : null;
            if (dialog != null && !isDeBounceTrack(dialog)) {
                Activity activityFromContext = AutoTrackUtil.getActivityFromContext(dialog.getContext());
                if (activityFromContext == null) {
                    activityFromContext = dialog.getOwnerActivity();
                }
                JSONObject jSONObject = new JSONObject();
                if (activityFromContext != null) {
                    jSONObject.put("screen_name", activityFromContext.getClass().getCanonicalName());
                    String activityTitle = AutoTrackUtil.getActivityTitle(activityFromContext);
                    if (!TextUtils.isEmpty(activityTitle)) {
                        jSONObject.put(LogConstants.Autotrack.EVENT_SCAN_PAGE_TITLE, activityTitle);
                    }
                }
                jSONObject.put(LogConstants.Autotrack.ELEMENT_TYPE, "Dialog");
                if (dialog instanceof AlertDialog) {
                    AlertDialog alertDialog = (AlertDialog) dialog;
                    Button button2 = alertDialog.getButton(whichButton);
                    if (button2 == null) {
                        ListView listView = alertDialog.getListView();
                        if (listView != null && (item2 = listView.getAdapter().getItem(whichButton)) != null && (item2 instanceof String)) {
                            jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, item2);
                        }
                    } else if (!TextUtils.isEmpty(button2.getText())) {
                        jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, button2.getText());
                    }
                } else if (dialog instanceof DialogInterfaceC0834l) {
                    C0832j c0832j = ((DialogInterfaceC0834l) dialog).f12306a;
                    if (whichButton == -3) {
                        button = c0832j.f12301w;
                    } else if (whichButton == -2) {
                        button = c0832j.f12298s;
                    } else if (whichButton != -1) {
                        c0832j.getClass();
                    } else {
                        button = c0832j.f12294o;
                    }
                    if (button == null) {
                        AlertController$RecycleListView alertController$RecycleListView = c0832j.f12286g;
                        if (alertController$RecycleListView != null && (item = alertController$RecycleListView.getAdapter().getItem(whichButton)) != null && (item instanceof String)) {
                            jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, item);
                        }
                    } else if (!TextUtils.isEmpty(button.getText())) {
                        jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, button.getText());
                    }
                }
                d.h(TAG, 3, "trackDialog: " + jSONObject.toString());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void trackDialogOnShow(Dialog dialog, JSONObject extra) {
        if (dialog == null) {
            return;
        }
        Activity activityFromContext = getActivityFromContext(dialog.getContext());
        HashMap map = new HashMap();
        if (activityFromContext != null) {
            map.put("screen_name", AutoTrackUtil.getShortClassName(activityFromContext.getClass().getCanonicalName()));
            View decorView = activityFromContext.getWindow().getDecorView();
            String str = (String) decorView.getTag(e.core_auto_track_tag_trans_type);
            if (!TextUtils.isEmpty(str)) {
                map.put(LogConstants.Autotrack.ELEMENT_TRANS_TYPE, str);
            }
            try {
                JSONObject jSONObject = (JSONObject) decorView.getTag(e.core_auto_track_tag_activity_properties);
                if (jSONObject != null) {
                    AutoTrackUtil.mergeJSONObject(jSONObject, map);
                }
            } catch (JSONException e10) {
                d.c(TAG, "trackDialogOnShow: ", e10);
            }
        }
        if (extra != null) {
            try {
                AutoTrackUtil.mergeJSONObject(extra, map);
            } catch (JSONException e11) {
                d.c(TAG, "trackDialogOnShow: ", e11);
            }
        }
        map.put(LogConstants.Autotrack.DIALOG_NAME, AutoTrackUtil.getShortClassName(dialog.getClass().getCanonicalName()));
        T.b(-4).execute(new a(map, 0));
    }

    public static void trackDrawerClosed(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, "Close");
            if (view != null) {
                view.setTag(e.core_auto_track_tag_view_properties, jSONObject);
            }
            d.h(TAG, 3, "trackDrawerClosed: ");
            trackViewOnClick(view);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void trackDrawerOpened(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, "Open");
            if (view != null) {
                view.setTag(e.core_auto_track_tag_view_properties, jSONObject);
            }
            d.h(TAG, 3, "trackDrawerOpened: ");
            trackViewOnClick(view);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void trackExpandableListViewOnChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition) {
        try {
            Activity activityFromView = AutoTrackUtil.getActivityFromView(expandableListView);
            JSONObject jSONObject = new JSONObject();
            String viewPath = AutoTrackUtil.getViewPath(view);
            if (!TextUtils.isEmpty(viewPath)) {
                jSONObject.put(LogConstants.Autotrack.ELEMENT_VIEWPATH, viewPath);
            }
            if (activityFromView != null) {
                String activityTitle = AutoTrackUtil.getActivityTitle(activityFromView);
                if (!TextUtils.isEmpty(activityTitle)) {
                    jSONObject.put(LogConstants.Autotrack.EVENT_SCAN_PAGE_TITLE, activityTitle);
                }
            }
            String screenNameFromView = AutoTrackUtil.getScreenNameFromView(activityFromView, expandableListView);
            if (!TextUtils.isEmpty(screenNameFromView)) {
                jSONObject.put("screen_name", screenNameFromView);
            }
            String viewId = AutoTrackUtil.getViewId(expandableListView);
            if (!TextUtils.isEmpty(viewId)) {
                jSONObject.put(LogConstants.Autotrack.ELEMENT_ID, viewId);
            }
            jSONObject.put(LogConstants.Autotrack.ELEMENT_POSITION, String.format(Locale.CHINA, "%d:%d", Integer.valueOf(groupPosition), Integer.valueOf(childPosition)));
            jSONObject.put(LogConstants.Autotrack.ELEMENT_TYPE, "ExpandableListView");
            try {
                if (view instanceof ViewGroup) {
                    String strTraverseView = AutoTrackUtil.traverseView(new StringBuilder(), (ViewGroup) view);
                    if (!TextUtils.isEmpty(strTraverseView)) {
                        jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, strTraverseView.substring(0, strTraverseView.length() - 1));
                    }
                } else {
                    CharSequence charSequenceTraverseViewOnly = AutoTrackUtil.traverseViewOnly(view);
                    if (!TextUtils.isEmpty(charSequenceTraverseViewOnly)) {
                        jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, charSequenceTraverseViewOnly.toString());
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            d.h(TAG, 3, "trackExpandableListViewOnChildClick: " + jSONObject.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static void trackExpandableListViewOnGroupClick(ExpandableListView expandableListView, View view, int groupPosition) {
        try {
            Activity activityFromView = AutoTrackUtil.getActivityFromView(expandableListView);
            JSONObject jSONObject = new JSONObject();
            String viewPath = AutoTrackUtil.getViewPath(view);
            if (!TextUtils.isEmpty(viewPath)) {
                jSONObject.put(LogConstants.Autotrack.ELEMENT_VIEWPATH, viewPath);
            }
            if (activityFromView != null) {
                String activityTitle = AutoTrackUtil.getActivityTitle(activityFromView);
                if (!TextUtils.isEmpty(activityTitle)) {
                    jSONObject.put(LogConstants.Autotrack.EVENT_SCAN_PAGE_TITLE, activityTitle);
                }
            }
            String screenNameFromView = AutoTrackUtil.getScreenNameFromView(activityFromView, expandableListView);
            if (!TextUtils.isEmpty(screenNameFromView)) {
                jSONObject.put("screen_name", screenNameFromView);
            }
            String viewId = AutoTrackUtil.getViewId(expandableListView);
            if (!TextUtils.isEmpty(viewId)) {
                jSONObject.put(LogConstants.Autotrack.ELEMENT_ID, viewId);
            }
            jSONObject.put(LogConstants.Autotrack.ELEMENT_POSITION, String.format(Locale.CHINA, TimeModel.NUMBER_FORMAT, Integer.valueOf(groupPosition)));
            jSONObject.put(LogConstants.Autotrack.ELEMENT_TYPE, "ExpandableListView");
            try {
                if (view instanceof ViewGroup) {
                    String strTraverseView = AutoTrackUtil.traverseView(new StringBuilder(), (ViewGroup) view);
                    if (!TextUtils.isEmpty(strTraverseView)) {
                        jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, strTraverseView.substring(0, strTraverseView.length() - 1));
                    }
                } else {
                    CharSequence charSequenceTraverseViewOnly = AutoTrackUtil.traverseViewOnly(view);
                    if (!TextUtils.isEmpty(charSequenceTraverseViewOnly)) {
                        jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, charSequenceTraverseViewOnly.toString());
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            d.h(TAG, 3, "trackExpandableListViewOnGroupClick: " + jSONObject.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void trackFragmentAppViewScreen(Fragment fragment) {
        try {
            String canonicalName = fragment.getClass().getCanonicalName();
            E activity = fragment.getActivity();
            HashMap map = new HashMap();
            if (fragment instanceof IAutoTrack) {
                IAutoTrack iAutoTrack = (IAutoTrack) fragment;
                map.put(LogConstants.Autotrack.PAGE_NAME, iAutoTrack.getPageAlias());
                iAutoTrack.fillAutoTrackMap(map);
            }
            if (fragment instanceof IAutoTrackPageEvent) {
                String pageViewEventName = ((IAutoTrackPageEvent) fragment).getPageViewEventName();
                if (!TextUtils.isEmpty(pageViewEventName)) {
                    n0.g().v(pageViewEventName);
                }
            }
            if (activity != null) {
                String activityTitle = AutoTrackUtil.getActivityTitle(activity);
                if (!TextUtils.isEmpty(activityTitle)) {
                    map.put(LogConstants.Autotrack.EVENT_SCAN_PAGE_TITLE, activityTitle);
                }
                map.put("screen_name", AutoTrackUtil.getShortClassName(activity.getClass().getCanonicalName()));
                AutoTrackActivityLifecycleCallbacks.ActivityItem parentActivity = AutoTrackActivityLifecycleCallbacks.getInstance().getParentActivity(activity);
                if (parentActivity != null) {
                    map.put(LogConstants.Autotrack.PRE_SCREEN_NAME, AutoTrackUtil.getShortClassName(parentActivity.getActivity().getClass().getCanonicalName()));
                }
                View decorView = activity.getWindow().getDecorView();
                String str = (String) decorView.getTag(e.core_auto_track_tag_trans_type);
                if (!TextUtils.isEmpty(str)) {
                    map.put(LogConstants.Autotrack.ELEMENT_TRANS_TYPE, str);
                }
                String str2 = (String) decorView.getTag(e.core_auto_track_tag_trans_result);
                if (!TextUtils.isEmpty(str2)) {
                    map.put(LogConstants.Autotrack.ELEMENT_TRANS_RESULT, str2);
                }
                JSONObject jSONObject = (JSONObject) decorView.getTag(e.core_auto_track_tag_activity_properties);
                if (jSONObject != null) {
                    AutoTrackUtil.mergeJSONObject(jSONObject, map);
                }
            }
            map.put(LogConstants.Autotrack.FRAGMENT_NAME, AutoTrackUtil.getShortClassName(canonicalName));
            d.h(TAG, 3, "trackFragmentAppViewScreen: " + map.toString());
            T.b(-4).execute(new a(map, 1));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void trackFragmentDestroy(Object object) {
        String str = TAG;
        d.h(str, 3, "trackFragmentDestroy: ");
        try {
            if (object instanceof Fragment) {
                d.h(str, 3, "trackFragmentDestroy: fragmengName " + ((Fragment) object).getClass().getCanonicalName());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void trackFragmentResume(Object object) {
        d.h(TAG, 3, "trackFragmentResume: ");
        try {
            if (object instanceof Fragment) {
                Fragment fragment = (Fragment) object;
                Fragment parentFragment = fragment.getParentFragment();
                if (parentFragment == null) {
                    if (fragment.isHidden() || !fragment.getUserVisibleHint()) {
                        return;
                    }
                    trackFragmentAppViewScreen(fragment);
                    return;
                }
                if (fragment.isHidden() || !fragment.getUserVisibleHint() || parentFragment.isHidden() || !parentFragment.getUserVisibleHint()) {
                    return;
                }
                trackFragmentAppViewScreen(fragment);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void trackFragmentSetUserVisibleHint(Object object, boolean isVisibleToUser) {
        d.h(TAG, 3, "trackFragmentSetUserVisibleHint: ");
        if (object instanceof Fragment) {
            Fragment fragment = (Fragment) object;
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                if (isVisibleToUser && fragment.isResumed() && !fragment.isHidden()) {
                    trackFragmentAppViewScreen(fragment);
                    return;
                }
                return;
            }
            if (isVisibleToUser && parentFragment.getUserVisibleHint() && fragment.isResumed() && parentFragment.isResumed() && !fragment.isHidden() && !parentFragment.isHidden()) {
                trackFragmentAppViewScreen(fragment);
            }
        }
    }

    public static void trackListView(AdapterView<?> adapterView, View view, int position) {
        try {
            Activity activityFromView = AutoTrackUtil.getActivityFromView(view);
            JSONObject jSONObject = new JSONObject();
            String viewPath = AutoTrackUtil.getViewPath(view);
            if (!TextUtils.isEmpty(viewPath)) {
                jSONObject.put(LogConstants.Autotrack.ELEMENT_VIEWPATH, viewPath);
            }
            if (activityFromView != null) {
                String activityTitle = AutoTrackUtil.getActivityTitle(activityFromView);
                if (!TextUtils.isEmpty(activityTitle)) {
                    jSONObject.put(LogConstants.Autotrack.EVENT_SCAN_PAGE_TITLE, activityTitle);
                }
            }
            String screenNameFromView = AutoTrackUtil.getScreenNameFromView(activityFromView, adapterView);
            if (!TextUtils.isEmpty(screenNameFromView)) {
                jSONObject.put("screen_name", screenNameFromView);
            }
            String viewId = AutoTrackUtil.getViewId(adapterView);
            if (!TextUtils.isEmpty(viewId)) {
                jSONObject.put(LogConstants.Autotrack.ELEMENT_ID, viewId);
            }
            jSONObject.put(LogConstants.Autotrack.ELEMENT_POSITION, String.valueOf(position));
            jSONObject.put(LogConstants.Autotrack.ELEMENT_TYPE, adapterView.getClass().getSimpleName());
            try {
                if (view instanceof ViewGroup) {
                    String strTraverseView = AutoTrackUtil.traverseView(new StringBuilder(), (ViewGroup) view);
                    if (!TextUtils.isEmpty(strTraverseView)) {
                        jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, strTraverseView.substring(0, strTraverseView.length() - 1));
                    }
                } else {
                    CharSequence charSequenceTraverseViewOnly = AutoTrackUtil.traverseViewOnly(view);
                    if (!TextUtils.isEmpty(charSequenceTraverseViewOnly)) {
                        jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, charSequenceTraverseViewOnly.toString());
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            d.h(TAG, 3, "trackListView: " + jSONObject.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static void trackMenuItem(Object object, MenuItem menuItem) {
        try {
            if (isDeBounceTrack(menuItem)) {
                return;
            }
            Context context = object instanceof Context ? (Context) object : null;
            Activity activityFromContext = AutoTrackUtil.getActivityFromContext(context);
            JSONObject jSONObject = new JSONObject();
            if (activityFromContext != null) {
                jSONObject.put("screen_name", activityFromContext.getClass().getCanonicalName());
                String activityTitle = AutoTrackUtil.getActivityTitle(activityFromContext);
                if (!TextUtils.isEmpty(activityTitle)) {
                    jSONObject.put(LogConstants.Autotrack.EVENT_SCAN_PAGE_TITLE, activityTitle);
                }
            }
            if (context != null) {
                try {
                    String resourceEntryName = context.getResources().getResourceEntryName(menuItem.getItemId());
                    if (!TextUtils.isEmpty(resourceEntryName)) {
                        jSONObject.put(LogConstants.Autotrack.ELEMENT_ID, resourceEntryName);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            if (!TextUtils.isEmpty(menuItem.getTitle())) {
                jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, menuItem.getTitle());
            }
            jSONObject.put(LogConstants.Autotrack.ELEMENT_TYPE, "MenuItem");
            d.h(TAG, 3, "trackMenuItem: " + jSONObject.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static void trackOnHiddenChanged(Object object, boolean hidden) {
        if (object instanceof Fragment) {
            Fragment fragment = (Fragment) object;
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                if (!hidden && fragment.isResumed() && fragment.getUserVisibleHint()) {
                    trackFragmentAppViewScreen(fragment);
                    return;
                }
                return;
            }
            if (!hidden && !parentFragment.isHidden() && fragment.isResumed() && parentFragment.isResumed() && fragment.getUserVisibleHint() && parentFragment.getUserVisibleHint()) {
                trackFragmentAppViewScreen(fragment);
            }
        }
    }

    public static void trackRadioGroup(RadioGroup view, int checkedId) {
        try {
            Activity activityFromView = AutoTrackUtil.getActivityFromView(view);
            JSONObject jSONObject = new JSONObject();
            if (activityFromView != null) {
                String activityTitle = AutoTrackUtil.getActivityTitle(activityFromView);
                if (!TextUtils.isEmpty(activityTitle)) {
                    jSONObject.put(LogConstants.Autotrack.EVENT_SCAN_PAGE_TITLE, activityTitle);
                }
            }
            String screenNameFromView = AutoTrackUtil.getScreenNameFromView(activityFromView, view);
            if (!TextUtils.isEmpty(screenNameFromView)) {
                jSONObject.put("screen_name", screenNameFromView);
            }
            String viewId = AutoTrackUtil.getViewId(view);
            if (!TextUtils.isEmpty(viewId)) {
                jSONObject.put(LogConstants.Autotrack.ELEMENT_ID, viewId);
            }
            jSONObject.put(LogConstants.Autotrack.ELEMENT_TYPE, "RadioButton");
            int checkedRadioButtonId = view.getCheckedRadioButtonId();
            if (activityFromView != null) {
                try {
                    RadioButton radioButton = (RadioButton) activityFromView.findViewById(checkedRadioButtonId);
                    if (radioButton != null) {
                        if (!TextUtils.isEmpty(radioButton.getText())) {
                            String string = radioButton.getText().toString();
                            if (!TextUtils.isEmpty(string)) {
                                jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, string);
                            }
                        }
                        String viewPath = AutoTrackUtil.getViewPath(radioButton);
                        if (!TextUtils.isEmpty(viewPath)) {
                            jSONObject.put(LogConstants.Autotrack.ELEMENT_VIEWPATH, viewPath);
                        }
                    }
                } catch (Exception e10) {
                    d.c(TAG, "trackRadioGroup: ", e10);
                }
            }
            d.h(TAG, 3, "trackRadioGroup: " + jSONObject.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static void trackTabHost(String tabName) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, tabName);
            jSONObject.put(LogConstants.Autotrack.ELEMENT_TYPE, "TabHost");
            d.h(TAG, 3, "trackTabHost: " + jSONObject.toString());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0074 A[Catch: Exception -> 0x00d1, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d1, blocks: (B:3:0x0002, B:6:0x000a, B:9:0x0015, B:12:0x0020, B:31:0x0070, B:33:0x0074, B:39:0x0089, B:41:0x008f, B:43:0x00aa, B:44:0x00af, B:38:0x0086, B:13:0x0024, B:27:0x0066, B:29:0x006a, B:26:0x0063, B:15:0x002a, B:17:0x002e, B:19:0x0040, B:22:0x0051, B:24:0x005b, B:35:0x0078), top: B:54:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x008f A[Catch: Exception -> 0x00d1, TryCatch #2 {Exception -> 0x00d1, blocks: (B:3:0x0002, B:6:0x000a, B:9:0x0015, B:12:0x0020, B:31:0x0070, B:33:0x0074, B:39:0x0089, B:41:0x008f, B:43:0x00aa, B:44:0x00af, B:38:0x0086, B:13:0x0024, B:27:0x0066, B:29:0x006a, B:26:0x0063, B:15:0x002a, B:17:0x002e, B:19:0x0040, B:22:0x0051, B:24:0x005b, B:35:0x0078), top: B:54:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa A[Catch: Exception -> 0x00d1, TryCatch #2 {Exception -> 0x00d1, blocks: (B:3:0x0002, B:6:0x000a, B:9:0x0015, B:12:0x0020, B:31:0x0070, B:33:0x0074, B:39:0x0089, B:41:0x008f, B:43:0x00aa, B:44:0x00af, B:38:0x0086, B:13:0x0024, B:27:0x0066, B:29:0x006a, B:26:0x0063, B:15:0x002a, B:17:0x002e, B:19:0x0040, B:22:0x0051, B:24:0x005b, B:35:0x0078), top: B:54:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void trackTabLayoutSelected(Object object, Object tab) {
        Context context;
        Activity activityFromContext;
        String activityTitle;
        try {
            if (isDeBounceTrack(tab)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (tab instanceof TabLayout.Tab) {
                TabLayout.Tab tab2 = (TabLayout.Tab) tab;
                CharSequence text = tab2.getText();
                if (text == null) {
                    View customView = tab2.getCustomView();
                    if (customView != null) {
                        try {
                            if (customView instanceof ViewGroup) {
                                String strTraverseView = AutoTrackUtil.traverseView(new StringBuilder(), (ViewGroup) customView);
                                if (!TextUtils.isEmpty(strTraverseView)) {
                                    jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, strTraverseView.substring(0, strTraverseView.length() - 1));
                                }
                            } else {
                                CharSequence charSequenceTraverseViewOnly = AutoTrackUtil.traverseViewOnly(customView);
                                if (!TextUtils.isEmpty(charSequenceTraverseViewOnly)) {
                                    jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, charSequenceTraverseViewOnly.toString());
                                }
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        context = object instanceof Context ? null : customView.getContext();
                    }
                    if (object instanceof Context) {
                        context = (Context) object;
                    } else {
                        try {
                            context = ((TabLayout) ReflectUtil.getFieldValue(tab, "mParent")).getContext();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    activityFromContext = AutoTrackUtil.getActivityFromContext(context);
                    if (activityFromContext != null) {
                        jSONObject.put("screen_name", AutoTrackUtil.getShortClassName(activityFromContext.getClass().getCanonicalName()));
                        activityTitle = AutoTrackUtil.getActivityTitle(activityFromContext);
                        if (!TextUtils.isEmpty(activityTitle)) {
                            jSONObject.put(LogConstants.Autotrack.EVENT_SCAN_PAGE_TITLE, activityTitle);
                        }
                    }
                    jSONObject.put(LogConstants.Autotrack.ELEMENT_TYPE, "TabLayout");
                    d.h(TAG, 3, "trackTabLayoutSelected: " + jSONObject.toString());
                }
                jSONObject.put(LogConstants.Autotrack.ELEMENT_CONTENT, text);
                if (object instanceof Context) {
                    context = (Context) object;
                } else {
                    context = ((TabLayout) ReflectUtil.getFieldValue(tab, "mParent")).getContext();
                }
                activityFromContext = AutoTrackUtil.getActivityFromContext(context);
                if (activityFromContext != null) {
                    jSONObject.put("screen_name", AutoTrackUtil.getShortClassName(activityFromContext.getClass().getCanonicalName()));
                    activityTitle = AutoTrackUtil.getActivityTitle(activityFromContext);
                    if (!TextUtils.isEmpty(activityTitle)) {
                        jSONObject.put(LogConstants.Autotrack.EVENT_SCAN_PAGE_TITLE, activityTitle);
                    }
                }
                jSONObject.put(LogConstants.Autotrack.ELEMENT_TYPE, "TabLayout");
                d.h(TAG, 3, "trackTabLayoutSelected: " + jSONObject.toString());
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    public static void trackViewOnClick(View view) {
    }

    public static void trackViewPageSelected(Object object, int position) {
        d.h(TAG, 3, G.m(position, "trackViewPageSelected: "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void trackActivityOnCreate(Activity activity, Activity parent, boolean firstShow) {
        if (activity == 0) {
            return;
        }
        d.h(TAG, 3, "trackActivityOnCreate: ");
        try {
            final HashMap map = new HashMap();
            if (activity instanceof IAutoTrack) {
                IAutoTrack iAutoTrack = (IAutoTrack) activity;
                map.put(LogConstants.Autotrack.PAGE_NAME, iAutoTrack.getPageAlias());
                iAutoTrack.fillAutoTrackMap(map);
            }
            if (activity instanceof IAutoTrackPageEvent) {
                String pageViewEventName = ((IAutoTrackPageEvent) activity).getPageViewEventName();
                if (!TextUtils.isEmpty(pageViewEventName)) {
                    n0.g().v(pageViewEventName);
                }
            }
            map.put("screen_name", AutoTrackUtil.getShortClassName(activity.getClass().getCanonicalName()));
            if (firstShow) {
                map.put(LogConstants.Autotrack.SCREEN_FIRST_SHOW, Boolean.TRUE);
            }
            if (parent != null) {
                map.put(LogConstants.Autotrack.PRE_SCREEN_NAME, AutoTrackUtil.getShortClassName(parent.getClass().getCanonicalName()));
            }
            View decorView = activity.getWindow().getDecorView();
            final String str = (String) decorView.getTag(e.core_auto_track_tag_trans_type);
            final String str2 = (String) decorView.getTag(e.core_auto_track_tag_trans_result);
            final JSONObject jSONObject = (JSONObject) decorView.getTag(e.core_auto_track_tag_activity_properties);
            T.b(-4).execute(new Runnable() { // from class: com.transsnet.palmpay.core.util.statistic.AutoTrackHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            map.put(LogConstants.Autotrack.ELEMENT_TRANS_TYPE, str);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            map.put(LogConstants.Autotrack.ELEMENT_TRANS_RESULT, str2);
                        }
                        JSONObject jSONObject2 = jSONObject;
                        if (jSONObject2 != null) {
                            AutoTrackUtil.mergeJSONObject(jSONObject2, map);
                        }
                        n0.g().j(map);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception e10) {
            d.c(TAG, "trackActivityOnCreate: ", e10);
        }
    }

    public static void trackViewOnClick(Object anything) {
        if (anything == null) {
            return;
        }
        try {
            if (anything instanceof View) {
                trackViewOnClick((View) anything);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
