package com.gyf.immersionbar;

import android.R;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f23214f;

    public a(Activity activity) {
        int iA;
        this.f23213e = activity.getResources().getConfiguration().orientation == 1;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        float f10 = displayMetrics.widthPixels;
        float f11 = displayMetrics.density;
        this.f23214f = Math.min(f10 / f11, displayMetrics.heightPixels / f11);
        this.f23209a = a(activity, "status_bar_height");
        View viewFindViewById = activity.getWindow().findViewById(m.action_bar_container);
        if ((viewFindViewById != null ? viewFindViewById.getMeasuredHeight() : 0) == 0) {
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
            TypedValue.complexToDimensionPixelSize(typedValue.data, activity.getResources().getDisplayMetrics());
        }
        if (b(activity)) {
            iA = a(activity, activity.getResources().getConfiguration().orientation == 1 ? "navigation_bar_height" : "navigation_bar_height_landscape");
        } else {
            iA = 0;
        }
        this.f23211c = iA;
        this.f23212d = b(activity) ? a(activity, "navigation_bar_width") : 0;
        this.f23210b = iA > 0;
    }

    public static int a(Activity activity, String str) {
        try {
            int identifier = Resources.getSystem().getIdentifier(str, "dimen", "android");
            if (identifier <= 0) {
                return 0;
            }
            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(identifier);
            int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
            if (dimensionPixelSize2 >= dimensionPixelSize && (Build.VERSION.SDK_INT < 29 || str.equals("status_bar_height"))) {
                return dimensionPixelSize2;
            }
            float f10 = (dimensionPixelSize * Resources.getSystem().getDisplayMetrics().density) / activity.getResources().getDisplayMetrics().density;
            return (int) (f10 >= 0.0f ? f10 + 0.5f : f10 - 0.5f);
        } catch (Resources.NotFoundException unused) {
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057 A[PHI: r3
      0x0057: PHI (r3v10 int) = 
      (r3v5 int)
      (r3v5 int)
      (r3v14 int)
      (r3v14 int)
      (r3v21 int)
      (r3v21 int)
      (r3v25 int)
      (r3v25 int)
      (r3v32 int)
      (r3v32 int)
      (r3v30 int)
      (r3v30 int)
     binds: [B:70:0x00c7, B:72:0x00ca, B:60:0x00a8, B:62:0x00ab, B:53:0x0099, B:57:0x009f, B:45:0x0088, B:50:0x0090, B:39:0x0076, B:41:0x0079, B:30:0x0055, B:32:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x006a A[PHI: r3
      0x006a: PHI (r3v17 int) = (r3v14 int), (r3v30 int) binds: [B:64:0x00b3, B:34:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x006c A[PHI: r3
      0x006c: PHI (r3v15 int) = (r3v14 int), (r3v30 int) binds: [B:64:0x00b3, B:34:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x007b A[PHI: r3
      0x007b: PHI (r3v7 int) = (r3v5 int), (r3v21 int), (r3v21 int), (r3v25 int), (r3v25 int), (r3v25 int), (r3v32 int) binds: [B:72:0x00ca, B:55:0x009c, B:57:0x009f, B:47:0x008b, B:48:0x008d, B:50:0x0090, B:41:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    public static boolean b(Activity activity) {
        boolean z3;
        boolean z8;
        int i7;
        DisplayMetrics displayMetrics;
        int i10;
        if (activity != null && activity.getContentResolver() != null) {
            ContentResolver contentResolver = activity.getContentResolver();
            if (OSUtils.isHuaWei() || OSUtils.isEMUI()) {
                i10 = !OSUtils.isEMUI3_x() ? Settings.Global.getInt(contentResolver, "navigationbar_is_min", -1) : Settings.System.getInt(contentResolver, "navigationbar_is_min", -1);
                if (i10 != 0 && i10 == 1) {
                    z8 = true;
                    z3 = false;
                } else {
                    z3 = false;
                    z8 = false;
                }
            } else if (OSUtils.isXiaoMi() || OSUtils.isMIUI()) {
                i10 = Settings.Global.getInt(contentResolver, "force_fsg_nav_bar", -1);
                if (i10 != 0 && i10 == 1) {
                    if (Settings.Global.getInt(contentResolver, "hide_gesture_line", -1) != 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z8 = true;
                } else {
                    z3 = false;
                    z8 = false;
                }
            } else if (OSUtils.isVivo() || OSUtils.isFuntouchOrOriginOs()) {
                i10 = Settings.Secure.getInt(contentResolver, "navigation_gesture_on", -1);
                if (i10 != 0 && (i10 == 1 || i10 == 2)) {
                    z8 = true;
                    z3 = false;
                } else {
                    z3 = false;
                    z8 = false;
                }
            } else if (OSUtils.isOppo() || OSUtils.isColorOs()) {
                i10 = Settings.Secure.getInt(contentResolver, "hide_navigationbar_enable", -1);
                if (i10 != 0 && (i10 == 1 || i10 == 2 || i10 == 3)) {
                    z8 = true;
                    z3 = false;
                } else {
                    z3 = false;
                    z8 = false;
                }
            } else if (OSUtils.isSamsung()) {
                i10 = Settings.Global.getInt(contentResolver, "navigation_bar_gesture_while_hidden", -1);
                if (i10 == -1) {
                    i10 = Settings.Global.getInt(contentResolver, "navigationbar_hide_bar_enabled", -1);
                    if (i10 != 0 && i10 == 1) {
                        z8 = true;
                        z3 = false;
                    }
                } else if (i10 != 0 && i10 == 1) {
                    Settings.Global.getInt(contentResolver, "navigation_bar_gesture_detail_type", 1);
                    if (Settings.Global.getInt(contentResolver, "navigation_bar_gesture_hint", 1) == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z8 = true;
                }
                z3 = false;
                z8 = false;
            } else {
                z3 = false;
                z8 = false;
                i10 = -1;
            }
            if (i10 == -1) {
                int i11 = Settings.Secure.getInt(contentResolver, "navigation_mode", -1);
                if (i11 == 0 || i11 == 1) {
                    z8 = false;
                } else if (i11 == 2) {
                    z3 = true;
                }
            }
            if (z3 || !z8) {
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics2);
                int i12 = displayMetrics2.heightPixels;
                i7 = displayMetrics2.widthPixels;
                displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                int i13 = displayMetrics.heightPixels;
                if (i7 - displayMetrics.widthPixels <= 0 || i12 - i13 > 0) {
                    return true;
                }
            }
            return false;
        }
        z3 = false;
        z8 = z3;
        if (z3) {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics3 = new DisplayMetrics();
            defaultDisplay2.getRealMetrics(displayMetrics3);
            int i14 = displayMetrics3.heightPixels;
            i7 = displayMetrics3.widthPixels;
            displayMetrics = new DisplayMetrics();
            defaultDisplay2.getMetrics(displayMetrics);
            int i15 = displayMetrics.heightPixels;
            if (i7 - displayMetrics.widthPixels <= 0) {
            }
            return true;
        }
        Display defaultDisplay3 = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics4 = new DisplayMetrics();
        defaultDisplay3.getRealMetrics(displayMetrics4);
        int i16 = displayMetrics4.heightPixels;
        i7 = displayMetrics4.widthPixels;
        displayMetrics = new DisplayMetrics();
        defaultDisplay3.getMetrics(displayMetrics);
        int i17 = displayMetrics.heightPixels;
        if (i7 - displayMetrics.widthPixels <= 0) {
        }
        return true;
        return false;
    }

    public final boolean c() {
        return this.f23214f >= 600.0f || this.f23213e;
    }
}
