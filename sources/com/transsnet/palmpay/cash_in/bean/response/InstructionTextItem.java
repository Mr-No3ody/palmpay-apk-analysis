package com.transsnet.palmpay.cash_in.bean.response;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class InstructionTextItem implements Parcelable {
    public static final Parcelable.Creator<InstructionTextItem> CREATOR = new Parcelable.Creator<InstructionTextItem>() { // from class: com.transsnet.palmpay.cash_in.bean.response.InstructionTextItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InstructionTextItem createFromParcel(Parcel parcel) {
            return new InstructionTextItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InstructionTextItem[] newArray(int i7) {
            return new InstructionTextItem[i7];
        }
    };
    public String text;
    public String textColor;
    public int textSize;

    public InstructionTextItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void show(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setText(this.text);
        if (!TextUtils.isEmpty(this.textColor)) {
            textView.setTextColor(Color.parseColor(this.textColor));
        }
        int i7 = this.textSize;
        if (i7 > 0) {
            textView.setTextSize(i7);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.text);
        parcel.writeString(this.textColor);
        parcel.writeInt(this.textSize);
    }

    public InstructionTextItem(Parcel parcel) {
        this.text = parcel.readString();
        this.textColor = parcel.readString();
        this.textSize = parcel.readInt();
    }
}
