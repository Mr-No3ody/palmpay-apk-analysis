package com.transsnet.palmpay.custom_view.dialog;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.fragment.app.E;
import com.transsnet.palmpay.core.util.statistic.AutoTrackHelper;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.util.UnclassifiedUtil;
import io.reactivex.disposables.Disposable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends O6.f implements DialogInterface.OnShowListener {
    private static final String TAG = "BaseDialog";
    private static Method mStatisticMethod;
    protected p103gf.a mCompositeDisposable;
    protected Context mContext;
    private JSONObject mExtraInfo;
    protected int mLayoutId;
    private DialogInterface.OnShowListener mOnShowListener;

    static {
        try {
            int i7 = AutoTrackHelper.f28190a;
            mStatisticMethod = AutoTrackHelper.class.getMethod("trackDialogOnShow", Dialog.class, JSONObject.class);
        } catch (Exception e10) {
            F6.d.c(TAG, "static initializer: ", e10);
        }
    }

    public b(Context context, int i7, int i10) {
        super(context, i10);
        this.mLayoutId = i7;
    }

    public static boolean isValidActivityContext(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
        }
        if (context instanceof ContextWrapper) {
            return isValidActivityContext(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    public void addSubscription(Disposable disposable) {
        if (this.mCompositeDisposable == null) {
            this.mCompositeDisposable = new p103gf.a();
        }
        this.mCompositeDisposable.add(disposable);
    }

    public void addTrackProperty(String str, Object obj) {
        HashMap map = new HashMap();
        map.put(str, obj);
        addTrackProperty(map);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        p103gf.a aVar = this.mCompositeDisposable;
        if (aVar != null) {
            aVar.dispose();
            this.mCompositeDisposable = null;
        }
        if (getOwnerActivity() != null) {
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity.isFinishing() || ownerActivity.isDestroyed()) {
                return;
            }
        }
        try {
            if (isShowing()) {
                super.dismiss();
            }
        } catch (Exception e10) {
            F6.d.c(TAG, "dismiss: ", e10);
        }
    }

    public E getActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof E) {
            return (E) context;
        }
        if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public abstract void initViews();

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            getWindow().requestFeature(1);
            getWindow().setBackgroundDrawableResource(R.color.transparent);
        } catch (Throwable th) {
            F6.d.h(TAG, 3, "onCreate: " + th);
        }
        int i7 = this.mLayoutId;
        if (i7 > 0) {
            try {
                setContentView(i7);
            } catch (Exception e10) {
                if (e10.getMessage() != null && e10.getMessage().toLowerCase(Locale.ROOT).contains("webview")) {
                    ToastUtils.showLong(e10.getMessage());
                    dismiss();
                    return;
                }
            }
        }
        this.mContext = getContext();
        initViews();
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Method method;
        if (!(this instanceof LoadingDialog) && (method = mStatisticMethod) != null) {
            try {
                method.invoke(null, this, this.mExtraInfo);
            } catch (Exception e10) {
                F6.d.c(TAG, "show: ", e10);
            }
        }
        DialogInterface.OnShowListener onShowListener = this.mOnShowListener;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        super.setOnShowListener(this);
    }

    @Override // O6.f, android.app.Dialog
    public void setOnShowListener(@Nullable DialogInterface.OnShowListener onShowListener) {
        this.mOnShowListener = onShowListener;
    }

    public void showAtBottom(Window window, int i7) {
        showAtBottom(window, i7, ScreenUtils.getScreenWidth());
    }

    public void showAtCenter(Window window) {
        showAtCenter(window, com.transsnet.palmpay.custom_view.w.Animation_CommonDialog);
    }

    public void showAtTop(Window window, int i7) {
        if (window == null) {
            return;
        }
        window.setGravity(48);
        window.setWindowAnimations(i7);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    public void showAtBottom(Window window, int i7, int i10) {
        if (window == null) {
            return;
        }
        window.setGravity(80);
        window.setWindowAnimations(i7);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = i10;
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    public void showAtCenter(Window window, int i7) {
        showAtCenter(window, i7, (int) (ScreenUtils.getScreenWidth() * 0.9f));
    }

    public b(Context context) {
        this(context, 0, com.transsnet.palmpay.custom_view.w.BaseDialogTheme);
    }

    public void showAtCenter(Window window, int i7, int i10) {
        if (window == null) {
            return;
        }
        window.setGravity(17);
        window.setWindowAnimations(i7);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = i10;
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    public b(Context context, int i7) {
        this(context, i7, com.transsnet.palmpay.custom_view.w.BaseDialogTheme);
    }

    public void addTrackProperty(Map<String, Object> map) {
        try {
            if (this.mExtraInfo == null) {
                this.mExtraInfo = new JSONObject();
            }
            UnclassifiedUtil.mergeJSONObject(map, this.mExtraInfo);
        } catch (JSONException e10) {
            F6.d.c(TAG, "addTrackProperty: ", e10);
        }
    }

    public void showAtTop(Window window) {
        showAtTop(window, com.transsnet.palmpay.custom_view.w.Animation_slide_in_right_top);
    }

    public void showAtBottom(Window window) {
        showAtBottom(window, com.transsnet.palmpay.custom_view.w.dialog_bottom_in_out);
    }
}
