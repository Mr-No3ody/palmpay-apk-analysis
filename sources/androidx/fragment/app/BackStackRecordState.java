package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.EnumC1204n;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C1163b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f16955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f16957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f16958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16961g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CharSequence f16963j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f16964o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CharSequence f16965p;
    public final ArrayList t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f16966v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f16967w;

    public BackStackRecordState(C1161a c1161a) {
        int size = c1161a.f17161a.size();
        this.f16955a = new int[size * 6];
        if (!c1161a.f17167g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f16956b = new ArrayList(size);
        this.f16957c = new int[size];
        this.f16958d = new int[size];
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j0 j0Var = (j0) c1161a.f17161a.get(i10);
            int i11 = i7 + 1;
            this.f16955a[i7] = j0Var.f17152a;
            ArrayList arrayList = this.f16956b;
            Fragment fragment = j0Var.f17153b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f16955a;
            iArr[i11] = j0Var.f17154c ? 1 : 0;
            iArr[i7 + 2] = j0Var.f17155d;
            iArr[i7 + 3] = j0Var.f17156e;
            int i12 = i7 + 5;
            iArr[i7 + 4] = j0Var.f17157f;
            i7 += 6;
            iArr[i12] = j0Var.f17158g;
            this.f16957c[i10] = j0Var.f17159h.ordinal();
            this.f16958d[i10] = j0Var.f17160i.ordinal();
        }
        this.f16959e = c1161a.f17166f;
        this.f16960f = c1161a.f17169i;
        this.f16961g = c1161a.t;
        this.f16962i = c1161a.f17170j;
        this.f16963j = c1161a.f17171k;
        this.f16964o = c1161a.f17172l;
        this.f16965p = c1161a.f17173m;
        this.t = c1161a.f17174n;
        this.f16966v = c1161a.f17175o;
        this.f16967w = c1161a.f17176p;
    }

    public final void c(C1161a c1161a) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f16955a;
            boolean z3 = true;
            if (i7 >= iArr.length) {
                c1161a.f17166f = this.f16959e;
                c1161a.f17169i = this.f16960f;
                c1161a.f17167g = true;
                c1161a.f17170j = this.f16962i;
                c1161a.f17171k = this.f16963j;
                c1161a.f17172l = this.f16964o;
                c1161a.f17173m = this.f16965p;
                c1161a.f17174n = this.t;
                c1161a.f17175o = this.f16966v;
                c1161a.f17176p = this.f16967w;
                return;
            }
            j0 j0Var = new j0();
            int i11 = i7 + 1;
            j0Var.f17152a = iArr[i7];
            if (Z.L(2)) {
                Objects.toString(c1161a);
                int i12 = iArr[i11];
            }
            j0Var.f17159h = EnumC1204n.values()[this.f16957c[i10]];
            j0Var.f17160i = EnumC1204n.values()[this.f16958d[i10]];
            int i13 = i7 + 2;
            if (iArr[i11] == 0) {
                z3 = false;
            }
            j0Var.f17154c = z3;
            int i14 = iArr[i13];
            j0Var.f17155d = i14;
            int i15 = iArr[i7 + 3];
            j0Var.f17156e = i15;
            int i16 = i7 + 5;
            int i17 = iArr[i7 + 4];
            j0Var.f17157f = i17;
            i7 += 6;
            int i18 = iArr[i16];
            j0Var.f17158g = i18;
            c1161a.f17162b = i14;
            c1161a.f17163c = i15;
            c1161a.f17164d = i17;
            c1161a.f17165e = i18;
            c1161a.b(j0Var);
            i10++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f16955a);
        parcel.writeStringList(this.f16956b);
        parcel.writeIntArray(this.f16957c);
        parcel.writeIntArray(this.f16958d);
        parcel.writeInt(this.f16959e);
        parcel.writeString(this.f16960f);
        parcel.writeInt(this.f16961g);
        parcel.writeInt(this.f16962i);
        TextUtils.writeToParcel(this.f16963j, parcel, 0);
        parcel.writeInt(this.f16964o);
        TextUtils.writeToParcel(this.f16965p, parcel, 0);
        parcel.writeStringList(this.t);
        parcel.writeStringList(this.f16966v);
        parcel.writeInt(this.f16967w ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f16955a = parcel.createIntArray();
        this.f16956b = parcel.createStringArrayList();
        this.f16957c = parcel.createIntArray();
        this.f16958d = parcel.createIntArray();
        this.f16959e = parcel.readInt();
        this.f16960f = parcel.readString();
        this.f16961g = parcel.readInt();
        this.f16962i = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f16963j = (CharSequence) creator.createFromParcel(parcel);
        this.f16964o = parcel.readInt();
        this.f16965p = (CharSequence) creator.createFromParcel(parcel);
        this.t = parcel.createStringArrayList();
        this.f16966v = parcel.createStringArrayList();
        this.f16967w = parcel.readInt() != 0;
    }
}
