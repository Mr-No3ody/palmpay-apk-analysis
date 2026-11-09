package com.transsnet.palmpay.send_money.bean.resp;

import C0.G;
import N8.q0;
import android.text.TextUtils;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.send_money.utils.OnSectionListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377z5.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/LocalContactsResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "<init>", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/transsnet/palmpay/send_money/bean/resp/LocalContactsResp$LocalContactBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "LocalContactBean", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalContactsResp extends CommonResult {

    @Nullable
    private List<LocalContactBean> data;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jb\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\"2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u000f¨\u00065"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/LocalContactsResp$LocalContactBean;", "Lcom/chad/library/adapter/base/entity/SectionEntity;", "Lcom/transsnet/palmpay/send_money/utils/OnSectionListener;", "memberId", "", "fullName", "phone", "headPortrait", "createTime", "", "updateTime", "header", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getMemberId", "()Ljava/lang/String;", "setMemberId", "(Ljava/lang/String;)V", "getFullName", "setFullName", "getPhone", "setPhone", "getHeadPortrait", "setHeadPortrait", "getCreateTime", "()Ljava/lang/Long;", "setCreateTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getUpdateTime", "setUpdateTime", "getHeader", "setHeader", "isHeader", "", "()Z", "section", "getSection", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/transsnet/palmpay/send_money/bean/resp/LocalContactsResp$LocalContactBean;", "equals", "other", "", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LocalContactBean implements SectionEntity, OnSectionListener {

        @Nullable
        private Long createTime;

        @Nullable
        private String fullName;

        @Nullable
        private String headPortrait;

        @Nullable
        private String header;

        @Nullable
        private String memberId;

        @Nullable
        private String phone;

        @Nullable
        private Long updateTime;

        public LocalContactBean() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public static /* synthetic */ LocalContactBean copy$default(LocalContactBean localContactBean, String str, String str2, String str3, String str4, Long l5, Long l6, String str5, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = localContactBean.memberId;
            }
            if ((i7 & 2) != 0) {
                str2 = localContactBean.fullName;
            }
            if ((i7 & 4) != 0) {
                str3 = localContactBean.phone;
            }
            if ((i7 & 8) != 0) {
                str4 = localContactBean.headPortrait;
            }
            if ((i7 & 16) != 0) {
                l5 = localContactBean.createTime;
            }
            if ((i7 & 32) != 0) {
                l6 = localContactBean.updateTime;
            }
            if ((i7 & 64) != 0) {
                str5 = localContactBean.header;
            }
            Long l8 = l6;
            String str6 = str5;
            Long l10 = l5;
            String str7 = str3;
            return localContactBean.copy(str, str2, str7, str4, l10, l8, str6);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFullName() {
            return this.fullName;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getHeadPortrait() {
            return this.headPortrait;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Long getCreateTime() {
            return this.createTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Long getUpdateTime() {
            return this.updateTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getHeader() {
            return this.header;
        }

        @NotNull
        public final LocalContactBean copy(@Nullable String memberId, @Nullable String fullName, @Nullable String phone, @Nullable String headPortrait, @Nullable Long createTime, @Nullable Long updateTime, @Nullable String header) {
            return new LocalContactBean(memberId, fullName, phone, headPortrait, createTime, updateTime, header);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocalContactBean)) {
                return false;
            }
            LocalContactBean localContactBean = (LocalContactBean) other;
            return Intrinsics.c(this.memberId, localContactBean.memberId) && Intrinsics.c(this.fullName, localContactBean.fullName) && Intrinsics.c(this.phone, localContactBean.phone) && Intrinsics.c(this.headPortrait, localContactBean.headPortrait) && Intrinsics.c(this.createTime, localContactBean.createTime) && Intrinsics.c(this.updateTime, localContactBean.updateTime) && Intrinsics.c(this.header, localContactBean.header);
        }

        @Nullable
        public final Long getCreateTime() {
            return this.createTime;
        }

        @Nullable
        public final String getFullName() {
            return this.fullName;
        }

        @Nullable
        public final String getHeadPortrait() {
            return this.headPortrait;
        }

        @Nullable
        public final String getHeader() {
            return this.header;
        }

        @Override // com.chad.library.adapter.base.entity.SectionEntity, com.chad.library.adapter.base.entity.MultiItemEntity
        public int getItemType() {
            return l.j(this);
        }

        @Nullable
        public final String getMemberId() {
            return this.memberId;
        }

        @Nullable
        public final String getPhone() {
            return this.phone;
        }

        @Override // com.transsnet.palmpay.send_money.utils.OnSectionListener
        @Nullable
        public String getSection() {
            return this.fullName;
        }

        @Nullable
        public final Long getUpdateTime() {
            return this.updateTime;
        }

        public int hashCode() {
            String str = this.memberId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fullName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.headPortrait;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l5 = this.createTime;
            int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
            Long l6 = this.updateTime;
            int iHashCode6 = (iHashCode5 + (l6 == null ? 0 : l6.hashCode())) * 31;
            String str5 = this.header;
            return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        @Override // com.chad.library.adapter.base.entity.SectionEntity
        public boolean isHeader() {
            return !TextUtils.isEmpty(this.header);
        }

        public final void setCreateTime(@Nullable Long l5) {
            this.createTime = l5;
        }

        public final void setFullName(@Nullable String str) {
            this.fullName = str;
        }

        public final void setHeadPortrait(@Nullable String str) {
            this.headPortrait = str;
        }

        public final void setHeader(@Nullable String str) {
            this.header = str;
        }

        public final void setMemberId(@Nullable String str) {
            this.memberId = str;
        }

        public final void setPhone(@Nullable String str) {
            this.phone = str;
        }

        public final void setUpdateTime(@Nullable Long l5) {
            this.updateTime = l5;
        }

        @NotNull
        public String toString() {
            String str = this.memberId;
            String str2 = this.fullName;
            String str3 = this.phone;
            String str4 = this.headPortrait;
            Long l5 = this.createTime;
            Long l6 = this.updateTime;
            String str5 = this.header;
            StringBuilder sbF = F.f("LocalContactBean(memberId=", str, ", fullName=", str2, ", phone=");
            u.x(sbF, str3, ", headPortrait=", str4, ", createTime=");
            q0.w(sbF, l5, ", updateTime=", l6, ", header=");
            return G.r(sbF, str5, ")");
        }

        public LocalContactBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l5, @Nullable Long l6, @Nullable String str5) {
            this.memberId = str;
            this.fullName = str2;
            this.phone = str3;
            this.headPortrait = str4;
            this.createTime = l5;
            this.updateTime = l6;
            this.header = str5;
        }

        public /* synthetic */ LocalContactBean(String str, String str2, String str3, String str4, Long l5, Long l6, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : l5, (i7 & 32) != 0 ? null : l6, (i7 & 64) != 0 ? null : str5);
        }
    }

    @Nullable
    public final List<LocalContactBean> getData() {
        return this.data;
    }

    public final void setData(@Nullable List<LocalContactBean> list) {
        this.data = list;
    }
}
