package com.transsnet.palmpay.account.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AccountHistoryListRsp implements Parcelable {
    public static final Parcelable.Creator<AccountHistoryListRsp> CREATOR = new Parcelable.Creator<AccountHistoryListRsp>() { // from class: com.transsnet.palmpay.account.bean.AccountHistoryListRsp.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountHistoryListRsp createFromParcel(Parcel parcel) {
            return new AccountHistoryListRsp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountHistoryListRsp[] newArray(int i7) {
            return new AccountHistoryListRsp[i7];
        }
    };
    public List<ItemListBean> itemList;
    public boolean multiSelect;
    public String question;
    public String questionId;

    public static class ItemListBean implements Parcelable {
        public static final Parcelable.Creator<ItemListBean> CREATOR = new Parcelable.Creator<ItemListBean>() { // from class: com.transsnet.palmpay.account.bean.AccountHistoryListRsp.ItemListBean.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ItemListBean createFromParcel(Parcel parcel) {
                return new ItemListBean(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ItemListBean[] newArray(int i7) {
                return new ItemListBean[i7];
            }
        };
        public boolean check;
        public String itemContent;
        public long itemId;

        public ItemListBean() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void readFromParcel(Parcel parcel) {
            this.itemContent = parcel.readString();
            this.itemId = parcel.readLong();
            this.check = parcel.readByte() != 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.itemContent);
            parcel.writeLong(this.itemId);
            parcel.writeByte(this.check ? (byte) 1 : (byte) 0);
        }

        public ItemListBean(Parcel parcel) {
            this.itemContent = parcel.readString();
            this.itemId = parcel.readLong();
            this.check = parcel.readByte() != 0;
        }
    }

    public AccountHistoryListRsp() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.itemList = arrayList;
        parcel.readList(arrayList, ItemListBean.class.getClassLoader());
        this.multiSelect = parcel.readByte() != 0;
        this.question = parcel.readString();
        this.questionId = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeList(this.itemList);
        parcel.writeByte(this.multiSelect ? (byte) 1 : (byte) 0);
        parcel.writeString(this.question);
        parcel.writeString(this.questionId);
    }

    public AccountHistoryListRsp(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.itemList = arrayList;
        parcel.readList(arrayList, ItemListBean.class.getClassLoader());
        this.multiSelect = parcel.readByte() != 0;
        this.question = parcel.readString();
        this.questionId = parcel.readString();
    }
}
