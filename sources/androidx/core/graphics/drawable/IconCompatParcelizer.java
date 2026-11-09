package androidx.core.graphics.drawable;

import S0.a;
import S0.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.nio.charset.Charset;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39800a})
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i7 = iconCompat.f16047a;
        if (aVar.e(1)) {
            i7 = ((b) aVar).f8632e.readInt();
        }
        iconCompat.f16047a = i7;
        byte[] bArr = iconCompat.f16049c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f8632e;
            int i10 = parcel.readInt();
            if (i10 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i10];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f16049c = bArr;
        iconCompat.f16050d = aVar.f(iconCompat.f16050d, 3);
        int i11 = iconCompat.f16051e;
        if (aVar.e(4)) {
            i11 = ((b) aVar).f8632e.readInt();
        }
        iconCompat.f16051e = i11;
        int i12 = iconCompat.f16052f;
        if (aVar.e(5)) {
            i12 = ((b) aVar).f8632e.readInt();
        }
        iconCompat.f16052f = i12;
        iconCompat.f16053g = (ColorStateList) aVar.f(iconCompat.f16053g, 6);
        String string = iconCompat.f16055i;
        if (aVar.e(7)) {
            string = ((b) aVar).f8632e.readString();
        }
        iconCompat.f16055i = string;
        String string2 = iconCompat.f16056j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f8632e.readString();
        }
        iconCompat.f16056j = string2;
        iconCompat.f16054h = PorterDuff.Mode.valueOf(iconCompat.f16055i);
        switch (iconCompat.f16047a) {
            case -1:
                Parcelable parcelable = iconCompat.f16050d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f16048b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f16050d;
                if (parcelable2 != null) {
                    iconCompat.f16048b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f16049c;
                iconCompat.f16048b = bArr3;
                iconCompat.f16047a = 3;
                iconCompat.f16051e = 0;
                iconCompat.f16052f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f16049c, Charset.forName("UTF-16"));
                iconCompat.f16048b = str;
                if (iconCompat.f16047a == 2 && iconCompat.f16056j == null) {
                    iconCompat.f16056j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f16048b = iconCompat.f16049c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f16055i = iconCompat.f16054h.name();
        switch (iconCompat.f16047a) {
            case -1:
                iconCompat.f16050d = (Parcelable) iconCompat.f16048b;
                break;
            case 1:
            case 5:
                iconCompat.f16050d = (Parcelable) iconCompat.f16048b;
                break;
            case 2:
                iconCompat.f16049c = ((String) iconCompat.f16048b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f16049c = (byte[]) iconCompat.f16048b;
                break;
            case 4:
            case 6:
                iconCompat.f16049c = iconCompat.f16048b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i7 = iconCompat.f16047a;
        if (-1 != i7) {
            aVar.h(1);
            ((b) aVar).f8632e.writeInt(i7);
        }
        byte[] bArr = iconCompat.f16049c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f8632e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f16050d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f8632e.writeParcelable(parcelable, 0);
        }
        int i10 = iconCompat.f16051e;
        if (i10 != 0) {
            aVar.h(4);
            ((b) aVar).f8632e.writeInt(i10);
        }
        int i11 = iconCompat.f16052f;
        if (i11 != 0) {
            aVar.h(5);
            ((b) aVar).f8632e.writeInt(i11);
        }
        ColorStateList colorStateList = iconCompat.f16053g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f8632e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f16055i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f8632e.writeString(str);
        }
        String str2 = iconCompat.f16056j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f8632e.writeString(str2);
        }
    }
}
