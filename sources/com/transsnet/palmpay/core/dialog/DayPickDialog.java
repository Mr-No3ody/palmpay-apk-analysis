package com.transsnet.palmpay.core.dialog;

import C0.G;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.transsnet.palmpay.core.viewmodel.ModelDayPick;
import com.transsnet.palmpay.util.ScreenUtils;
import p025ba.l;

/* JADX INFO: loaded from: classes3.dex */
public class DayPickDialog extends com.transsnet.palmpay.custom_view.dialog.b {
    private static final String TAG = "DayPickDialog";
    private CallBack mCallBack;
    private View.OnClickListener mOnClickListener;
    private boolean mShowConfirmBtn;
    public ModelDayPick modelDatePick;

    public interface CallBack {
        void onChooseBankClick();

        void onNextStepClick();
    }

    public DayPickDialog(Context context) {
        super(context);
        this.mShowConfirmBtn = true;
    }

    public String getNowPickDate() {
        ModelDayPick modelDayPick = this.modelDatePick;
        if (modelDayPick != null) {
            return modelDayPick.getNowPickDate();
        }
        F6.d.c(TAG, "getNowPickDate() ,null == modelDatePick ");
        return "";
    }

    public int getNowPickDay() {
        ModelDayPick modelDayPick = this.modelDatePick;
        if (modelDayPick != null) {
            return modelDayPick.getNowPickDay();
        }
        F6.d.c(TAG, "getNowPickMonth() ,null == modelDatePick ");
        return 0;
    }

    public int getNowPickMonth() {
        ModelDayPick modelDayPick = this.modelDatePick;
        if (modelDayPick != null) {
            return modelDayPick.getNowPickMonth();
        }
        F6.d.c(TAG, "getNowPickMonth() ,null == modelDatePick ");
        return 0;
    }

    public int getNowPickYear() {
        ModelDayPick modelDayPick = this.modelDatePick;
        if (modelDayPick != null) {
            return modelDayPick.getNowPickYear();
        }
        F6.d.c(TAG, "getNowPickYear() ,null == modelDatePick ");
        return 0;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        ModelDayPick modelDayPick = new ModelDayPick(this.mContext);
        this.modelDatePick = modelDayPick;
        setContentView(modelDayPick);
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        this.modelDatePick.f28329i.setVisibility(this.mShowConfirmBtn ? 0 : 8);
        p185ma.e eVar = new p185ma.e(this, 0);
        this.mOnClickListener = eVar;
        this.modelDatePick.f28328g.setOnClickListener(eVar);
        this.modelDatePick.f28329i.setOnClickListener(this.mOnClickListener);
    }

    public void setCallBack(CallBack callBack) {
        this.mCallBack = callBack;
    }

    public void setNowPickDate(int year, int month) {
        String strValueOf = String.valueOf(month);
        if (month < 10) {
            strValueOf = G.o("0", strValueOf);
        }
        ModelDayPick modelDayPick = this.modelDatePick;
        String strValueOf2 = String.valueOf(year);
        modelDayPick.f28333v = strValueOf2;
        modelDayPick.f28334w = strValueOf;
        int iF = modelDayPick.f(strValueOf2);
        int iE = modelDayPick.e(modelDayPick.f28334w);
        modelDayPick.f28324c.setSelection(iF);
        modelDayPick.f28326e.setSelection(iE);
        modelDayPick.g();
    }

    public void setShowConfirmBtn(boolean showConfirmBtn) {
        this.mShowConfirmBtn = showConfirmBtn;
        ModelDayPick modelDayPick = this.modelDatePick;
        if (modelDayPick != null) {
            modelDayPick.f28329i.setVisibility(showConfirmBtn ? 0 : 8);
        }
    }

    public DayPickDialog(Context context, int layoutId) {
        super(context, layoutId);
        this.mShowConfirmBtn = true;
    }

    public DayPickDialog(Context context, int layoutId, int styleId) {
        super(context, layoutId, styleId);
        this.mShowConfirmBtn = true;
    }

    public void setNowPickDate(int year, int month, int day) {
        String strValueOf = String.valueOf(day);
        String strValueOf2 = String.valueOf(month);
        if (month < 10) {
            strValueOf2 = G.o("0", strValueOf2);
        }
        if (day < 10) {
            strValueOf = G.m(day, "0");
        }
        ModelDayPick modelDayPick = this.modelDatePick;
        String strValueOf3 = String.valueOf(year);
        modelDayPick.f28333v = strValueOf3;
        modelDayPick.f28334w = strValueOf2;
        int iF = modelDayPick.f(strValueOf3);
        int iE = modelDayPick.e(modelDayPick.f28334w);
        int i7 = 0;
        if (modelDayPick.f28332p != null && !TextUtils.isEmpty(strValueOf)) {
            for (int i10 = 0; i10 < modelDayPick.f28332p.size(); i10++) {
                if (strValueOf.equals(modelDayPick.f28332p.get(i10))) {
                    i7 = i10;
                    break;
                }
            }
        }
        modelDayPick.f28324c.setSelection(iF);
        modelDayPick.f28326e.setSelection(iE);
        modelDayPick.f28325d.setSelection(i7);
        modelDayPick.g();
    }
}
