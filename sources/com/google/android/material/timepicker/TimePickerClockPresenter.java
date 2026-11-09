package com.google.android.material.timepicker;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.R;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import p074f0.d;

/* JADX INFO: loaded from: classes2.dex */
class TimePickerClockPresenter implements ClockHandView.OnRotateListener, TimePickerView.OnSelectionChange, TimePickerView.OnPeriodChangeListener, ClockHandView.OnActionUpListener, TimePickerPresenter {
    private static final int DEGREES_PER_HOUR = 30;
    private static final int DEGREES_PER_MINUTE = 6;
    private boolean broadcasting = false;
    private float hourRotation;
    private float minuteRotation;
    private final TimeModel time;
    private final TimePickerView timePickerView;
    private static final String[] HOUR_CLOCK_VALUES = {TransType.TRANS_TYPE_REPAY_CASH_LOAN, "1", "2", "3", "4", "5", AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE, "7", "8", "9", TransType.TRANS_TYPE_BIND_REPAY_CARD, TransType.TRANS_TYPE_CASH_LOAN};
    private static final String[] HOUR_CLOCK_24_VALUES = {TransType.TRANS_SCENE_REFUND, "1", "2", "3", "4", "5", AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE, "7", "8", "9", TransType.TRANS_TYPE_BIND_REPAY_CARD, TransType.TRANS_TYPE_CASH_LOAN, TransType.TRANS_TYPE_REPAY_CASH_LOAN, TransType.TRANS_TYPE_AIRTIME_LOAN, "14", "15", "16", "17", "18", "19", "20", TransType.TRANS_TYPE_REPAY_AIRTIME_LOAN, TransType.TRANS_TYPE_P2P_CASH_IN, TransType.TRANS_TYPE_P2P_CASH_OUT};
    private static final String[] MINUTE_CLOCK_VALUES = {TransType.TRANS_SCENE_REFUND, "5", TransType.TRANS_TYPE_BIND_REPAY_CARD, "15", "20", "25", "30", TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT, TransType.TRANS_TYPE_BULK_DISBURSEMENT, "45", TransType.TRANS_TYPE_REFUND_2, "55"};

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
        this.timePickerView = timePickerView;
        this.time = timeModel;
        initialize();
    }

    private String[] getHourClockValues() {
        return this.time.format == 1 ? HOUR_CLOCK_24_VALUES : HOUR_CLOCK_VALUES;
    }

    private int getHourRotation() {
        return (this.time.getHourForDisplay() * 30) % MessageEvent.EVENT_CL_REPAYMENT_FAILED;
    }

    private void performHapticFeedback(int i7, int i10) {
        TimeModel timeModel = this.time;
        if (timeModel.minute == i10 && timeModel.hour == i7) {
            return;
        }
        this.timePickerView.performHapticFeedback(4);
    }

    private void updateCurrentLevel() {
        TimeModel timeModel = this.time;
        int i7 = 1;
        if (timeModel.selection == 10 && timeModel.format == 1 && timeModel.hour >= 12) {
            i7 = 2;
        }
        this.timePickerView.setCurrentLevel(i7);
    }

    private void updateTime() {
        TimePickerView timePickerView = this.timePickerView;
        TimeModel timeModel = this.time;
        timePickerView.updateTime(timeModel.period, timeModel.getHourForDisplay(), this.time.minute);
    }

    private void updateValues() {
        updateValues(HOUR_CLOCK_VALUES, TimeModel.NUMBER_FORMAT);
        updateValues(HOUR_CLOCK_24_VALUES, TimeModel.NUMBER_FORMAT);
        updateValues(MINUTE_CLOCK_VALUES, TimeModel.ZERO_LEADING_NUMBER_FORMAT);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
        this.timePickerView.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
        if (this.time.format == 0) {
            this.timePickerView.showToggle();
        }
        this.timePickerView.addOnRotateListener(this);
        this.timePickerView.setOnSelectionChangeListener(this);
        this.timePickerView.setOnPeriodChangeListener(this);
        this.timePickerView.setOnActionUpListener(this);
        updateValues();
        invalidate();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        this.hourRotation = getHourRotation();
        TimeModel timeModel = this.time;
        this.minuteRotation = timeModel.minute * 6;
        setSelection(timeModel.selection, false);
        updateTime();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    public void onActionUp(float f10, boolean z3) {
        this.broadcasting = true;
        TimeModel timeModel = this.time;
        int i7 = timeModel.minute;
        int i10 = timeModel.hour;
        if (timeModel.selection == 10) {
            this.timePickerView.setHandRotation(this.hourRotation, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.timePickerView.getContext().getSystemService(AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                setSelection(12, true);
            }
        } else {
            int iRound = Math.round(f10);
            if (!z3) {
                this.time.setMinute(((iRound + 15) / 30) * 5);
                this.minuteRotation = this.time.minute * 6;
            }
            this.timePickerView.setHandRotation(this.minuteRotation, z3);
        }
        this.broadcasting = false;
        updateTime();
        performHapticFeedback(i10, i7);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener
    public void onPeriodChange(int i7) {
        this.time.setPeriod(i7);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f10, boolean z3) {
        if (this.broadcasting || z3) {
            return;
        }
        TimeModel timeModel = this.time;
        int i7 = timeModel.hour;
        int i10 = timeModel.minute;
        int iRound = Math.round(f10);
        TimeModel timeModel2 = this.time;
        if (timeModel2.selection == 12) {
            timeModel2.setMinute((iRound + 3) / 6);
            this.minuteRotation = (float) Math.floor(this.time.minute * 6);
        } else {
            int i11 = (iRound + 15) / 30;
            if (timeModel2.format == 1) {
                i11 %= 12;
                if (this.timePickerView.getCurrentLevel() == 2) {
                    i11 += 12;
                }
            }
            this.time.setHour(i11);
            this.hourRotation = getHourRotation();
        }
        updateTime();
        performHapticFeedback(i7, i10);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i7) {
        setSelection(i7, true);
    }

    public void setSelection(int i7, boolean z3) {
        boolean z8 = i7 == 12;
        this.timePickerView.setAnimateOnTouchUp(z8);
        this.time.selection = i7;
        this.timePickerView.setValues(z8 ? MINUTE_CLOCK_VALUES : getHourClockValues(), z8 ? R.string.material_minute_suffix : this.time.getHourContentDescriptionResId());
        updateCurrentLevel();
        this.timePickerView.setHandRotation(z8 ? this.minuteRotation : this.hourRotation, z3);
        this.timePickerView.setActiveSelection(i7);
        this.timePickerView.setMinuteHourDelegate(new ClickActionDelegate(this.timePickerView.getContext(), R.string.material_hour_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.1
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.C1050b
            public void onInitializeAccessibilityNodeInfo(View view, d dVar) {
                super.onInitializeAccessibilityNodeInfo(view, dVar);
                dVar.o(view.getResources().getString(TimePickerClockPresenter.this.time.getHourContentDescriptionResId(), String.valueOf(TimePickerClockPresenter.this.time.getHourForDisplay())));
            }
        });
        this.timePickerView.setHourClickDelegate(new ClickActionDelegate(this.timePickerView.getContext(), R.string.material_minute_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.2
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.C1050b
            public void onInitializeAccessibilityNodeInfo(View view, d dVar) {
                super.onInitializeAccessibilityNodeInfo(view, dVar);
                dVar.o(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(TimePickerClockPresenter.this.time.minute)));
            }
        });
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
        this.timePickerView.setVisibility(0);
    }

    private void updateValues(String[] strArr, String str) {
        for (int i7 = 0; i7 < strArr.length; i7++) {
            strArr[i7] = TimeModel.formatText(this.timePickerView.getResources(), strArr[i7], str);
        }
    }
}
