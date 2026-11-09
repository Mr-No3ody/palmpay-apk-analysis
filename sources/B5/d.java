package B5;

import android.R;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.N;
import com.imuxuan.floatingview.DefaultFloatingView;
import com.imuxuan.floatingview.FloatingMagnetView;
import com.imuxuan.floatingview.IFloatingView;
import com.imuxuan.floatingview.MagnetViewListener;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements IFloatingView {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile d f377f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FloatingMagnetView f378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f380c = p205nc.c.cv_en_floating_view;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f381d = p205nc.b.palmpay_logo_text_vertical;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewGroup.LayoutParams f382e;

    public d() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388693;
        try {
            layoutParams.setMargins(0, layoutParams.topMargin, 0, this.f378a.getContext().getResources().getDimensionPixelSize(p205nc.a.dp64));
        } catch (Exception unused) {
        }
        this.f382e = layoutParams;
    }

    public static d a() {
        if (f377f == null) {
            synchronized (d.class) {
                try {
                    if (f377f == null) {
                        f377f = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f377f;
    }

    @Override // com.imuxuan.floatingview.IFloatingView
    public final d add() {
        synchronized (this) {
            try {
                if (this.f378a != null) {
                    return this;
                }
                DefaultFloatingView defaultFloatingView = new DefaultFloatingView(C5.a.f1157a, this.f380c);
                this.f378a = defaultFloatingView;
                defaultFloatingView.setLayoutParams(this.f382e);
                defaultFloatingView.setIconImage(this.f381d);
                if (b() != null) {
                    b().addView(defaultFloatingView);
                }
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.imuxuan.floatingview.IFloatingView
    public final d attach(FrameLayout frameLayout) {
        FloatingMagnetView floatingMagnetView;
        if (frameLayout == null || (floatingMagnetView = this.f378a) == null) {
            this.f379b = new WeakReference(frameLayout);
            return this;
        }
        if (floatingMagnetView.getParent() == frameLayout) {
            return this;
        }
        if (this.f378a.getParent() != null) {
            ((ViewGroup) this.f378a.getParent()).removeView(this.f378a);
        }
        this.f379b = new WeakReference(frameLayout);
        frameLayout.addView(this.f378a);
        return this;
    }

    public final FrameLayout b() {
        WeakReference weakReference = this.f379b;
        if (weakReference == null) {
            return null;
        }
        return (FrameLayout) weakReference.get();
    }

    @Override // com.imuxuan.floatingview.IFloatingView
    public final d customView(FloatingMagnetView floatingMagnetView) {
        this.f378a = floatingMagnetView;
        floatingMagnetView.setLayoutParams(this.f382e);
        return this;
    }

    @Override // com.imuxuan.floatingview.IFloatingView
    public final d detach(FrameLayout frameLayout) {
        FloatingMagnetView floatingMagnetView = this.f378a;
        if (floatingMagnetView != null && frameLayout != null) {
            WeakHashMap weakHashMap = N.f16168a;
            if (floatingMagnetView.isAttachedToWindow()) {
                frameLayout.removeView(this.f378a);
            }
        }
        if (b() == frameLayout) {
            this.f379b = null;
        }
        return this;
    }

    @Override // com.imuxuan.floatingview.IFloatingView
    public final FloatingMagnetView getView() {
        return this.f378a;
    }

    @Override // com.imuxuan.floatingview.IFloatingView
    public final d icon(int i7) {
        this.f381d = i7;
        return this;
    }

    @Override // com.imuxuan.floatingview.IFloatingView
    public final d layoutParams(ViewGroup.LayoutParams layoutParams) {
        this.f382e = layoutParams;
        FloatingMagnetView floatingMagnetView = this.f378a;
        if (floatingMagnetView != null) {
            floatingMagnetView.setLayoutParams(layoutParams);
        }
        return this;
    }

    @Override // com.imuxuan.floatingview.IFloatingView
    public final d listener(MagnetViewListener magnetViewListener) {
        FloatingMagnetView floatingMagnetView = this.f378a;
        if (floatingMagnetView != null) {
            floatingMagnetView.setMagnetViewListener(magnetViewListener);
        }
        return this;
    }

    @Override // com.imuxuan.floatingview.IFloatingView
    public final d remove() {
        new Handler(Looper.getMainLooper()).post(new c(this, 0));
        return this;
    }

    @Override // com.imuxuan.floatingview.IFloatingView
    public final d customView(int i7) {
        this.f380c = i7;
        return this;
    }

    @Override // com.imuxuan.floatingview.IFloatingView
    public final d detach(Activity activity) {
        FrameLayout frameLayout;
        if (activity == null) {
            frameLayout = null;
        } else {
            try {
                frameLayout = (FrameLayout) activity.getWindow().getDecorView().findViewById(R.id.content);
            } catch (Exception unused) {
                frameLayout = null;
            }
        }
        detach(frameLayout);
        return this;
    }

    @Override // com.imuxuan.floatingview.IFloatingView
    public final d attach(Activity activity) {
        FrameLayout frameLayout;
        if (activity == null) {
            frameLayout = null;
        } else {
            try {
                frameLayout = (FrameLayout) activity.getWindow().getDecorView().findViewById(R.id.content);
            } catch (Exception unused) {
                frameLayout = null;
            }
        }
        attach(frameLayout);
        return this;
    }
}
