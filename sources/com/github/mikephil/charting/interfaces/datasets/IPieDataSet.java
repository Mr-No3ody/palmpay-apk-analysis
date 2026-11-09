package com.github.mikephil.charting.interfaces.datasets;

import B4.k;
import androidx.annotation.Nullable;
import com.github.mikephil.charting.data.PieEntry;

/* JADX INFO: loaded from: classes.dex */
public interface IPieDataSet extends IDataSet<PieEntry> {
    @Nullable
    Integer getHighlightColor();

    float getSelectionShift();

    float getSliceSpace();

    int getValueLineColor();

    float getValueLinePart1Length();

    float getValueLinePart1OffsetPercentage();

    float getValueLinePart2Length();

    float getValueLineWidth();

    k getXValuePosition();

    k getYValuePosition();

    boolean isAutomaticallyDisableSliceSpacingEnabled();

    boolean isUseValueColorForLineEnabled();

    boolean isValueLineVariableLength();
}
