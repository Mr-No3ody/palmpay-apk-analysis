package M7;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import com.swmansion.rnscreens.CustomToolbar;
import com.swmansion.rnscreens.ScreenContainer;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: M7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ChoreographerFrameCallbackC0441a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5804b;

    public /* synthetic */ ChoreographerFrameCallbackC0441a(ViewGroup viewGroup, int i7) {
        this.f5803a = i7;
        this.f5804b = viewGroup;
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        switch (this.f5803a) {
            case 0:
                CustomToolbar customToolbar = (CustomToolbar) this.f5804b;
                customToolbar.f25257g = false;
                customToolbar.measure(View.MeasureSpec.makeMeasureSpec(customToolbar.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(customToolbar.getHeight(), Integer.MIN_VALUE));
                customToolbar.layout(customToolbar.getLeft(), customToolbar.getTop(), customToolbar.getRight(), customToolbar.getBottom());
                break;
            case 1:
                ScreenContainer screenContainer = (ScreenContainer) this.f5804b;
                screenContainer.f25309e = false;
                screenContainer.measure(View.MeasureSpec.makeMeasureSpec(screenContainer.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(screenContainer.getHeight(), 1073741824));
                screenContainer.layout(screenContainer.getLeft(), screenContainer.getTop(), screenContainer.getRight(), screenContainer.getBottom());
                break;
            default:
                ViewGroup viewGroup = (ViewGroup) ((WeakReference) this.f5804b).get();
                if (viewGroup != null) {
                    if (!viewGroup.isAttachedToWindow()) {
                        Choreographer.getInstance().postFrameCallback(this);
                    } else if (a(viewGroup.getContext())) {
                        int width = viewGroup.getWidth() > 0 ? viewGroup.getWidth() : viewGroup.getMeasuredWidth();
                        int height = viewGroup.getHeight() > 0 ? viewGroup.getHeight() : viewGroup.getMeasuredHeight();
                        if (width <= 0 || height <= 0) {
                            Choreographer.getInstance().postFrameCallback(this);
                        } else {
                            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                                View childAt = viewGroup.getChildAt(i7);
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
                                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                            }
                            viewGroup.getViewTreeObserver().dispatchOnGlobalLayout();
                            Choreographer.getInstance().postFrameCallback(this);
                        }
                    } else {
                        Choreographer.getInstance().postFrameCallback(this);
                    }
                    break;
                }
                break;
        }
    }

    public ChoreographerFrameCallbackC0441a(ViewGroup viewGroup) {
        this.f5803a = 2;
        this.f5804b = new WeakReference(viewGroup);
    }
}
