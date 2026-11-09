package com.transsnet.palmpay.core.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PalmPayContact implements Serializable {
    private String alias;
    private String contactsMemberId;
    private int favouriteType;
    private boolean fromLinkFaves;
    private String fullName;
    private String isFavourite;
    private boolean isFriend;
    private boolean isPalmPayMember;
    private boolean isSelected;
    private String memberId;
    private String phone;
    private String photoPath;
    private String relationship;
    private String relationshipPic;
    private String requestSource;

    public PalmPayContact() {
    }

    public String getAlias() {
        return this.alias;
    }

    public String getContactsMemberId() {
        return this.contactsMemberId;
    }

    public int getFavouriteType() {
        return this.favouriteType;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getIsFavourite() {
        return this.isFavourite;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getPhotoPath() {
        return this.photoPath;
    }

    public String getRelationship() {
        return this.relationship;
    }

    public String getRelationshipPic() {
        return this.relationshipPic;
    }

    public String getRequestSource() {
        return this.requestSource;
    }

    public boolean isFriend() {
        return this.isFriend;
    }

    public boolean isFromLinkFaves() {
        return this.fromLinkFaves;
    }

    public boolean isPalmPayMember() {
        return this.isPalmPayMember;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setContactsMemberId(String contactsMemberId) {
        this.contactsMemberId = contactsMemberId;
    }

    public void setFavouriteType(int favouriteType) {
        this.favouriteType = favouriteType;
    }

    public void setFriend(boolean friend) {
        this.isFriend = friend;
    }

    public void setFromLinkFaves(boolean fromLinkFaves) {
        this.fromLinkFaves = fromLinkFaves;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setIsFavourite(String isFavourite) {
        this.isFavourite = isFavourite;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setPalmPayMember(boolean palmPayMember) {
        this.isPalmPayMember = palmPayMember;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public void setRelationshipPic(String relationshipPic) {
        this.relationshipPic = relationshipPic;
    }

    public void setRequestSource(String requestSource) {
        this.requestSource = requestSource;
    }

    public void setSelected(boolean selected) {
        this.isSelected = selected;
    }

    public PalmPayContact(String phone) {
        this.phone = phone;
    }

    public PalmPayContact(String phone, String fullName) {
        this.phone = phone;
        this.fullName = fullName;
    }

    public PalmPayContact(String fullName, String phone, int isFavourite) {
        this.alias = fullName;
        this.fullName = fullName;
        this.phone = phone;
        this.isFavourite = String.valueOf(isFavourite);
    }

    public PalmPayContact(String id2, String fullName, String phone, int isFavourite) {
        this.contactsMemberId = id2;
        this.alias = fullName;
        this.fullName = fullName;
        this.phone = phone;
        this.isFavourite = String.valueOf(isFavourite);
    }
}
