package com.transsnet.palmpay.util;

import B3.a;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.core.view.N;
import com.didiglobal.booster.instrument.ShadowToast;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ToastUtils {
    private static WeakReference<Toast> sWeakToast;
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());
    private static int sGravity = -1;
    private static int sXOffset = -1;
    private static int sYOffset = -1;
    private static final int COLOR_DEFAULT = -16777217;
    private static int sBgColor = COLOR_DEFAULT;
    private static int sBgResource = -1;
    private static int sMsgColor = COLOR_DEFAULT;
    private static int sMsgTextSize = -1;

    private ToastUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void cancel() {
        Toast toast;
        WeakReference<Toast> weakReference = sWeakToast;
        if (weakReference == null || (toast = weakReference.get()) == null) {
            return;
        }
        toast.cancel();
        sWeakToast = null;
    }

    private static View getView(@LayoutRes int i7) {
        LayoutInflater layoutInflater = (LayoutInflater) Utils.getApp().getSystemService("layout_inflater");
        if (layoutInflater != null) {
            return layoutInflater.inflate(i7, (ViewGroup) null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$show$0(CharSequence charSequence, int i7) {
        if (Build.VERSION.SDK_INT >= 30) {
            ShadowToast.show(Toast.makeText(Utils.getApp(), charSequence, i7));
            return;
        }
        try {
            cancel();
            Toast toastMakeText = Toast.makeText(Utils.getApp(), charSequence, i7);
            sWeakToast = new WeakReference<>(toastMakeText);
            TextView textView = (TextView) toastMakeText.getView().findViewById(android.R.id.message);
            int currentTextColor = textView.getCurrentTextColor();
            textView.setTextAppearance(android.R.style.TextAppearance);
            int i10 = sMsgColor;
            if (i10 != COLOR_DEFAULT) {
                textView.setTextColor(i10);
            } else {
                textView.setTextColor(currentTextColor);
            }
            int i11 = sMsgTextSize;
            if (i11 != -1) {
                textView.setTextSize(i11);
            }
            int i12 = sGravity;
            if (i12 != -1 || sXOffset != -1 || sYOffset != -1) {
                toastMakeText.setGravity(i12, sXOffset, sYOffset);
            }
            textView.setGravity(17);
            setBg(toastMakeText, textView);
            ShadowToast.show(toastMakeText);
        } catch (Exception unused) {
            ShadowToast.show(Toast.makeText(Utils.getApp(), charSequence, i7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setBg(Toast toast) {
        View view = toast.getView();
        int i7 = sBgResource;
        if (i7 != -1) {
            view.setBackgroundResource(i7);
            return;
        }
        if (sBgColor != COLOR_DEFAULT) {
            Drawable background = view.getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(sBgColor, PorterDuff.Mode.SRC_IN));
                return;
            }
            ColorDrawable colorDrawable = new ColorDrawable(sBgColor);
            WeakHashMap weakHashMap = N.f16168a;
            view.setBackground(colorDrawable);
        }
    }

    public static void setBgColor(@ColorInt int i7) {
        sBgColor = i7;
    }

    public static void setBgResource(@DrawableRes int i7) {
        sBgResource = i7;
    }

    public static void setGravity(int i7, int i10, int i11) {
        sGravity = i7;
        sXOffset = i10;
        sYOffset = i11;
    }

    public static void setMsgColor(@ColorInt int i7) {
        sMsgColor = i7;
    }

    public static void setMsgTextSize(int i7) {
        sMsgTextSize = i7;
    }

    private static void show(@StringRes int i7, int i10) {
        show(Utils.getApp().getResources().getText(i7).toString(), i10);
    }

    public static View showCustomLong(@LayoutRes int i7) {
        View view = getView(i7);
        show(view, 1);
        return view;
    }

    public static View showCustomShort(@LayoutRes int i7) {
        View view = getView(i7);
        show(view, 0);
        return view;
    }

    public static void showLong(@NonNull CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        show(charSequence, 1);
    }

    public static void showShort(@NonNull CharSequence charSequence) {
        show(charSequence, 0);
    }

    private static void show(@StringRes int i7, int i10, Object... objArr) {
        show(String.format(Utils.getApp().getResources().getString(i7), objArr), i10);
    }

    public static void showShort(@StringRes int i7) {
        show(i7, 0);
    }

    private static void show(String str, int i7, Object... objArr) {
        show(String.format(str, objArr), i7);
    }

    public static void showLong(@StringRes int i7) {
        show(i7, 1);
    }

    public static void showShort(@StringRes int i7, Object... objArr) {
        if (objArr != null && objArr.length == 0) {
            show(i7, 0);
        } else {
            show(i7, 0, objArr);
        }
    }

    private static void show(CharSequence charSequence, int i7) {
        if (TextUtils.isEmpty(charSequence) || !Utils.isAppForeground()) {
            return;
        }
        HANDLER.post(new a(charSequence, i7, 16));
    }

    public static void showLong(@StringRes int i7, Object... objArr) {
        if (objArr != null && objArr.length == 0) {
            show(i7, 0);
        } else {
            show(i7, 1, objArr);
        }
    }

    private static void show(final View view, final int i7) {
        HANDLER.post(new Runnable() { // from class: com.transsnet.palmpay.util.ToastUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ToastUtils.cancel();
                Toast toast = new Toast(Utils.getTopActivityOrApp());
                ToastUtils.sWeakToast = new WeakReference(toast);
                toast.setView(view);
                toast.setDuration(i7);
                if (ToastUtils.sGravity != -1 || ToastUtils.sXOffset != -1 || ToastUtils.sYOffset != -1) {
                    toast.setGravity(ToastUtils.sGravity, ToastUtils.sXOffset, ToastUtils.sYOffset);
                }
                ToastUtils.setBg(toast);
                ShadowToast.show(toast);
            }
        });
    }

    public static void showShort(String str, Object... objArr) {
        if (objArr != null && objArr.length == 0) {
            show(str, 0);
        } else {
            show(str, 0, objArr);
        }
    }

    public static void showLong(String str, Object... objArr) {
        if (objArr != null && objArr.length == 0) {
            show(str, 0);
        } else {
            show(str, 1, objArr);
        }
    }

    private static void setBg(Toast toast, TextView textView) {
        View view = toast.getView();
        int i7 = sBgResource;
        if (i7 != -1) {
            view.setBackgroundResource(i7);
            textView.setBackgroundColor(0);
            return;
        }
        if (sBgColor != COLOR_DEFAULT) {
            Drawable background = view.getBackground();
            Drawable background2 = textView.getBackground();
            if (background != null && background2 != null) {
                background.setColorFilter(new PorterDuffColorFilter(sBgColor, PorterDuff.Mode.SRC_IN));
                textView.setBackgroundColor(0);
            } else if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(sBgColor, PorterDuff.Mode.SRC_IN));
            } else if (background2 != null) {
                background2.setColorFilter(new PorterDuffColorFilter(sBgColor, PorterDuff.Mode.SRC_IN));
            } else {
                view.setBackgroundColor(sBgColor);
            }
        }
    }
}
