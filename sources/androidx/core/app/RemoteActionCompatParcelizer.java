package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcelable;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39800a})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(S0.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        VersionedParcelable versionedParcelableG = remoteActionCompat.f15954a;
        boolean z3 = true;
        if (aVar.e(1)) {
            versionedParcelableG = aVar.g();
        }
        remoteActionCompat.f15954a = (IconCompat) versionedParcelableG;
        CharSequence charSequence = remoteActionCompat.f15955b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((S0.b) aVar).f8632e);
        }
        remoteActionCompat.f15955b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f15956c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((S0.b) aVar).f8632e);
        }
        remoteActionCompat.f15956c = charSequence2;
        remoteActionCompat.f15957d = (PendingIntent) aVar.f(remoteActionCompat.f15957d, 4);
        boolean z8 = remoteActionCompat.f15958e;
        if (aVar.e(5)) {
            z8 = ((S0.b) aVar).f8632e.readInt() != 0;
        }
        remoteActionCompat.f15958e = z8;
        boolean z10 = remoteActionCompat.f15959f;
        if (!aVar.e(6)) {
            z3 = z10;
        } else if (((S0.b) aVar).f8632e.readInt() == 0) {
            z3 = false;
        }
        remoteActionCompat.f15959f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, S0.a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f15954a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f15955b;
        aVar.h(2);
        Parcel parcel = ((S0.b) aVar).f8632e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f15956c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f15957d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f15958e;
        aVar.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z8 = remoteActionCompat.f15959f;
        aVar.h(6);
        parcel.writeInt(z8 ? 1 : 0);
    }
}
