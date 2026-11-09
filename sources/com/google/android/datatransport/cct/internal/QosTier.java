package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public enum QosTier {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private static final SparseArray<QosTier> valueMap;
    private final int value;

    static {
        QosTier qosTier = DEFAULT;
        QosTier qosTier2 = UNMETERED_ONLY;
        QosTier qosTier3 = UNMETERED_OR_DAILY;
        QosTier qosTier4 = FAST_IF_RADIO_AWAKE;
        QosTier qosTier5 = NEVER;
        QosTier qosTier6 = UNRECOGNIZED;
        SparseArray<QosTier> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, qosTier);
        sparseArray.put(1, qosTier2);
        sparseArray.put(2, qosTier3);
        sparseArray.put(3, qosTier4);
        sparseArray.put(4, qosTier5);
        sparseArray.put(-1, qosTier6);
    }

    QosTier(int i7) {
        this.value = i7;
    }

    @Nullable
    public static QosTier forNumber(int i7) {
        if (i7 == 0) {
            return DEFAULT;
        }
        if (i7 == 1) {
            return UNMETERED_ONLY;
        }
        if (i7 == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i7 == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i7 != 4) {
            return null;
        }
        return NEVER;
    }

    public final int getNumber() {
        return this.value;
    }
}
