package com.transsnet.palmpay.core.bean.req;

import com.microsoft.codepush.react.CodePushConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/UploadContactsReq;", "", "scenes", "", "batchNo", "contacts", "", "Lcom/transsnet/palmpay/core/bean/req/UploadContactsReq$Contact;", "endFlag", "", CodePushConstants.LATEST_ROLLBACK_COUNT_KEY, "", "uploadNode", "numberAddressBook", "uploadNodeDetail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZILjava/lang/String;ILjava/lang/String;)V", "Contact", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadContactsReq {

    @JvmField
    @Nullable
    public final String batchNo;

    @JvmField
    @Nullable
    public final List<Contact> contacts;

    @JvmField
    public final int count;

    @JvmField
    public final boolean endFlag;

    @JvmField
    public final int numberAddressBook;

    @JvmField
    @NotNull
    public final String scenes;

    @JvmField
    @Nullable
    public final String uploadNode;

    @JvmField
    @Nullable
    public final String uploadNodeDetail;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rB7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/UploadContactsReq$Contact;", "", "modify_time", "", "name", "", "numbers", "", "Lcom/transsnet/palmpay/core/bean/req/UploadContactsReq$Contact$Number;", "starred", "", "<init>", "(JLjava/lang/String;Ljava/util/List;I)V", "Number", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Contact {

        @JvmField
        public final long modify_time;

        @JvmField
        @NotNull
        public String name;

        @JvmField
        @Nullable
        public List<Number> numbers;

        @JvmField
        public int starred;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/UploadContactsReq$Contact$Number;", "", "number", "", "number_type", "", "<init>", "(Ljava/lang/String;I)V", "getNumber", "()Ljava/lang/String;", "setNumber", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Number {

            @NotNull
            private String number;

            @JvmField
            public final int number_type;

            /* JADX WARN: Multi-variable type inference failed */
            public Number() {
                this(null, 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Number copy$default(Number number, String str, int i7, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = number.number;
                }
                if ((i10 & 2) != 0) {
                    i7 = number.number_type;
                }
                return number.copy(str, i7);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getNumber() {
                return this.number;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getNumber_type() {
                return this.number_type;
            }

            @NotNull
            public final Number copy(@NotNull String number, int number_type) {
                Intrinsics.checkNotNullParameter(number, "number");
                return new Number(number, number_type);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Number)) {
                    return false;
                }
                Number number = (Number) other;
                return Intrinsics.c(this.number, number.number) && this.number_type == number.number_type;
            }

            @NotNull
            public final String getNumber() {
                return this.number;
            }

            public int hashCode() {
                return Integer.hashCode(this.number_type) + (this.number.hashCode() * 31);
            }

            public final void setNumber(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.number = str;
            }

            @NotNull
            public String toString() {
                return "Number(number=" + this.number + ", number_type=" + this.number_type + ")";
            }

            public Number(@NotNull String number, int i7) {
                Intrinsics.checkNotNullParameter(number, "number");
                this.number = number;
                this.number_type = i7;
            }

            public /* synthetic */ Number(String str, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0 : i7);
            }
        }

        public Contact() {
            this(0L, null, null, 0, 15, null);
        }

        public Contact(long j6, @NotNull String name, @Nullable List<Number> list, int i7) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.modify_time = j6;
            this.name = name;
            this.numbers = list;
            this.starred = i7;
        }

        public /* synthetic */ Contact(long j6, String str, List list, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0L : j6, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? 0 : i7);
        }
    }

    public UploadContactsReq(@NotNull String scenes, @Nullable String str, @Nullable List<Contact> list, boolean z3, int i7, @Nullable String str2, int i10, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(scenes, "scenes");
        this.scenes = scenes;
        this.batchNo = str;
        this.contacts = list;
        this.endFlag = z3;
        this.count = i7;
        this.uploadNode = str2;
        this.numberAddressBook = i10;
        this.uploadNodeDetail = str3;
    }

    public /* synthetic */ UploadContactsReq(String str, String str2, List list, boolean z3, int i7, String str3, int i10, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, list, (i11 & 8) != 0 ? false : z3, i7, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? 0 : i10, (i11 & 128) != 0 ? null : str4);
    }
}
