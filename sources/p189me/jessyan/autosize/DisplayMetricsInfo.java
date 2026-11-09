package p189me.jessyan.autosize;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class DisplayMetricsInfo implements Parcelable {
    public static final Parcelable.Creator<DisplayMetricsInfo> CREATOR = new Parcelable.Creator<DisplayMetricsInfo>() { // from class: me.jessyan.autosize.DisplayMetricsInfo.1
        @Override // android.os.Parcelable.Creator
        public DisplayMetricsInfo createFromParcel(Parcel parcel) {
            return new DisplayMetricsInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DisplayMetricsInfo[] newArray(int i7) {
            return new DisplayMetricsInfo[i7];
        }
    };
    private float density;
    private int densityDpi;
    private float scaledDensity;
    private int screenHeightDp;
    private int screenWidthDp;
    private float xdpi;

    public DisplayMetricsInfo(float f10, int i7, float f11, float f12) {
        this.density = f10;
        this.densityDpi = i7;
        this.scaledDensity = f11;
        this.xdpi = f12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDensity() {
        return this.density;
    }

    public int getDensityDpi() {
        return this.densityDpi;
    }

    public float getScaledDensity() {
        return this.scaledDensity;
    }

    public int getScreenHeightDp() {
        return this.screenHeightDp;
    }

    public int getScreenWidthDp() {
        return this.screenWidthDp;
    }

    public float getXdpi() {
        return this.xdpi;
    }

    public void setDensity(float f10) {
        this.density = f10;
    }

    public void setDensityDpi(int i7) {
        this.densityDpi = i7;
    }

    public void setScaledDensity(float f10) {
        this.scaledDensity = f10;
    }

    public void setScreenHeightDp(int i7) {
        this.screenHeightDp = i7;
    }

    public void setScreenWidthDp(int i7) {
        this.screenWidthDp = i7;
    }

    public void setXdpi(float f10) {
        this.xdpi = f10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayMetricsInfo{density=");
        sb2.append(this.density);
        sb2.append(", densityDpi=");
        sb2.append(this.densityDpi);
        sb2.append(", scaledDensity=");
        sb2.append(this.scaledDensity);
        sb2.append(", xdpi=");
        sb2.append(this.xdpi);
        sb2.append(", screenWidthDp=");
        sb2.append(this.screenWidthDp);
        sb2.append(", screenHeightDp=");
        return q0.m(sb2, this.screenHeightDp, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.density);
        parcel.writeInt(this.densityDpi);
        parcel.writeFloat(this.scaledDensity);
        parcel.writeFloat(this.xdpi);
        parcel.writeInt(this.screenWidthDp);
        parcel.writeInt(this.screenHeightDp);
    }

    public DisplayMetricsInfo(float f10, int i7, float f11, float f12, int i10, int i11) {
        this.density = f10;
        this.densityDpi = i7;
        this.scaledDensity = f11;
        this.xdpi = f12;
        this.screenWidthDp = i10;
        this.screenHeightDp = i11;
    }

    public DisplayMetricsInfo(Parcel parcel) {
        this.density = parcel.readFloat();
        this.densityDpi = parcel.readInt();
        this.scaledDensity = parcel.readFloat();
        this.xdpi = parcel.readFloat();
        this.screenWidthDp = parcel.readInt();
        this.screenHeightDp = parcel.readInt();
    }
}
