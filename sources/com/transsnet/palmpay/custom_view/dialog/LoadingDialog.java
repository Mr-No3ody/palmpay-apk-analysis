package com.transsnet.palmpay.custom_view.dialog;

import Ce.T;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieAnimationView;
import com.transsnet.palmpay.credit.ui.dialog.ViewOnClickListenerC1533v;
import com.transsnet.palmpay.custom_view.utils.CvUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class LoadingDialog extends b {
    public static volatile Boolean sForceOverlay;
    public boolean isCancelable;
    protected Integer mAnimationId;

    @Nullable
    private final Activity mHostActivity;
    private boolean mIsDark;
    private String mMessage;

    @Nullable
    private DialogInterface.OnCancelListener mOnCancelListener;
    private boolean mUseContentOverlay;

    public LoadingDialog(Context context, int i7) {
        super(context, i7);
        this.isCancelable = true;
        this.mIsDark = false;
        this.mAnimationId = null;
        Activity activityFindActivity = findActivity(context);
        this.mHostActivity = activityFindActivity;
        this.mUseContentOverlay = resolveUseOverlay() && activityFindActivity != null;
    }

    @Nullable
    private static Activity findActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAsDialog$0() {
        setCanceledOnTouchOutside(true);
    }

    public static void releaseContentOverlay(@Nullable Activity activity) {
        m.a(activity);
    }

    private static boolean resolveUseOverlay() {
        if (sForceOverlay != null) {
            return sForceOverlay.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsDark(boolean z3) {
        this.mIsDark = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        this.mMessage = str;
    }

    private void showAsDialog() {
        if (getOwnerActivity() != null) {
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity.isFinishing() || ownerActivity.isDestroyed()) {
                return;
            }
        }
        try {
            super.show();
            LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(com.transsnet.palmpay.custom_view.s.loadingAnim);
            Integer num = this.mAnimationId;
            if (num != null) {
                lottieAnimationView.setAnimation(num.intValue());
            } else if (CvUtils.isInDarkMode(lottieAnimationView) || this.mIsDark) {
                lottieAnimationView.setAnimation(com.transsnet.palmpay.custom_view.u.cv_animation_loading_dark);
            } else {
                lottieAnimationView.setAnimation(com.transsnet.palmpay.custom_view.u.cv_animation_loading);
            }
            ImageView imageView = (ImageView) findViewById(com.transsnet.palmpay.custom_view.s.ivIcon);
            if (this.mIsDark && imageView != null) {
                Configuration configuration = new Configuration(getContext().getResources().getConfiguration());
                configuration.uiMode = (configuration.uiMode & (-49)) | 32;
                imageView.setImageDrawable(getContext().createConfigurationContext(configuration).getDrawable(com.transsnet.palmpay.custom_view.r.cv_bg_loading_dialog));
            }
            if (this.isCancelable) {
                lottieAnimationView.postDelayed(new com.transsnet.adsdk.widgets.banner.bannerview.b(this, 10), 3000L);
            }
        } catch (Exception unused) {
        }
    }

    private void showAsOverlay() {
        Activity activity = this.mHostActivity;
        if (activity == null) {
            this.mUseContentOverlay = false;
            showAsDialog();
            return;
        }
        boolean z3 = this.mIsDark;
        Integer num = this.mAnimationId;
        boolean z8 = this.isCancelable;
        DialogInterface.OnCancelListener onCancelListener = this.mOnCancelListener;
        ConcurrentHashMap concurrentHashMap = m.f31286a;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            ConcurrentHashMap concurrentHashMap2 = m.f31286a;
            l lVar = (l) concurrentHashMap2.get(activity);
            if (lVar == null || lVar.f31281a.getParent() == null) {
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
                if (viewGroup instanceof FrameLayout) {
                    if (lVar != null) {
                        concurrentHashMap2.remove(activity);
                    }
                    View viewInflate = LayoutInflater.from(activity).inflate(com.transsnet.palmpay.custom_view.t.cv_layout_loading_dialog, viewGroup, false);
                    viewInflate.setId(com.transsnet.palmpay.custom_view.s.cv_loading_content_overlay);
                    viewInflate.setClickable(true);
                    viewInflate.setFocusable(true);
                    viewGroup.addView(viewInflate, new FrameLayout.LayoutParams(-1, -1));
                    viewInflate.setVisibility(8);
                    l lVar2 = new l(viewInflate);
                    viewInflate.setOnClickListener(new ViewOnClickListenerC1533v(lVar2, 20));
                    concurrentHashMap2.put(activity, lVar2);
                    lVar = lVar2;
                } else {
                    lVar = null;
                }
            }
            if (lVar != null) {
                lVar.f31282b = z8;
                lVar.f31284d = onCancelListener;
                lVar.f31283c = false;
                int i7 = com.transsnet.palmpay.custom_view.s.loadingAnim;
                View view = lVar.f31281a;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(i7);
                if (lottieAnimationView != null) {
                    if (num != null) {
                        lottieAnimationView.setAnimation(num.intValue());
                    } else if (CvUtils.isInDarkMode(lottieAnimationView) || z3) {
                        lottieAnimationView.setAnimation(com.transsnet.palmpay.custom_view.u.cv_animation_loading_dark);
                    } else {
                        lottieAnimationView.setAnimation(com.transsnet.palmpay.custom_view.u.cv_animation_loading);
                    }
                    if (!lottieAnimationView.f19579e.j()) {
                        lottieAnimationView.e();
                    }
                }
                ImageView imageView = (ImageView) view.findViewById(com.transsnet.palmpay.custom_view.s.ivIcon);
                if (z3 && imageView != null) {
                    Configuration configuration = new Configuration(view.getContext().getResources().getConfiguration());
                    configuration.uiMode = (configuration.uiMode & (-49)) | 32;
                    imageView.setImageDrawable(view.getContext().createConfigurationContext(configuration).getDrawable(com.transsnet.palmpay.custom_view.r.cv_bg_loading_dialog));
                }
                view.setVisibility(0);
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.bringChildToFront(view);
                    view.requestLayout();
                    view.invalidate();
                }
                view.post(new k(lVar, 0));
                k kVar = lVar.f31285e;
                view.removeCallbacks(kVar);
                if (lVar.f31282b) {
                    view.postDelayed(kVar, 3000L);
                    return;
                } else {
                    lVar.f31283c = false;
                    return;
                }
            }
        }
        this.mUseContentOverlay = false;
        showAsDialog();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (!this.mUseContentOverlay) {
            super.dismiss();
            return;
        }
        Activity activity = this.mHostActivity;
        if (activity == null) {
            return;
        }
        if (activity.isFinishing() || this.mHostActivity.isDestroyed()) {
            m.a(this.mHostActivity);
            return;
        }
        l lVar = (l) m.f31286a.get(this.mHostActivity);
        if (lVar == null) {
            return;
        }
        View view = lVar.f31281a;
        view.setVisibility(8);
        view.removeCallbacks(lVar.f31285e);
        lVar.f31283c = false;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
    }

    @Override // android.app.Dialog
    public boolean isShowing() {
        if (!this.mUseContentOverlay) {
            return super.isShowing();
        }
        l lVar = (l) m.f31286a.get(this.mHostActivity);
        return lVar != null && lVar.f31281a.getVisibility() == 0;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getWindow() != null) {
            getWindow().setDimAmount(0.0f);
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z3) {
        this.isCancelable = z3;
        if (!this.mUseContentOverlay) {
            super.setCancelable(z3);
            return;
        }
        Activity activity = this.mHostActivity;
        ConcurrentHashMap concurrentHashMap = m.f31286a;
        l lVar = (l) concurrentHashMap.get(activity);
        if (lVar == null) {
            return;
        }
        lVar.f31282b = z3;
        l lVar2 = (l) concurrentHashMap.get(activity);
        if (lVar2 == null || lVar2.f31281a.getVisibility() != 0) {
            return;
        }
        View view = lVar.f31281a;
        k kVar = lVar.f31285e;
        view.removeCallbacks(kVar);
        if (lVar.f31282b) {
            view.postDelayed(kVar, 3000L);
        } else {
            lVar.f31283c = false;
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z3) {
        if (!this.mUseContentOverlay) {
            super.setCanceledOnTouchOutside(z3);
            return;
        }
        l lVar = (l) m.f31286a.get(this.mHostActivity);
        if (lVar == null) {
            return;
        }
        lVar.f31283c = z3;
    }

    @Override // O6.f, android.app.Dialog
    public void setOnCancelListener(@Nullable DialogInterface.OnCancelListener onCancelListener) {
        this.mOnCancelListener = onCancelListener;
        if (!this.mUseContentOverlay) {
            super.setOnCancelListener(onCancelListener);
            return;
        }
        l lVar = (l) m.f31286a.get(this.mHostActivity);
        if (lVar == null) {
            return;
        }
        lVar.f31284d = onCancelListener;
    }

    @Override // O6.f, android.app.Dialog
    public void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        if (this.mUseContentOverlay) {
            return;
        }
        super.setOnDismissListener(new T(onDismissListener, 9));
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        if (this.mUseContentOverlay) {
            showAsOverlay();
        } else {
            showAsDialog();
        }
    }
}
