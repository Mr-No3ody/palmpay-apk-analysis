package com.growingio.android.sdk.track.webservices.widget;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;
import e5.a;

/* JADX INFO: loaded from: classes3.dex */
public class TipView extends FrameLayout {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f23198j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowManager f23199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f23200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f23201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23205g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f23206i;

    public TipView(Context context) {
        super(context);
        this.f23202d = false;
        this.f23203e = false;
        this.f23199a = (WindowManager) context.getSystemService("window");
        this.f23200b = new TextView(getContext());
        TextView textView = new TextView(getContext());
        this.f23201c = textView;
        textView.setGravity(5);
        this.f23200b.setTextSize(2, 14.0f);
        this.f23201c.setTextSize(2, 12.0f);
        int i7 = (int) ((4.0f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
        int i10 = (int) ((6.0f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
        int i11 = (int) ((8.0f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
        this.f23200b.setPadding(i11, i7, i11, i7);
        this.f23201c.setPadding(i11, i10, i11, i10);
        this.f23200b.setTextColor(-1);
        this.f23201c.setTextColor(-1);
        this.f23201c.setText("如有遮挡请拖动此条");
        addView(this.f23200b, new ViewGroup.LayoutParams(-1, -2));
        addView(this.f23201c, new ViewGroup.LayoutParams(-1, -1));
        setBackgroundResource(a.growing_tracker_blue);
        this.f23205g = getStatusBarHeight();
        this.f23204f = ViewConfiguration.get(context).getScaledTouchSlop();
        setKeepScreenOn(true);
    }

    public final void a(IBinder iBinder) {
        if (this.f23202d) {
            return;
        }
        this.f23202d = true;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = 1000;
        layoutParams.token = iBinder;
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.flags = 262184;
        layoutParams.gravity = 51;
        layoutParams.y = this.f23205g;
        this.f23199a.addView(this, layoutParams);
    }

    public final void b() {
        if (this.f23202d) {
            ((WindowManager) getContext().getSystemService("window")).removeView(this);
            this.f23202d = false;
        }
    }

    public final void c(Activity activity) {
        if (this.f23203e) {
            return;
        }
        new WindowManager.LayoutParams().type = 1000;
        View decorView = activity.getWindow().getDecorView();
        IBinder windowToken = decorView.getWindowToken();
        if (windowToken == null) {
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new p363y5.a(this, activity, decorView));
        } else {
            a(windowToken);
        }
    }

    public int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f23206i = motionEvent.getRawY();
        } else if (action == 1) {
            if (Math.abs(motionEvent.getRawY() - this.f23206i) < this.f23204f) {
                performClick();
            }
        } else if (action == 2) {
            float rawY = motionEvent.getRawY();
            if (Math.abs(rawY - this.f23206i) >= this.f23204f) {
                int i7 = (int) (rawY - this.f23205g);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
                int i10 = layoutParams.y + i7;
                layoutParams.y = i10;
                this.f23205g = i10;
                this.f23199a.updateViewLayout(this, layoutParams);
            }
        } else if (action == 3) {
            if (Math.abs(motionEvent.getRawY() - this.f23206i) < this.f23204f) {
                performClick();
            }
        }
        return true;
    }

    public void setContent(@StringRes int resid) {
        setContent(getContext().getResources().getText(resid));
    }

    public void setErrorMessage(@StringRes int resid) {
        setErrorMessage(getContext().getResources().getText(resid));
    }

    public void setContent(CharSequence content) {
        this.f23201c.setVisibility(0);
        this.f23200b.setGravity(3);
        setBackgroundResource(a.growing_tracker_blue);
        this.f23200b.setText(content);
    }

    public void setErrorMessage(CharSequence message) {
        this.f23201c.setVisibility(8);
        this.f23200b.setGravity(17);
        setBackgroundResource(a.growing_tracker_orange);
        this.f23200b.setText(message);
    }
}
