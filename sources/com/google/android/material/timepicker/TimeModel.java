package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.material.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new Parcelable.Creator<TimeModel>() { // from class: com.google.android.material.timepicker.TimeModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeModel[] newArray(int i7) {
            return new TimeModel[i7];
        }
    };
    public static final String NUMBER_FORMAT = "%d";
    public static final String ZERO_LEADING_NUMBER_FORMAT = "%02d";
    final int format;
    int hour;
    private final MaxInputValidator hourInputValidator;
    int minute;
    private final MaxInputValidator minuteInputValidator;
    int period;
    int selection;

    public TimeModel() {
        this(0);
    }

    @Nullable
    public static String formatText(Resources resources, CharSequence charSequence) {
        return formatText(resources, charSequence, ZERO_LEADING_NUMBER_FORMAT);
    }

    private static int getPeriod(int i7) {
        return i7 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.hour == timeModel.hour && this.minute == timeModel.minute && this.format == timeModel.format && this.selection == timeModel.selection;
    }

    @StringRes
    public int getHourContentDescriptionResId() {
        return this.format == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix;
    }

    public int getHourForDisplay() {
        if (this.format == 1) {
            return this.hour % 24;
        }
        int i7 = this.hour;
        if (i7 % 12 == 0) {
            return 12;
        }
        return this.period == 1 ? i7 - 12 : i7;
    }

    public MaxInputValidator getHourInputValidator() {
        return this.hourInputValidator;
    }

    public MaxInputValidator getMinuteInputValidator() {
        return this.minuteInputValidator;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.format), Integer.valueOf(this.hour), Integer.valueOf(this.minute), Integer.valueOf(this.selection)});
    }

    public void setHour(int i7) {
        if (this.format == 1) {
            this.hour = i7;
        } else {
            this.hour = (i7 % 12) + (this.period != 1 ? 0 : 12);
        }
    }

    public void setHourOfDay(int i7) {
        this.period = getPeriod(i7);
        this.hour = i7;
    }

    public void setMinute(@IntRange(from = 0, to = 59) int i7) {
        this.minute = i7 % 60;
    }

    public void setPeriod(int i7) {
        if (i7 != this.period) {
            this.period = i7;
            int i10 = this.hour;
            if (i10 < 12 && i7 == 1) {
                this.hour = i10 + 12;
            } else {
                if (i10 < 12 || i7 != 0) {
                    return;
                }
                this.hour = i10 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.hour);
        parcel.writeInt(this.minute);
        parcel.writeInt(this.selection);
        parcel.writeInt(this.format);
    }

    public TimeModel(int i7) {
        this(0, 0, 10, i7);
    }

    @Nullable
    public static String formatText(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public TimeModel(int i7, int i10, int i11, int i12) {
        this.hour = i7;
        this.minute = i10;
        this.selection = i11;
        this.format = i12;
        this.period = getPeriod(i7);
        this.minuteInputValidator = new MaxInputValidator(59);
        this.hourInputValidator = new MaxInputValidator(i12 == 1 ? 23 : 12);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
