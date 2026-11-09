package com.transsnet.palmpay.custom_view.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.transsnet.palmpay.custom_view.model.ModelDatePick;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class DatePickDialog extends b {
    private static final String TAG = "DatePickDialog";
    private ConfirmInterface mConfirmInterface;
    private ModelDatePick mModelDatePick;
    private boolean mShowConfirmBtn;

    public interface ConfirmInterface {
        void confirm();
    }

    public DatePickDialog(Context context) {
        super(context);
        this.mShowConfirmBtn = true;
        this.mConfirmInterface = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$1(View view) {
        dismiss();
        ConfirmInterface confirmInterface = this.mConfirmInterface;
        if (confirmInterface != null) {
            confirmInterface.confirm();
        }
    }

    public Calendar getDate() {
        ModelDatePick modelDatePick = this.mModelDatePick;
        if (modelDatePick != null) {
            return modelDatePick.getDate();
        }
        return null;
    }

    public String getDateString() {
        ModelDatePick modelDatePick = this.mModelDatePick;
        return modelDatePick != null ? modelDatePick.getDateString() : "";
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        ModelDatePick modelDatePick = new ModelDatePick(this.mContext);
        this.mModelDatePick = modelDatePick;
        setContentView(modelDatePick);
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(com.transsnet.palmpay.custom_view.w.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        this.mModelDatePick.f31506j.setVisibility(this.mShowConfirmBtn ? 0 : 8);
        final int i7 = 0;
        this.mModelDatePick.f31505i.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.custom_view.dialog.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DatePickDialog f31267b;

            {
                this.f31267b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f31267b.lambda$initViews$0(view);
                        break;
                    default:
                        this.f31267b.lambda$initViews$1(view);
                        break;
                }
            }
        });
        final int i10 = 1;
        this.mModelDatePick.f31506j.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.custom_view.dialog.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DatePickDialog f31267b;

            {
                this.f31267b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f31267b.lambda$initViews$0(view);
                        break;
                    default:
                        this.f31267b.lambda$initViews$1(view);
                        break;
                }
            }
        });
    }

    public void setAgeRange(int i7, int i10) {
        if (this.mModelDatePick != null) {
            int i11 = Calendar.getInstance().get(1);
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, i11 - i10);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(1, i11 - i7);
            calendar2.setTimeInMillis(calendar2.getTimeInMillis() - 86400000);
            this.mModelDatePick.j(calendar, calendar2);
        }
    }

    public void setConfirmInterface(ConfirmInterface confirmInterface) {
        this.mConfirmInterface = confirmInterface;
    }

    public void setDate(Calendar calendar) {
        ModelDatePick modelDatePick = this.mModelDatePick;
        if (modelDatePick != null) {
            modelDatePick.setDate(calendar);
        }
    }

    public void setShowConfirmBtn(boolean z3) {
        this.mShowConfirmBtn = z3;
        ModelDatePick modelDatePick = this.mModelDatePick;
        if (modelDatePick != null) {
            modelDatePick.f31506j.setVisibility(z3 ? 0 : 8);
        }
    }

    public void setStartEndDate(String str, String str2) {
        ModelDatePick modelDatePick = this.mModelDatePick;
        if (modelDatePick != null) {
            SimpleDateFormat simpleDateFormat = modelDatePick.f31500c;
            try {
                modelDatePick.k(TimeUtils.string2Date(str, simpleDateFormat), TimeUtils.string2Date(str2, simpleDateFormat));
            } catch (Exception e10) {
                F6.d.c("ModelDatePick", "setStartEndDate1: ", e10);
            }
        }
    }

    public void setDate(String str) {
        ModelDatePick modelDatePick = this.mModelDatePick;
        if (modelDatePick != null) {
            modelDatePick.setDate(str);
        }
    }

    public DatePickDialog(Context context, int i7) {
        super(context, i7);
        this.mShowConfirmBtn = true;
        this.mConfirmInterface = null;
    }

    public String getDateString(String str) {
        ModelDatePick modelDatePick = this.mModelDatePick;
        if (modelDatePick != null) {
            return TimeUtils.date2String(modelDatePick.getDate().getTime(), new SimpleDateFormat(str, Locale.ENGLISH));
        }
        return "";
    }

    public DatePickDialog(Context context, int i7, int i10) {
        super(context, i7, i10);
        this.mShowConfirmBtn = true;
        this.mConfirmInterface = null;
    }

    public void setStartEndDate(Calendar calendar, Calendar calendar2) {
        ModelDatePick modelDatePick = this.mModelDatePick;
        if (modelDatePick != null) {
            modelDatePick.j(calendar, calendar2);
        }
    }

    public void setStartEndDate(Date date, Date date2) {
        ModelDatePick modelDatePick = this.mModelDatePick;
        if (modelDatePick != null) {
            modelDatePick.k(date, date2);
        }
    }
}
