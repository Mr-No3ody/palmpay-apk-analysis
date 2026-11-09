package com.transsnet.palmpay.core.dialog;

import C0.G;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.transsnet.palmpay.core.viewmodel.ModelMonthPick;
import com.transsnet.palmpay.util.ScreenUtils;
import java.lang.ref.WeakReference;
import p025ba.l;

/* JADX INFO: loaded from: classes3.dex */
public class MonthPickDialog extends com.transsnet.palmpay.custom_view.dialog.b implements View.OnClickListener {
    private static final String TAG = "MonthPickDialog";
    private int mAfterNow;
    private int mBeforeNow;
    private int mEndMonth;
    private View.OnClickListener mOnClickListener;
    private WeakReference<CallBack> mResultCallBack;
    private boolean mShowConfirmBtn;
    private int mStartMonth;
    private boolean mTimeFromNow;
    public ModelMonthPick modelDatePick;

    public interface CallBack {
        void onConfirmClick();
    }

    public MonthPickDialog(Context context) {
        super(context);
        this.mTimeFromNow = false;
        this.mBeforeNow = 20;
        this.mAfterNow = 100;
        this.mStartMonth = 1;
        this.mEndMonth = 12;
        this.mShowConfirmBtn = false;
    }

    private CallBack getResultCallback() {
        WeakReference<CallBack> weakReference = this.mResultCallBack;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public String getNowPickDate() {
        ModelMonthPick modelMonthPick = this.modelDatePick;
        if (modelMonthPick != null) {
            return modelMonthPick.getNowPickDate();
        }
        F6.d.c(TAG, "getNowPickDate() ,null == modelDatePick ");
        return "";
    }

    public int getNowPickMonth() {
        ModelMonthPick modelMonthPick = this.modelDatePick;
        if (modelMonthPick != null) {
            return modelMonthPick.getNowPickMonth();
        }
        F6.d.c(TAG, "getNowPickMonth() ,null == modelDatePick ");
        return 0;
    }

    public int getNowPickYear() {
        ModelMonthPick modelMonthPick = this.modelDatePick;
        if (modelMonthPick != null) {
            return modelMonthPick.getNowPickYear();
        }
        F6.d.c(TAG, "getNowPickYear() ,null == modelDatePick ");
        return 0;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        ModelMonthPick modelMonthPick = new ModelMonthPick(this.mContext);
        this.modelDatePick = modelMonthPick;
        setContentView(modelMonthPick);
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        this.modelDatePick.f28377g.setVisibility(this.mShowConfirmBtn ? 0 : 8);
        this.modelDatePick.setModelFromNow(this.mTimeFromNow);
        this.modelDatePick.f(this.mBeforeNow, this.mAfterNow);
        this.modelDatePick.g(this.mStartMonth, this.mEndMonth);
        this.modelDatePick.f28376f.setOnClickListener(this);
        this.modelDatePick.f28377g.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v3) {
        int id2 = v3.getId();
        if (id2 == p025ba.e.cmdp_close_iv) {
            dismiss();
        } else if (id2 == p025ba.e.cmdp_confirm_btn) {
            CallBack resultCallback = getResultCallback();
            if (resultCallback != null) {
                resultCallback.onConfirmClick();
            }
            dismiss();
        }
    }

    public void setCallBack(CallBack callBack) {
        this.mResultCallBack = new WeakReference<>(callBack);
    }

    public void setDateRange(int beforeNow, int afterNow) {
        this.mBeforeNow = beforeNow;
        this.mAfterNow = afterNow;
        ModelMonthPick modelMonthPick = this.modelDatePick;
        if (modelMonthPick != null) {
            modelMonthPick.f(beforeNow, afterNow);
        }
    }

    public void setMonthRange(int startMonth, int endMonth) {
        this.mStartMonth = startMonth;
        this.mEndMonth = endMonth;
        ModelMonthPick modelMonthPick = this.modelDatePick;
        if (modelMonthPick != null) {
            modelMonthPick.g(startMonth, endMonth);
        }
    }

    public void setNowPickDate(int year, int month) {
        int i7;
        String strValueOf = String.valueOf(month);
        if (month < 10) {
            strValueOf = G.o("0", strValueOf);
        }
        ModelMonthPick modelMonthPick = this.modelDatePick;
        String strValueOf2 = String.valueOf(year);
        modelMonthPick.f28381p = strValueOf2;
        modelMonthPick.t = strValueOf;
        int i10 = 0;
        if (modelMonthPick.f28379j == null || TextUtils.isEmpty(strValueOf2)) {
            i7 = 0;
            break;
        }
        i7 = 0;
        while (true) {
            if (i7 >= modelMonthPick.f28379j.size()) {
                i7 = 0;
                break;
            } else if (strValueOf2.equals(modelMonthPick.f28379j.get(i7))) {
                break;
            } else {
                i7++;
            }
        }
        String str = modelMonthPick.t;
        if (modelMonthPick.f28378i != null && !TextUtils.isEmpty(str)) {
            for (int i11 = 0; i11 < modelMonthPick.f28378i.size(); i11++) {
                if (str.equals(modelMonthPick.f28378i.get(i11))) {
                    i10 = i11;
                    break;
                }
            }
        }
        modelMonthPick.f28373c.setSelection(i7);
        modelMonthPick.f28374d.setSelection(i10);
        modelMonthPick.e();
    }

    public void setShowConfirmBtn(boolean showConfirmBtn) {
        this.mShowConfirmBtn = showConfirmBtn;
        ModelMonthPick modelMonthPick = this.modelDatePick;
        if (modelMonthPick != null) {
            modelMonthPick.f28377g.setVisibility(showConfirmBtn ? 0 : 8);
        }
    }

    public void setTimeFromNow(boolean timeFromNow) {
        this.mTimeFromNow = timeFromNow;
        ModelMonthPick modelMonthPick = this.modelDatePick;
        if (modelMonthPick != null) {
            modelMonthPick.setModelFromNow(timeFromNow);
        }
    }

    public MonthPickDialog(Context context, int layoutId) {
        super(context, layoutId);
        this.mTimeFromNow = false;
        this.mBeforeNow = 20;
        this.mAfterNow = 100;
        this.mStartMonth = 1;
        this.mEndMonth = 12;
        this.mShowConfirmBtn = false;
    }

    public MonthPickDialog(Context context, int layoutId, int styleId) {
        super(context, layoutId, styleId);
        this.mTimeFromNow = false;
        this.mBeforeNow = 20;
        this.mAfterNow = 100;
        this.mStartMonth = 1;
        this.mEndMonth = 12;
        this.mShowConfirmBtn = false;
    }
}
