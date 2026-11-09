package com.transsnet.palmpay.core.db.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

/* JADX INFO: loaded from: classes3.dex */
@Entity(primaryKeys = {"contact_member_id", "own_member_id"}, tableName = "request_contacts")
public class RequestContact {

    @Nullable
    @ColumnInfo(name = "alias")
    private String alias;

    @NonNull
    @ColumnInfo(name = "contact_member_id")
    private String contactsMemberId;

    @ColumnInfo(name = "create_time")
    private long createTime;

    @ColumnInfo(name = "expire_time")
    private long expireTime;

    @Nullable
    @ColumnInfo(name = "full_name")
    private String fullName;

    @Nullable
    @ColumnInfo(name = "is_favourite")
    private String isFavourite;

    @ColumnInfo(name = "is_friend")
    private boolean isFriend;

    @NonNull
    @ColumnInfo(name = "own_member_id")
    private String memberId;

    @Nullable
    @ColumnInfo(name = "phone")
    private String phone;

    @Nullable
    @ColumnInfo(name = "photo_path")
    private String photoPath;

    @Nullable
    @ColumnInfo(name = "request_source")
    private String requestSource;

    @ColumnInfo(name = "update_time")
    private long updateTime;

    @Nullable
    public String getAlias() {
        return this.alias;
    }

    @NonNull
    public String getContactsMemberId() {
        return this.contactsMemberId;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    public String getFullName() {
        return this.fullName;
    }

    @Nullable
    public String getIsFavourite() {
        return this.isFavourite;
    }

    @NonNull
    public String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public String getPhone() {
        return this.phone;
    }

    @Nullable
    public String getPhotoPath() {
        return this.photoPath;
    }

    @Nullable
    public String getRequestSource() {
        return this.requestSource;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public boolean isFriend() {
        return this.isFriend;
    }

    public void setAlias(@Nullable String alias) {
        this.alias = alias;
    }

    public void setContactsMemberId(@NonNull String contactsMemberId) {
        this.contactsMemberId = contactsMemberId;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }

    public void setFriend(boolean friend) {
        this.isFriend = friend;
    }

    public void setFullName(@Nullable String fullName) {
        this.fullName = fullName;
    }

    public void setIsFavourite(@Nullable String isFavourite) {
        this.isFavourite = isFavourite;
    }

    public void setMemberId(@NonNull String memberId) {
        this.memberId = memberId;
    }

    public void setPhone(@Nullable String phone) {
        this.phone = phone;
    }

    public void setPhotoPath(@Nullable String photoPath) {
        this.photoPath = photoPath;
    }

    public void setRequestSource(@Nullable String requestSource) {
        this.requestSource = requestSource;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }
}
