package com.google.android.gms.common.images;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.F;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;

/* JADX INFO: loaded from: classes2.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i7, int i10) {
        this.zaa = i7;
        this.zab = i10;
    }

    @NonNull
    public static Size parseSize(@NonNull String str) throws NumberFormatException {
        if (str == null) {
            throw new IllegalArgumentException("string must not be null");
        }
        int iIndexOf = str.indexOf(42);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP);
        }
        if (iIndexOf < 0) {
            throw zaa(str);
        }
        try {
            return new Size(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (NumberFormatException unused) {
            throw zaa(str);
        }
    }

    private static NumberFormatException zaa(String str) {
        throw new NumberFormatException(F.d(new StringBuilder(str.length() + 16), "Invalid Size: \"", str, "\""));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.zaa == size.zaa && this.zab == size.zab) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int i7 = this.zaa;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.zab;
    }

    @NonNull
    public String toString() {
        int i7 = this.zaa;
        int length = String.valueOf(i7).length();
        int i10 = this.zab;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(i10).length());
        sb2.append(i7);
        sb2.append("x");
        sb2.append(i10);
        return sb2.toString();
    }
}
