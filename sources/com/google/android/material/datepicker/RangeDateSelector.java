package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public class RangeDateSelector implements DateSelector<p058e0.a> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new Parcelable.Creator<RangeDateSelector>() { // from class: com.google.android.material.datepicker.RangeDateSelector.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public RangeDateSelector createFromParcel(@NonNull Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.selectedStartItem = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.selectedEndItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public RangeDateSelector[] newArray(int i7) {
            return new RangeDateSelector[i7];
        }
    };

    @Nullable
    private CharSequence error;
    private String invalidRangeStartError;

    @Nullable
    private SimpleDateFormat textInputFormat;
    private final String invalidRangeEndError = " ";

    @Nullable
    private Long selectedStartItem = null;

    @Nullable
    private Long selectedEndItem = null;

    @Nullable
    private Long proposedTextStart = null;

    @Nullable
    private Long proposedTextEnd = null;

    private void clearInvalidRange(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.invalidRangeStartError.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    private boolean isValidRange(long j6, long j10) {
        return j6 <= j10;
    }

    private void setInvalidRange(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.invalidRangeStartError);
        textInputLayout2.setError(" ");
    }

    private void updateError(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.error = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            this.error = null;
        } else {
            this.error = textInputLayout2.getError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateIfValidTextProposal(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull OnSelectionChangedListener<p058e0.a> onSelectionChangedListener) {
        Long l5 = this.proposedTextStart;
        if (l5 == null || this.proposedTextEnd == null) {
            clearInvalidRange(textInputLayout, textInputLayout2);
            onSelectionChangedListener.onIncompleteSelectionChanged();
        } else if (isValidRange(l5.longValue(), this.proposedTextEnd.longValue())) {
            this.selectedStartItem = this.proposedTextStart;
            this.selectedEndItem = this.proposedTextEnd;
            onSelectionChangedListener.onSelectionChanged(getSelection());
        } else {
            setInvalidRange(textInputLayout, textInputLayout2);
            onSelectionChangedListener.onIncompleteSelectionChanged();
        }
        updateError(textInputLayout, textInputLayout2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(@NonNull Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return MaterialAttributes.resolveOrThrow(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public String getError() {
        if (TextUtils.isEmpty(this.error)) {
            return null;
        }
        return this.error.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l5 = this.selectedStartItem;
        if (l5 != null) {
            arrayList.add(l5);
        }
        Long l6 = this.selectedEndItem;
        if (l6 != null) {
            arrayList.add(l6);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<p058e0.a> getSelectedRanges() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p058e0.a(this.selectedStartItem, this.selectedEndItem));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionContentDescription(@NonNull Context context) {
        Resources resources = context.getResources();
        p058e0.a dateRangeString = DateStrings.getDateRangeString(this.selectedStartItem, this.selectedEndItem);
        Object obj = dateRangeString.f35983a;
        String string = obj == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : (String) obj;
        Object obj2 = dateRangeString.f35984b;
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, string, obj2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : (String) obj2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l5 = this.selectedStartItem;
        if (l5 == null && this.selectedEndItem == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l6 = this.selectedEndItem;
        if (l6 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, DateStrings.getDateString(l5.longValue()));
        }
        if (l5 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, DateStrings.getDateString(l6.longValue()));
        }
        p058e0.a dateRangeString = DateStrings.getDateRangeString(l5, l6);
        return resources.getString(R.string.mtrl_picker_range_header_selected, dateRangeString.f35983a, dateRangeString.f35984b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        Long l5 = this.selectedStartItem;
        return (l5 == null || this.selectedEndItem == null || !isValidRange(l5.longValue(), this.selectedEndItem.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull final OnSelectionChangedListener<p058e0.a> onSelectionChangedListener) {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        final TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        Integer colorOrNull = MaterialColors.getColorOrNull(viewInflate.getContext(), R.attr.colorOnSurfaceVariant);
        if (colorOrNull != null) {
            editText.setHintTextColor(colorOrNull.intValue());
            editText2.setHintTextColor(colorOrNull.intValue());
        }
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.invalidRangeStartError = viewInflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat defaultTextInputFormat = this.textInputFormat;
        boolean z3 = defaultTextInputFormat != null;
        if (!z3) {
            defaultTextInputFormat = UtcDates.getDefaultTextInputFormat();
        }
        SimpleDateFormat simpleDateFormat = defaultTextInputFormat;
        Long l5 = this.selectedStartItem;
        if (l5 != null) {
            editText.setText(simpleDateFormat.format(l5));
            this.proposedTextStart = this.selectedStartItem;
        }
        Long l6 = this.selectedEndItem;
        if (l6 != null) {
            editText2.setText(simpleDateFormat.format(l6));
            this.proposedTextEnd = this.selectedEndItem;
        }
        String pattern = z3 ? simpleDateFormat.toPattern() : UtcDates.getDefaultTextInputHint(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        textInputLayout2.setPlaceholderText(pattern);
        editText.addTextChangedListener(new DateFormatTextWatcher(pattern, simpleDateFormat, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onInvalidDate() {
                RangeDateSelector.this.proposedTextStart = null;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onValidDate(@Nullable Long l8) {
                RangeDateSelector.this.proposedTextStart = l8;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        editText2.addTextChangedListener(new DateFormatTextWatcher(pattern, simpleDateFormat, textInputLayout2, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.2
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onInvalidDate() {
                RangeDateSelector.this.proposedTextEnd = null;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onValidDate(@Nullable Long l8) {
                RangeDateSelector.this.proposedTextEnd = l8;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        if (!DateSelector.isTouchExplorationEnabled(viewInflate.getContext())) {
            DateSelector.showKeyboardWithAutoHideBehavior(editText, editText2);
        }
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j6) {
        Long l5 = this.selectedStartItem;
        if (l5 == null) {
            this.selectedStartItem = Long.valueOf(j6);
        } else if (this.selectedEndItem == null && isValidRange(l5.longValue(), j6)) {
            this.selectedEndItem = Long.valueOf(j6);
        } else {
            this.selectedEndItem = null;
            this.selectedStartItem = Long.valueOf(j6);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) UtcDates.getNormalizedFormat(simpleDateFormat);
        }
        this.textInputFormat = simpleDateFormat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i7) {
        parcel.writeValue(this.selectedStartItem);
        parcel.writeValue(this.selectedEndItem);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public p058e0.a getSelection() {
        return new p058e0.a(this.selectedStartItem, this.selectedEndItem);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(@NonNull p058e0.a aVar) {
        Object obj = aVar.f35983a;
        if (obj != null && aVar.f35984b != null) {
            p118hf.a.f(isValidRange(((Long) obj).longValue(), ((Long) aVar.f35984b).longValue()));
        }
        Object obj2 = aVar.f35983a;
        this.selectedStartItem = obj2 == null ? null : Long.valueOf(UtcDates.canonicalYearMonthDay(((Long) obj2).longValue()));
        Object obj3 = aVar.f35984b;
        this.selectedEndItem = obj3 != null ? Long.valueOf(UtcDates.canonicalYearMonthDay(((Long) obj3).longValue())) : null;
    }
}
