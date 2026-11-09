package com.transsnet.palmpay.core.db.entity;

import Pa.i0;
import Pa.r0;
import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.mmkv.MMKV;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.util.AesUtilsV2;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class User {
    private static final String KEY_BVN = "bvnCodeV2";
    public static final int SVA_STATUS_INIT = 0;
    public static final int SVA_STATUS_INIT_WITH_REFUND = 1;
    public static final int SVA_STATUS_LOCK = 2;
    public static final int SVA_STATUS_OK = 3;
    private static final String TAG = "User";
    private String accountMobile;
    private String accountNumber;
    private String avatar;
    private String balanceAccountId;
    private String birthday;
    private String birthdayHide;
    private String bvnCode;
    private String countryCode;
    private String countryLocale;
    private long createTime;
    private String displayAccountNumber;
    private String email;
    private int enableLoginPswFlag;
    private String firstName;
    private String fullName;
    private String gender;
    private String invitation;
    private String lastName;
    private int loginPswFlag;
    private String middleName;
    private String mobileMoneyAccountTier;
    private int mobileNameAuthFlag;
    private String nickName;
    private String palmPayTag;
    private String phoneNumber;
    private int premiumState;
    private int updateNameFlag = 0;
    private int isAuthen = 0;
    private int isTeenager = 0;
    private int svaStatus = 0;
    private String memberId = "";
    private MMKV pref = MMKV.p(TAG);

    private void save(String key, String value) {
        MMKV mmkv = this.pref;
        if (mmkv != null) {
            mmkv.putString(key, value);
        }
    }

    public void clear() {
        MMKV mmkv = this.pref;
        if (mmkv != null) {
            mmkv.clearAll();
        }
    }

    public void enableLoginPsw() {
        setEnableLoginPswFlag(true);
    }

    public String getAccountMobile() {
        return this.accountMobile;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAvatar() {
        return TextUtils.isEmpty(this.avatar) ? "" : this.avatar;
    }

    public String getBalanceAccountId() {
        return this.balanceAccountId;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getBirthdayHide() {
        return this.birthdayHide;
    }

    public String getBvnCode() {
        return TextUtils.isEmpty(this.bvnCode) ? this.bvnCode : AesUtilsV2.decrypt(SecurityUtils.b(), this.bvnCode);
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCountryLocale() {
        return this.countryLocale;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getDisplayAccountNumber() {
        return this.displayAccountNumber;
    }

    public String getDisplayGender() {
        if ("1".equals(this.gender)) {
            return "Male";
        }
        return "0".equals(this.gender) ? "Female" : "Unknown";
    }

    public String getDisplayName() {
        if (!TextUtils.isEmpty(this.firstName)) {
            return this.firstName;
        }
        if (TextUtils.isEmpty(this.nickName)) {
            return !TextUtils.isEmpty(getPhoneNumber()) ? i0.D(getPhoneNumber()) : "";
        }
        return this.nickName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getFormatAccountNumber() {
        return (TextUtils.isEmpty(this.displayAccountNumber) || this.displayAccountNumber.equals(this.phoneNumber) || !d.u()) ? r0.Z(this.phoneNumber) : i0.n(this.displayAccountNumber, false);
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getGender() {
        return this.gender;
    }

    public String getInvitation() {
        return this.invitation;
    }

    public int getIsAuthen() {
        return this.isAuthen;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getMobileMoneyAccountTier() {
        return this.mobileMoneyAccountTier;
    }

    public int getMobileNameAuthFlag() {
        return this.mobileNameAuthFlag;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getPalmPayTag() {
        return this.palmPayTag;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getSvaStatus() {
        return this.svaStatus;
    }

    public int getUpdateNameFlag() {
        return this.updateNameFlag;
    }

    public String getUserLevel() {
        BaseApplication baseApplication = BaseApplication.get();
        if (isTier3User()) {
            return baseApplication.getString(k.core_tier3);
        }
        if (isTier2User()) {
            return baseApplication.getString(k.core_tier2);
        }
        if (!"1".equals(this.mobileMoneyAccountTier)) {
            return baseApplication.getString(k.core_unverified);
        }
        int i7 = this.svaStatus;
        return (i7 == 0 || i7 == 1) ? baseApplication.getString(k.core_tier0) : baseApplication.getString(k.core_tier1);
    }

    public boolean hasBalanceAccount() {
        return !TextUtils.isEmpty(this.balanceAccountId);
    }

    public boolean isAuthen() {
        return this.isAuthen == 1;
    }

    public boolean isAuthenticated() {
        return this.isAuthen == 1;
    }

    public boolean isInvitationEnable() {
        return "01".equals(this.invitation);
    }

    public boolean isLoginPswEnabled() {
        return this.enableLoginPswFlag == 1;
    }

    public boolean isLoginPswSet() {
        return this.loginPswFlag == 1;
    }

    public boolean isMobileRealNameAuth() {
        return this.mobileNameAuthFlag == 3;
    }

    public boolean isPalmPayPremium() {
        int i7 = this.premiumState;
        return i7 == 1 || i7 == 2;
    }

    public boolean isTeenager() {
        return this.isTeenager == 1;
    }

    public boolean isTier0User() {
        return "0".equals(this.mobileMoneyAccountTier) || TextUtils.isEmpty(this.mobileMoneyAccountTier);
    }

    public boolean isTier2OrTier3User() {
        return isTier2User() || isTier3User();
    }

    public boolean isTier2User() {
        return "2".equals(this.mobileMoneyAccountTier);
    }

    public boolean isTier3User() {
        return "3".equals(this.mobileMoneyAccountTier);
    }

    public boolean isUpdateNameEnable() {
        return this.updateNameFlag == 1;
    }

    public User load() {
        MMKV mmkv = this.pref;
        if (mmkv != null) {
            this.memberId = mmkv.getString("memberId", "");
            this.firstName = this.pref.getString("firstName", null);
            this.lastName = this.pref.getString("lastName", null);
            this.nickName = this.pref.getString("nickName", null);
            this.fullName = this.pref.getString("fullName", null);
            this.countryLocale = this.pref.getString("countryLocale", null);
            this.countryCode = this.pref.getString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, null);
            this.phoneNumber = this.pref.getString("phoneNumber", null);
            this.accountMobile = this.pref.getString("accountMobile", null);
            this.bvnCode = this.pref.getString(KEY_BVN, null);
            this.balanceAccountId = this.pref.getString("balanceAccountId", null);
            this.avatar = this.pref.getString("avatar", null);
            this.email = this.pref.getString(Scopes.EMAIL, null);
            this.invitation = this.pref.getString("invitation", null);
            this.mobileMoneyAccountTier = this.pref.getString("mobileMoneyAccountTier", null);
            this.updateNameFlag = this.pref.getInt("updateNameFlag", 0);
            this.isAuthen = this.pref.getInt("isAuthen", 0);
            this.birthday = this.pref.getString("birthday", null);
            this.birthdayHide = this.pref.getString("birthdayHide", null);
            this.svaStatus = this.pref.getInt("svaStatus", 0);
            this.gender = this.pref.getString("gender", null);
            this.mobileNameAuthFlag = this.pref.getInt("mobileNameAuthFlag", 0);
            this.palmPayTag = this.pref.getString("palmPayTag", null);
            this.createTime = this.pref.getLong("createTime", 0L);
            this.accountNumber = this.pref.getString("accountNumber", null);
            this.displayAccountNumber = this.pref.getString("displayAccountNumber", null);
            this.loginPswFlag = this.pref.getInt("loginPswFlag", 0);
            this.enableLoginPswFlag = this.pref.getInt("enableLoginPswFlag", 0);
            this.premiumState = this.pref.getInt("premiumState", -1);
            this.isTeenager = this.pref.getInt("isTeenager", 0);
        }
        return this;
    }

    public void setAccountMobile(String mobile) {
        this.accountMobile = mobile;
        save("accountMobile", mobile);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        save("accountNumber", accountNumber);
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
        save("avatar", avatar);
    }

    public void setBalanceAccountId(String balanceAccountId) {
        this.balanceAccountId = balanceAccountId;
        save("balanceAccountId", balanceAccountId);
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
        save("birthday", birthday);
    }

    public void setBirthdayHide(String birthdayHide) {
        this.birthdayHide = birthdayHide;
        save("birthdayHide", birthdayHide);
    }

    public void setBvnCode(String bvnCode) {
        if (TextUtils.isEmpty(bvnCode)) {
            this.bvnCode = bvnCode;
        } else {
            this.bvnCode = AesUtilsV2.encrypt(SecurityUtils.b(), bvnCode);
        }
        save(KEY_BVN, this.bvnCode);
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        save(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, countryCode);
    }

    public void setCountryLocale(String countryLocale) {
        this.countryLocale = countryLocale;
        save("countryLocale", countryLocale);
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
        save("createTime", createTime);
    }

    public void setDisplayAccountNumber(String accountNumber) {
        this.displayAccountNumber = accountNumber;
        save("displayAccountNumber", accountNumber);
    }

    public void setEmail(String email) {
        this.email = email;
        save(Scopes.EMAIL, email);
    }

    public void setEnableLoginPswFlag(boolean z3) {
        this.enableLoginPswFlag = z3 ? 1 : 0;
        save("enableLoginPswFlag", z3 ? 1 : 0);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        save("firstName", firstName);
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
        save("fullName", fullName);
    }

    public void setGender(String gender) {
        this.gender = gender;
        save("gender", gender);
    }

    public void setInvitation(String invitation) {
        this.invitation = invitation;
        save("invitation", invitation);
    }

    public void setIsAuthen(int isAuthen) {
        this.isAuthen = isAuthen;
        save("isAuthen", isAuthen);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        save("lastName", lastName);
    }

    public void setLoginPswFlag(boolean z3) {
        this.loginPswFlag = z3 ? 1 : 0;
        save("loginPswFlag", z3 ? 1 : 0);
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
        save("memberId", memberId);
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
        save("middleName", middleName);
    }

    public void setMobileMoneyAccountTier(String mobileMoneyAccountTier) {
        this.mobileMoneyAccountTier = mobileMoneyAccountTier;
        save("mobileMoneyAccountTier", mobileMoneyAccountTier);
    }

    public void setMobileNameAuthFlag(int mobileNameAuthFlag) {
        this.mobileNameAuthFlag = mobileNameAuthFlag;
        save("mobileNameAuthFlag", mobileNameAuthFlag);
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
        save("nickName", nickName);
    }

    public void setPalmPayTag(String palmPayTag) {
        this.palmPayTag = palmPayTag;
        save("palmPayTag", palmPayTag);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        save("phoneNumber", phoneNumber);
    }

    public void setPremiumState(int premiumState) {
        this.premiumState = premiumState;
        save("premiumState", premiumState);
    }

    public void setSvaStatus(int svaStatus) {
        this.svaStatus = svaStatus;
        save("svaStatus", svaStatus);
    }

    public void setTeenager(boolean z3) {
        this.isTeenager = z3 ? 1 : 0;
        save("isTeenager", z3 ? 1 : 0);
    }

    public void setUpdateNameFlag(int updateNameFlag) {
        this.updateNameFlag = updateNameFlag;
        save("updateNameFlag", updateNameFlag);
    }

    public boolean shouldApplyForBalance() {
        return getSvaStatus() == 0 || getSvaStatus() == 1;
    }

    private void save(String key, int value) {
        MMKV mmkv = this.pref;
        if (mmkv != null) {
            mmkv.putInt(key, value);
        }
    }

    private void save(String key, long value) {
        MMKV mmkv = this.pref;
        if (mmkv != null) {
            mmkv.putLong(key, value);
        }
    }
}
