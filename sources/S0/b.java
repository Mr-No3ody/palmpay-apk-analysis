package S0;

import C0.G;
import M.f;
import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f8631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f8632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8638k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new f(0), new f(0), new f(0));
    }

    @Override // S0.a
    public final b a() {
        Parcel parcel = this.f8632e;
        int iDataPosition = parcel.dataPosition();
        int i7 = this.f8637j;
        if (i7 == this.f8633f) {
            i7 = this.f8634g;
        }
        return new b(parcel, iDataPosition, i7, G.r(new StringBuilder(), this.f8635h, "  "), this.f8628a, this.f8629b, this.f8630c);
    }

    @Override // S0.a
    public final boolean e(int i7) {
        while (this.f8637j < this.f8634g) {
            int i10 = this.f8638k;
            if (i10 == i7) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            int i11 = this.f8637j;
            Parcel parcel = this.f8632e;
            parcel.setDataPosition(i11);
            int i12 = parcel.readInt();
            this.f8638k = parcel.readInt();
            this.f8637j += i12;
        }
        return this.f8638k == i7;
    }

    @Override // S0.a
    public final void h(int i7) {
        int i10 = this.f8636i;
        SparseIntArray sparseIntArray = this.f8631d;
        Parcel parcel = this.f8632e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(iDataPosition - i11);
            parcel.setDataPosition(iDataPosition);
        }
        this.f8636i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }

    public b(Parcel parcel, int i7, int i10, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.f8631d = new SparseIntArray();
        this.f8636i = -1;
        this.f8638k = -1;
        this.f8632e = parcel;
        this.f8633f = i7;
        this.f8634g = i10;
        this.f8637j = i7;
        this.f8635h = str;
    }
}
