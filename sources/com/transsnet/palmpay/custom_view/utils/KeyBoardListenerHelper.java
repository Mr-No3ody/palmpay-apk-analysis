package com.transsnet.palmpay.custom_view.utils;

import F6.d;
import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.transsnet.palmpay.util.SizeUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class KeyBoardListenerHelper {
    private static final String TAG = "KeyBoardListenerHelper";
    private int mMinKeyboardHeight;
    private final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.transsnet.palmpay.custom_view.utils.KeyBoardListenerHelper.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!KeyBoardListenerHelper.this.isActivityValid() || KeyBoardListenerHelper.this.onKeyBoardChangeListener == null) {
                return;
            }
            try {
                Rect rect = new Rect();
                ((Activity) KeyBoardListenerHelper.this.weakActivity.get()).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int height = ((Activity) KeyBoardListenerHelper.this.weakActivity.get()).getWindow().getDecorView().getHeight() - rect.bottom;
                KeyBoardListenerHelper.this.onKeyBoardChangeListener.OnKeyBoardChange(height > KeyBoardListenerHelper.this.mMinKeyboardHeight, height);
            } catch (Exception e10) {
                d.c(KeyBoardListenerHelper.TAG, "onGlobalLayout error:" + e10.getMessage());
            }
        }
    };
    private OnKeyBoardChangeListener onKeyBoardChangeListener;
    private WeakReference<Activity> weakActivity;

    public interface OnKeyBoardChangeListener {
        void OnKeyBoardChange(boolean z3, int i7);
    }

    public KeyBoardListenerHelper(Activity activity) {
        this.weakActivity = null;
        this.mMinKeyboardHeight = 0;
        if (activity == null) {
            return;
        }
        this.weakActivity = new WeakReference<>(activity);
        this.mMinKeyboardHeight = SizeUtils.dp2px(60.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isActivityValid() {
        WeakReference<Activity> weakReference = this.weakActivity;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void destroy() {
        if (isActivityValid()) {
            try {
                this.weakActivity.get().findViewById(R.id.content).getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
            } catch (Exception e10) {
                d.c(TAG, "destroy error:" + e10.getMessage());
            }
        }
    }

    public void setOnKeyBoardChangeListener(OnKeyBoardChangeListener onKeyBoardChangeListener) {
        d.h(TAG, 4, "setOnKeyBoardChangeListener");
        if (onKeyBoardChangeListener != null && this.onKeyBoardChangeListener != onKeyBoardChangeListener) {
            try {
                this.weakActivity.get().findViewById(R.id.content).getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
            } catch (Exception e10) {
                d.c(TAG, "KeyBoardListenerHelper error:" + e10.getMessage());
            }
        }
        this.onKeyBoardChangeListener = onKeyBoardChangeListener;
    }
}
